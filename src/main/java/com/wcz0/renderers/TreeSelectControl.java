package com.wcz0.renderers;
/**
 * Tree 下拉选择框。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/tree

 * @author wcz0
 * @version 6.2.2
 */
public class TreeSelectControl extends BaseRenderer {

	public TreeSelectControl() {
		this.set("type", "treeSelectControl");
	}

	public TreeSelectControl set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 默认选择选项第一个值。
    */
	public TreeSelectControl selectFirst(Object value) {
		return (TreeSelectControl) this.set("selectFirst", value);
	}
	
	/**
	 * 开启后将选中的选项 value 的值封装为数组，作为当前表单项的值。
    */
	public TreeSelectControl extractValue(Object value) {
		return (TreeSelectControl) this.set("extractValue", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public TreeSelectControl description(Object value) {
		return (TreeSelectControl) this.set("description", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public TreeSelectControl remark(Object value) {
		return (TreeSelectControl) this.set("remark", value);
	}
	
	/**
	 * 顶级选项的名称
    */
	public TreeSelectControl rootLabel(Object value) {
		return (TreeSelectControl) this.set("rootLabel", value);
	}
	
	/**
	 * 顶级节点是否可以创建子节点
    */
	public TreeSelectControl rootCreatable(Object value) {
		return (TreeSelectControl) this.set("rootCreatable", value);
	}
	
	/**
	 * 设置label字段
    */
	public TreeSelectControl labelField(Object value) {
		return (TreeSelectControl) this.set("labelField", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public TreeSelectControl hint(Object value) {
		return (TreeSelectControl) this.set("hint", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public TreeSelectControl clearValueOnHidden(Object value) {
		return (TreeSelectControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	 * 是否显示
    */
	public TreeSelectControl visible(Object value) {
		return (TreeSelectControl) this.set("visible", value);
	}
	
	/**
	 * 表单项类型
    */
	public TreeSelectControl type(Object value) {
		return (TreeSelectControl) this.set("type", value);
	}
	
	/**
	 * 顶级选项的值
    */
	public TreeSelectControl rootValue(Object value) {
		return (TreeSelectControl) this.set("rootValue", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public TreeSelectControl extraName(Object value) {
		return (TreeSelectControl) this.set("extraName", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public TreeSelectControl labelRemark(Object value) {
		return (TreeSelectControl) this.set("labelRemark", value);
	}
	
	/**
	 * 设置value字段
    */
	public TreeSelectControl valueField(Object value) {
		return (TreeSelectControl) this.set("valueField", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public TreeSelectControl value(Object value) {
		return (TreeSelectControl) this.set("value", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public TreeSelectControl validateApi(Object value) {
		return (TreeSelectControl) this.set("validateApi", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public TreeSelectControl className(Object value) {
		return (TreeSelectControl) this.set("className", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public TreeSelectControl id(Object value) {
		return (TreeSelectControl) this.set("id", value);
	}
	
	/**
	 * 显示图标
    */
	public TreeSelectControl showIcon(Object value) {
		return (TreeSelectControl) this.set("showIcon", value);
	}
	
	/**
	 * 自动填充，当选项被选择的时候，将选项中的其他值同步设置到表单内。
    */
	public TreeSelectControl autoFill(Object value) {
		return (TreeSelectControl) this.set("autoFill", value);
	}
	
	/**
	 * 是否隐藏选择框中已选中节点的祖先节点的文本信息
    */
	public TreeSelectControl hideNodePathLabel(Object value) {
		return (TreeSelectControl) this.set("hideNodePathLabel", value);
	}
	
	/**
	 * 标签的最大展示数量，超出数量后以收纳浮层的方式展示，仅在多选模式开启后生效
    */
	public TreeSelectControl maxTagCount(Object value) {
		return (TreeSelectControl) this.set("maxTagCount", value);
	}
	
	/**
	 * 收纳标签的Popover配置
    */
	public TreeSelectControl overflowTagPopover(Object value) {
		return (TreeSelectControl) this.set("overflowTagPopover", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public TreeSelectControl width(Object value) {
		return (TreeSelectControl) this.set("width", value);
	}
	
	/**
	 * 可用来通过 API 拉取 options。
    */
	public TreeSelectControl source(Object value) {
		return (TreeSelectControl) this.set("source", value);
	}
	
	/**
	 * 编辑时调用的 API
    */
	public TreeSelectControl editApi(Object value) {
		return (TreeSelectControl) this.set("editApi", value);
	}
	
	/**
	 * 选项删除 API
    */
	public TreeSelectControl deleteApi(Object value) {
		return (TreeSelectControl) this.set("deleteApi", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public TreeSelectControl name(Object value) {
		return (TreeSelectControl) this.set("name", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public TreeSelectControl visibleOn(Object value) {
		return (TreeSelectControl) this.set("visibleOn", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public TreeSelectControl staticInputClassName(Object value) {
		return (TreeSelectControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 是否开启节点路径模式
    */
	public TreeSelectControl enableNodePath(Object value) {
		return (TreeSelectControl) this.set("enableNodePath", value);
	}
	
	/**
	 * 分割符
    */
	public TreeSelectControl delimiter(Object value) {
		return (TreeSelectControl) this.set("delimiter", value);
	}
	
	/**
	 * 是否可清除。
    */
	public TreeSelectControl clearable(Object value) {
		return (TreeSelectControl) this.set("clearable", value);
	}
	
	/**
	 * 新增时的表单项。
    */
	public TreeSelectControl addControls(Object value) {
		return (TreeSelectControl) this.set("addControls", value);
	}
	
	/**
	 * 是否只读
    */
	public TreeSelectControl readOnly(Object value) {
		return (TreeSelectControl) this.set("readOnly", value);
	}
	
	/**
	 * 是否隐藏
    */
	public TreeSelectControl hidden(Object value) {
		return (TreeSelectControl) this.set("hidden", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public TreeSelectControl hiddenOn(Object value) {
		return (TreeSelectControl) this.set("hiddenOn", value);
	}
	
	/**
	 * 单选模式：当用户选中某个选项时，选项中的 value 将被作为该表单项的值提交，否则，整个选项对象都会作为该表单项的值提交。 多选模式：选中的多个选项的 `value` 会通过 `delimiter` 连接起来，否则直接将以数组的形式提交值。
    */
	public TreeSelectControl joinValues(Object value) {
		return (TreeSelectControl) this.set("joinValues", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public TreeSelectControl validateOnChange(Object value) {
		return (TreeSelectControl) this.set("validateOnChange", value);
	}
	
	/**
	 * 选父级的时候，是否只把子节点的值包含在内
    */
	public TreeSelectControl onlyChildren(Object value) {
		return (TreeSelectControl) this.set("onlyChildren", value);
	}
	
	/**
	 * 用表达式来配置 source 接口初始要不要拉取
    */
	public TreeSelectControl initFetchOn(Object value) {
		return (TreeSelectControl) this.set("initFetchOn", value);
	}
	
	/**
	    */
	public TreeSelectControl initAutoFill(Object value) {
		return (TreeSelectControl) this.set("initAutoFill", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public TreeSelectControl size(Object value) {
		return (TreeSelectControl) this.set("size", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public TreeSelectControl horizontal(Object value) {
		return (TreeSelectControl) this.set("horizontal", value);
	}
	
	/**
	 * 配置 input className
    */
	public TreeSelectControl inputClassName(Object value) {
		return (TreeSelectControl) this.set("inputClassName", value);
	}
	
	/**
	 * 是否为必填
    */
	public TreeSelectControl required(Object value) {
		return (TreeSelectControl) this.set("required", value);
	}
	
	/**
	    */
	public TreeSelectControl validations(Object value) {
		return (TreeSelectControl) this.set("validations", value);
	}
	
	/**
	 * 是否显示展开线
    */
	public TreeSelectControl showOutline(Object value) {
		return (TreeSelectControl) this.set("showOutline", value);
	}
	
	/**
	 * 是否为选项添加默认的Icon，默认值为true
    */
	public TreeSelectControl enableDefaultIcon(Object value) {
		return (TreeSelectControl) this.set("enableDefaultIcon", value);
	}
	
	/**
	 * 是否可以新增
    */
	public TreeSelectControl creatable(Object value) {
		return (TreeSelectControl) this.set("creatable", value);
	}
	
	/**
	 * 是否禁用
    */
	public TreeSelectControl disabled(Object value) {
		return (TreeSelectControl) this.set("disabled", value);
	}
	
	/**
	 * 是否隐藏顶级
    */
	public TreeSelectControl hideRoot(Object value) {
		return (TreeSelectControl) this.set("hideRoot", value);
	}
	
	/**
	 * 自定义选项
    */
	public TreeSelectControl menuTpl(Object value) {
		return (TreeSelectControl) this.set("menuTpl", value);
	}
	
	/**
	 * 是否可删除
    */
	public TreeSelectControl removable(Object value) {
		return (TreeSelectControl) this.set("removable", value);
	}
	
	/**
	 * 选项删除提示文字。
    */
	public TreeSelectControl deleteConfirmText(Object value) {
		return (TreeSelectControl) this.set("deleteConfirmText", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public TreeSelectControl submitOnChange(Object value) {
		return (TreeSelectControl) this.set("submitOnChange", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public TreeSelectControl descriptionClassName(Object value) {
		return (TreeSelectControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 占位符
    */
	public TreeSelectControl placeholder(Object value) {
		return (TreeSelectControl) this.set("placeholder", value);
	}
	
	/**
	 * 事件动作配置
    */
	public TreeSelectControl onEvent(Object value) {
		return (TreeSelectControl) this.set("onEvent", value);
	}
	
	/**
	 * 是否静态展示
    */
	public TreeSelectControl static_(Object value) {
		return (TreeSelectControl) this.set("static_", value);
	}
	
	/**
	 * 父子之间是否完全独立。
    */
	public TreeSelectControl cascade(Object value) {
		return (TreeSelectControl) this.set("cascade", value);
	}
	
	/**
	 * 懒加载字段
    */
	public TreeSelectControl deferField(Object value) {
		return (TreeSelectControl) this.set("deferField", value);
	}
	
	/**
	 * 懒加载接口
    */
	public TreeSelectControl deferApi(Object value) {
		return (TreeSelectControl) this.set("deferApi", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public TreeSelectControl staticOn(Object value) {
		return (TreeSelectControl) this.set("staticOn", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public TreeSelectControl staticClassName(Object value) {
		return (TreeSelectControl) this.set("staticClassName", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public TreeSelectControl editorSetting(Object value) {
		return (TreeSelectControl) this.set("editorSetting", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public TreeSelectControl useMobileUI(Object value) {
		return (TreeSelectControl) this.set("useMobileUI", value);
	}
	
	/**
	 * 选父级的时候是否把子节点的值也包含在内。
    */
	public TreeSelectControl withChildren(Object value) {
		return (TreeSelectControl) this.set("withChildren", value);
	}
	
	/**
	 * 选项修改的表单项
    */
	public TreeSelectControl editControls(Object value) {
		return (TreeSelectControl) this.set("editControls", value);
	}
	
	/**
	 * 描述标题
    */
	public TreeSelectControl labelAlign(Object value) {
		return (TreeSelectControl) this.set("labelAlign", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public TreeSelectControl labelWidth(Object value) {
		return (TreeSelectControl) this.set("labelWidth", value);
	}
	
	/**
	    */
	public TreeSelectControl desc(Object value) {
		return (TreeSelectControl) this.set("desc", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public TreeSelectControl mode(Object value) {
		return (TreeSelectControl) this.set("mode", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public TreeSelectControl staticPlaceholder(Object value) {
		return (TreeSelectControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 配置 source 接口初始拉不拉取。
    */
	public TreeSelectControl initFetch(Object value) {
		return (TreeSelectControl) this.set("initFetch", value);
	}
	
	/**
	 * 新增文字
    */
	public TreeSelectControl createBtnLabel(Object value) {
		return (TreeSelectControl) this.set("createBtnLabel", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public TreeSelectControl validationErrors(Object value) {
		return (TreeSelectControl) this.set("validationErrors", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public TreeSelectControl disabledOn(Object value) {
		return (TreeSelectControl) this.set("disabledOn", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public TreeSelectControl staticLabelClassName(Object value) {
		return (TreeSelectControl) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 开启节点路径模式后，节点路径的分隔符
    */
	public TreeSelectControl pathSeparator(Object value) {
		return (TreeSelectControl) this.set("pathSeparator", value);
	}
	
	/**
	 * 是否可搜索
    */
	public TreeSelectControl searchable(Object value) {
		return (TreeSelectControl) this.set("searchable", value);
	}
	
	/**
	 * 是否自动选中子节点
    */
	public TreeSelectControl autoCheckChildren(Object value) {
		return (TreeSelectControl) this.set("autoCheckChildren", value);
	}
	
	/**
	 * 多选模式，值太多时是否避免折行
    */
	public TreeSelectControl valuesNoWrap(Object value) {
		return (TreeSelectControl) this.set("valuesNoWrap", value);
	}
	
	/**
	 * 点清除按钮时，将表单项设置成当前配置的值。
    */
	public TreeSelectControl resetValue(Object value) {
		return (TreeSelectControl) this.set("resetValue", value);
	}
	
	/**
	 * 添加时调用的接口
    */
	public TreeSelectControl addApi(Object value) {
		return (TreeSelectControl) this.set("addApi", value);
	}
	
	/**
	 * 控制编辑弹框设置项
    */
	public TreeSelectControl editDialog(Object value) {
		return (TreeSelectControl) this.set("editDialog", value);
	}
	
	/**
	 * 组件样式
    */
	public TreeSelectControl style(Object value) {
		return (TreeSelectControl) this.set("style", value);
	}
	
	/**
	 * 选项集合
    */
	public TreeSelectControl options(Object value) {
		return (TreeSelectControl) this.set("options", value);
	}
	
	/**
	 * 是否为多选模式
    */
	public TreeSelectControl multiple(Object value) {
		return (TreeSelectControl) this.set("multiple", value);
	}
	
	/**
	 * 控制新增弹框设置项
    */
	public TreeSelectControl addDialog(Object value) {
		return (TreeSelectControl) this.set("addDialog", value);
	}
	
	/**
	 * 是否可以编辑
    */
	public TreeSelectControl editable(Object value) {
		return (TreeSelectControl) this.set("editable", value);
	}
	
	/**
	 * 描述标题
    */
	public TreeSelectControl label(Object value) {
		return (TreeSelectControl) this.set("label", value);
	}
	
	/**
	 * 配置 label className
    */
	public TreeSelectControl labelClassName(Object value) {
		return (TreeSelectControl) this.set("labelClassName", value);
	}
	
	/**
	 * 只读条件
    */
	public TreeSelectControl readOnlyOn(Object value) {
		return (TreeSelectControl) this.set("readOnlyOn", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public TreeSelectControl inline(Object value) {
		return (TreeSelectControl) this.set("inline", value);
	}
	
	/**
	    */
	public TreeSelectControl staticSchema(Object value) {
		return (TreeSelectControl) this.set("staticSchema", value);
	}
	
	/**
	 * 单选时，只运行选择叶子节点
    */
	public TreeSelectControl onlyLeaf(Object value) {
		return (TreeSelectControl) this.set("onlyLeaf", value);
	}
	}