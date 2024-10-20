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
public class aaba extends cg implements apxr {
    private ContextWrapper a;
    private boolean b;
    private volatile apxh c;
    private final Object d = new Object();
    private boolean e = false;

    private final void a() {
        if (this.a == null) {
            this.a = new apxm.a(super.x(), this);
            this.b = aowt.q(super.x());
        }
    }

    @Override // defpackage.cg, defpackage.enb
    public final eov P() {
        return aowt.n(this, super.P());
    }

    @Override // defpackage.cg
    public final void Y(Activity activity) {
        super.Y(activity);
        ContextWrapper contextWrapper = this.a;
        boolean z = true;
        if (contextWrapper != null && apxh.d(contextWrapper) != activity) {
            z = false;
        }
        apzj.g(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        a();
        aN();
    }

    @Override // defpackage.apxr
    /* renamed from: aM, reason: merged with bridge method [inline-methods] */
    public final apxh aR() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = new apxh(this);
                }
            }
        }
        return this.c;
    }

    protected final void aN() {
        if (!this.e) {
            this.e = true;
            aaal aaalVar = (aaal) this;
            kqm kqmVar = (kqm) aS();
            aaalVar.a = (xnv) kqmVar.a.bV.b();
            aaalVar.ag = (zxy) kqmVar.a.a.cC.b();
            aaalVar.b = (ydc) kqmVar.a.dU.b();
            aaalVar.c = (mho) kqmVar.a.gD.b();
            aaalVar.e = (aabd) kqmVar.a.a.cB.b();
            aaalVar.d = (aaak) kqmVar.ay.b();
        }
    }

    @Override // defpackage.apxq
    public final Object aS() {
        return aR().aS();
    }

    @Override // defpackage.cg
    public final void f(Context context) {
        super.f(context);
        a();
        aN();
    }

    @Override // defpackage.cg
    public final LayoutInflater gl(Bundle bundle) {
        LayoutInflater aD = aD();
        return aD.cloneInContext(new apxm.a(aD, this));
    }

    @Override // defpackage.cg
    public final Context x() {
        if (super.x() == null && !this.b) {
            return null;
        }
        a();
        return this.a;
    }
}
