package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class AutoGenerateFilter extends BaseRenderer {

	public AutoGenerateFilter() {
		this.set("type", "autoGenerateFilter");
	}

	public AutoGenerateFilter set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 过滤条件单行列数
    */
	public AutoGenerateFilter columnsNum(Object value) {
		return (AutoGenerateFilter) this.set("columnsNum", value);
	}
	
	/**
	 * 是否显示设置查询字段
    */
	public AutoGenerateFilter showBtnToolbar(Object value) {
		return (AutoGenerateFilter) this.set("showBtnToolbar", value);
	}
	
	/**
	 * 是否默认收起
    */
	public AutoGenerateFilter defaultCollapsed(Object value) {
		return (AutoGenerateFilter) this.set("defaultCollapsed", value);
	}
	}