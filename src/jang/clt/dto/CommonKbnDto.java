package jang.clt.dto;

public class CommonKbnDto {
	/** 메뉴코드 */
	private Integer menuCd = null;
	/** 메뉴 ID */
	private String menuId = null;
	/** 메뉴명 */
	private String menuName = null;
	/** 화면 메뉴명 */
	private String menuDisplayName = null;
	
	public Integer getMenuCd() {
		return menuCd;
	}
	public void setMenuCd(Integer menuCd) {
		this.menuCd = menuCd;
	}
	public String getMenuId() {
		return menuId;
	}
	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getMenuDisplayName() {
		return menuDisplayName;
	}
	public void setMenuDisplayName(String menuDisplayName) {
		this.menuDisplayName = menuDisplayName;
	}
}
