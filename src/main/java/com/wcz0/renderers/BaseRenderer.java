package com.wcz0.renderers;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.annotation.JSONField;

import java.util.HashMap;
import java.util.Map;
/**
 * @author: wcz0
 */
public class BaseRenderer {
    @JSONField(serialize = false)
    public String type;
    public Map<String, Object> amisSchema = new HashMap<>();

    public static BaseRenderer make() {
        return new BaseRenderer();
    }

    public BaseRenderer set(String name, Object value) {
        if ("map".equals(name) && value instanceof Map) {
            Map mapValue = (Map) value;
            if (mapValue.keySet().equals(mapValue.values())) {
                value = new HashMap<>(mapValue);
            }
        }

        this.amisSchema.put(name, value);

        return this;
    }

    public String toJson() {
        return JSON.toJSONString(this.amisSchema);
    }

    public Map<String, Object> toArray() {
        return this.amisSchema;
    }
}
