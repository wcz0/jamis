package com.wcz0.renderers;
/**
 * Chart 图表渲染器。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/carousel

 * @author wcz0
 * @version 6.2.2
 */
public class Chart extends BaseRenderer {

	public Chart() {
		this.set("type", "chart");
	}

	public Chart set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 高度设置
    */
	public Chart height(Object value) {
		return (Chart) this.set("height", value);
	}
	
	/**
	 * 加载百度地图
    */
	public Chart loadBaiduMap(Object value) {
		return (Chart) this.set("loadBaiduMap", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public Chart disabledOn(Object value) {
		return (Chart) this.set("disabledOn", value);
	}
	
	/**
	 * 是否初始加载用表达式来配置
    */
	public Chart initFetchOn(Object value) {
		return (Chart) this.set("initFetchOn", value);
	}
	
	/**
	 * 宽度设置
    */
	public Chart width(Object value) {
		return (Chart) this.set("width", value);
	}
	
	/**
	 * 事件动作配置
    */
	public Chart onEvent(Object value) {
		return (Chart) this.set("onEvent", value);
	}
	
	/**
	 * 配置echart的config，支持数据映射。如果用了数据映射，为了同步更新，请设置 trackExpression
    */
	public Chart config(Object value) {
		return (Chart) this.set("config", value);
	}
	
	/**
	 * 地图名称
    */
	public Chart mapName(Object value) {
		return (Chart) this.set("mapName", value);
	}
	
	/**
	 * 图表配置接口
    */
	public Chart api(Object value) {
		return (Chart) this.set("api", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public Chart staticOn(Object value) {
		return (Chart) this.set("staticOn", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public Chart staticClassName(Object value) {
		return (Chart) this.set("staticClassName", value);
	}
	
	/**
	    */
	public Chart staticSchema(Object value) {
		return (Chart) this.set("staticSchema", value);
	}
	
	/**
	 * 获取 geo json 文件的地址
    */
	public Chart mapURL(Object value) {
		return (Chart) this.set("mapURL", value);
	}
	
	/**
	 * 是否禁用
    */
	public Chart disabled(Object value) {
		return (Chart) this.set("disabled", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public Chart hiddenOn(Object value) {
		return (Chart) this.set("hiddenOn", value);
	}
	
	/**
	 * 跟踪表达式，如果这个表达式的运行结果发生变化了，则会更新 Echart，当 config 中用了数据映射时有用。
    */
	public Chart trackExpression(Object value) {
		return (Chart) this.set("trackExpression", value);
	}
	
	/**
	    */
	public Chart name(Object value) {
		return (Chart) this.set("name", value);
	}
	
	/**
	    */
	public Chart source(Object value) {
		return (Chart) this.set("source", value);
	}
	
	/**
	 * 不可见的时候隐藏
    */
	public Chart unMountOnHidden(Object value) {
		return (Chart) this.set("unMountOnHidden", value);
	}
	
	/**
	 * 是否显示
    */
	public Chart visible(Object value) {
		return (Chart) this.set("visible", value);
	}
	
	/**
	 * style样式
    */
	public Chart style(Object value) {
		return (Chart) this.set("style", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public Chart staticInputClassName(Object value) {
		return (Chart) this.set("staticInputClassName", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Chart useMobileUI(Object value) {
		return (Chart) this.set("useMobileUI", value);
	}
	
	/**
	 * Chart 主题配置
    */
	public Chart chartTheme(Object value) {
		return (Chart) this.set("chartTheme", value);
	}
	
	/**
	 * 点击行为配置，可以用来满足下钻操作等。
    */
	public Chart clickAction(Object value) {
		return (Chart) this.set("clickAction", value);
	}
	
	/**
	 * 默认配置时追加的，如果更新配置想完全替换配置请配置为 true.
    */
	public Chart replaceChartOption(Object value) {
		return (Chart) this.set("replaceChartOption", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public Chart visibleOn(Object value) {
		return (Chart) this.set("visibleOn", value);
	}
	
	/**
	 * 是否静态展示
    */
	public Chart static_(Object value) {
		return (Chart) this.set("static_", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Chart editorSetting(Object value) {
		return (Chart) this.set("editorSetting", value);
	}
	
	/**
	 * 是否初始加载。
    */
	public Chart initFetch(Object value) {
		return (Chart) this.set("initFetch", value);
	}
	
	/**
	 * 刷新时间
    */
	public Chart interval(Object value) {
		return (Chart) this.set("interval", value);
	}
	
	/**
	 * 默认开启 Config 中的数据映射，如果想关闭，请开启此功能。
    */
	public Chart disableDataMapping(Object value) {
		return (Chart) this.set("disableDataMapping", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public Chart className(Object value) {
		return (Chart) this.set("className", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public Chart staticLabelClassName(Object value) {
		return (Chart) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public Chart staticPlaceholder(Object value) {
		return (Chart) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 指定为 chart 类型
    */
	public Chart type(Object value) {
		return (Chart) this.set("type", value);
	}
	
	/**
	    */
	public Chart dataFilter(Object value) {
		return (Chart) this.set("dataFilter", value);
	}
	
	/**
	 * 是否隐藏
    */
	public Chart hidden(Object value) {
		return (Chart) this.set("hidden", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Chart id(Object value) {
		return (Chart) this.set("id", value);
	}
	}