package com.wcz0.renderers;
/**
 * Nav 导航渲染器 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/nav

 * @author wcz0
 * @version 6.2.2
 */
public class Nav extends BaseRenderer {

	public Nav() {
		this.set("type", "nav");
	}

	public Nav set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 是否显示
    */
	public Nav visible(Object value) {
		return (Nav) this.set("visible", value);
	}
	
	/**
	 * 事件动作配置
    */
	public Nav onEvent(Object value) {
		return (Nav) this.set("onEvent", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Nav editorSetting(Object value) {
		return (Nav) this.set("editorSetting", value);
	}
	
	/**
	 * true 为垂直排列，false 为水平排列类似如 tabs。
    * 可选值: true | false
    */
	public Nav stacked(Object value) {
		return (Nav) this.set("stacked", value);
	}
	
	/**
	 * 仅允许同层级拖拽
    */
	public Nav dragOnSameLevel(Object value) {
		return (Nav) this.set("dragOnSameLevel", value);
	}
	
	/**
	 * 自定义展开图标位置 默认在前面 before after
    */
	public Nav expandPosition(Object value) {
		return (Nav) this.set("expandPosition", value);
	}
	
	/**
	 * 是否开启搜索
    */
	public Nav searchable(Object value) {
		return (Nav) this.set("searchable", value);
	}
	
	/**
	 * 是否隐藏
    */
	public Nav hidden(Object value) {
		return (Nav) this.set("hidden", value);
	}
	
	/**
	 * 是否静态展示
    */
	public Nav static_(Object value) {
		return (Nav) this.set("static_", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public Nav staticClassName(Object value) {
		return (Nav) this.set("staticClassName", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Nav useMobileUI(Object value) {
		return (Nav) this.set("useMobileUI", value);
	}
	
	/**
	 * 横向导航时自动收纳配置
    */
	public Nav overflow(Object value) {
		return (Nav) this.set("overflow", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public Nav disabledOn(Object value) {
		return (Nav) this.set("disabledOn", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public Nav hiddenOn(Object value) {
		return (Nav) this.set("hiddenOn", value);
	}
	
	/**
	 * 是否静态展示表达式
    */
	public Nav staticOn(Object value) {
		return (Nav) this.set("staticOn", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public Nav staticPlaceholder(Object value) {
		return (Nav) this.set("staticPlaceholder", value);
	}
	
	/**
	    */
	public Nav staticSchema(Object value) {
		return (Nav) this.set("staticSchema", value);
	}
	
	/**
	 * 链接地址集合
    */
	public Nav links(Object value) {
		return (Nav) this.set("links", value);
	}
	
	/**
	 * 可以通过 API 拉取。
    */
	public Nav source(Object value) {
		return (Nav) this.set("source", value);
	}
	
	/**
	 * 垂直模式 非折叠状态下 控制菜单打开方式
    * 可选值: float | inline
    */
	public Nav mode(Object value) {
		return (Nav) this.set("mode", value);
	}
	
	/**
	 * 主题配色 默认light
    * 可选值: light | dark
    */
	public Nav themeColor(Object value) {
		return (Nav) this.set("themeColor", value);
	}
	
	/**
	 * 搜索框相关配置
    */
	public Nav searchConfig(Object value) {
		return (Nav) this.set("searchConfig", value);
	}
	
	/**
	 * 最多展示多少层级
    */
	public Nav level(Object value) {
		return (Nav) this.set("level", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Nav id(Object value) {
		return (Nav) this.set("id", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public Nav staticInputClassName(Object value) {
		return (Nav) this.set("staticInputClassName", value);
	}
	
	/**
	    */
	public Nav indentSize(Object value) {
		return (Nav) this.set("indentSize", value);
	}
	
	/**
	 * 懒加载 api，如果不配置复用 source 接口。
    */
	public Nav deferApi(Object value) {
		return (Nav) this.set("deferApi", value);
	}
	
	/**
	 * 保存排序的 api
    */
	public Nav saveOrderApi(Object value) {
		return (Nav) this.set("saveOrderApi", value);
	}
	
	/**
	 * 角标
    */
	public Nav itemBadge(Object value) {
		return (Nav) this.set("itemBadge", value);
	}
	
	/**
	 * 角标
    */
	public Nav badge(Object value) {
		return (Nav) this.set("badge", value);
	}
	
	/**
	 * 是否禁用
    */
	public Nav disabled(Object value) {
		return (Nav) this.set("disabled", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public Nav visibleOn(Object value) {
		return (Nav) this.set("visibleOn", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public Nav staticLabelClassName(Object value) {
		return (Nav) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 指定为 Nav 导航渲染器
    */
	public Nav type(Object value) {
		return (Nav) this.set("type", value);
	}
	
	/**
	 * 默认展开层级 小于等于该层数的节点默认全部打开
    */
	public Nav defaultOpenLevel(Object value) {
		return (Nav) this.set("defaultOpenLevel", value);
	}
	
	/**
	 * 子菜单项展开浮层样式
    */
	public Nav popupClassName(Object value) {
		return (Nav) this.set("popupClassName", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public Nav className(Object value) {
		return (Nav) this.set("className", value);
	}
	
	/**
	 * 组件样式
    */
	public Nav style(Object value) {
		return (Nav) this.set("style", value);
	}
	
	/**
	    */
	public Nav testid(Object value) {
		return (Nav) this.set("testid", value);
	}
	
	/**
	 * 可拖拽
    */
	public Nav draggable(Object value) {
		return (Nav) this.set("draggable", value);
	}
	
	/**
	 * 控制仅展示指定key菜单下的子菜单项
    */
	public Nav showKey(Object value) {
		return (Nav) this.set("showKey", value);
	}
	
	/**
	 * 控制菜单缩起
    */
	public Nav collapsed(Object value) {
		return (Nav) this.set("collapsed", value);
	}
	
	/**
	 * 手风琴展开 仅垂直inline模式支持
    */
	public Nav accordion(Object value) {
		return (Nav) this.set("accordion", value);
	}
	
	/**
	 * 自定义展开图标
    */
	public Nav expandIcon(Object value) {
		return (Nav) this.set("expandIcon", value);
	}
	
	/**
	 * 更多操作菜单列表
    */
	public Nav itemActions(Object value) {
		return (Nav) this.set("itemActions", value);
	}
	}