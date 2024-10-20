package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import defpackage.apxm;

/* compiled from: PG */
/* loaded from: classes2.dex */
class izb extends cg implements apxr {
    private ContextWrapper a;
    private boolean b;
    private volatile apxh c;
    private final Object d = new Object();

    private void e() {
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
    public void Y(Activity activity) {
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
    public void a() {
        throw null;
    }

    @Override // defpackage.apxq
    public final Object aS() {
        return aR().aS();
    }

    @Override // defpackage.apxr
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
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

    @Override // defpackage.cg
    public void f(Context context) {
        super.f(context);
        e();
        a();
    }

    @Override // defpackage.cg
    public LayoutInflater gl(Bundle bundle) {
        LayoutInflater aD = aD();
        return aD.cloneInContext(new apxm.a(aD, this));
    }

    @Override // defpackage.cg
    public Context x() {
        if (super.x() == null && !this.b) {
            return null;
        }
        e();
        return this.a;
    }
}
