package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class IconItem extends BaseRenderer {

	public IconItem() {
		this.set("type", "iconItem");
	}

	/**
	    */
	public IconItem icon(Object value) {
		return (IconItem) this.set("icon", value);
	}
	
	/**
	    */
	public IconItem position(Object value) {
		return (IconItem) this.set("position", value);
	}
	}