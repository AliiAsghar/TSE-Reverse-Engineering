package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class abex extends aitz implements apxr {
    private apxk o;
    private volatile apxb p;
    private final Object q = new Object();
    public boolean n = false;

    public abex() {
        u(new aazn(this, 4));
    }

    @Override // defpackage.re, defpackage.enb
    public final eov P() {
        return aowt.m(this, super.P());
    }

    @Override // defpackage.apxq
    public final Object aS() {
        return aR().aS();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aitz, defpackage.cj, defpackage.re, defpackage.dx, android.app.Activity
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
    @Override // defpackage.aitz, defpackage.ex, defpackage.cj, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        apxk apxkVar = this.o;
        if (apxkVar != null) {
            apxkVar.a();
        }
    }

    @Override // defpackage.apxr
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final apxb aR() {
        if (this.p == null) {
            synchronized (this.q) {
                if (this.p == null) {
                    this.p = z();
                }
            }
        }
        return this.p;
    }

    protected apxb z() {
        throw null;
    }
}
