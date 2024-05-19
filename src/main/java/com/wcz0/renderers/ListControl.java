package com.wcz0.renderers;
/**
 * List 复选框 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/list

 * @author wcz0
 * @version 6.2.2
 */
public class ListControl extends BaseRenderer {

	public ListControl() {
		this.set("type", "listControl");
	}

	/**
	 * 选项删除提示文字。
    */
	public ListControl deleteConfirmText(Object value) {
		return (ListControl) this.set("deleteConfirmText", value);
	}
	
	/**
	 * 自动填充，当选项被选择的时候，将选项中的其他值同步设置到表单内。
    */
	public ListControl autoFill(Object value) {
		return (ListControl) this.set("autoFill", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public ListControl className(Object value) {
		return (ListControl) this.set("className", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public ListControl labelRemark(Object value) {
		return (ListControl) this.set("labelRemark", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public ListControl width(Object value) {
		return (ListControl) this.set("width", value);
	}
	
	/**
	 * 选项删除 API
    */
	public ListControl deleteApi(Object value) {
		return (ListControl) this.set("deleteApi", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public ListControl staticPlaceholder(Object value) {
		return (ListControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public ListControl staticLabelClassName(Object value) {
		return (ListControl) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 组件样式
    */
	public ListControl style(Object value) {
		return (ListControl) this.set("style", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public ListControl remark(Object value) {
		return (ListControl) this.set("remark", value);
	}
	
	/**
	 * 默认选择选项第一个值。
    */
	public ListControl selectFirst(Object value) {
		return (ListControl) this.set("selectFirst", value);
	}
	
	/**
	 * 点清除按钮时，将表单项设置成当前配置的值。
    */
	public ListControl resetValue(Object value) {
		return (ListControl) this.set("resetValue", value);
	}
	
	/**
	 * 是否可删除
    */
	public ListControl removable(Object value) {
		return (ListControl) this.set("removable", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public ListControl description(Object value) {
		return (ListControl) this.set("description", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public ListControl staticClassName(Object value) {
		return (ListControl) this.set("staticClassName", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public ListControl staticInputClassName(Object value) {
		return (ListControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 懒加载字段
    */
	public ListControl deferField(Object value) {
		return (ListControl) this.set("deferField", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public ListControl name(Object value) {
		return (ListControl) this.set("name", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public ListControl validationErrors(Object value) {
		return (ListControl) this.set("validationErrors", value);
	}
	
	/**
	 * 事件动作配置
    */
	public ListControl onEvent(Object value) {
		return (ListControl) this.set("onEvent", value);
	}
	
	/**
	 * 激活态自定义展示模板。
    */
	public ListControl activeItemSchema(Object value) {
		return (ListControl) this.set("activeItemSchema", value);
	}
	
	/**
	 * 新增时的表单项。
    */
	public ListControl addControls(Object value) {
		return (ListControl) this.set("addControls", value);
	}
	
	/**
	 * 是否可以新增
    */
	public ListControl creatable(Object value) {
		return (ListControl) this.set("creatable", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public ListControl descriptionClassName(Object value) {
		return (ListControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public ListControl $$id(Object value) {
		return (ListControl) this.set("$$id", value);
	}
	
	/**
	 * 是否隐藏
    */
	public ListControl hidden(Object value) {
		return (ListControl) this.set("hidden", value);
	}
	
	/**
	    */
	public ListControl testIdBuilder(Object value) {
		return (ListControl) this.set("testIdBuilder", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public ListControl disabledOn(Object value) {
		return (ListControl) this.set("disabledOn", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public ListControl staticOn(Object value) {
		return (ListControl) this.set("staticOn", value);
	}
	
	/**
	 * 开启后将选中的选项 value 的值封装为数组，作为当前表单项的值。
    */
	public ListControl extractValue(Object value) {
		return (ListControl) this.set("extractValue", value);
	}
	
	/**
	 * 控制编辑弹框设置项
    */
	public ListControl editDialog(Object value) {
		return (ListControl) this.set("editDialog", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public ListControl mode(Object value) {
		return (ListControl) this.set("mode", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public ListControl horizontal(Object value) {
		return (ListControl) this.set("horizontal", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public ListControl clearValueOnHidden(Object value) {
		return (ListControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	 * 选项修改的表单项
    */
	public ListControl editControls(Object value) {
		return (ListControl) this.set("editControls", value);
	}
	
	/**
	 * 配置 input className
    */
	public ListControl inputClassName(Object value) {
		return (ListControl) this.set("inputClassName", value);
	}
	
	/**
	    */
	public ListControl initAutoFill(Object value) {
		return (ListControl) this.set("initAutoFill", value);
	}
	
	/**
	 * 是否显示
    */
	public ListControl visible(Object value) {
		return (ListControl) this.set("visible", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public ListControl editorSetting(Object value) {
		return (ListControl) this.set("editorSetting", value);
	}
	
	/**
	 * 用表达式来配置 source 接口初始要不要拉取
    */
	public ListControl initFetchOn(Object value) {
		return (ListControl) this.set("initFetchOn", value);
	}
	
	/**
	 * 配置 source 接口初始拉不拉取。
    */
	public ListControl initFetch(Object value) {
		return (ListControl) this.set("initFetch", value);
	}
	
	/**
	 * 配置 label className
    */
	public ListControl labelClassName(Object value) {
		return (ListControl) this.set("labelClassName", value);
	}
	
	/**
	    */
	public ListControl validations(Object value) {
		return (ListControl) this.set("validations", value);
	}
	
	/**
	 * 编辑时调用的 API
    */
	public ListControl editApi(Object value) {
		return (ListControl) this.set("editApi", value);
	}
	
	/**
	 * 描述标题
    */
	public ListControl labelAlign(Object value) {
		return (ListControl) this.set("labelAlign", value);
	}
	
	/**
	 * 是否只读
    */
	public ListControl readOnly(Object value) {
		return (ListControl) this.set("readOnly", value);
	}
	
	/**
	 * 只读条件
    */
	public ListControl readOnlyOn(Object value) {
		return (ListControl) this.set("readOnlyOn", value);
	}
	
	/**
	 * 图片div类名
    */
	public ListControl imageClassName(Object value) {
		return (ListControl) this.set("imageClassName", value);
	}
	
	/**
	 * 支持配置 list div 的 css 类名。 比如：flex justify-between
    */
	public ListControl listClassName(Object value) {
		return (ListControl) this.set("listClassName", value);
	}
	
	/**
	 * 占位符
    */
	public ListControl placeholder(Object value) {
		return (ListControl) this.set("placeholder", value);
	}
	
	/**
	 * 选项集合
    */
	public ListControl options(Object value) {
		return (ListControl) this.set("options", value);
	}
	
	/**
	 * 是否为多选模式
    */
	public ListControl multiple(Object value) {
		return (ListControl) this.set("multiple", value);
	}
	
	/**
	 * 新增文字
    */
	public ListControl createBtnLabel(Object value) {
		return (ListControl) this.set("createBtnLabel", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public ListControl labelWidth(Object value) {
		return (ListControl) this.set("labelWidth", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public ListControl extraName(Object value) {
		return (ListControl) this.set("extraName", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public ListControl inline(Object value) {
		return (ListControl) this.set("inline", value);
	}
	
	/**
	 * 多选模式，值太多时是否避免折行
    */
	public ListControl valuesNoWrap(Object value) {
		return (ListControl) this.set("valuesNoWrap", value);
	}
	
	/**
	 * 是否可清除。
    */
	public ListControl clearable(Object value) {
		return (ListControl) this.set("clearable", value);
	}
	
	/**
	    */
	public ListControl desc(Object value) {
		return (ListControl) this.set("desc", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public ListControl id(Object value) {
		return (ListControl) this.set("id", value);
	}
	
	/**
	 * 是否静态展示
    */
	public ListControl static_(Object value) {
		return (ListControl) this.set("static_", value);
	}
	
	/**
	 * 可以自定义展示模板。
    */
	public ListControl itemSchema(Object value) {
		return (ListControl) this.set("itemSchema", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public ListControl hint(Object value) {
		return (ListControl) this.set("hint", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public ListControl value(Object value) {
		return (ListControl) this.set("value", value);
	}
	
	/**
	 * 可用来通过 API 拉取 options。
    */
	public ListControl source(Object value) {
		return (ListControl) this.set("source", value);
	}
	
	/**
	 * 单选模式：当用户选中某个选项时，选项中的 value 将被作为该表单项的值提交，否则，整个选项对象都会作为该表单项的值提交。 多选模式：选中的多个选项的 `value` 会通过 `delimiter` 连接起来，否则直接将以数组的形式提交值。
    */
	public ListControl joinValues(Object value) {
		return (ListControl) this.set("joinValues", value);
	}
	
	/**
	 * 分割符
    */
	public ListControl delimiter(Object value) {
		return (ListControl) this.set("delimiter", value);
	}
	
	/**
	 * 延时加载的 API，当选项中有 defer: true 的选项时，点开会通过此接口扩充。
    */
	public ListControl deferApi(Object value) {
		return (ListControl) this.set("deferApi", value);
	}
	
	/**
	 * 控制新增弹框设置项
    */
	public ListControl addDialog(Object value) {
		return (ListControl) this.set("addDialog", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public ListControl size(Object value) {
		return (ListControl) this.set("size", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public ListControl submitOnChange(Object value) {
		return (ListControl) this.set("submitOnChange", value);
	}
	
	/**
	 * 是否禁用
    */
	public ListControl disabled(Object value) {
		return (ListControl) this.set("disabled", value);
	}
	
	/**
	 * 添加时调用的接口
    */
	public ListControl addApi(Object value) {
		return (ListControl) this.set("addApi", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public ListControl hiddenOn(Object value) {
		return (ListControl) this.set("hiddenOn", value);
	}
	
	/**
	    */
	public ListControl staticSchema(Object value) {
		return (ListControl) this.set("staticSchema", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public ListControl useMobileUI(Object value) {
		return (ListControl) this.set("useMobileUI", value);
	}
	
	/**
	 * 描述标题
    */
	public ListControl label(Object value) {
		return (ListControl) this.set("label", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public ListControl validateApi(Object value) {
		return (ListControl) this.set("validateApi", value);
	}
	
	/**
	 * 开启双击点选并提交。
    */
	public ListControl submitOnDBClick(Object value) {
		return (ListControl) this.set("submitOnDBClick", value);
	}
	
	/**
	 * 是否可以编辑
    */
	public ListControl editable(Object value) {
		return (ListControl) this.set("editable", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public ListControl validateOnChange(Object value) {
		return (ListControl) this.set("validateOnChange", value);
	}
	
	/**
	 * 是否为必填
    */
	public ListControl required(Object value) {
		return (ListControl) this.set("required", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public ListControl visibleOn(Object value) {
		return (ListControl) this.set("visibleOn", value);
	}
	
	/**
	 * 表单项类型
    */
	public ListControl type(Object value) {
		return (ListControl) this.set("type", value);
	}
	}