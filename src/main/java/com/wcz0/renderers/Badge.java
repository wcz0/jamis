package com.wcz0.renderers;
/**
 * Badge 角标。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/badge

 * @author wcz0
 * @version 6.2.2
 */
public class Badge extends BaseRenderer {

	public Badge() {
		this.set("type", "badge");
	}

	public Badge set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 角标类型
    * 可选值: text | dot | ribbon
    */
	public Badge mode(Object value) {
		return (Badge) this.set("mode", value);
	}
	
	/**
	 * 角标位置
    * 可选值: top-right | top-left | bottom-right | bottom-left
    */
	public Badge position(Object value) {
		return (Badge) this.set("position", value);
	}
	
	/**
	 * 动态控制是否显示
    */
	public Badge visibleOn(Object value) {
		return (Badge) this.set("visibleOn", value);
	}
	
	/**
	    */
	public Badge className(Object value) {
		return (Badge) this.set("className", value);
	}
	
	/**
	 * 文本内容
    */
	public Badge text(Object value) {
		return (Badge) this.set("text", value);
	}
	
	/**
	 * 封顶的数字值
    */
	public Badge overflowCount(Object value) {
		return (Badge) this.set("overflowCount", value);
	}
	
	/**
	 * 是否显示动画
    */
	public Badge animation(Object value) {
		return (Badge) this.set("animation", value);
	}
	
	/**
	 * 角标的自定义样式
    */
	public Badge style(Object value) {
		return (Badge) this.set("style", value);
	}
	
	/**
	 * 提示类型
    */
	public Badge level(Object value) {
		return (Badge) this.set("level", value);
	}
	
	/**
	 * 大小
    */
	public Badge size(Object value) {
		return (Badge) this.set("size", value);
	}
	
	/**
	 * 角标位置，相对于position的位置进行偏移
    */
	public Badge offset(Object value) {
		return (Badge) this.set("offset", value);
	}
	}