package defpackage;

import android.app.Service;
import com.google.android.apps.messaging.diagnostics.DiagnosticsService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class kna extends Service implements apxr {
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
    public void onCreate() {
        if (!this.c) {
            this.c = true;
            ((DiagnosticsService) this).a = (via) ((kqo) aS()).b.mt.b();
        }
        super.onCreate();
    }
}
