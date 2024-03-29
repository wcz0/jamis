package com.wcz0.renderers;
/**
 * Image 图片上传控件 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/image

 * @author wcz0
 * @version 6.2.2
 */
public class ImageControl extends BaseRenderer {

	public ImageControl() {
		this.set("type", "imageControl");
	}

	public ImageControl set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 是否禁用
    */
	public ImageControl disabled(Object value) {
		return (ImageControl) this.set("disabled", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public ImageControl staticClassName(Object value) {
		return (ImageControl) this.set("staticClassName", value);
	}
	
	/**
	 * 只读条件
    */
	public ImageControl readOnlyOn(Object value) {
		return (ImageControl) this.set("readOnlyOn", value);
	}
	
	/**
	    */
	public ImageControl desc(Object value) {
		return (ImageControl) this.set("desc", value);
	}
	
	/**
	    */
	public ImageControl compress(Object value) {
		return (ImageControl) this.set("compress", value);
	}
	
	/**
	 * 上传后把其他字段同步到表单内部。
    */
	public ImageControl autoFill(Object value) {
		return (ImageControl) this.set("autoFill", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public ImageControl id(Object value) {
		return (ImageControl) this.set("id", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public ImageControl staticPlaceholder(Object value) {
		return (ImageControl) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 不设置时，当表单提交过后表单项每次修改都会触发重新验证， 如果设置了，则由此配置项来决定要不要每次修改都触发验证。
    */
	public ImageControl validateOnChange(Object value) {
		return (ImageControl) this.set("validateOnChange", value);
	}
	
	/**
	 * 上传按钮的 CSS 类名
    */
	public ImageControl btnUploadClassName(Object value) {
		return (ImageControl) this.set("btnUploadClassName", value);
	}
	
	/**
	 * 固定尺寸的 CSS类名
    */
	public ImageControl fixedSizeClassName(Object value) {
		return (ImageControl) this.set("fixedSizeClassName", value);
	}
	
	/**
	 * 是否可拖拽排序
    */
	public ImageControl draggable(Object value) {
		return (ImageControl) this.set("draggable", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public ImageControl hiddenOn(Object value) {
		return (ImageControl) this.set("hiddenOn", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public ImageControl useMobileUI(Object value) {
		return (ImageControl) this.set("useMobileUI", value);
	}
	
	/**
	 * 表单项大小
    * 可选值: xs | sm | md | lg | full
    */
	public ImageControl size(Object value) {
		return (ImageControl) this.set("size", value);
	}
	
	/**
	 * 验证失败的提示信息
    */
	public ImageControl validationErrors(Object value) {
		return (ImageControl) this.set("validationErrors", value);
	}
	
	/**
	 * 最多的个数
    */
	public ImageControl maxLength(Object value) {
		return (ImageControl) this.set("maxLength", value);
	}
	
	/**
	 * 是否为多选
    */
	public ImageControl multiple(Object value) {
		return (ImageControl) this.set("multiple", value);
	}
	
	/**
	 * 分割符
    */
	public ImageControl delimiter(Object value) {
		return (ImageControl) this.set("delimiter", value);
	}
	
	/**
	 * 输入提示，聚焦的时候显示
    */
	public ImageControl hint(Object value) {
		return (ImageControl) this.set("hint", value);
	}
	
	/**
	 * 是否只读
    */
	public ImageControl readOnly(Object value) {
		return (ImageControl) this.set("readOnly", value);
	}
	
	/**
	    */
	public ImageControl validations(Object value) {
		return (ImageControl) this.set("validations", value);
	}
	
	/**
	 * 默认都是通过用户选择图片后上传返回图片地址，如果开启此选项，则可以允许用户图片地址。
    */
	public ImageControl allowInput(Object value) {
		return (ImageControl) this.set("allowInput", value);
	}
	
	/**
	 * 单选模式：当用户选中某个选项时，选项中的 value 将被作为该表单项的值提交，否则，整个选项对象都会作为该表单项的值提交。 多选模式：选中的多个选项的 `value` 会通过 `delimiter` 连接起来，否则直接将以数组的形式提交值。
    */
	public ImageControl joinValues(Object value) {
		return (ImageControl) this.set("joinValues", value);
	}
	
	/**
	 * 开启后将选中的选项 value 的值封装为数组，作为当前表单项的值。
    */
	public ImageControl extractValue(Object value) {
		return (ImageControl) this.set("extractValue", value);
	}
	
	/**
	 * 缩路图展示模式
    * 可选值: w-full | h-full | contain | cover
    */
	public ImageControl thumbMode(Object value) {
		return (ImageControl) this.set("thumbMode", value);
	}
	
	/**
	 * 是否静态展示
    */
	public ImageControl static_(Object value) {
		return (ImageControl) this.set("static_", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public ImageControl staticInputClassName(Object value) {
		return (ImageControl) this.set("staticInputClassName", value);
	}
	
	/**
	 * 初始化时是否打开裁剪模式
    */
	public ImageControl initCrop(Object value) {
		return (ImageControl) this.set("initCrop", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public ImageControl staticOn(Object value) {
		return (ImageControl) this.set("staticOn", value);
	}
	
	/**
	 * 描述内容，支持 Html 片段。
    */
	public ImageControl description(Object value) {
		return (ImageControl) this.set("description", value);
	}
	
	/**
	 * 表单项隐藏时，是否在当前 Form 中删除掉该表单项值。注意同名的未隐藏的表单项值也会删掉
    */
	public ImageControl clearValueOnHidden(Object value) {
		return (ImageControl) this.set("clearValueOnHidden", value);
	}
	
	/**
	 * 默认为 false, 开启后，允许用户输入压缩选项。
    */
	public ImageControl showCompressOptions(Object value) {
		return (ImageControl) this.set("showCompressOptions", value);
	}
	
	/**
	 * 初始化时是否把其他字段同步到表单内部。
    */
	public ImageControl initAutoFill(Object value) {
		return (ImageControl) this.set("initAutoFill", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public ImageControl labelWidth(Object value) {
		return (ImageControl) this.set("labelWidth", value);
	}
	
	/**
	 * 额外的字段名，当为范围组件时可以用来将另外一个值打平出来
    */
	public ImageControl extraName(Object value) {
		return (ImageControl) this.set("extraName", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容
    */
	public ImageControl remark(Object value) {
		return (ImageControl) this.set("remark", value);
	}
	
	/**
	 * 当修改完的时候是否提交表单。
    */
	public ImageControl submitOnChange(Object value) {
		return (ImageControl) this.set("submitOnChange", value);
	}
	
	/**
	 * 配置接收的图片类型建议直接填写文件后缀 如：.txt,.csv多个类型用逗号隔开。
    */
	public ImageControl accept(Object value) {
		return (ImageControl) this.set("accept", value);
	}
	
	/**
	 * 组件样式
    */
	public ImageControl style(Object value) {
		return (ImageControl) this.set("style", value);
	}
	
	/**
	    */
	public ImageControl compressOptions(Object value) {
		return (ImageControl) this.set("compressOptions", value);
	}
	
	/**
	 * 可配置移动端的拍照功能，比如配置 `camera` 移动端只能拍照，等
    */
	public ImageControl capture(Object value) {
		return (ImageControl) this.set("capture", value);
	}
	
	/**
	 * 默认占位图图片地址
    */
	public ImageControl frameImage(Object value) {
		return (ImageControl) this.set("frameImage", value);
	}
	
	/**
	 * 可拖拽排序的提示信息。
    */
	public ImageControl draggableTip(Object value) {
		return (ImageControl) this.set("draggableTip", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public ImageControl className(Object value) {
		return (ImageControl) this.set("className", value);
	}
	
	/**
	 * 是否为必填
    */
	public ImageControl required(Object value) {
		return (ImageControl) this.set("required", value);
	}
	
	/**
	 * 限制图片大小，超出不让上传。
    */
	public ImageControl limit(Object value) {
		return (ImageControl) this.set("limit", value);
	}
	
	/**
	 * 默认 `/api/upload` 如果想自己存储，请设置此选项。
    */
	public ImageControl receiver(Object value) {
		return (ImageControl) this.set("receiver", value);
	}
	
	/**
	 * 图片上传完毕是否进入裁剪模式
    */
	public ImageControl dropCrop(Object value) {
		return (ImageControl) this.set("dropCrop", value);
	}
	
	/**
	 * 是否隐藏
    */
	public ImageControl hidden(Object value) {
		return (ImageControl) this.set("hidden", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public ImageControl visibleOn(Object value) {
		return (ImageControl) this.set("visibleOn", value);
	}
	
	/**
	    */
	public ImageControl staticSchema(Object value) {
		return (ImageControl) this.set("staticSchema", value);
	}
	
	/**
	 * 选择图片按钮的 CSS 类名
    */
	public ImageControl btnClassName(Object value) {
		return (ImageControl) this.set("btnClassName", value);
	}
	
	/**
	    */
	public ImageControl crop(Object value) {
		return (ImageControl) this.set("crop", value);
	}
	
	/**
	 * 清除时设置的值
    */
	public ImageControl resetValue(Object value) {
		return (ImageControl) this.set("resetValue", value);
	}
	
	/**
	 * 描述标题
    */
	public ImageControl label(Object value) {
		return (ImageControl) this.set("label", value);
	}
	
	/**
	 * 默认值，切记只能是静态值，不支持取变量，跟数据关联是通过设置 name 属性来实现的。
    */
	public ImageControl value(Object value) {
		return (ImageControl) this.set("value", value);
	}
	
	/**
	 * 指定为图片上传控件
    */
	public ImageControl type(Object value) {
		return (ImageControl) this.set("type", value);
	}
	
	/**
	 * 是否自动开始上传
    */
	public ImageControl autoUpload(Object value) {
		return (ImageControl) this.set("autoUpload", value);
	}
	
	/**
	 * 缩路图展示比率。
    * 可选值: 1:1 | 4:3 | 16:9
    */
	public ImageControl thumbRatio(Object value) {
		return (ImageControl) this.set("thumbRatio", value);
	}
	
	/**
	 * 事件动作配置
    */
	public ImageControl onEvent(Object value) {
		return (ImageControl) this.set("onEvent", value);
	}
	
	/**
	 * 描述标题
    */
	public ImageControl labelAlign(Object value) {
		return (ImageControl) this.set("labelAlign", value);
	}
	
	/**
	 * 配置 label className
    */
	public ImageControl labelClassName(Object value) {
		return (ImageControl) this.set("labelClassName", value);
	}
	
	/**
	 * 字段名，表单提交时的 key，支持多层级，用.连接，如： a.b.c
    */
	public ImageControl name(Object value) {
		return (ImageControl) this.set("name", value);
	}
	
	/**
	 * 默认展示图片的类名
    */
	public ImageControl imageClassName(Object value) {
		return (ImageControl) this.set("imageClassName", value);
	}
	
	/**
	 * 裁剪后的质量
    */
	public ImageControl cropQuality(Object value) {
		return (ImageControl) this.set("cropQuality", value);
	}
	
	/**
	 * 是否隐藏上传按钮
    */
	public ImageControl hideUploadButton(Object value) {
		return (ImageControl) this.set("hideUploadButton", value);
	}
	
	/**
	 * 是否显示
    */
	public ImageControl visible(Object value) {
		return (ImageControl) this.set("visible", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public ImageControl editorSetting(Object value) {
		return (ImageControl) this.set("editorSetting", value);
	}
	
	/**
	 * 配置描述上的 className
    */
	public ImageControl descriptionClassName(Object value) {
		return (ImageControl) this.set("descriptionClassName", value);
	}
	
	/**
	 * 表单 control 是否为 inline 模式。
    */
	public ImageControl inline(Object value) {
		return (ImageControl) this.set("inline", value);
	}
	
	/**
	 * 默认没有限制，当设置后，文件大小大于此值将不允许上传。
    */
	public ImageControl maxSize(Object value) {
		return (ImageControl) this.set("maxSize", value);
	}
	
	/**
	 * 是否开启固定尺寸
    */
	public ImageControl fixedSize(Object value) {
		return (ImageControl) this.set("fixedSize", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public ImageControl disabledOn(Object value) {
		return (ImageControl) this.set("disabledOn", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public ImageControl staticLabelClassName(Object value) {
		return (ImageControl) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 远端校验表单项接口
    */
	public ImageControl validateApi(Object value) {
		return (ImageControl) this.set("validateApi", value);
	}
	
	/**
	 * 是否允许二次裁剪。
    */
	public ImageControl reCropable(Object value) {
		return (ImageControl) this.set("reCropable", value);
	}
	
	/**
	 * 在Table中调整宽度
    */
	public ImageControl width(Object value) {
		return (ImageControl) this.set("width", value);
	}
	
	/**
	 * 显示一个小图标, 鼠标放上去的时候显示提示内容, 这个小图标跟 label 在一起
    */
	public ImageControl labelRemark(Object value) {
		return (ImageControl) this.set("labelRemark", value);
	}
	
	/**
	 * 当配置为水平布局的时候，用来配置具体的左右分配。
    */
	public ImageControl horizontal(Object value) {
		return (ImageControl) this.set("horizontal", value);
	}
	
	/**
	 * 默认展示图片的链接
    */
	public ImageControl src(Object value) {
		return (ImageControl) this.set("src", value);
	}
	
	/**
	 * 裁剪后的图片类型
    */
	public ImageControl cropFormat(Object value) {
		return (ImageControl) this.set("cropFormat", value);
	}
	
	/**
	 * 配置当前表单项展示模式
    * 可选值: normal | inline | horizontal
    */
	public ImageControl mode(Object value) {
		return (ImageControl) this.set("mode", value);
	}
	
	/**
	 * 配置 input className
    */
	public ImageControl inputClassName(Object value) {
		return (ImageControl) this.set("inputClassName", value);
	}
	
	/**
	 * 占位符
    */
	public ImageControl placeholder(Object value) {
		return (ImageControl) this.set("placeholder", value);
	}
	
	/**
	 * 上传按钮文案
    */
	public ImageControl uploadBtnText(Object value) {
		return (ImageControl) this.set("uploadBtnText", value);
	}
	}