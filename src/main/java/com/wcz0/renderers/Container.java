package com.wcz0.renderers;
/**
 * Container 容器渲染器。 文档：https://aisuda.bce.baidu.com/amis/zh-CN/components/container

 * @author wcz0
 * @version 6.2.2
 */
public class Container extends BaseRenderer {

	public Container() {
		this.set("type", "container");
	}

	public Container set(String key, Object value) {
		super.set(key, value);
		return this;
	}

	/**
	 * 是否静态展示表达式
    */
	public Container staticOn(Object value) {
		return (Container) this.set("staticOn", value);
	}
	
	/**
	 * 使用的标签
    */
	public Container wrapperComponent(Object value) {
		return (Container) this.set("wrapperComponent", value);
	}
	
	/**
	 * 是否需要对body加一层div包裹，默认为 true
    */
	public Container wrapperBody(Object value) {
		return (Container) this.set("wrapperBody", value);
	}
	
	/**
	 * 是否显示表达式
    */
	public Container visibleOn(Object value) {
		return (Container) this.set("visibleOn", value);
	}
	
	/**
	 * 组件唯一 id，主要用于日志采集
    */
	public Container id(Object value) {
		return (Container) this.set("id", value);
	}
	
	/**
	 * body 类名
    */
	public Container bodyClassName(Object value) {
		return (Container) this.set("bodyClassName", value);
	}
	
	/**
	 * 是否禁用
    */
	public Container disabled(Object value) {
		return (Container) this.set("disabled", value);
	}
	
	/**
	 * 是否禁用表达式
    */
	public Container disabledOn(Object value) {
		return (Container) this.set("disabledOn", value);
	}
	
	/**
	    */
	public Container staticSchema(Object value) {
		return (Container) this.set("staticSchema", value);
	}
	
	/**
	 * 静态展示表单项Value类名
    */
	public Container staticInputClassName(Object value) {
		return (Container) this.set("staticInputClassName", value);
	}
	
	/**
	 * 指定为 container 类型
    */
	public Container type(Object value) {
		return (Container) this.set("type", value);
	}
	
	/**
	 * 内容
    */
	public Container body(Object value) {
		return (Container) this.set("body", value);
	}
	
	/**
	 * 是否开启容器拖拽
    */
	public Container draggable(Object value) {
		return (Container) this.set("draggable", value);
	}
	
	/**
	 * 静态展示表单项类名
    */
	public Container staticClassName(Object value) {
		return (Container) this.set("staticClassName", value);
	}
	
	/**
	 * 容器 css 类名
    */
	public Container className(Object value) {
		return (Container) this.set("className", value);
	}
	
	/**
	 * 是否隐藏表达式
    */
	public Container hiddenOn(Object value) {
		return (Container) this.set("hiddenOn", value);
	}
	
	/**
	 * 是否开启容器拖拽配置
    */
	public Container draggableConfig(Object value) {
		return (Container) this.set("draggableConfig", value);
	}
	
	/**
	 * 可以组件级别用来关闭移动端样式
    */
	public Container useMobileUI(Object value) {
		return (Container) this.set("useMobileUI", value);
	}
	
	/**
	 * 是否隐藏
    */
	public Container hidden(Object value) {
		return (Container) this.set("hidden", value);
	}
	
	/**
	 * 是否显示
    */
	public Container visible(Object value) {
		return (Container) this.set("visible", value);
	}
	
	/**
	 * 静态展示空值占位
    */
	public Container staticPlaceholder(Object value) {
		return (Container) this.set("staticPlaceholder", value);
	}
	
	/**
	 * 编辑器配置，运行时可以忽略
    */
	public Container editorSetting(Object value) {
		return (Container) this.set("editorSetting", value);
	}
	
	/**
	 * 事件动作配置
    */
	public Container onEvent(Object value) {
		return (Container) this.set("onEvent", value);
	}
	
	/**
	 * 静态展示表单项Label类名
    */
	public Container staticLabelClassName(Object value) {
		return (Container) this.set("staticLabelClassName", value);
	}
	
	/**
	 * 是否静态展示
    */
	public Container static_(Object value) {
		return (Container) this.set("static_", value);
	}
	
	/**
	 * 自定义样式
    */
	public Container style(Object value) {
		return (Container) this.set("style", value);
	}
	}