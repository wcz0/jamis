package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class ImageToolbarAction extends BaseRenderer {

	public ImageToolbarAction() {
		this.set("type", "imageToolbarAction");
	}

	/**
	    */
	public ImageToolbarAction label(Object value) {
		return (ImageToolbarAction) this.set("label", value);
	}
	
	/**
	    */
	public ImageToolbarAction icon(Object value) {
		return (ImageToolbarAction) this.set("icon", value);
	}
	
	/**
	    */
	public ImageToolbarAction iconClassName(Object value) {
		return (ImageToolbarAction) this.set("iconClassName", value);
	}
	
	/**
	    */
	public ImageToolbarAction disabled(Object value) {
		return (ImageToolbarAction) this.set("disabled", value);
	}
	
	/**
	    * 可选值: ROTATE_RIGHT | ROTATE_LEFT | ZOOM_IN | ZOOM_OUT | SCALE_ORIGIN
    */
	public ImageToolbarAction key(Object value) {
		return (ImageToolbarAction) this.set("key", value);
	}
	}