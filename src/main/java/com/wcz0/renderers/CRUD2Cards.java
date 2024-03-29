package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class CRUD2Cards extends BaseRenderer {

	public CRUD2Cards() {
		this.set("type", "cRUD2Cards");
	}

	public CRUD2Cards set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 卡片 CSS 类名
    */
	public CRUD2Cards itemClassName(Object value) {
		return (CRUD2Cards) this.set("itemClassName", value);
	}
	
	/**
	 * 是否禁用
    */
	public CRUD2Cards disabled(Object value) {
		return (CRUD2Cards) this.set("disabled", value);
	}
	
	/**
	 * 设置自动刷新时间
    */
	public CRUD2Cards interval(Object value) {
		return (CRUD2Cards) this.set("interval", value);
	}
	
	/**
	 * 顶部区域CSS类名
    */
	public CRUD2Cards headerToolbarClassName(Object value) {
		return (CRUD2Cards) this.set("headerToolbarClassName", value);
	}
	
	/**
	 * 是否为瀑布流布局？
    */
	public CRUD2Cards masonryLayout(Object value) {
		return (CRUD2Cards) this.set("masonryLayout", value);
	}
	
	/**
	 * 事件动作配置
    */
	public CRUD2Cards onEvent(Object value) {
		return (CRUD2Cards) this.set("onEvent", value);
	}
	
	/**
	 * 设置分页一页显示的多少条数据的字段名。
    */
	public CRUD2Cards perPageField(Object value) {
		return (CRUD2Cards) this.set("perPageField", value);
	}
	
	/**
	 * 可以用来作为值的字段
    */
	public CRUD2Cards valueField(Object value) {
		return (CRUD2Cards) this.set("valueField", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public CRUD2Cards staticClassName(Object value) {
		return (CRUD2Cards) this.set("staticClassName", value);
	}
	
	/**
	    */
	public CRUD2Cards loadingConfig(Object value) {
		return (CRUD2Cards) this.set("loadingConfig", value);
	}
	
	/**
	 * 翻页时是否保留用户已选的数据
    */
	public CRUD2Cards keepItemSelectionOnPageChange(Object value) {
		return (CRUD2Cards) this.set("keepItemSelectionOnPageChange", value);
	}
	
	/**
	 * 头部 CSS 类名
    */
	public CRUD2Cards headerClassName(Object value) {
		return (CRUD2Cards) this.set("headerClassName", value);
	}
	
	/**
	 * 也可以直接从环境变量中读取，但是不太推荐。
    */
	public CRUD2Cards source(Object value) {
		return (CRUD2Cards) this.set("source", value);
	}
	
	/**
	 * 标题
    */
	public CRUD2Cards title(Object value) {
		return (CRUD2Cards) this.set("title", value);
	}
	
	/**
	 * 点击卡片的时候是否勾选卡片。
    */
	public CRUD2Cards checkOnItemClick(Object value) {
		return (CRUD2Cards) this.set("checkOnItemClick", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public CRUD2Cards staticInputClassName(Object value) {
		return (CRUD2Cards) this.set("staticInputClassName", value);
	}
	
	/**
	 * 初始化数据 API
    */
	public CRUD2Cards api(Object value) {
		return (CRUD2Cards) this.set("api", value);
	}
	
	/**
	 * 保存排序的 api
    */
	public CRUD2Cards saveOrderApi(Object value) {
		return (CRUD2Cards) this.set("saveOrderApi", value);
	}
	
	/**
	 * 是否将过滤条件的参数同步到地址栏,默认为true
    */
	public CRUD2Cards syncLocation(Object value) {
		return (CRUD2Cards) this.set("syncLocation", value);
	}
	
	/**
	 * 底部 CSS 类名
    */
	public CRUD2Cards footerClassName(Object value) {
		return (CRUD2Cards) this.set("footerClassName", value);
	}
	
	/**
	 * 无数据提示
    */
	public CRUD2Cards placeholder(Object value) {
		return (CRUD2Cards) this.set("placeholder", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public CRUD2Cards visibleOn(Object value) {
		return (CRUD2Cards) this.set("visibleOn", value);
	}
	
	/**
	 * 数据展示模式 无限加载 or 分页
    * 可选值: more | pagination
    */
	public CRUD2Cards loadType(Object value) {
		return (CRUD2Cards) this.set("loadType", value);
	}
	
	/**
	 * 快速编辑后用来批量保存的 API
    */
	public CRUD2Cards quickSaveApi(Object value) {
		return (CRUD2Cards) this.set("quickSaveApi", value);
	}
	
	/**
	 * 底部区域
    */
	public CRUD2Cards footerToolbar(Object value) {
		return (CRUD2Cards) this.set("footerToolbar", value);
	}
	
	/**
	 * 是否固顶
    */
	public CRUD2Cards affixHeader(Object value) {
		return (CRUD2Cards) this.set("affixHeader", value);
	}
	
	/**
	 * 底部区域
    */
	public CRUD2Cards footer(Object value) {
		return (CRUD2Cards) this.set("footer", value);
	}
	
	/**
	 * 指定内容区的展示模式。
    */
	public CRUD2Cards mode(Object value) {
		return (CRUD2Cards) this.set("mode", value);
	}
	
	/**
	 * 指定为 CRUD2 渲染器。
    */
	public CRUD2Cards type(Object value) {
		return (CRUD2Cards) this.set("type", value);
	}
	
	/**
	    */
	public CRUD2Cards name(Object value) {
		return (CRUD2Cards) this.set("name", value);
	}
	
	/**
	 * 是否固底
    */
	public CRUD2Cards affixFooter(Object value) {
		return (CRUD2Cards) this.set("affixFooter", value);
	}
	
	/**
	 * 组件样式
    */
	public CRUD2Cards style(Object value) {
		return (CRUD2Cards) this.set("style", value);
	}
	
	/**
	 * 静默拉取
    */
	public CRUD2Cards silentPolling(Object value) {
		return (CRUD2Cards) this.set("silentPolling", value);
	}
	
	/**
	    */
	public CRUD2Cards stopAutoRefreshWhen(Object value) {
		return (CRUD2Cards) this.set("stopAutoRefreshWhen", value);
	}
	
	/**
	 * 是否隐藏勾选框
    */
	public CRUD2Cards hideCheckToggler(Object value) {
		return (CRUD2Cards) this.set("hideCheckToggler", value);
	}
	
	/**
	 * 顶部区域
    */
	public CRUD2Cards header(Object value) {
		return (CRUD2Cards) this.set("header", value);
	}
	
	/**
	 * 是否将接口返回的内容自动同步到地址栏，前提是开启了同步地址栏。
    */
	public CRUD2Cards syncResponse2Query(Object value) {
		return (CRUD2Cards) this.set("syncResponse2Query", value);
	}
	
	/**
	 * 内容区域占满屏幕剩余空间
    */
	public CRUD2Cards autoFillHeight(Object value) {
		return (CRUD2Cards) this.set("autoFillHeight", value);
	}
	
	/**
	 * 配置某项是否可拖拽排序，前提是要开启拖拽功能
    */
	public CRUD2Cards itemDraggableOn(Object value) {
		return (CRUD2Cards) this.set("itemDraggableOn", value);
	}
	
	/**
	 * 是否隐藏
    */
	public CRUD2Cards hidden(Object value) {
		return (CRUD2Cards) this.set("hidden", value);
	}
	
	/**
	 * 是否隐藏快速编辑的按钮。
    */
	public CRUD2Cards hideQuickSaveBtn(Object value) {
		return (CRUD2Cards) this.set("hideQuickSaveBtn", value);
	}
	
	/**
	 * 是否开启Query信息转换，开启后将会对url中的Query进行转换，默认开启，默认仅转化布尔值
    */
	public CRUD2Cards parsePrimitiveQuery(Object value) {
		return (CRUD2Cards) this.set("parsePrimitiveQuery", value);
	}
	
	/**
	 * 快速编辑配置成及时保存时使用的 API
    */
	public CRUD2Cards quickSaveItemApi(Object value) {
		return (CRUD2Cards) this.set("quickSaveItemApi", value);
	}
	
	/**
	 * 行标识符，默认为id
    */
	public CRUD2Cards primaryField(Object value) {
		return (CRUD2Cards) this.set("primaryField", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public CRUD2Cards hiddenOn(Object value) {
		return (CRUD2Cards) this.set("hiddenOn", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public CRUD2Cards staticLabelClassName(Object value) {
		return (CRUD2Cards) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public CRUD2Cards useMobileUI(Object value) {
		return (CRUD2Cards) this.set("useMobileUI", value);
	}
	
	/**
	 * 无限加载时，根据此项设置其每页加载数量，可以不限制
    */
	public CRUD2Cards perPage(Object value) {
		return (CRUD2Cards) this.set("perPage", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public CRUD2Cards editorSetting(Object value) {
		return (CRUD2Cards) this.set("editorSetting", value);
	}
	
	/**
	 * 是否为前端单次加载模式，可以用来实现前端分页。
    */
	public CRUD2Cards loadDataOnce(Object value) {
		return (CRUD2Cards) this.set("loadDataOnce", value);
	}
	
	/**
	 * 是否可以选择数据，外部事件动作
    */
	public CRUD2Cards selectable(Object value) {
		return (CRUD2Cards) this.set("selectable", value);
	}
	
	/**
	 * 配置某项是否可以点选
    */
	public CRUD2Cards itemCheckableOn(Object value) {
		return (CRUD2Cards) this.set("itemCheckableOn", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public CRUD2Cards className(Object value) {
		return (CRUD2Cards) this.set("className", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public CRUD2Cards disabledOn(Object value) {
		return (CRUD2Cards) this.set("disabledOn", value);
	}
	
	/**
	 * 是否静态展示
    */
	public CRUD2Cards static_(Object value) {
		return (CRUD2Cards) this.set("static_", value);
	}
	
	/**
	 * 是否显示头部
    */
	public CRUD2Cards showHeader(Object value) {
		return (CRUD2Cards) this.set("showHeader", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public CRUD2Cards staticPlaceholder(Object value) {
		return (CRUD2Cards) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 是否自动跳顶部，当切分页的时候。
    */
	public CRUD2Cards autoJumpToTopOnPagerChange(Object value) {
		return (CRUD2Cards) this.set("autoJumpToTopOnPagerChange", value);
	}
	
	/**
	 * 是否可以多选数据，仅当selectable为 true 时生效
    */
	public CRUD2Cards multiple(Object value) {
		return (CRUD2Cards) this.set("multiple", value);
	}
	
	/**
	 * 是否展示已选数据区域，仅当selectable为 true 时生效
    */
	public CRUD2Cards showSelection(Object value) {
		return (CRUD2Cards) this.set("showSelection", value);
	}
	
	/**
	 * 顶部区域
    */
	public CRUD2Cards headerToolbar(Object value) {
		return (CRUD2Cards) this.set("headerToolbar", value);
	}
	
	/**
	    */
	public CRUD2Cards card(Object value) {
		return (CRUD2Cards) this.set("card", value);
	}
	
	/**
	 * 是否显示底部
    */
	public CRUD2Cards showFooter(Object value) {
		return (CRUD2Cards) this.set("showFooter", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public CRUD2Cards id(Object value) {
		return (CRUD2Cards) this.set("id", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public CRUD2Cards staticOn(Object value) {
		return (CRUD2Cards) this.set("staticOn", value);
	}
	
	/**
	 * 是否显示
    */
	public CRUD2Cards visible(Object value) {
		return (CRUD2Cards) this.set("visible", value);
	}
	
	/**
	    */
	public CRUD2Cards staticSchema(Object value) {
		return (CRUD2Cards) this.set("staticSchema", value);
	}
	
	/**
	 * 设置分页页码字段名。
    */
	public CRUD2Cards pageField(Object value) {
		return (CRUD2Cards) this.set("pageField", value);
	}
	
	/**
	 * 底部区域CSS类名
    */
	public CRUD2Cards footerToolbarClassName(Object value) {
		return (CRUD2Cards) this.set("footerToolbarClassName", value);
	}
	}