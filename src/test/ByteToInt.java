package test;

import java.nio.ByteBuffer;

public class ByteToInt {

	public static void main(String[] args) {
		String a = "아";
		System.out.println((int)a.charAt(0));
		int i = (int)a.charAt(0);
		byte b1 = (byte)a.charAt(0);
		byte[] b2 = new byte[]{(byte)0xEF};
		
		System.out.println(b1);
		System.out.println((byte)i);
		//System.out.println((byte)0xEA);
		//System.out.println(256-22);
		//int num = ByteBuffer.wrap(b2).getInt();
	}

}
