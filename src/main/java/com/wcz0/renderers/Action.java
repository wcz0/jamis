package com.wcz0.renderers;

public class Action extends BaseRenderer{
    public Action() {
        this.set("type", "action");
    }

    public Action actionType(String value) {
        return (Action) this.set("actionType", value);
    }
}
