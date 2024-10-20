package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import defpackage.apxm;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ktx extends aklf implements apxr {
    private ContextWrapper a;
    private final Object ag = new Object();
    private boolean ah = false;
    private boolean d;
    private volatile apxh e;

    private final void a() {
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
        a();
        p();
    }

    @Override // defpackage.apxq
    public final Object aS() {
        return aR().aS();
    }

    protected apxh e() {
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
    public final apxh aR() {
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
