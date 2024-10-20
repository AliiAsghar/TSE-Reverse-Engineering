package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import defpackage.aklx;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public class yza extends aklf implements apxr {
    private ContextWrapper a;
    private final Object ag = new Object();
    private boolean ah = false;
    private boolean d;
    private volatile aklw e;

    private final void a() {
        if (this.a == null) {
            this.a = new aklx.a(super.x(), this);
            this.d = aowt.q(super.x());
        }
    }

    @Override // defpackage.cg, defpackage.enb
    public final eov P() {
        return akec.t(this, super.P());
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
        a();
        p();
    }

    @Override // defpackage.apxq
    public final Object aS() {
        return aR().aS();
    }

    protected aklw e() {
        throw null;
    }

    @Override // defpackage.aklf, defpackage.cg
    public void f(Context context) {
        super.f(context);
        a();
        p();
    }

    @Override // defpackage.apxr
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final aklw aR() {
        if (this.e == null) {
            synchronized (this.ag) {
                if (this.e == null) {
                    this.e = e();
                }
            }
        }
        return this.e;
    }

    protected final void p() {
        if (!this.ah) {
            this.ah = true;
            aS();
        }
    }

    @Override // defpackage.cg
    public Context x() {
        if (super.x() == null && !this.d) {
            return null;
        }
        a();
        return this.a;
    }
}
