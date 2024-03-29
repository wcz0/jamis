package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class CRUDCards extends BaseRenderer {

	public CRUDCards() {
		this.set("type", "cRUDCards");
	}

	public CRUDCards set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 也可以直接从环境变量中读取，但是不太推荐。
    */
	public CRUDCards source(Object value) {
		return (CRUDCards) this.set("source", value);
	}
	
	/**
	 * 单条操作
    */
	public CRUDCards itemActions(Object value) {
		return (CRUDCards) this.set("itemActions", value);
	}
	
	/**
	 * 底部工具栏
    */
	public CRUDCards footerToolbar(Object value) {
		return (CRUDCards) this.set("footerToolbar", value);
	}
	
	/**
	 * 是否自动跳顶部，当切分页的时候。
    */
	public CRUDCards autoJumpToTopOnPagerChange(Object value) {
		return (CRUDCards) this.set("autoJumpToTopOnPagerChange", value);
	}
	
	/**
	    */
	public CRUDCards filterDefaultVisible(Object value) {
		return (CRUDCards) this.set("filterDefaultVisible", value);
	}
	
	/**
	 * 是否为前端单次加载模式，可以用来实现前端分页。
    */
	public CRUDCards loadDataOnce(Object value) {
		return (CRUDCards) this.set("loadDataOnce", value);
	}
	
	/**
	 * 是否固底
    */
	public CRUDCards affixFooter(Object value) {
		return (CRUDCards) this.set("affixFooter", value);
	}
	
	/**
	 * 配置某项是否可以点选
    */
	public CRUDCards itemCheckableOn(Object value) {
		return (CRUDCards) this.set("itemCheckableOn", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public CRUDCards className(Object value) {
		return (CRUDCards) this.set("className", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public CRUDCards staticOn(Object value) {
		return (CRUDCards) this.set("staticOn", value);
	}
	
	/**
	 * 初始化数据 API
    */
	public CRUDCards api(Object value) {
		return (CRUDCards) this.set("api", value);
	}
	
	/**
	 * 快速编辑后用来批量保存的 API
    */
	public CRUDCards quickSaveApi(Object value) {
		return (CRUDCards) this.set("quickSaveApi", value);
	}
	
	/**
	 * 设置分页方向的字段名。单位简单分页时清楚时向前还是向后翻页。
    */
	public CRUDCards pageDirectionField(Object value) {
		return (CRUDCards) this.set("pageDirectionField", value);
	}
	
	/**
	 * 卡片 CSS 类名
    */
	public CRUDCards itemClassName(Object value) {
		return (CRUDCards) this.set("itemClassName", value);
	}
	
	/**
	 * 底部区域
    */
	public CRUDCards footer(Object value) {
		return (CRUDCards) this.set("footer", value);
	}
	
	/**
	 * 配置某项是否可拖拽排序，前提是要开启拖拽功能
    */
	public CRUDCards itemDraggableOn(Object value) {
		return (CRUDCards) this.set("itemDraggableOn", value);
	}
	
	/**
	 * 是否静态展示
    */
	public CRUDCards static_(Object value) {
		return (CRUDCards) this.set("static_", value);
	}
	
	/**
	 * 懒加载 API，当行数据中用 defer: true 标记了，则其孩子节点将会用这个 API 来拉取数据。
    */
	public CRUDCards deferApi(Object value) {
		return (CRUDCards) this.set("deferApi", value);
	}
	
	/**
	 * 是否可通过拖拽排序，通过表达式来配置
    */
	public CRUDCards draggableOn(Object value) {
		return (CRUDCards) this.set("draggableOn", value);
	}
	
	/**
	    */
	public CRUDCards card(Object value) {
		return (CRUDCards) this.set("card", value);
	}
	
	/**
	 * 顶部区域
    */
	public CRUDCards header(Object value) {
		return (CRUDCards) this.set("header", value);
	}
	
	/**
	 * 组件样式
    */
	public CRUDCards style(Object value) {
		return (CRUDCards) this.set("style", value);
	}
	
	/**
	 * 指定内容区的展示模式。
    */
	public CRUDCards mode(Object value) {
		return (CRUDCards) this.set("mode", value);
	}
	
	/**
	 * 分页的时候是否保留用户选择。
    */
	public CRUDCards keepItemSelectionOnPageChange(Object value) {
		return (CRUDCards) this.set("keepItemSelectionOnPageChange", value);
	}
	
	/**
	 * 内容区域占满屏幕剩余空间
    */
	public CRUDCards autoFillHeight(Object value) {
		return (CRUDCards) this.set("autoFillHeight", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public CRUDCards disabledOn(Object value) {
		return (CRUDCards) this.set("disabledOn", value);
	}
	
	/**
	 * 事件动作配置
    */
	public CRUDCards onEvent(Object value) {
		return (CRUDCards) this.set("onEvent", value);
	}
	
	/**
	 * 指定为 CRUD 渲染器。
    */
	public CRUDCards type(Object value) {
		return (CRUDCards) this.set("type", value);
	}
	
	/**
	 * 是否将过滤条件的参数同步到地址栏,默认为true
    */
	public CRUDCards syncLocation(Object value) {
		return (CRUDCards) this.set("syncLocation", value);
	}
	
	/**
	 * 是否隐藏快速编辑的按钮。
    */
	public CRUDCards hideQuickSaveBtn(Object value) {
		return (CRUDCards) this.set("hideQuickSaveBtn", value);
	}
	
	/**
	    */
	public CRUDCards stopAutoRefreshWhen(Object value) {
		return (CRUDCards) this.set("stopAutoRefreshWhen", value);
	}
	
	/**
	 * 头部 CSS 类名
    */
	public CRUDCards headerClassName(Object value) {
		return (CRUDCards) this.set("headerClassName", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public CRUDCards visibleOn(Object value) {
		return (CRUDCards) this.set("visibleOn", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public CRUDCards useMobileUI(Object value) {
		return (CRUDCards) this.set("useMobileUI", value);
	}
	
	/**
	 * 自定义搜索匹配函数，当开启loadDataOnce时，会基于该函数计算的匹配结果进行过滤，主要用于处理列字段类型较为复杂或者字段值格式和后端返回不一致的场景
    */
	public CRUDCards matchFunc(Object value) {
		return (CRUDCards) this.set("matchFunc", value);
	}
	
	/**
	    */
	public CRUDCards filterTogglable(Object value) {
		return (CRUDCards) this.set("filterTogglable", value);
	}
	
	/**
	 * 是否将接口返回的内容自动同步到地址栏，前提是开启了同步地址栏。
    */
	public CRUDCards syncResponse2Query(Object value) {
		return (CRUDCards) this.set("syncResponse2Query", value);
	}
	
	/**
	 * 批量操作
    */
	public CRUDCards bulkActions(Object value) {
		return (CRUDCards) this.set("bulkActions", value);
	}
	
	/**
	 * 可以默认给定初始参数如： {\"perPage\": 24}
    */
	public CRUDCards defaultParams(Object value) {
		return (CRUDCards) this.set("defaultParams", value);
	}
	
	/**
	 * 是否可通过拖拽排序
    */
	public CRUDCards draggable(Object value) {
		return (CRUDCards) this.set("draggable", value);
	}
	
	/**
	 * 初始是否拉取，用表达式来配置。
    */
	public CRUDCards initFetchOn(Object value) {
		return (CRUDCards) this.set("initFetchOn", value);
	}
	
	/**
	 * 配置内部 DOM 的 className
    */
	public CRUDCards innerClassName(Object value) {
		return (CRUDCards) this.set("innerClassName", value);
	}
	
	/**
	 * 快速编辑配置成及时保存时使用的 API
    */
	public CRUDCards quickSaveItemApi(Object value) {
		return (CRUDCards) this.set("quickSaveItemApi", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public CRUDCards staticLabelClassName(Object value) {
		return (CRUDCards) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 设置自动刷新时间
    */
	public CRUDCards interval(Object value) {
		return (CRUDCards) this.set("interval", value);
	}
	
	/**
	 * 设置用来确定位置的字段名，设置后新的顺序将被赋值到该字段中。
    */
	public CRUDCards orderField(Object value) {
		return (CRUDCards) this.set("orderField", value);
	}
	
	/**
	 * 静默拉取
    */
	public CRUDCards silentPolling(Object value) {
		return (CRUDCards) this.set("silentPolling", value);
	}
	
	/**
	 * 无数据提示
    */
	public CRUDCards placeholder(Object value) {
		return (CRUDCards) this.set("placeholder", value);
	}
	
	/**
	 * 是否显示底部
    */
	public CRUDCards showFooter(Object value) {
		return (CRUDCards) this.set("showFooter", value);
	}
	
	/**
	 * 每页个数，默认为 10，如果不是请设置。
    */
	public CRUDCards perPage(Object value) {
		return (CRUDCards) this.set("perPage", value);
	}
	
	/**
	    */
	public CRUDCards messages(Object value) {
		return (CRUDCards) this.set("messages", value);
	}
	
	/**
	 * 是否显示头部
    */
	public CRUDCards showHeader(Object value) {
		return (CRUDCards) this.set("showHeader", value);
	}
	
	/**
	 * 标题
    */
	public CRUDCards title(Object value) {
		return (CRUDCards) this.set("title", value);
	}
	
	/**
	 * 是否禁用
    */
	public CRUDCards disabled(Object value) {
		return (CRUDCards) this.set("disabled", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public CRUDCards staticClassName(Object value) {
		return (CRUDCards) this.set("staticClassName", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public CRUDCards staticInputClassName(Object value) {
		return (CRUDCards) this.set("staticInputClassName", value);
	}
	
	/**
	 * 设置分页页码字段名。
    */
	public CRUDCards pageField(Object value) {
		return (CRUDCards) this.set("pageField", value);
	}
	
	/**
	    */
	public CRUDCards staticSchema(Object value) {
		return (CRUDCards) this.set("staticSchema", value);
	}
	
	/**
	    */
	public CRUDCards name(Object value) {
		return (CRUDCards) this.set("name", value);
	}
	
	/**
	 * 默认只有当分页数大于 1 是才显示，如果总是想显示请配置。
    */
	public CRUDCards alwaysShowPagination(Object value) {
		return (CRUDCards) this.set("alwaysShowPagination", value);
	}
	
	/**
	 * 底部 CSS 类名
    */
	public CRUDCards footerClassName(Object value) {
		return (CRUDCards) this.set("footerClassName", value);
	}
	
	/**
	 * 是否隐藏勾选框
    */
	public CRUDCards hideCheckToggler(Object value) {
		return (CRUDCards) this.set("hideCheckToggler", value);
	}
	
	/**
	 * 可以用来作为值的字段
    */
	public CRUDCards valueField(Object value) {
		return (CRUDCards) this.set("valueField", value);
	}
	
	/**
	 * 默认排序字段
    */
	public CRUDCards orderBy(Object value) {
		return (CRUDCards) this.set("orderBy", value);
	}
	
	/**
	 * 在开启loadDataOnce时，当修改过滤条件时是否重新请求api如果没有配置，当查询条件表单触发的会重新请求 api，当是列过滤或者是 search-box 触发的则不重新请求 api 如果配置为 true，则不管是什么触发都会重新请求 api 如果配置为 false 则不管是什么触发都不会重新请求 api
    */
	public CRUDCards loadDataOnceFetchOnFilter(Object value) {
		return (CRUDCards) this.set("loadDataOnceFetchOnFilter", value);
	}
	
	/**
	 * 是否为瀑布流布局？
    */
	public CRUDCards masonryLayout(Object value) {
		return (CRUDCards) this.set("masonryLayout", value);
	}
	
	/**
	 * 是否隐藏
    */
	public CRUDCards hidden(Object value) {
		return (CRUDCards) this.set("hidden", value);
	}
	
	/**
	 * 是否显示
    */
	public CRUDCards visible(Object value) {
		return (CRUDCards) this.set("visible", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public CRUDCards staticPlaceholder(Object value) {
		return (CRUDCards) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 设置分页一页显示的多少条数据的字段名。
    */
	public CRUDCards perPageField(Object value) {
		return (CRUDCards) this.set("perPageField", value);
	}
	
	/**
	 * 当配置 keepItemSelectionOnPageChange 时有用，用来配置已勾选项的文案。
    */
	public CRUDCards labelTpl(Object value) {
		return (CRUDCards) this.set("labelTpl", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public CRUDCards hiddenOn(Object value) {
		return (CRUDCards) this.set("hiddenOn", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public CRUDCards id(Object value) {
		return (CRUDCards) this.set("id", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public CRUDCards editorSetting(Object value) {
		return (CRUDCards) this.set("editorSetting", value);
	}
	
	/**
	 * 过滤器表单
    */
	public CRUDCards filter(Object value) {
		return (CRUDCards) this.set("filter", value);
	}
	
	/**
	 * 保存排序的 api
    */
	public CRUDCards saveOrderApi(Object value) {
		return (CRUDCards) this.set("saveOrderApi", value);
	}
	
	/**
	    */
	public CRUDCards stopAutoRefreshWhenModalIsOpen(Object value) {
		return (CRUDCards) this.set("stopAutoRefreshWhenModalIsOpen", value);
	}
	
	/**
	 * 点击卡片的时候是否勾选卡片。
    */
	public CRUDCards checkOnItemClick(Object value) {
		return (CRUDCards) this.set("checkOnItemClick", value);
	}
	
	/**
	 * 顶部工具栏
    */
	public CRUDCards headerToolbar(Object value) {
		return (CRUDCards) this.set("headerToolbar", value);
	}
	
	/**
	 * 每页显示多少个空间成员的配置如： [10, 20, 50, 100]。
    */
	public CRUDCards perPageAvailable(Object value) {
		return (CRUDCards) this.set("perPageAvailable", value);
	}
	
	/**
	 * 如果时内嵌模式，可以通过这个来配置默认的展开选项。
    */
	public CRUDCards expandConfig(Object value) {
		return (CRUDCards) this.set("expandConfig", value);
	}
	
	/**
	 * 开启查询区域，会根据列元素的searchable属性值，自动生成查询条件表单
    */
	public CRUDCards autoGenerateFilter(Object value) {
		return (CRUDCards) this.set("autoGenerateFilter", value);
	}
	
	/**
	 * 是否开启Query信息转换，开启后将会对url中的Query进行转换，默认开启，默认仅转化布尔值
    */
	public CRUDCards parsePrimitiveQuery(Object value) {
		return (CRUDCards) this.set("parsePrimitiveQuery", value);
	}
	
	/**
	 * 是否固顶
    */
	public CRUDCards affixHeader(Object value) {
		return (CRUDCards) this.set("affixHeader", value);
	}
	
	/**
	    */
	public CRUDCards loadingConfig(Object value) {
		return (CRUDCards) this.set("loadingConfig", value);
	}
	
	/**
	 * 默认排序方向
    * 可选值: asc | desc
    */
	public CRUDCards orderDir(Object value) {
		return (CRUDCards) this.set("orderDir", value);
	}
	
	/**
	 * 初始是否拉取
    */
	public CRUDCards initFetch(Object value) {
		return (CRUDCards) this.set("initFetch", value);
	}
	}