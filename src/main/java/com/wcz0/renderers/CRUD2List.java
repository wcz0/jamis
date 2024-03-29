package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class CRUD2List extends BaseRenderer {

	public CRUD2List() {
		this.set("type", "cRUD2List");
	}

	public CRUD2List set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 组件样式
    */
	public CRUD2List style(Object value) {
		return (CRUD2List) this.set("style", value);
	}
	
	/**
	 * 设置自动刷新时间
    */
	public CRUD2List interval(Object value) {
		return (CRUD2List) this.set("interval", value);
	}
	
	/**
	 * 设置分页一页显示的多少条数据的字段名。
    */
	public CRUD2List perPageField(Object value) {
		return (CRUD2List) this.set("perPageField", value);
	}
	
	/**
	 * 是否将接口返回的内容自动同步到地址栏，前提是开启了同步地址栏。
    */
	public CRUD2List syncResponse2Query(Object value) {
		return (CRUD2List) this.set("syncResponse2Query", value);
	}
	
	/**
	 * 内容区域占满屏幕剩余空间
    */
	public CRUD2List autoFillHeight(Object value) {
		return (CRUD2List) this.set("autoFillHeight", value);
	}
	
	/**
	 * 配置某项是否可拖拽排序，前提是要开启拖拽功能
    */
	public CRUD2List itemDraggableOn(Object value) {
		return (CRUD2List) this.set("itemDraggableOn", value);
	}
	
	/**
	 * 顶部区域
    */
	public CRUD2List headerToolbar(Object value) {
		return (CRUD2List) this.set("headerToolbar", value);
	}
	
	/**
	 * 无限加载时，根据此项设置其每页加载数量，可以不限制
    */
	public CRUD2List perPage(Object value) {
		return (CRUD2List) this.set("perPage", value);
	}
	
	/**
	 * 是否展示已选数据区域，仅当selectable为 true 时生效
    */
	public CRUD2List showSelection(Object value) {
		return (CRUD2List) this.set("showSelection", value);
	}
	
	/**
	 * 指定为 CRUD2 渲染器。
    */
	public CRUD2List type(Object value) {
		return (CRUD2List) this.set("type", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public CRUD2List className(Object value) {
		return (CRUD2List) this.set("className", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public CRUD2List hiddenOn(Object value) {
		return (CRUD2List) this.set("hiddenOn", value);
	}
	
	/**
	 * 快速编辑后用来批量保存的 API
    */
	public CRUD2List quickSaveApi(Object value) {
		return (CRUD2List) this.set("quickSaveApi", value);
	}
	
	/**
	    */
	public CRUD2List name(Object value) {
		return (CRUD2List) this.set("name", value);
	}
	
	/**
	 * 配置某项是否可以点选
    */
	public CRUD2List itemCheckableOn(Object value) {
		return (CRUD2List) this.set("itemCheckableOn", value);
	}
	
	/**
	 * 是否开启Query信息转换，开启后将会对url中的Query进行转换，默认开启，默认仅转化布尔值
    */
	public CRUD2List parsePrimitiveQuery(Object value) {
		return (CRUD2List) this.set("parsePrimitiveQuery", value);
	}
	
	/**
	 * 也可以直接从环境变量中读取，但是不太推荐。
    */
	public CRUD2List source(Object value) {
		return (CRUD2List) this.set("source", value);
	}
	
	/**
	 * 点击列表项的行为
    */
	public CRUD2List itemAction(Object value) {
		return (CRUD2List) this.set("itemAction", value);
	}
	
	/**
	 * 是否隐藏
    */
	public CRUD2List hidden(Object value) {
		return (CRUD2List) this.set("hidden", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public CRUD2List visibleOn(Object value) {
		return (CRUD2List) this.set("visibleOn", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public CRUD2List staticClassName(Object value) {
		return (CRUD2List) this.set("staticClassName", value);
	}
	
	/**
	 * 快速编辑配置成及时保存时使用的 API
    */
	public CRUD2List quickSaveItemApi(Object value) {
		return (CRUD2List) this.set("quickSaveItemApi", value);
	}
	
	/**
	 * 是否显示头部
    */
	public CRUD2List showHeader(Object value) {
		return (CRUD2List) this.set("showHeader", value);
	}
	
	/**
	 * 底部区域
    */
	public CRUD2List footer(Object value) {
		return (CRUD2List) this.set("footer", value);
	}
	
	/**
	 * 是否可以多选数据，仅当selectable为 true 时生效
    */
	public CRUD2List multiple(Object value) {
		return (CRUD2List) this.set("multiple", value);
	}
	
	/**
	 * 标题
    */
	public CRUD2List title(Object value) {
		return (CRUD2List) this.set("title", value);
	}
	
	/**
	 * 无数据提示
    */
	public CRUD2List placeholder(Object value) {
		return (CRUD2List) this.set("placeholder", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public CRUD2List staticOn(Object value) {
		return (CRUD2List) this.set("staticOn", value);
	}
	
	/**
	 * 保存排序的 api
    */
	public CRUD2List saveOrderApi(Object value) {
		return (CRUD2List) this.set("saveOrderApi", value);
	}
	
	/**
	 * 是否自动跳顶部，当切分页的时候。
    */
	public CRUD2List autoJumpToTopOnPagerChange(Object value) {
		return (CRUD2List) this.set("autoJumpToTopOnPagerChange", value);
	}
	
	/**
	 * 顶部区域类名
    */
	public CRUD2List headerClassName(Object value) {
		return (CRUD2List) this.set("headerClassName", value);
	}
	
	/**
	 * 单条数据展示内容配置
    */
	public CRUD2List listItem(Object value) {
		return (CRUD2List) this.set("listItem", value);
	}
	
	/**
	    */
	public CRUD2List loadingConfig(Object value) {
		return (CRUD2List) this.set("loadingConfig", value);
	}
	
	/**
	 * 静默拉取
    */
	public CRUD2List silentPolling(Object value) {
		return (CRUD2List) this.set("silentPolling", value);
	}
	
	/**
	 * 是否为前端单次加载模式，可以用来实现前端分页。
    */
	public CRUD2List loadDataOnce(Object value) {
		return (CRUD2List) this.set("loadDataOnce", value);
	}
	
	/**
	 * 翻页时是否保留用户已选的数据
    */
	public CRUD2List keepItemSelectionOnPageChange(Object value) {
		return (CRUD2List) this.set("keepItemSelectionOnPageChange", value);
	}
	
	/**
	 * 行标识符，默认为id
    */
	public CRUD2List primaryField(Object value) {
		return (CRUD2List) this.set("primaryField", value);
	}
	
	/**
	 * 底部区域类名
    */
	public CRUD2List footerClassName(Object value) {
		return (CRUD2List) this.set("footerClassName", value);
	}
	
	/**
	 * 点击列表单行时，是否选择
    */
	public CRUD2List checkOnItemClick(Object value) {
		return (CRUD2List) this.set("checkOnItemClick", value);
	}
	
	/**
	 * 是否可以选择数据，外部事件动作
    */
	public CRUD2List selectable(Object value) {
		return (CRUD2List) this.set("selectable", value);
	}
	
	/**
	 * 是否隐藏勾选框
    */
	public CRUD2List hideCheckToggler(Object value) {
		return (CRUD2List) this.set("hideCheckToggler", value);
	}
	
	/**
	 * 初始化数据 API
    */
	public CRUD2List api(Object value) {
		return (CRUD2List) this.set("api", value);
	}
	
	/**
	 * 设置分页页码字段名。
    */
	public CRUD2List pageField(Object value) {
		return (CRUD2List) this.set("pageField", value);
	}
	
	/**
	 * 可以用来作为值的字段
    */
	public CRUD2List valueField(Object value) {
		return (CRUD2List) this.set("valueField", value);
	}
	
	/**
	 * 底部区域
    */
	public CRUD2List footerToolbar(Object value) {
		return (CRUD2List) this.set("footerToolbar", value);
	}
	
	/**
	 * 是否固顶
    */
	public CRUD2List affixHeader(Object value) {
		return (CRUD2List) this.set("affixHeader", value);
	}
	
	/**
	 * 指定内容区的展示模式。
    */
	public CRUD2List mode(Object value) {
		return (CRUD2List) this.set("mode", value);
	}
	
	/**
	 * 是否将过滤条件的参数同步到地址栏,默认为true
    */
	public CRUD2List syncLocation(Object value) {
		return (CRUD2List) this.set("syncLocation", value);
	}
	
	/**
	 * 是否隐藏快速编辑的按钮。
    */
	public CRUD2List hideQuickSaveBtn(Object value) {
		return (CRUD2List) this.set("hideQuickSaveBtn", value);
	}
	
	/**
	 * 顶部区域CSS类名
    */
	public CRUD2List headerToolbarClassName(Object value) {
		return (CRUD2List) this.set("headerToolbarClassName", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public CRUD2List disabledOn(Object value) {
		return (CRUD2List) this.set("disabledOn", value);
	}
	
	/**
	 * 大小
    * 可选值: sm | base
    */
	public CRUD2List size(Object value) {
		return (CRUD2List) this.set("size", value);
	}
	
	/**
	 * 是否禁用
    */
	public CRUD2List disabled(Object value) {
		return (CRUD2List) this.set("disabled", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public CRUD2List staticInputClassName(Object value) {
		return (CRUD2List) this.set("staticInputClassName", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public CRUD2List editorSetting(Object value) {
		return (CRUD2List) this.set("editorSetting", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public CRUD2List useMobileUI(Object value) {
		return (CRUD2List) this.set("useMobileUI", value);
	}
	
	/**
	    */
	public CRUD2List stopAutoRefreshWhen(Object value) {
		return (CRUD2List) this.set("stopAutoRefreshWhen", value);
	}
	
	/**
	 * 是否显示底部
    */
	public CRUD2List showFooter(Object value) {
		return (CRUD2List) this.set("showFooter", value);
	}
	
	/**
	 * 事件动作配置
    */
	public CRUD2List onEvent(Object value) {
		return (CRUD2List) this.set("onEvent", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public CRUD2List staticLabelClassName(Object value) {
		return (CRUD2List) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 底部区域CSS类名
    */
	public CRUD2List footerToolbarClassName(Object value) {
		return (CRUD2List) this.set("footerToolbarClassName", value);
	}
	
	/**
	 * 是否固底
    */
	public CRUD2List affixFooter(Object value) {
		return (CRUD2List) this.set("affixFooter", value);
	}
	
	/**
	 * 是否显示
    */
	public CRUD2List visible(Object value) {
		return (CRUD2List) this.set("visible", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public CRUD2List id(Object value) {
		return (CRUD2List) this.set("id", value);
	}
	
	/**
	 * 是否静态展示
    */
	public CRUD2List static_(Object value) {
		return (CRUD2List) this.set("static_", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public CRUD2List staticPlaceholder(Object value) {
		return (CRUD2List) this.set("staticPlaceholder", value);
	}
	
	/**
	    */
	public CRUD2List staticSchema(Object value) {
		return (CRUD2List) this.set("staticSchema", value);
	}
	
	/**
	 * 数据展示模式 无限加载 or 分页
    * 可选值: more | pagination
    */
	public CRUD2List loadType(Object value) {
		return (CRUD2List) this.set("loadType", value);
	}
	
	/**
	 * 顶部区域
    */
	public CRUD2List header(Object value) {
		return (CRUD2List) this.set("header", value);
	}
	}