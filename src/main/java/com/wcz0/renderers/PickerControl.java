package com.wcz0.renderers;
/**
 * Picker 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/picker

 * @author wcz0
 * @version 6.2.2
 */
public class PickerControl extends BaseRenderer {

	public PickerControl() {
		this.set("type", "pickerControl");
	}

	public PickerControl set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 选项删除提示文字。
    */
	public PickerControl deleteConfirmText(Object value) {
		return (PickerControl) this.set("deleteConfirmText", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public PickerControl id(Object value) {
		return (PickerControl) this.set("id", value);
	}
	
	/**
	 * 配置 source 接口初始拉不拉取。
    */
	public PickerControl initFetch(Object value) {
		return (PickerControl) this.set("initFetch", value);
	}
	
	/**
	 * 建议用 labelTpl 选中一个字段名用来作为值的描述文字
    */
	public PickerControl labelField(Object value) {
		return (PickerControl) this.set("labelField", value);
	}
	
	/**
	 * 开启最大标签展示数量的相关配置
    */
	public PickerControl overflowConfig(Object value) {
		return (PickerControl) this.set("overflowConfig", value);
	}
	
	/**
	 * 单选模式：当用户选中某个选项时，选项中的 value 将被作为该表单项的值提交，否则，整个选项对象都会作为该表单项的值提交。 多选模式：选中的多个选项的 `value` 会通过 `delimiter` 连接起来，否则直接将以数组的形式提交值。
    */
	public PickerControl joinValues(Object value) {
		return (PickerControl) this.set("joinValues", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public PickerControl size(Object value) {
		return (PickerControl) this.set("size", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public PickerControl submitOnChange(Object value) {
		return (PickerControl) this.set("submitOnChange", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public PickerControl className(Object value) {
		return (PickerControl) this.set("className", value);
	}
	
	/**
	 * 是否显示
    */
	public PickerControl visible(Object value) {
		return (PickerControl) this.set("visible", value);
	}
	
	/**
	 * 点清除按钮时，将表单项设置成当前配置的值。
    */
	public PickerControl resetValue(Object value) {
		return (PickerControl) this.set("resetValue", value);
	}
	
	/**
	    */
	public PickerControl initAutoFill(Object value) {
		return (PickerControl) this.set("initAutoFill", value);
	}
	
	/**
	 * 描述标题
    */
	public PickerControl label(Object value) {
		return (PickerControl) this.set("label", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public PickerControl labelRemark(Object value) {
		return (PickerControl) this.set("labelRemark", value);
	}
	
	/**
	 * 描述标题
    */
	public PickerControl labelAlign(Object value) {
		return (PickerControl) this.set("labelAlign", value);
	}
	
	/**
	 * 只读条件
    */
	public PickerControl readOnlyOn(Object value) {
		return (PickerControl) this.set("readOnlyOn", value);
	}
	
	/**
	 * 组件样式
    */
	public PickerControl style(Object value) {
		return (PickerControl) this.set("style", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public PickerControl clearValueOnHidden(Object value) {
		return (PickerControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	 * 弹窗的标题，默认为情选择
    */
	public PickerControl modalTitle(Object value) {
		return (PickerControl) this.set("modalTitle", value);
	}
	
	/**
	 * 是否只读
    */
	public PickerControl readOnly(Object value) {
		return (PickerControl) this.set("readOnly", value);
	}
	
	/**
	    */
	public PickerControl desc(Object value) {
		return (PickerControl) this.set("desc", value);
	}
	
	/**
	 * 是否为必填
    */
	public PickerControl required(Object value) {
		return (PickerControl) this.set("required", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public PickerControl extraName(Object value) {
		return (PickerControl) this.set("extraName", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public PickerControl descriptionClassName(Object value) {
		return (PickerControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 是否禁用
    */
	public PickerControl disabled(Object value) {
		return (PickerControl) this.set("disabled", value);
	}
	
	/**
	 * 是否静态展示
    */
	public PickerControl static_(Object value) {
		return (PickerControl) this.set("static_", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public PickerControl staticInputClassName(Object value) {
		return (PickerControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 多选模式，值太多时是否避免折行
    */
	public PickerControl valuesNoWrap(Object value) {
		return (PickerControl) this.set("valuesNoWrap", value);
	}
	
	/**
	 * 新增文字
    */
	public PickerControl createBtnLabel(Object value) {
		return (PickerControl) this.set("createBtnLabel", value);
	}
	
	/**
	 * 是否可删除
    */
	public PickerControl removable(Object value) {
		return (PickerControl) this.set("removable", value);
	}
	
	/**
	    */
	public PickerControl validations(Object value) {
		return (PickerControl) this.set("validations", value);
	}
	
	/**
	 * 选项集合
    */
	public PickerControl options(Object value) {
		return (PickerControl) this.set("options", value);
	}
	
	/**
	 * 分割符
    */
	public PickerControl delimiter(Object value) {
		return (PickerControl) this.set("delimiter", value);
	}
	
	/**
	 * 控制编辑弹框设置项
    */
	public PickerControl editDialog(Object value) {
		return (PickerControl) this.set("editDialog", value);
	}
	
	/**
	 * 配置 label className
    */
	public PickerControl labelClassName(Object value) {
		return (PickerControl) this.set("labelClassName", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public PickerControl staticOn(Object value) {
		return (PickerControl) this.set("staticOn", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public PickerControl useMobileUI(Object value) {
		return (PickerControl) this.set("useMobileUI", value);
	}
	
	/**
	 * 表单项类型
    */
	public PickerControl type(Object value) {
		return (PickerControl) this.set("type", value);
	}
	
	/**
	 * 内嵌模式，也就是说不弹框了。
    */
	public PickerControl embed(Object value) {
		return (PickerControl) this.set("embed", value);
	}
	
	/**
	 * 默认选择选项第一个值。
    */
	public PickerControl selectFirst(Object value) {
		return (PickerControl) this.set("selectFirst", value);
	}
	
	/**
	 * 开启后将选中的选项 value 的值封装为数组，作为当前表单项的值。
    */
	public PickerControl extractValue(Object value) {
		return (PickerControl) this.set("extractValue", value);
	}
	
	/**
	 * 选项删除 API
    */
	public PickerControl deleteApi(Object value) {
		return (PickerControl) this.set("deleteApi", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public PickerControl validationErrors(Object value) {
		return (PickerControl) this.set("validationErrors", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public PickerControl staticPlaceholder(Object value) {
		return (PickerControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 选一个可以用来作为值的字段。
    */
	public PickerControl valueField(Object value) {
		return (PickerControl) this.set("valueField", value);
	}
	
	/**
	 * 弹窗模式，dialog 或者 drawer
    * 可选值: dialog | drawer
    */
	public PickerControl modalMode(Object value) {
		return (PickerControl) this.set("modalMode", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public PickerControl width(Object value) {
		return (PickerControl) this.set("width", value);
	}
	
	/**
	 * 编辑时调用的 API
    */
	public PickerControl editApi(Object value) {
		return (PickerControl) this.set("editApi", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public PickerControl horizontal(Object value) {
		return (PickerControl) this.set("horizontal", value);
	}
	
	/**
	 * 占位符
    */
	public PickerControl placeholder(Object value) {
		return (PickerControl) this.set("placeholder", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public PickerControl validateApi(Object value) {
		return (PickerControl) this.set("validateApi", value);
	}
	
	/**
	    */
	public PickerControl staticSchema(Object value) {
		return (PickerControl) this.set("staticSchema", value);
	}
	
	/**
	 * 延时加载的 API，当选项中有 defer: true 的选项时，点开会通过此接口扩充。
    */
	public PickerControl deferApi(Object value) {
		return (PickerControl) this.set("deferApi", value);
	}
	
	/**
	 * 添加时调用的接口
    */
	public PickerControl addApi(Object value) {
		return (PickerControl) this.set("addApi", value);
	}
	
	/**
	 * 自动填充，当选项被选择的时候，将选项中的其他值同步设置到表单内。
    */
	public PickerControl autoFill(Object value) {
		return (PickerControl) this.set("autoFill", value);
	}
	
	/**
	 * 事件动作配置
    */
	public PickerControl onEvent(Object value) {
		return (PickerControl) this.set("onEvent", value);
	}
	
	/**
	 * 是否为多选模式
    */
	public PickerControl multiple(Object value) {
		return (PickerControl) this.set("multiple", value);
	}
	
	/**
	 * 新增时的表单项。
    */
	public PickerControl addControls(Object value) {
		return (PickerControl) this.set("addControls", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public PickerControl mode(Object value) {
		return (PickerControl) this.set("mode", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public PickerControl hiddenOn(Object value) {
		return (PickerControl) this.set("hiddenOn", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public PickerControl visibleOn(Object value) {
		return (PickerControl) this.set("visibleOn", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public PickerControl staticClassName(Object value) {
		return (PickerControl) this.set("staticClassName", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public PickerControl editorSetting(Object value) {
		return (PickerControl) this.set("editorSetting", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public PickerControl remark(Object value) {
		return (PickerControl) this.set("remark", value);
	}
	
	/**
	 * 控制新增弹框设置项
    */
	public PickerControl addDialog(Object value) {
		return (PickerControl) this.set("addDialog", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public PickerControl name(Object value) {
		return (PickerControl) this.set("name", value);
	}
	
	/**
	 * 是否隐藏
    */
	public PickerControl hidden(Object value) {
		return (PickerControl) this.set("hidden", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public PickerControl value(Object value) {
		return (PickerControl) this.set("value", value);
	}
	
	/**
	 * 可用来通过 API 拉取 options。
    */
	public PickerControl source(Object value) {
		return (PickerControl) this.set("source", value);
	}
	
	/**
	 * 用表达式来配置 source 接口初始要不要拉取
    */
	public PickerControl initFetchOn(Object value) {
		return (PickerControl) this.set("initFetchOn", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public PickerControl description(Object value) {
		return (PickerControl) this.set("description", value);
	}
	
	/**
	 * 是否可以编辑
    */
	public PickerControl editable(Object value) {
		return (PickerControl) this.set("editable", value);
	}
	
	/**
	 * 选项修改的表单项
    */
	public PickerControl editControls(Object value) {
		return (PickerControl) this.set("editControls", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public PickerControl inline(Object value) {
		return (PickerControl) this.set("inline", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public PickerControl disabledOn(Object value) {
		return (PickerControl) this.set("disabledOn", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public PickerControl staticLabelClassName(Object value) {
		return (PickerControl) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 是否可清除。
    */
	public PickerControl clearable(Object value) {
		return (PickerControl) this.set("clearable", value);
	}
	
	/**
	 * 懒加载字段
    */
	public PickerControl deferField(Object value) {
		return (PickerControl) this.set("deferField", value);
	}
	
	/**
	 * 是否可以新增
    */
	public PickerControl creatable(Object value) {
		return (PickerControl) this.set("creatable", value);
	}
	
	/**
	 * 可用来生成选中的值的描述文字
    */
	public PickerControl labelTpl(Object value) {
		return (PickerControl) this.set("labelTpl", value);
	}
	
	/**
	 * 弹窗选择框详情。
    */
	public PickerControl pickerSchema(Object value) {
		return (PickerControl) this.set("pickerSchema", value);
	}
	
	/**
	 * 配置 input className
    */
	public PickerControl inputClassName(Object value) {
		return (PickerControl) this.set("inputClassName", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public PickerControl labelWidth(Object value) {
		return (PickerControl) this.set("labelWidth", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public PickerControl hint(Object value) {
		return (PickerControl) this.set("hint", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public PickerControl validateOnChange(Object value) {
		return (PickerControl) this.set("validateOnChange", value);
	}
	}