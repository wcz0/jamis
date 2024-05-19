package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class QRCodeImageSettings extends BaseRenderer {

	public QRCodeImageSettings() {
		this.set("type", "qRCodeImageSettings");
	}

	/**
	    */
	public QRCodeImageSettings height(Object value) {
		return (QRCodeImageSettings) this.set("height", value);
	}
	
	/**
	    */
	public QRCodeImageSettings width(Object value) {
		return (QRCodeImageSettings) this.set("width", value);
	}
	
	/**
	    */
	public QRCodeImageSettings excavate(Object value) {
		return (QRCodeImageSettings) this.set("excavate", value);
	}
	
	/**
	    */
	public QRCodeImageSettings x(Object value) {
		return (QRCodeImageSettings) this.set("x", value);
	}
	
	/**
	    */
	public QRCodeImageSettings y(Object value) {
		return (QRCodeImageSettings) this.set("y", value);
	}
	
	/**
	    */
	public QRCodeImageSettings src(Object value) {
		return (QRCodeImageSettings) this.set("src", value);
	}
	}