package com.wcz0.renderers;
/**
 * InputArray 数组输入框。 combo 的别名。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/array

 * @author wcz0
 * @version 6.2.2
 */
public class ArrayControl extends BaseRenderer {

	public ArrayControl() {
		this.set("type", "arrayControl");
	}

	/**
	 * 限制最大个数
    */
	public ArrayControl maxLength(Object value) {
		return (ArrayControl) this.set("maxLength", value);
	}
	
	/**
	    */
	public ArrayControl validations(Object value) {
		return (ArrayControl) this.set("validations", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public ArrayControl value(Object value) {
		return (ArrayControl) this.set("value", value);
	}
	
	/**
	 * 组件样式
    */
	public ArrayControl style(Object value) {
		return (ArrayControl) this.set("style", value);
	}
	
	/**
	 * 限制最小个数
    */
	public ArrayControl minLength(Object value) {
		return (ArrayControl) this.set("minLength", value);
	}
	
	/**
	 * 严格模式，为了性能默认不开的。
    */
	public ArrayControl strictMode(Object value) {
		return (ArrayControl) this.set("strictMode", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public ArrayControl submitOnChange(Object value) {
		return (ArrayControl) this.set("submitOnChange", value);
	}
	
	/**
	 * 配置 input className
    */
	public ArrayControl inputClassName(Object value) {
		return (ArrayControl) this.set("inputClassName", value);
	}
	
	/**
	 * 是否禁用
    */
	public ArrayControl disabled(Object value) {
		return (ArrayControl) this.set("disabled", value);
	}
	
	/**
	 * 确认删除时的提示
    */
	public ArrayControl deleteConfirmText(Object value) {
		return (ArrayControl) this.set("deleteConfirmText", value);
	}
	
	/**
	 * 是否可新增
    */
	public ArrayControl addable(Object value) {
		return (ArrayControl) this.set("addable", value);
	}
	
	/**
	 * 配置同步字段。只有 `strictMode` 为 `false` 时有效。 如果 Combo 层级比较深，底层的获取外层的数据可能不同步。 但是给 combo 配置这个属性就能同步下来。输入格式：`["os"]`
    */
	public ArrayControl syncFields(Object value) {
		return (ArrayControl) this.set("syncFields", value);
	}
	
	/**
	 * 只读条件
    */
	public ArrayControl readOnlyOn(Object value) {
		return (ArrayControl) this.set("readOnlyOn", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public ArrayControl validateOnChange(Object value) {
		return (ArrayControl) this.set("validateOnChange", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public ArrayControl description(Object value) {
		return (ArrayControl) this.set("description", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public ArrayControl staticLabelClassName(Object value) {
		return (ArrayControl) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public ArrayControl width(Object value) {
		return (ArrayControl) this.set("width", value);
	}
	
	/**
	 * 事件动作配置
    */
	public ArrayControl onEvent(Object value) {
		return (ArrayControl) this.set("onEvent", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public ArrayControl staticPlaceholder(Object value) {
		return (ArrayControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 选项卡标题的生成模板。
    */
	public ArrayControl tabsLabelTpl(Object value) {
		return (ArrayControl) this.set("tabsLabelTpl", value);
	}
	
	/**
	 * 描述标题
    */
	public ArrayControl label(Object value) {
		return (ArrayControl) this.set("label", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public ArrayControl mode(Object value) {
		return (ArrayControl) this.set("mode", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public ArrayControl horizontal(Object value) {
		return (ArrayControl) this.set("horizontal", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public ArrayControl className(Object value) {
		return (ArrayControl) this.set("className", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public ArrayControl id(Object value) {
		return (ArrayControl) this.set("id", value);
	}
	
	/**
	    */
	public ArrayControl staticSchema(Object value) {
		return (ArrayControl) this.set("staticSchema", value);
	}
	
	/**
	 * 是否含有边框
    */
	public ArrayControl noBorder(Object value) {
		return (ArrayControl) this.set("noBorder", value);
	}
	
	/**
	 * 是否只读
    */
	public ArrayControl readOnly(Object value) {
		return (ArrayControl) this.set("readOnly", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public ArrayControl hiddenOn(Object value) {
		return (ArrayControl) this.set("hiddenOn", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public ArrayControl visibleOn(Object value) {
		return (ArrayControl) this.set("visibleOn", value);
	}
	
	/**
	 * 成员渲染器配置
    */
	public ArrayControl items(Object value) {
		return (ArrayControl) this.set("items", value);
	}
	
	/**
	 * 是否可拖拽排序
    */
	public ArrayControl draggable(Object value) {
		return (ArrayControl) this.set("draggable", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public ArrayControl hint(Object value) {
		return (ArrayControl) this.set("hint", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public ArrayControl inline(Object value) {
		return (ArrayControl) this.set("inline", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public ArrayControl editorSetting(Object value) {
		return (ArrayControl) this.set("editorSetting", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public ArrayControl useMobileUI(Object value) {
		return (ArrayControl) this.set("useMobileUI", value);
	}
	
	/**
	 * 当扁平化开启并且joinValues为true时，用什么分隔符
    */
	public ArrayControl delimiter(Object value) {
		return (ArrayControl) this.set("delimiter", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public ArrayControl labelRemark(Object value) {
		return (ArrayControl) this.set("labelRemark", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public ArrayControl size(Object value) {
		return (ArrayControl) this.set("size", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public ArrayControl name(Object value) {
		return (ArrayControl) this.set("name", value);
	}
	
	/**
	 * 是否为必填
    */
	public ArrayControl required(Object value) {
		return (ArrayControl) this.set("required", value);
	}
	
	/**
	    */
	public ArrayControl initAutoFill(Object value) {
		return (ArrayControl) this.set("initAutoFill", value);
	}
	
	/**
	 * 是否可删除
    */
	public ArrayControl removable(Object value) {
		return (ArrayControl) this.set("removable", value);
	}
	
	/**
	    */
	public ArrayControl desc(Object value) {
		return (ArrayControl) this.set("desc", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public ArrayControl descriptionClassName(Object value) {
		return (ArrayControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public ArrayControl $$id(Object value) {
		return (ArrayControl) this.set("$$id", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public ArrayControl staticOn(Object value) {
		return (ArrayControl) this.set("staticOn", value);
	}
	
	/**
	 * 是否静态展示
    */
	public ArrayControl static_(Object value) {
		return (ArrayControl) this.set("static_", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public ArrayControl staticInputClassName(Object value) {
		return (ArrayControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 可拖拽排序的提示信息。
    */
	public ArrayControl draggableTip(Object value) {
		return (ArrayControl) this.set("draggableTip", value);
	}
	
	/**
	 * 是否将结果扁平化(去掉name),只有当controls的length为1且multiple为true的时候才有效
    */
	public ArrayControl flat(Object value) {
		return (ArrayControl) this.set("flat", value);
	}
	
	/**
	 * 当扁平化开启的时候，是否用分隔符的形式发送给后端，否则采用array的方式
    */
	public ArrayControl joinValues(Object value) {
		return (ArrayControl) this.set("joinValues", value);
	}
	
	/**
	 * 是否多行模式，默认一行展示完
    */
	public ArrayControl multiLine(Object value) {
		return (ArrayControl) this.set("multiLine", value);
	}
	
	/**
	 * 如果是水平排版，这个属性可以细化水平排版的左右宽度占比。
    */
	public ArrayControl subFormHorizontal(Object value) {
		return (ArrayControl) this.set("subFormHorizontal", value);
	}
	
	/**
	    */
	public ArrayControl testIdBuilder(Object value) {
		return (ArrayControl) this.set("testIdBuilder", value);
	}
	
	/**
	 * Add at top
    */
	public ArrayControl addattop(Object value) {
		return (ArrayControl) this.set("addattop", value);
	}
	
	/**
	 * Tabs 的展示模式。
    * 可选值:  | line | card | radio
    */
	public ArrayControl tabsStyle(Object value) {
		return (ArrayControl) this.set("tabsStyle", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public ArrayControl validationErrors(Object value) {
		return (ArrayControl) this.set("validationErrors", value);
	}
	
	/**
	 * 自动填充，当选项被选择的时候，将选项中的其他值同步设置到表单内。
    */
	public ArrayControl autoFill(Object value) {
		return (ArrayControl) this.set("autoFill", value);
	}
	
	/**
	 * 新增按钮文字
    */
	public ArrayControl addButtonText(Object value) {
		return (ArrayControl) this.set("addButtonText", value);
	}
	
	/**
	 * 是否可多选
    */
	public ArrayControl multiple(Object value) {
		return (ArrayControl) this.set("multiple", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public ArrayControl staticClassName(Object value) {
		return (ArrayControl) this.set("staticClassName", value);
	}
	
	/**
	 * 没有成员时显示。
    */
	public ArrayControl placeholder(Object value) {
		return (ArrayControl) this.set("placeholder", value);
	}
	
	/**
	 * 允许为空，如果子表单项里面配置验证器，且又是单条模式。可以允许用户选择清空（不填）。
    */
	public ArrayControl nullable(Object value) {
		return (ArrayControl) this.set("nullable", value);
	}
	
	/**
	    */
	public ArrayControl updatePristineAfterStoreDataReInit(Object value) {
		return (ArrayControl) this.set("updatePristineAfterStoreDataReInit", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public ArrayControl labelWidth(Object value) {
		return (ArrayControl) this.set("labelWidth", value);
	}
	
	/**
	 * 配置 label className
    */
	public ArrayControl labelClassName(Object value) {
		return (ArrayControl) this.set("labelClassName", value);
	}
	
	/**
	 * 指定为数组输入框类型
    */
	public ArrayControl type(Object value) {
		return (ArrayControl) this.set("type", value);
	}
	
	/**
	 * 内部单组表单项的类名
    */
	public ArrayControl formClassName(Object value) {
		return (ArrayControl) this.set("formClassName", value);
	}
	
	/**
	 * 提示信息
    */
	public ArrayControl messages(Object value) {
		return (ArrayControl) this.set("messages", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public ArrayControl clearValueOnHidden(Object value) {
		return (ArrayControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public ArrayControl disabledOn(Object value) {
		return (ArrayControl) this.set("disabledOn", value);
	}
	
	/**
	 * 删除时调用的api
    */
	public ArrayControl deleteApi(Object value) {
		return (ArrayControl) this.set("deleteApi", value);
	}
	
	/**
	 * 采用 Tabs 展示方式？
    */
	public ArrayControl tabsMode(Object value) {
		return (ArrayControl) this.set("tabsMode", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public ArrayControl extraName(Object value) {
		return (ArrayControl) this.set("extraName", value);
	}
	
	/**
	 * 是否可切换条件，配合`conditions`使用
    */
	public ArrayControl typeSwitchable(Object value) {
		return (ArrayControl) this.set("typeSwitchable", value);
	}
	
	/**
	 * 子表单的模式。
    * 可选值: normal | horizontal | inline
    */
	public ArrayControl subFormMode(Object value) {
		return (ArrayControl) this.set("subFormMode", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public ArrayControl remark(Object value) {
		return (ArrayControl) this.set("remark", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public ArrayControl validateApi(Object value) {
		return (ArrayControl) this.set("validateApi", value);
	}
	
	/**
	 * 是否显示
    */
	public ArrayControl visible(Object value) {
		return (ArrayControl) this.set("visible", value);
	}
	
	/**
	 * 新增成员时的默认值
    */
	public ArrayControl scaffold(Object value) {
		return (ArrayControl) this.set("scaffold", value);
	}
	
	/**
	 * 新增按钮CSS类名
    */
	public ArrayControl addButtonClassName(Object value) {
		return (ArrayControl) this.set("addButtonClassName", value);
	}
	
	/**
	 * 是否可以访问父级数据，正常 combo 已经关联到数组成员，是不能访问父级数据的。
    */
	public ArrayControl canAccessSuperData(Object value) {
		return (ArrayControl) this.set("canAccessSuperData", value);
	}
	
	/**
	 * 数据比较多，比较卡时，可以试试开启。
    */
	public ArrayControl lazyLoad(Object value) {
		return (ArrayControl) this.set("lazyLoad", value);
	}
	
	/**
	 * 描述标题
    */
	public ArrayControl labelAlign(Object value) {
		return (ArrayControl) this.set("labelAlign", value);
	}
	
	/**
	 * 是否隐藏
    */
	public ArrayControl hidden(Object value) {
		return (ArrayControl) this.set("hidden", value);
	}
	}