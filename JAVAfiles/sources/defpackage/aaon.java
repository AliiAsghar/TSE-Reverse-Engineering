package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.apxm;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aaon extends aiub implements apxr {
    private ContextWrapper ah;
    private boolean ai;
    private volatile apxh aj;
    private final Object ak = new Object();
    private boolean al = false;

    private final void aM() {
        if (this.ah == null) {
            this.ah = new apxm.a(super.x(), this);
            this.ai = aowt.q(super.x());
        }
    }

    @Override // defpackage.cg, defpackage.enb
    public final eov P() {
        return aowt.n(this, super.P());
    }

    @Override // defpackage.aiub, defpackage.cg
    public void Y(Activity activity) {
        super.Y(activity);
        ContextWrapper contextWrapper = this.ah;
        boolean z = true;
        if (contextWrapper != null && apxh.d(contextWrapper) != activity) {
            z = false;
        }
        apzj.g(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        aM();
        aP();
    }

    protected apxh aN() {
        throw null;
    }

    @Override // defpackage.apxr
    /* renamed from: aO, reason: merged with bridge method [inline-methods] */
    public final apxh aR() {
        if (this.aj == null) {
            synchronized (this.ak) {
                if (this.aj == null) {
                    this.aj = aN();
                }
            }
        }
        return this.aj;
    }

    protected final void aP() {
        if (!this.al) {
            this.al = true;
            aS();
        }
    }

    @Override // defpackage.apxq
    public final Object aS() {
        return aR().aS();
    }

    @Override // defpackage.bw, defpackage.cg
    public void f(Context context) {
        super.f(context);
        aM();
        aP();
    }

    @Override // defpackage.bw, defpackage.cg
    public LayoutInflater gl(Bundle bundle) {
        LayoutInflater gl = super.gl(bundle);
        return gl.cloneInContext(new apxm.a(gl, this));
    }

    @Override // defpackage.cg
    public Context x() {
        if (super.x() == null && !this.ai) {
            return null;
        }
        aM();
        return this.ah;
    }
}
