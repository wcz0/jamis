package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class RowSelectionOptions extends BaseRenderer {

	public RowSelectionOptions() {
		this.set("type", "rowSelectionOptions");
	}

	public RowSelectionOptions set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 选择类型 选择全部
    */
	public RowSelectionOptions key(Object value) {
		return (RowSelectionOptions) this.set("key", value);
	}
	
	/**
	 * 选项显示文本
    */
	public RowSelectionOptions text(Object value) {
		return (RowSelectionOptions) this.set("text", value);
	}
	}