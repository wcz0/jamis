package com.wcz0.renderers;
/**
 * 不指定类型默认就是文本

 * @author wcz0
 * @version 6.2.2
 */
public class ListBodyField extends BaseRenderer {

	public ListBodyField() {
		this.set("type", "listBodyField");
	}

	public ListBodyField set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 内层组件的CSS类名
    */
	public ListBodyField innerClassName(Object value) {
		return (ListBodyField) this.set("innerClassName", value);
	}
	
	/**
	 * 绑定字段名
    */
	public ListBodyField name(Object value) {
		return (ListBodyField) this.set("name", value);
	}
	
	/**
	 * 配置查看详情功能
    */
	public ListBodyField popOver(Object value) {
		return (ListBodyField) this.set("popOver", value);
	}
	
	/**
	 * 配置快速编辑功能
    */
	public ListBodyField quickEdit(Object value) {
		return (ListBodyField) this.set("quickEdit", value);
	}
	
	/**
	 * 配置点击复制功能
    */
	public ListBodyField copyable(Object value) {
		return (ListBodyField) this.set("copyable", value);
	}
	
	/**
	 * 列标题
    */
	public ListBodyField label(Object value) {
		return (ListBodyField) this.set("label", value);
	}
	
	/**
	 * label 类名
    */
	public ListBodyField labelClassName(Object value) {
		return (ListBodyField) this.set("labelClassName", value);
	}
	}