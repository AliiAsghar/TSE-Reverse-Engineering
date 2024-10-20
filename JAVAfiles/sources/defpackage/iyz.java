package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.apxm;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public class iyz extends izm {
    private ContextWrapper a;
    private boolean b;
    private boolean c = false;

    private final void e() {
        if (this.a == null) {
            this.a = new apxm.a(super.x(), this);
            this.b = aowt.q(super.x());
        }
    }

    @Override // defpackage.izb, defpackage.cg
    public final void Y(Activity activity) {
        super.Y(activity);
        ContextWrapper contextWrapper = this.a;
        boolean z = true;
        if (contextWrapper != null && apxh.d(contextWrapper) != activity) {
            z = false;
        }
        apzj.g(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        e();
        a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.izb
    public final void a() {
        if (!this.c) {
            this.c = true;
            izk izkVar = (izk) this;
            kqm kqmVar = (kqm) aS();
            izkVar.d = kqmVar.A();
            izkVar.c = kqmVar.z();
            izkVar.b = kqmVar.y();
            izkVar.a = kqmVar.a.dd;
        }
    }

    @Override // defpackage.izb, defpackage.cg
    public final void f(Context context) {
        super.f(context);
        e();
        a();
    }

    @Override // defpackage.izb, defpackage.cg
    public final LayoutInflater gl(Bundle bundle) {
        LayoutInflater gl = super.gl(bundle);
        return gl.cloneInContext(new apxm.a(gl, this));
    }

    @Override // defpackage.izb, defpackage.cg
    public final Context x() {
        if (super.x() == null && !this.b) {
            return null;
        }
        e();
        return this.a;
    }
}
