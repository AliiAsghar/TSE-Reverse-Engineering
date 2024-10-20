package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import defpackage.apxm;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public class aaif extends akle implements apxr {
    private ContextWrapper b;
    private boolean c;
    private volatile apxh d;
    private final Object e = new Object();
    private boolean ag = false;

    private final void o() {
        if (this.b == null) {
            this.b = new apxm.a(super.x(), this);
            this.c = aowt.q(super.x());
        }
    }

    @Override // defpackage.cg, defpackage.enb
    public final eov P() {
        return aowt.n(this, super.P());
    }

    @Override // defpackage.cg
    public void Y(Activity activity) {
        super.Y(activity);
        ContextWrapper contextWrapper = this.b;
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
        if (this.d == null) {
            synchronized (this.e) {
                if (this.d == null) {
                    this.d = d();
                }
            }
        }
        return this.d;
    }

    @Override // defpackage.apxq
    public final Object aS() {
        return aR().aS();
    }

    protected apxh d() {
        throw null;
    }

    protected final void e() {
        if (!this.ag) {
            this.ag = true;
            aS();
        }
    }

    @Override // defpackage.akle, defpackage.cg
    public void f(Context context) {
        super.f(context);
        o();
        e();
    }

    @Override // defpackage.cg
    public Context x() {
        if (super.x() == null && !this.c) {
            return null;
        }
        o();
        return this.b;
    }
}
