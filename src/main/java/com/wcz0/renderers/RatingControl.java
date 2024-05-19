package com.wcz0.renderers;
/**
 * Rating 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/rating

 * @author wcz0
 * @version 6.2.2
 */
public class RatingControl extends BaseRenderer {

	public RatingControl() {
		this.set("type", "ratingControl");
	}

	/**
	 * 描述内容，支持 Html 片段。
    */
	public RatingControl description(Object value) {
		return (RatingControl) this.set("description", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public RatingControl hiddenOn(Object value) {
		return (RatingControl) this.set("hiddenOn", value);
	}
	
	/**
	 * 描述标题
    */
	public RatingControl labelAlign(Object value) {
		return (RatingControl) this.set("labelAlign", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public RatingControl extraName(Object value) {
		return (RatingControl) this.set("extraName", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public RatingControl remark(Object value) {
		return (RatingControl) this.set("remark", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public RatingControl horizontal(Object value) {
		return (RatingControl) this.set("horizontal", value);
	}
	
	/**
	 * 自定义字符
    */
	public RatingControl char_(Object value) {
		return (RatingControl) this.set("char_", value);
	}
	
	/**
	 * 事件动作配置
    */
	public RatingControl onEvent(Object value) {
		return (RatingControl) this.set("onEvent", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public RatingControl useMobileUI(Object value) {
		return (RatingControl) this.set("useMobileUI", value);
	}
	
	/**
	 * 描述标题
    */
	public RatingControl label(Object value) {
		return (RatingControl) this.set("label", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public RatingControl labelRemark(Object value) {
		return (RatingControl) this.set("labelRemark", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public RatingControl staticClassName(Object value) {
		return (RatingControl) this.set("staticClassName", value);
	}
	
	/**
	 * 配置 label className
    */
	public RatingControl labelClassName(Object value) {
		return (RatingControl) this.set("labelClassName", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public RatingControl validationErrors(Object value) {
		return (RatingControl) this.set("validationErrors", value);
	}
	
	/**
	 * 自动填充，当选项被选择的时候，将选项中的其他值同步设置到表单内。
    */
	public RatingControl autoFill(Object value) {
		return (RatingControl) this.set("autoFill", value);
	}
	
	/**
	 * 星星被选中时的提示文字
    */
	public RatingControl texts(Object value) {
		return (RatingControl) this.set("texts", value);
	}
	
	/**
	 * 是否隐藏
    */
	public RatingControl hidden(Object value) {
		return (RatingControl) this.set("hidden", value);
	}
	
	/**
	 * 只读条件
    */
	public RatingControl readOnlyOn(Object value) {
		return (RatingControl) this.set("readOnlyOn", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public RatingControl descriptionClassName(Object value) {
		return (RatingControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public RatingControl clearValueOnHidden(Object value) {
		return (RatingControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	 * 表单项类型
    */
	public RatingControl type(Object value) {
		return (RatingControl) this.set("type", value);
	}
	
	/**
	 * 是否禁用
    */
	public RatingControl disabled(Object value) {
		return (RatingControl) this.set("disabled", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public RatingControl visibleOn(Object value) {
		return (RatingControl) this.set("visibleOn", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public RatingControl name(Object value) {
		return (RatingControl) this.set("name", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public RatingControl hint(Object value) {
		return (RatingControl) this.set("hint", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public RatingControl editorSetting(Object value) {
		return (RatingControl) this.set("editorSetting", value);
	}
	
	/**
	 * 组件样式
    */
	public RatingControl style(Object value) {
		return (RatingControl) this.set("style", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public RatingControl disabledOn(Object value) {
		return (RatingControl) this.set("disabledOn", value);
	}
	
	/**
	    */
	public RatingControl staticSchema(Object value) {
		return (RatingControl) this.set("staticSchema", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public RatingControl submitOnChange(Object value) {
		return (RatingControl) this.set("submitOnChange", value);
	}
	
	/**
	 * 分数
    */
	public RatingControl count(Object value) {
		return (RatingControl) this.set("count", value);
	}
	
	/**
	 * 星星被选中的颜色
    */
	public RatingControl colors(Object value) {
		return (RatingControl) this.set("colors", value);
	}
	
	/**
	 * 自定义字符类名
    */
	public RatingControl charClassName(Object value) {
		return (RatingControl) this.set("charClassName", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public RatingControl staticPlaceholder(Object value) {
		return (RatingControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public RatingControl validateOnChange(Object value) {
		return (RatingControl) this.set("validateOnChange", value);
	}
	
	/**
	    */
	public RatingControl desc(Object value) {
		return (RatingControl) this.set("desc", value);
	}
	
	/**
	    */
	public RatingControl validations(Object value) {
		return (RatingControl) this.set("validations", value);
	}
	
	/**
	 * 配置 input className
    */
	public RatingControl inputClassName(Object value) {
		return (RatingControl) this.set("inputClassName", value);
	}
	
	/**
	    */
	public RatingControl initAutoFill(Object value) {
		return (RatingControl) this.set("initAutoFill", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public RatingControl value(Object value) {
		return (RatingControl) this.set("value", value);
	}
	
	/**
	 * 是否允许再次点击后清除
    */
	public RatingControl allowClear(Object value) {
		return (RatingControl) this.set("allowClear", value);
	}
	
	/**
	 * 是否静态展示
    */
	public RatingControl static_(Object value) {
		return (RatingControl) this.set("static_", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public RatingControl size(Object value) {
		return (RatingControl) this.set("size", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public RatingControl inline(Object value) {
		return (RatingControl) this.set("inline", value);
	}
	
	/**
	 * 文字的位置
    */
	public RatingControl textPosition(Object value) {
		return (RatingControl) this.set("textPosition", value);
	}
	
	/**
	 * 自定义文字类名
    */
	public RatingControl textClassName(Object value) {
		return (RatingControl) this.set("textClassName", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public RatingControl staticOn(Object value) {
		return (RatingControl) this.set("staticOn", value);
	}
	
	/**
	 * 是否只读
    */
	public RatingControl readOnly(Object value) {
		return (RatingControl) this.set("readOnly", value);
	}
	
	/**
	 * 允许半颗星
    */
	public RatingControl half(Object value) {
		return (RatingControl) this.set("half", value);
	}
	
	/**
	 * 是否只读
    */
	public RatingControl readonly(Object value) {
		return (RatingControl) this.set("readonly", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public RatingControl labelWidth(Object value) {
		return (RatingControl) this.set("labelWidth", value);
	}
	
	/**
	 * 占位符
    */
	public RatingControl placeholder(Object value) {
		return (RatingControl) this.set("placeholder", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public RatingControl width(Object value) {
		return (RatingControl) this.set("width", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public RatingControl className(Object value) {
		return (RatingControl) this.set("className", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public RatingControl id(Object value) {
		return (RatingControl) this.set("id", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public RatingControl staticInputClassName(Object value) {
		return (RatingControl) this.set("staticInputClassName", value);
	}
	
	/**
	    */
	public RatingControl testIdBuilder(Object value) {
		return (RatingControl) this.set("testIdBuilder", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public RatingControl validateApi(Object value) {
		return (RatingControl) this.set("validateApi", value);
	}
	
	/**
	 * 未被选中的星星的颜色
    */
	public RatingControl inactiveColor(Object value) {
		return (RatingControl) this.set("inactiveColor", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public RatingControl $$id(Object value) {
		return (RatingControl) this.set("$$id", value);
	}
	
	/**
	 * 是否显示
    */
	public RatingControl visible(Object value) {
		return (RatingControl) this.set("visible", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public RatingControl staticLabelClassName(Object value) {
		return (RatingControl) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public RatingControl mode(Object value) {
		return (RatingControl) this.set("mode", value);
	}
	
	/**
	 * 是否为必填
    */
	public RatingControl required(Object value) {
		return (RatingControl) this.set("required", value);
	}
	}