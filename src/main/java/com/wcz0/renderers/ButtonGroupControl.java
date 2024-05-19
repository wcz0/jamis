package com.wcz0.renderers;
/**
 * 按钮组控件。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/button-group

 * @author wcz0
 * @version 6.2.2
 */
public class ButtonGroupControl extends BaseRenderer {

	public ButtonGroupControl() {
		this.set("type", "buttonGroupControl");
	}

	/**
	 * 点清除按钮时，将表单项设置成当前配置的值。
    */
	public ButtonGroupControl resetValue(Object value) {
		return (ButtonGroupControl) this.set("resetValue", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public ButtonGroupControl labelRemark(Object value) {
		return (ButtonGroupControl) this.set("labelRemark", value);
	}
	
	/**
	 * 占位符
    */
	public ButtonGroupControl placeholder(Object value) {
		return (ButtonGroupControl) this.set("placeholder", value);
	}
	
	/**
	 * 组件样式
    */
	public ButtonGroupControl style(Object value) {
		return (ButtonGroupControl) this.set("style", value);
	}
	
	/**
	 * 选项删除 API
    */
	public ButtonGroupControl deleteApi(Object value) {
		return (ButtonGroupControl) this.set("deleteApi", value);
	}
	
	/**
	 * 描述标题
    */
	public ButtonGroupControl label(Object value) {
		return (ButtonGroupControl) this.set("label", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public ButtonGroupControl description(Object value) {
		return (ButtonGroupControl) this.set("description", value);
	}
	
	/**
	 * 是否静态展示
    */
	public ButtonGroupControl static_(Object value) {
		return (ButtonGroupControl) this.set("static_", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public ButtonGroupControl staticLabelClassName(Object value) {
		return (ButtonGroupControl) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 可用来通过 API 拉取 options。
    */
	public ButtonGroupControl source(Object value) {
		return (ButtonGroupControl) this.set("source", value);
	}
	
	/**
	 * 配置 source 接口初始拉不拉取。
    */
	public ButtonGroupControl initFetch(Object value) {
		return (ButtonGroupControl) this.set("initFetch", value);
	}
	
	/**
	 * 多选模式，值太多时是否避免折行
    */
	public ButtonGroupControl valuesNoWrap(Object value) {
		return (ButtonGroupControl) this.set("valuesNoWrap", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public ButtonGroupControl extraName(Object value) {
		return (ButtonGroupControl) this.set("extraName", value);
	}
	
	/**
	    */
	public ButtonGroupControl validations(Object value) {
		return (ButtonGroupControl) this.set("validations", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public ButtonGroupControl hiddenOn(Object value) {
		return (ButtonGroupControl) this.set("hiddenOn", value);
	}
	
	/**
	    */
	public ButtonGroupControl staticSchema(Object value) {
		return (ButtonGroupControl) this.set("staticSchema", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public ButtonGroupControl useMobileUI(Object value) {
		return (ButtonGroupControl) this.set("useMobileUI", value);
	}
	
	/**
	 * 是否为多选模式
    */
	public ButtonGroupControl multiple(Object value) {
		return (ButtonGroupControl) this.set("multiple", value);
	}
	
	/**
	 * 是否可以新增
    */
	public ButtonGroupControl creatable(Object value) {
		return (ButtonGroupControl) this.set("creatable", value);
	}
	
	/**
	 * 选项修改的表单项
    */
	public ButtonGroupControl editControls(Object value) {
		return (ButtonGroupControl) this.set("editControls", value);
	}
	
	/**
	 * 配置 input className
    */
	public ButtonGroupControl inputClassName(Object value) {
		return (ButtonGroupControl) this.set("inputClassName", value);
	}
	
	/**
	 * 通过 JS 表达式来配置当前表单项是否显示
    */
	public ButtonGroupControl visibleOn(Object value) {
		return (ButtonGroupControl) this.set("visibleOn", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public ButtonGroupControl editorSetting(Object value) {
		return (ButtonGroupControl) this.set("editorSetting", value);
	}
	
	/**
	 * 默认选择选项第一个值。
    */
	public ButtonGroupControl selectFirst(Object value) {
		return (ButtonGroupControl) this.set("selectFirst", value);
	}
	
	/**
	 * 是否可清除。
    */
	public ButtonGroupControl clearable(Object value) {
		return (ButtonGroupControl) this.set("clearable", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public ButtonGroupControl labelWidth(Object value) {
		return (ButtonGroupControl) this.set("labelWidth", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public ButtonGroupControl validateOnChange(Object value) {
		return (ButtonGroupControl) this.set("validateOnChange", value);
	}
	
	/**
	    */
	public ButtonGroupControl initAutoFill(Object value) {
		return (ButtonGroupControl) this.set("initAutoFill", value);
	}
	
	/**
	 * 添加时调用的接口
    */
	public ButtonGroupControl addApi(Object value) {
		return (ButtonGroupControl) this.set("addApi", value);
	}
	
	/**
	 * 控制新增弹框设置项
    */
	public ButtonGroupControl addDialog(Object value) {
		return (ButtonGroupControl) this.set("addDialog", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public ButtonGroupControl validateApi(Object value) {
		return (ButtonGroupControl) this.set("validateApi", value);
	}
	
	/**
	 * 通过 JS 表达式来配置当前表单项的禁用状态。
    */
	public ButtonGroupControl disabledOn(Object value) {
		return (ButtonGroupControl) this.set("disabledOn", value);
	}
	
	/**
	 * 用表达式来配置 source 接口初始要不要拉取
    */
	public ButtonGroupControl initFetchOn(Object value) {
		return (ButtonGroupControl) this.set("initFetchOn", value);
	}
	
	/**
	 * 控制编辑弹框设置项
    */
	public ButtonGroupControl editDialog(Object value) {
		return (ButtonGroupControl) this.set("editDialog", value);
	}
	
	/**
	 * 选项删除提示文字。
    */
	public ButtonGroupControl deleteConfirmText(Object value) {
		return (ButtonGroupControl) this.set("deleteConfirmText", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public ButtonGroupControl clearValueOnHidden(Object value) {
		return (ButtonGroupControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	 * 事件动作配置
    */
	public ButtonGroupControl onEvent(Object value) {
		return (ButtonGroupControl) this.set("onEvent", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public ButtonGroupControl width(Object value) {
		return (ButtonGroupControl) this.set("width", value);
	}
	
	/**
	 * 是否只读
    */
	public ButtonGroupControl readOnly(Object value) {
		return (ButtonGroupControl) this.set("readOnly", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public ButtonGroupControl $$id(Object value) {
		return (ButtonGroupControl) this.set("$$id", value);
	}
	
	/**
	 * 是否显示
    */
	public ButtonGroupControl visible(Object value) {
		return (ButtonGroupControl) this.set("visible", value);
	}
	
	/**
	 * 单选模式：当用户选中某个选项时，选项中的 value 将被作为该表单项的值提交，否则，整个选项对象都会作为该表单项的值提交。 多选模式：选中的多个选项的 `value` 会通过 `delimiter` 连接起来，否则直接将以数组的形式提交值。
    */
	public ButtonGroupControl joinValues(Object value) {
		return (ButtonGroupControl) this.set("joinValues", value);
	}
	
	/**
	 * 编辑时调用的 API
    */
	public ButtonGroupControl editApi(Object value) {
		return (ButtonGroupControl) this.set("editApi", value);
	}
	
	/**
	 * 是否可删除
    */
	public ButtonGroupControl removable(Object value) {
		return (ButtonGroupControl) this.set("removable", value);
	}
	
	/**
	 * 只读条件
    */
	public ButtonGroupControl readOnlyOn(Object value) {
		return (ButtonGroupControl) this.set("readOnlyOn", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public ButtonGroupControl validationErrors(Object value) {
		return (ButtonGroupControl) this.set("validationErrors", value);
	}
	
	/**
	 * 垂直展示？
    */
	public ButtonGroupControl vertical(Object value) {
		return (ButtonGroupControl) this.set("vertical", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public ButtonGroupControl descriptionClassName(Object value) {
		return (ButtonGroupControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public ButtonGroupControl id(Object value) {
		return (ButtonGroupControl) this.set("id", value);
	}
	
	/**
	 * 按钮选中的样式级别
    */
	public ButtonGroupControl btnActiveLevel(Object value) {
		return (ButtonGroupControl) this.set("btnActiveLevel", value);
	}
	
	/**
	    */
	public ButtonGroupControl type(Object value) {
		return (ButtonGroupControl) this.set("type", value);
	}
	
	/**
	 * 配置 label className
    */
	public ButtonGroupControl labelClassName(Object value) {
		return (ButtonGroupControl) this.set("labelClassName", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public ButtonGroupControl staticPlaceholder(Object value) {
		return (ButtonGroupControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public ButtonGroupControl staticOn(Object value) {
		return (ButtonGroupControl) this.set("staticOn", value);
	}
	
	/**
	 * 按钮大小
    * 可选值: xs | sm | md | lg
    */
	public ButtonGroupControl size(Object value) {
		return (ButtonGroupControl) this.set("size", value);
	}
	
	/**
	 * 是否可以编辑
    */
	public ButtonGroupControl editable(Object value) {
		return (ButtonGroupControl) this.set("editable", value);
	}
	
	/**
	 * 描述标题
    */
	public ButtonGroupControl labelAlign(Object value) {
		return (ButtonGroupControl) this.set("labelAlign", value);
	}
	
	/**
	 * 是否为必填
    */
	public ButtonGroupControl required(Object value) {
		return (ButtonGroupControl) this.set("required", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public ButtonGroupControl className(Object value) {
		return (ButtonGroupControl) this.set("className", value);
	}
	
	/**
	 * 是否为禁用状态。
    */
	public ButtonGroupControl disabled(Object value) {
		return (ButtonGroupControl) this.set("disabled", value);
	}
	
	/**
	 * 开启后将选中的选项 value 的值封装为数组，作为当前表单项的值。
    */
	public ButtonGroupControl extractValue(Object value) {
		return (ButtonGroupControl) this.set("extractValue", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public ButtonGroupControl remark(Object value) {
		return (ButtonGroupControl) this.set("remark", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public ButtonGroupControl horizontal(Object value) {
		return (ButtonGroupControl) this.set("horizontal", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public ButtonGroupControl inline(Object value) {
		return (ButtonGroupControl) this.set("inline", value);
	}
	
	/**
	 * 是否隐藏
    */
	public ButtonGroupControl hidden(Object value) {
		return (ButtonGroupControl) this.set("hidden", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public ButtonGroupControl staticClassName(Object value) {
		return (ButtonGroupControl) this.set("staticClassName", value);
	}
	
	/**
	    */
	public ButtonGroupControl btnActiveClassName(Object value) {
		return (ButtonGroupControl) this.set("btnActiveClassName", value);
	}
	
	/**
	 * 平铺展示？
    */
	public ButtonGroupControl tiled(Object value) {
		return (ButtonGroupControl) this.set("tiled", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public ButtonGroupControl hint(Object value) {
		return (ButtonGroupControl) this.set("hint", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public ButtonGroupControl submitOnChange(Object value) {
		return (ButtonGroupControl) this.set("submitOnChange", value);
	}
	
	/**
	    */
	public ButtonGroupControl desc(Object value) {
		return (ButtonGroupControl) this.set("desc", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public ButtonGroupControl value(Object value) {
		return (ButtonGroupControl) this.set("value", value);
	}
	
	/**
	 * 自动填充，当选项被选择的时候，将选项中的其他值同步设置到表单内。
    */
	public ButtonGroupControl autoFill(Object value) {
		return (ButtonGroupControl) this.set("autoFill", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public ButtonGroupControl staticInputClassName(Object value) {
		return (ButtonGroupControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 选项集合
    */
	public ButtonGroupControl options(Object value) {
		return (ButtonGroupControl) this.set("options", value);
	}
	
	/**
	 * 分割符
    */
	public ButtonGroupControl delimiter(Object value) {
		return (ButtonGroupControl) this.set("delimiter", value);
	}
	
	/**
	 * 新增时的表单项。
    */
	public ButtonGroupControl addControls(Object value) {
		return (ButtonGroupControl) this.set("addControls", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public ButtonGroupControl name(Object value) {
		return (ButtonGroupControl) this.set("name", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public ButtonGroupControl mode(Object value) {
		return (ButtonGroupControl) this.set("mode", value);
	}
	
	/**
	    */
	public ButtonGroupControl btnClassName(Object value) {
		return (ButtonGroupControl) this.set("btnClassName", value);
	}
	
	/**
	    */
	public ButtonGroupControl testid(Object value) {
		return (ButtonGroupControl) this.set("testid", value);
	}
	
	/**
	 * 懒加载字段
    */
	public ButtonGroupControl deferField(Object value) {
		return (ButtonGroupControl) this.set("deferField", value);
	}
	
	/**
	 * 延时加载的 API，当选项中有 defer: true 的选项时，点开会通过此接口扩充。
    */
	public ButtonGroupControl deferApi(Object value) {
		return (ButtonGroupControl) this.set("deferApi", value);
	}
	
	/**
	 * 新增文字
    */
	public ButtonGroupControl createBtnLabel(Object value) {
		return (ButtonGroupControl) this.set("createBtnLabel", value);
	}
	
	/**
	    */
	public ButtonGroupControl testIdBuilder(Object value) {
		return (ButtonGroupControl) this.set("testIdBuilder", value);
	}
	
	/**
	 * 按钮集合
    */
	public ButtonGroupControl buttons(Object value) {
		return (ButtonGroupControl) this.set("buttons", value);
	}
	
	/**
	 * 按钮样式级别
    */
	public ButtonGroupControl btnLevel(Object value) {
		return (ButtonGroupControl) this.set("btnLevel", value);
	}
	}