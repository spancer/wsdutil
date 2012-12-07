package org.gonetbar.ssa.access;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.gonetbar.ssa.cas.exception.AccessFailException;
import org.gonetbar.ssa.util.CommUtils;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.WebAttributes;
import org.springframework.security.web.access.AccessDeniedHandler;

/**
 * 用于处理自定义异常
 * 
 * @author Administrator
 * 
 */
public class AclAccessDeniedHandlerImpl implements AccessDeniedHandler {
	protected static final Log logger = LogFactory.getLog(AclAccessDeniedHandlerImpl.class);

	private String errorPage;

	public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException, ServletException {
		if (!response.isCommitted()) {
			if (accessDeniedException instanceof AccessFailException) {
				//AccessFailException afe = (AccessFailException) accessDeniedException;
				//String url = afe.getRedirectUrl();
				//TODO 
				String url = request.getContextPath() + "/showerror/index.html";
				if (!CommUtils.isEmptyOrNullByTrim(url)) {
					response.sendRedirect(url);
					return;
				}
			}
			if (errorPage != null) {
				// Put exception into request scope (perhaps of use to a view)
				request.setAttribute(WebAttributes.ACCESS_DENIED_403, accessDeniedException);

				// Set the 403 status code.
				response.setStatus(HttpServletResponse.SC_FORBIDDEN);

				// forward to error page.
				RequestDispatcher dispatcher = request.getRequestDispatcher(errorPage);
				dispatcher.forward(request, response);
			} else {
				response.sendError(HttpServletResponse.SC_FORBIDDEN, accessDeniedException.getMessage());
			}
		}
	}

	public void setErrorPage(String errorPage) {
		if ((errorPage != null) && !errorPage.startsWith("/")) {
			throw new IllegalArgumentException("errorPage must begin with '/'");
		}

		this.errorPage = errorPage;
	}
}