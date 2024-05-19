package com.wcz0.renderers;
/**
 * amis Page 渲染器。详情请见：https://aisuda.bce.baidu.com/amis/zh-CN/components/page

 * @author wcz0
 * @version 6.2.2
 */
public class Page extends BaseRenderer {

	public Page() {
		this.set("type", "page");
	}

	/**
	 * 是否禁用
    */
	public Page disabled(Object value) {
		return (Page) this.set("disabled", value);
	}
	
	/**
	 * 边栏区域
    */
	public Page aside(Object value) {
		return (Page) this.set("aside", value);
	}
	
	/**
	 * 自定义页面级别样式表
    */
	public Page css(Object value) {
		return (Page) this.set("css", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public Page $$id(Object value) {
		return (Page) this.set("$$id", value);
	}
	
	/**
	    */
	public Page definitions(Object value) {
		return (Page) this.set("definitions", value);
	}
	
	/**
	 * 是否显示错误信息，默认是显示的。
    */
	public Page showErrorMsg(Object value) {
		return (Page) this.set("showErrorMsg", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public Page staticOn(Object value) {
		return (Page) this.set("staticOn", value);
	}
	
	/**
	 * 自定义样式
    */
	public Page style(Object value) {
		return (Page) this.set("style", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Page useMobileUI(Object value) {
		return (Page) this.set("useMobileUI", value);
	}
	
	/**
	    */
	public Page testIdBuilder(Object value) {
		return (Page) this.set("testIdBuilder", value);
	}
	
	/**
	 * 配置 header 容器 className
    */
	public Page headerClassName(Object value) {
		return (Page) this.set("headerClassName", value);
	}
	
	/**
	 * 页面顶部区域，当存在 title 时在右上角显示。
    */
	public Page toolbar(Object value) {
		return (Page) this.set("toolbar", value);
	}
	
	/**
	 * 下拉刷新配置
    */
	public Page pullRefresh(Object value) {
		return (Page) this.set("pullRefresh", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Page id(Object value) {
		return (Page) this.set("id", value);
	}
	
	/**
	 * 边栏最小宽度
    */
	public Page asideMinWidth(Object value) {
		return (Page) this.set("asideMinWidth", value);
	}
	
	/**
	 * 默认不设置自动感觉内容来决定要不要展示这些区域 如果配置了，以配置为主。
    */
	public Page regions(Object value) {
		return (Page) this.set("regions", value);
	}
	
	/**
	 * 内容区域
    */
	public Page body(Object value) {
		return (Page) this.set("body", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public Page hiddenOn(Object value) {
		return (Page) this.set("hiddenOn", value);
	}
	
	/**
	    */
	public Page testid(Object value) {
		return (Page) this.set("testid", value);
	}
	
	/**
	 * 边栏区 css 类名
    */
	public Page asideClassName(Object value) {
		return (Page) this.set("asideClassName", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public Page disabledOn(Object value) {
		return (Page) this.set("disabledOn", value);
	}
	
	/**
	 * 配置 toolbar 容器 className
    */
	public Page toolbarClassName(Object value) {
		return (Page) this.set("toolbarClassName", value);
	}
	
	/**
	 * 是否静态展示
    */
	public Page static_(Object value) {
		return (Page) this.set("static_", value);
	}
	
	/**
	 * 页面初始化的时候，可以设置一个 API 让其取拉取，发送数据会携带当前 data 数据（包含地址栏参数），获取得数据会合并到 data 中，供组件内使用。
    */
	public Page initApi(Object value) {
		return (Page) this.set("initApi", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public Page staticLabelClassName(Object value) {
		return (Page) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 是否显示
    */
	public Page visible(Object value) {
		return (Page) this.set("visible", value);
	}
	
	/**
	 * 事件动作配置
    */
	public Page onEvent(Object value) {
		return (Page) this.set("onEvent", value);
	}
	
	/**
	 * 配置容器 className
    */
	public Page className(Object value) {
		return (Page) this.set("className", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public Page staticPlaceholder(Object value) {
		return (Page) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Page editorSetting(Object value) {
		return (Page) this.set("editorSetting", value);
	}
	
	/**
	 * 页面标题
    */
	public Page title(Object value) {
		return (Page) this.set("title", value);
	}
	
	/**
	 * 页面级别的初始数据
    */
	public Page data(Object value) {
		return (Page) this.set("data", value);
	}
	
	/**
	    */
	public Page messages(Object value) {
		return (Page) this.set("messages", value);
	}
	
	/**
	    */
	public Page loadingConfig(Object value) {
		return (Page) this.set("loadingConfig", value);
	}
	
	/**
	 * 页面描述, 标题旁边会出现个小图标，放上去会显示这个属性配置的内容。
    */
	public Page remark(Object value) {
		return (Page) this.set("remark", value);
	}
	
	/**
	    */
	public Page staticSchema(Object value) {
		return (Page) this.set("staticSchema", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public Page staticClassName(Object value) {
		return (Page) this.set("staticClassName", value);
	}
	
	/**
	 * 边栏内容是否粘住，即不跟随滚动。
    */
	public Page asideSticky(Object value) {
		return (Page) this.set("asideSticky", value);
	}
	
	/**
	    */
	public Page name(Object value) {
		return (Page) this.set("name", value);
	}
	
	/**
	 * 是否隐藏
    */
	public Page hidden(Object value) {
		return (Page) this.set("hidden", value);
	}
	
	/**
	 * 指定为 page 渲染器。
    */
	public Page type(Object value) {
		return (Page) this.set("type", value);
	}
	
	/**
	 * 内容区 css 类名
    */
	public Page bodyClassName(Object value) {
		return (Page) this.set("bodyClassName", value);
	}
	
	/**
	 * 边栏是否允许拖动
    */
	public Page asideResizor(Object value) {
		return (Page) this.set("asideResizor", value);
	}
	
	/**
	 * 边栏最小宽度
    */
	public Page asideMaxWidth(Object value) {
		return (Page) this.set("asideMaxWidth", value);
	}
	
	/**
	 * 配置轮询间隔，配置后 initApi 将轮询加载。
    */
	public Page interval(Object value) {
		return (Page) this.set("interval", value);
	}
	
	/**
	 * 配置停止轮询的条件。
    */
	public Page stopAutoRefreshWhen(Object value) {
		return (Page) this.set("stopAutoRefreshWhen", value);
	}
	
	/**
	 * css 变量
    */
	public Page cssVars(Object value) {
		return (Page) this.set("cssVars", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public Page visibleOn(Object value) {
		return (Page) this.set("visibleOn", value);
	}
	
	/**
	 * 移动端下的样式表
    */
	public Page mobileCSS(Object value) {
		return (Page) this.set("mobileCSS", value);
	}
	
	/**
	 * 是否默认就拉取？
    */
	public Page initFetch(Object value) {
		return (Page) this.set("initFetch", value);
	}
	
	/**
	 * 是否默认就拉取表达式
    */
	public Page initFetchOn(Object value) {
		return (Page) this.set("initFetchOn", value);
	}
	
	/**
	 * 是否要静默加载，也就是说不显示进度
    */
	public Page silentPolling(Object value) {
		return (Page) this.set("silentPolling", value);
	}
	
	/**
	 * 页面副标题
    */
	public Page subTitle(Object value) {
		return (Page) this.set("subTitle", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public Page staticInputClassName(Object value) {
		return (Page) this.set("staticInputClassName", value);
	}
	}