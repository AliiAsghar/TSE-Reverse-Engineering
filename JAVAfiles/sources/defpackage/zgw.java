package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class zgw extends aitz implements apxr {
    private apxk fb;
    private volatile apxb fc;
    private final Object p = new Object();

    public zgw() {
        u(new zfc(this, 5));
    }

    protected apxb B() {
        return new apxb(this);
    }

    @Override // defpackage.re, defpackage.enb
    public final eov P() {
        return aowt.m(this, super.P());
    }

    @Override // defpackage.apxr
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final apxb aR() {
        if (this.fc == null) {
            synchronized (this.p) {
                if (this.fc == null) {
                    this.fc = B();
                }
            }
        }
        return this.fc;
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
            this.fb = b;
            if (b.b()) {
                this.fb.a = Q();
            }
        }
    }

    @Override // defpackage.aitz, defpackage.ex, defpackage.cj, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        apxk apxkVar = this.fb;
        if (apxkVar != null) {
            apxkVar.a();
        }
    }

    public void y() {
        throw null;
    }
}
