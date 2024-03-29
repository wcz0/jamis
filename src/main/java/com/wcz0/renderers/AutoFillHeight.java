package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class AutoFillHeight extends BaseRenderer {

	public AutoFillHeight() {
		this.set("type", "autoFillHeight");
	}

	public AutoFillHeight set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	    */
	public AutoFillHeight height(Object value) {
		return (AutoFillHeight) this.set("height", value);
	}
	
	/**
	    */
	public AutoFillHeight maxHeight(Object value) {
		return (AutoFillHeight) this.set("maxHeight", value);
	}
	}