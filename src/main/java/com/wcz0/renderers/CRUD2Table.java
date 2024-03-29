package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class CRUD2Table extends BaseRenderer {

	public CRUD2Table() {
		this.set("type", "cRUD2Table");
	}

	public CRUD2Table set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 组件样式
    */
	public CRUD2Table style(Object value) {
		return (CRUD2Table) this.set("style", value);
	}
	
	/**
	 * 数据源嵌套自定义字段名
    */
	public CRUD2Table childrenColumnName(Object value) {
		return (CRUD2Table) this.set("childrenColumnName", value);
	}
	
	/**
	 * 是否固定内容行高度
    */
	public CRUD2Table lineHeight(Object value) {
		return (CRUD2Table) this.set("lineHeight", value);
	}
	
	/**
	 * 批量操作最大限制数
    */
	public CRUD2Table maxKeepItemSelectionLength(Object value) {
		return (CRUD2Table) this.set("maxKeepItemSelectionLength", value);
	}
	
	/**
	 * 内容区域占满屏幕剩余空间
    */
	public CRUD2Table autoFillHeight(Object value) {
		return (CRUD2Table) this.set("autoFillHeight", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public CRUD2Table hiddenOn(Object value) {
		return (CRUD2Table) this.set("hiddenOn", value);
	}
	
	/**
	 * 表格标题
    */
	public CRUD2Table title(Object value) {
		return (CRUD2Table) this.set("title", value);
	}
	
	/**
	 * 是否展示行角标
    */
	public CRUD2Table showBadge(Object value) {
		return (CRUD2Table) this.set("showBadge", value);
	}
	
	/**
	 * 是否可以选择数据，外部事件动作
    */
	public CRUD2Table selectable(Object value) {
		return (CRUD2Table) this.set("selectable", value);
	}
	
	/**
	 * 当一次性渲染太多列上有用，默认为 100，可以用来提升表格渲染性能
    */
	public CRUD2Table lazyRenderAfter(Object value) {
		return (CRUD2Table) this.set("lazyRenderAfter", value);
	}
	
	/**
	 * 事件动作配置
    */
	public CRUD2Table onEvent(Object value) {
		return (CRUD2Table) this.set("onEvent", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public CRUD2Table staticPlaceholder(Object value) {
		return (CRUD2Table) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 是否将过滤条件的参数同步到地址栏,默认为true
    */
	public CRUD2Table syncLocation(Object value) {
		return (CRUD2Table) this.set("syncLocation", value);
	}
	
	/**
	 * 也可以直接从环境变量中读取，但是不太推荐。
    */
	public CRUD2Table source(Object value) {
		return (CRUD2Table) this.set("source", value);
	}
	
	/**
	 * 指定内容区的展示模式。
    */
	public CRUD2Table mode(Object value) {
		return (CRUD2Table) this.set("mode", value);
	}
	
	/**
	    * 可选值: fixed | auto
    */
	public CRUD2Table tableLayout(Object value) {
		return (CRUD2Table) this.set("tableLayout", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public CRUD2Table disabledOn(Object value) {
		return (CRUD2Table) this.set("disabledOn", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public CRUD2Table staticClassName(Object value) {
		return (CRUD2Table) this.set("staticClassName", value);
	}
	
	/**
	 * 设置分页一页显示的多少条数据的字段名。
    */
	public CRUD2Table perPageField(Object value) {
		return (CRUD2Table) this.set("perPageField", value);
	}
	
	/**
	    */
	public CRUD2Table name(Object value) {
		return (CRUD2Table) this.set("name", value);
	}
	
	/**
	 * 接口报错信息配置
    */
	public CRUD2Table messages(Object value) {
		return (CRUD2Table) this.set("messages", value);
	}
	
	/**
	    */
	public CRUD2Table staticSchema(Object value) {
		return (CRUD2Table) this.set("staticSchema", value);
	}
	
	/**
	 * 是否将接口返回的内容自动同步到地址栏，前提是开启了同步地址栏。
    */
	public CRUD2Table syncResponse2Query(Object value) {
		return (CRUD2Table) this.set("syncResponse2Query", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public CRUD2Table id(Object value) {
		return (CRUD2Table) this.set("id", value);
	}
	
	/**
	 * 是否禁用
    */
	public CRUD2Table disabled(Object value) {
		return (CRUD2Table) this.set("disabled", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public CRUD2Table staticOn(Object value) {
		return (CRUD2Table) this.set("staticOn", value);
	}
	
	/**
	 * 指定表尾
    */
	public CRUD2Table footer(Object value) {
		return (CRUD2Table) this.set("footer", value);
	}
	
	/**
	 * 快速编辑后用来批量保存的 API
    */
	public CRUD2Table quickSaveApi(Object value) {
		return (CRUD2Table) this.set("quickSaveApi", value);
	}
	
	/**
	 * 是否展示边框
    */
	public CRUD2Table bordered(Object value) {
		return (CRUD2Table) this.set("bordered", value);
	}
	
	/**
	 * 表格可选择配置
    */
	public CRUD2Table rowSelection(Object value) {
		return (CRUD2Table) this.set("rowSelection", value);
	}
	
	/**
	 * 粘性头部
    */
	public CRUD2Table sticky(Object value) {
		return (CRUD2Table) this.set("sticky", value);
	}
	
	/**
	 * 操作列配置
    */
	public CRUD2Table actions(Object value) {
		return (CRUD2Table) this.set("actions", value);
	}
	
	/**
	 * 是否可以多选数据，仅当selectable为 true 时生效
    */
	public CRUD2Table multiple(Object value) {
		return (CRUD2Table) this.set("multiple", value);
	}
	
	/**
	 * 是否显示
    */
	public CRUD2Table visible(Object value) {
		return (CRUD2Table) this.set("visible", value);
	}
	
	/**
	 * 初始化数据 API
    */
	public CRUD2Table api(Object value) {
		return (CRUD2Table) this.set("api", value);
	}
	
	/**
	 * 是否展示已选数据区域，仅当selectable为 true 时生效
    */
	public CRUD2Table showSelection(Object value) {
		return (CRUD2Table) this.set("showSelection", value);
	}
	
	/**
	 * 表格列配置
    */
	public CRUD2Table columns(Object value) {
		return (CRUD2Table) this.set("columns", value);
	}
	
	/**
	 * 行角标内容
    */
	public CRUD2Table itemBadge(Object value) {
		return (CRUD2Table) this.set("itemBadge", value);
	}
	
	/**
	 * 自定义行样式
    */
	public CRUD2Table rowClassNameExpr(Object value) {
		return (CRUD2Table) this.set("rowClassNameExpr", value);
	}
	
	/**
	 * 是否展示表头
    */
	public CRUD2Table showHeader(Object value) {
		return (CRUD2Table) this.set("showHeader", value);
	}
	
	/**
	 * 重新加载的组件名称
    */
	public CRUD2Table reload(Object value) {
		return (CRUD2Table) this.set("reload", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public CRUD2Table staticInputClassName(Object value) {
		return (CRUD2Table) this.set("staticInputClassName", value);
	}
	
	/**
	 * 是否隐藏快速编辑的按钮。
    */
	public CRUD2Table hideQuickSaveBtn(Object value) {
		return (CRUD2Table) this.set("hideQuickSaveBtn", value);
	}
	
	/**
	 * 是否自动跳顶部，当切分页的时候。
    */
	public CRUD2Table autoJumpToTopOnPagerChange(Object value) {
		return (CRUD2Table) this.set("autoJumpToTopOnPagerChange", value);
	}
	
	/**
	 * 表格可自定义列
    */
	public CRUD2Table columnsTogglable(Object value) {
		return (CRUD2Table) this.set("columnsTogglable", value);
	}
	
	/**
	 * 翻页时是否保留用户已选的数据
    */
	public CRUD2Table keepItemSelectionOnPageChange(Object value) {
		return (CRUD2Table) this.set("keepItemSelectionOnPageChange", value);
	}
	
	/**
	 * 指定为 CRUD2 渲染器。
    */
	public CRUD2Table type(Object value) {
		return (CRUD2Table) this.set("type", value);
	}
	
	/**
	 * 数据展示模式 无限加载 or 分页
    * 可选值: more | pagination
    */
	public CRUD2Table loadType(Object value) {
		return (CRUD2Table) this.set("loadType", value);
	}
	
	/**
	 * 设置分页页码字段名。
    */
	public CRUD2Table pageField(Object value) {
		return (CRUD2Table) this.set("pageField", value);
	}
	
	/**
	 * 加载中
    */
	public CRUD2Table loading(Object value) {
		return (CRUD2Table) this.set("loading", value);
	}
	
	/**
	    */
	public CRUD2Table loadingConfig(Object value) {
		return (CRUD2Table) this.set("loadingConfig", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public CRUD2Table visibleOn(Object value) {
		return (CRUD2Table) this.set("visibleOn", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public CRUD2Table editorSetting(Object value) {
		return (CRUD2Table) this.set("editorSetting", value);
	}
	
	/**
	 * 保存排序的 api
    */
	public CRUD2Table saveOrderApi(Object value) {
		return (CRUD2Table) this.set("saveOrderApi", value);
	}
	
	/**
	 * 顶部区域CSS类名
    */
	public CRUD2Table headerToolbarClassName(Object value) {
		return (CRUD2Table) this.set("headerToolbarClassName", value);
	}
	
	/**
	 * 底部区域
    */
	public CRUD2Table footerToolbar(Object value) {
		return (CRUD2Table) this.set("footerToolbar", value);
	}
	
	/**
	 * 快速编辑配置成及时保存时使用的 API
    */
	public CRUD2Table quickSaveItemApi(Object value) {
		return (CRUD2Table) this.set("quickSaveItemApi", value);
	}
	
	/**
	 * 行标识符，默认为id
    */
	public CRUD2Table primaryField(Object value) {
		return (CRUD2Table) this.set("primaryField", value);
	}
	
	/**
	 * 是否隐藏
    */
	public CRUD2Table hidden(Object value) {
		return (CRUD2Table) this.set("hidden", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public CRUD2Table staticLabelClassName(Object value) {
		return (CRUD2Table) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public CRUD2Table useMobileUI(Object value) {
		return (CRUD2Table) this.set("useMobileUI", value);
	}
	
	/**
	    */
	public CRUD2Table stopAutoRefreshWhen(Object value) {
		return (CRUD2Table) this.set("stopAutoRefreshWhen", value);
	}
	
	/**
	 * 无限加载时，根据此项设置其每页加载数量，可以不限制
    */
	public CRUD2Table perPage(Object value) {
		return (CRUD2Table) this.set("perPage", value);
	}
	
	/**
	 * 是否为前端单次加载模式，可以用来实现前端分页。
    */
	public CRUD2Table loadDataOnce(Object value) {
		return (CRUD2Table) this.set("loadDataOnce", value);
	}
	
	/**
	 * 多选、嵌套展开记录的ID字段名 默认id
    */
	public CRUD2Table keyField(Object value) {
		return (CRUD2Table) this.set("keyField", value);
	}
	
	/**
	 * 顶部区域
    */
	public CRUD2Table headerToolbar(Object value) {
		return (CRUD2Table) this.set("headerToolbar", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public CRUD2Table className(Object value) {
		return (CRUD2Table) this.set("className", value);
	}
	
	/**
	 * 静默拉取
    */
	public CRUD2Table silentPolling(Object value) {
		return (CRUD2Table) this.set("silentPolling", value);
	}
	
	/**
	 * 表格是否可以获取父级数据域值，默认为false
    */
	public CRUD2Table canAccessSuperData(Object value) {
		return (CRUD2Table) this.set("canAccessSuperData", value);
	}
	
	/**
	 * 指定挂载dom
    */
	public CRUD2Table popOverContainer(Object value) {
		return (CRUD2Table) this.set("popOverContainer", value);
	}
	
	/**
	 * 是否静态展示
    */
	public CRUD2Table static_(Object value) {
		return (CRUD2Table) this.set("static_", value);
	}
	
	/**
	 * 设置自动刷新时间
    */
	public CRUD2Table interval(Object value) {
		return (CRUD2Table) this.set("interval", value);
	}
	
	/**
	 * 底部区域CSS类名
    */
	public CRUD2Table footerToolbarClassName(Object value) {
		return (CRUD2Table) this.set("footerToolbarClassName", value);
	}
	
	/**
	 * 是否开启Query信息转换，开启后将会对url中的Query进行转换，默认开启，默认仅转化布尔值
    */
	public CRUD2Table parsePrimitiveQuery(Object value) {
		return (CRUD2Table) this.set("parsePrimitiveQuery", value);
	}
	
	/**
	 * 表格行可展开配置
    */
	public CRUD2Table expandable(Object value) {
		return (CRUD2Table) this.set("expandable", value);
	}
	}