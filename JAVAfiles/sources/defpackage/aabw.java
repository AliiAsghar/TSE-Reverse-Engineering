package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.apxm;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aabw extends bw implements apxr {
    private ContextWrapper ag;
    private boolean ah;
    private volatile apxh ai;
    private final Object aj = new Object();
    private boolean ak = false;

    private final void aO() {
        if (this.ag == null) {
            this.ag = new apxm.a(super.x(), this);
            this.ah = aowt.q(super.x());
        }
    }

    @Override // defpackage.cg, defpackage.enb
    public final eov P() {
        return aowt.n(this, super.P());
    }

    @Override // defpackage.cg
    public final void Y(Activity activity) {
        super.Y(activity);
        ContextWrapper contextWrapper = this.ag;
        boolean z = true;
        if (contextWrapper != null && apxh.d(contextWrapper) != activity) {
            z = false;
        }
        apzj.g(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        aO();
        aN();
    }

    @Override // defpackage.apxr
    /* renamed from: aM, reason: merged with bridge method [inline-methods] */
    public final apxh aR() {
        if (this.ai == null) {
            synchronized (this.aj) {
                if (this.ai == null) {
                    this.ai = new apxh(this);
                }
            }
        }
        return this.ai;
    }

    protected final void aN() {
        if (!this.ak) {
            this.ak = true;
            aabi aabiVar = (aabi) this;
            kqm kqmVar = (kqm) aS();
            aabiVar.ag = (xbi) kqmVar.a.hC.b();
            aabiVar.ah = (xnv) kqmVar.a.bV.b();
            aabiVar.ai = (ksm) kqmVar.a.a.fP.b();
            aabiVar.aj = kqmVar.a.at;
        }
    }

    @Override // defpackage.apxq
    public final Object aS() {
        return aR().aS();
    }

    @Override // defpackage.bw, defpackage.cg
    public final void f(Context context) {
        super.f(context);
        aO();
        aN();
    }

    @Override // defpackage.bw, defpackage.cg
    public final LayoutInflater gl(Bundle bundle) {
        LayoutInflater gl = super.gl(bundle);
        return gl.cloneInContext(new apxm.a(gl, this));
    }

    @Override // defpackage.cg
    public final Context x() {
        if (super.x() == null && !this.ah) {
            return null;
        }
        aO();
        return this.ag;
    }
}
