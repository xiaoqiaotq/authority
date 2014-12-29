package org.xiaoqiaotq.domain.test;

/**
 * @author xiaoqiaotq@gmail.com	
 * @date   2014年12月26日
 */
public class UploadResponse<T> {
	private int code;
	private String message="success";
	private T data;
	public UploadResponse() {
	}
	public int getCode() {
		return code;
	}
	public UploadResponse(int code, String message) {
		super();
		this.code = code;
		this.message = message;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
}
