package com.pavlyshyn;

public abstract class Train {
    protected Locomotive locomotive;

    public Train(Locomotive locomotive) {
        this.locomotive = locomotive;
    }
}
