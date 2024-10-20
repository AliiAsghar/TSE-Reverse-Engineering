package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.apxm;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class zil extends lzh implements apxr {
    private ContextWrapper aj;
    private boolean ak;
    private volatile apxh al;
    private final Object an = new Object();
    private boolean ao = false;

    private final void aP() {
        if (this.aj == null) {
            this.aj = new apxm.a(super.x(), this);
            this.ak = aowt.q(super.x());
        }
    }

    @Override // defpackage.cg, defpackage.enb
    public final eov P() {
        return aowt.n(this, super.P());
    }

    @Override // defpackage.aiua, defpackage.cg
    public final void Y(Activity activity) {
        super.Y(activity);
        ContextWrapper contextWrapper = this.aj;
        boolean z = true;
        if (contextWrapper != null && apxh.d(contextWrapper) != activity) {
            z = false;
        }
        apzj.g(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        aP();
        aT();
    }

    @Override // defpackage.apxr
    /* renamed from: aQ, reason: merged with bridge method [inline-methods] */
    public final apxh aR() {
        if (this.al == null) {
            synchronized (this.an) {
                if (this.al == null) {
                    this.al = new apxh(this);
                }
            }
        }
        return this.al;
    }

    @Override // defpackage.apxq
    public final Object aS() {
        return aR().aS();
    }

    protected final void aT() {
        if (!this.ao) {
            this.ao = true;
            kqm kqmVar = (kqm) aS();
            ((zhe) this).aj = (yfu) kqmVar.a.a.cM.b();
        }
    }

    @Override // defpackage.cg
    public final void f(Context context) {
        super.f(context);
        aP();
        aT();
    }

    @Override // defpackage.cg
    public final LayoutInflater gl(Bundle bundle) {
        LayoutInflater aD = aD();
        return aD.cloneInContext(new apxm.a(aD, this));
    }

    @Override // defpackage.cg
    public final Context x() {
        if (super.x() == null && !this.ak) {
            return null;
        }
        aP();
        return this.aj;
    }
}
