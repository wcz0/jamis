package com.wcz0.renderers;
/**
 * Text 文本输入框。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/text

 * @author wcz0
 * @version 6.2.2
 */
public class TextControl extends BaseRenderer {

	public TextControl() {
		this.set("type", "textControl");
	}

	/**
	 * 是否可删除
    */
	public TextControl removable(Object value) {
		return (TextControl) this.set("removable", value);
	}
	
	/**
	 * 占位符
    */
	public TextControl placeholder(Object value) {
		return (TextControl) this.set("placeholder", value);
	}
	
	/**
	 * 是否显示
    */
	public TextControl visible(Object value) {
		return (TextControl) this.set("visible", value);
	}
	
	/**
	 * 是否静态展示
    */
	public TextControl static_(Object value) {
		return (TextControl) this.set("static_", value);
	}
	
	/**
	 * 配置原生 input 的 autoComplete 属性
    */
	public TextControl nativeAutoComplete(Object value) {
		return (TextControl) this.set("nativeAutoComplete", value);
	}
	
	/**
	 * 是否显示计数
    */
	public TextControl showCounter(Object value) {
		return (TextControl) this.set("showCounter", value);
	}
	
	/**
	 * 默认选择选项第一个值。
    */
	public TextControl selectFirst(Object value) {
		return (TextControl) this.set("selectFirst", value);
	}
	
	/**
	 * 配置 label className
    */
	public TextControl labelClassName(Object value) {
		return (TextControl) this.set("labelClassName", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public TextControl descriptionClassName(Object value) {
		return (TextControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public TextControl value(Object value) {
		return (TextControl) this.set("value", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public TextControl visibleOn(Object value) {
		return (TextControl) this.set("visibleOn", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public TextControl labelRemark(Object value) {
		return (TextControl) this.set("labelRemark", value);
	}
	
	/**
	 * 描述标题
    */
	public TextControl labelAlign(Object value) {
		return (TextControl) this.set("labelAlign", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public TextControl staticOn(Object value) {
		return (TextControl) this.set("staticOn", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public TextControl staticPlaceholder(Object value) {
		return (TextControl) this.set("staticPlaceholder", value);
	}
	
	/**
	    */
	public TextControl testIdBuilder(Object value) {
		return (TextControl) this.set("testIdBuilder", value);
	}
	
	/**
	 * 是否去除首尾空白文本。
    */
	public TextControl trimContents(Object value) {
		return (TextControl) this.set("trimContents", value);
	}
	
	/**
	 * 前缀
    */
	public TextControl prefix(Object value) {
		return (TextControl) this.set("prefix", value);
	}
	
	/**
	 * 配置 source 接口初始拉不拉取。
    */
	public TextControl initFetch(Object value) {
		return (TextControl) this.set("initFetch", value);
	}
	
	/**
	 * 新增时的表单项。
    */
	public TextControl addControls(Object value) {
		return (TextControl) this.set("addControls", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public TextControl name(Object value) {
		return (TextControl) this.set("name", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public TextControl disabledOn(Object value) {
		return (TextControl) this.set("disabledOn", value);
	}
	
	/**
	 * 自动完成 API，当输入部分文字的时候，会将这些文字通过 ${term} 可以取到，发送给接口。 接口可以返回匹配到的选项，帮助用户输入。
    */
	public TextControl autoComplete(Object value) {
		return (TextControl) this.set("autoComplete", value);
	}
	
	/**
	 * 后缀
    */
	public TextControl suffix(Object value) {
		return (TextControl) this.set("suffix", value);
	}
	
	/**
	    */
	public TextControl addOn(Object value) {
		return (TextControl) this.set("addOn", value);
	}
	
	/**
	 * control节点的CSS类名
    */
	public TextControl inputControlClassName(Object value) {
		return (TextControl) this.set("inputControlClassName", value);
	}
	
	/**
	 * 单选模式：当用户选中某个选项时，选项中的 value 将被作为该表单项的值提交，否则，整个选项对象都会作为该表单项的值提交。 多选模式：选中的多个选项的 `value` 会通过 `delimiter` 连接起来，否则直接将以数组的形式提交值。
    */
	public TextControl joinValues(Object value) {
		return (TextControl) this.set("joinValues", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public TextControl size(Object value) {
		return (TextControl) this.set("size", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public TextControl description(Object value) {
		return (TextControl) this.set("description", value);
	}
	
	/**
	 * 配置 input className
    */
	public TextControl inputClassName(Object value) {
		return (TextControl) this.set("inputClassName", value);
	}
	
	/**
	 * 是否禁用
    */
	public TextControl disabled(Object value) {
		return (TextControl) this.set("disabled", value);
	}
	
	/**
	 * 是否隐藏
    */
	public TextControl hidden(Object value) {
		return (TextControl) this.set("hidden", value);
	}
	
	/**
	 * 自动转换值
    */
	public TextControl transform(Object value) {
		return (TextControl) this.set("transform", value);
	}
	
	/**
	 * 选项集合
    */
	public TextControl options(Object value) {
		return (TextControl) this.set("options", value);
	}
	
	/**
	 * 用表达式来配置 source 接口初始要不要拉取
    */
	public TextControl initFetchOn(Object value) {
		return (TextControl) this.set("initFetchOn", value);
	}
	
	/**
	 * 是否可清除。
    */
	public TextControl clearable(Object value) {
		return (TextControl) this.set("clearable", value);
	}
	
	/**
	 * 控制新增弹框设置项
    */
	public TextControl addDialog(Object value) {
		return (TextControl) this.set("addDialog", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public TextControl validateApi(Object value) {
		return (TextControl) this.set("validateApi", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public TextControl $$id(Object value) {
		return (TextControl) this.set("$$id", value);
	}
	
	/**
	 * 选项修改的表单项
    */
	public TextControl editControls(Object value) {
		return (TextControl) this.set("editControls", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public TextControl horizontal(Object value) {
		return (TextControl) this.set("horizontal", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public TextControl staticInputClassName(Object value) {
		return (TextControl) this.set("staticInputClassName", value);
	}
	
	/**
	    */
	public TextControl staticSchema(Object value) {
		return (TextControl) this.set("staticSchema", value);
	}
	
	/**
	 * 在内容为空的时候清除值
    */
	public TextControl clearValueOnEmpty(Object value) {
		return (TextControl) this.set("clearValueOnEmpty", value);
	}
	
	/**
	 * 是否可以新增
    */
	public TextControl creatable(Object value) {
		return (TextControl) this.set("creatable", value);
	}
	
	/**
	 * 编辑时调用的 API
    */
	public TextControl editApi(Object value) {
		return (TextControl) this.set("editApi", value);
	}
	
	/**
	    */
	public TextControl desc(Object value) {
		return (TextControl) this.set("desc", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public TextControl className(Object value) {
		return (TextControl) this.set("className", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public TextControl useMobileUI(Object value) {
		return (TextControl) this.set("useMobileUI", value);
	}
	
	/**
	 * 分割符
    */
	public TextControl delimiter(Object value) {
		return (TextControl) this.set("delimiter", value);
	}
	
	/**
	    */
	public TextControl validations(Object value) {
		return (TextControl) this.set("validations", value);
	}
	
	/**
	    */
	public TextControl initAutoFill(Object value) {
		return (TextControl) this.set("initAutoFill", value);
	}
	
	/**
	 * 表单项类型
    * 可选值: input-text | input-email | input-url | input-password | native-date | native-time | native-number
    */
	public TextControl type(Object value) {
		return (TextControl) this.set("type", value);
	}
	
	/**
	 * 只读条件
    */
	public TextControl readOnlyOn(Object value) {
		return (TextControl) this.set("readOnlyOn", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public TextControl remark(Object value) {
		return (TextControl) this.set("remark", value);
	}
	
	/**
	 * 边框模式，全边框，还是半边框，或者没边框。
    * 可选值: full | half | none
    */
	public TextControl borderMode(Object value) {
		return (TextControl) this.set("borderMode", value);
	}
	
	/**
	 * 限制文字最大输入个数
    */
	public TextControl maxLength(Object value) {
		return (TextControl) this.set("maxLength", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public TextControl hiddenOn(Object value) {
		return (TextControl) this.set("hiddenOn", value);
	}
	
	/**
	 * 添加时调用的接口
    */
	public TextControl addApi(Object value) {
		return (TextControl) this.set("addApi", value);
	}
	
	/**
	 * 新增文字
    */
	public TextControl createBtnLabel(Object value) {
		return (TextControl) this.set("createBtnLabel", value);
	}
	
	/**
	 * 是否可以编辑
    */
	public TextControl editable(Object value) {
		return (TextControl) this.set("editable", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public TextControl extraName(Object value) {
		return (TextControl) this.set("extraName", value);
	}
	
	/**
	 * 是否只读
    */
	public TextControl readOnly(Object value) {
		return (TextControl) this.set("readOnly", value);
	}
	
	/**
	 * 自动填充，当选项被选择的时候，将选项中的其他值同步设置到表单内。
    */
	public TextControl autoFill(Object value) {
		return (TextControl) this.set("autoFill", value);
	}
	
	/**
	 * 是否为多选模式
    */
	public TextControl multiple(Object value) {
		return (TextControl) this.set("multiple", value);
	}
	
	/**
	 * 点清除按钮时，将表单项设置成当前配置的值。
    */
	public TextControl resetValue(Object value) {
		return (TextControl) this.set("resetValue", value);
	}
	
	/**
	 * 选项删除 API
    */
	public TextControl deleteApi(Object value) {
		return (TextControl) this.set("deleteApi", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public TextControl mode(Object value) {
		return (TextControl) this.set("mode", value);
	}
	
	/**
	 * 开启后将选中的选项 value 的值封装为数组，作为当前表单项的值。
    */
	public TextControl extractValue(Object value) {
		return (TextControl) this.set("extractValue", value);
	}
	
	/**
	 * 选项删除提示文字。
    */
	public TextControl deleteConfirmText(Object value) {
		return (TextControl) this.set("deleteConfirmText", value);
	}
	
	/**
	 * 限制文字最小输入个数
    */
	public TextControl minLength(Object value) {
		return (TextControl) this.set("minLength", value);
	}
	
	/**
	 * 延时加载的 API，当选项中有 defer: true 的选项时，点开会通过此接口扩充。
    */
	public TextControl deferApi(Object value) {
		return (TextControl) this.set("deferApi", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public TextControl labelWidth(Object value) {
		return (TextControl) this.set("labelWidth", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public TextControl validateOnChange(Object value) {
		return (TextControl) this.set("validateOnChange", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public TextControl inline(Object value) {
		return (TextControl) this.set("inline", value);
	}
	
	/**
	 * 是否为必填
    */
	public TextControl required(Object value) {
		return (TextControl) this.set("required", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public TextControl staticLabelClassName(Object value) {
		return (TextControl) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 多选模式，值太多时是否避免折行
    */
	public TextControl valuesNoWrap(Object value) {
		return (TextControl) this.set("valuesNoWrap", value);
	}
	
	/**
	 * 懒加载字段
    */
	public TextControl deferField(Object value) {
		return (TextControl) this.set("deferField", value);
	}
	
	/**
	 * 描述标题
    */
	public TextControl label(Object value) {
		return (TextControl) this.set("label", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public TextControl hint(Object value) {
		return (TextControl) this.set("hint", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public TextControl clearValueOnHidden(Object value) {
		return (TextControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	 * 事件动作配置
    */
	public TextControl onEvent(Object value) {
		return (TextControl) this.set("onEvent", value);
	}
	
	/**
	 * 组件样式
    */
	public TextControl style(Object value) {
		return (TextControl) this.set("style", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public TextControl editorSetting(Object value) {
		return (TextControl) this.set("editorSetting", value);
	}
	
	/**
	 * 可用来通过 API 拉取 options。
    */
	public TextControl source(Object value) {
		return (TextControl) this.set("source", value);
	}
	
	/**
	 * 控制编辑弹框设置项
    */
	public TextControl editDialog(Object value) {
		return (TextControl) this.set("editDialog", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public TextControl submitOnChange(Object value) {
		return (TextControl) this.set("submitOnChange", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public TextControl validationErrors(Object value) {
		return (TextControl) this.set("validationErrors", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public TextControl id(Object value) {
		return (TextControl) this.set("id", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public TextControl staticClassName(Object value) {
		return (TextControl) this.set("staticClassName", value);
	}
	
	/**
	 * 原生input标签的CSS类名
    */
	public TextControl nativeInputClassName(Object value) {
		return (TextControl) this.set("nativeInputClassName", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public TextControl width(Object value) {
		return (TextControl) this.set("width", value);
	}
	}