package com.sx.http;

public class ResultMsg {
	private boolean success;
	private String errorMsg;
	
	public ResultMsg() {
		super();
	}

	public ResultMsg(boolean success, String errorMsg) {
		super();
		this.success = success;
		this.errorMsg = errorMsg;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	@Override
	public String toString() {
		return "ResultMsg [success=" + success + ", errorMsg=" + errorMsg + "]";
	}
	
}
