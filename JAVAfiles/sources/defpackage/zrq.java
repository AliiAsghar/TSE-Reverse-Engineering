package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import defpackage.apxm;

/* compiled from: PG */
/* loaded from: classes2.dex */
class zrq extends aklf implements apxr {
    private ContextWrapper a;
    private final Object ag = new Object();
    private boolean ah = false;
    private boolean d;
    private volatile apxh e;

    private final void o() {
        if (this.a == null) {
            this.a = new apxm.a(super.x(), this);
            this.d = aowt.q(super.x());
        }
    }

    @Override // defpackage.cg, defpackage.enb
    public final eov P() {
        return aowt.n(this, super.P());
    }

    @Override // defpackage.aiuc, defpackage.cg
    public void Y(Activity activity) {
        super.Y(activity);
        ContextWrapper contextWrapper = this.a;
        boolean z = true;
        if (contextWrapper != null && apxh.d(contextWrapper) != activity) {
            z = false;
        }
        apzj.g(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o();
        e();
    }

    @Override // defpackage.apxr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final apxh aR() {
        if (this.e == null) {
            synchronized (this.ag) {
                if (this.e == null) {
                    this.e = d();
                }
            }
        }
        return this.e;
    }

    @Override // defpackage.apxq
    public final Object aS() {
        return aR().aS();
    }

    protected apxh d() {
        throw null;
    }

    protected final void e() {
        if (!this.ah) {
            this.ah = true;
            aS();
        }
    }

    @Override // defpackage.aklf, defpackage.cg
    public void f(Context context) {
        super.f(context);
        o();
        e();
    }

    @Override // defpackage.cg
    public Context x() {
        if (super.x() == null && !this.d) {
            return null;
        }
        o();
        return this.a;
    }
}
