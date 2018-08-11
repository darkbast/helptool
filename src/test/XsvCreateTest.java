package test;

import jang.cmn.util.XsvCreate;

public class XsvCreateTest {

	public static void main(String[] args) {
		String encode = "UTF-8";
		String path = "E:/workspace_svn/";
		String fileName = "test.txt";
		XsvCreate test = new XsvCreate(encode, path, fileName, false, true);
		test.write("TEST");
		test.write("TEST1");
		test.lineClose();
		test.write("b");
		test.lineClose();
		test.close();
	}

}
