package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class NavOverflow extends BaseRenderer {

	public NavOverflow() {
		this.set("type", "navOverflow");
	}

	public NavOverflow set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * Popover浮层CSS类名
    */
	public NavOverflow overflowPopoverClassName(Object value) {
		return (NavOverflow) this.set("overflowPopoverClassName", value);
	}
	
	/**
	 * 导航项目宽度
    */
	public NavOverflow itemWidth(Object value) {
		return (NavOverflow) this.set("itemWidth", value);
	}
	
	/**
	 * 导航列表后缀节点
    */
	public NavOverflow overflowSuffix(Object value) {
		return (NavOverflow) this.set("overflowSuffix", value);
	}
	
	/**
	 * 自定义样式
    */
	public NavOverflow style(Object value) {
		return (NavOverflow) this.set("style", value);
	}
	
	/**
	 * 是否开启响应式收纳
    */
	public NavOverflow enable(Object value) {
		return (NavOverflow) this.set("enable", value);
	}
	
	/**
	 * 菜单触发按钮的文字
    */
	public NavOverflow overflowLabel(Object value) {
		return (NavOverflow) this.set("overflowLabel", value);
	}
	
	/**
	 * 菜单触发按钮的图标
    */
	public NavOverflow overflowIndicator(Object value) {
		return (NavOverflow) this.set("overflowIndicator", value);
	}
	
	/**
	 * 菜单触发按钮CSS类名
    */
	public NavOverflow overflowClassName(Object value) {
		return (NavOverflow) this.set("overflowClassName", value);
	}
	
	/**
	 * 菜单外层CSS类名
    */
	public NavOverflow overflowListClassName(Object value) {
		return (NavOverflow) this.set("overflowListClassName", value);
	}
	
	/**
	 * 导航横向布局时，开启开启响应式收纳后最大可显示数量，超出此数量的导航将被收纳到下拉菜单中
    */
	public NavOverflow maxVisibleCount(Object value) {
		return (NavOverflow) this.set("maxVisibleCount", value);
	}
	
	/**
	 * 包裹导航的外层标签名，可以使用其他标签渲染
    */
	public NavOverflow wrapperComponent(Object value) {
		return (NavOverflow) this.set("wrapperComponent", value);
	}
	}