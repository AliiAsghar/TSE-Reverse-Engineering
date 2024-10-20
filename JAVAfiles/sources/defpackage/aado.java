package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aado extends cj implements apxr {
    private apxk o;
    private volatile apxb p;
    private final Object q = new Object();
    public boolean n = false;

    public aado() {
        u(new zji(this, 6));
    }

    @Override // defpackage.re, defpackage.enb
    public final eov P() {
        return aowt.m(this, super.P());
    }

    @Override // defpackage.apxq
    public final Object aS() {
        return aR().aS();
    }

    @Override // defpackage.apxr
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final apxb aR() {
        if (this.p == null) {
            synchronized (this.q) {
                if (this.p == null) {
                    this.p = k();
                }
            }
        }
        return this.p;
    }

    protected apxb k() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cj, defpackage.re, defpackage.dx, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof apxq) {
            apxk b = aR().b();
            this.o = b;
            if (b.b()) {
                this.o.a = Q();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cj, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        apxk apxkVar = this.o;
        if (apxkVar != null) {
            apxkVar.a();
        }
    }
}
