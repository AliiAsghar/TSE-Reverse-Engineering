package defpackage;

import android.app.Service;
import android.content.Context;
import android.util.Log;
import com.google.android.apps.messaging.backup.g1.GoogleOneRestoreService;
import com.google.android.libraries.subscriptions.restore.G1Restore;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class idr extends Service implements apxr {
    private volatile apxl a;
    private final Object b = new Object();
    private boolean c = false;

    @Override // defpackage.apxr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final apxl aR() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = new apxl(this);
                }
            }
        }
        return this.a;
    }

    @Override // defpackage.apxq
    public final Object aS() {
        return aR().aS();
    }

    @Override // android.app.Service
    public final void onCreate() {
        if (!this.c) {
            this.c = true;
            GoogleOneRestoreService googleOneRestoreService = (GoogleOneRestoreService) this;
            kqo kqoVar = (kqo) aS();
            krx krxVar = kqoVar.b.a;
            Context context = (Context) krxVar.a.n.b();
            final abqq c = abqq.c((Context) krxVar.a.n.b());
            c.getClass();
            googleOneRestoreService.b = new G1Restore(context, new aiyh() { // from class: aiyi
                @Override // defpackage.aiyh
                public final void a(int i) {
                    abqq abqqVar = abqq.this;
                    try {
                        abqqVar.b(i).c();
                    } catch (SecurityException e) {
                        abqqVar.b(i).c();
                        Log.e("GoogleSignatureVerifier", "flaky result", e);
                    }
                }
            }, (aiyg) algw.i(new idp()).c(new abnl(13)));
            googleOneRestoreService.c = (mbl) kqoVar.b.bB.b();
            googleOneRestoreService.d = kqoVar.b.ko;
        }
        super.onCreate();
    }
}
