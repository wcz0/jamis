package com.wcz0.renderers;
/**
 * Editor 代码编辑器 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/editor

 * @author wcz0
 * @version 6.2.2
 */
public class EditorControl extends BaseRenderer {

	public EditorControl() {
		this.set("type", "editorControl");
	}

	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public EditorControl clearValueOnHidden(Object value) {
		return (EditorControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	    */
	public EditorControl initAutoFill(Object value) {
		return (EditorControl) this.set("initAutoFill", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public EditorControl disabledOn(Object value) {
		return (EditorControl) this.set("disabledOn", value);
	}
	
	/**
	 * 是否静态展示
    */
	public EditorControl static_(Object value) {
		return (EditorControl) this.set("static_", value);
	}
	
	/**
	    */
	public EditorControl testIdBuilder(Object value) {
		return (EditorControl) this.set("testIdBuilder", value);
	}
	
	/**
	 * 描述标题
    */
	public EditorControl labelAlign(Object value) {
		return (EditorControl) this.set("labelAlign", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public EditorControl name(Object value) {
		return (EditorControl) this.set("name", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public EditorControl hiddenOn(Object value) {
		return (EditorControl) this.set("hiddenOn", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public EditorControl labelWidth(Object value) {
		return (EditorControl) this.set("labelWidth", value);
	}
	
	/**
	 * 配置 label className
    */
	public EditorControl labelClassName(Object value) {
		return (EditorControl) this.set("labelClassName", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public EditorControl submitOnChange(Object value) {
		return (EditorControl) this.set("submitOnChange", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public EditorControl id(Object value) {
		return (EditorControl) this.set("id", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public EditorControl staticOn(Object value) {
		return (EditorControl) this.set("staticOn", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public EditorControl extraName(Object value) {
		return (EditorControl) this.set("extraName", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public EditorControl descriptionClassName(Object value) {
		return (EditorControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public EditorControl mode(Object value) {
		return (EditorControl) this.set("mode", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public EditorControl validationErrors(Object value) {
		return (EditorControl) this.set("validationErrors", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public EditorControl className(Object value) {
		return (EditorControl) this.set("className", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public EditorControl labelRemark(Object value) {
		return (EditorControl) this.set("labelRemark", value);
	}
	
	/**
	 * 是否只读
    */
	public EditorControl readOnly(Object value) {
		return (EditorControl) this.set("readOnly", value);
	}
	
	/**
	 * 占位符
    */
	public EditorControl placeholder(Object value) {
		return (EditorControl) this.set("placeholder", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public EditorControl staticPlaceholder(Object value) {
		return (EditorControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public EditorControl staticInputClassName(Object value) {
		return (EditorControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 编辑器大小
    * 可选值: sm | md | lg | xl | xxl
    */
	public EditorControl size(Object value) {
		return (EditorControl) this.set("size", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public EditorControl editorSetting(Object value) {
		return (EditorControl) this.set("editorSetting", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public EditorControl remark(Object value) {
		return (EditorControl) this.set("remark", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public EditorControl value(Object value) {
		return (EditorControl) this.set("value", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public EditorControl staticLabelClassName(Object value) {
		return (EditorControl) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 事件动作配置
    */
	public EditorControl onEvent(Object value) {
		return (EditorControl) this.set("onEvent", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public EditorControl staticClassName(Object value) {
		return (EditorControl) this.set("staticClassName", value);
	}
	
	/**
	    * 可选值: editor | bat-editor | c-editor | coffeescript-editor | cpp-editor | csharp-editor | css-editor | dockerfile-editor | fsharp-editor | go-editor | handlebars-editor | html-editor | ini-editor | java-editor | javascript-editor | json-editor | less-editor | lua-editor | markdown-editor | msdax-editor | objective-c-editor | php-editor | plaintext-editor | postiats-editor | powershell-editor | pug-editor | python-editor | r-editor | razor-editor | ruby-editor | sb-editor | scss-editor | sol-editor | sql-editor | swift-editor | typescript-editor | vb-editor | xml-editor | yaml-editor
    */
	public EditorControl type(Object value) {
		return (EditorControl) this.set("type", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public EditorControl validateApi(Object value) {
		return (EditorControl) this.set("validateApi", value);
	}
	
	/**
	 * 自动填充，当选项被选择的时候，将选项中的其他值同步设置到表单内。
    */
	public EditorControl autoFill(Object value) {
		return (EditorControl) this.set("autoFill", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public EditorControl validateOnChange(Object value) {
		return (EditorControl) this.set("validateOnChange", value);
	}
	
	/**
	 * 是否为必填
    */
	public EditorControl required(Object value) {
		return (EditorControl) this.set("required", value);
	}
	
	/**
	 * 是否显示
    */
	public EditorControl visible(Object value) {
		return (EditorControl) this.set("visible", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public EditorControl visibleOn(Object value) {
		return (EditorControl) this.set("visibleOn", value);
	}
	
	/**
	 * 描述标题
    */
	public EditorControl label(Object value) {
		return (EditorControl) this.set("label", value);
	}
	
	/**
	 * 是否隐藏
    */
	public EditorControl hidden(Object value) {
		return (EditorControl) this.set("hidden", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public EditorControl useMobileUI(Object value) {
		return (EditorControl) this.set("useMobileUI", value);
	}
	
	/**
	    */
	public EditorControl validations(Object value) {
		return (EditorControl) this.set("validations", value);
	}
	
	/**
	 * 是否禁用
    */
	public EditorControl disabled(Object value) {
		return (EditorControl) this.set("disabled", value);
	}
	
	/**
	    */
	public EditorControl staticSchema(Object value) {
		return (EditorControl) this.set("staticSchema", value);
	}
	
	/**
	 * 只读条件
    */
	public EditorControl readOnlyOn(Object value) {
		return (EditorControl) this.set("readOnlyOn", value);
	}
	
	/**
	    */
	public EditorControl desc(Object value) {
		return (EditorControl) this.set("desc", value);
	}
	
	/**
	 * 语言类型
    * 可选值: bat | c | coffeescript | cpp | csharp | css | dockerfile | fsharp | go | handlebars | html | ini | java | javascript | json | less | lua | markdown | msdax | objective-c | php | plaintext | postiats | powershell | pug | python | r | razor | ruby | sb | scss | shell | sol | sql | swift | typescript | vb | xml | yaml
    */
	public EditorControl language(Object value) {
		return (EditorControl) this.set("language", value);
	}
	
	/**
	 * 是否展示全屏模式开关
    */
	public EditorControl allowFullscreen(Object value) {
		return (EditorControl) this.set("allowFullscreen", value);
	}
	
	/**
	 * 获取编辑器底层实例
    */
	public EditorControl editorDidMount(Object value) {
		return (EditorControl) this.set("editorDidMount", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public EditorControl hint(Object value) {
		return (EditorControl) this.set("hint", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public EditorControl description(Object value) {
		return (EditorControl) this.set("description", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public EditorControl horizontal(Object value) {
		return (EditorControl) this.set("horizontal", value);
	}
	
	/**
	 * 配置 input className
    */
	public EditorControl inputClassName(Object value) {
		return (EditorControl) this.set("inputClassName", value);
	}
	
	/**
	 * 组件样式
    */
	public EditorControl style(Object value) {
		return (EditorControl) this.set("style", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public EditorControl width(Object value) {
		return (EditorControl) this.set("width", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public EditorControl inline(Object value) {
		return (EditorControl) this.set("inline", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public EditorControl $$id(Object value) {
		return (EditorControl) this.set("$$id", value);
	}
	}