package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class CRUDList extends BaseRenderer {

	public CRUDList() {
		this.set("type", "cRUDList");
	}

	public CRUDList set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 顶部区域
    */
	public CRUDList header(Object value) {
		return (CRUDList) this.set("header", value);
	}
	
	/**
	 * 点击列表单行时，是否选择
    */
	public CRUDList checkOnItemClick(Object value) {
		return (CRUDList) this.set("checkOnItemClick", value);
	}
	
	/**
	 * 是否禁用
    */
	public CRUDList disabled(Object value) {
		return (CRUDList) this.set("disabled", value);
	}
	
	/**
	 * 批量操作
    */
	public CRUDList bulkActions(Object value) {
		return (CRUDList) this.set("bulkActions", value);
	}
	
	/**
	 * 设置分页方向的字段名。单位简单分页时清楚时向前还是向后翻页。
    */
	public CRUDList pageDirectionField(Object value) {
		return (CRUDList) this.set("pageDirectionField", value);
	}
	
	/**
	 * 开启查询区域，会根据列元素的searchable属性值，自动生成查询条件表单
    */
	public CRUDList autoGenerateFilter(Object value) {
		return (CRUDList) this.set("autoGenerateFilter", value);
	}
	
	/**
	 * 底部区域
    */
	public CRUDList footer(Object value) {
		return (CRUDList) this.set("footer", value);
	}
	
	/**
	 * 是否显示底部
    */
	public CRUDList showFooter(Object value) {
		return (CRUDList) this.set("showFooter", value);
	}
	
	/**
	 * 无数据提示
    */
	public CRUDList placeholder(Object value) {
		return (CRUDList) this.set("placeholder", value);
	}
	
	/**
	 * 是否静态展示
    */
	public CRUDList static_(Object value) {
		return (CRUDList) this.set("static_", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public CRUDList editorSetting(Object value) {
		return (CRUDList) this.set("editorSetting", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public CRUDList useMobileUI(Object value) {
		return (CRUDList) this.set("useMobileUI", value);
	}
	
	/**
	 * 是否可通过拖拽排序
    */
	public CRUDList draggable(Object value) {
		return (CRUDList) this.set("draggable", value);
	}
	
	/**
	    */
	public CRUDList name(Object value) {
		return (CRUDList) this.set("name", value);
	}
	
	/**
	    */
	public CRUDList stopAutoRefreshWhenModalIsOpen(Object value) {
		return (CRUDList) this.set("stopAutoRefreshWhenModalIsOpen", value);
	}
	
	/**
	 * 也可以直接从环境变量中读取，但是不太推荐。
    */
	public CRUDList source(Object value) {
		return (CRUDList) this.set("source", value);
	}
	
	/**
	 * 是否显示头部
    */
	public CRUDList showHeader(Object value) {
		return (CRUDList) this.set("showHeader", value);
	}
	
	/**
	 * 是否固顶
    */
	public CRUDList affixHeader(Object value) {
		return (CRUDList) this.set("affixHeader", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public CRUDList staticLabelClassName(Object value) {
		return (CRUDList) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 保存排序的 api
    */
	public CRUDList saveOrderApi(Object value) {
		return (CRUDList) this.set("saveOrderApi", value);
	}
	
	/**
	 * 是否将过滤条件的参数同步到地址栏,默认为true
    */
	public CRUDList syncLocation(Object value) {
		return (CRUDList) this.set("syncLocation", value);
	}
	
	/**
	 * 是否隐藏快速编辑的按钮。
    */
	public CRUDList hideQuickSaveBtn(Object value) {
		return (CRUDList) this.set("hideQuickSaveBtn", value);
	}
	
	/**
	 * 静默拉取
    */
	public CRUDList silentPolling(Object value) {
		return (CRUDList) this.set("silentPolling", value);
	}
	
	/**
	 * 内容区域占满屏幕剩余空间
    */
	public CRUDList autoFillHeight(Object value) {
		return (CRUDList) this.set("autoFillHeight", value);
	}
	
	/**
	 * 是否开启Query信息转换，开启后将会对url中的Query进行转换，默认开启，默认仅转化布尔值
    */
	public CRUDList parsePrimitiveQuery(Object value) {
		return (CRUDList) this.set("parsePrimitiveQuery", value);
	}
	
	/**
	 * 顶部区域类名
    */
	public CRUDList headerClassName(Object value) {
		return (CRUDList) this.set("headerClassName", value);
	}
	
	/**
	 * 配置某项是否可以点选
    */
	public CRUDList itemCheckableOn(Object value) {
		return (CRUDList) this.set("itemCheckableOn", value);
	}
	
	/**
	 * 是否显示
    */
	public CRUDList visible(Object value) {
		return (CRUDList) this.set("visible", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public CRUDList staticOn(Object value) {
		return (CRUDList) this.set("staticOn", value);
	}
	
	/**
	 * 指定内容区的展示模式。
    */
	public CRUDList mode(Object value) {
		return (CRUDList) this.set("mode", value);
	}
	
	/**
	 * 每页显示多少个空间成员的配置如： [10, 20, 50, 100]。
    */
	public CRUDList perPageAvailable(Object value) {
		return (CRUDList) this.set("perPageAvailable", value);
	}
	
	/**
	 * 当配置 keepItemSelectionOnPageChange 时有用，用来配置已勾选项的文案。
    */
	public CRUDList labelTpl(Object value) {
		return (CRUDList) this.set("labelTpl", value);
	}
	
	/**
	 * 设置分页页码字段名。
    */
	public CRUDList pageField(Object value) {
		return (CRUDList) this.set("pageField", value);
	}
	
	/**
	 * 设置分页一页显示的多少条数据的字段名。
    */
	public CRUDList perPageField(Object value) {
		return (CRUDList) this.set("perPageField", value);
	}
	
	/**
	 * 是否自动跳顶部，当切分页的时候。
    */
	public CRUDList autoJumpToTopOnPagerChange(Object value) {
		return (CRUDList) this.set("autoJumpToTopOnPagerChange", value);
	}
	
	/**
	 * 是否固底
    */
	public CRUDList affixFooter(Object value) {
		return (CRUDList) this.set("affixFooter", value);
	}
	
	/**
	 * 配置某项是否可拖拽排序，前提是要开启拖拽功能
    */
	public CRUDList itemDraggableOn(Object value) {
		return (CRUDList) this.set("itemDraggableOn", value);
	}
	
	/**
	 * 可以用来作为值的字段
    */
	public CRUDList valueField(Object value) {
		return (CRUDList) this.set("valueField", value);
	}
	
	/**
	 * 大小
    * 可选值: sm | base
    */
	public CRUDList size(Object value) {
		return (CRUDList) this.set("size", value);
	}
	
	/**
	 * 是否隐藏
    */
	public CRUDList hidden(Object value) {
		return (CRUDList) this.set("hidden", value);
	}
	
	/**
	    */
	public CRUDList loadingConfig(Object value) {
		return (CRUDList) this.set("loadingConfig", value);
	}
	
	/**
	 * 默认排序字段
    */
	public CRUDList orderBy(Object value) {
		return (CRUDList) this.set("orderBy", value);
	}
	
	/**
	 * 初始是否拉取
    */
	public CRUDList initFetch(Object value) {
		return (CRUDList) this.set("initFetch", value);
	}
	
	/**
	 * 是否将接口返回的内容自动同步到地址栏，前提是开启了同步地址栏。
    */
	public CRUDList syncResponse2Query(Object value) {
		return (CRUDList) this.set("syncResponse2Query", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public CRUDList visibleOn(Object value) {
		return (CRUDList) this.set("visibleOn", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public CRUDList staticClassName(Object value) {
		return (CRUDList) this.set("staticClassName", value);
	}
	
	/**
	 * 每页个数，默认为 10，如果不是请设置。
    */
	public CRUDList perPage(Object value) {
		return (CRUDList) this.set("perPage", value);
	}
	
	/**
	 * 设置自动刷新时间
    */
	public CRUDList interval(Object value) {
		return (CRUDList) this.set("interval", value);
	}
	
	/**
	 * 快速编辑后用来批量保存的 API
    */
	public CRUDList quickSaveApi(Object value) {
		return (CRUDList) this.set("quickSaveApi", value);
	}
	
	/**
	    */
	public CRUDList stopAutoRefreshWhen(Object value) {
		return (CRUDList) this.set("stopAutoRefreshWhen", value);
	}
	
	/**
	 * 默认只有当分页数大于 1 是才显示，如果总是想显示请配置。
    */
	public CRUDList alwaysShowPagination(Object value) {
		return (CRUDList) this.set("alwaysShowPagination", value);
	}
	
	/**
	 * 单条数据展示内容配置
    */
	public CRUDList listItem(Object value) {
		return (CRUDList) this.set("listItem", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public CRUDList disabledOn(Object value) {
		return (CRUDList) this.set("disabledOn", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public CRUDList id(Object value) {
		return (CRUDList) this.set("id", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public CRUDList staticPlaceholder(Object value) {
		return (CRUDList) this.set("staticPlaceholder", value);
	}
	
	/**
	    */
	public CRUDList staticSchema(Object value) {
		return (CRUDList) this.set("staticSchema", value);
	}
	
	/**
	 * 指定为 CRUD 渲染器。
    */
	public CRUDList type(Object value) {
		return (CRUDList) this.set("type", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public CRUDList hiddenOn(Object value) {
		return (CRUDList) this.set("hiddenOn", value);
	}
	
	/**
	 * 事件动作配置
    */
	public CRUDList onEvent(Object value) {
		return (CRUDList) this.set("onEvent", value);
	}
	
	/**
	 * 可以默认给定初始参数如： {\"perPage\": 24}
    */
	public CRUDList defaultParams(Object value) {
		return (CRUDList) this.set("defaultParams", value);
	}
	
	/**
	    */
	public CRUDList filterTogglable(Object value) {
		return (CRUDList) this.set("filterTogglable", value);
	}
	
	/**
	 * 组件样式
    */
	public CRUDList style(Object value) {
		return (CRUDList) this.set("style", value);
	}
	
	/**
	 * 初始化数据 API
    */
	public CRUDList api(Object value) {
		return (CRUDList) this.set("api", value);
	}
	
	/**
	    */
	public CRUDList messages(Object value) {
		return (CRUDList) this.set("messages", value);
	}
	
	/**
	    */
	public CRUDList filterDefaultVisible(Object value) {
		return (CRUDList) this.set("filterDefaultVisible", value);
	}
	
	/**
	 * 如果时内嵌模式，可以通过这个来配置默认的展开选项。
    */
	public CRUDList expandConfig(Object value) {
		return (CRUDList) this.set("expandConfig", value);
	}
	
	/**
	 * 是否隐藏勾选框
    */
	public CRUDList hideCheckToggler(Object value) {
		return (CRUDList) this.set("hideCheckToggler", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public CRUDList staticInputClassName(Object value) {
		return (CRUDList) this.set("staticInputClassName", value);
	}
	
	/**
	 * 设置用来确定位置的字段名，设置后新的顺序将被赋值到该字段中。
    */
	public CRUDList orderField(Object value) {
		return (CRUDList) this.set("orderField", value);
	}
	
	/**
	 * 快速编辑配置成及时保存时使用的 API
    */
	public CRUDList quickSaveItemApi(Object value) {
		return (CRUDList) this.set("quickSaveItemApi", value);
	}
	
	/**
	 * 点击列表项的行为
    */
	public CRUDList itemAction(Object value) {
		return (CRUDList) this.set("itemAction", value);
	}
	
	/**
	 * 是否可通过拖拽排序，通过表达式来配置
    */
	public CRUDList draggableOn(Object value) {
		return (CRUDList) this.set("draggableOn", value);
	}
	
	/**
	 * 初始是否拉取，用表达式来配置。
    */
	public CRUDList initFetchOn(Object value) {
		return (CRUDList) this.set("initFetchOn", value);
	}
	
	/**
	 * 配置内部 DOM 的 className
    */
	public CRUDList innerClassName(Object value) {
		return (CRUDList) this.set("innerClassName", value);
	}
	
	/**
	 * 底部工具栏
    */
	public CRUDList footerToolbar(Object value) {
		return (CRUDList) this.set("footerToolbar", value);
	}
	
	/**
	 * 标题
    */
	public CRUDList title(Object value) {
		return (CRUDList) this.set("title", value);
	}
	
	/**
	 * 懒加载 API，当行数据中用 defer: true 标记了，则其孩子节点将会用这个 API 来拉取数据。
    */
	public CRUDList deferApi(Object value) {
		return (CRUDList) this.set("deferApi", value);
	}
	
	/**
	 * 是否为前端单次加载模式，可以用来实现前端分页。
    */
	public CRUDList loadDataOnce(Object value) {
		return (CRUDList) this.set("loadDataOnce", value);
	}
	
	/**
	 * 底部区域类名
    */
	public CRUDList footerClassName(Object value) {
		return (CRUDList) this.set("footerClassName", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public CRUDList className(Object value) {
		return (CRUDList) this.set("className", value);
	}
	
	/**
	 * 单条操作
    */
	public CRUDList itemActions(Object value) {
		return (CRUDList) this.set("itemActions", value);
	}
	
	/**
	 * 默认排序方向
    * 可选值: asc | desc
    */
	public CRUDList orderDir(Object value) {
		return (CRUDList) this.set("orderDir", value);
	}
	
	/**
	 * 自定义搜索匹配函数，当开启loadDataOnce时，会基于该函数计算的匹配结果进行过滤，主要用于处理列字段类型较为复杂或者字段值格式和后端返回不一致的场景
    */
	public CRUDList matchFunc(Object value) {
		return (CRUDList) this.set("matchFunc", value);
	}
	
	/**
	 * 过滤器表单
    */
	public CRUDList filter(Object value) {
		return (CRUDList) this.set("filter", value);
	}
	
	/**
	 * 顶部工具栏
    */
	public CRUDList headerToolbar(Object value) {
		return (CRUDList) this.set("headerToolbar", value);
	}
	
	/**
	 * 分页的时候是否保留用户选择。
    */
	public CRUDList keepItemSelectionOnPageChange(Object value) {
		return (CRUDList) this.set("keepItemSelectionOnPageChange", value);
	}
	
	/**
	 * 在开启loadDataOnce时，当修改过滤条件时是否重新请求api如果没有配置，当查询条件表单触发的会重新请求 api，当是列过滤或者是 search-box 触发的则不重新请求 api 如果配置为 true，则不管是什么触发都会重新请求 api 如果配置为 false 则不管是什么触发都不会重新请求 api
    */
	public CRUDList loadDataOnceFetchOnFilter(Object value) {
		return (CRUDList) this.set("loadDataOnceFetchOnFilter", value);
	}
	}