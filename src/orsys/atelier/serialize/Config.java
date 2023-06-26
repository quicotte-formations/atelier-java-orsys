package orsys.atelier.serialize;

import java.io.Serializable;

public class Config implements Serializable {
	private static final long serialVersionUID = 1L;

	private String urlJdbc;
	private String config;
	private String user;
	private String pwd;

	public Config(String urlJdbc, String config, String user, String pwd) {
		this.config = config;
		this.urlJdbc = urlJdbc;
		this.pwd = pwd;
		this.user = user;
	}

	public String toString() {
		return "Config [urlJdbc=" + urlJdbc + ", config=" + config + ", user=" + user + "]";
	}
}
