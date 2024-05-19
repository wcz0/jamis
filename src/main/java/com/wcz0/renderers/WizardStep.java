package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class WizardStep extends BaseRenderer {

	public WizardStep() {
		this.set("type", "wizardStep");
	}

	/**
	 * 设置此属性后，表单提交发送保存接口后，还会继续轮询请求该接口，直到返回 finished 属性为 true 才 结束。
    */
	public WizardStep asyncApi(Object value) {
		return (WizardStep) this.set("asyncApi", value);
	}
	
	/**
	 * 描述
    */
	public WizardStep description(Object value) {
		return (WizardStep) this.set("description", value);
	}
	
	/**
	 * 默认的提交按钮名称，如果设置成空，则可以把默认按钮去掉。
    */
	public WizardStep submitText(Object value) {
		return (WizardStep) this.set("submitText", value);
	}
	
	/**
	    */
	public WizardStep data(Object value) {
		return (WizardStep) this.set("data", value);
	}
	
	/**
	 * Form 也可以配置 feedback。
    */
	public WizardStep feedback(Object value) {
		return (WizardStep) this.set("feedback", value);
	}
	
	/**
	 * 配置容器 panel className
    */
	public WizardStep panelClassName(Object value) {
		return (WizardStep) this.set("panelClassName", value);
	}
	
	/**
	 * 表单label的对齐方式
    */
	public WizardStep labelAlign(Object value) {
		return (WizardStep) this.set("labelAlign", value);
	}
	
	/**
	 * 默认表单提交自己会通过发送 api 保存数据，但是也可以设定另外一个 form 的 name 值，或者另外一个 `CRUD` 模型的 name 值。 如果 target 目标是一个 `Form` ，则目标 `Form` 会重新触发 `initApi` 和 `schemaApi`，api 可以拿到当前 form 数据。如果目标是一个 `CRUD` 模型，则目标模型会重新触发搜索，参数为当前 Form 数据。
    */
	public WizardStep target(Object value) {
		return (WizardStep) this.set("target", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public WizardStep $$id(Object value) {
		return (WizardStep) this.set("$$id", value);
	}
	
	/**
	 * 展示态时的className
    */
	public WizardStep static_(Object value) {
		return (WizardStep) this.set("static_", value);
	}
	
	/**
	 * Form 用来保存数据的 api。详情：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/index#%E8%A1%A8%E5%8D%95%E6%8F%90%E4%BA%A4
    */
	public WizardStep api(Object value) {
		return (WizardStep) this.set("api", value);
	}
	
	/**
	 * 是否隐藏
    */
	public WizardStep hidden(Object value) {
		return (WizardStep) this.set("hidden", value);
	}
	
	/**
	 * 是否显示
    */
	public WizardStep visible(Object value) {
		return (WizardStep) this.set("visible", value);
	}
	
	/**
	 * 禁用回车提交
    */
	public WizardStep preventEnterSubmit(Object value) {
		return (WizardStep) this.set("preventEnterSubmit", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public WizardStep useMobileUI(Object value) {
		return (WizardStep) this.set("useMobileUI", value);
	}
	
	/**
	 * 是否初始加载
    */
	public WizardStep initFetch(Object value) {
		return (WizardStep) this.set("initFetch", value);
	}
	
	/**
	    */
	public WizardStep name(Object value) {
		return (WizardStep) this.set("name", value);
	}
	
	/**
	 * 是否可直接跳转到该步骤，一般编辑模式需要可直接跳转查看。
    */
	public WizardStep jumpable(Object value) {
		return (WizardStep) this.set("jumpable", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public WizardStep className(Object value) {
		return (WizardStep) this.set("className", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public WizardStep hiddenOn(Object value) {
		return (WizardStep) this.set("hiddenOn", value);
	}
	
	/**
	    */
	public WizardStep staticClassName(Object value) {
		return (WizardStep) this.set("staticClassName", value);
	}
	
	/**
	 * 消息文案配置，记住这个优先级是最低的，如果你的接口返回了 msg，接口返回的优先。
    */
	public WizardStep messages(Object value) {
		return (WizardStep) this.set("messages", value);
	}
	
	/**
	 * 通过 JS 表达式来配置当前步骤可否被直接跳转到。
    */
	public WizardStep jumpableOn(Object value) {
		return (WizardStep) this.set("jumpableOn", value);
	}
	
	/**
	    */
	public WizardStep value(Object value) {
		return (WizardStep) this.set("value", value);
	}
	
	/**
	 * 配置表单项默认的展示方式。
    * 可选值: normal | inline | horizontal
    */
	public WizardStep mode(Object value) {
		return (WizardStep) this.set("mode", value);
	}
	
	/**
	 * 是否自动将第一个表单元素聚焦。
    */
	public WizardStep autoFocus(Object value) {
		return (WizardStep) this.set("autoFocus", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public WizardStep editorSetting(Object value) {
		return (WizardStep) this.set("editorSetting", value);
	}
	
	/**
	 * 表单项显示为几列
    */
	public WizardStep columnCount(Object value) {
		return (WizardStep) this.set("columnCount", value);
	}
	
	/**
	 * 如果是水平排版，这个属性可以细化水平排版的左右宽度占比。
    */
	public WizardStep horizontal(Object value) {
		return (WizardStep) this.set("horizontal", value);
	}
	
	/**
	 * 页面离开提示，为了防止页面不小心跳转而导致表单没有保存。
    */
	public WizardStep promptPageLeave(Object value) {
		return (WizardStep) this.set("promptPageLeave", value);
	}
	
	/**
	    */
	public WizardStep label(Object value) {
		return (WizardStep) this.set("label", value);
	}
	
	/**
	 * 是否禁用
    */
	public WizardStep disabled(Object value) {
		return (WizardStep) this.set("disabled", value);
	}
	
	/**
	 * 事件动作配置
    */
	public WizardStep onEvent(Object value) {
		return (WizardStep) this.set("onEvent", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public WizardStep staticPlaceholder(Object value) {
		return (WizardStep) this.set("staticPlaceholder", value);
	}
	
	/**
	    */
	public WizardStep reload(Object value) {
		return (WizardStep) this.set("reload", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public WizardStep disabledOn(Object value) {
		return (WizardStep) this.set("disabledOn", value);
	}
	
	/**
	 * 是否开启调试，开启后会在顶部实时显示表单项数据。
    */
	public WizardStep debug(Object value) {
		return (WizardStep) this.set("debug", value);
	}
	
	/**
	 * 轮询请求的时间间隔，默认为 3秒。设置 asyncApi 才有效
    */
	public WizardStep checkInterval(Object value) {
		return (WizardStep) this.set("checkInterval", value);
	}
	
	/**
	 * 表单标题
    */
	public WizardStep title(Object value) {
		return (WizardStep) this.set("title", value);
	}
	
	/**
	 * 设置了initAsyncApi以后，默认拉取的时间间隔
    */
	public WizardStep initCheckInterval(Object value) {
		return (WizardStep) this.set("initCheckInterval", value);
	}
	
	/**
	 * 设置后将轮询调用 initApi
    */
	public WizardStep interval(Object value) {
		return (WizardStep) this.set("interval", value);
	}
	
	/**
	 * 配置停止轮询的条件
    */
	public WizardStep stopAutoRefreshWhen(Object value) {
		return (WizardStep) this.set("stopAutoRefreshWhen", value);
	}
	
	/**
	    */
	public WizardStep testIdBuilder(Object value) {
		return (WizardStep) this.set("testIdBuilder", value);
	}
	
	/**
	 * 图标
    */
	public WizardStep icon(Object value) {
		return (WizardStep) this.set("icon", value);
	}
	
	/**
	 * 修改的时候是否直接提交表单。
    */
	public WizardStep submitOnChange(Object value) {
		return (WizardStep) this.set("submitOnChange", value);
	}
	
	/**
	 * 是否固定底下的按钮在底部。
    */
	public WizardStep affixFooter(Object value) {
		return (WizardStep) this.set("affixFooter", value);
	}
	
	/**
	    */
	public WizardStep testid(Object value) {
		return (WizardStep) this.set("testid", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public WizardStep id(Object value) {
		return (WizardStep) this.set("id", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public WizardStep staticInputClassName(Object value) {
		return (WizardStep) this.set("staticInputClassName", value);
	}
	
	/**
	 * 组件样式
    */
	public WizardStep style(Object value) {
		return (WizardStep) this.set("style", value);
	}
	
	/**
	 * 设置了initAsyncApi后，默认会从返回数据的data.finished来判断是否完成，也可以设置成其他的xxx，就会从data.xxx中获取
    */
	public WizardStep initFinishedField(Object value) {
		return (WizardStep) this.set("initFinishedField", value);
	}
	
	/**
	 * 是否静默拉取
    */
	public WizardStep silentPolling(Object value) {
		return (WizardStep) this.set("silentPolling", value);
	}
	
	/**
	 * 是否开启本地缓存
    */
	public WizardStep persistData(Object value) {
		return (WizardStep) this.set("persistData", value);
	}
	
	/**
	 * 表单初始先提交一次，联动的时候有用
    */
	public WizardStep submitOnInit(Object value) {
		return (WizardStep) this.set("submitOnInit", value);
	}
	
	/**
	 * 用来初始化表单数据
    */
	public WizardStep initApi(Object value) {
		return (WizardStep) this.set("initApi", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public WizardStep staticLabelClassName(Object value) {
		return (WizardStep) this.set("staticLabelClassName", value);
	}
	
	/**
	    */
	public WizardStep tabs(Object value) {
		return (WizardStep) this.set("tabs", value);
	}
	
	/**
	 * Debug面板配置
    */
	public WizardStep debugConfig(Object value) {
		return (WizardStep) this.set("debugConfig", value);
	}
	
	/**
	 * Form 用来获取初始数据的 api,与initApi不同的是，会一直轮询请求该接口，直到返回 finished 属性为 true 才 结束。
    */
	public WizardStep initAsyncApi(Object value) {
		return (WizardStep) this.set("initAsyncApi", value);
	}
	
	/**
	 * 提交后清空表单
    */
	public WizardStep clearAfterSubmit(Object value) {
		return (WizardStep) this.set("clearAfterSubmit", value);
	}
	
	/**
	 * 设置主键 id, 当设置后，检测表单是否完成时（asyncApi），只会携带此数据。
    */
	public WizardStep primaryField(Object value) {
		return (WizardStep) this.set("primaryField", value);
	}
	
	/**
	    */
	public WizardStep redirect(Object value) {
		return (WizardStep) this.set("redirect", value);
	}
	
	/**
	 * 子标题
    */
	public WizardStep subTitle(Object value) {
		return (WizardStep) this.set("subTitle", value);
	}
	
	/**
	 * 如果决定结束的字段名不是 `finished` 请设置此属性，比如 `is_success`
    */
	public WizardStep finishedField(Object value) {
		return (WizardStep) this.set("finishedField", value);
	}
	
	/**
	 * 组合校验规则，选填
    */
	public WizardStep rules(Object value) {
		return (WizardStep) this.set("rules", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public WizardStep labelWidth(Object value) {
		return (WizardStep) this.set("labelWidth", value);
	}
	
	/**
	    */
	public WizardStep staticOn(Object value) {
		return (WizardStep) this.set("staticOn", value);
	}
	
	/**
	 * 表单项集合
    */
	public WizardStep body(Object value) {
		return (WizardStep) this.set("body", value);
	}
	
	/**
	    */
	public WizardStep fieldSet(Object value) {
		return (WizardStep) this.set("fieldSet", value);
	}
	
	/**
	 * 建议改成 api 的 sendOn 属性。
    */
	public WizardStep initFetchOn(Object value) {
		return (WizardStep) this.set("initFetchOn", value);
	}
	
	/**
	 * 是否用 panel 包裹起来
    */
	public WizardStep wrapWithPanel(Object value) {
		return (WizardStep) this.set("wrapWithPanel", value);
	}
	
	/**
	 * 具体的提示信息，选填。
    */
	public WizardStep promptPageLeaveMessage(Object value) {
		return (WizardStep) this.set("promptPageLeaveMessage", value);
	}
	
	/**
	 * 按钮集合，会固定在底部显示。
    */
	public WizardStep actions(Object value) {
		return (WizardStep) this.set("actions", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public WizardStep visibleOn(Object value) {
		return (WizardStep) this.set("visibleOn", value);
	}
	
	/**
	 * 开启本地缓存后限制保存哪些 key
    */
	public WizardStep persistDataKeys(Object value) {
		return (WizardStep) this.set("persistDataKeys", value);
	}
	
	/**
	 * 提交完后重置表单
    */
	public WizardStep resetAfterSubmit(Object value) {
		return (WizardStep) this.set("resetAfterSubmit", value);
	}
	
	/**
	 * 提交成功后清空本地缓存
    */
	public WizardStep clearPersistDataAfterSubmit(Object value) {
		return (WizardStep) this.set("clearPersistDataAfterSubmit", value);
	}
	
	/**
	    */
	public WizardStep staticSchema(Object value) {
		return (WizardStep) this.set("staticSchema", value);
	}
	}