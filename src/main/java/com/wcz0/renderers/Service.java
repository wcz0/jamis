package com.wcz0.renderers;
/**
 * Service 服务类控件。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/service

 * @author wcz0
 * @version 6.2.2
 */
public class Service extends BaseRenderer {

	public Service() {
		this.set("type", "service");
	}

	/**
	 * 静态展示表单项Value类名
    */
	public Service staticInputClassName(Object value) {
		return (Service) this.set("staticInputClassName", value);
	}
	
	/**
	 * 组件样式
    */
	public Service style(Object value) {
		return (Service) this.set("style", value);
	}
	
	/**
	    */
	public Service testIdBuilder(Object value) {
		return (Service) this.set("testIdBuilder", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public Service className(Object value) {
		return (Service) this.set("className", value);
	}
	
	/**
	 * 是否静态展示
    */
	public Service static_(Object value) {
		return (Service) this.set("static_", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public Service staticPlaceholder(Object value) {
		return (Service) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 通过调用外部函数来获取数据
    */
	public Service dataProvider(Object value) {
		return (Service) this.set("dataProvider", value);
	}
	
	/**
	    */
	public Service name(Object value) {
		return (Service) this.set("name", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Service id(Object value) {
		return (Service) this.set("id", value);
	}
	
	/**
	 * 是否默认就拉取？
    */
	public Service initFetch(Object value) {
		return (Service) this.set("initFetch", value);
	}
	
	/**
	 * 是否隐藏
    */
	public Service hidden(Object value) {
		return (Service) this.set("hidden", value);
	}
	
	/**
	 * 事件动作配置
    */
	public Service onEvent(Object value) {
		return (Service) this.set("onEvent", value);
	}
	
	/**
	    */
	public Service staticSchema(Object value) {
		return (Service) this.set("staticSchema", value);
	}
	
	/**
	 * 页面初始化的时候，可以设置一个 API 让其取拉取，发送数据会携带当前 data 数据（包含地址栏参数），获取得数据会合并到 data 中，供组件内使用。
    */
	public Service api(Object value) {
		return (Service) this.set("api", value);
	}
	
	/**
	 * WebScocket 地址，用于实时获取数据
    */
	public Service ws(Object value) {
		return (Service) this.set("ws", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public Service $$id(Object value) {
		return (Service) this.set("$$id", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public Service staticOn(Object value) {
		return (Service) this.set("staticOn", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public Service staticLabelClassName(Object value) {
		return (Service) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 指定为 Service 数据拉取控件。
    */
	public Service type(Object value) {
		return (Service) this.set("type", value);
	}
	
	/**
	 * 是否默认加载 schemaApi
    */
	public Service initFetchSchema(Object value) {
		return (Service) this.set("initFetchSchema", value);
	}
	
	/**
	 * 用表达式来配置。
    */
	public Service initFetchSchemaOn(Object value) {
		return (Service) this.set("initFetchSchemaOn", value);
	}
	
	/**
	 * 是否显示
    */
	public Service visible(Object value) {
		return (Service) this.set("visible", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public Service hiddenOn(Object value) {
		return (Service) this.set("hiddenOn", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Service useMobileUI(Object value) {
		return (Service) this.set("useMobileUI", value);
	}
	
	/**
	    */
	public Service fetchOn(Object value) {
		return (Service) this.set("fetchOn", value);
	}
	
	/**
	 * 是否静默拉取
    */
	public Service silentPolling(Object value) {
		return (Service) this.set("silentPolling", value);
	}
	
	/**
	    */
	public Service messages(Object value) {
		return (Service) this.set("messages", value);
	}
	
	/**
	 * 是否禁用
    */
	public Service disabled(Object value) {
		return (Service) this.set("disabled", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public Service disabledOn(Object value) {
		return (Service) this.set("disabledOn", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public Service visibleOn(Object value) {
		return (Service) this.set("visibleOn", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public Service staticClassName(Object value) {
		return (Service) this.set("staticClassName", value);
	}
	
	/**
	    */
	public Service testid(Object value) {
		return (Service) this.set("testid", value);
	}
	
	/**
	 * 内容区域
    */
	public Service body(Object value) {
		return (Service) this.set("body", value);
	}
	
	/**
	    */
	public Service loadingConfig(Object value) {
		return (Service) this.set("loadingConfig", value);
	}
	
	/**
	 * 是否默认就拉取？通过表达式来决定.
    */
	public Service initFetchOn(Object value) {
		return (Service) this.set("initFetchOn", value);
	}
	
	/**
	 * 用来获取远程 Schema 的 api
    */
	public Service schemaApi(Object value) {
		return (Service) this.set("schemaApi", value);
	}
	
	/**
	 * 是否轮询拉取
    */
	public Service interval(Object value) {
		return (Service) this.set("interval", value);
	}
	
	/**
	 * 关闭轮询的条件。
    */
	public Service stopAutoRefreshWhen(Object value) {
		return (Service) this.set("stopAutoRefreshWhen", value);
	}
	
	/**
	 * 是否以Alert的形式显示api接口响应的错误信息，默认展示
    */
	public Service showErrorMsg(Object value) {
		return (Service) this.set("showErrorMsg", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Service editorSetting(Object value) {
		return (Service) this.set("editorSetting", value);
	}
	}