package com.guliash.models;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class ModelFromModels {
    public abstract int a();

    public abstract String b();

    public static ModelFromModels create(int a, String b) {
        return new AutoValue_ModelFromModels(a, b);
    }

}
