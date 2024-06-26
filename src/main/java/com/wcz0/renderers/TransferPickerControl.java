package com.wcz0.renderers;
/**
 * TransferPicker 穿梭器的弹框形态 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/transfer-picker

 * @author wcz0
 * @version 6.2.2
 */
public class TransferPickerControl extends BaseRenderer {

	public TransferPickerControl() {
		this.set("type", "transferPickerControl");
	}

	/**
	 * 用来丰富选项展示
    */
	public TransferPickerControl menuTpl(Object value) {
		return (TransferPickerControl) this.set("menuTpl", value);
	}
	
	/**
	 * 当在value值未匹配到当前options中的选项时，是否value值对应文本飘红显示
    */
	public TransferPickerControl showInvalidMatch(Object value) {
		return (TransferPickerControl) this.set("showInvalidMatch", value);
	}
	
	/**
	 * 延时加载的 API，当选项中有 defer: true 的选项时，点开会通过此接口扩充。
    */
	public TransferPickerControl deferApi(Object value) {
		return (TransferPickerControl) this.set("deferApi", value);
	}
	
	/**
	 * 配置 label className
    */
	public TransferPickerControl labelClassName(Object value) {
		return (TransferPickerControl) this.set("labelClassName", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public TransferPickerControl submitOnChange(Object value) {
		return (TransferPickerControl) this.set("submitOnChange", value);
	}
	
	/**
	    */
	public TransferPickerControl validations(Object value) {
		return (TransferPickerControl) this.set("validations", value);
	}
	
	/**
	 * 是否隐藏
    */
	public TransferPickerControl hidden(Object value) {
		return (TransferPickerControl) this.set("hidden", value);
	}
	
	/**
	 * 边框模式，全边框，还是半边框，或者没边框。
    * 可选值: full | half | none
    */
	public TransferPickerControl borderMode(Object value) {
		return (TransferPickerControl) this.set("borderMode", value);
	}
	
	/**
	 * 结果（右则）列表的检索功能，当设置为true时，可以通过输入检索模糊匹配检索内容
    */
	public TransferPickerControl resultSearchable(Object value) {
		return (TransferPickerControl) this.set("resultSearchable", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public TransferPickerControl labelRemark(Object value) {
		return (TransferPickerControl) this.set("labelRemark", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public TransferPickerControl useMobileUI(Object value) {
		return (TransferPickerControl) this.set("useMobileUI", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public TransferPickerControl staticLabelClassName(Object value) {
		return (TransferPickerControl) this.set("staticLabelClassName", value);
	}
	
	/**
	    */
	public TransferPickerControl staticSchema(Object value) {
		return (TransferPickerControl) this.set("staticSchema", value);
	}
	
	/**
	 * 是否可清除。
    */
	public TransferPickerControl clearable(Object value) {
		return (TransferPickerControl) this.set("clearable", value);
	}
	
	/**
	 * 添加时调用的接口
    */
	public TransferPickerControl addApi(Object value) {
		return (TransferPickerControl) this.set("addApi", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public TransferPickerControl size(Object value) {
		return (TransferPickerControl) this.set("size", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public TransferPickerControl validateOnChange(Object value) {
		return (TransferPickerControl) this.set("validateOnChange", value);
	}
	
	/**
	 * 自动填充，当选项被选择的时候，将选项中的其他值同步设置到表单内。
    */
	public TransferPickerControl autoFill(Object value) {
		return (TransferPickerControl) this.set("autoFill", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public TransferPickerControl $$id(Object value) {
		return (TransferPickerControl) this.set("$$id", value);
	}
	
	/**
	 * 选项集合
    */
	public TransferPickerControl options(Object value) {
		return (TransferPickerControl) this.set("options", value);
	}
	
	/**
	 * 多选模式，值太多时是否避免折行
    */
	public TransferPickerControl valuesNoWrap(Object value) {
		return (TransferPickerControl) this.set("valuesNoWrap", value);
	}
	
	/**
	 * 左侧列表搜索框提示
    */
	public TransferPickerControl searchPlaceholder(Object value) {
		return (TransferPickerControl) this.set("searchPlaceholder", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public TransferPickerControl labelWidth(Object value) {
		return (TransferPickerControl) this.set("labelWidth", value);
	}
	
	/**
	 * 是否为必填
    */
	public TransferPickerControl required(Object value) {
		return (TransferPickerControl) this.set("required", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public TransferPickerControl value(Object value) {
		return (TransferPickerControl) this.set("value", value);
	}
	
	/**
	 * 选项删除提示文字。
    */
	public TransferPickerControl deleteConfirmText(Object value) {
		return (TransferPickerControl) this.set("deleteConfirmText", value);
	}
	
	/**
	    */
	public TransferPickerControl loadingConfig(Object value) {
		return (TransferPickerControl) this.set("loadingConfig", value);
	}
	
	/**
	 * 分页配置，selectMode为默认和table才会生效
    */
	public TransferPickerControl pagination(Object value) {
		return (TransferPickerControl) this.set("pagination", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public TransferPickerControl remark(Object value) {
		return (TransferPickerControl) this.set("remark", value);
	}
	
	/**
	 * 选项修改的表单项
    */
	public TransferPickerControl editControls(Object value) {
		return (TransferPickerControl) this.set("editControls", value);
	}
	
	/**
	 * 可排序？
    */
	public TransferPickerControl sortable(Object value) {
		return (TransferPickerControl) this.set("sortable", value);
	}
	
	/**
	 * 右侧结果的标题文字
    */
	public TransferPickerControl resultTitle(Object value) {
		return (TransferPickerControl) this.set("resultTitle", value);
	}
	
	/**
	 * 当 selectMode 为 table 时定义表格列信息。
    */
	public TransferPickerControl columns(Object value) {
		return (TransferPickerControl) this.set("columns", value);
	}
	
	/**
	 * 是否可删除
    */
	public TransferPickerControl removable(Object value) {
		return (TransferPickerControl) this.set("removable", value);
	}
	
	/**
	 * 当 selectMode 为 associated 时用来定义右侧的选择模式
    * 可选值: table | list | tree | chained
    */
	public TransferPickerControl rightMode(Object value) {
		return (TransferPickerControl) this.set("rightMode", value);
	}
	
	/**
	 * 统计数字
    */
	public TransferPickerControl statistics(Object value) {
		return (TransferPickerControl) this.set("statistics", value);
	}
	
	/**
	 * 单个选项的高度，主要用于虚拟渲染
    */
	public TransferPickerControl itemHeight(Object value) {
		return (TransferPickerControl) this.set("itemHeight", value);
	}
	
	/**
	 * 描述标题
    */
	public TransferPickerControl label(Object value) {
		return (TransferPickerControl) this.set("label", value);
	}
	
	/**
	 * 单选模式：当用户选中某个选项时，选项中的 value 将被作为该表单项的值提交，否则，整个选项对象都会作为该表单项的值提交。 多选模式：选中的多个选项的 `value` 会通过 `delimiter` 连接起来，否则直接将以数组的形式提交值。
    */
	public TransferPickerControl joinValues(Object value) {
		return (TransferPickerControl) this.set("joinValues", value);
	}
	
	/**
	 * 分割符
    */
	public TransferPickerControl delimiter(Object value) {
		return (TransferPickerControl) this.set("delimiter", value);
	}
	
	/**
	 * 是否显示剪头
    */
	public TransferPickerControl showArrow(Object value) {
		return (TransferPickerControl) this.set("showArrow", value);
	}
	
	/**
	 * 当 searchResultMode 为 table 时定义表格列信息。
    */
	public TransferPickerControl searchResultColumns(Object value) {
		return (TransferPickerControl) this.set("searchResultColumns", value);
	}
	
	/**
	 * 树形模式下，仅选中子节点
    */
	public TransferPickerControl onlyChildren(Object value) {
		return (TransferPickerControl) this.set("onlyChildren", value);
	}
	
	/**
	 * 事件动作配置
    */
	public TransferPickerControl onEvent(Object value) {
		return (TransferPickerControl) this.set("onEvent", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public TransferPickerControl id(Object value) {
		return (TransferPickerControl) this.set("id", value);
	}
	
	/**
	 * 描述标题
    */
	public TransferPickerControl labelAlign(Object value) {
		return (TransferPickerControl) this.set("labelAlign", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public TransferPickerControl extraName(Object value) {
		return (TransferPickerControl) this.set("extraName", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public TransferPickerControl description(Object value) {
		return (TransferPickerControl) this.set("description", value);
	}
	
	/**
	 * 懒加载字段
    */
	public TransferPickerControl deferField(Object value) {
		return (TransferPickerControl) this.set("deferField", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public TransferPickerControl editorSetting(Object value) {
		return (TransferPickerControl) this.set("editorSetting", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public TransferPickerControl width(Object value) {
		return (TransferPickerControl) this.set("width", value);
	}
	
	/**
	 * 可搜索？
    */
	public TransferPickerControl searchable(Object value) {
		return (TransferPickerControl) this.set("searchable", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public TransferPickerControl hint(Object value) {
		return (TransferPickerControl) this.set("hint", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public TransferPickerControl descriptionClassName(Object value) {
		return (TransferPickerControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public TransferPickerControl mode(Object value) {
		return (TransferPickerControl) this.set("mode", value);
	}
	
	/**
	 * 右侧列表搜索框提示
    */
	public TransferPickerControl resultSearchPlaceholder(Object value) {
		return (TransferPickerControl) this.set("resultSearchPlaceholder", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public TransferPickerControl hiddenOn(Object value) {
		return (TransferPickerControl) this.set("hiddenOn", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public TransferPickerControl staticOn(Object value) {
		return (TransferPickerControl) this.set("staticOn", value);
	}
	
	/**
	 * 是否为多选模式
    */
	public TransferPickerControl multiple(Object value) {
		return (TransferPickerControl) this.set("multiple", value);
	}
	
	/**
	 * 用来丰富值的展示
    */
	public TransferPickerControl valueTpl(Object value) {
		return (TransferPickerControl) this.set("valueTpl", value);
	}
	
	/**
	 * 弹窗大小
    * 可选值: xs | sm | md | lg | xl | full
    */
	public TransferPickerControl pickerSize(Object value) {
		return (TransferPickerControl) this.set("pickerSize", value);
	}
	
	/**
	 * 是否静态展示
    */
	public TransferPickerControl static_(Object value) {
		return (TransferPickerControl) this.set("static_", value);
	}
	
	/**
	 * 是否可以编辑
    */
	public TransferPickerControl editable(Object value) {
		return (TransferPickerControl) this.set("editable", value);
	}
	
	/**
	 * 当 selectMode 为 associated 时用来定义左侧的选项
    */
	public TransferPickerControl leftOptions(Object value) {
		return (TransferPickerControl) this.set("leftOptions", value);
	}
	
	/**
	 * 当 selectMode 为 associated 时用来定义左侧的选择模式
    * 可选值: tree | list
    */
	public TransferPickerControl leftMode(Object value) {
		return (TransferPickerControl) this.set("leftMode", value);
	}
	
	/**
	 * 是否显示
    */
	public TransferPickerControl visible(Object value) {
		return (TransferPickerControl) this.set("visible", value);
	}
	
	/**
	 * 开启后将选中的选项 value 的值封装为数组，作为当前表单项的值。
    */
	public TransferPickerControl extractValue(Object value) {
		return (TransferPickerControl) this.set("extractValue", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public TransferPickerControl className(Object value) {
		return (TransferPickerControl) this.set("className", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public TransferPickerControl staticClassName(Object value) {
		return (TransferPickerControl) this.set("staticClassName", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public TransferPickerControl horizontal(Object value) {
		return (TransferPickerControl) this.set("horizontal", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public TransferPickerControl validateApi(Object value) {
		return (TransferPickerControl) this.set("validateApi", value);
	}
	
	/**
	 * 默认选择选项第一个值。
    */
	public TransferPickerControl selectFirst(Object value) {
		return (TransferPickerControl) this.set("selectFirst", value);
	}
	
	/**
	 * 控制新增弹框设置项
    */
	public TransferPickerControl addDialog(Object value) {
		return (TransferPickerControl) this.set("addDialog", value);
	}
	
	/**
	 * 左侧的标题文字
    */
	public TransferPickerControl selectTitle(Object value) {
		return (TransferPickerControl) this.set("selectTitle", value);
	}
	
	/**
	 * 占位符
    */
	public TransferPickerControl placeholder(Object value) {
		return (TransferPickerControl) this.set("placeholder", value);
	}
	
	/**
	 * 是否禁用
    */
	public TransferPickerControl disabled(Object value) {
		return (TransferPickerControl) this.set("disabled", value);
	}
	
	/**
	 * 新增时的表单项。
    */
	public TransferPickerControl addControls(Object value) {
		return (TransferPickerControl) this.set("addControls", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public TransferPickerControl clearValueOnHidden(Object value) {
		return (TransferPickerControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	 * 搜索结果展示模式
    * 可选值: table | list | tree | chained
    */
	public TransferPickerControl searchResultMode(Object value) {
		return (TransferPickerControl) this.set("searchResultMode", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public TransferPickerControl inline(Object value) {
		return (TransferPickerControl) this.set("inline", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public TransferPickerControl visibleOn(Object value) {
		return (TransferPickerControl) this.set("visibleOn", value);
	}
	
	/**
	    */
	public TransferPickerControl type(Object value) {
		return (TransferPickerControl) this.set("type", value);
	}
	
	/**
	 * 在选项数量达到多少时开启虚拟渲染
    */
	public TransferPickerControl virtualThreshold(Object value) {
		return (TransferPickerControl) this.set("virtualThreshold", value);
	}
	
	/**
	 * 用表达式来配置 source 接口初始要不要拉取
    */
	public TransferPickerControl initFetchOn(Object value) {
		return (TransferPickerControl) this.set("initFetchOn", value);
	}
	
	/**
	 * 控制编辑弹框设置项
    */
	public TransferPickerControl editDialog(Object value) {
		return (TransferPickerControl) this.set("editDialog", value);
	}
	
	/**
	 * 是否只读
    */
	public TransferPickerControl readOnly(Object value) {
		return (TransferPickerControl) this.set("readOnly", value);
	}
	
	/**
	 * 配置 input className
    */
	public TransferPickerControl inputClassName(Object value) {
		return (TransferPickerControl) this.set("inputClassName", value);
	}
	
	/**
	 * 配置 source 接口初始拉不拉取。
    */
	public TransferPickerControl initFetch(Object value) {
		return (TransferPickerControl) this.set("initFetch", value);
	}
	
	/**
	 * 是否可以新增
    */
	public TransferPickerControl creatable(Object value) {
		return (TransferPickerControl) this.set("creatable", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public TransferPickerControl name(Object value) {
		return (TransferPickerControl) this.set("name", value);
	}
	
	/**
	    */
	public TransferPickerControl desc(Object value) {
		return (TransferPickerControl) this.set("desc", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public TransferPickerControl staticInputClassName(Object value) {
		return (TransferPickerControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 只读条件
    */
	public TransferPickerControl readOnlyOn(Object value) {
		return (TransferPickerControl) this.set("readOnlyOn", value);
	}
	
	/**
	    */
	public TransferPickerControl testIdBuilder(Object value) {
		return (TransferPickerControl) this.set("testIdBuilder", value);
	}
	
	/**
	 * 可用来通过 API 拉取 options。
    */
	public TransferPickerControl source(Object value) {
		return (TransferPickerControl) this.set("source", value);
	}
	
	/**
	 * 是否默认都展开
    */
	public TransferPickerControl initiallyOpen(Object value) {
		return (TransferPickerControl) this.set("initiallyOpen", value);
	}
	
	/**
	 * ui级联关系，true代表级联选中，false代表不级联，默认为true
    */
	public TransferPickerControl autoCheckChildren(Object value) {
		return (TransferPickerControl) this.set("autoCheckChildren", value);
	}
	
	/**
	 * 新增文字
    */
	public TransferPickerControl createBtnLabel(Object value) {
		return (TransferPickerControl) this.set("createBtnLabel", value);
	}
	
	/**
	 * 勾选展示模式
    * 可选值: table | list | tree | chained | associated
    */
	public TransferPickerControl selectMode(Object value) {
		return (TransferPickerControl) this.set("selectMode", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public TransferPickerControl validationErrors(Object value) {
		return (TransferPickerControl) this.set("validationErrors", value);
	}
	
	/**
	 * 选项删除 API
    */
	public TransferPickerControl deleteApi(Object value) {
		return (TransferPickerControl) this.set("deleteApi", value);
	}
	
	/**
	    */
	public TransferPickerControl initAutoFill(Object value) {
		return (TransferPickerControl) this.set("initAutoFill", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public TransferPickerControl staticPlaceholder(Object value) {
		return (TransferPickerControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 组件样式
    */
	public TransferPickerControl style(Object value) {
		return (TransferPickerControl) this.set("style", value);
	}
	
	/**
	 * 点清除按钮时，将表单项设置成当前配置的值。
    */
	public TransferPickerControl resetValue(Object value) {
		return (TransferPickerControl) this.set("resetValue", value);
	}
	
	/**
	 * 结果面板是否追踪显示
    */
	public TransferPickerControl resultListModeFollowSelect(Object value) {
		return (TransferPickerControl) this.set("resultListModeFollowSelect", value);
	}
	
	/**
	 * 搜索 API
    */
	public TransferPickerControl searchApi(Object value) {
		return (TransferPickerControl) this.set("searchApi", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public TransferPickerControl disabledOn(Object value) {
		return (TransferPickerControl) this.set("disabledOn", value);
	}
	
	/**
	 * 编辑时调用的 API
    */
	public TransferPickerControl editApi(Object value) {
		return (TransferPickerControl) this.set("editApi", value);
	}
	}