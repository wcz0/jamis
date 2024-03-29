package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class TableControl extends BaseRenderer {

	public TableControl() {
		this.set("type", "tableControl");
	}

	public TableControl set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 删除确认文字
    */
	public TableControl deleteConfirmText(Object value) {
		return (TableControl) this.set("deleteConfirmText", value);
	}
	
	/**
	 * 是否为确认的编辑模式。
    */
	public TableControl needConfirm(Object value) {
		return (TableControl) this.set("needConfirm", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public TableControl inline(Object value) {
		return (TableControl) this.set("inline", value);
	}
	
	/**
	 * 描述标题
    */
	public TableControl labelAlign(Object value) {
		return (TableControl) this.set("labelAlign", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public TableControl validationErrors(Object value) {
		return (TableControl) this.set("validationErrors", value);
	}
	
	/**
	 * 更新按钮图标
    */
	public TableControl editBtnIcon(Object value) {
		return (TableControl) this.set("editBtnIcon", value);
	}
	
	/**
	 * 底部新增按钮配置
    */
	public TableControl footerAddBtn(Object value) {
		return (TableControl) this.set("footerAddBtn", value);
	}
	
	/**
	 * 表格 CSS 类名
    */
	public TableControl tableClassName(Object value) {
		return (TableControl) this.set("tableClassName", value);
	}
	
	/**
	 * 组件样式
    */
	public TableControl style(Object value) {
		return (TableControl) this.set("style", value);
	}
	
	/**
	 * 描述标题
    */
	public TableControl label(Object value) {
		return (TableControl) this.set("label", value);
	}
	
	/**
	 * 是否显示
    */
	public TableControl visible(Object value) {
		return (TableControl) this.set("visible", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public TableControl staticPlaceholder(Object value) {
		return (TableControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 是否为必填
    */
	public TableControl required(Object value) {
		return (TableControl) this.set("required", value);
	}
	
	/**
	 * 是否可调整列宽
    */
	public TableControl resizable(Object value) {
		return (TableControl) this.set("resizable", value);
	}
	
	/**
	 * 更新 API
    */
	public TableControl updateApi(Object value) {
		return (TableControl) this.set("updateApi", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public TableControl width(Object value) {
		return (TableControl) this.set("width", value);
	}
	
	/**
	 * 行样式表表达式
    */
	public TableControl rowClassNameExpr(Object value) {
		return (TableControl) this.set("rowClassNameExpr", value);
	}
	
	/**
	 * 是否只读
    */
	public TableControl readOnly(Object value) {
		return (TableControl) this.set("readOnly", value);
	}
	
	/**
	 * 确认按钮文字
    */
	public TableControl confirmBtnLabel(Object value) {
		return (TableControl) this.set("confirmBtnLabel", value);
	}
	
	/**
	 * 懒加载 API，当行数据中用 defer: true 标记了，则其孩子节点将会用这个 API 来拉取数据。
    */
	public TableControl deferApi(Object value) {
		return (TableControl) this.set("deferApi", value);
	}
	
	/**
	 * 事件动作配置
    */
	public TableControl onEvent(Object value) {
		return (TableControl) this.set("onEvent", value);
	}
	
	/**
	 * 新增按钮图标
    */
	public TableControl addBtnIcon(Object value) {
		return (TableControl) this.set("addBtnIcon", value);
	}
	
	/**
	 * 顶部外层 CSS 类名
    */
	public TableControl headerClassName(Object value) {
		return (TableControl) this.set("headerClassName", value);
	}
	
	/**
	 * 可否删除
    */
	public TableControl removable(Object value) {
		return (TableControl) this.set("removable", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public TableControl validateOnChange(Object value) {
		return (TableControl) this.set("validateOnChange", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public TableControl value(Object value) {
		return (TableControl) this.set("value", value);
	}
	
	/**
	 * 是否显示复制按钮
    */
	public TableControl copyAddBtn(Object value) {
		return (TableControl) this.set("copyAddBtn", value);
	}
	
	/**
	 * 合并单元格配置，配置数字表示从左到右的多少列自动合并单元格。
    */
	public TableControl combineNum(Object value) {
		return (TableControl) this.set("combineNum", value);
	}
	
	/**
	 * 合并单元格配置，配置从第几列开始合并。
    */
	public TableControl combineFromIndex(Object value) {
		return (TableControl) this.set("combineFromIndex", value);
	}
	
	/**
	 * 是否显示底部新增按钮
    */
	public TableControl showFooterAddBtn(Object value) {
		return (TableControl) this.set("showFooterAddBtn", value);
	}
	
	/**
	 * 是否显示表格操作栏新增按钮
    */
	public TableControl showTableAddBtn(Object value) {
		return (TableControl) this.set("showTableAddBtn", value);
	}
	
	/**
	 * 删除的 API
    */
	public TableControl deleteApi(Object value) {
		return (TableControl) this.set("deleteApi", value);
	}
	
	/**
	 * 是否显示序号
    */
	public TableControl showIndex(Object value) {
		return (TableControl) this.set("showIndex", value);
	}
	
	/**
	 * 限制最大个数
    */
	public TableControl maxLength(Object value) {
		return (TableControl) this.set("maxLength", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public TableControl size(Object value) {
		return (TableControl) this.set("size", value);
	}
	
	/**
	 * 是否开启 static 状态切换
    */
	public TableControl enableStaticTransform(Object value) {
		return (TableControl) this.set("enableStaticTransform", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public TableControl staticOn(Object value) {
		return (TableControl) this.set("staticOn", value);
	}
	
	/**
	    */
	public TableControl staticSchema(Object value) {
		return (TableControl) this.set("staticSchema", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public TableControl labelWidth(Object value) {
		return (TableControl) this.set("labelWidth", value);
	}
	
	/**
	 * 展示列显示开关，自动即：列数量大于或等于5个时自动开启
    */
	public TableControl columnsTogglable(Object value) {
		return (TableControl) this.set("columnsTogglable", value);
	}
	
	/**
	 * 是否开启底部展示功能，适合移动端展示
    */
	public TableControl footable(Object value) {
		return (TableControl) this.set("footable", value);
	}
	
	/**
	 * 是否隐藏
    */
	public TableControl hidden(Object value) {
		return (TableControl) this.set("hidden", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public TableControl staticLabelClassName(Object value) {
		return (TableControl) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 更新按钮名称
    */
	public TableControl editBtnLabel(Object value) {
		return (TableControl) this.set("editBtnLabel", value);
	}
	
	/**
	 * 底部外层 CSS 类名
    */
	public TableControl footerClassName(Object value) {
		return (TableControl) this.set("footerClassName", value);
	}
	
	/**
	 * 是否显示头部
    */
	public TableControl showHeader(Object value) {
		return (TableControl) this.set("showHeader", value);
	}
	
	/**
	 * 行角标
    */
	public TableControl itemBadge(Object value) {
		return (TableControl) this.set("itemBadge", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public TableControl id(Object value) {
		return (TableControl) this.set("id", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public TableControl description(Object value) {
		return (TableControl) this.set("description", value);
	}
	
	/**
	 * 删除按钮文字
    */
	public TableControl deleteBtnLabel(Object value) {
		return (TableControl) this.set("deleteBtnLabel", value);
	}
	
	/**
	 * 可复制新增
    */
	public TableControl copyable(Object value) {
		return (TableControl) this.set("copyable", value);
	}
	
	/**
	 * 标题
    */
	public TableControl title(Object value) {
		return (TableControl) this.set("title", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public TableControl visibleOn(Object value) {
		return (TableControl) this.set("visibleOn", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public TableControl hint(Object value) {
		return (TableControl) this.set("hint", value);
	}
	
	/**
	    */
	public TableControl desc(Object value) {
		return (TableControl) this.set("desc", value);
	}
	
	/**
	 * 表格自动计算高度
    */
	public TableControl autoFillHeight(Object value) {
		return (TableControl) this.set("autoFillHeight", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public TableControl staticClassName(Object value) {
		return (TableControl) this.set("staticClassName", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public TableControl descriptionClassName(Object value) {
		return (TableControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 取消按钮文字
    */
	public TableControl cancelBtnLabel(Object value) {
		return (TableControl) this.set("cancelBtnLabel", value);
	}
	
	/**
	 * 是否禁用
    */
	public TableControl disabled(Object value) {
		return (TableControl) this.set("disabled", value);
	}
	
	/**
	 * 新增按钮文字
    */
	public TableControl addBtnLabel(Object value) {
		return (TableControl) this.set("addBtnLabel", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public TableControl staticInputClassName(Object value) {
		return (TableControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public TableControl mode(Object value) {
		return (TableControl) this.set("mode", value);
	}
	
	/**
	 * 复制按钮文字
    */
	public TableControl copyBtnLabel(Object value) {
		return (TableControl) this.set("copyBtnLabel", value);
	}
	
	/**
	 * 是否可以拖拽排序
    */
	public TableControl draggable(Object value) {
		return (TableControl) this.set("draggable", value);
	}
	
	/**
	 * table layout
    * 可选值: fixed | auto
    */
	public TableControl tableLayout(Object value) {
		return (TableControl) this.set("tableLayout", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public TableControl useMobileUI(Object value) {
		return (TableControl) this.set("useMobileUI", value);
	}
	
	/**
	 * 顶部总结行
    */
	public TableControl prefixRow(Object value) {
		return (TableControl) this.set("prefixRow", value);
	}
	
	/**
	 * 配置 label className
    */
	public TableControl labelClassName(Object value) {
		return (TableControl) this.set("labelClassName", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public TableControl name(Object value) {
		return (TableControl) this.set("name", value);
	}
	
	/**
	 * 占位符
    */
	public TableControl placeholder(Object value) {
		return (TableControl) this.set("placeholder", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public TableControl disabledOn(Object value) {
		return (TableControl) this.set("disabledOn", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public TableControl clearValueOnHidden(Object value) {
		return (TableControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	 * 值字段
    */
	public TableControl valueField(Object value) {
		return (TableControl) this.set("valueField", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public TableControl submitOnChange(Object value) {
		return (TableControl) this.set("submitOnChange", value);
	}
	
	/**
	 * 确认按钮图标
    */
	public TableControl confirmBtnIcon(Object value) {
		return (TableControl) this.set("confirmBtnIcon", value);
	}
	
	/**
	 * 是否静态展示
    */
	public TableControl static_(Object value) {
		return (TableControl) this.set("static_", value);
	}
	
	/**
	    */
	public TableControl type(Object value) {
		return (TableControl) this.set("type", value);
	}
	
	/**
	 * 底部工具栏CSS样式类
    */
	public TableControl toolbarClassName(Object value) {
		return (TableControl) this.set("toolbarClassName", value);
	}
	
	/**
	 * 开启查询区域，会根据列元素的searchable属性值，自动生成查询条件表单
    */
	public TableControl autoGenerateFilter(Object value) {
		return (TableControl) this.set("autoGenerateFilter", value);
	}
	
	/**
	 * 初始值，新增的时候
    */
	public TableControl scaffold(Object value) {
		return (TableControl) this.set("scaffold", value);
	}
	
	/**
	 * 限制最小个数
    */
	public TableControl minLength(Object value) {
		return (TableControl) this.set("minLength", value);
	}
	
	/**
	 * 只读条件
    */
	public TableControl readOnlyOn(Object value) {
		return (TableControl) this.set("readOnlyOn", value);
	}
	
	/**
	 * 可否编辑
    */
	public TableControl editable(Object value) {
		return (TableControl) this.set("editable", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public TableControl className(Object value) {
		return (TableControl) this.set("className", value);
	}
	
	/**
	 * 是否显示底部
    */
	public TableControl showFooter(Object value) {
		return (TableControl) this.set("showFooter", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public TableControl hiddenOn(Object value) {
		return (TableControl) this.set("hiddenOn", value);
	}
	
	/**
	 * 分页个数，默认不分页
    */
	public TableControl perPage(Object value) {
		return (TableControl) this.set("perPage", value);
	}
	
	/**
	 * 是否固底
    */
	public TableControl affixFooter(Object value) {
		return (TableControl) this.set("affixFooter", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public TableControl remark(Object value) {
		return (TableControl) this.set("remark", value);
	}
	
	/**
	 * 复制按钮图标
    */
	public TableControl copyBtnIcon(Object value) {
		return (TableControl) this.set("copyBtnIcon", value);
	}
	
	/**
	 * 取消按钮图标
    */
	public TableControl cancelBtnIcon(Object value) {
		return (TableControl) this.set("cancelBtnIcon", value);
	}
	
	/**
	 * 是否可以访问父级数据，正常 combo 已经关联到数组成员，是不能访问父级数据的。
    */
	public TableControl canAccessSuperData(Object value) {
		return (TableControl) this.set("canAccessSuperData", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public TableControl editorSetting(Object value) {
		return (TableControl) this.set("editorSetting", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public TableControl validateApi(Object value) {
		return (TableControl) this.set("validateApi", value);
	}
	
	/**
	 * 底部总结行
    */
	public TableControl affixRow(Object value) {
		return (TableControl) this.set("affixRow", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public TableControl horizontal(Object value) {
		return (TableControl) this.set("horizontal", value);
	}
	
	/**
	 * 是否固定表头
    */
	public TableControl affixHeader(Object value) {
		return (TableControl) this.set("affixHeader", value);
	}
	
	/**
	    */
	public TableControl validations(Object value) {
		return (TableControl) this.set("validations", value);
	}
	
	/**
	 * 新增 API
    */
	public TableControl addApi(Object value) {
		return (TableControl) this.set("addApi", value);
	}
	
	/**
	 * 删除按钮图标
    */
	public TableControl deleteBtnIcon(Object value) {
		return (TableControl) this.set("deleteBtnIcon", value);
	}
	
	/**
	 * 表格的列信息
    */
	public TableControl columns(Object value) {
		return (TableControl) this.set("columns", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public TableControl labelRemark(Object value) {
		return (TableControl) this.set("labelRemark", value);
	}
	
	/**
	 * 数据源：绑定当前环境变量
    */
	public TableControl source(Object value) {
		return (TableControl) this.set("source", value);
	}
	
	/**
	 * 配置 input className
    */
	public TableControl inputClassName(Object value) {
		return (TableControl) this.set("inputClassName", value);
	}
	
	/**
	 * 可新增
    */
	public TableControl addable(Object value) {
		return (TableControl) this.set("addable", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public TableControl extraName(Object value) {
		return (TableControl) this.set("extraName", value);
	}
	}