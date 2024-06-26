package com.wcz0.renderers;
/**
 * Combo 组合输入框类型 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/combo

 * @author wcz0
 * @version 6.2.2
 */
public class ComboControl extends BaseRenderer {

	public ComboControl() {
		this.set("type", "comboControl");
	}

	/**
	 * 静态展示表单项Label类名
    */
	public ComboControl staticLabelClassName(Object value) {
		return (ComboControl) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public ComboControl clearValueOnHidden(Object value) {
		return (ComboControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public ComboControl validateApi(Object value) {
		return (ComboControl) this.set("validateApi", value);
	}
	
	/**
	 * 是否可新增
    */
	public ComboControl addable(Object value) {
		return (ComboControl) this.set("addable", value);
	}
	
	/**
	 * 子表单的模式。
    * 可选值: normal | horizontal | inline
    */
	public ComboControl subFormMode(Object value) {
		return (ComboControl) this.set("subFormMode", value);
	}
	
	/**
	 * 组件样式
    */
	public ComboControl style(Object value) {
		return (ComboControl) this.set("style", value);
	}
	
	/**
	 * 描述标题
    */
	public ComboControl labelAlign(Object value) {
		return (ComboControl) this.set("labelAlign", value);
	}
	
	/**
	 * 只读条件
    */
	public ComboControl readOnlyOn(Object value) {
		return (ComboControl) this.set("readOnlyOn", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public ComboControl description(Object value) {
		return (ComboControl) this.set("description", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public ComboControl disabledOn(Object value) {
		return (ComboControl) this.set("disabledOn", value);
	}
	
	/**
	 * 事件动作配置
    */
	public ComboControl onEvent(Object value) {
		return (ComboControl) this.set("onEvent", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public ComboControl editorSetting(Object value) {
		return (ComboControl) this.set("editorSetting", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public ComboControl submitOnChange(Object value) {
		return (ComboControl) this.set("submitOnChange", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public ComboControl value(Object value) {
		return (ComboControl) this.set("value", value);
	}
	
	/**
	 * 提示信息
    */
	public ComboControl messages(Object value) {
		return (ComboControl) this.set("messages", value);
	}
	
	/**
	 * 描述标题
    */
	public ComboControl label(Object value) {
		return (ComboControl) this.set("label", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public ComboControl validateOnChange(Object value) {
		return (ComboControl) this.set("validateOnChange", value);
	}
	
	/**
	    */
	public ComboControl desc(Object value) {
		return (ComboControl) this.set("desc", value);
	}
	
	/**
	    */
	public ComboControl validations(Object value) {
		return (ComboControl) this.set("validations", value);
	}
	
	/**
	 * 是否可多选
    */
	public ComboControl multiple(Object value) {
		return (ComboControl) this.set("multiple", value);
	}
	
	/**
	 * 是否静态展示
    */
	public ComboControl static_(Object value) {
		return (ComboControl) this.set("static_", value);
	}
	
	/**
	    */
	public ComboControl testIdBuilder(Object value) {
		return (ComboControl) this.set("testIdBuilder", value);
	}
	
	/**
	 * 配置 label className
    */
	public ComboControl labelClassName(Object value) {
		return (ComboControl) this.set("labelClassName", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public ComboControl staticClassName(Object value) {
		return (ComboControl) this.set("staticClassName", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public ComboControl staticInputClassName(Object value) {
		return (ComboControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 自动填充，当选项被选择的时候，将选项中的其他值同步设置到表单内。
    */
	public ComboControl autoFill(Object value) {
		return (ComboControl) this.set("autoFill", value);
	}
	
	/**
	 * 是否可拖拽排序
    */
	public ComboControl draggable(Object value) {
		return (ComboControl) this.set("draggable", value);
	}
	
	/**
	 * 可拖拽排序的提示信息。
    */
	public ComboControl draggableTip(Object value) {
		return (ComboControl) this.set("draggableTip", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public ComboControl width(Object value) {
		return (ComboControl) this.set("width", value);
	}
	
	/**
	 * 是否禁用
    */
	public ComboControl disabled(Object value) {
		return (ComboControl) this.set("disabled", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public ComboControl staticOn(Object value) {
		return (ComboControl) this.set("staticOn", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public ComboControl staticPlaceholder(Object value) {
		return (ComboControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public ComboControl horizontal(Object value) {
		return (ComboControl) this.set("horizontal", value);
	}
	
	/**
	 * Tabs 的展示模式。
    * 可选值:  | line | card | radio
    */
	public ComboControl tabsStyle(Object value) {
		return (ComboControl) this.set("tabsStyle", value);
	}
	
	/**
	    */
	public ComboControl updatePristineAfterStoreDataReInit(Object value) {
		return (ComboControl) this.set("updatePristineAfterStoreDataReInit", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public ComboControl id(Object value) {
		return (ComboControl) this.set("id", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public ComboControl size(Object value) {
		return (ComboControl) this.set("size", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public ComboControl extraName(Object value) {
		return (ComboControl) this.set("extraName", value);
	}
	
	/**
	 * 新增按钮CSS类名
    */
	public ComboControl addButtonClassName(Object value) {
		return (ComboControl) this.set("addButtonClassName", value);
	}
	
	/**
	 * 是否多行模式，默认一行展示完
    */
	public ComboControl multiLine(Object value) {
		return (ComboControl) this.set("multiLine", value);
	}
	
	/**
	 * 是否隐藏
    */
	public ComboControl hidden(Object value) {
		return (ComboControl) this.set("hidden", value);
	}
	
	/**
	 * 符合某类条件后才渲染的schema
    */
	public ComboControl conditions(Object value) {
		return (ComboControl) this.set("conditions", value);
	}
	
	/**
	 * 当扁平化开启的时候，是否用分隔符的形式发送给后端，否则采用array的方式
    */
	public ComboControl joinValues(Object value) {
		return (ComboControl) this.set("joinValues", value);
	}
	
	/**
	 * 采用 Tabs 展示方式？
    */
	public ComboControl tabsMode(Object value) {
		return (ComboControl) this.set("tabsMode", value);
	}
	
	/**
	 * 配置同步字段。只有 `strictMode` 为 `false` 时有效。 如果 Combo 层级比较深，底层的获取外层的数据可能不同步。 但是给 combo 配置这个属性就能同步下来。输入格式：`["os"]`
    */
	public ComboControl syncFields(Object value) {
		return (ComboControl) this.set("syncFields", value);
	}
	
	/**
	 * 允许为空，如果子表单项里面配置验证器，且又是单条模式。可以允许用户选择清空（不填）。
    */
	public ComboControl nullable(Object value) {
		return (ComboControl) this.set("nullable", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public ComboControl hiddenOn(Object value) {
		return (ComboControl) this.set("hiddenOn", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public ComboControl descriptionClassName(Object value) {
		return (ComboControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 删除时调用的api
    */
	public ComboControl deleteApi(Object value) {
		return (ComboControl) this.set("deleteApi", value);
	}
	
	/**
	 * 是否可切换条件，配合`conditions`使用
    */
	public ComboControl typeSwitchable(Object value) {
		return (ComboControl) this.set("typeSwitchable", value);
	}
	
	/**
	 * 新增按钮文字
    */
	public ComboControl addButtonText(Object value) {
		return (ComboControl) this.set("addButtonText", value);
	}
	
	/**
	 * 限制最大个数
    */
	public ComboControl maxLength(Object value) {
		return (ComboControl) this.set("maxLength", value);
	}
	
	/**
	 * 如果是水平排版，这个属性可以细化水平排版的左右宽度占比。
    */
	public ComboControl subFormHorizontal(Object value) {
		return (ComboControl) this.set("subFormHorizontal", value);
	}
	
	/**
	 * 是否可以访问父级数据，正常 combo 已经关联到数组成员，是不能访问父级数据的。
    */
	public ComboControl canAccessSuperData(Object value) {
		return (ComboControl) this.set("canAccessSuperData", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public ComboControl className(Object value) {
		return (ComboControl) this.set("className", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public ComboControl visibleOn(Object value) {
		return (ComboControl) this.set("visibleOn", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public ComboControl mode(Object value) {
		return (ComboControl) this.set("mode", value);
	}
	
	/**
	 * 单组表单项初始值。默认为 `{}`
    */
	public ComboControl scaffold(Object value) {
		return (ComboControl) this.set("scaffold", value);
	}
	
	/**
	 * 是否将结果扁平化(去掉name),只有当controls的length为1且multiple为true的时候才有效
    */
	public ComboControl flat(Object value) {
		return (ComboControl) this.set("flat", value);
	}
	
	/**
	 * 选项卡标题的生成模板。
    */
	public ComboControl tabsLabelTpl(Object value) {
		return (ComboControl) this.set("tabsLabelTpl", value);
	}
	
	/**
	 * 数据比较多，比较卡时，可以试试开启。
    */
	public ComboControl lazyLoad(Object value) {
		return (ComboControl) this.set("lazyLoad", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public ComboControl validationErrors(Object value) {
		return (ComboControl) this.set("validationErrors", value);
	}
	
	/**
	 * 内部单组表单项的类名
    */
	public ComboControl formClassName(Object value) {
		return (ComboControl) this.set("formClassName", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public ComboControl $$id(Object value) {
		return (ComboControl) this.set("$$id", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public ComboControl useMobileUI(Object value) {
		return (ComboControl) this.set("useMobileUI", value);
	}
	
	/**
	 * 是否只读
    */
	public ComboControl readOnly(Object value) {
		return (ComboControl) this.set("readOnly", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public ComboControl inline(Object value) {
		return (ComboControl) this.set("inline", value);
	}
	
	/**
	 * 配置 input className
    */
	public ComboControl inputClassName(Object value) {
		return (ComboControl) this.set("inputClassName", value);
	}
	
	/**
	 * 指定为组合输入框类型
    */
	public ComboControl type(Object value) {
		return (ComboControl) this.set("type", value);
	}
	
	/**
	 * 数组输入框的子项
    */
	public ComboControl items(Object value) {
		return (ComboControl) this.set("items", value);
	}
	
	/**
	 * 当扁平化开启并且joinValues为true时，用什么分隔符
    */
	public ComboControl delimiter(Object value) {
		return (ComboControl) this.set("delimiter", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public ComboControl remark(Object value) {
		return (ComboControl) this.set("remark", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public ComboControl labelRemark(Object value) {
		return (ComboControl) this.set("labelRemark", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public ComboControl hint(Object value) {
		return (ComboControl) this.set("hint", value);
	}
	
	/**
	 * 没有成员时显示。
    */
	public ComboControl placeholder(Object value) {
		return (ComboControl) this.set("placeholder", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public ComboControl labelWidth(Object value) {
		return (ComboControl) this.set("labelWidth", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public ComboControl name(Object value) {
		return (ComboControl) this.set("name", value);
	}
	
	/**
	 * 是否可删除
    */
	public ComboControl removable(Object value) {
		return (ComboControl) this.set("removable", value);
	}
	
	/**
	 * 确认删除时的提示
    */
	public ComboControl deleteConfirmText(Object value) {
		return (ComboControl) this.set("deleteConfirmText", value);
	}
	
	/**
	 * Add at top
    */
	public ComboControl addattop(Object value) {
		return (ComboControl) this.set("addattop", value);
	}
	
	/**
	 * 限制最小个数
    */
	public ComboControl minLength(Object value) {
		return (ComboControl) this.set("minLength", value);
	}
	
	/**
	 * 是否显示
    */
	public ComboControl visible(Object value) {
		return (ComboControl) this.set("visible", value);
	}
	
	/**
	    */
	public ComboControl staticSchema(Object value) {
		return (ComboControl) this.set("staticSchema", value);
	}
	
	/**
	 * 是否为必填
    */
	public ComboControl required(Object value) {
		return (ComboControl) this.set("required", value);
	}
	
	/**
	    */
	public ComboControl initAutoFill(Object value) {
		return (ComboControl) this.set("initAutoFill", value);
	}
	
	/**
	 * 是否含有边框
    */
	public ComboControl noBorder(Object value) {
		return (ComboControl) this.set("noBorder", value);
	}
	
	/**
	 * 严格模式，为了性能默认不开的。
    */
	public ComboControl strictMode(Object value) {
		return (ComboControl) this.set("strictMode", value);
	}
	}