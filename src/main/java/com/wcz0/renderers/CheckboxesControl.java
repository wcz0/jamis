package com.wcz0.renderers;
/**
 * 复选框 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/checkboxes

 * @author wcz0
 * @version 6.2.2
 */
public class CheckboxesControl extends BaseRenderer {

	public CheckboxesControl() {
		this.set("type", "checkboxesControl");
	}

	/**
	 * 是否可清除。
    */
	public CheckboxesControl clearable(Object value) {
		return (CheckboxesControl) this.set("clearable", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public CheckboxesControl validateOnChange(Object value) {
		return (CheckboxesControl) this.set("validateOnChange", value);
	}
	
	/**
	    */
	public CheckboxesControl desc(Object value) {
		return (CheckboxesControl) this.set("desc", value);
	}
	
	/**
	 * 配置 input className
    */
	public CheckboxesControl inputClassName(Object value) {
		return (CheckboxesControl) this.set("inputClassName", value);
	}
	
	/**
	    */
	public CheckboxesControl testIdBuilder(Object value) {
		return (CheckboxesControl) this.set("testIdBuilder", value);
	}
	
	/**
	 * 是否为多选模式
    */
	public CheckboxesControl multiple(Object value) {
		return (CheckboxesControl) this.set("multiple", value);
	}
	
	/**
	 * 开启后将选中的选项 value 的值封装为数组，作为当前表单项的值。
    */
	public CheckboxesControl extractValue(Object value) {
		return (CheckboxesControl) this.set("extractValue", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public CheckboxesControl labelWidth(Object value) {
		return (CheckboxesControl) this.set("labelWidth", value);
	}
	
	/**
	 * 配置 label className
    */
	public CheckboxesControl labelClassName(Object value) {
		return (CheckboxesControl) this.set("labelClassName", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public CheckboxesControl description(Object value) {
		return (CheckboxesControl) this.set("description", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public CheckboxesControl horizontal(Object value) {
		return (CheckboxesControl) this.set("horizontal", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public CheckboxesControl editorSetting(Object value) {
		return (CheckboxesControl) this.set("editorSetting", value);
	}
	
	/**
	 * 新增时的表单项。
    */
	public CheckboxesControl addControls(Object value) {
		return (CheckboxesControl) this.set("addControls", value);
	}
	
	/**
	 * 选项删除 API
    */
	public CheckboxesControl deleteApi(Object value) {
		return (CheckboxesControl) this.set("deleteApi", value);
	}
	
	/**
	 * 描述标题
    */
	public CheckboxesControl label(Object value) {
		return (CheckboxesControl) this.set("label", value);
	}
	
	/**
	 * 是否只读
    */
	public CheckboxesControl readOnly(Object value) {
		return (CheckboxesControl) this.set("readOnly", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public CheckboxesControl id(Object value) {
		return (CheckboxesControl) this.set("id", value);
	}
	
	/**
	 * 是否静态展示
    */
	public CheckboxesControl static_(Object value) {
		return (CheckboxesControl) this.set("static_", value);
	}
	
	/**
	 * 分割符
    */
	public CheckboxesControl delimiter(Object value) {
		return (CheckboxesControl) this.set("delimiter", value);
	}
	
	/**
	 * 选项修改的表单项
    */
	public CheckboxesControl editControls(Object value) {
		return (CheckboxesControl) this.set("editControls", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public CheckboxesControl staticOn(Object value) {
		return (CheckboxesControl) this.set("staticOn", value);
	}
	
	/**
	 * 自定义选项展示
    */
	public CheckboxesControl menuTpl(Object value) {
		return (CheckboxesControl) this.set("menuTpl", value);
	}
	
	/**
	 * 默认选择选项第一个值。
    */
	public CheckboxesControl selectFirst(Object value) {
		return (CheckboxesControl) this.set("selectFirst", value);
	}
	
	/**
	 * 配置 source 接口初始拉不拉取。
    */
	public CheckboxesControl initFetch(Object value) {
		return (CheckboxesControl) this.set("initFetch", value);
	}
	
	/**
	 * 懒加载字段
    */
	public CheckboxesControl deferField(Object value) {
		return (CheckboxesControl) this.set("deferField", value);
	}
	
	/**
	 * 延时加载的 API，当选项中有 defer: true 的选项时，点开会通过此接口扩充。
    */
	public CheckboxesControl deferApi(Object value) {
		return (CheckboxesControl) this.set("deferApi", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public CheckboxesControl clearValueOnHidden(Object value) {
		return (CheckboxesControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	 * 组件样式
    */
	public CheckboxesControl style(Object value) {
		return (CheckboxesControl) this.set("style", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public CheckboxesControl labelRemark(Object value) {
		return (CheckboxesControl) this.set("labelRemark", value);
	}
	
	/**
	 * 表单项类型
    */
	public CheckboxesControl type(Object value) {
		return (CheckboxesControl) this.set("type", value);
	}
	
	/**
	 * 点清除按钮时，将表单项设置成当前配置的值。
    */
	public CheckboxesControl resetValue(Object value) {
		return (CheckboxesControl) this.set("resetValue", value);
	}
	
	/**
	 * 是否可以编辑
    */
	public CheckboxesControl editable(Object value) {
		return (CheckboxesControl) this.set("editable", value);
	}
	
	/**
	 * 控制编辑弹框设置项
    */
	public CheckboxesControl editDialog(Object value) {
		return (CheckboxesControl) this.set("editDialog", value);
	}
	
	/**
	 * 选项删除提示文字。
    */
	public CheckboxesControl deleteConfirmText(Object value) {
		return (CheckboxesControl) this.set("deleteConfirmText", value);
	}
	
	/**
	    */
	public CheckboxesControl initAutoFill(Object value) {
		return (CheckboxesControl) this.set("initAutoFill", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public CheckboxesControl $$id(Object value) {
		return (CheckboxesControl) this.set("$$id", value);
	}
	
	/**
	 * 是否可以新增
    */
	public CheckboxesControl creatable(Object value) {
		return (CheckboxesControl) this.set("creatable", value);
	}
	
	/**
	 * 新增文字
    */
	public CheckboxesControl createBtnLabel(Object value) {
		return (CheckboxesControl) this.set("createBtnLabel", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public CheckboxesControl className(Object value) {
		return (CheckboxesControl) this.set("className", value);
	}
	
	/**
	 * 是否显示
    */
	public CheckboxesControl visible(Object value) {
		return (CheckboxesControl) this.set("visible", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public CheckboxesControl staticLabelClassName(Object value) {
		return (CheckboxesControl) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 全选/不选文案
    */
	public CheckboxesControl checkAllText(Object value) {
		return (CheckboxesControl) this.set("checkAllText", value);
	}
	
	/**
	 * 用表达式来配置 source 接口初始要不要拉取
    */
	public CheckboxesControl initFetchOn(Object value) {
		return (CheckboxesControl) this.set("initFetchOn", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public CheckboxesControl value(Object value) {
		return (CheckboxesControl) this.set("value", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public CheckboxesControl hiddenOn(Object value) {
		return (CheckboxesControl) this.set("hiddenOn", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public CheckboxesControl visibleOn(Object value) {
		return (CheckboxesControl) this.set("visibleOn", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public CheckboxesControl staticInputClassName(Object value) {
		return (CheckboxesControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 控制新增弹框设置项
    */
	public CheckboxesControl addDialog(Object value) {
		return (CheckboxesControl) this.set("addDialog", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public CheckboxesControl extraName(Object value) {
		return (CheckboxesControl) this.set("extraName", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public CheckboxesControl hint(Object value) {
		return (CheckboxesControl) this.set("hint", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public CheckboxesControl mode(Object value) {
		return (CheckboxesControl) this.set("mode", value);
	}
	
	/**
	 * 自动填充，当选项被选择的时候，将选项中的其他值同步设置到表单内。
    */
	public CheckboxesControl autoFill(Object value) {
		return (CheckboxesControl) this.set("autoFill", value);
	}
	
	/**
	 * 是否隐藏
    */
	public CheckboxesControl hidden(Object value) {
		return (CheckboxesControl) this.set("hidden", value);
	}
	
	/**
	 * 单选模式：当用户选中某个选项时，选项中的 value 将被作为该表单项的值提交，否则，整个选项对象都会作为该表单项的值提交。 多选模式：选中的多个选项的 `value` 会通过 `delimiter` 连接起来，否则直接将以数组的形式提交值。
    */
	public CheckboxesControl joinValues(Object value) {
		return (CheckboxesControl) this.set("joinValues", value);
	}
	
	/**
	 * 添加时调用的接口
    */
	public CheckboxesControl addApi(Object value) {
		return (CheckboxesControl) this.set("addApi", value);
	}
	
	/**
	 * 描述标题
    */
	public CheckboxesControl labelAlign(Object value) {
		return (CheckboxesControl) this.set("labelAlign", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public CheckboxesControl validationErrors(Object value) {
		return (CheckboxesControl) this.set("validationErrors", value);
	}
	
	/**
	 * 是否禁用
    */
	public CheckboxesControl disabled(Object value) {
		return (CheckboxesControl) this.set("disabled", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public CheckboxesControl staticClassName(Object value) {
		return (CheckboxesControl) this.set("staticClassName", value);
	}
	
	/**
	 * 编辑时调用的 API
    */
	public CheckboxesControl editApi(Object value) {
		return (CheckboxesControl) this.set("editApi", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public CheckboxesControl size(Object value) {
		return (CheckboxesControl) this.set("size", value);
	}
	
	/**
	    */
	public CheckboxesControl validations(Object value) {
		return (CheckboxesControl) this.set("validations", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public CheckboxesControl staticPlaceholder(Object value) {
		return (CheckboxesControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 选项集合
    */
	public CheckboxesControl options(Object value) {
		return (CheckboxesControl) this.set("options", value);
	}
	
	/**
	 * 是否可删除
    */
	public CheckboxesControl removable(Object value) {
		return (CheckboxesControl) this.set("removable", value);
	}
	
	/**
	 * 是否开启全选功能
    */
	public CheckboxesControl checkAll(Object value) {
		return (CheckboxesControl) this.set("checkAll", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public CheckboxesControl width(Object value) {
		return (CheckboxesControl) this.set("width", value);
	}
	
	/**
	 * 可用来通过 API 拉取 options。
    */
	public CheckboxesControl source(Object value) {
		return (CheckboxesControl) this.set("source", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public CheckboxesControl submitOnChange(Object value) {
		return (CheckboxesControl) this.set("submitOnChange", value);
	}
	
	/**
	 * 是否为必填
    */
	public CheckboxesControl required(Object value) {
		return (CheckboxesControl) this.set("required", value);
	}
	
	/**
	    */
	public CheckboxesControl staticSchema(Object value) {
		return (CheckboxesControl) this.set("staticSchema", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public CheckboxesControl remark(Object value) {
		return (CheckboxesControl) this.set("remark", value);
	}
	
	/**
	 * 每行显示多少个
    */
	public CheckboxesControl columnsCount(Object value) {
		return (CheckboxesControl) this.set("columnsCount", value);
	}
	
	/**
	 * 多选模式，值太多时是否避免折行
    */
	public CheckboxesControl valuesNoWrap(Object value) {
		return (CheckboxesControl) this.set("valuesNoWrap", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public CheckboxesControl name(Object value) {
		return (CheckboxesControl) this.set("name", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public CheckboxesControl inline(Object value) {
		return (CheckboxesControl) this.set("inline", value);
	}
	
	/**
	 * 占位符
    */
	public CheckboxesControl placeholder(Object value) {
		return (CheckboxesControl) this.set("placeholder", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public CheckboxesControl disabledOn(Object value) {
		return (CheckboxesControl) this.set("disabledOn", value);
	}
	
	/**
	 * 是否默认全选
    */
	public CheckboxesControl defaultCheckAll(Object value) {
		return (CheckboxesControl) this.set("defaultCheckAll", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public CheckboxesControl validateApi(Object value) {
		return (CheckboxesControl) this.set("validateApi", value);
	}
	
	/**
	 * 只读条件
    */
	public CheckboxesControl readOnlyOn(Object value) {
		return (CheckboxesControl) this.set("readOnlyOn", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public CheckboxesControl descriptionClassName(Object value) {
		return (CheckboxesControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 事件动作配置
    */
	public CheckboxesControl onEvent(Object value) {
		return (CheckboxesControl) this.set("onEvent", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public CheckboxesControl useMobileUI(Object value) {
		return (CheckboxesControl) this.set("useMobileUI", value);
	}
	}