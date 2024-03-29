package com.wcz0.renderers;
/**
 * Nested Select 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/nested-select

 * @author wcz0
 * @version 6.2.2
 */
public class NestedSelectControl extends BaseRenderer {

	public NestedSelectControl() {
		this.set("type", "nestedSelectControl");
	}

	public NestedSelectControl set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 选父级的时候是否把子节点的值也包含在内。
    */
	public NestedSelectControl withChildren(Object value) {
		return (NestedSelectControl) this.set("withChildren", value);
	}
	
	/**
	 * 是否只读
    */
	public NestedSelectControl readOnly(Object value) {
		return (NestedSelectControl) this.set("readOnly", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public NestedSelectControl staticInputClassName(Object value) {
		return (NestedSelectControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 组件样式
    */
	public NestedSelectControl style(Object value) {
		return (NestedSelectControl) this.set("style", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public NestedSelectControl useMobileUI(Object value) {
		return (NestedSelectControl) this.set("useMobileUI", value);
	}
	
	/**
	 * 是否禁用
    */
	public NestedSelectControl disabled(Object value) {
		return (NestedSelectControl) this.set("disabled", value);
	}
	
	/**
	 * 开启后将选中的选项 value 的值封装为数组，作为当前表单项的值。
    */
	public NestedSelectControl extractValue(Object value) {
		return (NestedSelectControl) this.set("extractValue", value);
	}
	
	/**
	 * 自动填充，当选项被选择的时候，将选项中的其他值同步设置到表单内。
    */
	public NestedSelectControl autoFill(Object value) {
		return (NestedSelectControl) this.set("autoFill", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public NestedSelectControl name(Object value) {
		return (NestedSelectControl) this.set("name", value);
	}
	
	/**
	 * 配置 input className
    */
	public NestedSelectControl inputClassName(Object value) {
		return (NestedSelectControl) this.set("inputClassName", value);
	}
	
	/**
	 * 占位符
    */
	public NestedSelectControl placeholder(Object value) {
		return (NestedSelectControl) this.set("placeholder", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public NestedSelectControl clearValueOnHidden(Object value) {
		return (NestedSelectControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public NestedSelectControl staticLabelClassName(Object value) {
		return (NestedSelectControl) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public NestedSelectControl remark(Object value) {
		return (NestedSelectControl) this.set("remark", value);
	}
	
	/**
	 * 可用来通过 API 拉取 options。
    */
	public NestedSelectControl source(Object value) {
		return (NestedSelectControl) this.set("source", value);
	}
	
	/**
	 * 默认选择选项第一个值。
    */
	public NestedSelectControl selectFirst(Object value) {
		return (NestedSelectControl) this.set("selectFirst", value);
	}
	
	/**
	 * 是否可清除。
    */
	public NestedSelectControl clearable(Object value) {
		return (NestedSelectControl) this.set("clearable", value);
	}
	
	/**
	 * 懒加载字段
    */
	public NestedSelectControl deferField(Object value) {
		return (NestedSelectControl) this.set("deferField", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public NestedSelectControl labelWidth(Object value) {
		return (NestedSelectControl) this.set("labelWidth", value);
	}
	
	/**
	 * 选项删除 API
    */
	public NestedSelectControl deleteApi(Object value) {
		return (NestedSelectControl) this.set("deleteApi", value);
	}
	
	/**
	 * 描述标题
    */
	public NestedSelectControl label(Object value) {
		return (NestedSelectControl) this.set("label", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public NestedSelectControl staticPlaceholder(Object value) {
		return (NestedSelectControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 边框模式，全边框，还是半边框，或者没边框。
    * 可选值: full | half | none
    */
	public NestedSelectControl borderMode(Object value) {
		return (NestedSelectControl) this.set("borderMode", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public NestedSelectControl width(Object value) {
		return (NestedSelectControl) this.set("width", value);
	}
	
	/**
	 * 点清除按钮时，将表单项设置成当前配置的值。
    */
	public NestedSelectControl resetValue(Object value) {
		return (NestedSelectControl) this.set("resetValue", value);
	}
	
	/**
	 * 添加时调用的接口
    */
	public NestedSelectControl addApi(Object value) {
		return (NestedSelectControl) this.set("addApi", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public NestedSelectControl submitOnChange(Object value) {
		return (NestedSelectControl) this.set("submitOnChange", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public NestedSelectControl description(Object value) {
		return (NestedSelectControl) this.set("description", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public NestedSelectControl descriptionClassName(Object value) {
		return (NestedSelectControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 控制新增弹框设置项
    */
	public NestedSelectControl addDialog(Object value) {
		return (NestedSelectControl) this.set("addDialog", value);
	}
	
	/**
	 * 控制编辑弹框设置项
    */
	public NestedSelectControl editDialog(Object value) {
		return (NestedSelectControl) this.set("editDialog", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public NestedSelectControl extraName(Object value) {
		return (NestedSelectControl) this.set("extraName", value);
	}
	
	/**
	 * 是否为必填
    */
	public NestedSelectControl required(Object value) {
		return (NestedSelectControl) this.set("required", value);
	}
	
	/**
	 * 表单项类型
    */
	public NestedSelectControl type(Object value) {
		return (NestedSelectControl) this.set("type", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public NestedSelectControl visibleOn(Object value) {
		return (NestedSelectControl) this.set("visibleOn", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public NestedSelectControl editorSetting(Object value) {
		return (NestedSelectControl) this.set("editorSetting", value);
	}
	
	/**
	 * 是否可以新增
    */
	public NestedSelectControl creatable(Object value) {
		return (NestedSelectControl) this.set("creatable", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public NestedSelectControl size(Object value) {
		return (NestedSelectControl) this.set("size", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public NestedSelectControl inline(Object value) {
		return (NestedSelectControl) this.set("inline", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public NestedSelectControl value(Object value) {
		return (NestedSelectControl) this.set("value", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public NestedSelectControl className(Object value) {
		return (NestedSelectControl) this.set("className", value);
	}
	
	/**
	 * 多选模式，值太多时是否避免折行
    */
	public NestedSelectControl valuesNoWrap(Object value) {
		return (NestedSelectControl) this.set("valuesNoWrap", value);
	}
	
	/**
	 * 选项修改的表单项
    */
	public NestedSelectControl editControls(Object value) {
		return (NestedSelectControl) this.set("editControls", value);
	}
	
	/**
	 * 事件动作配置
    */
	public NestedSelectControl onEvent(Object value) {
		return (NestedSelectControl) this.set("onEvent", value);
	}
	
	/**
	 * 单选模式：当用户选中某个选项时，选项中的 value 将被作为该表单项的值提交，否则，整个选项对象都会作为该表单项的值提交。 多选模式：选中的多个选项的 `value` 会通过 `delimiter` 连接起来，否则直接将以数组的形式提交值。
    */
	public NestedSelectControl joinValues(Object value) {
		return (NestedSelectControl) this.set("joinValues", value);
	}
	
	/**
	 * 选项删除提示文字。
    */
	public NestedSelectControl deleteConfirmText(Object value) {
		return (NestedSelectControl) this.set("deleteConfirmText", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public NestedSelectControl horizontal(Object value) {
		return (NestedSelectControl) this.set("horizontal", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public NestedSelectControl staticClassName(Object value) {
		return (NestedSelectControl) this.set("staticClassName", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public NestedSelectControl labelRemark(Object value) {
		return (NestedSelectControl) this.set("labelRemark", value);
	}
	
	/**
	    */
	public NestedSelectControl staticSchema(Object value) {
		return (NestedSelectControl) this.set("staticSchema", value);
	}
	
	/**
	 * 父子之间是否完全独立。
    */
	public NestedSelectControl cascade(Object value) {
		return (NestedSelectControl) this.set("cascade", value);
	}
	
	/**
	 * 用表达式来配置 source 接口初始要不要拉取
    */
	public NestedSelectControl initFetchOn(Object value) {
		return (NestedSelectControl) this.set("initFetchOn", value);
	}
	
	/**
	 * 新增时的表单项。
    */
	public NestedSelectControl addControls(Object value) {
		return (NestedSelectControl) this.set("addControls", value);
	}
	
	/**
	    */
	public NestedSelectControl desc(Object value) {
		return (NestedSelectControl) this.set("desc", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public NestedSelectControl hiddenOn(Object value) {
		return (NestedSelectControl) this.set("hiddenOn", value);
	}
	
	/**
	 * 是否显示
    */
	public NestedSelectControl visible(Object value) {
		return (NestedSelectControl) this.set("visible", value);
	}
	
	/**
	 * 是否为多选模式
    */
	public NestedSelectControl multiple(Object value) {
		return (NestedSelectControl) this.set("multiple", value);
	}
	
	/**
	    */
	public NestedSelectControl initAutoFill(Object value) {
		return (NestedSelectControl) this.set("initAutoFill", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public NestedSelectControl validateApi(Object value) {
		return (NestedSelectControl) this.set("validateApi", value);
	}
	
	/**
	 * 选父级的时候，是否只把子节点的值包含在内
    */
	public NestedSelectControl onlyChildren(Object value) {
		return (NestedSelectControl) this.set("onlyChildren", value);
	}
	
	/**
	 * 分割符
    */
	public NestedSelectControl delimiter(Object value) {
		return (NestedSelectControl) this.set("delimiter", value);
	}
	
	/**
	 * 新增文字
    */
	public NestedSelectControl createBtnLabel(Object value) {
		return (NestedSelectControl) this.set("createBtnLabel", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public NestedSelectControl hint(Object value) {
		return (NestedSelectControl) this.set("hint", value);
	}
	
	/**
	    */
	public NestedSelectControl validations(Object value) {
		return (NestedSelectControl) this.set("validations", value);
	}
	
	/**
	 * 是否静态展示
    */
	public NestedSelectControl static_(Object value) {
		return (NestedSelectControl) this.set("static_", value);
	}
	
	/**
	 * 是否隐藏选择框中已选中节点的祖先节点的文本信息
    */
	public NestedSelectControl hideNodePathLabel(Object value) {
		return (NestedSelectControl) this.set("hideNodePathLabel", value);
	}
	
	/**
	 * 延时加载的 API，当选项中有 defer: true 的选项时，点开会通过此接口扩充。
    */
	public NestedSelectControl deferApi(Object value) {
		return (NestedSelectControl) this.set("deferApi", value);
	}
	
	/**
	 * 只读条件
    */
	public NestedSelectControl readOnlyOn(Object value) {
		return (NestedSelectControl) this.set("readOnlyOn", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public NestedSelectControl validationErrors(Object value) {
		return (NestedSelectControl) this.set("validationErrors", value);
	}
	
	/**
	 * 是否隐藏
    */
	public NestedSelectControl hidden(Object value) {
		return (NestedSelectControl) this.set("hidden", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public NestedSelectControl id(Object value) {
		return (NestedSelectControl) this.set("id", value);
	}
	
	/**
	 * 弹框的 css 类
    */
	public NestedSelectControl menuClassName(Object value) {
		return (NestedSelectControl) this.set("menuClassName", value);
	}
	
	/**
	 * 选项集合
    */
	public NestedSelectControl options(Object value) {
		return (NestedSelectControl) this.set("options", value);
	}
	
	/**
	 * 配置 source 接口初始拉不拉取。
    */
	public NestedSelectControl initFetch(Object value) {
		return (NestedSelectControl) this.set("initFetch", value);
	}
	
	/**
	 * 描述标题
    */
	public NestedSelectControl labelAlign(Object value) {
		return (NestedSelectControl) this.set("labelAlign", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public NestedSelectControl mode(Object value) {
		return (NestedSelectControl) this.set("mode", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public NestedSelectControl disabledOn(Object value) {
		return (NestedSelectControl) this.set("disabledOn", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public NestedSelectControl staticOn(Object value) {
		return (NestedSelectControl) this.set("staticOn", value);
	}
	
	/**
	 * 只允许选择叶子节点
    */
	public NestedSelectControl onlyLeaf(Object value) {
		return (NestedSelectControl) this.set("onlyLeaf", value);
	}
	
	/**
	 * 标签的最大展示数量，超出数量后以收纳浮层的方式展示，仅在多选模式开启后生效
    */
	public NestedSelectControl maxTagCount(Object value) {
		return (NestedSelectControl) this.set("maxTagCount", value);
	}
	
	/**
	 * 是否可以编辑
    */
	public NestedSelectControl editable(Object value) {
		return (NestedSelectControl) this.set("editable", value);
	}
	
	/**
	 * 编辑时调用的 API
    */
	public NestedSelectControl editApi(Object value) {
		return (NestedSelectControl) this.set("editApi", value);
	}
	
	/**
	 * 是否可删除
    */
	public NestedSelectControl removable(Object value) {
		return (NestedSelectControl) this.set("removable", value);
	}
	
	/**
	 * 配置 label className
    */
	public NestedSelectControl labelClassName(Object value) {
		return (NestedSelectControl) this.set("labelClassName", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public NestedSelectControl validateOnChange(Object value) {
		return (NestedSelectControl) this.set("validateOnChange", value);
	}
	
	/**
	 * 收纳标签的Popover配置
    */
	public NestedSelectControl overflowTagPopover(Object value) {
		return (NestedSelectControl) this.set("overflowTagPopover", value);
	}
	}