package com.wcz0.renderers;
/**
 * 链式下拉框 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/chained-select

 * @author wcz0
 * @version 6.2.2
 */
public class ChainedSelectControl extends BaseRenderer {

	public ChainedSelectControl() {
		this.set("type", "chainedSelectControl");
	}

	/**
	 * 单选模式：当用户选中某个选项时，选项中的 value 将被作为该表单项的值提交，否则，整个选项对象都会作为该表单项的值提交。 多选模式：选中的多个选项的 `value` 会通过 `delimiter` 连接起来，否则直接将以数组的形式提交值。
    */
	public ChainedSelectControl joinValues(Object value) {
		return (ChainedSelectControl) this.set("joinValues", value);
	}
	
	/**
	 * 开启后将选中的选项 value 的值封装为数组，作为当前表单项的值。
    */
	public ChainedSelectControl extractValue(Object value) {
		return (ChainedSelectControl) this.set("extractValue", value);
	}
	
	/**
	 * 选项删除提示文字。
    */
	public ChainedSelectControl deleteConfirmText(Object value) {
		return (ChainedSelectControl) this.set("deleteConfirmText", value);
	}
	
	/**
	 * 描述标题
    */
	public ChainedSelectControl labelAlign(Object value) {
		return (ChainedSelectControl) this.set("labelAlign", value);
	}
	
	/**
	    */
	public ChainedSelectControl initAutoFill(Object value) {
		return (ChainedSelectControl) this.set("initAutoFill", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public ChainedSelectControl staticClassName(Object value) {
		return (ChainedSelectControl) this.set("staticClassName", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public ChainedSelectControl staticInputClassName(Object value) {
		return (ChainedSelectControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public ChainedSelectControl staticLabelClassName(Object value) {
		return (ChainedSelectControl) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 默认选择选项第一个值。
    */
	public ChainedSelectControl selectFirst(Object value) {
		return (ChainedSelectControl) this.set("selectFirst", value);
	}
	
	/**
	 * 多选模式，值太多时是否避免折行
    */
	public ChainedSelectControl valuesNoWrap(Object value) {
		return (ChainedSelectControl) this.set("valuesNoWrap", value);
	}
	
	/**
	 * 延时加载的 API，当选项中有 defer: true 的选项时，点开会通过此接口扩充。
    */
	public ChainedSelectControl deferApi(Object value) {
		return (ChainedSelectControl) this.set("deferApi", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public ChainedSelectControl validationErrors(Object value) {
		return (ChainedSelectControl) this.set("validationErrors", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public ChainedSelectControl $$id(Object value) {
		return (ChainedSelectControl) this.set("$$id", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public ChainedSelectControl disabledOn(Object value) {
		return (ChainedSelectControl) this.set("disabledOn", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public ChainedSelectControl id(Object value) {
		return (ChainedSelectControl) this.set("id", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public ChainedSelectControl labelRemark(Object value) {
		return (ChainedSelectControl) this.set("labelRemark", value);
	}
	
	/**
	 * 是否可以编辑
    */
	public ChainedSelectControl editable(Object value) {
		return (ChainedSelectControl) this.set("editable", value);
	}
	
	/**
	 * 只读条件
    */
	public ChainedSelectControl readOnlyOn(Object value) {
		return (ChainedSelectControl) this.set("readOnlyOn", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public ChainedSelectControl value(Object value) {
		return (ChainedSelectControl) this.set("value", value);
	}
	
	/**
	 * 添加时调用的接口
    */
	public ChainedSelectControl addApi(Object value) {
		return (ChainedSelectControl) this.set("addApi", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public ChainedSelectControl extraName(Object value) {
		return (ChainedSelectControl) this.set("extraName", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public ChainedSelectControl validateOnChange(Object value) {
		return (ChainedSelectControl) this.set("validateOnChange", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public ChainedSelectControl validateApi(Object value) {
		return (ChainedSelectControl) this.set("validateApi", value);
	}
	
	/**
	 * 是否显示
    */
	public ChainedSelectControl visible(Object value) {
		return (ChainedSelectControl) this.set("visible", value);
	}
	
	/**
	 * 表单项类型
    */
	public ChainedSelectControl type(Object value) {
		return (ChainedSelectControl) this.set("type", value);
	}
	
	/**
	 * 分割符
    */
	public ChainedSelectControl delimiter(Object value) {
		return (ChainedSelectControl) this.set("delimiter", value);
	}
	
	/**
	 * 是否可删除
    */
	public ChainedSelectControl removable(Object value) {
		return (ChainedSelectControl) this.set("removable", value);
	}
	
	/**
	 * 事件动作配置
    */
	public ChainedSelectControl onEvent(Object value) {
		return (ChainedSelectControl) this.set("onEvent", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public ChainedSelectControl remark(Object value) {
		return (ChainedSelectControl) this.set("remark", value);
	}
	
	/**
	 * 懒加载字段
    */
	public ChainedSelectControl deferField(Object value) {
		return (ChainedSelectControl) this.set("deferField", value);
	}
	
	/**
	 * 控制新增弹框设置项
    */
	public ChainedSelectControl addDialog(Object value) {
		return (ChainedSelectControl) this.set("addDialog", value);
	}
	
	/**
	 * 是否禁用
    */
	public ChainedSelectControl disabled(Object value) {
		return (ChainedSelectControl) this.set("disabled", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public ChainedSelectControl visibleOn(Object value) {
		return (ChainedSelectControl) this.set("visibleOn", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public ChainedSelectControl labelWidth(Object value) {
		return (ChainedSelectControl) this.set("labelWidth", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public ChainedSelectControl description(Object value) {
		return (ChainedSelectControl) this.set("description", value);
	}
	
	/**
	 * 配置 input className
    */
	public ChainedSelectControl inputClassName(Object value) {
		return (ChainedSelectControl) this.set("inputClassName", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public ChainedSelectControl clearValueOnHidden(Object value) {
		return (ChainedSelectControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public ChainedSelectControl useMobileUI(Object value) {
		return (ChainedSelectControl) this.set("useMobileUI", value);
	}
	
	/**
	 * 配置 label className
    */
	public ChainedSelectControl labelClassName(Object value) {
		return (ChainedSelectControl) this.set("labelClassName", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public ChainedSelectControl hint(Object value) {
		return (ChainedSelectControl) this.set("hint", value);
	}
	
	/**
	 * 是否为必填
    */
	public ChainedSelectControl required(Object value) {
		return (ChainedSelectControl) this.set("required", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public ChainedSelectControl staticOn(Object value) {
		return (ChainedSelectControl) this.set("staticOn", value);
	}
	
	/**
	 * 是否为多选模式
    */
	public ChainedSelectControl multiple(Object value) {
		return (ChainedSelectControl) this.set("multiple", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public ChainedSelectControl size(Object value) {
		return (ChainedSelectControl) this.set("size", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public ChainedSelectControl inline(Object value) {
		return (ChainedSelectControl) this.set("inline", value);
	}
	
	/**
	 * 自动填充，当选项被选择的时候，将选项中的其他值同步设置到表单内。
    */
	public ChainedSelectControl autoFill(Object value) {
		return (ChainedSelectControl) this.set("autoFill", value);
	}
	
	/**
	 * 是否隐藏
    */
	public ChainedSelectControl hidden(Object value) {
		return (ChainedSelectControl) this.set("hidden", value);
	}
	
	/**
	    */
	public ChainedSelectControl testIdBuilder(Object value) {
		return (ChainedSelectControl) this.set("testIdBuilder", value);
	}
	
	/**
	 * 选项集合
    */
	public ChainedSelectControl options(Object value) {
		return (ChainedSelectControl) this.set("options", value);
	}
	
	/**
	 * 新增时的表单项。
    */
	public ChainedSelectControl addControls(Object value) {
		return (ChainedSelectControl) this.set("addControls", value);
	}
	
	/**
	 * 控制编辑弹框设置项
    */
	public ChainedSelectControl editDialog(Object value) {
		return (ChainedSelectControl) this.set("editDialog", value);
	}
	
	/**
	 * 描述标题
    */
	public ChainedSelectControl label(Object value) {
		return (ChainedSelectControl) this.set("label", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public ChainedSelectControl submitOnChange(Object value) {
		return (ChainedSelectControl) this.set("submitOnChange", value);
	}
	
	/**
	 * 是否只读
    */
	public ChainedSelectControl readOnly(Object value) {
		return (ChainedSelectControl) this.set("readOnly", value);
	}
	
	/**
	 * 组件样式
    */
	public ChainedSelectControl style(Object value) {
		return (ChainedSelectControl) this.set("style", value);
	}
	
	/**
	 * 配置 source 接口初始拉不拉取。
    */
	public ChainedSelectControl initFetch(Object value) {
		return (ChainedSelectControl) this.set("initFetch", value);
	}
	
	/**
	 * 点清除按钮时，将表单项设置成当前配置的值。
    */
	public ChainedSelectControl resetValue(Object value) {
		return (ChainedSelectControl) this.set("resetValue", value);
	}
	
	/**
	 * 新增文字
    */
	public ChainedSelectControl createBtnLabel(Object value) {
		return (ChainedSelectControl) this.set("createBtnLabel", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public ChainedSelectControl name(Object value) {
		return (ChainedSelectControl) this.set("name", value);
	}
	
	/**
	 * 占位符
    */
	public ChainedSelectControl placeholder(Object value) {
		return (ChainedSelectControl) this.set("placeholder", value);
	}
	
	/**
	 * 编辑时调用的 API
    */
	public ChainedSelectControl editApi(Object value) {
		return (ChainedSelectControl) this.set("editApi", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public ChainedSelectControl descriptionClassName(Object value) {
		return (ChainedSelectControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 选项修改的表单项
    */
	public ChainedSelectControl editControls(Object value) {
		return (ChainedSelectControl) this.set("editControls", value);
	}
	
	/**
	 * 选项删除 API
    */
	public ChainedSelectControl deleteApi(Object value) {
		return (ChainedSelectControl) this.set("deleteApi", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public ChainedSelectControl editorSetting(Object value) {
		return (ChainedSelectControl) this.set("editorSetting", value);
	}
	
	/**
	 * 用表达式来配置 source 接口初始要不要拉取
    */
	public ChainedSelectControl initFetchOn(Object value) {
		return (ChainedSelectControl) this.set("initFetchOn", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public ChainedSelectControl mode(Object value) {
		return (ChainedSelectControl) this.set("mode", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public ChainedSelectControl hiddenOn(Object value) {
		return (ChainedSelectControl) this.set("hiddenOn", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public ChainedSelectControl width(Object value) {
		return (ChainedSelectControl) this.set("width", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public ChainedSelectControl horizontal(Object value) {
		return (ChainedSelectControl) this.set("horizontal", value);
	}
	
	/**
	    */
	public ChainedSelectControl validations(Object value) {
		return (ChainedSelectControl) this.set("validations", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public ChainedSelectControl staticPlaceholder(Object value) {
		return (ChainedSelectControl) this.set("staticPlaceholder", value);
	}
	
	/**
	    */
	public ChainedSelectControl staticSchema(Object value) {
		return (ChainedSelectControl) this.set("staticSchema", value);
	}
	
	/**
	 * 可用来通过 API 拉取 options。
    */
	public ChainedSelectControl source(Object value) {
		return (ChainedSelectControl) this.set("source", value);
	}
	
	/**
	 * 是否可清除。
    */
	public ChainedSelectControl clearable(Object value) {
		return (ChainedSelectControl) this.set("clearable", value);
	}
	
	/**
	 * 是否可以新增
    */
	public ChainedSelectControl creatable(Object value) {
		return (ChainedSelectControl) this.set("creatable", value);
	}
	
	/**
	    */
	public ChainedSelectControl desc(Object value) {
		return (ChainedSelectControl) this.set("desc", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public ChainedSelectControl className(Object value) {
		return (ChainedSelectControl) this.set("className", value);
	}
	
	/**
	 * 是否静态展示
    */
	public ChainedSelectControl static_(Object value) {
		return (ChainedSelectControl) this.set("static_", value);
	}
	}