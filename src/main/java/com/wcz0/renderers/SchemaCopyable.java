package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class SchemaCopyable extends BaseRenderer {

	public SchemaCopyable() {
		this.set("type", "schemaCopyable");
	}

	public SchemaCopyable set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 可以配置图标
    */
	public SchemaCopyable icon(Object value) {
		return (SchemaCopyable) this.set("icon", value);
	}
	
	/**
	 * 配置复制时的内容模板。
    */
	public SchemaCopyable content(Object value) {
		return (SchemaCopyable) this.set("content", value);
	}
	
	/**
	 * 提示文字内容
    */
	public SchemaCopyable tooltip(Object value) {
		return (SchemaCopyable) this.set("tooltip", value);
	}
	}