/**
 * @author VerpHen
 * @date 2013-10-11  下午05:10:14
 */

package org.verphen.action;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class MultipleFileUploadAction extends ActionSupport {

	/* 使用<s:file/>与Action绑定列表list */
	private List<File> uploads = new ArrayList<File>();
	private List<String> uploadFileNames = new ArrayList<String>();
	private List<String> uploadContentTypes = new ArrayList<String>();

	/* 使用<s:file/>与Action绑定数组 */
	/*
	 * private File[] uploads; private String[] uploadFileNames; private
	 * String[] uploadContentTypes;
	 * 
	 * public File[] getUpload() { return this .uploads; } public void
	 * setUpload(File[] upload) { this .uploads = upload; }
	 * 
	 * public String[] getUploadFileName() { return this .uploadFileNames; }
	 * public void setUploadFileName(String[] uploadFileName) { this
	 * .uploadFileNames = uploadFileName; }
	 * 
	 * public String[] getUploadContentType() { return this .uploadContentTypes;
	 * } public void setUploadContentType(String[] uploadContentType) { this
	 * .uploadContentTypes = uploadContentType; }
	 */

	public List<File> getUpload() {
		return this.uploads;
	}

	public void setUpload(List<File> uploads) {
		this.uploads = uploads;
	}

	public List<String> getUploadFileName() {
		return this.uploadFileNames;
	}

	public void setUploadFileName(List<String> uploadFileNames) {
		this.uploadFileNames = uploadFileNames;
	}

	public List<String> getUploadContentType() {
		return this.uploadContentTypes;
	}

	public void setUploadContentType(List<String> contentTypes) {
		this.uploadContentTypes = contentTypes;
	}

	/* selected all upload file suffix ,return list */
	private List<String> getSuffix(List<String> fileNames) {

		List<String> suffixList = new ArrayList<String>();
		for (int i = 0; i < fileNames.size(); i++) {
			String suffix = fileNames.get(i).substring(
					fileNames.get(i).lastIndexOf("."));
			suffixList.add(suffix);
		}
		return suffixList;
	}

	// private static void copy()

	public String execute() {

		return null;
	}

}
