package com.wcz0.renderers;
/**
 * Location 选点组件 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/location

 * @author wcz0
 * @version 6.2.2
 */
public class LocationControl extends BaseRenderer {

	public LocationControl() {
		this.set("type", "locationControl");
	}

	public LocationControl set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public LocationControl id(Object value) {
		return (LocationControl) this.set("id", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public LocationControl staticLabelClassName(Object value) {
		return (LocationControl) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 描述标题
    */
	public LocationControl labelAlign(Object value) {
		return (LocationControl) this.set("labelAlign", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public LocationControl className(Object value) {
		return (LocationControl) this.set("className", value);
	}
	
	/**
	 * 配置 label className
    */
	public LocationControl labelClassName(Object value) {
		return (LocationControl) this.set("labelClassName", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public LocationControl inline(Object value) {
		return (LocationControl) this.set("inline", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public LocationControl name(Object value) {
		return (LocationControl) this.set("name", value);
	}
	
	/**
	 * 是否显示
    */
	public LocationControl visible(Object value) {
		return (LocationControl) this.set("visible", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public LocationControl staticInputClassName(Object value) {
		return (LocationControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public LocationControl clearValueOnHidden(Object value) {
		return (LocationControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	 * 是否隐藏
    */
	public LocationControl hidden(Object value) {
		return (LocationControl) this.set("hidden", value);
	}
	
	/**
	 * 组件样式
    */
	public LocationControl style(Object value) {
		return (LocationControl) this.set("style", value);
	}
	
	/**
	 * 有的地图需要设置 ak 信息
    */
	public LocationControl ak(Object value) {
		return (LocationControl) this.set("ak", value);
	}
	
	/**
	 * 是否静态展示
    */
	public LocationControl static_(Object value) {
		return (LocationControl) this.set("static_", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public LocationControl staticClassName(Object value) {
		return (LocationControl) this.set("staticClassName", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public LocationControl extraName(Object value) {
		return (LocationControl) this.set("extraName", value);
	}
	
	/**
	 * 是否禁用
    */
	public LocationControl disabled(Object value) {
		return (LocationControl) this.set("disabled", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public LocationControl staticOn(Object value) {
		return (LocationControl) this.set("staticOn", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public LocationControl hint(Object value) {
		return (LocationControl) this.set("hint", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public LocationControl width(Object value) {
		return (LocationControl) this.set("width", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public LocationControl horizontal(Object value) {
		return (LocationControl) this.set("horizontal", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public LocationControl value(Object value) {
		return (LocationControl) this.set("value", value);
	}
	
	/**
	    */
	public LocationControl staticSchema(Object value) {
		return (LocationControl) this.set("staticSchema", value);
	}
	
	/**
	 * 占位符
    */
	public LocationControl placeholder(Object value) {
		return (LocationControl) this.set("placeholder", value);
	}
	
	/**
	 * 选择地图类型
    * 可选值: baidu | gaode | tenxun
    */
	public LocationControl vendor(Object value) {
		return (LocationControl) this.set("vendor", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public LocationControl descriptionClassName(Object value) {
		return (LocationControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 是否为必填
    */
	public LocationControl required(Object value) {
		return (LocationControl) this.set("required", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public LocationControl disabledOn(Object value) {
		return (LocationControl) this.set("disabledOn", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public LocationControl hiddenOn(Object value) {
		return (LocationControl) this.set("hiddenOn", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public LocationControl visibleOn(Object value) {
		return (LocationControl) this.set("visibleOn", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public LocationControl remark(Object value) {
		return (LocationControl) this.set("remark", value);
	}
	
	/**
	 * 是否自动选中当前地理位置
    */
	public LocationControl autoSelectCurrentLoc(Object value) {
		return (LocationControl) this.set("autoSelectCurrentLoc", value);
	}
	
	/**
	 * 是否只读
    */
	public LocationControl readOnly(Object value) {
		return (LocationControl) this.set("readOnly", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public LocationControl validateApi(Object value) {
		return (LocationControl) this.set("validateApi", value);
	}
	
	/**
	 * 表单项类型
    */
	public LocationControl type(Object value) {
		return (LocationControl) this.set("type", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public LocationControl size(Object value) {
		return (LocationControl) this.set("size", value);
	}
	
	/**
	 * 事件动作配置
    */
	public LocationControl onEvent(Object value) {
		return (LocationControl) this.set("onEvent", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public LocationControl editorSetting(Object value) {
		return (LocationControl) this.set("editorSetting", value);
	}
	
	/**
	    */
	public LocationControl validations(Object value) {
		return (LocationControl) this.set("validations", value);
	}
	
	/**
	 * 只读条件
    */
	public LocationControl readOnlyOn(Object value) {
		return (LocationControl) this.set("readOnlyOn", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public LocationControl validateOnChange(Object value) {
		return (LocationControl) this.set("validateOnChange", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public LocationControl labelRemark(Object value) {
		return (LocationControl) this.set("labelRemark", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public LocationControl staticPlaceholder(Object value) {
		return (LocationControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public LocationControl labelWidth(Object value) {
		return (LocationControl) this.set("labelWidth", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public LocationControl validationErrors(Object value) {
		return (LocationControl) this.set("validationErrors", value);
	}
	
	/**
	 * 是否限制只能选中当前地理位置 备注：可用于充当定位组件，只允许选择当前位置
    */
	public LocationControl onlySelectCurrentLoc(Object value) {
		return (LocationControl) this.set("onlySelectCurrentLoc", value);
	}
	
	/**
	 * 开启只读模式后的占位提示，默认为“点击获取位置信息” 备注：区分下现有的placeholder（“请选择位置”）
    */
	public LocationControl getLocationPlaceholder(Object value) {
		return (LocationControl) this.set("getLocationPlaceholder", value);
	}
	
	/**
	    */
	public LocationControl desc(Object value) {
		return (LocationControl) this.set("desc", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public LocationControl mode(Object value) {
		return (LocationControl) this.set("mode", value);
	}
	
	/**
	 * 配置 input className
    */
	public LocationControl inputClassName(Object value) {
		return (LocationControl) this.set("inputClassName", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public LocationControl useMobileUI(Object value) {
		return (LocationControl) this.set("useMobileUI", value);
	}
	
	/**
	 * 描述标题
    */
	public LocationControl label(Object value) {
		return (LocationControl) this.set("label", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public LocationControl submitOnChange(Object value) {
		return (LocationControl) this.set("submitOnChange", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public LocationControl description(Object value) {
		return (LocationControl) this.set("description", value);
	}
	}