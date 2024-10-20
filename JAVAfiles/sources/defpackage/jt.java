package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewDebug;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jt extends mt {

    @ViewDebug.ExportedProperty
    public boolean a;

    @ViewDebug.ExportedProperty
    public int b;

    @ViewDebug.ExportedProperty
    public int c;

    @ViewDebug.ExportedProperty
    public boolean d;

    @ViewDebug.ExportedProperty
    public boolean e;
    public boolean f;

    public jt() {
        super(-2);
        this.a = false;
    }

    public jt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public jt(jt jtVar) {
        super((ViewGroup.LayoutParams) jtVar);
        this.a = jtVar.a;
    }

    public jt(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }
}
