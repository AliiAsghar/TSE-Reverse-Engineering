package defpackage;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ekm implements TransformationMethod {
    private final TransformationMethod a;

    public ekm(TransformationMethod transformationMethod) {
        this.a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        CharSequence transformation = this.a.getTransformation(charSequence, view);
        if (transformation != null && ejx.b().a() == 1) {
            return ejx.b().c(transformation);
        }
        return transformation;
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        this.a.onFocusChanged(view, charSequence, z, i, rect);
    }
}
