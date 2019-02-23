/*package com.bazar.util;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.Part;

public class ImageUtil {

	public static final String IMAGE_UPLOAD_PATH = "C:/Users/Kshitij Kafle/eclipse-workspace/4th_sem_project/WebContent/images/";

	public static String writeImageFile(String imageUrl, Part part) {

		InputStream in = null;
		OutputStream out = null;
		try {
			in = part.getInputStream();
			out = new FileOutputStream(imageUrl);
			byte[] bytes = new byte[1024];
			int len;
			while ((len = in.read(bytes)) != -1) {
				out.write(bytes, 0, len);

			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return imageUrl;

	}
	public static String getFileName(Part part) {
		for(String content:part.getHeader("content-disposition").split(";")) {
			if(content.trim().startsWith("filename")) {
				return content.substring(content.indexOf("=")+1).trim().replace("\"", "");
			}
		}
		return null;
	}
	

}
*/