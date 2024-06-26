package com.wcz0.renderers;
/**
 * 消息文案配置，记住这个优先级是最低的，如果你的接口返回了 msg，接口返回的优先。

 * @author wcz0
 * @version 6.2.2
 */
public class SchemaMessage extends BaseRenderer {

	public SchemaMessage() {
		this.set("type", "schemaMessage");
	}

	/**
	 * 获取成功的提示，默认为空。
    */
	public SchemaMessage fetchSuccess(Object value) {
		return (SchemaMessage) this.set("fetchSuccess", value);
	}
	
	/**
	 * 保存失败时的提示。
    */
	public SchemaMessage saveFailed(Object value) {
		return (SchemaMessage) this.set("saveFailed", value);
	}
	
	/**
	 * 保存成功时的提示。
    */
	public SchemaMessage saveSuccess(Object value) {
		return (SchemaMessage) this.set("saveSuccess", value);
	}
	
	/**
	 * 获取失败时的提示
    */
	public SchemaMessage fetchFailed(Object value) {
		return (SchemaMessage) this.set("fetchFailed", value);
	}
	}