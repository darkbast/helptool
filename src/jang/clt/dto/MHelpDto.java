package jang.clt.dto;

public class MHelpDto extends CommonDbDto {
	/** 태그 */
	private String tag = null;
	/** 분류1 */
	private String div1 = null;
	/** 분류2 */
	private String div2 = null;
	/** 분류3 */
	private String div3 = null;
	
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getDiv1() {
		return div1;
	}
	public void setDiv1(String div1) {
		this.div1 = div1;
	}
	public String getDiv2() {
		return div2;
	}
	public void setDiv2(String div2) {
		this.div2 = div2;
	}
	public String getDiv3() {
		return div3;
	}
	public void setDiv3(String div3) {
		this.div3 = div3;
	}	
	
}
