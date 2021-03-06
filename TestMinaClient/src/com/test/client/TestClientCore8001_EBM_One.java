package com.test.client;

import java.net.InetSocketAddress;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;

import org.apache.mina.core.filterchain.DefaultIoFilterChainBuilder;
import org.apache.mina.core.future.ConnectFuture;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;
import org.apache.mina.filter.executor.ExecutorFilter;
import org.apache.mina.transport.socket.nio.NioSocketConnector;

/**
 * @desc:
 * 
 * 
 * @author weisd E-mail:weisd@junbao.net
 * @createtime:2011-5-29 ����03:07:20
 * @version:v1.0
 * 
 */
public class TestClientCore8001_EBM_One {

	/**
	 * @param args
	 */
	public static void main(String[] args) {



		NioSocketConnector connector = new NioSocketConnector();
		DefaultIoFilterChainBuilder chain = connector.getFilterChain();
		TextLineCodecFactory textLineCodecFactory = new TextLineCodecFactory(Charset.forName("GBK"));
		textLineCodecFactory.setDecoderMaxLineLength(4000);
		chain.addLast("myChin", new ProtocolCodecFilter(textLineCodecFactory));
		// 读写通道10秒内无操作进入空闲状态
		chain.addLast("threadPool", new ExecutorFilter(Executors.newCachedThreadPool()));
		connector.setHandler(new MinaDBCoreGWHandler8001());
		connector.setConnectTimeoutMillis(15000);

		for (int i = 0; i < 1; i++) {
			
			String ordertime = getFormatDate(new Date(), "yyyyMMddHHmmss");
			int c = (int) (Math.random() * 100 + 10);
			if(c > 99){
				c = c - 10;
			}
			
//			// 移动
			String mobilenum = "182672412" + c;// 电话号码
//			String mobilenum = "0571123456" + c;// 电话号码
			String onlineid = "107785";
//			String onlineid = "107785";
			String agentid = "WEISD_GUHUA";
			String orderid = ordertime + i;
			String chargeamount = "300";
			String payamount = "297";
			
			// 移动
////			String mobilenum = "0571123456" + c;// 电话号码
//			String mobilenum = "182672412" + c;// 电话号码
//			String onlineid = "110364";
////			String onlineid = "107785";
//			String agentid = "WEISD_GUHUA";
//			String orderid = ordertime + i;
//			String chargeamount = "30";
//			String payamount = "28.5";
			
			
			
			String ordersource = "2";


			String req = "comm=8001&version=1.0&onlineid=" + onlineid + "&agentid=" + agentid + "&ordersource=" + ordersource + "&orderid=" + orderid + "&mobilenum=" + mobilenum + "&chargeamount=" + chargeamount
					+ "&payamount=" + payamount + "&ordertime=" + ordertime + "&mark=test";
			
			ConnectFuture cf = null;
			
			cf = connector.connect(new InetSocketAddress("172.25.61.151", 9001));
			
			cf.awaitUninterruptibly();
			IoSession session = cf.getSession();
			session.write(req);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public static String getFormatDate(java.util.Date date, String format) {
		SimpleDateFormat f = new SimpleDateFormat(format);
		return f.format(date);
	}
}
