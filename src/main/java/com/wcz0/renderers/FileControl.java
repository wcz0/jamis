package com.wcz0.renderers;
/**
 * File 文件上传控件 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/file

 * @author wcz0
 * @version 6.2.2
 */
public class FileControl extends BaseRenderer {

	public FileControl() {
		this.set("type", "fileControl");
	}

	/**
	 * 上传按钮 CSS 类名
    */
	public FileControl btnUploadClassName(Object value) {
		return (FileControl) this.set("btnUploadClassName", value);
	}
	
	/**
	 * 1. 单选模式：当用户选中某个选项时，选项中的 value 将被作为该表单项的值提交， 否则，整个选项对象都会作为该表单项的值提交。 2. 多选模式：选中的多个选项的 `value` 会通过 `delimiter` 连接起来， 否则直接将以数组的形式提交值。
    */
	public FileControl joinValues(Object value) {
		return (FileControl) this.set("joinValues", value);
	}
	
	/**
	 * 接口返回的数据中，哪个用来当做值
    */
	public FileControl valueField(Object value) {
		return (FileControl) this.set("valueField", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public FileControl staticPlaceholder(Object value) {
		return (FileControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public FileControl name(Object value) {
		return (FileControl) this.set("name", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public FileControl validateOnChange(Object value) {
		return (FileControl) this.set("validateOnChange", value);
	}
	
	/**
	 * 默认 `/api/upload/chunk` 想自己存储时才需要关注。
    */
	public FileControl chunkApi(Object value) {
		return (FileControl) this.set("chunkApi", value);
	}
	
	/**
	 * 默认 `/api/upload/file` 如果想自己存储，请设置此选项。
    */
	public FileControl receiver(Object value) {
		return (FileControl) this.set("receiver", value);
	}
	
	/**
	 * 按钮状态文案配置。
    */
	public FileControl stateTextMap(Object value) {
		return (FileControl) this.set("stateTextMap", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public FileControl disabledOn(Object value) {
		return (FileControl) this.set("disabledOn", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public FileControl descriptionClassName(Object value) {
		return (FileControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 如果上传的文件比较小可以设置此选项来简单的把文件 base64 的值给 form 一起提交，目前不支持多选。
    */
	public FileControl asBase64(Object value) {
		return (FileControl) this.set("asBase64", value);
	}
	
	/**
	 * 默认没有限制，当设置后，文件大小大于此值将不允许上传。
    */
	public FileControl maxSize(Object value) {
		return (FileControl) this.set("maxSize", value);
	}
	
	/**
	 * 说明文档内容配置
    */
	public FileControl documentation(Object value) {
		return (FileControl) this.set("documentation", value);
	}
	
	/**
	 * 接口返回的数据中，哪个用来展示文件名
    */
	public FileControl nameField(Object value) {
		return (FileControl) this.set("nameField", value);
	}
	
	/**
	 * 说明文档链接配置
    */
	public FileControl documentLink(Object value) {
		return (FileControl) this.set("documentLink", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public FileControl staticOn(Object value) {
		return (FileControl) this.set("staticOn", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public FileControl remark(Object value) {
		return (FileControl) this.set("remark", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public FileControl validationErrors(Object value) {
		return (FileControl) this.set("validationErrors", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public FileControl validateApi(Object value) {
		return (FileControl) this.set("validateApi", value);
	}
	
	/**
	 * 上传后把其他字段同步到表单内部。
    */
	public FileControl autoFill(Object value) {
		return (FileControl) this.set("autoFill", value);
	}
	
	/**
	 * 模板下载地址
    */
	public FileControl templateUrl(Object value) {
		return (FileControl) this.set("templateUrl", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public FileControl $$id(Object value) {
		return (FileControl) this.set("$$id", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public FileControl labelWidth(Object value) {
		return (FileControl) this.set("labelWidth", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public FileControl inline(Object value) {
		return (FileControl) this.set("inline", value);
	}
	
	/**
	 * 默认为 'auto' amis 所在服务器，限制了文件上传大小不得超出10M，所以 amis 在用户选择大文件的时候，自动会改成分块上传模式。
    */
	public FileControl useChunk(Object value) {
		return (FileControl) this.set("useChunk", value);
	}
	
	/**
	 * 清除时设置的值
    */
	public FileControl resetValue(Object value) {
		return (FileControl) this.set("resetValue", value);
	}
	
	/**
	 * 接口返回的数据中哪个用来作为下载地址。
    */
	public FileControl urlField(Object value) {
		return (FileControl) this.set("urlField", value);
	}
	
	/**
	 * 组件样式
    */
	public FileControl style(Object value) {
		return (FileControl) this.set("style", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public FileControl size(Object value) {
		return (FileControl) this.set("size", value);
	}
	
	/**
	 * 如果不希望 File 组件上传，可以配置 `asBlob` 或者 `asBase64`，采用这种方式后，组件不再自己上传了，而是直接把文件数据作为表单项的值，文件内容会在 Form 表单提交的接口里面一起带上。
    */
	public FileControl asBlob(Object value) {
		return (FileControl) this.set("asBlob", value);
	}
	
	/**
	 * 默认显示文件路径的时候会支持直接下载， 可以支持加前缀如：`http://xx.dom/filename=` ， 如果不希望这样，可以把当前配置项设置为 `false`。1.1.6 版本开始将支持变量 ${xxx} 来自己拼凑个下载地址，并且支持配置成 post.
    */
	public FileControl downloadUrl(Object value) {
		return (FileControl) this.set("downloadUrl", value);
	}
	
	/**
	 * 最多的个数
    */
	public FileControl maxLength(Object value) {
		return (FileControl) this.set("maxLength", value);
	}
	
	/**
	 * 是否为多选
    */
	public FileControl multiple(Object value) {
		return (FileControl) this.set("multiple", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public FileControl staticInputClassName(Object value) {
		return (FileControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 上传文件按钮说明
    */
	public FileControl btnLabel(Object value) {
		return (FileControl) this.set("btnLabel", value);
	}
	
	/**
	 * 默认只支持纯文本，要支持其他类型，请配置此属性。建议直接填写文件后缀 如：.txt,.csv多个类型用逗号隔开。
    */
	public FileControl accept(Object value) {
		return (FileControl) this.set("accept", value);
	}
	
	/**
	 * 按钮 CSS 类名
    */
	public FileControl btnClassName(Object value) {
		return (FileControl) this.set("btnClassName", value);
	}
	
	/**
	 * 是否为拖拽上传
    */
	public FileControl drag(Object value) {
		return (FileControl) this.set("drag", value);
	}
	
	/**
	 * 事件动作配置
    */
	public FileControl onEvent(Object value) {
		return (FileControl) this.set("onEvent", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public FileControl staticClassName(Object value) {
		return (FileControl) this.set("staticClassName", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public FileControl mode(Object value) {
		return (FileControl) this.set("mode", value);
	}
	
	/**
	 * 配置 input className
    */
	public FileControl inputClassName(Object value) {
		return (FileControl) this.set("inputClassName", value);
	}
	
	/**
	 * 指定为文件上传
    */
	public FileControl type(Object value) {
		return (FileControl) this.set("type", value);
	}
	
	/**
	 * 分块上传的并发数
    */
	public FileControl concurrency(Object value) {
		return (FileControl) this.set("concurrency", value);
	}
	
	/**
	 * 描述标题
    */
	public FileControl label(Object value) {
		return (FileControl) this.set("label", value);
	}
	
	/**
	 * 是否为必填
    */
	public FileControl required(Object value) {
		return (FileControl) this.set("required", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public FileControl clearValueOnHidden(Object value) {
		return (FileControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	 * 默认 `/api/upload/startChunk` 想自己存储时才需要关注。
    */
	public FileControl startChunkApi(Object value) {
		return (FileControl) this.set("startChunkApi", value);
	}
	
	/**
	 * 开启后将选中的选项 value 的值封装为数组，作为当前表单项的值。
    */
	public FileControl extractValue(Object value) {
		return (FileControl) this.set("extractValue", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public FileControl width(Object value) {
		return (FileControl) this.set("width", value);
	}
	
	/**
	 * 是否隐藏
    */
	public FileControl hidden(Object value) {
		return (FileControl) this.set("hidden", value);
	}
	
	/**
	 * 配置 label className
    */
	public FileControl labelClassName(Object value) {
		return (FileControl) this.set("labelClassName", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public FileControl hint(Object value) {
		return (FileControl) this.set("hint", value);
	}
	
	/**
	    */
	public FileControl desc(Object value) {
		return (FileControl) this.set("desc", value);
	}
	
	/**
	 * 控制 input 标签的 capture 属性，用于移动端拍照或录像。
    */
	public FileControl capture(Object value) {
		return (FileControl) this.set("capture", value);
	}
	
	/**
	 * 是否自动开始上传
    */
	public FileControl autoUpload(Object value) {
		return (FileControl) this.set("autoUpload", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public FileControl className(Object value) {
		return (FileControl) this.set("className", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public FileControl useMobileUI(Object value) {
		return (FileControl) this.set("useMobileUI", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public FileControl extraName(Object value) {
		return (FileControl) this.set("extraName", value);
	}
	
	/**
	 * 是否只读
    */
	public FileControl readOnly(Object value) {
		return (FileControl) this.set("readOnly", value);
	}
	
	/**
	    */
	public FileControl validations(Object value) {
		return (FileControl) this.set("validations", value);
	}
	
	/**
	 * 默认 `file`, 如果你不想自己存储，则可以忽略此属性。
    */
	public FileControl fileField(Object value) {
		return (FileControl) this.set("fileField", value);
	}
	
	/**
	 * 只读条件
    */
	public FileControl readOnlyOn(Object value) {
		return (FileControl) this.set("readOnlyOn", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public FileControl description(Object value) {
		return (FileControl) this.set("description", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public FileControl horizontal(Object value) {
		return (FileControl) this.set("horizontal", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public FileControl value(Object value) {
		return (FileControl) this.set("value", value);
	}
	
	/**
	    */
	public FileControl staticSchema(Object value) {
		return (FileControl) this.set("staticSchema", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public FileControl labelRemark(Object value) {
		return (FileControl) this.set("labelRemark", value);
	}
	
	/**
	 * 默认 `/api/upload/finishChunkApi` 想自己存储时才需要关注。
    */
	public FileControl finishChunkApi(Object value) {
		return (FileControl) this.set("finishChunkApi", value);
	}
	
	/**
	 * 是否禁用
    */
	public FileControl disabled(Object value) {
		return (FileControl) this.set("disabled", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public FileControl hiddenOn(Object value) {
		return (FileControl) this.set("hiddenOn", value);
	}
	
	/**
	 * 是否显示
    */
	public FileControl visible(Object value) {
		return (FileControl) this.set("visible", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public FileControl visibleOn(Object value) {
		return (FileControl) this.set("visibleOn", value);
	}
	
	/**
	 * 描述标题
    */
	public FileControl labelAlign(Object value) {
		return (FileControl) this.set("labelAlign", value);
	}
	
	/**
	 * 占位符
    */
	public FileControl placeholder(Object value) {
		return (FileControl) this.set("placeholder", value);
	}
	
	/**
	 * 分块大小，默认为 5M.
    */
	public FileControl chunkSize(Object value) {
		return (FileControl) this.set("chunkSize", value);
	}
	
	/**
	 * 分割符
    */
	public FileControl delimiter(Object value) {
		return (FileControl) this.set("delimiter", value);
	}
	
	/**
	 * 初始化时是否把其他字段同步到表单内部。
    */
	public FileControl initAutoFill(Object value) {
		return (FileControl) this.set("initAutoFill", value);
	}
	
	/**
	 * 是否隐藏上传按钮
    */
	public FileControl hideUploadButton(Object value) {
		return (FileControl) this.set("hideUploadButton", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public FileControl id(Object value) {
		return (FileControl) this.set("id", value);
	}
	
	/**
	 * 是否静态展示
    */
	public FileControl static_(Object value) {
		return (FileControl) this.set("static_", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public FileControl staticLabelClassName(Object value) {
		return (FileControl) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public FileControl editorSetting(Object value) {
		return (FileControl) this.set("editorSetting", value);
	}
	
	/**
	    */
	public FileControl testIdBuilder(Object value) {
		return (FileControl) this.set("testIdBuilder", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public FileControl submitOnChange(Object value) {
		return (FileControl) this.set("submitOnChange", value);
	}
	}