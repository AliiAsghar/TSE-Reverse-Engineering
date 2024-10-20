package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.apxm;
import j$.util.Optional;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class zio extends lzh implements apxr {
    private ContextWrapper aj;
    private boolean ak;
    private volatile apxh al;
    private final Object an = new Object();
    private boolean ao = false;

    private final void aT() {
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
        aT();
        aQ();
    }

    @Override // defpackage.apxr
    /* renamed from: aP, reason: merged with bridge method [inline-methods] */
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

    protected final void aQ() {
        if (!this.ao) {
            this.ao = true;
            zii ziiVar = (zii) this;
            krv krvVar = ((kqm) aS()).a;
            ziiVar.aj = (Optional) ((apxx) krvVar.oE).a;
            ziiVar.ak = (mho) krvVar.gD.b();
            ziiVar.al = Optional.empty();
        }
    }

    @Override // defpackage.apxq
    public final Object aS() {
        return aR().aS();
    }

    @Override // defpackage.cg
    public final void f(Context context) {
        super.f(context);
        aT();
        aQ();
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
        aT();
        return this.aj;
    }
}
