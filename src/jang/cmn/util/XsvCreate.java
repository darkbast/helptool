package jang.cmn.util;

import static cmn.util.CHECK_UTIL.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class XsvCreate {

	private String encode = null;
	private boolean isBom = false;
	private String path = null;
	private String fileName = null;
	private String errMsg = null;
	private OutputStream out = null;
	private boolean isComma = false;
	List<String> list = new ArrayList<String>();
	private StringBuilder sb = null;
	
	public XsvCreate(){
		this("UTF-8", "a", "a", false, true);
	}

	public XsvCreate(String encode, String path, String fileName, boolean isBom, boolean isComma){
		setEncode(encode);
		this.path = path;
		this.fileName = fileName;
		this.isBom = isBom;
		this.isComma = isComma;
		this.sb = new StringBuilder();
		prepareInOut();
	}

	/** 인코딩 설정 */
	public void setEncode(String encode){
		if (null == encode){
			this.encode = "UTF-8";
		}else{
			this.encode = encode;
		}
	}
	
	/** 쓰기 준비 */
	public String prepareInOut(){
		
		try{
			if (!isEmpty(getErrMsg())){
				return this.errMsg;
			}
			
			out = new FileOutputStream(new File(path + fileName));
			
			if (isBom){
				byte[] bom = new byte[]{(byte)0xEF,(byte)0xBB,(byte)0xBF};				
				out.write(bom);
			}
			
		}catch(IOException ie){
			try{
				if (null != out){
					// 준비에 실패했을 경우 닫기 처리
					out.flush();
					out.close();
				}
			}catch(Exception e){
				this.errMsg = "준비 단계에서 에러 발생 : " + e.getCause();
				return this.errMsg;
			}
		}
		return null;
	}
	
	private void addSplit(){
		String[] arr = sb.toString().split("\r\n");
		if (0 == arr.length){
			return;
		}
		
		String temp = arr[arr.length-1];
		if (isEmpty(temp)){
			return;
		}
		
		
		if(isComma){
			sb.append(",");
		}else{
			sb.append("\t");			
		}
	}
	
	private void addValue(Object val){
		if (isEmpty(val)){
			sb.append("");
		}else{
			sb.append(val);			
		}
	}
	
	/** String형 */
	public void write(String val){
		addSplit();
		addValue(val);
	}
	
	/** BigDecimal형 */
	public void write(BigDecimal val){
		addSplit();
		addValue(val);
	}
	
	/** Integer 형 */
	public void write(Integer val){
		addSplit();
		addValue(val);
	}
	
	public void lineClose(){
		sb.append("\r\n");
		list.add(sb.toString());
		sb = new StringBuilder();
	}
	
	/** 마지막 처리하기 */
	public void close(){
		try{
			String text = "";;
			for (String temp : list){
				text += temp;
			}
			
			if (isEmpty(text)){
				return;
			}
			
			out.write(text.getBytes(encode));
			
			if (null != out){
				out.flush();
				out.close();
			}
		}catch(Exception e){
			this.errMsg = "파일 쓰기 또는 닫는 중 에러 발생 : " + e.getCause();
		}
	}

	/** 
	 * 에러체크
	 */
	public String getErrMsg(){
		StringBuilder sb = new StringBuilder();
		if (isEmpty(path)){
			sb.append("경로가 지정되지 않음\n");
		}
		if (isEmpty(fileName)){
			sb.append("파일명이 지정되지 않음\n");
		}
		
		return sb.toString();
	}	
}
