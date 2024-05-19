package com.wcz0.renderers;
/**
 * RichText 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/input-rich-text

 * @author wcz0
 * @version 6.2.2
 */
public class RichTextControl extends BaseRenderer {

	public RichTextControl() {
		this.set("type", "richTextControl");
	}

	/**
	 * tinymce 或 froala 的配置
    */
	public RichTextControl options(Object value) {
		return (RichTextControl) this.set("options", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public RichTextControl extraName(Object value) {
		return (RichTextControl) this.set("extraName", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public RichTextControl descriptionClassName(Object value) {
		return (RichTextControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public RichTextControl clearValueOnHidden(Object value) {
		return (RichTextControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	 * 配置 label className
    */
	public RichTextControl labelClassName(Object value) {
		return (RichTextControl) this.set("labelClassName", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public RichTextControl hint(Object value) {
		return (RichTextControl) this.set("hint", value);
	}
	
	/**
	 * 组件样式
    */
	public RichTextControl style(Object value) {
		return (RichTextControl) this.set("style", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public RichTextControl editorSetting(Object value) {
		return (RichTextControl) this.set("editorSetting", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public RichTextControl useMobileUI(Object value) {
		return (RichTextControl) this.set("useMobileUI", value);
	}
	
	/**
	    */
	public RichTextControl testIdBuilder(Object value) {
		return (RichTextControl) this.set("testIdBuilder", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public RichTextControl validateApi(Object value) {
		return (RichTextControl) this.set("validateApi", value);
	}
	
	/**
	 * 表单项类型
    */
	public RichTextControl type(Object value) {
		return (RichTextControl) this.set("type", value);
	}
	
	/**
	 * 自动填充，当选项被选择的时候，将选项中的其他值同步设置到表单内。
    */
	public RichTextControl autoFill(Object value) {
		return (RichTextControl) this.set("autoFill", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public RichTextControl staticOn(Object value) {
		return (RichTextControl) this.set("staticOn", value);
	}
	
	/**
	 * 只读条件
    */
	public RichTextControl readOnlyOn(Object value) {
		return (RichTextControl) this.set("readOnlyOn", value);
	}
	
	/**
	    */
	public RichTextControl validations(Object value) {
		return (RichTextControl) this.set("validations", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public RichTextControl width(Object value) {
		return (RichTextControl) this.set("width", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public RichTextControl description(Object value) {
		return (RichTextControl) this.set("description", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public RichTextControl inline(Object value) {
		return (RichTextControl) this.set("inline", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public RichTextControl visibleOn(Object value) {
		return (RichTextControl) this.set("visibleOn", value);
	}
	
	/**
	 * 是否静态展示
    */
	public RichTextControl static_(Object value) {
		return (RichTextControl) this.set("static_", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public RichTextControl labelRemark(Object value) {
		return (RichTextControl) this.set("labelRemark", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public RichTextControl name(Object value) {
		return (RichTextControl) this.set("name", value);
	}
	
	/**
	 * 是否只读
    */
	public RichTextControl readOnly(Object value) {
		return (RichTextControl) this.set("readOnly", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public RichTextControl mode(Object value) {
		return (RichTextControl) this.set("mode", value);
	}
	
	/**
	 * 占位符
    */
	public RichTextControl placeholder(Object value) {
		return (RichTextControl) this.set("placeholder", value);
	}
	
	/**
	 * 编辑器类型
    * 可选值: froala | tinymce
    */
	public RichTextControl vendor(Object value) {
		return (RichTextControl) this.set("vendor", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public RichTextControl $$id(Object value) {
		return (RichTextControl) this.set("$$id", value);
	}
	
	/**
	 * 事件动作配置
    */
	public RichTextControl onEvent(Object value) {
		return (RichTextControl) this.set("onEvent", value);
	}
	
	/**
	 * 描述标题
    */
	public RichTextControl labelAlign(Object value) {
		return (RichTextControl) this.set("labelAlign", value);
	}
	
	/**
	 * 接收器的字段名
    */
	public RichTextControl fileField(Object value) {
		return (RichTextControl) this.set("fileField", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public RichTextControl staticInputClassName(Object value) {
		return (RichTextControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public RichTextControl horizontal(Object value) {
		return (RichTextControl) this.set("horizontal", value);
	}
	
	/**
	 * 是否隐藏
    */
	public RichTextControl hidden(Object value) {
		return (RichTextControl) this.set("hidden", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public RichTextControl hiddenOn(Object value) {
		return (RichTextControl) this.set("hiddenOn", value);
	}
	
	/**
	 * 边框模式，全边框，还是半边框，或者没边框。
    * 可选值: full | half | none
    */
	public RichTextControl borderMode(Object value) {
		return (RichTextControl) this.set("borderMode", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public RichTextControl submitOnChange(Object value) {
		return (RichTextControl) this.set("submitOnChange", value);
	}
	
	/**
	    */
	public RichTextControl desc(Object value) {
		return (RichTextControl) this.set("desc", value);
	}
	
	/**
	 * 图片保存 API
    */
	public RichTextControl receiver(Object value) {
		return (RichTextControl) this.set("receiver", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public RichTextControl remark(Object value) {
		return (RichTextControl) this.set("remark", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public RichTextControl validateOnChange(Object value) {
		return (RichTextControl) this.set("validateOnChange", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public RichTextControl className(Object value) {
		return (RichTextControl) this.set("className", value);
	}
	
	/**
	 * 是否禁用
    */
	public RichTextControl disabled(Object value) {
		return (RichTextControl) this.set("disabled", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public RichTextControl labelWidth(Object value) {
		return (RichTextControl) this.set("labelWidth", value);
	}
	
	/**
	 * 描述标题
    */
	public RichTextControl label(Object value) {
		return (RichTextControl) this.set("label", value);
	}
	
	/**
	 * 配置 input className
    */
	public RichTextControl inputClassName(Object value) {
		return (RichTextControl) this.set("inputClassName", value);
	}
	
	/**
	 * 是否为必填
    */
	public RichTextControl required(Object value) {
		return (RichTextControl) this.set("required", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public RichTextControl value(Object value) {
		return (RichTextControl) this.set("value", value);
	}
	
	/**
	    */
	public RichTextControl initAutoFill(Object value) {
		return (RichTextControl) this.set("initAutoFill", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public RichTextControl staticPlaceholder(Object value) {
		return (RichTextControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public RichTextControl staticClassName(Object value) {
		return (RichTextControl) this.set("staticClassName", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public RichTextControl staticLabelClassName(Object value) {
		return (RichTextControl) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public RichTextControl size(Object value) {
		return (RichTextControl) this.set("size", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public RichTextControl validationErrors(Object value) {
		return (RichTextControl) this.set("validationErrors", value);
	}
	
	/**
	 * 视频保存 API
    */
	public RichTextControl videoReceiver(Object value) {
		return (RichTextControl) this.set("videoReceiver", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public RichTextControl disabledOn(Object value) {
		return (RichTextControl) this.set("disabledOn", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public RichTextControl id(Object value) {
		return (RichTextControl) this.set("id", value);
	}
	
	/**
	 * 是否显示
    */
	public RichTextControl visible(Object value) {
		return (RichTextControl) this.set("visible", value);
	}
	
	/**
	    */
	public RichTextControl staticSchema(Object value) {
		return (RichTextControl) this.set("staticSchema", value);
	}
	}