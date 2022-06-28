package test;

public class Test11 {

	public static void main(String[] args) {
		
		String uri = "8088:SDf113/123123/asdf1.do?bbbbb=123";
		int lastSlash = uri.lastIndexOf("/");
		int lastquestion = uri.lastIndexOf("?");
		String commandStr = uri.substring(lastSlash, lastquestion);
		System.out.println(commandStr);
	}

}
