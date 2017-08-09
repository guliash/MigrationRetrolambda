package com.guliash.migrationto3;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class ModelFromApp {

    public abstract int bInt();

    public abstract String bString();

    public static ModelFromApp create(int bint, String bstring) {
        return new AutoValue_ModelFromApp(bint, bstring);
    }

}
