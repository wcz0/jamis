package com.wcz0.renderers;
/**
 * Tasks 渲染器，格式说明 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/tasks

 * @author wcz0
 * @version 6.2.2
 */
public class Tasks extends BaseRenderer {

	public Tasks() {
		this.set("type", "tasks");
	}

	/**
	 * 容器 css 类名
    */
	public Tasks className(Object value) {
		return (Tasks) this.set("className", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public Tasks staticInputClassName(Object value) {
		return (Tasks) this.set("staticInputClassName", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Tasks useMobileUI(Object value) {
		return (Tasks) this.set("useMobileUI", value);
	}
	
	/**
	    */
	public Tasks testIdBuilder(Object value) {
		return (Tasks) this.set("testIdBuilder", value);
	}
	
	/**
	 * 指定为任务类型
    */
	public Tasks type(Object value) {
		return (Tasks) this.set("type", value);
	}
	
	/**
	 * 重试操作按钮文字
    */
	public Tasks retryBtnText(Object value) {
		return (Tasks) this.set("retryBtnText", value);
	}
	
	/**
	 * 状态显示对应的文字显示配置。
    */
	public Tasks statusTextMap(Object value) {
		return (Tasks) this.set("statusTextMap", value);
	}
	
	/**
	 * 是否隐藏
    */
	public Tasks hidden(Object value) {
		return (Tasks) this.set("hidden", value);
	}
	
	/**
	 * 用来获取任务状态的 API，当没有进行时任务时不会发送。
    */
	public Tasks checkApi(Object value) {
		return (Tasks) this.set("checkApi", value);
	}
	
	/**
	 * 状态显示对应的类名配置。
    */
	public Tasks statusLabelMap(Object value) {
		return (Tasks) this.set("statusLabelMap", value);
	}
	
	/**
	    */
	public Tasks initialStatusCode(Object value) {
		return (Tasks) this.set("initialStatusCode", value);
	}
	
	/**
	    */
	public Tasks readyStatusCode(Object value) {
		return (Tasks) this.set("readyStatusCode", value);
	}
	
	/**
	    */
	public Tasks finishStatusCode(Object value) {
		return (Tasks) this.set("finishStatusCode", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Tasks id(Object value) {
		return (Tasks) this.set("id", value);
	}
	
	/**
	 * 事件动作配置
    */
	public Tasks onEvent(Object value) {
		return (Tasks) this.set("onEvent", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public Tasks staticLabelClassName(Object value) {
		return (Tasks) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 当有任务进行中，会每隔一段时间再次检测，而时间间隔就是通过此项配置，默认 3s。
    */
	public Tasks interval(Object value) {
		return (Tasks) this.set("interval", value);
	}
	
	/**
	 * 配置容器重试按钮 className
    */
	public Tasks retryBtnClassName(Object value) {
		return (Tasks) this.set("retryBtnClassName", value);
	}
	
	/**
	    */
	public Tasks canRetryStatusCode(Object value) {
		return (Tasks) this.set("canRetryStatusCode", value);
	}
	
	/**
	 * 是否禁用
    */
	public Tasks disabled(Object value) {
		return (Tasks) this.set("disabled", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public Tasks visibleOn(Object value) {
		return (Tasks) this.set("visibleOn", value);
	}
	
	/**
	    */
	public Tasks staticSchema(Object value) {
		return (Tasks) this.set("staticSchema", value);
	}
	
	/**
	    */
	public Tasks btnClassName(Object value) {
		return (Tasks) this.set("btnClassName", value);
	}
	
	/**
	 * 操作按钮文字
    */
	public Tasks btnText(Object value) {
		return (Tasks) this.set("btnText", value);
	}
	
	/**
	    */
	public Tasks name(Object value) {
		return (Tasks) this.set("name", value);
	}
	
	/**
	    */
	public Tasks errorStatusCode(Object value) {
		return (Tasks) this.set("errorStatusCode", value);
	}
	
	/**
	 * 任务名称列说明
    */
	public Tasks taskNameLabel(Object value) {
		return (Tasks) this.set("taskNameLabel", value);
	}
	
	/**
	 * 是否静态展示
    */
	public Tasks static_(Object value) {
		return (Tasks) this.set("static_", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public Tasks staticPlaceholder(Object value) {
		return (Tasks) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public Tasks staticClassName(Object value) {
		return (Tasks) this.set("staticClassName", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Tasks editorSetting(Object value) {
		return (Tasks) this.set("editorSetting", value);
	}
	
	/**
	    */
	public Tasks items(Object value) {
		return (Tasks) this.set("items", value);
	}
	
	/**
	 * 备注列说明
    */
	public Tasks remarkLabel(Object value) {
		return (Tasks) this.set("remarkLabel", value);
	}
	
	/**
	 * 状态列说明
    */
	public Tasks statusLabel(Object value) {
		return (Tasks) this.set("statusLabel", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public Tasks disabledOn(Object value) {
		return (Tasks) this.set("disabledOn", value);
	}
	
	/**
	 * 是否显示
    */
	public Tasks visible(Object value) {
		return (Tasks) this.set("visible", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public Tasks staticOn(Object value) {
		return (Tasks) this.set("staticOn", value);
	}
	
	/**
	 * 组件样式
    */
	public Tasks style(Object value) {
		return (Tasks) this.set("style", value);
	}
	
	/**
	 * 提交任务使用的 API
    */
	public Tasks submitApi(Object value) {
		return (Tasks) this.set("submitApi", value);
	}
	
	/**
	 * 配置 table className
    */
	public Tasks tableClassName(Object value) {
		return (Tasks) this.set("tableClassName", value);
	}
	
	/**
	    */
	public Tasks loadingStatusCode(Object value) {
		return (Tasks) this.set("loadingStatusCode", value);
	}
	
	/**
	    */
	public Tasks loadingConfig(Object value) {
		return (Tasks) this.set("loadingConfig", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public Tasks hiddenOn(Object value) {
		return (Tasks) this.set("hiddenOn", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public Tasks $$id(Object value) {
		return (Tasks) this.set("$$id", value);
	}
	
	/**
	    */
	public Tasks testid(Object value) {
		return (Tasks) this.set("testid", value);
	}
	
	/**
	 * 操作列说明
    */
	public Tasks operationLabel(Object value) {
		return (Tasks) this.set("operationLabel", value);
	}
	
	/**
	 * 如果任务失败，且可以重试，提交的时候会使用此 API
    */
	public Tasks reSubmitApi(Object value) {
		return (Tasks) this.set("reSubmitApi", value);
	}
	}