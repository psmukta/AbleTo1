package StepPack;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyValues {
	String user;
	String password;
	String browser;

	public PropertyValues() throws IOException {
		super();
		FileReader fr=new FileReader("src//test//java//properties//ableto.properties");
		Properties prop=new Properties();
		prop.load(fr);

		this.user = prop.getProperty("user");
		this.password = prop.getProperty("password");
		this.browser = prop.getProperty("browser");
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBrowser() {
		return browser;
	}

	public void setBrowser(String browser) {
		this.browser = browser;
	}
	
	
}
