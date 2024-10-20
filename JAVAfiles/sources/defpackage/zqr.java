package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zqr implements View.OnAttachStateChangeListener {
    final /* synthetic */ armf a;
    final /* synthetic */ zqu b;

    public zqr(zqu zquVar, armf armfVar) {
        this.a = armfVar;
        this.b = zquVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ((ykw) this.a.b()).m(this.b.f);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ((ykw) this.a.b()).o(this.b.f);
    }
}
