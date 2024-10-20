package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class akne extends aiud implements apxr {
    private apxk p;
    private volatile apxb q;
    private final Object r = new Object();
    public boolean o = false;

    public akne() {
        u(new aazn(this, 5));
    }

    @Override // defpackage.re, defpackage.enb
    public final eov P() {
        return aowt.m(this, super.P());
    }

    @Override // defpackage.apxq
    public final Object aS() {
        return aR().aS();
    }

    protected apxb j() {
        throw null;
    }

    @Override // defpackage.apxr
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final apxb aR() {
        if (this.q == null) {
            synchronized (this.r) {
                if (this.q == null) {
                    this.q = j();
                }
            }
        }
        return this.q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aiud, defpackage.cj, defpackage.re, defpackage.dx, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof apxq) {
            apxk b = aR().b();
            this.p = b;
            if (b.b()) {
                this.p.a = Q();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aiud, defpackage.cj, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        apxk apxkVar = this.p;
        if (apxkVar != null) {
            apxkVar.a();
        }
    }
}
