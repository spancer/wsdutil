package org.app.ticket.autoimg;

import java.io.File;
import java.io.IOException;

public class TestOCR {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		String path = "D:\\Workspace\\auto-scheduleticket\\image\\passCode.jpg";
		try {
			String valCode = new OCR().recognizeText(null,new File(path), "jpg");
			System.out.println(valCode);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}