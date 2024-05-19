package com.wcz0.renderers;
/**
 * Tree 下拉选择框。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/tree

 * @author wcz0
 * @version 6.2.2
 */
public class TreeControl extends BaseRenderer {

	public TreeControl() {
		this.set("type", "treeControl");
	}

	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public TreeControl extraName(Object value) {
		return (TreeControl) this.set("extraName", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public TreeControl hint(Object value) {
		return (TreeControl) this.set("hint", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public TreeControl validateApi(Object value) {
		return (TreeControl) this.set("validateApi", value);
	}
	
	/**
	 * 是否禁用
    */
	public TreeControl disabled(Object value) {
		return (TreeControl) this.set("disabled", value);
	}
	
	/**
	 * 表单项类型
    */
	public TreeControl type(Object value) {
		return (TreeControl) this.set("type", value);
	}
	
	/**
	 * 选父级的时候，是否只把子节点的值包含在内
    */
	public TreeControl onlyChildren(Object value) {
		return (TreeControl) this.set("onlyChildren", value);
	}
	
	/**
	 * 选项集合
    */
	public TreeControl options(Object value) {
		return (TreeControl) this.set("options", value);
	}
	
	/**
	 * 选项修改的表单项
    */
	public TreeControl editControls(Object value) {
		return (TreeControl) this.set("editControls", value);
	}
	
	/**
	 * 顶级节点是否可以创建子节点
    */
	public TreeControl rootCreatable(Object value) {
		return (TreeControl) this.set("rootCreatable", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public TreeControl id(Object value) {
		return (TreeControl) this.set("id", value);
	}
	
	/**
	 * 该属性代表数据级联关系，autoCheckChildren为true时生效，默认为false，具体数据级联关系如下： 1.casacde为false，ui行为为级联选中子节点，子节点禁用；值只包含父节点的值 2.cascade为false，withChildren为true，ui行为为级联选中子节点，子节点禁用；值包含父子节点的值 3.cascade为true，ui行为级联选中子节点，子节点可反选，值包含父子节点的值，此时withChildren属性失效 4.cascade不论为true还是false，onlyChildren为true，ui行为级联选中子节点，子节点可反选，值只包含子节点的值
    */
	public TreeControl cascade(Object value) {
		return (TreeControl) this.set("cascade", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public TreeControl description(Object value) {
		return (TreeControl) this.set("description", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public TreeControl validationErrors(Object value) {
		return (TreeControl) this.set("validationErrors", value);
	}
	
	/**
	 * 是否可清除。
    */
	public TreeControl clearable(Object value) {
		return (TreeControl) this.set("clearable", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public TreeControl submitOnChange(Object value) {
		return (TreeControl) this.set("submitOnChange", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public TreeControl mode(Object value) {
		return (TreeControl) this.set("mode", value);
	}
	
	/**
	 * 事件动作配置
    */
	public TreeControl onEvent(Object value) {
		return (TreeControl) this.set("onEvent", value);
	}
	
	/**
	 * 默认选择选项第一个值。
    */
	public TreeControl selectFirst(Object value) {
		return (TreeControl) this.set("selectFirst", value);
	}
	
	/**
	 * 分割符
    */
	public TreeControl delimiter(Object value) {
		return (TreeControl) this.set("delimiter", value);
	}
	
	/**
	 * 是否隐藏
    */
	public TreeControl hidden(Object value) {
		return (TreeControl) this.set("hidden", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public TreeControl useMobileUI(Object value) {
		return (TreeControl) this.set("useMobileUI", value);
	}
	
	/**
	 * 是否可删除
    */
	public TreeControl removable(Object value) {
		return (TreeControl) this.set("removable", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public TreeControl size(Object value) {
		return (TreeControl) this.set("size", value);
	}
	
	/**
	    */
	public TreeControl initAutoFill(Object value) {
		return (TreeControl) this.set("initAutoFill", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public TreeControl staticPlaceholder(Object value) {
		return (TreeControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public TreeControl width(Object value) {
		return (TreeControl) this.set("width", value);
	}
	
	/**
	 * 新增时的表单项。
    */
	public TreeControl addControls(Object value) {
		return (TreeControl) this.set("addControls", value);
	}
	
	/**
	 * 编辑时调用的 API
    */
	public TreeControl editApi(Object value) {
		return (TreeControl) this.set("editApi", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public TreeControl visibleOn(Object value) {
		return (TreeControl) this.set("visibleOn", value);
	}
	
	/**
	    */
	public TreeControl testIdBuilder(Object value) {
		return (TreeControl) this.set("testIdBuilder", value);
	}
	
	/**
	 * 单选时，只运行选择叶子节点
    */
	public TreeControl onlyLeaf(Object value) {
		return (TreeControl) this.set("onlyLeaf", value);
	}
	
	/**
	 * 搜索框的配置
    */
	public TreeControl searchConfig(Object value) {
		return (TreeControl) this.set("searchConfig", value);
	}
	
	/**
	 * 配置 label className
    */
	public TreeControl labelClassName(Object value) {
		return (TreeControl) this.set("labelClassName", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public TreeControl name(Object value) {
		return (TreeControl) this.set("name", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public TreeControl hiddenOn(Object value) {
		return (TreeControl) this.set("hiddenOn", value);
	}
	
	/**
	 * 组件样式
    */
	public TreeControl style(Object value) {
		return (TreeControl) this.set("style", value);
	}
	
	/**
	 * ui级联关系，true代表级联选中，false代表不级联，默认为true
    */
	public TreeControl autoCheckChildren(Object value) {
		return (TreeControl) this.set("autoCheckChildren", value);
	}
	
	/**
	 * 是否显示展开线
    */
	public TreeControl showOutline(Object value) {
		return (TreeControl) this.set("showOutline", value);
	}
	
	/**
	 * 是否为选项添加默认的Icon，默认值为true
    */
	public TreeControl enableDefaultIcon(Object value) {
		return (TreeControl) this.set("enableDefaultIcon", value);
	}
	
	/**
	 * 配置 source 接口初始拉不拉取。
    */
	public TreeControl initFetch(Object value) {
		return (TreeControl) this.set("initFetch", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public TreeControl labelWidth(Object value) {
		return (TreeControl) this.set("labelWidth", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public TreeControl staticLabelClassName(Object value) {
		return (TreeControl) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public TreeControl staticInputClassName(Object value) {
		return (TreeControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 顶级选项的值
    */
	public TreeControl rootValue(Object value) {
		return (TreeControl) this.set("rootValue", value);
	}
	
	/**
	 * 可用来通过 API 拉取 options。
    */
	public TreeControl source(Object value) {
		return (TreeControl) this.set("source", value);
	}
	
	/**
	    */
	public TreeControl validations(Object value) {
		return (TreeControl) this.set("validations", value);
	}
	
	/**
	 * 是否只读
    */
	public TreeControl readOnly(Object value) {
		return (TreeControl) this.set("readOnly", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public TreeControl horizontal(Object value) {
		return (TreeControl) this.set("horizontal", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public TreeControl labelRemark(Object value) {
		return (TreeControl) this.set("labelRemark", value);
	}
	
	/**
	 * 是否开启搜索
    */
	public TreeControl searchable(Object value) {
		return (TreeControl) this.set("searchable", value);
	}
	
	/**
	 * 高度自动增长？
    */
	public TreeControl heightAuto(Object value) {
		return (TreeControl) this.set("heightAuto", value);
	}
	
	/**
	 * 是否为多选模式
    */
	public TreeControl multiple(Object value) {
		return (TreeControl) this.set("multiple", value);
	}
	
	/**
	 * 开启后将选中的选项 value 的值封装为数组，作为当前表单项的值。
    */
	public TreeControl extractValue(Object value) {
		return (TreeControl) this.set("extractValue", value);
	}
	
	/**
	 * 选项删除提示文字。
    */
	public TreeControl deleteConfirmText(Object value) {
		return (TreeControl) this.set("deleteConfirmText", value);
	}
	
	/**
	    */
	public TreeControl desc(Object value) {
		return (TreeControl) this.set("desc", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public TreeControl staticOn(Object value) {
		return (TreeControl) this.set("staticOn", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public TreeControl staticClassName(Object value) {
		return (TreeControl) this.set("staticClassName", value);
	}
	
	/**
	 * 懒加载字段
    */
	public TreeControl deferField(Object value) {
		return (TreeControl) this.set("deferField", value);
	}
	
	/**
	 * 控制编辑弹框设置项
    */
	public TreeControl editDialog(Object value) {
		return (TreeControl) this.set("editDialog", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public TreeControl validateOnChange(Object value) {
		return (TreeControl) this.set("validateOnChange", value);
	}
	
	/**
	 * 占位符
    */
	public TreeControl placeholder(Object value) {
		return (TreeControl) this.set("placeholder", value);
	}
	
	/**
	 * 自动填充，当选项被选择的时候，将选项中的其他值同步设置到表单内。
    */
	public TreeControl autoFill(Object value) {
		return (TreeControl) this.set("autoFill", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public TreeControl className(Object value) {
		return (TreeControl) this.set("className", value);
	}
	
	/**
	 * 是否显示
    */
	public TreeControl visible(Object value) {
		return (TreeControl) this.set("visible", value);
	}
	
	/**
	 * 用表达式来配置 source 接口初始要不要拉取
    */
	public TreeControl initFetchOn(Object value) {
		return (TreeControl) this.set("initFetchOn", value);
	}
	
	/**
	 * 控制新增弹框设置项
    */
	public TreeControl addDialog(Object value) {
		return (TreeControl) this.set("addDialog", value);
	}
	
	/**
	 * 是否隐藏顶级
    */
	public TreeControl hideRoot(Object value) {
		return (TreeControl) this.set("hideRoot", value);
	}
	
	/**
	 * 选父级的时候是否把子节点的值也包含在内。
    */
	public TreeControl withChildren(Object value) {
		return (TreeControl) this.set("withChildren", value);
	}
	
	/**
	 * 是否静态展示
    */
	public TreeControl static_(Object value) {
		return (TreeControl) this.set("static_", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public TreeControl editorSetting(Object value) {
		return (TreeControl) this.set("editorSetting", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public TreeControl disabledOn(Object value) {
		return (TreeControl) this.set("disabledOn", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public TreeControl remark(Object value) {
		return (TreeControl) this.set("remark", value);
	}
	
	/**
	 * 需要高亮的字符串
    */
	public TreeControl highlightTxt(Object value) {
		return (TreeControl) this.set("highlightTxt", value);
	}
	
	/**
	 * 是否可以编辑
    */
	public TreeControl editable(Object value) {
		return (TreeControl) this.set("editable", value);
	}
	
	/**
	 * 只读条件
    */
	public TreeControl readOnlyOn(Object value) {
		return (TreeControl) this.set("readOnlyOn", value);
	}
	
	/**
	 * 描述标题
    */
	public TreeControl label(Object value) {
		return (TreeControl) this.set("label", value);
	}
	
	/**
	 * 配置 input className
    */
	public TreeControl inputClassName(Object value) {
		return (TreeControl) this.set("inputClassName", value);
	}
	
	/**
	 * 懒加载接口
    */
	public TreeControl deferApi(Object value) {
		return (TreeControl) this.set("deferApi", value);
	}
	
	/**
	 * 新增文字
    */
	public TreeControl createBtnLabel(Object value) {
		return (TreeControl) this.set("createBtnLabel", value);
	}
	
	/**
	 * 选项删除 API
    */
	public TreeControl deleteApi(Object value) {
		return (TreeControl) this.set("deleteApi", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public TreeControl inline(Object value) {
		return (TreeControl) this.set("inline", value);
	}
	
	/**
	 * 是否为必填
    */
	public TreeControl required(Object value) {
		return (TreeControl) this.set("required", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public TreeControl $$id(Object value) {
		return (TreeControl) this.set("$$id", value);
	}
	
	/**
	 * 多选模式，值太多时是否避免折行
    */
	public TreeControl valuesNoWrap(Object value) {
		return (TreeControl) this.set("valuesNoWrap", value);
	}
	
	/**
	 * 添加时调用的接口
    */
	public TreeControl addApi(Object value) {
		return (TreeControl) this.set("addApi", value);
	}
	
	/**
	 * 顶级选项的名称
    */
	public TreeControl rootLabel(Object value) {
		return (TreeControl) this.set("rootLabel", value);
	}
	
	/**
	 * 是否开启节点路径模式
    */
	public TreeControl enableNodePath(Object value) {
		return (TreeControl) this.set("enableNodePath", value);
	}
	
	/**
	 * 开启节点路径模式后，节点路径的分隔符
    */
	public TreeControl pathSeparator(Object value) {
		return (TreeControl) this.set("pathSeparator", value);
	}
	
	/**
	 * 是否可以新增
    */
	public TreeControl creatable(Object value) {
		return (TreeControl) this.set("creatable", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public TreeControl value(Object value) {
		return (TreeControl) this.set("value", value);
	}
	
	/**
	 * 描述标题
    */
	public TreeControl labelAlign(Object value) {
		return (TreeControl) this.set("labelAlign", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public TreeControl descriptionClassName(Object value) {
		return (TreeControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public TreeControl clearValueOnHidden(Object value) {
		return (TreeControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	    */
	public TreeControl staticSchema(Object value) {
		return (TreeControl) this.set("staticSchema", value);
	}
	
	/**
	 * 显示图标
    */
	public TreeControl showIcon(Object value) {
		return (TreeControl) this.set("showIcon", value);
	}
	
	/**
	 * 搜索 API
    */
	public TreeControl searchApi(Object value) {
		return (TreeControl) this.set("searchApi", value);
	}
	
	/**
	 * 单选模式：当用户选中某个选项时，选项中的 value 将被作为该表单项的值提交，否则，整个选项对象都会作为该表单项的值提交。 多选模式：选中的多个选项的 `value` 会通过 `delimiter` 连接起来，否则直接将以数组的形式提交值。
    */
	public TreeControl joinValues(Object value) {
		return (TreeControl) this.set("joinValues", value);
	}
	
	/**
	 * 点清除按钮时，将表单项设置成当前配置的值。
    */
	public TreeControl resetValue(Object value) {
		return (TreeControl) this.set("resetValue", value);
	}
	}