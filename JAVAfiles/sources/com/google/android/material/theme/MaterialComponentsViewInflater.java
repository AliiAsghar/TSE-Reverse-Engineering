package com.google.android.material.theme;

import android.content.Context;
import android.support.v7.app.AppCompatViewInflater;
import android.support.v7.widget.AppCompatCheckBox;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import defpackage.ajfq;
import defpackage.ajjt;
import defpackage.ajnh;
import defpackage.ajnp;
import defpackage.kh;
import defpackage.kj;
import defpackage.ks;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class MaterialComponentsViewInflater extends AppCompatViewInflater {
    @Override // android.support.v7.app.AppCompatViewInflater
    public final kh a(Context context, AttributeSet attributeSet) {
        return new ajnh(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    public final kj b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    public final AppCompatCheckBox c(Context context, AttributeSet attributeSet) {
        return new ajfq(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    public final ks d(Context context, AttributeSet attributeSet) {
        return new ajjt(context, attributeSet);
    }

    @Override // android.support.v7.app.AppCompatViewInflater
    public final AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new ajnp(context, attributeSet);
    }
}
