package cmn.util;

import java.math.BigDecimal;

public class CHECK_UTIL {
	// 베이직 유틸용
	
	/** Object의 경우 상속자를 확인 후 넘김 */
	public static boolean isEmpty(Object obj){
		if (obj instanceof String){
			return isEmpty((String)obj);
		}else if (obj instanceof BigDecimal){
			return isEmpty((BigDecimal)obj);
		}else if (obj instanceof Integer){
			return isEmpty((Integer)obj);
		}else{
			return false;
		}
	}
	
	/** String 형이 비었는지 체크 */
	public static boolean isEmpty(String val){
		// val이 null이면 비어있다고 봄.
		if (null == val){
			return true;
		}
		
		// val이 null이 아니고 문자를 trim했을 때 문자수가 0 라면 비어있다고 봄.
		if (0 == val.trim().length()){
			return true;
		}else{
			return false;
		}
	}
	
	/** BigDecimal형이 비었는지 체크 */
	public  static boolean isEmpty(BigDecimal val){
		if (null == val){
			return true;
		}
		
		try{
			// 문자열로 캐스팅
			String tmp = val.toString();
			if (isEmpty(tmp)){
				return true;
			}else{
				return false;
			}
		}catch(Exception e){
			// BigDecimal에 들어가지 않는다면 예외가 발생
			return false;
		}
	}
	
	/** Integer형이 비었는지 체크 */
	public  static boolean isEmpty(Integer val){
		if (null == val){
			return true;
		}
		
		try{
			// 문자열로 캐스팅
			String tmp = val.toString();
			if (isEmpty(tmp)){
				return true;
			}else{
				return false;
			}
		}catch(Exception e){
			// BigDecimal에 들어가지 않는다면 예외가 발생
			return false;
		}
	}
	
	public  static boolean isEqual(String val1,String val2){
		if (null ==val1 || null == val2){
			return false;
		}
		
		if (val1.equals(val2)){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean isTrimEqual(String val1,String val2){
		if (null ==val1 || null == val2){
			return false;
		}
		
		if (val1.trim().equals(val2.trim())){
			return true;
		}else{
			return false;
		}
	}
}
