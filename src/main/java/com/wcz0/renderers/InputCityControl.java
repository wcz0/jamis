package com.wcz0.renderers;
/**
 * City 城市选择框。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/city

 * @author wcz0
 * @version 6.2.2
 */
public class InputCityControl extends BaseRenderer {

	public InputCityControl() {
		this.set("type", "inputCityControl");
	}

	public InputCityControl set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 只读条件
    */
	public InputCityControl readOnlyOn(Object value) {
		return (InputCityControl) this.set("readOnlyOn", value);
	}
	
	/**
	 * 开启后只会存城市的 code 信息
    */
	public InputCityControl extractValue(Object value) {
		return (InputCityControl) this.set("extractValue", value);
	}
	
	/**
	 * 是否将各个信息拼接成字符串。
    */
	public InputCityControl joinValues(Object value) {
		return (InputCityControl) this.set("joinValues", value);
	}
	
	/**
	 * 允许选择街道？
    */
	public InputCityControl allowStreet(Object value) {
		return (InputCityControl) this.set("allowStreet", value);
	}
	
	/**
	 * 是否显示
    */
	public InputCityControl visible(Object value) {
		return (InputCityControl) this.set("visible", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public InputCityControl validateApi(Object value) {
		return (InputCityControl) this.set("validateApi", value);
	}
	
	/**
	 * 拼接的符号是啥？
    */
	public InputCityControl delimiter(Object value) {
		return (InputCityControl) this.set("delimiter", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public InputCityControl name(Object value) {
		return (InputCityControl) this.set("name", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public InputCityControl labelWidth(Object value) {
		return (InputCityControl) this.set("labelWidth", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public InputCityControl validationErrors(Object value) {
		return (InputCityControl) this.set("validationErrors", value);
	}
	
	/**
	 * 允许选择地区？
    */
	public InputCityControl allowDistrict(Object value) {
		return (InputCityControl) this.set("allowDistrict", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public InputCityControl staticInputClassName(Object value) {
		return (InputCityControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public InputCityControl remark(Object value) {
		return (InputCityControl) this.set("remark", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public InputCityControl staticPlaceholder(Object value) {
		return (InputCityControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public InputCityControl editorSetting(Object value) {
		return (InputCityControl) this.set("editorSetting", value);
	}
	
	/**
	 * 描述标题
    */
	public InputCityControl labelAlign(Object value) {
		return (InputCityControl) this.set("labelAlign", value);
	}
	
	/**
	 * 是否为必填
    */
	public InputCityControl required(Object value) {
		return (InputCityControl) this.set("required", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public InputCityControl clearValueOnHidden(Object value) {
		return (InputCityControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	 * 是否隐藏
    */
	public InputCityControl hidden(Object value) {
		return (InputCityControl) this.set("hidden", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public InputCityControl hiddenOn(Object value) {
		return (InputCityControl) this.set("hiddenOn", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public InputCityControl staticClassName(Object value) {
		return (InputCityControl) this.set("staticClassName", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public InputCityControl size(Object value) {
		return (InputCityControl) this.set("size", value);
	}
	
	/**
	    */
	public InputCityControl desc(Object value) {
		return (InputCityControl) this.set("desc", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public InputCityControl horizontal(Object value) {
		return (InputCityControl) this.set("horizontal", value);
	}
	
	/**
	 * 是否显示搜索框
    */
	public InputCityControl searchable(Object value) {
		return (InputCityControl) this.set("searchable", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public InputCityControl disabledOn(Object value) {
		return (InputCityControl) this.set("disabledOn", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public InputCityControl validateOnChange(Object value) {
		return (InputCityControl) this.set("validateOnChange", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public InputCityControl inline(Object value) {
		return (InputCityControl) this.set("inline", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public InputCityControl value(Object value) {
		return (InputCityControl) this.set("value", value);
	}
	
	/**
	 * 是否静态展示
    */
	public InputCityControl static_(Object value) {
		return (InputCityControl) this.set("static_", value);
	}
	
	/**
	    */
	public InputCityControl loadingConfig(Object value) {
		return (InputCityControl) this.set("loadingConfig", value);
	}
	
	/**
	 * 是否只读
    */
	public InputCityControl readOnly(Object value) {
		return (InputCityControl) this.set("readOnly", value);
	}
	
	/**
	    */
	public InputCityControl validations(Object value) {
		return (InputCityControl) this.set("validations", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public InputCityControl width(Object value) {
		return (InputCityControl) this.set("width", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public InputCityControl staticLabelClassName(Object value) {
		return (InputCityControl) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public InputCityControl visibleOn(Object value) {
		return (InputCityControl) this.set("visibleOn", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public InputCityControl className(Object value) {
		return (InputCityControl) this.set("className", value);
	}
	
	/**
	 * 配置 input className
    */
	public InputCityControl inputClassName(Object value) {
		return (InputCityControl) this.set("inputClassName", value);
	}
	
	/**
	 * 配置 label className
    */
	public InputCityControl labelClassName(Object value) {
		return (InputCityControl) this.set("labelClassName", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public InputCityControl descriptionClassName(Object value) {
		return (InputCityControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public InputCityControl mode(Object value) {
		return (InputCityControl) this.set("mode", value);
	}
	
	/**
	 * 指定为城市选择框。
    */
	public InputCityControl type(Object value) {
		return (InputCityControl) this.set("type", value);
	}
	
	/**
	    */
	public InputCityControl staticSchema(Object value) {
		return (InputCityControl) this.set("staticSchema", value);
	}
	
	/**
	 * 占位符
    */
	public InputCityControl placeholder(Object value) {
		return (InputCityControl) this.set("placeholder", value);
	}
	
	/**
	 * 下拉框className
    */
	public InputCityControl itemClassName(Object value) {
		return (InputCityControl) this.set("itemClassName", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public InputCityControl staticOn(Object value) {
		return (InputCityControl) this.set("staticOn", value);
	}
	
	/**
	 * 允许选择城市？
    */
	public InputCityControl allowCity(Object value) {
		return (InputCityControl) this.set("allowCity", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public InputCityControl description(Object value) {
		return (InputCityControl) this.set("description", value);
	}
	
	/**
	 * 描述标题
    */
	public InputCityControl label(Object value) {
		return (InputCityControl) this.set("label", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public InputCityControl extraName(Object value) {
		return (InputCityControl) this.set("extraName", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public InputCityControl labelRemark(Object value) {
		return (InputCityControl) this.set("labelRemark", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public InputCityControl id(Object value) {
		return (InputCityControl) this.set("id", value);
	}
	
	/**
	 * 事件动作配置
    */
	public InputCityControl onEvent(Object value) {
		return (InputCityControl) this.set("onEvent", value);
	}
	
	/**
	 * 组件样式
    */
	public InputCityControl style(Object value) {
		return (InputCityControl) this.set("style", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public InputCityControl useMobileUI(Object value) {
		return (InputCityControl) this.set("useMobileUI", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public InputCityControl hint(Object value) {
		return (InputCityControl) this.set("hint", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public InputCityControl submitOnChange(Object value) {
		return (InputCityControl) this.set("submitOnChange", value);
	}
	
	/**
	 * 是否禁用
    */
	public InputCityControl disabled(Object value) {
		return (InputCityControl) this.set("disabled", value);
	}
	}