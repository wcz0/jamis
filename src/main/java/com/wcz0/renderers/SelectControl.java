package com.wcz0.renderers;
/**
 * Select 下拉选择框。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/select

 * @author wcz0
 * @version 6.2.2
 */
public class SelectControl extends BaseRenderer {

	public SelectControl() {
		this.set("type", "selectControl");
	}

	public SelectControl set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 配置 label className
    */
	public SelectControl labelClassName(Object value) {
		return (SelectControl) this.set("labelClassName", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public SelectControl horizontal(Object value) {
		return (SelectControl) this.set("horizontal", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public SelectControl visibleOn(Object value) {
		return (SelectControl) this.set("visibleOn", value);
	}
	
	/**
	 * 搜索结果展示模式
    * 可选值: table | list | tree | chained
    */
	public SelectControl searchResultMode(Object value) {
		return (SelectControl) this.set("searchResultMode", value);
	}
	
	/**
	 * 用表达式来配置 source 接口初始要不要拉取
    */
	public SelectControl initFetchOn(Object value) {
		return (SelectControl) this.set("initFetchOn", value);
	}
	
	/**
	 * 新增文字
    */
	public SelectControl createBtnLabel(Object value) {
		return (SelectControl) this.set("createBtnLabel", value);
	}
	
	/**
	 * 是否可删除
    */
	public SelectControl removable(Object value) {
		return (SelectControl) this.set("removable", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public SelectControl mode(Object value) {
		return (SelectControl) this.set("mode", value);
	}
	
	/**
	 * 是否静态展示
    */
	public SelectControl static_(Object value) {
		return (SelectControl) this.set("static_", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public SelectControl staticInputClassName(Object value) {
		return (SelectControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 当 searchResultMode 为 table 时定义表格列信息。
    */
	public SelectControl searchResultColumns(Object value) {
		return (SelectControl) this.set("searchResultColumns", value);
	}
	
	/**
	 * 控制编辑弹框设置项
    */
	public SelectControl editDialog(Object value) {
		return (SelectControl) this.set("editDialog", value);
	}
	
	/**
	 * 只读条件
    */
	public SelectControl readOnlyOn(Object value) {
		return (SelectControl) this.set("readOnlyOn", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public SelectControl description(Object value) {
		return (SelectControl) this.set("description", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public SelectControl submitOnChange(Object value) {
		return (SelectControl) this.set("submitOnChange", value);
	}
	
	/**
	 * 是否显示
    */
	public SelectControl visible(Object value) {
		return (SelectControl) this.set("visible", value);
	}
	
	/**
	 * 表单项类型
    * 可选值: select | multi-select
    */
	public SelectControl type(Object value) {
		return (SelectControl) this.set("type", value);
	}
	
	/**
	 * 当 selectMode 为 associated 时用来定义左侧的选择模式
    * 可选值: tree | list
    */
	public SelectControl leftMode(Object value) {
		return (SelectControl) this.set("leftMode", value);
	}
	
	/**
	 * 在选项数量达到多少时开启虚拟渲染
    */
	public SelectControl virtualThreshold(Object value) {
		return (SelectControl) this.set("virtualThreshold", value);
	}
	
	/**
	 * 是否可以新增
    */
	public SelectControl creatable(Object value) {
		return (SelectControl) this.set("creatable", value);
	}
	
	/**
	 * 选项修改的表单项
    */
	public SelectControl editControls(Object value) {
		return (SelectControl) this.set("editControls", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public SelectControl name(Object value) {
		return (SelectControl) this.set("name", value);
	}
	
	/**
	 * 可多选条件下，是否默认全选中所有值
    */
	public SelectControl defaultCheckAll(Object value) {
		return (SelectControl) this.set("defaultCheckAll", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public SelectControl validateApi(Object value) {
		return (SelectControl) this.set("validateApi", value);
	}
	
	/**
	 * 是否可搜索
    */
	public SelectControl searchable(Object value) {
		return (SelectControl) this.set("searchable", value);
	}
	
	/**
	 * 是否可清除。
    */
	public SelectControl clearable(Object value) {
		return (SelectControl) this.set("clearable", value);
	}
	
	/**
	 * 控制新增弹框设置项
    */
	public SelectControl addDialog(Object value) {
		return (SelectControl) this.set("addDialog", value);
	}
	
	/**
	 * 描述标题
    */
	public SelectControl label(Object value) {
		return (SelectControl) this.set("label", value);
	}
	
	/**
	    */
	public SelectControl initAutoFill(Object value) {
		return (SelectControl) this.set("initAutoFill", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public SelectControl extraName(Object value) {
		return (SelectControl) this.set("extraName", value);
	}
	
	/**
	 * 是否为必填
    */
	public SelectControl required(Object value) {
		return (SelectControl) this.set("required", value);
	}
	
	/**
	    */
	public SelectControl validations(Object value) {
		return (SelectControl) this.set("validations", value);
	}
	
	/**
	 * 默认选择选项第一个值。
    */
	public SelectControl selectFirst(Object value) {
		return (SelectControl) this.set("selectFirst", value);
	}
	
	/**
	 * 单选模式：当用户选中某个选项时，选项中的 value 将被作为该表单项的值提交，否则，整个选项对象都会作为该表单项的值提交。 多选模式：选中的多个选项的 `value` 会通过 `delimiter` 连接起来，否则直接将以数组的形式提交值。
    */
	public SelectControl joinValues(Object value) {
		return (SelectControl) this.set("joinValues", value);
	}
	
	/**
	 * 是否可以编辑
    */
	public SelectControl editable(Object value) {
		return (SelectControl) this.set("editable", value);
	}
	
	/**
	 * 设置label字段
    */
	public SelectControl labelField(Object value) {
		return (SelectControl) this.set("labelField", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public SelectControl remark(Object value) {
		return (SelectControl) this.set("remark", value);
	}
	
	/**
	 * 勾选展示模式
    * 可选值: table | group | tree | chained | associated
    */
	public SelectControl selectMode(Object value) {
		return (SelectControl) this.set("selectMode", value);
	}
	
	/**
	 * 当 selectMode 为 table 时定义表格列信息。
    */
	public SelectControl columns(Object value) {
		return (SelectControl) this.set("columns", value);
	}
	
	/**
	    */
	public SelectControl desc(Object value) {
		return (SelectControl) this.set("desc", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public SelectControl staticPlaceholder(Object value) {
		return (SelectControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 自动完成 API，当输入部分文字的时候，会将这些文字通过 ${term} 可以取到，发送给接口。 接口可以返回匹配到的选项，帮助用户输入。
    */
	public SelectControl autoComplete(Object value) {
		return (SelectControl) this.set("autoComplete", value);
	}
	
	/**
	 * 配置 source 接口初始拉不拉取。
    */
	public SelectControl initFetch(Object value) {
		return (SelectControl) this.set("initFetch", value);
	}
	
	/**
	 * 多选模式，值太多时是否避免折行
    */
	public SelectControl valuesNoWrap(Object value) {
		return (SelectControl) this.set("valuesNoWrap", value);
	}
	
	/**
	 * 编辑时调用的 API
    */
	public SelectControl editApi(Object value) {
		return (SelectControl) this.set("editApi", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public SelectControl hint(Object value) {
		return (SelectControl) this.set("hint", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public SelectControl descriptionClassName(Object value) {
		return (SelectControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 单个选项的高度，主要用于虚拟渲染
    */
	public SelectControl itemHeight(Object value) {
		return (SelectControl) this.set("itemHeight", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public SelectControl size(Object value) {
		return (SelectControl) this.set("size", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public SelectControl staticClassName(Object value) {
		return (SelectControl) this.set("staticClassName", value);
	}
	
	/**
	 * 边框模式，全边框，还是半边框，或者没边框。
    * 可选值: full | half | none
    */
	public SelectControl borderMode(Object value) {
		return (SelectControl) this.set("borderMode", value);
	}
	
	/**
	 * 开启后将选中的选项 value 的值封装为数组，作为当前表单项的值。
    */
	public SelectControl extractValue(Object value) {
		return (SelectControl) this.set("extractValue", value);
	}
	
	/**
	 * 懒加载字段
    */
	public SelectControl deferField(Object value) {
		return (SelectControl) this.set("deferField", value);
	}
	
	/**
	 * 延时加载的 API，当选项中有 defer: true 的选项时，点开会通过此接口扩充。
    */
	public SelectControl deferApi(Object value) {
		return (SelectControl) this.set("deferApi", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public SelectControl id(Object value) {
		return (SelectControl) this.set("id", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public SelectControl staticOn(Object value) {
		return (SelectControl) this.set("staticOn", value);
	}
	
	/**
	 * 组件样式
    */
	public SelectControl style(Object value) {
		return (SelectControl) this.set("style", value);
	}
	
	/**
	 * 可以自定义菜单展示。
    */
	public SelectControl menuTpl(Object value) {
		return (SelectControl) this.set("menuTpl", value);
	}
	
	/**
	 * 下拉框 Popover 设置
    */
	public SelectControl overlay(Object value) {
		return (SelectControl) this.set("overlay", value);
	}
	
	/**
	 * 描述标题
    */
	public SelectControl labelAlign(Object value) {
		return (SelectControl) this.set("labelAlign", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public SelectControl validateOnChange(Object value) {
		return (SelectControl) this.set("validateOnChange", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public SelectControl value(Object value) {
		return (SelectControl) this.set("value", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public SelectControl width(Object value) {
		return (SelectControl) this.set("width", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public SelectControl labelWidth(Object value) {
		return (SelectControl) this.set("labelWidth", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public SelectControl disabledOn(Object value) {
		return (SelectControl) this.set("disabledOn", value);
	}
	
	/**
	 * 是否隐藏
    */
	public SelectControl hidden(Object value) {
		return (SelectControl) this.set("hidden", value);
	}
	
	/**
	    */
	public SelectControl staticSchema(Object value) {
		return (SelectControl) this.set("staticSchema", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public SelectControl editorSetting(Object value) {
		return (SelectControl) this.set("editorSetting", value);
	}
	
	/**
	 * 可用来通过 API 拉取 options。
    */
	public SelectControl source(Object value) {
		return (SelectControl) this.set("source", value);
	}
	
	/**
	 * 是否为多选模式
    */
	public SelectControl multiple(Object value) {
		return (SelectControl) this.set("multiple", value);
	}
	
	/**
	 * 选项删除 API
    */
	public SelectControl deleteApi(Object value) {
		return (SelectControl) this.set("deleteApi", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public SelectControl labelRemark(Object value) {
		return (SelectControl) this.set("labelRemark", value);
	}
	
	/**
	 * 选项的自定义CSS类名
    */
	public SelectControl optionClassName(Object value) {
		return (SelectControl) this.set("optionClassName", value);
	}
	
	/**
	 * 事件动作配置
    */
	public SelectControl onEvent(Object value) {
		return (SelectControl) this.set("onEvent", value);
	}
	
	/**
	 * 标签的最大展示数量，超出数量后以收纳浮层的方式展示，仅在多选模式开启后生效
    */
	public SelectControl maxTagCount(Object value) {
		return (SelectControl) this.set("maxTagCount", value);
	}
	
	/**
	 * 点清除按钮时，将表单项设置成当前配置的值。
    */
	public SelectControl resetValue(Object value) {
		return (SelectControl) this.set("resetValue", value);
	}
	
	/**
	 * 占位符
    */
	public SelectControl placeholder(Object value) {
		return (SelectControl) this.set("placeholder", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public SelectControl validationErrors(Object value) {
		return (SelectControl) this.set("validationErrors", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public SelectControl useMobileUI(Object value) {
		return (SelectControl) this.set("useMobileUI", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public SelectControl inline(Object value) {
		return (SelectControl) this.set("inline", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public SelectControl clearValueOnHidden(Object value) {
		return (SelectControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public SelectControl className(Object value) {
		return (SelectControl) this.set("className", value);
	}
	
	/**
	 * 是否禁用
    */
	public SelectControl disabled(Object value) {
		return (SelectControl) this.set("disabled", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public SelectControl hiddenOn(Object value) {
		return (SelectControl) this.set("hiddenOn", value);
	}
	
	/**
	    */
	public SelectControl loadingConfig(Object value) {
		return (SelectControl) this.set("loadingConfig", value);
	}
	
	/**
	 * 新增时的表单项。
    */
	public SelectControl addControls(Object value) {
		return (SelectControl) this.set("addControls", value);
	}
	
	/**
	 * 自动填充，当选项被选择的时候，将选项中的其他值同步设置到表单内。
    */
	public SelectControl autoFill(Object value) {
		return (SelectControl) this.set("autoFill", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public SelectControl staticLabelClassName(Object value) {
		return (SelectControl) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 搜索 API
    */
	public SelectControl searchApi(Object value) {
		return (SelectControl) this.set("searchApi", value);
	}
	
	/**
	 * 配置 input className
    */
	public SelectControl inputClassName(Object value) {
		return (SelectControl) this.set("inputClassName", value);
	}
	
	/**
	 * 可多选条件下，是否可全选
    */
	public SelectControl checkAll(Object value) {
		return (SelectControl) this.set("checkAll", value);
	}
	
	/**
	 * 可多选条件下，全选项文案，默认 ”全选“
    */
	public SelectControl checkAllLabel(Object value) {
		return (SelectControl) this.set("checkAllLabel", value);
	}
	
	/**
	 * 设置value字段
    */
	public SelectControl valueField(Object value) {
		return (SelectControl) this.set("valueField", value);
	}
	
	/**
	 * 是否自动选中子节点
    */
	public SelectControl autoCheckChildren(Object value) {
		return (SelectControl) this.set("autoCheckChildren", value);
	}
	
	/**
	 * 分割符
    */
	public SelectControl delimiter(Object value) {
		return (SelectControl) this.set("delimiter", value);
	}
	
	/**
	 * 添加时调用的接口
    */
	public SelectControl addApi(Object value) {
		return (SelectControl) this.set("addApi", value);
	}
	
	/**
	 * 当 selectMode 为 associated 时用来定义左侧的选项
    */
	public SelectControl leftOptions(Object value) {
		return (SelectControl) this.set("leftOptions", value);
	}
	
	/**
	 * 当在value值未匹配到当前options中的选项时，是否value值对应文本飘红显示
    */
	public SelectControl showInvalidMatch(Object value) {
		return (SelectControl) this.set("showInvalidMatch", value);
	}
	
	/**
	 * 当 selectMode 为 associated 时用来定义右侧的选择模式
    * 可选值: table | list | tree | chained
    */
	public SelectControl rightMode(Object value) {
		return (SelectControl) this.set("rightMode", value);
	}
	
	/**
	 * 收纳标签的Popover配置
    */
	public SelectControl overflowTagPopover(Object value) {
		return (SelectControl) this.set("overflowTagPopover", value);
	}
	
	/**
	 * 选项集合
    */
	public SelectControl options(Object value) {
		return (SelectControl) this.set("options", value);
	}
	
	/**
	 * 选项删除提示文字。
    */
	public SelectControl deleteConfirmText(Object value) {
		return (SelectControl) this.set("deleteConfirmText", value);
	}
	
	/**
	 * 是否只读
    */
	public SelectControl readOnly(Object value) {
		return (SelectControl) this.set("readOnly", value);
	}
	}