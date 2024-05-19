package com.wcz0.renderers;
/**
 * 图片展示控件。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/image

 * @author wcz0
 * @version 6.2.2
 */
public class Image extends BaseRenderer {

	public Image() {
		this.set("type", "image");
	}

	/**
	 * 图片说明文字
    */
	public Image caption(Object value) {
		return (Image) this.set("caption", value);
	}
	
	/**
	 * 链接地址
    */
	public Image href(Object value) {
		return (Image) this.set("href", value);
	}
	
	/**
	 * 事件动作配置
    */
	public Image onEvent(Object value) {
		return (Image) this.set("onEvent", value);
	}
	
	/**
	 * 是否静态展示
    */
	public Image static_(Object value) {
		return (Image) this.set("static_", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public Image staticOn(Object value) {
		return (Image) this.set("staticOn", value);
	}
	
	/**
	 * 是否新窗口打开
    */
	public Image blank(Object value) {
		return (Image) this.set("blank", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public Image $$id(Object value) {
		return (Image) this.set("$$id", value);
	}
	
	/**
	    */
	public Image staticSchema(Object value) {
		return (Image) this.set("staticSchema", value);
	}
	
	/**
	    */
	public Image testIdBuilder(Object value) {
		return (Image) this.set("testIdBuilder", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public Image staticPlaceholder(Object value) {
		return (Image) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Image editorSetting(Object value) {
		return (Image) this.set("editorSetting", value);
	}
	
	/**
	 * 指定为图片展示类型
    * 可选值: image | static-image
    */
	public Image type(Object value) {
		return (Image) this.set("type", value);
	}
	
	/**
	 * 放大时是否显示图片集
    */
	public Image enlargeWithGallary(Object value) {
		return (Image) this.set("enlargeWithGallary", value);
	}
	
	/**
	 * 宽度
    */
	public Image width(Object value) {
		return (Image) this.set("width", value);
	}
	
	/**
	 * 是否隐藏
    */
	public Image hidden(Object value) {
		return (Image) this.set("hidden", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public Image visibleOn(Object value) {
		return (Image) this.set("visibleOn", value);
	}
	
	/**
	 * 预览图模式
    * 可选值: w-full | h-full | contain | cover
    */
	public Image thumbMode(Object value) {
		return (Image) this.set("thumbMode", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public Image staticLabelClassName(Object value) {
		return (Image) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 图片描述信息
    */
	public Image imageCaption(Object value) {
		return (Image) this.set("imageCaption", value);
	}
	
	/**
	 * 图片缩略图外层 css 类名
    */
	public Image thumbClassName(Object value) {
		return (Image) this.set("thumbClassName", value);
	}
	
	/**
	 * 图片展示模式，默认为缩略图模式、可以配置成原图模式
    * 可选值: thumb | original
    */
	public Image imageMode(Object value) {
		return (Image) this.set("imageMode", value);
	}
	
	/**
	 * 链接的 target
    */
	public Image htmlTarget(Object value) {
		return (Image) this.set("htmlTarget", value);
	}
	
	/**
	 * 外层 css 类名
    */
	public Image className(Object value) {
		return (Image) this.set("className", value);
	}
	
	/**
	 * 是否显示
    */
	public Image visible(Object value) {
		return (Image) this.set("visible", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public Image staticClassName(Object value) {
		return (Image) this.set("staticClassName", value);
	}
	
	/**
	 * 是否展示图片工具栏
    */
	public Image showToolbar(Object value) {
		return (Image) this.set("showToolbar", value);
	}
	
	/**
	 * 组件样式
    */
	public Image style(Object value) {
		return (Image) this.set("style", value);
	}
	
	/**
	 * 大图地址，不设置用 src
    */
	public Image originalSrc(Object value) {
		return (Image) this.set("originalSrc", value);
	}
	
	/**
	 * 组件内层 css 类名
    */
	public Image innerClassName(Object value) {
		return (Image) this.set("innerClassName", value);
	}
	
	/**
	 * 预览图比率
    * 可选值: 1:1 | 4:3 | 16:9
    */
	public Image thumbRatio(Object value) {
		return (Image) this.set("thumbRatio", value);
	}
	
	/**
	 * 工具栏配置
    */
	public Image toolbarActions(Object value) {
		return (Image) this.set("toolbarActions", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public Image staticInputClassName(Object value) {
		return (Image) this.set("staticInputClassName", value);
	}
	
	/**
	 * 默认图片地址
    */
	public Image defaultImage(Object value) {
		return (Image) this.set("defaultImage", value);
	}
	
	/**
	 * 关联字段名，也可以直接配置 src
    */
	public Image name(Object value) {
		return (Image) this.set("name", value);
	}
	
	/**
	 * 是否启动放大功能。
    */
	public Image enlargeAble(Object value) {
		return (Image) this.set("enlargeAble", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public Image disabledOn(Object value) {
		return (Image) this.set("disabledOn", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Image id(Object value) {
		return (Image) this.set("id", value);
	}
	
	/**
	 * 图片地址，如果配置了 name，这个属性不用配置。
    */
	public Image src(Object value) {
		return (Image) this.set("src", value);
	}
	
	/**
	    */
	public Image testid(Object value) {
		return (Image) this.set("testid", value);
	}
	
	/**
	 * 图片标题
    */
	public Image title(Object value) {
		return (Image) this.set("title", value);
	}
	
	/**
	 * 图片无法显示时的替换文本
    */
	public Image alt(Object value) {
		return (Image) this.set("alt", value);
	}
	
	/**
	 * 高度
    */
	public Image height(Object value) {
		return (Image) this.set("height", value);
	}
	
	/**
	 * 图片 css 类名
    */
	public Image imageClassName(Object value) {
		return (Image) this.set("imageClassName", value);
	}
	
	/**
	 * 是否禁用
    */
	public Image disabled(Object value) {
		return (Image) this.set("disabled", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public Image hiddenOn(Object value) {
		return (Image) this.set("hiddenOn", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Image useMobileUI(Object value) {
		return (Image) this.set("useMobileUI", value);
	}
	
	/**
	 * 放大详情图 CSS 类名
    */
	public Image imageGallaryClassName(Object value) {
		return (Image) this.set("imageGallaryClassName", value);
	}
	}