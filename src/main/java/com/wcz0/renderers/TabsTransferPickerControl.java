package com.wcz0.renderers;
/**
 * TabsTransferPicker 穿梭器的弹框形态 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/tabs-transfer-picker

 * @author wcz0
 * @version 6.2.2
 */
public class TabsTransferPickerControl extends BaseRenderer {

	public TabsTransferPickerControl() {
		this.set("type", "tabsTransferPickerControl");
	}

	/**
	 * 用来丰富选项展示
    */
	public TabsTransferPickerControl menuTpl(Object value) {
		return (TabsTransferPickerControl) this.set("menuTpl", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public TabsTransferPickerControl id(Object value) {
		return (TabsTransferPickerControl) this.set("id", value);
	}
	
	/**
	 * 组件样式
    */
	public TabsTransferPickerControl style(Object value) {
		return (TabsTransferPickerControl) this.set("style", value);
	}
	
	/**
	 * 点清除按钮时，将表单项设置成当前配置的值。
    */
	public TabsTransferPickerControl resetValue(Object value) {
		return (TabsTransferPickerControl) this.set("resetValue", value);
	}
	
	/**
	    */
	public TabsTransferPickerControl loadingConfig(Object value) {
		return (TabsTransferPickerControl) this.set("loadingConfig", value);
	}
	
	/**
	 * 搜索 API
    */
	public TabsTransferPickerControl searchApi(Object value) {
		return (TabsTransferPickerControl) this.set("searchApi", value);
	}
	
	/**
	    */
	public TabsTransferPickerControl initAutoFill(Object value) {
		return (TabsTransferPickerControl) this.set("initAutoFill", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public TabsTransferPickerControl $$id(Object value) {
		return (TabsTransferPickerControl) this.set("$$id", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public TabsTransferPickerControl mode(Object value) {
		return (TabsTransferPickerControl) this.set("mode", value);
	}
	
	/**
	 * 事件动作配置
    */
	public TabsTransferPickerControl onEvent(Object value) {
		return (TabsTransferPickerControl) this.set("onEvent", value);
	}
	
	/**
	 * 是否静态展示
    */
	public TabsTransferPickerControl static_(Object value) {
		return (TabsTransferPickerControl) this.set("static_", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public TabsTransferPickerControl staticLabelClassName(Object value) {
		return (TabsTransferPickerControl) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public TabsTransferPickerControl staticInputClassName(Object value) {
		return (TabsTransferPickerControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 是否为必填
    */
	public TabsTransferPickerControl required(Object value) {
		return (TabsTransferPickerControl) this.set("required", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public TabsTransferPickerControl inline(Object value) {
		return (TabsTransferPickerControl) this.set("inline", value);
	}
	
	/**
	    */
	public TabsTransferPickerControl staticSchema(Object value) {
		return (TabsTransferPickerControl) this.set("staticSchema", value);
	}
	
	/**
	 * 编辑时调用的 API
    */
	public TabsTransferPickerControl editApi(Object value) {
		return (TabsTransferPickerControl) this.set("editApi", value);
	}
	
	/**
	 * 左侧列表搜索框提示
    */
	public TabsTransferPickerControl searchPlaceholder(Object value) {
		return (TabsTransferPickerControl) this.set("searchPlaceholder", value);
	}
	
	/**
	 * 结果面板是否追踪显示
    */
	public TabsTransferPickerControl resultListModeFollowSelect(Object value) {
		return (TabsTransferPickerControl) this.set("resultListModeFollowSelect", value);
	}
	
	/**
	 * 是否可清除。
    */
	public TabsTransferPickerControl clearable(Object value) {
		return (TabsTransferPickerControl) this.set("clearable", value);
	}
	
	/**
	 * 配置 label className
    */
	public TabsTransferPickerControl labelClassName(Object value) {
		return (TabsTransferPickerControl) this.set("labelClassName", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public TabsTransferPickerControl validateApi(Object value) {
		return (TabsTransferPickerControl) this.set("validateApi", value);
	}
	
	/**
	 * 新增文字
    */
	public TabsTransferPickerControl createBtnLabel(Object value) {
		return (TabsTransferPickerControl) this.set("createBtnLabel", value);
	}
	
	/**
	 * 是否可以编辑
    */
	public TabsTransferPickerControl editable(Object value) {
		return (TabsTransferPickerControl) this.set("editable", value);
	}
	
	/**
	 * 选项删除提示文字。
    */
	public TabsTransferPickerControl deleteConfirmText(Object value) {
		return (TabsTransferPickerControl) this.set("deleteConfirmText", value);
	}
	
	/**
	 * 单个选项的高度，主要用于虚拟渲染
    */
	public TabsTransferPickerControl itemHeight(Object value) {
		return (TabsTransferPickerControl) this.set("itemHeight", value);
	}
	
	/**
	 * 是否默认都展开
    */
	public TabsTransferPickerControl initiallyOpen(Object value) {
		return (TabsTransferPickerControl) this.set("initiallyOpen", value);
	}
	
	/**
	    */
	public TabsTransferPickerControl desc(Object value) {
		return (TabsTransferPickerControl) this.set("desc", value);
	}
	
	/**
	 * 用表达式来配置 source 接口初始要不要拉取
    */
	public TabsTransferPickerControl initFetchOn(Object value) {
		return (TabsTransferPickerControl) this.set("initFetchOn", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public TabsTransferPickerControl validateOnChange(Object value) {
		return (TabsTransferPickerControl) this.set("validateOnChange", value);
	}
	
	/**
	 * 只读条件
    */
	public TabsTransferPickerControl readOnlyOn(Object value) {
		return (TabsTransferPickerControl) this.set("readOnlyOn", value);
	}
	
	/**
	 * 是否可删除
    */
	public TabsTransferPickerControl removable(Object value) {
		return (TabsTransferPickerControl) this.set("removable", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public TabsTransferPickerControl labelWidth(Object value) {
		return (TabsTransferPickerControl) this.set("labelWidth", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public TabsTransferPickerControl extraName(Object value) {
		return (TabsTransferPickerControl) this.set("extraName", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public TabsTransferPickerControl name(Object value) {
		return (TabsTransferPickerControl) this.set("name", value);
	}
	
	/**
	 * 是否隐藏
    */
	public TabsTransferPickerControl hidden(Object value) {
		return (TabsTransferPickerControl) this.set("hidden", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public TabsTransferPickerControl staticPlaceholder(Object value) {
		return (TabsTransferPickerControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 当 selectMode 为 associated 时用来定义左侧的选择模式
    * 可选值: tree | list
    */
	public TabsTransferPickerControl leftMode(Object value) {
		return (TabsTransferPickerControl) this.set("leftMode", value);
	}
	
	/**
	 * 分页配置，selectMode为默认和table才会生效
    */
	public TabsTransferPickerControl pagination(Object value) {
		return (TabsTransferPickerControl) this.set("pagination", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public TabsTransferPickerControl hint(Object value) {
		return (TabsTransferPickerControl) this.set("hint", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public TabsTransferPickerControl visibleOn(Object value) {
		return (TabsTransferPickerControl) this.set("visibleOn", value);
	}
	
	/**
	 * 当 selectMode 为 table 时定义表格列信息。
    */
	public TabsTransferPickerControl columns(Object value) {
		return (TabsTransferPickerControl) this.set("columns", value);
	}
	
	/**
	 * 可搜索？
    */
	public TabsTransferPickerControl searchable(Object value) {
		return (TabsTransferPickerControl) this.set("searchable", value);
	}
	
	/**
	 * 分割符
    */
	public TabsTransferPickerControl delimiter(Object value) {
		return (TabsTransferPickerControl) this.set("delimiter", value);
	}
	
	/**
	 * 是否可以新增
    */
	public TabsTransferPickerControl creatable(Object value) {
		return (TabsTransferPickerControl) this.set("creatable", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public TabsTransferPickerControl horizontal(Object value) {
		return (TabsTransferPickerControl) this.set("horizontal", value);
	}
	
	/**
	    */
	public TabsTransferPickerControl testIdBuilder(Object value) {
		return (TabsTransferPickerControl) this.set("testIdBuilder", value);
	}
	
	/**
	    */
	public TabsTransferPickerControl type(Object value) {
		return (TabsTransferPickerControl) this.set("type", value);
	}
	
	/**
	 * 勾选展示模式
    * 可选值: table | list | tree | chained | associated
    */
	public TabsTransferPickerControl selectMode(Object value) {
		return (TabsTransferPickerControl) this.set("selectMode", value);
	}
	
	/**
	 * 右侧结果的标题文字
    */
	public TabsTransferPickerControl resultTitle(Object value) {
		return (TabsTransferPickerControl) this.set("resultTitle", value);
	}
	
	/**
	 * 延时加载的 API，当选项中有 defer: true 的选项时，点开会通过此接口扩充。
    */
	public TabsTransferPickerControl deferApi(Object value) {
		return (TabsTransferPickerControl) this.set("deferApi", value);
	}
	
	/**
	 * 可排序？
    */
	public TabsTransferPickerControl sortable(Object value) {
		return (TabsTransferPickerControl) this.set("sortable", value);
	}
	
	/**
	 * 当 searchResultMode 为 table 时定义表格列信息。
    */
	public TabsTransferPickerControl searchResultColumns(Object value) {
		return (TabsTransferPickerControl) this.set("searchResultColumns", value);
	}
	
	/**
	 * 是否只读
    */
	public TabsTransferPickerControl readOnly(Object value) {
		return (TabsTransferPickerControl) this.set("readOnly", value);
	}
	
	/**
	 * 默认选择选项第一个值。
    */
	public TabsTransferPickerControl selectFirst(Object value) {
		return (TabsTransferPickerControl) this.set("selectFirst", value);
	}
	
	/**
	 * 当 selectMode 为 associated 时用来定义右侧的选择模式
    * 可选值: table | list | tree | chained
    */
	public TabsTransferPickerControl rightMode(Object value) {
		return (TabsTransferPickerControl) this.set("rightMode", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public TabsTransferPickerControl labelRemark(Object value) {
		return (TabsTransferPickerControl) this.set("labelRemark", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public TabsTransferPickerControl description(Object value) {
		return (TabsTransferPickerControl) this.set("description", value);
	}
	
	/**
	 * 搜索结果展示模式
    * 可选值: table | list | tree | chained
    */
	public TabsTransferPickerControl searchResultMode(Object value) {
		return (TabsTransferPickerControl) this.set("searchResultMode", value);
	}
	
	/**
	 * 描述标题
    */
	public TabsTransferPickerControl labelAlign(Object value) {
		return (TabsTransferPickerControl) this.set("labelAlign", value);
	}
	
	/**
	 * ui级联关系，true代表级联选中，false代表不级联，默认为true
    */
	public TabsTransferPickerControl autoCheckChildren(Object value) {
		return (TabsTransferPickerControl) this.set("autoCheckChildren", value);
	}
	
	/**
	 * 配置 input className
    */
	public TabsTransferPickerControl inputClassName(Object value) {
		return (TabsTransferPickerControl) this.set("inputClassName", value);
	}
	
	/**
	 * 是否显示
    */
	public TabsTransferPickerControl visible(Object value) {
		return (TabsTransferPickerControl) this.set("visible", value);
	}
	
	/**
	 * 开启后将选中的选项 value 的值封装为数组，作为当前表单项的值。
    */
	public TabsTransferPickerControl extractValue(Object value) {
		return (TabsTransferPickerControl) this.set("extractValue", value);
	}
	
	/**
	 * 选项删除 API
    */
	public TabsTransferPickerControl deleteApi(Object value) {
		return (TabsTransferPickerControl) this.set("deleteApi", value);
	}
	
	/**
	 * 用来丰富值的展示
    */
	public TabsTransferPickerControl valueTpl(Object value) {
		return (TabsTransferPickerControl) this.set("valueTpl", value);
	}
	
	/**
	 * 当在value值未匹配到当前options中的选项时，是否value值对应文本飘红显示
    */
	public TabsTransferPickerControl showInvalidMatch(Object value) {
		return (TabsTransferPickerControl) this.set("showInvalidMatch", value);
	}
	
	/**
	 * 是否为多选模式
    */
	public TabsTransferPickerControl multiple(Object value) {
		return (TabsTransferPickerControl) this.set("multiple", value);
	}
	
	/**
	 * 懒加载字段
    */
	public TabsTransferPickerControl deferField(Object value) {
		return (TabsTransferPickerControl) this.set("deferField", value);
	}
	
	/**
	    */
	public TabsTransferPickerControl validations(Object value) {
		return (TabsTransferPickerControl) this.set("validations", value);
	}
	
	/**
	 * 是否禁用
    */
	public TabsTransferPickerControl disabled(Object value) {
		return (TabsTransferPickerControl) this.set("disabled", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public TabsTransferPickerControl remark(Object value) {
		return (TabsTransferPickerControl) this.set("remark", value);
	}
	
	/**
	 * 描述标题
    */
	public TabsTransferPickerControl label(Object value) {
		return (TabsTransferPickerControl) this.set("label", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public TabsTransferPickerControl className(Object value) {
		return (TabsTransferPickerControl) this.set("className", value);
	}
	
	/**
	 * 可用来通过 API 拉取 options。
    */
	public TabsTransferPickerControl source(Object value) {
		return (TabsTransferPickerControl) this.set("source", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public TabsTransferPickerControl width(Object value) {
		return (TabsTransferPickerControl) this.set("width", value);
	}
	
	/**
	 * 是否显示剪头
    */
	public TabsTransferPickerControl showArrow(Object value) {
		return (TabsTransferPickerControl) this.set("showArrow", value);
	}
	
	/**
	 * 右侧列表搜索框提示
    */
	public TabsTransferPickerControl resultSearchPlaceholder(Object value) {
		return (TabsTransferPickerControl) this.set("resultSearchPlaceholder", value);
	}
	
	/**
	 * 左侧的标题文字
    */
	public TabsTransferPickerControl selectTitle(Object value) {
		return (TabsTransferPickerControl) this.set("selectTitle", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public TabsTransferPickerControl size(Object value) {
		return (TabsTransferPickerControl) this.set("size", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public TabsTransferPickerControl useMobileUI(Object value) {
		return (TabsTransferPickerControl) this.set("useMobileUI", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public TabsTransferPickerControl staticClassName(Object value) {
		return (TabsTransferPickerControl) this.set("staticClassName", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public TabsTransferPickerControl editorSetting(Object value) {
		return (TabsTransferPickerControl) this.set("editorSetting", value);
	}
	
	/**
	 * 树形模式下，仅选中子节点
    */
	public TabsTransferPickerControl onlyChildren(Object value) {
		return (TabsTransferPickerControl) this.set("onlyChildren", value);
	}
	
	/**
	 * 添加时调用的接口
    */
	public TabsTransferPickerControl addApi(Object value) {
		return (TabsTransferPickerControl) this.set("addApi", value);
	}
	
	/**
	 * 选项修改的表单项
    */
	public TabsTransferPickerControl editControls(Object value) {
		return (TabsTransferPickerControl) this.set("editControls", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public TabsTransferPickerControl validationErrors(Object value) {
		return (TabsTransferPickerControl) this.set("validationErrors", value);
	}
	
	/**
	 * 配置 source 接口初始拉不拉取。
    */
	public TabsTransferPickerControl initFetch(Object value) {
		return (TabsTransferPickerControl) this.set("initFetch", value);
	}
	
	/**
	 * 统计数字
    */
	public TabsTransferPickerControl statistics(Object value) {
		return (TabsTransferPickerControl) this.set("statistics", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public TabsTransferPickerControl submitOnChange(Object value) {
		return (TabsTransferPickerControl) this.set("submitOnChange", value);
	}
	
	/**
	 * 选项集合
    */
	public TabsTransferPickerControl options(Object value) {
		return (TabsTransferPickerControl) this.set("options", value);
	}
	
	/**
	 * 单选模式：当用户选中某个选项时，选项中的 value 将被作为该表单项的值提交，否则，整个选项对象都会作为该表单项的值提交。 多选模式：选中的多个选项的 `value` 会通过 `delimiter` 连接起来，否则直接将以数组的形式提交值。
    */
	public TabsTransferPickerControl joinValues(Object value) {
		return (TabsTransferPickerControl) this.set("joinValues", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public TabsTransferPickerControl clearValueOnHidden(Object value) {
		return (TabsTransferPickerControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	 * 占位符
    */
	public TabsTransferPickerControl placeholder(Object value) {
		return (TabsTransferPickerControl) this.set("placeholder", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public TabsTransferPickerControl descriptionClassName(Object value) {
		return (TabsTransferPickerControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 多选模式，值太多时是否避免折行
    */
	public TabsTransferPickerControl valuesNoWrap(Object value) {
		return (TabsTransferPickerControl) this.set("valuesNoWrap", value);
	}
	
	/**
	 * 控制新增弹框设置项
    */
	public TabsTransferPickerControl addDialog(Object value) {
		return (TabsTransferPickerControl) this.set("addDialog", value);
	}
	
	/**
	 * 当 selectMode 为 associated 时用来定义左侧的选项
    */
	public TabsTransferPickerControl leftOptions(Object value) {
		return (TabsTransferPickerControl) this.set("leftOptions", value);
	}
	
	/**
	 * 结果（右则）列表的检索功能，当设置为true时，可以通过输入检索模糊匹配检索内容
    */
	public TabsTransferPickerControl resultSearchable(Object value) {
		return (TabsTransferPickerControl) this.set("resultSearchable", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public TabsTransferPickerControl disabledOn(Object value) {
		return (TabsTransferPickerControl) this.set("disabledOn", value);
	}
	
	/**
	 * 在选项数量达到多少时开启虚拟渲染
    */
	public TabsTransferPickerControl virtualThreshold(Object value) {
		return (TabsTransferPickerControl) this.set("virtualThreshold", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public TabsTransferPickerControl hiddenOn(Object value) {
		return (TabsTransferPickerControl) this.set("hiddenOn", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public TabsTransferPickerControl staticOn(Object value) {
		return (TabsTransferPickerControl) this.set("staticOn", value);
	}
	
	/**
	 * 新增时的表单项。
    */
	public TabsTransferPickerControl addControls(Object value) {
		return (TabsTransferPickerControl) this.set("addControls", value);
	}
	
	/**
	 * 控制编辑弹框设置项
    */
	public TabsTransferPickerControl editDialog(Object value) {
		return (TabsTransferPickerControl) this.set("editDialog", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public TabsTransferPickerControl value(Object value) {
		return (TabsTransferPickerControl) this.set("value", value);
	}
	
	/**
	 * 自动填充，当选项被选择的时候，将选项中的其他值同步设置到表单内。
    */
	public TabsTransferPickerControl autoFill(Object value) {
		return (TabsTransferPickerControl) this.set("autoFill", value);
	}
	}