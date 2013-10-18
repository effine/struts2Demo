/**
 * @author VerpHen
 * @date 2013-10-11  ����02:12:39
 */

package org.verphen.action;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport {

	private static final int BUFFER_SIZE = 16 * 1024;

	/* 页面定义的属性 */
	private File myFile;
	private String caption;

	/* 页面衍生的属性 */
	private String fileName;
	private String contentType;

	/* 自定义属性 */
	private String serverFileName;

	public File getMyFile() {
		return myFile;
	}

	public void setMyFile(File myFile) {
		this.myFile = myFile;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	/* 赋值衍生属性 */
	public void setMyFileFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setMyFileContentType(String contentType) {
		this.contentType = contentType;
	}

	/* 自定义属性 */
	public String getServerFileName() {
		return serverFileName;
	}

	private static void copy(File src, File dst) {
		try {
			InputStream in = null;
			OutputStream out = null;
			try {
				in = new BufferedInputStream(new FileInputStream(src),
						BUFFER_SIZE);
				out = new BufferedOutputStream(new FileOutputStream(dst),
						BUFFER_SIZE);
				byte[] buffer = new byte[BUFFER_SIZE];
				while (in.read(buffer) > 0) {
					out.write(buffer);
				}
			} finally {
				if (null != in) {
					in.close();
				}
				if (null != out) {
					out.close();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/* selected file suffix */
	private static String getSuffix(String fileName) {
		int pos = fileName.lastIndexOf(".");
		return fileName.substring(pos);
	}

	@Override
	public String execute() {
		serverFileName = new Date().getTime() + getSuffix(fileName);
		File tempFile = new File(ServletActionContext.getServletContext()
				.getRealPath("/UploadImages")
				+ "/" + serverFileName);
		copy(myFile, tempFile);
		return SUCCESS;
	}
}
