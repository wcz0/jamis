package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class CRUDTable extends BaseRenderer {

	public CRUDTable() {
		this.set("type", "cRUDTable");
	}

	public CRUDTable set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 设置分页方向的字段名。单位简单分页时清楚时向前还是向后翻页。
    */
	public CRUDTable pageDirectionField(Object value) {
		return (CRUDTable) this.set("pageDirectionField", value);
	}
	
	/**
	 * 顶部工具栏
    */
	public CRUDTable headerToolbar(Object value) {
		return (CRUDTable) this.set("headerToolbar", value);
	}
	
	/**
	 * 表格 CSS 类名
    */
	public CRUDTable tableClassName(Object value) {
		return (CRUDTable) this.set("tableClassName", value);
	}
	
	/**
	 * 开启查询区域，会根据列元素的searchable属性值，自动生成查询条件表单
    */
	public CRUDTable autoGenerateFilter(Object value) {
		return (CRUDTable) this.set("autoGenerateFilter", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public CRUDTable disabledOn(Object value) {
		return (CRUDTable) this.set("disabledOn", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public CRUDTable staticPlaceholder(Object value) {
		return (CRUDTable) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 每页个数，默认为 10，如果不是请设置。
    */
	public CRUDTable perPage(Object value) {
		return (CRUDTable) this.set("perPage", value);
	}
	
	/**
	 * 是否可通过拖拽排序
    */
	public CRUDTable draggable(Object value) {
		return (CRUDTable) this.set("draggable", value);
	}
	
	/**
	    */
	public CRUDTable filterTogglable(Object value) {
		return (CRUDTable) this.set("filterTogglable", value);
	}
	
	/**
	 * 当配置 keepItemSelectionOnPageChange 时有用，用来配置已勾选项的文案。
    */
	public CRUDTable labelTpl(Object value) {
		return (CRUDTable) this.set("labelTpl", value);
	}
	
	/**
	 * 自定义搜索匹配函数，当开启loadDataOnce时，会基于该函数计算的匹配结果进行过滤，主要用于处理列字段类型较为复杂或者字段值格式和后端返回不一致的场景
    */
	public CRUDTable matchFunc(Object value) {
		return (CRUDTable) this.set("matchFunc", value);
	}
	
	/**
	 * 表格是否可以获取父级数据域值，默认为false
    */
	public CRUDTable canAccessSuperData(Object value) {
		return (CRUDTable) this.set("canAccessSuperData", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public CRUDTable staticInputClassName(Object value) {
		return (CRUDTable) this.set("staticInputClassName", value);
	}
	
	/**
	 * 配置内部 DOM 的 className
    */
	public CRUDTable innerClassName(Object value) {
		return (CRUDTable) this.set("innerClassName", value);
	}
	
	/**
	 * 设置分页页码字段名。
    */
	public CRUDTable pageField(Object value) {
		return (CRUDTable) this.set("pageField", value);
	}
	
	/**
	 * 静默拉取
    */
	public CRUDTable silentPolling(Object value) {
		return (CRUDTable) this.set("silentPolling", value);
	}
	
	/**
	 * 是否为前端单次加载模式，可以用来实现前端分页。
    */
	public CRUDTable loadDataOnce(Object value) {
		return (CRUDTable) this.set("loadDataOnce", value);
	}
	
	/**
	 * 工具栏 CSS 类名
    */
	public CRUDTable toolbarClassName(Object value) {
		return (CRUDTable) this.set("toolbarClassName", value);
	}
	
	/**
	 * 行样式表表达式
    */
	public CRUDTable rowClassNameExpr(Object value) {
		return (CRUDTable) this.set("rowClassNameExpr", value);
	}
	
	/**
	    */
	public CRUDTable loadingConfig(Object value) {
		return (CRUDTable) this.set("loadingConfig", value);
	}
	
	/**
	 * 过滤器表单
    */
	public CRUDTable filter(Object value) {
		return (CRUDTable) this.set("filter", value);
	}
	
	/**
	 * 快速编辑后用来批量保存的 API
    */
	public CRUDTable quickSaveApi(Object value) {
		return (CRUDTable) this.set("quickSaveApi", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public CRUDTable className(Object value) {
		return (CRUDTable) this.set("className", value);
	}
	
	/**
	 * 初始化数据 API
    */
	public CRUDTable api(Object value) {
		return (CRUDTable) this.set("api", value);
	}
	
	/**
	 * 单条操作
    */
	public CRUDTable itemActions(Object value) {
		return (CRUDTable) this.set("itemActions", value);
	}
	
	/**
	 * 默认排序方向
    * 可选值: asc | desc
    */
	public CRUDTable orderDir(Object value) {
		return (CRUDTable) this.set("orderDir", value);
	}
	
	/**
	    */
	public CRUDTable name(Object value) {
		return (CRUDTable) this.set("name", value);
	}
	
	/**
	 * 是否自动跳顶部，当切分页的时候。
    */
	public CRUDTable autoJumpToTopOnPagerChange(Object value) {
		return (CRUDTable) this.set("autoJumpToTopOnPagerChange", value);
	}
	
	/**
	 * 表格的列信息
    */
	public CRUDTable columns(Object value) {
		return (CRUDTable) this.set("columns", value);
	}
	
	/**
	 * 是否显示底部
    */
	public CRUDTable showFooter(Object value) {
		return (CRUDTable) this.set("showFooter", value);
	}
	
	/**
	 * 是否显示头部
    */
	public CRUDTable showHeader(Object value) {
		return (CRUDTable) this.set("showHeader", value);
	}
	
	/**
	 * 合并单元格配置，配置数字表示从左到右的多少列自动合并单元格。
    */
	public CRUDTable combineNum(Object value) {
		return (CRUDTable) this.set("combineNum", value);
	}
	
	/**
	 * 是否固底
    */
	public CRUDTable affixFooter(Object value) {
		return (CRUDTable) this.set("affixFooter", value);
	}
	
	/**
	 * 标题
    */
	public CRUDTable title(Object value) {
		return (CRUDTable) this.set("title", value);
	}
	
	/**
	 * 合并单元格配置，配置从第几列开始合并。
    */
	public CRUDTable combineFromIndex(Object value) {
		return (CRUDTable) this.set("combineFromIndex", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public CRUDTable staticOn(Object value) {
		return (CRUDTable) this.set("staticOn", value);
	}
	
	/**
	 * 指定为 CRUD 渲染器。
    */
	public CRUDTable type(Object value) {
		return (CRUDTable) this.set("type", value);
	}
	
	/**
	 * 保存排序的 api
    */
	public CRUDTable saveOrderApi(Object value) {
		return (CRUDTable) this.set("saveOrderApi", value);
	}
	
	/**
	 * 是否将接口返回的内容自动同步到地址栏，前提是开启了同步地址栏。
    */
	public CRUDTable syncResponse2Query(Object value) {
		return (CRUDTable) this.set("syncResponse2Query", value);
	}
	
	/**
	 * 底部外层 CSS 类名
    */
	public CRUDTable footerClassName(Object value) {
		return (CRUDTable) this.set("footerClassName", value);
	}
	
	/**
	 * 是否禁用
    */
	public CRUDTable disabled(Object value) {
		return (CRUDTable) this.set("disabled", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public CRUDTable id(Object value) {
		return (CRUDTable) this.set("id", value);
	}
	
	/**
	 * 事件动作配置
    */
	public CRUDTable onEvent(Object value) {
		return (CRUDTable) this.set("onEvent", value);
	}
	
	/**
	 * 可以默认给定初始参数如： {\"perPage\": 24}
    */
	public CRUDTable defaultParams(Object value) {
		return (CRUDTable) this.set("defaultParams", value);
	}
	
	/**
	 * 是否可通过拖拽排序，通过表达式来配置
    */
	public CRUDTable draggableOn(Object value) {
		return (CRUDTable) this.set("draggableOn", value);
	}
	
	/**
	 * 顶部外层 CSS 类名
    */
	public CRUDTable headerClassName(Object value) {
		return (CRUDTable) this.set("headerClassName", value);
	}
	
	/**
	    */
	public CRUDTable filterDefaultVisible(Object value) {
		return (CRUDTable) this.set("filterDefaultVisible", value);
	}
	
	/**
	 * 设置分页一页显示的多少条数据的字段名。
    */
	public CRUDTable perPageField(Object value) {
		return (CRUDTable) this.set("perPageField", value);
	}
	
	/**
	 * 如果时内嵌模式，可以通过这个来配置默认的展开选项。
    */
	public CRUDTable expandConfig(Object value) {
		return (CRUDTable) this.set("expandConfig", value);
	}
	
	/**
	 * 底部总结行
    */
	public CRUDTable affixRow(Object value) {
		return (CRUDTable) this.set("affixRow", value);
	}
	
	/**
	 * 行角标
    */
	public CRUDTable itemBadge(Object value) {
		return (CRUDTable) this.set("itemBadge", value);
	}
	
	/**
	 * 懒加载 API，当行数据中用 defer: true 标记了，则其孩子节点将会用这个 API 来拉取数据。
    */
	public CRUDTable deferApi(Object value) {
		return (CRUDTable) this.set("deferApi", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public CRUDTable hiddenOn(Object value) {
		return (CRUDTable) this.set("hiddenOn", value);
	}
	
	/**
	 * 指定内容区的展示模式。
    */
	public CRUDTable mode(Object value) {
		return (CRUDTable) this.set("mode", value);
	}
	
	/**
	 * 设置自动刷新时间
    */
	public CRUDTable interval(Object value) {
		return (CRUDTable) this.set("interval", value);
	}
	
	/**
	 * table layout
    * 可选值: fixed | auto
    */
	public CRUDTable tableLayout(Object value) {
		return (CRUDTable) this.set("tableLayout", value);
	}
	
	/**
	 * 是否隐藏
    */
	public CRUDTable hidden(Object value) {
		return (CRUDTable) this.set("hidden", value);
	}
	
	/**
	 * 快速编辑配置成及时保存时使用的 API
    */
	public CRUDTable quickSaveItemApi(Object value) {
		return (CRUDTable) this.set("quickSaveItemApi", value);
	}
	
	/**
	 * 是否可调整列宽
    */
	public CRUDTable resizable(Object value) {
		return (CRUDTable) this.set("resizable", value);
	}
	
	/**
	 * 组件样式
    */
	public CRUDTable style(Object value) {
		return (CRUDTable) this.set("style", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public CRUDTable editorSetting(Object value) {
		return (CRUDTable) this.set("editorSetting", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public CRUDTable useMobileUI(Object value) {
		return (CRUDTable) this.set("useMobileUI", value);
	}
	
	/**
	 * 批量操作
    */
	public CRUDTable bulkActions(Object value) {
		return (CRUDTable) this.set("bulkActions", value);
	}
	
	/**
	 * 是否将过滤条件的参数同步到地址栏,默认为true
    */
	public CRUDTable syncLocation(Object value) {
		return (CRUDTable) this.set("syncLocation", value);
	}
	
	/**
	 * 是否固定表头
    */
	public CRUDTable affixHeader(Object value) {
		return (CRUDTable) this.set("affixHeader", value);
	}
	
	/**
	 * 顶部总结行
    */
	public CRUDTable prefixRow(Object value) {
		return (CRUDTable) this.set("prefixRow", value);
	}
	
	/**
	 * 内容区域占满屏幕剩余空间
    */
	public CRUDTable autoFillHeight(Object value) {
		return (CRUDTable) this.set("autoFillHeight", value);
	}
	
	/**
	 * 是否静态展示
    */
	public CRUDTable static_(Object value) {
		return (CRUDTable) this.set("static_", value);
	}
	
	/**
	 * 默认排序字段
    */
	public CRUDTable orderBy(Object value) {
		return (CRUDTable) this.set("orderBy", value);
	}
	
	/**
	 * 初始是否拉取，用表达式来配置。
    */
	public CRUDTable initFetchOn(Object value) {
		return (CRUDTable) this.set("initFetchOn", value);
	}
	
	/**
	 * 在开启loadDataOnce时，当修改过滤条件时是否重新请求api如果没有配置，当查询条件表单触发的会重新请求 api，当是列过滤或者是 search-box 触发的则不重新请求 api 如果配置为 true，则不管是什么触发都会重新请求 api 如果配置为 false 则不管是什么触发都不会重新请求 api
    */
	public CRUDTable loadDataOnceFetchOnFilter(Object value) {
		return (CRUDTable) this.set("loadDataOnceFetchOnFilter", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public CRUDTable visibleOn(Object value) {
		return (CRUDTable) this.set("visibleOn", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public CRUDTable staticClassName(Object value) {
		return (CRUDTable) this.set("staticClassName", value);
	}
	
	/**
	    */
	public CRUDTable staticSchema(Object value) {
		return (CRUDTable) this.set("staticSchema", value);
	}
	
	/**
	 * 底部工具栏
    */
	public CRUDTable footerToolbar(Object value) {
		return (CRUDTable) this.set("footerToolbar", value);
	}
	
	/**
	 * 是否隐藏快速编辑的按钮。
    */
	public CRUDTable hideQuickSaveBtn(Object value) {
		return (CRUDTable) this.set("hideQuickSaveBtn", value);
	}
	
	/**
	    */
	public CRUDTable stopAutoRefreshWhenModalIsOpen(Object value) {
		return (CRUDTable) this.set("stopAutoRefreshWhenModalIsOpen", value);
	}
	
	/**
	 * 占位符
    */
	public CRUDTable placeholder(Object value) {
		return (CRUDTable) this.set("placeholder", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public CRUDTable staticLabelClassName(Object value) {
		return (CRUDTable) this.set("staticLabelClassName", value);
	}
	
	/**
	    */
	public CRUDTable messages(Object value) {
		return (CRUDTable) this.set("messages", value);
	}
	
	/**
	    */
	public CRUDTable stopAutoRefreshWhen(Object value) {
		return (CRUDTable) this.set("stopAutoRefreshWhen", value);
	}
	
	/**
	 * 默认只有当分页数大于 1 是才显示，如果总是想显示请配置。
    */
	public CRUDTable alwaysShowPagination(Object value) {
		return (CRUDTable) this.set("alwaysShowPagination", value);
	}
	
	/**
	 * 展示列显示开关，自动即：列数量大于或等于5个时自动开启
    */
	public CRUDTable columnsTogglable(Object value) {
		return (CRUDTable) this.set("columnsTogglable", value);
	}
	
	/**
	 * 也可以直接从环境变量中读取，但是不太推荐。
    */
	public CRUDTable source(Object value) {
		return (CRUDTable) this.set("source", value);
	}
	
	/**
	 * 初始是否拉取
    */
	public CRUDTable initFetch(Object value) {
		return (CRUDTable) this.set("initFetch", value);
	}
	
	/**
	 * 每页显示多少个空间成员的配置如： [10, 20, 50, 100]。
    */
	public CRUDTable perPageAvailable(Object value) {
		return (CRUDTable) this.set("perPageAvailable", value);
	}
	
	/**
	 * 分页的时候是否保留用户选择。
    */
	public CRUDTable keepItemSelectionOnPageChange(Object value) {
		return (CRUDTable) this.set("keepItemSelectionOnPageChange", value);
	}
	
	/**
	 * 是否开启底部展示功能，适合移动端展示
    */
	public CRUDTable footable(Object value) {
		return (CRUDTable) this.set("footable", value);
	}
	
	/**
	 * 是否显示
    */
	public CRUDTable visible(Object value) {
		return (CRUDTable) this.set("visible", value);
	}
	
	/**
	 * 设置用来确定位置的字段名，设置后新的顺序将被赋值到该字段中。
    */
	public CRUDTable orderField(Object value) {
		return (CRUDTable) this.set("orderField", value);
	}
	
	/**
	 * 是否开启Query信息转换，开启后将会对url中的Query进行转换，默认开启，默认仅转化布尔值
    */
	public CRUDTable parsePrimitiveQuery(Object value) {
		return (CRUDTable) this.set("parsePrimitiveQuery", value);
	}
	
	/**
	 * 设置数据
    */
	public CRUDTable data(Object value) {
		return (CRUDTable) this.set("data", value);
	}
	}