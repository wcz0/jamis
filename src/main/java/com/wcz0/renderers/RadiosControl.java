package com.wcz0.renderers;
/**
 * Radio 单选框。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/radios

 * @author wcz0
 * @version 6.2.2
 */
public class RadiosControl extends BaseRenderer {

	public RadiosControl() {
		this.set("type", "radiosControl");
	}

	public RadiosControl set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 是否静态展示表达式
    */
	public RadiosControl staticOn(Object value) {
		return (RadiosControl) this.set("staticOn", value);
	}
	
	/**
	 * 是否可清除。
    */
	public RadiosControl clearable(Object value) {
		return (RadiosControl) this.set("clearable", value);
	}
	
	/**
	 * 选项删除 API
    */
	public RadiosControl deleteApi(Object value) {
		return (RadiosControl) this.set("deleteApi", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public RadiosControl description(Object value) {
		return (RadiosControl) this.set("description", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public RadiosControl hiddenOn(Object value) {
		return (RadiosControl) this.set("hiddenOn", value);
	}
	
	/**
	 * 配置 source 接口初始拉不拉取。
    */
	public RadiosControl initFetch(Object value) {
		return (RadiosControl) this.set("initFetch", value);
	}
	
	/**
	 * 组件样式
    */
	public RadiosControl style(Object value) {
		return (RadiosControl) this.set("style", value);
	}
	
	/**
	 * 选项集合
    */
	public RadiosControl options(Object value) {
		return (RadiosControl) this.set("options", value);
	}
	
	/**
	 * 单选模式：当用户选中某个选项时，选项中的 value 将被作为该表单项的值提交，否则，整个选项对象都会作为该表单项的值提交。 多选模式：选中的多个选项的 `value` 会通过 `delimiter` 连接起来，否则直接将以数组的形式提交值。
    */
	public RadiosControl joinValues(Object value) {
		return (RadiosControl) this.set("joinValues", value);
	}
	
	/**
	 * 分割符
    */
	public RadiosControl delimiter(Object value) {
		return (RadiosControl) this.set("delimiter", value);
	}
	
	/**
	 * 是否隐藏
    */
	public RadiosControl hidden(Object value) {
		return (RadiosControl) this.set("hidden", value);
	}
	
	/**
	 * 是否只读
    */
	public RadiosControl readOnly(Object value) {
		return (RadiosControl) this.set("readOnly", value);
	}
	
	/**
	 * 配置 input className
    */
	public RadiosControl inputClassName(Object value) {
		return (RadiosControl) this.set("inputClassName", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public RadiosControl validationErrors(Object value) {
		return (RadiosControl) this.set("validationErrors", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public RadiosControl validateApi(Object value) {
		return (RadiosControl) this.set("validateApi", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public RadiosControl disabledOn(Object value) {
		return (RadiosControl) this.set("disabledOn", value);
	}
	
	/**
	 * 开启后将选中的选项 value 的值封装为数组，作为当前表单项的值。
    */
	public RadiosControl extractValue(Object value) {
		return (RadiosControl) this.set("extractValue", value);
	}
	
	/**
	 * 控制编辑弹框设置项
    */
	public RadiosControl editDialog(Object value) {
		return (RadiosControl) this.set("editDialog", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public RadiosControl submitOnChange(Object value) {
		return (RadiosControl) this.set("submitOnChange", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public RadiosControl validateOnChange(Object value) {
		return (RadiosControl) this.set("validateOnChange", value);
	}
	
	/**
	 * 事件动作配置
    */
	public RadiosControl onEvent(Object value) {
		return (RadiosControl) this.set("onEvent", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public RadiosControl hint(Object value) {
		return (RadiosControl) this.set("hint", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public RadiosControl staticClassName(Object value) {
		return (RadiosControl) this.set("staticClassName", value);
	}
	
	/**
	 * 默认选择选项第一个值。
    */
	public RadiosControl selectFirst(Object value) {
		return (RadiosControl) this.set("selectFirst", value);
	}
	
	/**
	 * 选项删除提示文字。
    */
	public RadiosControl deleteConfirmText(Object value) {
		return (RadiosControl) this.set("deleteConfirmText", value);
	}
	
	/**
	    */
	public RadiosControl initAutoFill(Object value) {
		return (RadiosControl) this.set("initAutoFill", value);
	}
	
	/**
	 * 描述标题
    */
	public RadiosControl label(Object value) {
		return (RadiosControl) this.set("label", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public RadiosControl size(Object value) {
		return (RadiosControl) this.set("size", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public RadiosControl staticPlaceholder(Object value) {
		return (RadiosControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 用表达式来配置 source 接口初始要不要拉取
    */
	public RadiosControl initFetchOn(Object value) {
		return (RadiosControl) this.set("initFetchOn", value);
	}
	
	/**
	 * 添加时调用的接口
    */
	public RadiosControl addApi(Object value) {
		return (RadiosControl) this.set("addApi", value);
	}
	
	/**
	 * 编辑时调用的 API
    */
	public RadiosControl editApi(Object value) {
		return (RadiosControl) this.set("editApi", value);
	}
	
	/**
	 * 是否可删除
    */
	public RadiosControl removable(Object value) {
		return (RadiosControl) this.set("removable", value);
	}
	
	/**
	 * 自动填充，当选项被选择的时候，将选项中的其他值同步设置到表单内。
    */
	public RadiosControl autoFill(Object value) {
		return (RadiosControl) this.set("autoFill", value);
	}
	
	/**
	 * 配置 label className
    */
	public RadiosControl labelClassName(Object value) {
		return (RadiosControl) this.set("labelClassName", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public RadiosControl useMobileUI(Object value) {
		return (RadiosControl) this.set("useMobileUI", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public RadiosControl staticLabelClassName(Object value) {
		return (RadiosControl) this.set("staticLabelClassName", value);
	}
	
	/**
	    */
	public RadiosControl staticSchema(Object value) {
		return (RadiosControl) this.set("staticSchema", value);
	}
	
	/**
	 * 点清除按钮时，将表单项设置成当前配置的值。
    */
	public RadiosControl resetValue(Object value) {
		return (RadiosControl) this.set("resetValue", value);
	}
	
	/**
	 * 懒加载字段
    */
	public RadiosControl deferField(Object value) {
		return (RadiosControl) this.set("deferField", value);
	}
	
	/**
	 * 控制新增弹框设置项
    */
	public RadiosControl addDialog(Object value) {
		return (RadiosControl) this.set("addDialog", value);
	}
	
	/**
	    */
	public RadiosControl desc(Object value) {
		return (RadiosControl) this.set("desc", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public RadiosControl horizontal(Object value) {
		return (RadiosControl) this.set("horizontal", value);
	}
	
	/**
	    */
	public RadiosControl validations(Object value) {
		return (RadiosControl) this.set("validations", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public RadiosControl id(Object value) {
		return (RadiosControl) this.set("id", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public RadiosControl editorSetting(Object value) {
		return (RadiosControl) this.set("editorSetting", value);
	}
	
	/**
	 * 可用来通过 API 拉取 options。
    */
	public RadiosControl source(Object value) {
		return (RadiosControl) this.set("source", value);
	}
	
	/**
	 * 新增文字
    */
	public RadiosControl createBtnLabel(Object value) {
		return (RadiosControl) this.set("createBtnLabel", value);
	}
	
	/**
	 * 选项修改的表单项
    */
	public RadiosControl editControls(Object value) {
		return (RadiosControl) this.set("editControls", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public RadiosControl labelWidth(Object value) {
		return (RadiosControl) this.set("labelWidth", value);
	}
	
	/**
	 * 是否为必填
    */
	public RadiosControl required(Object value) {
		return (RadiosControl) this.set("required", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public RadiosControl staticInputClassName(Object value) {
		return (RadiosControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 每行显示多少个
    */
	public RadiosControl columnsCount(Object value) {
		return (RadiosControl) this.set("columnsCount", value);
	}
	
	/**
	 * 是否可以编辑
    */
	public RadiosControl editable(Object value) {
		return (RadiosControl) this.set("editable", value);
	}
	
	/**
	 * 描述标题
    */
	public RadiosControl labelAlign(Object value) {
		return (RadiosControl) this.set("labelAlign", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public RadiosControl extraName(Object value) {
		return (RadiosControl) this.set("extraName", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public RadiosControl className(Object value) {
		return (RadiosControl) this.set("className", value);
	}
	
	/**
	 * 表单项类型
    */
	public RadiosControl type(Object value) {
		return (RadiosControl) this.set("type", value);
	}
	
	/**
	 * 多选模式，值太多时是否避免折行
    */
	public RadiosControl valuesNoWrap(Object value) {
		return (RadiosControl) this.set("valuesNoWrap", value);
	}
	
	/**
	 * 只读条件
    */
	public RadiosControl readOnlyOn(Object value) {
		return (RadiosControl) this.set("readOnlyOn", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public RadiosControl visibleOn(Object value) {
		return (RadiosControl) this.set("visibleOn", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public RadiosControl remark(Object value) {
		return (RadiosControl) this.set("remark", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public RadiosControl clearValueOnHidden(Object value) {
		return (RadiosControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public RadiosControl labelRemark(Object value) {
		return (RadiosControl) this.set("labelRemark", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public RadiosControl width(Object value) {
		return (RadiosControl) this.set("width", value);
	}
	
	/**
	 * 是否为多选模式
    */
	public RadiosControl multiple(Object value) {
		return (RadiosControl) this.set("multiple", value);
	}
	
	/**
	 * 延时加载的 API，当选项中有 defer: true 的选项时，点开会通过此接口扩充。
    */
	public RadiosControl deferApi(Object value) {
		return (RadiosControl) this.set("deferApi", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public RadiosControl descriptionClassName(Object value) {
		return (RadiosControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public RadiosControl mode(Object value) {
		return (RadiosControl) this.set("mode", value);
	}
	
	/**
	 * 是否显示
    */
	public RadiosControl visible(Object value) {
		return (RadiosControl) this.set("visible", value);
	}
	
	/**
	 * 是否静态展示
    */
	public RadiosControl static_(Object value) {
		return (RadiosControl) this.set("static_", value);
	}
	
	/**
	 * 新增时的表单项。
    */
	public RadiosControl addControls(Object value) {
		return (RadiosControl) this.set("addControls", value);
	}
	
	/**
	 * 占位符
    */
	public RadiosControl placeholder(Object value) {
		return (RadiosControl) this.set("placeholder", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public RadiosControl value(Object value) {
		return (RadiosControl) this.set("value", value);
	}
	
	/**
	 * 是否禁用
    */
	public RadiosControl disabled(Object value) {
		return (RadiosControl) this.set("disabled", value);
	}
	
	/**
	 * 是否可以新增
    */
	public RadiosControl creatable(Object value) {
		return (RadiosControl) this.set("creatable", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public RadiosControl name(Object value) {
		return (RadiosControl) this.set("name", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public RadiosControl inline(Object value) {
		return (RadiosControl) this.set("inline", value);
	}
	}