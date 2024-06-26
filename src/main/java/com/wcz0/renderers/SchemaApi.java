package com.wcz0.renderers;
/**

 * @author wcz0
 * @version 6.2.2
 */
public class SchemaApi extends BaseRenderer {

	public SchemaApi() {
		this.set("type", "schemaApi");
	}

	/**
	 * 默认数据映射中的key如果带点，或者带大括号，会转成对象比如：{   'a.b': '123' }经过数据映射后变成 {  a: {   b: '123  } }如果想要关闭此功能，请设置 convertKeyToPath 为 false
    */
	public SchemaApi convertKeyToPath(Object value) {
		return (SchemaApi) this.set("convertKeyToPath", value);
	}
	
	/**
	 * 默认都是追加模式，如果想完全替换把这个配置成 true
    */
	public SchemaApi replaceData(Object value) {
		return (SchemaApi) this.set("replaceData", value);
	}
	
	/**
	 * 当开启自动刷新的时候，默认是 api 的 url 来自动跟踪变量变化的。 如果你希望监控 url 外的变量，请配置 trackExpression。
    */
	public SchemaApi trackExpression(Object value) {
		return (SchemaApi) this.set("trackExpression", value);
	}
	
	/**
	 * API 发送目标地址
    */
	public SchemaApi url(Object value) {
		return (SchemaApi) this.set("url", value);
	}
	
	/**
	 * 如果 method 为 get 的接口，设置了 data 信息。 默认 data 会自动附带在 query 里面发送给后端。如果想通过 body 发送给后端，那么请把这个配置成 false。但是，浏览器还不支持啊，设置了只是摆设。除非服务端支持 method-override
    */
	public SchemaApi attachDataToQuery(Object value) {
		return (SchemaApi) this.set("attachDataToQuery", value);
	}
	
	/**
	 * 如果是文件下载接口，请配置这个。
    */
	public SchemaApi responseType(Object value) {
		return (SchemaApi) this.set("responseType", value);
	}
	
	/**
	 * qs 配置项
    */
	public SchemaApi qsOptions(Object value) {
		return (SchemaApi) this.set("qsOptions", value);
	}
	
	/**
	 * autoFill 是否显示自动填充错误提示
    */
	public SchemaApi silent(Object value) {
		return (SchemaApi) this.set("silent", value);
	}
	
	/**
	 * 文件下载时，指定文件名
    */
	public SchemaApi downloadFileName(Object value) {
		return (SchemaApi) this.set("downloadFileName", value);
	}
	
	/**
	 * API 发送类型
    * 可选值: get | post | put | delete | patch | jsonp | js
    */
	public SchemaApi method(Object value) {
		return (SchemaApi) this.set("method", value);
	}
	
	/**
	 * 用来控制携带数据. 当key 为 `&` 值为 `$$` 时, 将所有原始数据打平设置到 data 中. 当值为 $$ 将所有原始数据赋值到对应的 key 中. 当值为 $ 打头时, 将变量值设置到 key 中.
    */
	public SchemaApi data(Object value) {
		return (SchemaApi) this.set("data", value);
	}
	
	/**
	 * 用来做接口返回的数据映射。
    */
	public SchemaApi responseData(Object value) {
		return (SchemaApi) this.set("responseData", value);
	}
	
	/**
	 * 携带 headers，用法和 data 一样，可以用变量。
    */
	public SchemaApi headers(Object value) {
		return (SchemaApi) this.set("headers", value);
	}
	
	/**
	 * 设置发送条件
    */
	public SchemaApi sendOn(Object value) {
		return (SchemaApi) this.set("sendOn", value);
	}
	
	/**
	 * 如果设置了值，同一个接口，相同参数，指定的时间（单位：ms）内请求将直接走缓存。
    */
	public SchemaApi cache(Object value) {
		return (SchemaApi) this.set("cache", value);
	}
	
	/**
	 * 强制将数据附加在 query，默认只有 api 地址中没有用变量的时候 crud 查询接口才会 自动附加数据到 query 部分，如果想强制附加请设置这个属性。 对于那种临时加了个变量但是又不想全部参数写一遍的时候配置很有用。
    */
	public SchemaApi forceAppendDataToQuery(Object value) {
		return (SchemaApi) this.set("forceAppendDataToQuery", value);
	}
	
	/**
	 * 发送体的格式
    * 可选值: json | form-data | form
    */
	public SchemaApi dataType(Object value) {
		return (SchemaApi) this.set("dataType", value);
	}
	
	/**
	 * 是否自动刷新，当 url 中的取值结果变化时，自动刷新数据。
    */
	public SchemaApi autoRefresh(Object value) {
		return (SchemaApi) this.set("autoRefresh", value);
	}
	}