package com.wcz0.renderers;
/**
 * Form 表单渲染器。说明：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/index

 * @author wcz0
 * @version 6.2.2
 */
public class Form extends BaseRenderer {

	public Form() {
		this.set("type", "form");
	}

	/**
	 * 表单初始先提交一次，联动的时候有用
    */
	public Form submitOnInit(Object value) {
		return (Form) this.set("submitOnInit", value);
	}
	
	/**
	 * 默认的提交按钮名称，如果设置成空，则可以把默认按钮去掉。
    */
	public Form submitText(Object value) {
		return (Form) this.set("submitText", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Form useMobileUI(Object value) {
		return (Form) this.set("useMobileUI", value);
	}
	
	/**
	 * 指定为表单渲染器。
    */
	public Form type(Object value) {
		return (Form) this.set("type", value);
	}
	
	/**
	 * 开启本地缓存后限制保存哪些 key
    */
	public Form persistDataKeys(Object value) {
		return (Form) this.set("persistDataKeys", value);
	}
	
	/**
	 * 设置主键 id, 当设置后，检测表单是否完成时（asyncApi），只会携带此数据。
    */
	public Form primaryField(Object value) {
		return (Form) this.set("primaryField", value);
	}
	
	/**
	 * 设置了initAsyncApi后，默认会从返回数据的data.finished来判断是否完成，也可以设置成其他的xxx，就会从data.xxx中获取
    */
	public Form initFinishedField(Object value) {
		return (Form) this.set("initFinishedField", value);
	}
	
	/**
	 * 配置停止轮询的条件
    */
	public Form stopAutoRefreshWhen(Object value) {
		return (Form) this.set("stopAutoRefreshWhen", value);
	}
	
	/**
	 * 具体的提示信息，选填。
    */
	public Form promptPageLeaveMessage(Object value) {
		return (Form) this.set("promptPageLeaveMessage", value);
	}
	
	/**
	    */
	public Form tabs(Object value) {
		return (Form) this.set("tabs", value);
	}
	
	/**
	 * 设置此属性后，表单提交发送保存接口后，还会继续轮询请求该接口，直到返回 finished 属性为 true 才 结束。
    */
	public Form asyncApi(Object value) {
		return (Form) this.set("asyncApi", value);
	}
	
	/**
	 * 是否禁用
    */
	public Form disabled(Object value) {
		return (Form) this.set("disabled", value);
	}
	
	/**
	 * 表单label的对齐方式
    */
	public Form labelAlign(Object value) {
		return (Form) this.set("labelAlign", value);
	}
	
	/**
	 * 表单项集合
    */
	public Form body(Object value) {
		return (Form) this.set("body", value);
	}
	
	/**
	 * 提交后清空表单
    */
	public Form clearAfterSubmit(Object value) {
		return (Form) this.set("clearAfterSubmit", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public Form className(Object value) {
		return (Form) this.set("className", value);
	}
	
	/**
	 * 表单标题
    */
	public Form title(Object value) {
		return (Form) this.set("title", value);
	}
	
	/**
	 * 配置表单项默认的展示方式。
    * 可选值: normal | inline | horizontal
    */
	public Form mode(Object value) {
		return (Form) this.set("mode", value);
	}
	
	/**
	    */
	public Form redirect(Object value) {
		return (Form) this.set("redirect", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public Form staticLabelClassName(Object value) {
		return (Form) this.set("staticLabelClassName", value);
	}
	
	/**
	    */
	public Form testid(Object value) {
		return (Form) this.set("testid", value);
	}
	
	/**
	    */
	public Form fieldSet(Object value) {
		return (Form) this.set("fieldSet", value);
	}
	
	/**
	 * 是否静默拉取
    */
	public Form silentPolling(Object value) {
		return (Form) this.set("silentPolling", value);
	}
	
	/**
	 * Form 也可以配置 feedback。
    */
	public Form feedback(Object value) {
		return (Form) this.set("feedback", value);
	}
	
	/**
	 * 消息文案配置，记住这个优先级是最低的，如果你的接口返回了 msg，接口返回的优先。
    */
	public Form messages(Object value) {
		return (Form) this.set("messages", value);
	}
	
	/**
	 * 组合校验规则，选填
    */
	public Form rules(Object value) {
		return (Form) this.set("rules", value);
	}
	
	/**
	 * 禁用回车提交
    */
	public Form preventEnterSubmit(Object value) {
		return (Form) this.set("preventEnterSubmit", value);
	}
	
	/**
	 * 组件唯一 id，主要用于页面设计器中定位 json 节点
    */
	public Form $$id(Object value) {
		return (Form) this.set("$$id", value);
	}
	
	/**
	    */
	public Form staticSchema(Object value) {
		return (Form) this.set("staticSchema", value);
	}
	
	/**
	 * 配置容器 panel className
    */
	public Form panelClassName(Object value) {
		return (Form) this.set("panelClassName", value);
	}
	
	/**
	    */
	public Form staticClassName(Object value) {
		return (Form) this.set("staticClassName", value);
	}
	
	/**
	 * 用来初始化表单数据
    */
	public Form initApi(Object value) {
		return (Form) this.set("initApi", value);
	}
	
	/**
	 * 展示态时的className
    */
	public Form static_(Object value) {
		return (Form) this.set("static_", value);
	}
	
	/**
	    */
	public Form data(Object value) {
		return (Form) this.set("data", value);
	}
	
	/**
	 * Form 用来获取初始数据的 api,与initApi不同的是，会一直轮询请求该接口，直到返回 finished 属性为 true 才 结束。
    */
	public Form initAsyncApi(Object value) {
		return (Form) this.set("initAsyncApi", value);
	}
	
	/**
	 * 修改的时候是否直接提交表单。
    */
	public Form submitOnChange(Object value) {
		return (Form) this.set("submitOnChange", value);
	}
	
	/**
	 * 是否显示
    */
	public Form visible(Object value) {
		return (Form) this.set("visible", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public Form visibleOn(Object value) {
		return (Form) this.set("visibleOn", value);
	}
	
	/**
	 * 是否初始加载
    */
	public Form initFetch(Object value) {
		return (Form) this.set("initFetch", value);
	}
	
	/**
	 * 提交成功后清空本地缓存
    */
	public Form clearPersistDataAfterSubmit(Object value) {
		return (Form) this.set("clearPersistDataAfterSubmit", value);
	}
	
	/**
	 * 如果是水平排版，这个属性可以细化水平排版的左右宽度占比。
    */
	public Form horizontal(Object value) {
		return (Form) this.set("horizontal", value);
	}
	
	/**
	 * 是否自动将第一个表单元素聚焦。
    */
	public Form autoFocus(Object value) {
		return (Form) this.set("autoFocus", value);
	}
	
	/**
	    */
	public Form name(Object value) {
		return (Form) this.set("name", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Form editorSetting(Object value) {
		return (Form) this.set("editorSetting", value);
	}
	
	/**
	    */
	public Form staticOn(Object value) {
		return (Form) this.set("staticOn", value);
	}
	
	/**
	 * 建议改成 api 的 sendOn 属性。
    */
	public Form initFetchOn(Object value) {
		return (Form) this.set("initFetchOn", value);
	}
	
	/**
	 * 是否固定底下的按钮在底部。
    */
	public Form affixFooter(Object value) {
		return (Form) this.set("affixFooter", value);
	}
	
	/**
	 * 页面离开提示，为了防止页面不小心跳转而导致表单没有保存。
    */
	public Form promptPageLeave(Object value) {
		return (Form) this.set("promptPageLeave", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public Form disabledOn(Object value) {
		return (Form) this.set("disabledOn", value);
	}
	
	/**
	 * 事件动作配置
    */
	public Form onEvent(Object value) {
		return (Form) this.set("onEvent", value);
	}
	
	/**
	 * 组件样式
    */
	public Form style(Object value) {
		return (Form) this.set("style", value);
	}
	
	/**
	 * 提交完后重置表单
    */
	public Form resetAfterSubmit(Object value) {
		return (Form) this.set("resetAfterSubmit", value);
	}
	
	/**
	 * 如果决定结束的字段名不是 `finished` 请设置此属性，比如 `is_success`
    */
	public Form finishedField(Object value) {
		return (Form) this.set("finishedField", value);
	}
	
	/**
	 * 表单项显示为几列
    */
	public Form columnCount(Object value) {
		return (Form) this.set("columnCount", value);
	}
	
	/**
	    */
	public Form reload(Object value) {
		return (Form) this.set("reload", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public Form staticPlaceholder(Object value) {
		return (Form) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 轮询请求的时间间隔，默认为 3秒。设置 asyncApi 才有效
    */
	public Form checkInterval(Object value) {
		return (Form) this.set("checkInterval", value);
	}
	
	/**
	 * Debug面板配置
    */
	public Form debugConfig(Object value) {
		return (Form) this.set("debugConfig", value);
	}
	
	/**
	 * 设置后将轮询调用 initApi
    */
	public Form interval(Object value) {
		return (Form) this.set("interval", value);
	}
	
	/**
	 * 默认表单提交自己会通过发送 api 保存数据，但是也可以设定另外一个 form 的 name 值，或者另外一个 `CRUD` 模型的 name 值。 如果 target 目标是一个 `Form` ，则目标 `Form` 会重新触发 `initApi` 和 `schemaApi`，api 可以拿到当前 form 数据。如果目标是一个 `CRUD` 模型，则目标模型会重新触发搜索，参数为当前 Form 数据。
    */
	public Form target(Object value) {
		return (Form) this.set("target", value);
	}
	
	/**
	 * 是否用 panel 包裹起来
    */
	public Form wrapWithPanel(Object value) {
		return (Form) this.set("wrapWithPanel", value);
	}
	
	/**
	 * label自定义宽度，默认单位为px
    */
	public Form labelWidth(Object value) {
		return (Form) this.set("labelWidth", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Form id(Object value) {
		return (Form) this.set("id", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public Form staticInputClassName(Object value) {
		return (Form) this.set("staticInputClassName", value);
	}
	
	/**
	 * 设置了initAsyncApi以后，默认拉取的时间间隔
    */
	public Form initCheckInterval(Object value) {
		return (Form) this.set("initCheckInterval", value);
	}
	
	/**
	 * 是否开启本地缓存
    */
	public Form persistData(Object value) {
		return (Form) this.set("persistData", value);
	}
	
	/**
	 * 是否隐藏
    */
	public Form hidden(Object value) {
		return (Form) this.set("hidden", value);
	}
	
	/**
	    */
	public Form testIdBuilder(Object value) {
		return (Form) this.set("testIdBuilder", value);
	}
	
	/**
	 * 是否开启调试，开启后会在顶部实时显示表单项数据。
    */
	public Form debug(Object value) {
		return (Form) this.set("debug", value);
	}
	
	/**
	 * Form 用来保存数据的 api。详情：https://aisuda.bce.baidu.com/amis/zh-CN/components/form/index#%E8%A1%A8%E5%8D%95%E6%8F%90%E4%BA%A4
    */
	public Form api(Object value) {
		return (Form) this.set("api", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public Form hiddenOn(Object value) {
		return (Form) this.set("hiddenOn", value);
	}
	
	/**
	 * 按钮集合，会固定在底部显示。
    */
	public Form actions(Object value) {
		return (Form) this.set("actions", value);
	}
	}