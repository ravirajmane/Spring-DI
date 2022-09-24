package beans;

import java.util.Arrays;

public class Test {
private int portNumber;
private float price;
private boolean isAvailable;
private String url;
private String dbproperties[];

public Test() {
System.out.println("Test()");
}

public void setPortNumber(int portNumber) {
	System.out.println("setPortNumber");
	this.portNumber = portNumber;
}
public void setPrice(float price) {
	System.out.println("setPrice");
	this.price = price;
}
public void setIsAvailable(boolean isAvailable) {
	System.out.println("setAvailable");
	this.isAvailable = isAvailable;
}
public void setUrl(String url) {
	System.out.println("setUrl");
	this.url = url;
}
public void setDbproperties(String[] dbproperties) {
	System.out.println("setDbproperties");
	this.dbproperties = dbproperties;
}
@Override
public String toString() {
	return "Test [portNumber=" + portNumber + ", price=" + price + ", isAvailable=" + isAvailable + ", url=" + url
			+ ", dbproperties=" + Arrays.toString(dbproperties) + "]";
}





}
