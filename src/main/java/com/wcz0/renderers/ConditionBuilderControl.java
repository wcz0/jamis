package com.wcz0.renderers;
/**
 * 条件组合控件 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/condition-builder

 * @author wcz0
 * @version 6.2.2
 */
public class ConditionBuilderControl extends BaseRenderer {

	public ConditionBuilderControl() {
		this.set("type", "conditionBuilderControl");
	}

	public ConditionBuilderControl set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * label自定义宽度，默认单位为px
    */
	public ConditionBuilderControl labelWidth(Object value) {
		return (ConditionBuilderControl) this.set("labelWidth", value);
	}
	
	/**
	 * 其他配置
    */
	public ConditionBuilderControl config(Object value) {
		return (ConditionBuilderControl) this.set("config", value);
	}
	
	/**
	 * 通过远程拉取配置项
    */
	public ConditionBuilderControl source(Object value) {
		return (ConditionBuilderControl) this.set("source", value);
	}
	
	/**
	 * 将字段输入控件变成公式编辑器。
    */
	public ConditionBuilderControl formula(Object value) {
		return (ConditionBuilderControl) this.set("formula", value);
	}
	
	/**
	 * 是否禁用
    */
	public ConditionBuilderControl disabled(Object value) {
		return (ConditionBuilderControl) this.set("disabled", value);
	}
	
	/**
	 * 只读条件
    */
	public ConditionBuilderControl readOnlyOn(Object value) {
		return (ConditionBuilderControl) this.set("readOnlyOn", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public ConditionBuilderControl validateOnChange(Object value) {
		return (ConditionBuilderControl) this.set("validateOnChange", value);
	}
	
	/**
	 * 占位符
    */
	public ConditionBuilderControl placeholder(Object value) {
		return (ConditionBuilderControl) this.set("placeholder", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public ConditionBuilderControl extraName(Object value) {
		return (ConditionBuilderControl) this.set("extraName", value);
	}
	
	/**
	 * 是否只读
    */
	public ConditionBuilderControl readOnly(Object value) {
		return (ConditionBuilderControl) this.set("readOnly", value);
	}
	
	/**
	    */
	public ConditionBuilderControl desc(Object value) {
		return (ConditionBuilderControl) this.set("desc", value);
	}
	
	/**
	 * 内嵌模式，默认为 true
    */
	public ConditionBuilderControl embed(Object value) {
		return (ConditionBuilderControl) this.set("embed", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public ConditionBuilderControl value(Object value) {
		return (ConditionBuilderControl) this.set("value", value);
	}
	
	/**
	 * 表达式：控制按钮“添加条件组”的显示
    */
	public ConditionBuilderControl addGroupBtnVisibleOn(Object value) {
		return (ConditionBuilderControl) this.set("addGroupBtnVisibleOn", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public ConditionBuilderControl disabledOn(Object value) {
		return (ConditionBuilderControl) this.set("disabledOn", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public ConditionBuilderControl staticOn(Object value) {
		return (ConditionBuilderControl) this.set("staticOn", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public ConditionBuilderControl staticClassName(Object value) {
		return (ConditionBuilderControl) this.set("staticClassName", value);
	}
	
	/**
	 * 描述标题
    */
	public ConditionBuilderControl label(Object value) {
		return (ConditionBuilderControl) this.set("label", value);
	}
	
	/**
	 * 非内嵌模式时 弹窗触发icon
    */
	public ConditionBuilderControl pickerIcon(Object value) {
		return (ConditionBuilderControl) this.set("pickerIcon", value);
	}
	
	/**
	 * 函数集合
    */
	public ConditionBuilderControl funcs(Object value) {
		return (ConditionBuilderControl) this.set("funcs", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public ConditionBuilderControl staticLabelClassName(Object value) {
		return (ConditionBuilderControl) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public ConditionBuilderControl size(Object value) {
		return (ConditionBuilderControl) this.set("size", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public ConditionBuilderControl validationErrors(Object value) {
		return (ConditionBuilderControl) this.set("validationErrors", value);
	}
	
	/**
	 * 指定为
    */
	public ConditionBuilderControl type(Object value) {
		return (ConditionBuilderControl) this.set("type", value);
	}
	
	/**
	 * 字段集合
    */
	public ConditionBuilderControl fields(Object value) {
		return (ConditionBuilderControl) this.set("fields", value);
	}
	
	/**
	 * 展现模式
    * 可选值: simple | full
    */
	public ConditionBuilderControl builderMode(Object value) {
		return (ConditionBuilderControl) this.set("builderMode", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public ConditionBuilderControl visibleOn(Object value) {
		return (ConditionBuilderControl) this.set("visibleOn", value);
	}
	
	/**
	    */
	public ConditionBuilderControl staticSchema(Object value) {
		return (ConditionBuilderControl) this.set("staticSchema", value);
	}
	
	/**
	    */
	public ConditionBuilderControl validations(Object value) {
		return (ConditionBuilderControl) this.set("validations", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public ConditionBuilderControl validateApi(Object value) {
		return (ConditionBuilderControl) this.set("validateApi", value);
	}
	
	/**
	 * 是否可拖拽，默认为 true
    */
	public ConditionBuilderControl draggable(Object value) {
		return (ConditionBuilderControl) this.set("draggable", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public ConditionBuilderControl staticPlaceholder(Object value) {
		return (ConditionBuilderControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public ConditionBuilderControl editorSetting(Object value) {
		return (ConditionBuilderControl) this.set("editorSetting", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public ConditionBuilderControl description(Object value) {
		return (ConditionBuilderControl) this.set("description", value);
	}
	
	/**
	 * 是否显示并或切换键按钮，只在简单模式下有用
    */
	public ConditionBuilderControl showANDOR(Object value) {
		return (ConditionBuilderControl) this.set("showANDOR", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public ConditionBuilderControl labelRemark(Object value) {
		return (ConditionBuilderControl) this.set("labelRemark", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public ConditionBuilderControl inline(Object value) {
		return (ConditionBuilderControl) this.set("inline", value);
	}
	
	/**
	 * 是否为必填
    */
	public ConditionBuilderControl required(Object value) {
		return (ConditionBuilderControl) this.set("required", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public ConditionBuilderControl name(Object value) {
		return (ConditionBuilderControl) this.set("name", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public ConditionBuilderControl descriptionClassName(Object value) {
		return (ConditionBuilderControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public ConditionBuilderControl mode(Object value) {
		return (ConditionBuilderControl) this.set("mode", value);
	}
	
	/**
	    */
	public ConditionBuilderControl addBtnVisibleOn(Object value) {
		return (ConditionBuilderControl) this.set("addBtnVisibleOn", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public ConditionBuilderControl hiddenOn(Object value) {
		return (ConditionBuilderControl) this.set("hiddenOn", value);
	}
	
	/**
	 * 是否显示
    */
	public ConditionBuilderControl visible(Object value) {
		return (ConditionBuilderControl) this.set("visible", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public ConditionBuilderControl useMobileUI(Object value) {
		return (ConditionBuilderControl) this.set("useMobileUI", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public ConditionBuilderControl hint(Object value) {
		return (ConditionBuilderControl) this.set("hint", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public ConditionBuilderControl width(Object value) {
		return (ConditionBuilderControl) this.set("width", value);
	}
	
	/**
	 * 是否静态展示
    */
	public ConditionBuilderControl static_(Object value) {
		return (ConditionBuilderControl) this.set("static_", value);
	}
	
	/**
	 * 组件样式
    */
	public ConditionBuilderControl style(Object value) {
		return (ConditionBuilderControl) this.set("style", value);
	}
	
	/**
	 * 事件动作配置
    */
	public ConditionBuilderControl onEvent(Object value) {
		return (ConditionBuilderControl) this.set("onEvent", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public ConditionBuilderControl submitOnChange(Object value) {
		return (ConditionBuilderControl) this.set("submitOnChange", value);
	}
	
	/**
	 * 配置 label className
    */
	public ConditionBuilderControl labelClassName(Object value) {
		return (ConditionBuilderControl) this.set("labelClassName", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public ConditionBuilderControl remark(Object value) {
		return (ConditionBuilderControl) this.set("remark", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public ConditionBuilderControl horizontal(Object value) {
		return (ConditionBuilderControl) this.set("horizontal", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public ConditionBuilderControl id(Object value) {
		return (ConditionBuilderControl) this.set("id", value);
	}
	
	/**
	 * 描述标题
    */
	public ConditionBuilderControl labelAlign(Object value) {
		return (ConditionBuilderControl) this.set("labelAlign", value);
	}
	
	/**
	 * 配置 input className
    */
	public ConditionBuilderControl inputClassName(Object value) {
		return (ConditionBuilderControl) this.set("inputClassName", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public ConditionBuilderControl className(Object value) {
		return (ConditionBuilderControl) this.set("className", value);
	}
	
	/**
	 * 是否隐藏
    */
	public ConditionBuilderControl hidden(Object value) {
		return (ConditionBuilderControl) this.set("hidden", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public ConditionBuilderControl staticInputClassName(Object value) {
		return (ConditionBuilderControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public ConditionBuilderControl clearValueOnHidden(Object value) {
		return (ConditionBuilderControl) this.set("clearValueOnHidden", value);
	}
	}