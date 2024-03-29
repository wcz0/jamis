package com.wcz0.renderers;
/**
 * Tag 输入框 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/tag

 * @author wcz0
 * @version 6.2.2
 */
public class TagControl extends BaseRenderer {

	public TagControl() {
		this.set("type", "tagControl");
	}

	public TagControl set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 描述内容，支持 Html 片段。
    */
	public TagControl description(Object value) {
		return (TagControl) this.set("description", value);
	}
	
	/**
	 * 配置 input className
    */
	public TagControl inputClassName(Object value) {
		return (TagControl) this.set("inputClassName", value);
	}
	
	/**
	    */
	public TagControl validations(Object value) {
		return (TagControl) this.set("validations", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public TagControl validateApi(Object value) {
		return (TagControl) this.set("validateApi", value);
	}
	
	/**
	 * 是否静态展示
    */
	public TagControl static_(Object value) {
		return (TagControl) this.set("static_", value);
	}
	
	/**
	 * 是否为多选模式
    */
	public TagControl multiple(Object value) {
		return (TagControl) this.set("multiple", value);
	}
	
	/**
	 * 分割符
    */
	public TagControl delimiter(Object value) {
		return (TagControl) this.set("delimiter", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public TagControl extraName(Object value) {
		return (TagControl) this.set("extraName", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public TagControl staticOn(Object value) {
		return (TagControl) this.set("staticOn", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public TagControl name(Object value) {
		return (TagControl) this.set("name", value);
	}
	
	/**
	 * 标签的最大展示数量，超出数量后以收纳浮层的方式展示，仅在多选模式开启后生效
    */
	public TagControl maxTagCount(Object value) {
		return (TagControl) this.set("maxTagCount", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public TagControl width(Object value) {
		return (TagControl) this.set("width", value);
	}
	
	/**
	 * 多选模式，值太多时是否避免折行
    */
	public TagControl valuesNoWrap(Object value) {
		return (TagControl) this.set("valuesNoWrap", value);
	}
	
	/**
	 * 是否可以新增
    */
	public TagControl creatable(Object value) {
		return (TagControl) this.set("creatable", value);
	}
	
	/**
	 * 选项修改的表单项
    */
	public TagControl editControls(Object value) {
		return (TagControl) this.set("editControls", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public TagControl mode(Object value) {
		return (TagControl) this.set("mode", value);
	}
	
	/**
	 * 是否显示
    */
	public TagControl visible(Object value) {
		return (TagControl) this.set("visible", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public TagControl remark(Object value) {
		return (TagControl) this.set("remark", value);
	}
	
	/**
	 * 选项集合
    */
	public TagControl options(Object value) {
		return (TagControl) this.set("options", value);
	}
	
	/**
	 * 是否可以编辑
    */
	public TagControl editable(Object value) {
		return (TagControl) this.set("editable", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public TagControl descriptionClassName(Object value) {
		return (TagControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public TagControl labelWidth(Object value) {
		return (TagControl) this.set("labelWidth", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public TagControl hiddenOn(Object value) {
		return (TagControl) this.set("hiddenOn", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public TagControl useMobileUI(Object value) {
		return (TagControl) this.set("useMobileUI", value);
	}
	
	/**
	 * 是否禁用
    */
	public TagControl disabled(Object value) {
		return (TagControl) this.set("disabled", value);
	}
	
	/**
	 * 选项删除提示文字。
    */
	public TagControl deleteConfirmText(Object value) {
		return (TagControl) this.set("deleteConfirmText", value);
	}
	
	/**
	 * 描述标题
    */
	public TagControl label(Object value) {
		return (TagControl) this.set("label", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public TagControl hint(Object value) {
		return (TagControl) this.set("hint", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public TagControl editorSetting(Object value) {
		return (TagControl) this.set("editorSetting", value);
	}
	
	/**
	 * 懒加载字段
    */
	public TagControl deferField(Object value) {
		return (TagControl) this.set("deferField", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public TagControl value(Object value) {
		return (TagControl) this.set("value", value);
	}
	
	/**
	 * 是否隐藏
    */
	public TagControl hidden(Object value) {
		return (TagControl) this.set("hidden", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public TagControl staticLabelClassName(Object value) {
		return (TagControl) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 开启批量添加后，输入多个标签的分隔符，支持传入多个符号，默认为"-"
    */
	public TagControl separator(Object value) {
		return (TagControl) this.set("separator", value);
	}
	
	/**
	 * 用表达式来配置 source 接口初始要不要拉取
    */
	public TagControl initFetchOn(Object value) {
		return (TagControl) this.set("initFetchOn", value);
	}
	
	/**
	 * 是否只读
    */
	public TagControl readOnly(Object value) {
		return (TagControl) this.set("readOnly", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public TagControl disabledOn(Object value) {
		return (TagControl) this.set("disabledOn", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public TagControl validationErrors(Object value) {
		return (TagControl) this.set("validationErrors", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public TagControl staticInputClassName(Object value) {
		return (TagControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 收纳标签的Popover配置
    */
	public TagControl overflowTagPopover(Object value) {
		return (TagControl) this.set("overflowTagPopover", value);
	}
	
	/**
	 * 添加时调用的接口
    */
	public TagControl addApi(Object value) {
		return (TagControl) this.set("addApi", value);
	}
	
	/**
	 * 选项删除 API
    */
	public TagControl deleteApi(Object value) {
		return (TagControl) this.set("deleteApi", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public TagControl size(Object value) {
		return (TagControl) this.set("size", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public TagControl staticPlaceholder(Object value) {
		return (TagControl) this.set("staticPlaceholder", value);
	}
	
	/**
	    */
	public TagControl staticSchema(Object value) {
		return (TagControl) this.set("staticSchema", value);
	}
	
	/**
	 * 允许添加的标签的最大数量
    */
	public TagControl max(Object value) {
		return (TagControl) this.set("max", value);
	}
	
	/**
	 * 配置 label className
    */
	public TagControl labelClassName(Object value) {
		return (TagControl) this.set("labelClassName", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public TagControl submitOnChange(Object value) {
		return (TagControl) this.set("submitOnChange", value);
	}
	
	/**
	    */
	public TagControl desc(Object value) {
		return (TagControl) this.set("desc", value);
	}
	
	/**
	 * 是否为下拉模式
    */
	public TagControl dropdown(Object value) {
		return (TagControl) this.set("dropdown", value);
	}
	
	/**
	 * 单个标签的最大文本长度
    */
	public TagControl maxTagLength(Object value) {
		return (TagControl) this.set("maxTagLength", value);
	}
	
	/**
	 * 是否开启批量添加模式
    */
	public TagControl enableBatchAdd(Object value) {
		return (TagControl) this.set("enableBatchAdd", value);
	}
	
	/**
	 * 默认选择选项第一个值。
    */
	public TagControl selectFirst(Object value) {
		return (TagControl) this.set("selectFirst", value);
	}
	
	/**
	 * 点清除按钮时，将表单项设置成当前配置的值。
    */
	public TagControl resetValue(Object value) {
		return (TagControl) this.set("resetValue", value);
	}
	
	/**
	 * 开启后将选中的选项 value 的值封装为数组，作为当前表单项的值。
    */
	public TagControl extractValue(Object value) {
		return (TagControl) this.set("extractValue", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public TagControl horizontal(Object value) {
		return (TagControl) this.set("horizontal", value);
	}
	
	/**
	 * 事件动作配置
    */
	public TagControl onEvent(Object value) {
		return (TagControl) this.set("onEvent", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public TagControl inline(Object value) {
		return (TagControl) this.set("inline", value);
	}
	
	/**
	 * 组件样式
    */
	public TagControl style(Object value) {
		return (TagControl) this.set("style", value);
	}
	
	/**
	 * 表单项类型
    */
	public TagControl type(Object value) {
		return (TagControl) this.set("type", value);
	}
	
	/**
	 * 控制新增弹框设置项
    */
	public TagControl addDialog(Object value) {
		return (TagControl) this.set("addDialog", value);
	}
	
	/**
	 * 编辑时调用的 API
    */
	public TagControl editApi(Object value) {
		return (TagControl) this.set("editApi", value);
	}
	
	/**
	 * 自动填充，当选项被选择的时候，将选项中的其他值同步设置到表单内。
    */
	public TagControl autoFill(Object value) {
		return (TagControl) this.set("autoFill", value);
	}
	
	/**
	    */
	public TagControl initAutoFill(Object value) {
		return (TagControl) this.set("initAutoFill", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public TagControl className(Object value) {
		return (TagControl) this.set("className", value);
	}
	
	/**
	 * 配置 source 接口初始拉不拉取。
    */
	public TagControl initFetch(Object value) {
		return (TagControl) this.set("initFetch", value);
	}
	
	/**
	 * 新增时的表单项。
    */
	public TagControl addControls(Object value) {
		return (TagControl) this.set("addControls", value);
	}
	
	/**
	 * 是否可删除
    */
	public TagControl removable(Object value) {
		return (TagControl) this.set("removable", value);
	}
	
	/**
	 * 占位符
    */
	public TagControl placeholder(Object value) {
		return (TagControl) this.set("placeholder", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public TagControl id(Object value) {
		return (TagControl) this.set("id", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public TagControl labelRemark(Object value) {
		return (TagControl) this.set("labelRemark", value);
	}
	
	/**
	 * 选项提示信息
    */
	public TagControl optionsTip(Object value) {
		return (TagControl) this.set("optionsTip", value);
	}
	
	/**
	 * 延时加载的 API，当选项中有 defer: true 的选项时，点开会通过此接口扩充。
    */
	public TagControl deferApi(Object value) {
		return (TagControl) this.set("deferApi", value);
	}
	
	/**
	 * 控制编辑弹框设置项
    */
	public TagControl editDialog(Object value) {
		return (TagControl) this.set("editDialog", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public TagControl validateOnChange(Object value) {
		return (TagControl) this.set("validateOnChange", value);
	}
	
	/**
	 * 是否为必填
    */
	public TagControl required(Object value) {
		return (TagControl) this.set("required", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public TagControl visibleOn(Object value) {
		return (TagControl) this.set("visibleOn", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public TagControl staticClassName(Object value) {
		return (TagControl) this.set("staticClassName", value);
	}
	
	/**
	 * 单选模式：当用户选中某个选项时，选项中的 value 将被作为该表单项的值提交，否则，整个选项对象都会作为该表单项的值提交。 多选模式：选中的多个选项的 `value` 会通过 `delimiter` 连接起来，否则直接将以数组的形式提交值。
    */
	public TagControl joinValues(Object value) {
		return (TagControl) this.set("joinValues", value);
	}
	
	/**
	 * 描述标题
    */
	public TagControl labelAlign(Object value) {
		return (TagControl) this.set("labelAlign", value);
	}
	
	/**
	 * 只读条件
    */
	public TagControl readOnlyOn(Object value) {
		return (TagControl) this.set("readOnlyOn", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public TagControl clearValueOnHidden(Object value) {
		return (TagControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	 * 可用来通过 API 拉取 options。
    */
	public TagControl source(Object value) {
		return (TagControl) this.set("source", value);
	}
	
	/**
	 * 是否可清除。
    */
	public TagControl clearable(Object value) {
		return (TagControl) this.set("clearable", value);
	}
	
	/**
	 * 新增文字
    */
	public TagControl createBtnLabel(Object value) {
		return (TagControl) this.set("createBtnLabel", value);
	}
	}