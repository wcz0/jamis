package com.wcz0.renderers;
/**
 * TabsTransfer 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/tabs-transfer

 * @author wcz0
 * @version 6.2.2
 */
public class TabsTransferControl extends BaseRenderer {

	public TabsTransferControl() {
		this.set("type", "tabsTransferControl");
	}

	/**
	 * 远端校验表单项接口
    */
	public TabsTransferControl validateApi(Object value) {
		return (TabsTransferControl) this.set("validateApi", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public TabsTransferControl width(Object value) {
		return (TabsTransferControl) this.set("width", value);
	}
	
	/**
	    */
	public TabsTransferControl initAutoFill(Object value) {
		return (TabsTransferControl) this.set("initAutoFill", value);
	}
	
	/**
	 * 是否隐藏
    */
	public TabsTransferControl hidden(Object value) {
		return (TabsTransferControl) this.set("hidden", value);
	}
	
	/**
	 * 懒加载字段
    */
	public TabsTransferControl deferField(Object value) {
		return (TabsTransferControl) this.set("deferField", value);
	}
	
	/**
	    */
	public TabsTransferControl loadingConfig(Object value) {
		return (TabsTransferControl) this.set("loadingConfig", value);
	}
	
	/**
	 * 描述标题
    */
	public TabsTransferControl labelAlign(Object value) {
		return (TabsTransferControl) this.set("labelAlign", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public TabsTransferControl extraName(Object value) {
		return (TabsTransferControl) this.set("extraName", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public TabsTransferControl staticLabelClassName(Object value) {
		return (TabsTransferControl) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 选项删除 API
    */
	public TabsTransferControl deleteApi(Object value) {
		return (TabsTransferControl) this.set("deleteApi", value);
	}
	
	/**
	 * 结果面板是否追踪显示
    */
	public TabsTransferControl resultListModeFollowSelect(Object value) {
		return (TabsTransferControl) this.set("resultListModeFollowSelect", value);
	}
	
	/**
	 * 在选项数量达到多少时开启虚拟渲染
    */
	public TabsTransferControl virtualThreshold(Object value) {
		return (TabsTransferControl) this.set("virtualThreshold", value);
	}
	
	/**
	 * 树形模式下，仅选中子节点
    */
	public TabsTransferControl onlyChildren(Object value) {
		return (TabsTransferControl) this.set("onlyChildren", value);
	}
	
	/**
	 * 当 selectMode 为 associated 时用来定义左侧的选项
    */
	public TabsTransferControl leftOptions(Object value) {
		return (TabsTransferControl) this.set("leftOptions", value);
	}
	
	/**
	 * 右侧结果的标题文字
    */
	public TabsTransferControl resultTitle(Object value) {
		return (TabsTransferControl) this.set("resultTitle", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public TabsTransferControl validateOnChange(Object value) {
		return (TabsTransferControl) this.set("validateOnChange", value);
	}
	
	/**
	 * 事件动作配置
    */
	public TabsTransferControl onEvent(Object value) {
		return (TabsTransferControl) this.set("onEvent", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public TabsTransferControl staticOn(Object value) {
		return (TabsTransferControl) this.set("staticOn", value);
	}
	
	/**
	 * 新增文字
    */
	public TabsTransferControl createBtnLabel(Object value) {
		return (TabsTransferControl) this.set("createBtnLabel", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public TabsTransferControl mode(Object value) {
		return (TabsTransferControl) this.set("mode", value);
	}
	
	/**
	 * 默认选择选项第一个值。
    */
	public TabsTransferControl selectFirst(Object value) {
		return (TabsTransferControl) this.set("selectFirst", value);
	}
	
	/**
	 * 当在value值未匹配到当前options中的选项时，是否value值对应文本飘红显示
    */
	public TabsTransferControl showInvalidMatch(Object value) {
		return (TabsTransferControl) this.set("showInvalidMatch", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public TabsTransferControl name(Object value) {
		return (TabsTransferControl) this.set("name", value);
	}
	
	/**
	 * 选项集合
    */
	public TabsTransferControl options(Object value) {
		return (TabsTransferControl) this.set("options", value);
	}
	
	/**
	    */
	public TabsTransferControl type(Object value) {
		return (TabsTransferControl) this.set("type", value);
	}
	
	/**
	 * 左侧的标题文字
    */
	public TabsTransferControl selectTitle(Object value) {
		return (TabsTransferControl) this.set("selectTitle", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public TabsTransferControl horizontal(Object value) {
		return (TabsTransferControl) this.set("horizontal", value);
	}
	
	/**
	 * 是否可以新增
    */
	public TabsTransferControl creatable(Object value) {
		return (TabsTransferControl) this.set("creatable", value);
	}
	
	/**
	 * 可搜索？
    */
	public TabsTransferControl searchable(Object value) {
		return (TabsTransferControl) this.set("searchable", value);
	}
	
	/**
	 * 用来丰富选项展示
    */
	public TabsTransferControl menuTpl(Object value) {
		return (TabsTransferControl) this.set("menuTpl", value);
	}
	
	/**
	 * 左侧列表搜索框提示
    */
	public TabsTransferControl searchPlaceholder(Object value) {
		return (TabsTransferControl) this.set("searchPlaceholder", value);
	}
	
	/**
	 * 只读条件
    */
	public TabsTransferControl readOnlyOn(Object value) {
		return (TabsTransferControl) this.set("readOnlyOn", value);
	}
	
	/**
	    */
	public TabsTransferControl validations(Object value) {
		return (TabsTransferControl) this.set("validations", value);
	}
	
	/**
	 * 是否为多选模式
    */
	public TabsTransferControl multiple(Object value) {
		return (TabsTransferControl) this.set("multiple", value);
	}
	
	/**
	 * 开启后将选中的选项 value 的值封装为数组，作为当前表单项的值。
    */
	public TabsTransferControl extractValue(Object value) {
		return (TabsTransferControl) this.set("extractValue", value);
	}
	
	/**
	 * 搜索结果展示模式
    * 可选值: table | list | tree | chained
    */
	public TabsTransferControl searchResultMode(Object value) {
		return (TabsTransferControl) this.set("searchResultMode", value);
	}
	
	/**
	    */
	public TabsTransferControl desc(Object value) {
		return (TabsTransferControl) this.set("desc", value);
	}
	
	/**
	 * 配置 source 接口初始拉不拉取。
    */
	public TabsTransferControl initFetch(Object value) {
		return (TabsTransferControl) this.set("initFetch", value);
	}
	
	/**
	 * 分割符
    */
	public TabsTransferControl delimiter(Object value) {
		return (TabsTransferControl) this.set("delimiter", value);
	}
	
	/**
	 * 可排序？
    */
	public TabsTransferControl sortable(Object value) {
		return (TabsTransferControl) this.set("sortable", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public TabsTransferControl labelRemark(Object value) {
		return (TabsTransferControl) this.set("labelRemark", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public TabsTransferControl hiddenOn(Object value) {
		return (TabsTransferControl) this.set("hiddenOn", value);
	}
	
	/**
	 * 是否可以编辑
    */
	public TabsTransferControl editable(Object value) {
		return (TabsTransferControl) this.set("editable", value);
	}
	
	/**
	    */
	public TabsTransferControl staticSchema(Object value) {
		return (TabsTransferControl) this.set("staticSchema", value);
	}
	
	/**
	 * 延时加载的 API，当选项中有 defer: true 的选项时，点开会通过此接口扩充。
    */
	public TabsTransferControl deferApi(Object value) {
		return (TabsTransferControl) this.set("deferApi", value);
	}
	
	/**
	 * 选项修改的表单项
    */
	public TabsTransferControl editControls(Object value) {
		return (TabsTransferControl) this.set("editControls", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public TabsTransferControl hint(Object value) {
		return (TabsTransferControl) this.set("hint", value);
	}
	
	/**
	 * 勾选展示模式
    * 可选值: table | list | tree | chained | associated
    */
	public TabsTransferControl selectMode(Object value) {
		return (TabsTransferControl) this.set("selectMode", value);
	}
	
	/**
	 * 统计数字
    */
	public TabsTransferControl statistics(Object value) {
		return (TabsTransferControl) this.set("statistics", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public TabsTransferControl size(Object value) {
		return (TabsTransferControl) this.set("size", value);
	}
	
	/**
	 * 用来丰富值的展示
    */
	public TabsTransferControl valueTpl(Object value) {
		return (TabsTransferControl) this.set("valueTpl", value);
	}
	
	/**
	 * 是否只读
    */
	public TabsTransferControl readOnly(Object value) {
		return (TabsTransferControl) this.set("readOnly", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public TabsTransferControl inline(Object value) {
		return (TabsTransferControl) this.set("inline", value);
	}
	
	/**
	 * 占位符
    */
	public TabsTransferControl placeholder(Object value) {
		return (TabsTransferControl) this.set("placeholder", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public TabsTransferControl staticPlaceholder(Object value) {
		return (TabsTransferControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 控制编辑弹框设置项
    */
	public TabsTransferControl editDialog(Object value) {
		return (TabsTransferControl) this.set("editDialog", value);
	}
	
	/**
	 * 右侧列表搜索框提示
    */
	public TabsTransferControl resultSearchPlaceholder(Object value) {
		return (TabsTransferControl) this.set("resultSearchPlaceholder", value);
	}
	
	/**
	 * ui级联关系，true代表级联选中，false代表不级联，默认为true
    */
	public TabsTransferControl autoCheckChildren(Object value) {
		return (TabsTransferControl) this.set("autoCheckChildren", value);
	}
	
	/**
	 * 多选模式，值太多时是否避免折行
    */
	public TabsTransferControl valuesNoWrap(Object value) {
		return (TabsTransferControl) this.set("valuesNoWrap", value);
	}
	
	/**
	 * 是否显示剪头
    */
	public TabsTransferControl showArrow(Object value) {
		return (TabsTransferControl) this.set("showArrow", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public TabsTransferControl description(Object value) {
		return (TabsTransferControl) this.set("description", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public TabsTransferControl staticInputClassName(Object value) {
		return (TabsTransferControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 控制新增弹框设置项
    */
	public TabsTransferControl addDialog(Object value) {
		return (TabsTransferControl) this.set("addDialog", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public TabsTransferControl staticClassName(Object value) {
		return (TabsTransferControl) this.set("staticClassName", value);
	}
	
	/**
	 * 当 selectMode 为 table 时定义表格列信息。
    */
	public TabsTransferControl columns(Object value) {
		return (TabsTransferControl) this.set("columns", value);
	}
	
	/**
	 * 描述标题
    */
	public TabsTransferControl label(Object value) {
		return (TabsTransferControl) this.set("label", value);
	}
	
	/**
	 * 是否静态展示
    */
	public TabsTransferControl static_(Object value) {
		return (TabsTransferControl) this.set("static_", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public TabsTransferControl clearValueOnHidden(Object value) {
		return (TabsTransferControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public TabsTransferControl id(Object value) {
		return (TabsTransferControl) this.set("id", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public TabsTransferControl editorSetting(Object value) {
		return (TabsTransferControl) this.set("editorSetting", value);
	}
	
	/**
	 * 单选模式：当用户选中某个选项时，选项中的 value 将被作为该表单项的值提交，否则，整个选项对象都会作为该表单项的值提交。 多选模式：选中的多个选项的 `value` 会通过 `delimiter` 连接起来，否则直接将以数组的形式提交值。
    */
	public TabsTransferControl joinValues(Object value) {
		return (TabsTransferControl) this.set("joinValues", value);
	}
	
	/**
	 * 当 selectMode 为 associated 时用来定义右侧的选择模式
    * 可选值: table | list | tree | chained
    */
	public TabsTransferControl rightMode(Object value) {
		return (TabsTransferControl) this.set("rightMode", value);
	}
	
	/**
	 * 添加时调用的接口
    */
	public TabsTransferControl addApi(Object value) {
		return (TabsTransferControl) this.set("addApi", value);
	}
	
	/**
	 * 编辑时调用的 API
    */
	public TabsTransferControl editApi(Object value) {
		return (TabsTransferControl) this.set("editApi", value);
	}
	
	/**
	 * 是否可删除
    */
	public TabsTransferControl removable(Object value) {
		return (TabsTransferControl) this.set("removable", value);
	}
	
	/**
	 * 结果（右则）列表的检索功能，当设置为true时，可以通过输入检索模糊匹配检索内容
    */
	public TabsTransferControl resultSearchable(Object value) {
		return (TabsTransferControl) this.set("resultSearchable", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public TabsTransferControl descriptionClassName(Object value) {
		return (TabsTransferControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 配置 input className
    */
	public TabsTransferControl inputClassName(Object value) {
		return (TabsTransferControl) this.set("inputClassName", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public TabsTransferControl validationErrors(Object value) {
		return (TabsTransferControl) this.set("validationErrors", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public TabsTransferControl value(Object value) {
		return (TabsTransferControl) this.set("value", value);
	}
	
	/**
	 * 是否显示
    */
	public TabsTransferControl visible(Object value) {
		return (TabsTransferControl) this.set("visible", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public TabsTransferControl className(Object value) {
		return (TabsTransferControl) this.set("className", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public TabsTransferControl disabledOn(Object value) {
		return (TabsTransferControl) this.set("disabledOn", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public TabsTransferControl useMobileUI(Object value) {
		return (TabsTransferControl) this.set("useMobileUI", value);
	}
	
	/**
	 * 搜索 API
    */
	public TabsTransferControl searchApi(Object value) {
		return (TabsTransferControl) this.set("searchApi", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public TabsTransferControl $$id(Object value) {
		return (TabsTransferControl) this.set("$$id", value);
	}
	
	/**
	    */
	public TabsTransferControl testIdBuilder(Object value) {
		return (TabsTransferControl) this.set("testIdBuilder", value);
	}
	
	/**
	 * 可用来通过 API 拉取 options。
    */
	public TabsTransferControl source(Object value) {
		return (TabsTransferControl) this.set("source", value);
	}
	
	/**
	 * 当 searchResultMode 为 table 时定义表格列信息。
    */
	public TabsTransferControl searchResultColumns(Object value) {
		return (TabsTransferControl) this.set("searchResultColumns", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public TabsTransferControl remark(Object value) {
		return (TabsTransferControl) this.set("remark", value);
	}
	
	/**
	 * 自动填充，当选项被选择的时候，将选项中的其他值同步设置到表单内。
    */
	public TabsTransferControl autoFill(Object value) {
		return (TabsTransferControl) this.set("autoFill", value);
	}
	
	/**
	 * 用表达式来配置 source 接口初始要不要拉取
    */
	public TabsTransferControl initFetchOn(Object value) {
		return (TabsTransferControl) this.set("initFetchOn", value);
	}
	
	/**
	 * 分页配置，selectMode为默认和table才会生效
    */
	public TabsTransferControl pagination(Object value) {
		return (TabsTransferControl) this.set("pagination", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public TabsTransferControl submitOnChange(Object value) {
		return (TabsTransferControl) this.set("submitOnChange", value);
	}
	
	/**
	 * 选项删除提示文字。
    */
	public TabsTransferControl deleteConfirmText(Object value) {
		return (TabsTransferControl) this.set("deleteConfirmText", value);
	}
	
	/**
	 * 是否可清除。
    */
	public TabsTransferControl clearable(Object value) {
		return (TabsTransferControl) this.set("clearable", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public TabsTransferControl labelWidth(Object value) {
		return (TabsTransferControl) this.set("labelWidth", value);
	}
	
	/**
	 * 是否为必填
    */
	public TabsTransferControl required(Object value) {
		return (TabsTransferControl) this.set("required", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public TabsTransferControl visibleOn(Object value) {
		return (TabsTransferControl) this.set("visibleOn", value);
	}
	
	/**
	 * 当 selectMode 为 associated 时用来定义左侧的选择模式
    * 可选值: tree | list
    */
	public TabsTransferControl leftMode(Object value) {
		return (TabsTransferControl) this.set("leftMode", value);
	}
	
	/**
	 * 单个选项的高度，主要用于虚拟渲染
    */
	public TabsTransferControl itemHeight(Object value) {
		return (TabsTransferControl) this.set("itemHeight", value);
	}
	
	/**
	 * 是否默认都展开
    */
	public TabsTransferControl initiallyOpen(Object value) {
		return (TabsTransferControl) this.set("initiallyOpen", value);
	}
	
	/**
	 * 配置 label className
    */
	public TabsTransferControl labelClassName(Object value) {
		return (TabsTransferControl) this.set("labelClassName", value);
	}
	
	/**
	 * 是否禁用
    */
	public TabsTransferControl disabled(Object value) {
		return (TabsTransferControl) this.set("disabled", value);
	}
	
	/**
	 * 组件样式
    */
	public TabsTransferControl style(Object value) {
		return (TabsTransferControl) this.set("style", value);
	}
	
	/**
	 * 新增时的表单项。
    */
	public TabsTransferControl addControls(Object value) {
		return (TabsTransferControl) this.set("addControls", value);
	}
	
	/**
	 * 点清除按钮时，将表单项设置成当前配置的值。
    */
	public TabsTransferControl resetValue(Object value) {
		return (TabsTransferControl) this.set("resetValue", value);
	}
	}