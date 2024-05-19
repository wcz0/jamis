package com.wcz0.renderers;
/**
 * Transfer 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/transfer

 * @author wcz0
 * @version 6.2.2
 */
public class TransferControl extends BaseRenderer {

	public TransferControl() {
		this.set("type", "transferControl");
	}

	/**
	 * 选项集合
    */
	public TransferControl options(Object value) {
		return (TransferControl) this.set("options", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public TransferControl labelRemark(Object value) {
		return (TransferControl) this.set("labelRemark", value);
	}
	
	/**
	 * 左侧列表搜索框提示
    */
	public TransferControl searchPlaceholder(Object value) {
		return (TransferControl) this.set("searchPlaceholder", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public TransferControl value(Object value) {
		return (TransferControl) this.set("value", value);
	}
	
	/**
	 * 是否显示
    */
	public TransferControl visible(Object value) {
		return (TransferControl) this.set("visible", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public TransferControl staticInputClassName(Object value) {
		return (TransferControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 当 selectMode 为 associated 时用来定义左侧的选择模式
    * 可选值: tree | list
    */
	public TransferControl leftMode(Object value) {
		return (TransferControl) this.set("leftMode", value);
	}
	
	/**
	 * 新增文字
    */
	public TransferControl createBtnLabel(Object value) {
		return (TransferControl) this.set("createBtnLabel", value);
	}
	
	/**
	 * 是否可以编辑
    */
	public TransferControl editable(Object value) {
		return (TransferControl) this.set("editable", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public TransferControl staticOn(Object value) {
		return (TransferControl) this.set("staticOn", value);
	}
	
	/**
	 * 统计数字
    */
	public TransferControl statistics(Object value) {
		return (TransferControl) this.set("statistics", value);
	}
	
	/**
	 * 可排序？
    */
	public TransferControl sortable(Object value) {
		return (TransferControl) this.set("sortable", value);
	}
	
	/**
	 * 在选项数量达到多少时开启虚拟渲染
    */
	public TransferControl virtualThreshold(Object value) {
		return (TransferControl) this.set("virtualThreshold", value);
	}
	
	/**
	 * 控制新增弹框设置项
    */
	public TransferControl addDialog(Object value) {
		return (TransferControl) this.set("addDialog", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public TransferControl submitOnChange(Object value) {
		return (TransferControl) this.set("submitOnChange", value);
	}
	
	/**
	 * 自动填充，当选项被选择的时候，将选项中的其他值同步设置到表单内。
    */
	public TransferControl autoFill(Object value) {
		return (TransferControl) this.set("autoFill", value);
	}
	
	/**
	 * 组件样式
    */
	public TransferControl style(Object value) {
		return (TransferControl) this.set("style", value);
	}
	
	/**
	 * 表单项类型
    */
	public TransferControl type(Object value) {
		return (TransferControl) this.set("type", value);
	}
	
	/**
	 * 分割符
    */
	public TransferControl delimiter(Object value) {
		return (TransferControl) this.set("delimiter", value);
	}
	
	/**
	 * 配置 input className
    */
	public TransferControl inputClassName(Object value) {
		return (TransferControl) this.set("inputClassName", value);
	}
	
	/**
	 * 当 selectMode 为 table 时定义表格列信息。
    */
	public TransferControl columns(Object value) {
		return (TransferControl) this.set("columns", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public TransferControl width(Object value) {
		return (TransferControl) this.set("width", value);
	}
	
	/**
	    */
	public TransferControl loadingConfig(Object value) {
		return (TransferControl) this.set("loadingConfig", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public TransferControl hint(Object value) {
		return (TransferControl) this.set("hint", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public TransferControl disabledOn(Object value) {
		return (TransferControl) this.set("disabledOn", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public TransferControl remark(Object value) {
		return (TransferControl) this.set("remark", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public TransferControl staticClassName(Object value) {
		return (TransferControl) this.set("staticClassName", value);
	}
	
	/**
	 * 编辑时调用的 API
    */
	public TransferControl editApi(Object value) {
		return (TransferControl) this.set("editApi", value);
	}
	
	/**
	    */
	public TransferControl initAutoFill(Object value) {
		return (TransferControl) this.set("initAutoFill", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public TransferControl name(Object value) {
		return (TransferControl) this.set("name", value);
	}
	
	/**
	 * 事件动作配置
    */
	public TransferControl onEvent(Object value) {
		return (TransferControl) this.set("onEvent", value);
	}
	
	/**
	 * 分页配置，selectMode为默认和table才会生效
    */
	public TransferControl pagination(Object value) {
		return (TransferControl) this.set("pagination", value);
	}
	
	/**
	 * 添加时调用的接口
    */
	public TransferControl addApi(Object value) {
		return (TransferControl) this.set("addApi", value);
	}
	
	/**
	 * 是否可删除
    */
	public TransferControl removable(Object value) {
		return (TransferControl) this.set("removable", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public TransferControl size(Object value) {
		return (TransferControl) this.set("size", value);
	}
	
	/**
	 * 描述标题
    */
	public TransferControl label(Object value) {
		return (TransferControl) this.set("label", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public TransferControl id(Object value) {
		return (TransferControl) this.set("id", value);
	}
	
	/**
	 * 当 searchResultMode 为 table 时定义表格列信息。
    */
	public TransferControl searchResultColumns(Object value) {
		return (TransferControl) this.set("searchResultColumns", value);
	}
	
	/**
	 * 左侧的标题文字
    */
	public TransferControl selectTitle(Object value) {
		return (TransferControl) this.set("selectTitle", value);
	}
	
	/**
	    */
	public TransferControl desc(Object value) {
		return (TransferControl) this.set("desc", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public TransferControl mode(Object value) {
		return (TransferControl) this.set("mode", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public TransferControl validateApi(Object value) {
		return (TransferControl) this.set("validateApi", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public TransferControl $$id(Object value) {
		return (TransferControl) this.set("$$id", value);
	}
	
	/**
	 * 是否显示剪头
    */
	public TransferControl showArrow(Object value) {
		return (TransferControl) this.set("showArrow", value);
	}
	
	/**
	 * 搜索 API
    */
	public TransferControl searchApi(Object value) {
		return (TransferControl) this.set("searchApi", value);
	}
	
	/**
	 * 树形模式下，仅选中子节点
    */
	public TransferControl onlyChildren(Object value) {
		return (TransferControl) this.set("onlyChildren", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public TransferControl staticLabelClassName(Object value) {
		return (TransferControl) this.set("staticLabelClassName", value);
	}
	
	/**
	    */
	public TransferControl staticSchema(Object value) {
		return (TransferControl) this.set("staticSchema", value);
	}
	
	/**
	 * 是否默认都展开
    */
	public TransferControl initiallyOpen(Object value) {
		return (TransferControl) this.set("initiallyOpen", value);
	}
	
	/**
	 * 描述标题
    */
	public TransferControl labelAlign(Object value) {
		return (TransferControl) this.set("labelAlign", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public TransferControl extraName(Object value) {
		return (TransferControl) this.set("extraName", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public TransferControl validationErrors(Object value) {
		return (TransferControl) this.set("validationErrors", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public TransferControl visibleOn(Object value) {
		return (TransferControl) this.set("visibleOn", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public TransferControl validateOnChange(Object value) {
		return (TransferControl) this.set("validateOnChange", value);
	}
	
	/**
	 * 勾选展示模式
    * 可选值: table | list | tree | chained | associated
    */
	public TransferControl selectMode(Object value) {
		return (TransferControl) this.set("selectMode", value);
	}
	
	/**
	 * 当 selectMode 为 associated 时用来定义右侧的选择模式
    * 可选值: table | list | tree | chained
    */
	public TransferControl rightMode(Object value) {
		return (TransferControl) this.set("rightMode", value);
	}
	
	/**
	 * 只读条件
    */
	public TransferControl readOnlyOn(Object value) {
		return (TransferControl) this.set("readOnlyOn", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public TransferControl staticPlaceholder(Object value) {
		return (TransferControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public TransferControl useMobileUI(Object value) {
		return (TransferControl) this.set("useMobileUI", value);
	}
	
	/**
	 * 可搜索？
    */
	public TransferControl searchable(Object value) {
		return (TransferControl) this.set("searchable", value);
	}
	
	/**
	 * 可用来通过 API 拉取 options。
    */
	public TransferControl source(Object value) {
		return (TransferControl) this.set("source", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public TransferControl clearValueOnHidden(Object value) {
		return (TransferControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	 * 是否禁用
    */
	public TransferControl disabled(Object value) {
		return (TransferControl) this.set("disabled", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public TransferControl descriptionClassName(Object value) {
		return (TransferControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 用来丰富值的展示
    */
	public TransferControl valueTpl(Object value) {
		return (TransferControl) this.set("valueTpl", value);
	}
	
	/**
	 * 控制编辑弹框设置项
    */
	public TransferControl editDialog(Object value) {
		return (TransferControl) this.set("editDialog", value);
	}
	
	/**
	 * 延时加载的 API，当选项中有 defer: true 的选项时，点开会通过此接口扩充。
    */
	public TransferControl deferApi(Object value) {
		return (TransferControl) this.set("deferApi", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public TransferControl inline(Object value) {
		return (TransferControl) this.set("inline", value);
	}
	
	/**
	    */
	public TransferControl validations(Object value) {
		return (TransferControl) this.set("validations", value);
	}
	
	/**
	 * 用表达式来配置 source 接口初始要不要拉取
    */
	public TransferControl initFetchOn(Object value) {
		return (TransferControl) this.set("initFetchOn", value);
	}
	
	/**
	 * 单个选项的高度，主要用于虚拟渲染
    */
	public TransferControl itemHeight(Object value) {
		return (TransferControl) this.set("itemHeight", value);
	}
	
	/**
	 * 搜索结果展示模式
    * 可选值: table | list | tree | chained
    */
	public TransferControl searchResultMode(Object value) {
		return (TransferControl) this.set("searchResultMode", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public TransferControl className(Object value) {
		return (TransferControl) this.set("className", value);
	}
	
	/**
	 * 用来丰富选项展示
    */
	public TransferControl menuTpl(Object value) {
		return (TransferControl) this.set("menuTpl", value);
	}
	
	/**
	 * 点清除按钮时，将表单项设置成当前配置的值。
    */
	public TransferControl resetValue(Object value) {
		return (TransferControl) this.set("resetValue", value);
	}
	
	/**
	 * 占位符
    */
	public TransferControl placeholder(Object value) {
		return (TransferControl) this.set("placeholder", value);
	}
	
	/**
	 * 是否可以新增
    */
	public TransferControl creatable(Object value) {
		return (TransferControl) this.set("creatable", value);
	}
	
	/**
	 * 当在value值未匹配到当前options中的选项时，是否value值对应文本飘红显示
    */
	public TransferControl showInvalidMatch(Object value) {
		return (TransferControl) this.set("showInvalidMatch", value);
	}
	
	/**
	 * 配置 source 接口初始拉不拉取。
    */
	public TransferControl initFetch(Object value) {
		return (TransferControl) this.set("initFetch", value);
	}
	
	/**
	 * 选项修改的表单项
    */
	public TransferControl editControls(Object value) {
		return (TransferControl) this.set("editControls", value);
	}
	
	/**
	 * 选项删除 API
    */
	public TransferControl deleteApi(Object value) {
		return (TransferControl) this.set("deleteApi", value);
	}
	
	/**
	 * 是否静态展示
    */
	public TransferControl static_(Object value) {
		return (TransferControl) this.set("static_", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public TransferControl hiddenOn(Object value) {
		return (TransferControl) this.set("hiddenOn", value);
	}
	
	/**
	 * 右侧结果的标题文字
    */
	public TransferControl resultTitle(Object value) {
		return (TransferControl) this.set("resultTitle", value);
	}
	
	/**
	 * 右侧列表搜索框提示
    */
	public TransferControl resultSearchPlaceholder(Object value) {
		return (TransferControl) this.set("resultSearchPlaceholder", value);
	}
	
	/**
	 * 默认选择选项第一个值。
    */
	public TransferControl selectFirst(Object value) {
		return (TransferControl) this.set("selectFirst", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public TransferControl labelWidth(Object value) {
		return (TransferControl) this.set("labelWidth", value);
	}
	
	/**
	 * 是否只读
    */
	public TransferControl readOnly(Object value) {
		return (TransferControl) this.set("readOnly", value);
	}
	
	/**
	 * 结果（右则）列表的检索功能，当设置为true时，可以通过输入检索模糊匹配检索内容
    */
	public TransferControl resultSearchable(Object value) {
		return (TransferControl) this.set("resultSearchable", value);
	}
	
	/**
	 * 多选模式，值太多时是否避免折行
    */
	public TransferControl valuesNoWrap(Object value) {
		return (TransferControl) this.set("valuesNoWrap", value);
	}
	
	/**
	 * 开启后将选中的选项 value 的值封装为数组，作为当前表单项的值。
    */
	public TransferControl extractValue(Object value) {
		return (TransferControl) this.set("extractValue", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public TransferControl editorSetting(Object value) {
		return (TransferControl) this.set("editorSetting", value);
	}
	
	/**
	    */
	public TransferControl testIdBuilder(Object value) {
		return (TransferControl) this.set("testIdBuilder", value);
	}
	
	/**
	 * 是否为多选模式
    */
	public TransferControl multiple(Object value) {
		return (TransferControl) this.set("multiple", value);
	}
	
	/**
	 * 单选模式：当用户选中某个选项时，选项中的 value 将被作为该表单项的值提交，否则，整个选项对象都会作为该表单项的值提交。 多选模式：选中的多个选项的 `value` 会通过 `delimiter` 连接起来，否则直接将以数组的形式提交值。
    */
	public TransferControl joinValues(Object value) {
		return (TransferControl) this.set("joinValues", value);
	}
	
	/**
	 * 新增时的表单项。
    */
	public TransferControl addControls(Object value) {
		return (TransferControl) this.set("addControls", value);
	}
	
	/**
	 * 是否隐藏
    */
	public TransferControl hidden(Object value) {
		return (TransferControl) this.set("hidden", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public TransferControl description(Object value) {
		return (TransferControl) this.set("description", value);
	}
	
	/**
	 * 是否可清除。
    */
	public TransferControl clearable(Object value) {
		return (TransferControl) this.set("clearable", value);
	}
	
	/**
	 * 懒加载字段
    */
	public TransferControl deferField(Object value) {
		return (TransferControl) this.set("deferField", value);
	}
	
	/**
	 * 配置 label className
    */
	public TransferControl labelClassName(Object value) {
		return (TransferControl) this.set("labelClassName", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public TransferControl horizontal(Object value) {
		return (TransferControl) this.set("horizontal", value);
	}
	
	/**
	 * ui级联关系，true代表级联选中，false代表不级联，默认为true
    */
	public TransferControl autoCheckChildren(Object value) {
		return (TransferControl) this.set("autoCheckChildren", value);
	}
	
	/**
	 * 选项删除提示文字。
    */
	public TransferControl deleteConfirmText(Object value) {
		return (TransferControl) this.set("deleteConfirmText", value);
	}
	
	/**
	 * 是否为必填
    */
	public TransferControl required(Object value) {
		return (TransferControl) this.set("required", value);
	}
	
	/**
	 * 结果面板是否追踪显示
    */
	public TransferControl resultListModeFollowSelect(Object value) {
		return (TransferControl) this.set("resultListModeFollowSelect", value);
	}
	
	/**
	 * 当 selectMode 为 associated 时用来定义左侧的选项
    */
	public TransferControl leftOptions(Object value) {
		return (TransferControl) this.set("leftOptions", value);
	}
	}