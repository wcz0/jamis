package com.wcz0.renderers;
/**
 * UserSelect 移动端人员选择。

 * @author wcz0
 * @version 6.2.2
 */
public class UserSelectControl extends BaseRenderer {

	public UserSelectControl() {
		this.set("type", "userSelectControl");
	}

	public UserSelectControl set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 用表达式来配置 source 接口初始要不要拉取
    */
	public UserSelectControl initFetchOn(Object value) {
		return (UserSelectControl) this.set("initFetchOn", value);
	}
	
	/**
	 * 新增时的表单项。
    */
	public UserSelectControl addControls(Object value) {
		return (UserSelectControl) this.set("addControls", value);
	}
	
	/**
	 * 描述标题
    */
	public UserSelectControl labelAlign(Object value) {
		return (UserSelectControl) this.set("labelAlign", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public UserSelectControl labelWidth(Object value) {
		return (UserSelectControl) this.set("labelWidth", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public UserSelectControl validateOnChange(Object value) {
		return (UserSelectControl) this.set("validateOnChange", value);
	}
	
	/**
	 * 占位符
    */
	public UserSelectControl placeholder(Object value) {
		return (UserSelectControl) this.set("placeholder", value);
	}
	
	/**
	 * 添加时调用的接口
    */
	public UserSelectControl addApi(Object value) {
		return (UserSelectControl) this.set("addApi", value);
	}
	
	/**
	 * 配置 label className
    */
	public UserSelectControl labelClassName(Object value) {
		return (UserSelectControl) this.set("labelClassName", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public UserSelectControl className(Object value) {
		return (UserSelectControl) this.set("className", value);
	}
	
	/**
	 * 是否显示
    */
	public UserSelectControl visible(Object value) {
		return (UserSelectControl) this.set("visible", value);
	}
	
	/**
	 * 是否可清除。
    */
	public UserSelectControl clearable(Object value) {
		return (UserSelectControl) this.set("clearable", value);
	}
	
	/**
	 * 编辑时调用的 API
    */
	public UserSelectControl editApi(Object value) {
		return (UserSelectControl) this.set("editApi", value);
	}
	
	/**
	 * 描述标题
    */
	public UserSelectControl label(Object value) {
		return (UserSelectControl) this.set("label", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public UserSelectControl mode(Object value) {
		return (UserSelectControl) this.set("mode", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public UserSelectControl inline(Object value) {
		return (UserSelectControl) this.set("inline", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public UserSelectControl editorSetting(Object value) {
		return (UserSelectControl) this.set("editorSetting", value);
	}
	
	/**
	 * 表单项类型
    */
	public UserSelectControl type(Object value) {
		return (UserSelectControl) this.set("type", value);
	}
	
	/**
	 * 默认选择选项第一个值。
    */
	public UserSelectControl selectFirst(Object value) {
		return (UserSelectControl) this.set("selectFirst", value);
	}
	
	/**
	 * 点清除按钮时，将表单项设置成当前配置的值。
    */
	public UserSelectControl resetValue(Object value) {
		return (UserSelectControl) this.set("resetValue", value);
	}
	
	/**
	 * 选项删除提示文字。
    */
	public UserSelectControl deleteConfirmText(Object value) {
		return (UserSelectControl) this.set("deleteConfirmText", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public UserSelectControl validateApi(Object value) {
		return (UserSelectControl) this.set("validateApi", value);
	}
	
	/**
	 * 单选模式：当用户选中某个选项时，选项中的 value 将被作为该表单项的值提交，否则，整个选项对象都会作为该表单项的值提交。 多选模式：选中的多个选项的 `value` 会通过 `delimiter` 连接起来，否则直接将以数组的形式提交值。
    */
	public UserSelectControl joinValues(Object value) {
		return (UserSelectControl) this.set("joinValues", value);
	}
	
	/**
	 * 是否可以新增
    */
	public UserSelectControl creatable(Object value) {
		return (UserSelectControl) this.set("creatable", value);
	}
	
	/**
	 * 自动填充，当选项被选择的时候，将选项中的其他值同步设置到表单内。
    */
	public UserSelectControl autoFill(Object value) {
		return (UserSelectControl) this.set("autoFill", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public UserSelectControl staticPlaceholder(Object value) {
		return (UserSelectControl) this.set("staticPlaceholder", value);
	}
	
	/**
	    */
	public UserSelectControl staticSchema(Object value) {
		return (UserSelectControl) this.set("staticSchema", value);
	}
	
	/**
	 * 是否为多选模式
    */
	public UserSelectControl multiple(Object value) {
		return (UserSelectControl) this.set("multiple", value);
	}
	
	/**
	 * 多选模式，值太多时是否避免折行
    */
	public UserSelectControl valuesNoWrap(Object value) {
		return (UserSelectControl) this.set("valuesNoWrap", value);
	}
	
	/**
	 * 懒加载字段
    */
	public UserSelectControl deferField(Object value) {
		return (UserSelectControl) this.set("deferField", value);
	}
	
	/**
	 * 是否可以编辑
    */
	public UserSelectControl editable(Object value) {
		return (UserSelectControl) this.set("editable", value);
	}
	
	/**
	    */
	public UserSelectControl initAutoFill(Object value) {
		return (UserSelectControl) this.set("initAutoFill", value);
	}
	
	/**
	 * 只读条件
    */
	public UserSelectControl readOnlyOn(Object value) {
		return (UserSelectControl) this.set("readOnlyOn", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public UserSelectControl validationErrors(Object value) {
		return (UserSelectControl) this.set("validationErrors", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public UserSelectControl visibleOn(Object value) {
		return (UserSelectControl) this.set("visibleOn", value);
	}
	
	/**
	 * 组件样式
    */
	public UserSelectControl style(Object value) {
		return (UserSelectControl) this.set("style", value);
	}
	
	/**
	 * 控制新增弹框设置项
    */
	public UserSelectControl addDialog(Object value) {
		return (UserSelectControl) this.set("addDialog", value);
	}
	
	/**
	 * 选项删除 API
    */
	public UserSelectControl deleteApi(Object value) {
		return (UserSelectControl) this.set("deleteApi", value);
	}
	
	/**
	 * 配置 input className
    */
	public UserSelectControl inputClassName(Object value) {
		return (UserSelectControl) this.set("inputClassName", value);
	}
	
	/**
	 * 是否静态展示
    */
	public UserSelectControl static_(Object value) {
		return (UserSelectControl) this.set("static_", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public UserSelectControl remark(Object value) {
		return (UserSelectControl) this.set("remark", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public UserSelectControl description(Object value) {
		return (UserSelectControl) this.set("description", value);
	}
	
	/**
	 * 事件动作配置
    */
	public UserSelectControl onEvent(Object value) {
		return (UserSelectControl) this.set("onEvent", value);
	}
	
	/**
	 * 控制编辑弹框设置项
    */
	public UserSelectControl editDialog(Object value) {
		return (UserSelectControl) this.set("editDialog", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public UserSelectControl clearValueOnHidden(Object value) {
		return (UserSelectControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public UserSelectControl staticClassName(Object value) {
		return (UserSelectControl) this.set("staticClassName", value);
	}
	
	/**
	 * 选项集合
    */
	public UserSelectControl options(Object value) {
		return (UserSelectControl) this.set("options", value);
	}
	
	/**
	 * 可用来通过 API 拉取 options。
    */
	public UserSelectControl source(Object value) {
		return (UserSelectControl) this.set("source", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public UserSelectControl hiddenOn(Object value) {
		return (UserSelectControl) this.set("hiddenOn", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public UserSelectControl width(Object value) {
		return (UserSelectControl) this.set("width", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public UserSelectControl name(Object value) {
		return (UserSelectControl) this.set("name", value);
	}
	
	/**
	 * 是否只读
    */
	public UserSelectControl readOnly(Object value) {
		return (UserSelectControl) this.set("readOnly", value);
	}
	
	/**
	    */
	public UserSelectControl desc(Object value) {
		return (UserSelectControl) this.set("desc", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public UserSelectControl useMobileUI(Object value) {
		return (UserSelectControl) this.set("useMobileUI", value);
	}
	
	/**
	 * 延时加载的 API，当选项中有 defer: true 的选项时，点开会通过此接口扩充。
    */
	public UserSelectControl deferApi(Object value) {
		return (UserSelectControl) this.set("deferApi", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public UserSelectControl extraName(Object value) {
		return (UserSelectControl) this.set("extraName", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public UserSelectControl descriptionClassName(Object value) {
		return (UserSelectControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 是否禁用
    */
	public UserSelectControl disabled(Object value) {
		return (UserSelectControl) this.set("disabled", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public UserSelectControl size(Object value) {
		return (UserSelectControl) this.set("size", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public UserSelectControl horizontal(Object value) {
		return (UserSelectControl) this.set("horizontal", value);
	}
	
	/**
	    */
	public UserSelectControl validations(Object value) {
		return (UserSelectControl) this.set("validations", value);
	}
	
	/**
	 * 是否隐藏
    */
	public UserSelectControl hidden(Object value) {
		return (UserSelectControl) this.set("hidden", value);
	}
	
	/**
	 * 配置 source 接口初始拉不拉取。
    */
	public UserSelectControl initFetch(Object value) {
		return (UserSelectControl) this.set("initFetch", value);
	}
	
	/**
	 * 选项修改的表单项
    */
	public UserSelectControl editControls(Object value) {
		return (UserSelectControl) this.set("editControls", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public UserSelectControl hint(Object value) {
		return (UserSelectControl) this.set("hint", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public UserSelectControl id(Object value) {
		return (UserSelectControl) this.set("id", value);
	}
	
	/**
	 * 分割符
    */
	public UserSelectControl delimiter(Object value) {
		return (UserSelectControl) this.set("delimiter", value);
	}
	
	/**
	 * 新增文字
    */
	public UserSelectControl createBtnLabel(Object value) {
		return (UserSelectControl) this.set("createBtnLabel", value);
	}
	
	/**
	 * 是否可删除
    */
	public UserSelectControl removable(Object value) {
		return (UserSelectControl) this.set("removable", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public UserSelectControl submitOnChange(Object value) {
		return (UserSelectControl) this.set("submitOnChange", value);
	}
	
	/**
	 * 是否为必填
    */
	public UserSelectControl required(Object value) {
		return (UserSelectControl) this.set("required", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public UserSelectControl value(Object value) {
		return (UserSelectControl) this.set("value", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public UserSelectControl disabledOn(Object value) {
		return (UserSelectControl) this.set("disabledOn", value);
	}
	
	/**
	 * 开启后将选中的选项 value 的值封装为数组，作为当前表单项的值。
    */
	public UserSelectControl extractValue(Object value) {
		return (UserSelectControl) this.set("extractValue", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public UserSelectControl staticOn(Object value) {
		return (UserSelectControl) this.set("staticOn", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public UserSelectControl staticLabelClassName(Object value) {
		return (UserSelectControl) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public UserSelectControl staticInputClassName(Object value) {
		return (UserSelectControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public UserSelectControl labelRemark(Object value) {
		return (UserSelectControl) this.set("labelRemark", value);
	}
	}