package me.mert1602.minetoon.api;

public enum ServerVersion {

	CB_1_7("1.7"),
	CB_1_8("1.8"),
	CB_1_9("1.9");

	private String versionPrefix;

	private ServerVersion(String versionPrefix) {
		this.versionPrefix = versionPrefix;
	}

	public String getVersionPrefix() {
		return this.versionPrefix;
	}

}
