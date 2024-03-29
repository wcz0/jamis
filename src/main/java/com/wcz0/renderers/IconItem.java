package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class IconItem extends BaseRenderer {

	public IconItem() {
		this.set("type", "iconItem");
	}

	public IconItem set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	    */
	public IconItem position(Object value) {
		return (IconItem) this.set("position", value);
	}
	
	/**
	    */
	public IconItem icon(Object value) {
		return (IconItem) this.set("icon", value);
	}
	}