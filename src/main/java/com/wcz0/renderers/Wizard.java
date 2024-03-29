package com.wcz0.renderers;
/**
 * 表单向导 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/wizard

 * @author wcz0
 * @version 6.2.2
 */
public class Wizard extends BaseRenderer {

	public Wizard() {
		this.set("type", "wizard");
	}

	public Wizard set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Wizard id(Object value) {
		return (Wizard) this.set("id", value);
	}
	
	/**
	 * Wizard 用来获取初始数据的 api。
    */
	public Wizard initApi(Object value) {
		return (Wizard) this.set("initApi", value);
	}
	
	/**
	 * 保存完后，可以指定跳转地址，支持相对路径和组内绝对路径，同时可以通过 $xxx 使用变量
    */
	public Wizard redirect(Object value) {
		return (Wizard) this.set("redirect", value);
	}
	
	/**
	 * 是否用panel包裹
    */
	public Wizard wrapWithPanel(Object value) {
		return (Wizard) this.set("wrapWithPanel", value);
	}
	
	/**
	 * 步骤条区域css类
    */
	public Wizard stepsClassName(Object value) {
		return (Wizard) this.set("stepsClassName", value);
	}
	
	/**
	 * 底部操作栏的css类
    */
	public Wizard footerClassName(Object value) {
		return (Wizard) this.set("footerClassName", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public Wizard staticInputClassName(Object value) {
		return (Wizard) this.set("staticInputClassName", value);
	}
	
	/**
	 * 组件样式
    */
	public Wizard style(Object value) {
		return (Wizard) this.set("style", value);
	}
	
	/**
	 * 指定为表单向导
    */
	public Wizard type(Object value) {
		return (Wizard) this.set("type", value);
	}
	
	/**
	 * 完成按钮的文字描述
    */
	public Wizard actionFinishLabel(Object value) {
		return (Wizard) this.set("actionFinishLabel", value);
	}
	
	/**
	 * 上一步按钮的文字描述
    */
	public Wizard actionPrevLabel(Object value) {
		return (Wizard) this.set("actionPrevLabel", value);
	}
	
	/**
	    */
	public Wizard reload(Object value) {
		return (Wizard) this.set("reload", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public Wizard className(Object value) {
		return (Wizard) this.set("className", value);
	}
	
	/**
	 * Wizard 用来保存数据的 api。 [详情](https://baidu.github.io/amis/docs/api#wizard)
    */
	public Wizard api(Object value) {
		return (Wizard) this.set("api", value);
	}
	
	/**
	    */
	public Wizard name(Object value) {
		return (Wizard) this.set("name", value);
	}
	
	/**
	 * step + body区域css类
    */
	public Wizard stepClassName(Object value) {
		return (Wizard) this.set("stepClassName", value);
	}
	
	/**
	    */
	public Wizard staticSchema(Object value) {
		return (Wizard) this.set("staticSchema", value);
	}
	
	/**
	 * 配置按钮 className
    */
	public Wizard actionClassName(Object value) {
		return (Wizard) this.set("actionClassName", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public Wizard disabledOn(Object value) {
		return (Wizard) this.set("disabledOn", value);
	}
	
	/**
	 * 是否隐藏
    */
	public Wizard hidden(Object value) {
		return (Wizard) this.set("hidden", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public Wizard visibleOn(Object value) {
		return (Wizard) this.set("visibleOn", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public Wizard staticClassName(Object value) {
		return (Wizard) this.set("staticClassName", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public Wizard staticLabelClassName(Object value) {
		return (Wizard) this.set("staticLabelClassName", value);
	}
	
	/**
	    */
	public Wizard steps(Object value) {
		return (Wizard) this.set("steps", value);
	}
	
	/**
	 * 表单区域css类
    */
	public Wizard bodyClassName(Object value) {
		return (Wizard) this.set("bodyClassName", value);
	}
	
	/**
	 * 事件动作配置
    */
	public Wizard onEvent(Object value) {
		return (Wizard) this.set("onEvent", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public Wizard hiddenOn(Object value) {
		return (Wizard) this.set("hiddenOn", value);
	}
	
	/**
	 * 是否显示
    */
	public Wizard visible(Object value) {
		return (Wizard) this.set("visible", value);
	}
	
	/**
	 * 是否静态展示
    */
	public Wizard static_(Object value) {
		return (Wizard) this.set("static_", value);
	}
	
	/**
	 * 下一步按钮的文字描述
    */
	public Wizard actionNextLabel(Object value) {
		return (Wizard) this.set("actionNextLabel", value);
	}
	
	/**
	 * 是否合并后再提交
    */
	public Wizard bulkSubmit(Object value) {
		return (Wizard) this.set("bulkSubmit", value);
	}
	
	/**
	 * 展示模式
    * 可选值: vertical | horizontal
    */
	public Wizard mode(Object value) {
		return (Wizard) this.set("mode", value);
	}
	
	/**
	    */
	public Wizard startStep(Object value) {
		return (Wizard) this.set("startStep", value);
	}
	
	/**
	    */
	public Wizard loadingConfig(Object value) {
		return (Wizard) this.set("loadingConfig", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Wizard useMobileUI(Object value) {
		return (Wizard) this.set("useMobileUI", value);
	}
	
	/**
	 * 下一步并且保存按钮的文字描述
    */
	public Wizard actionNextSaveLabel(Object value) {
		return (Wizard) this.set("actionNextSaveLabel", value);
	}
	
	/**
	 * 是否为只读模式。
    */
	public Wizard readOnly(Object value) {
		return (Wizard) this.set("readOnly", value);
	}
	
	/**
	 * 默认表单提交自己会通过发送 api 保存数据，但是也可以设定另外一个 form 的 name 值，或者另外一个 `CRUD` 模型的 name 值。 如果 target 目标是一个 `Form` ，则目标 `Form` 会重新触发 `initApi` 和 `schemaApi`，api 可以拿到当前 form 数据。如果目标是一个 `CRUD` 模型，则目标模型会重新触发搜索，参数为当前 Form 数据。
    */
	public Wizard target(Object value) {
		return (Wizard) this.set("target", value);
	}
	
	/**
	 * 是否将底部按钮固定在底部。
    */
	public Wizard affixFooter(Object value) {
		return (Wizard) this.set("affixFooter", value);
	}
	
	/**
	 * 是否禁用
    */
	public Wizard disabled(Object value) {
		return (Wizard) this.set("disabled", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public Wizard staticOn(Object value) {
		return (Wizard) this.set("staticOn", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public Wizard staticPlaceholder(Object value) {
		return (Wizard) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Wizard editorSetting(Object value) {
		return (Wizard) this.set("editorSetting", value);
	}
	}