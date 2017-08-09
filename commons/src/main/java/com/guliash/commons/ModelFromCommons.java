package com.guliash.commons;

import android.os.Parcelable;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class ModelFromCommons implements Parcelable {

    public abstract int cint();

    public abstract String cString();

    public static ModelFromCommons create(int cint, String cString) {
        return new AutoValue_ModelFromCommons(cint, cString);
    }

}
