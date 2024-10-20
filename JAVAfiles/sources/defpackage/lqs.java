package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import defpackage.apxm;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class lqs extends lzh implements apxr {
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
    public void Y(Activity activity) {
        super.Y(activity);
        ContextWrapper contextWrapper = this.aj;
        boolean z = true;
        if (contextWrapper != null && apxh.d(contextWrapper) != activity) {
            z = false;
        }
        apzj.g(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        aP();
        aV();
    }

    protected apxh aQ() {
        throw null;
    }

    @Override // defpackage.apxq
    public final Object aS() {
        return aR().aS();
    }

    @Override // defpackage.apxr
    /* renamed from: aT, reason: merged with bridge method [inline-methods] */
    public final apxh aR() {
        if (this.al == null) {
            synchronized (this.an) {
                if (this.al == null) {
                    this.al = aQ();
                }
            }
        }
        return this.al;
    }

    protected final void aV() {
        if (!this.ao) {
            this.ao = true;
            aS();
        }
    }

    @Override // defpackage.cg
    public void f(Context context) {
        super.f(context);
        aP();
        aV();
    }

    @Override // defpackage.cg
    public Context x() {
        if (super.x() == null && !this.ak) {
            return null;
        }
        aP();
        return this.aj;
    }
}
