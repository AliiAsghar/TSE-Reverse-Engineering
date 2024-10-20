package defpackage;

import android.app.Service;
import com.google.android.apps.messaging.rcsmigration.RcsMigrationService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class lsh extends Service implements apxr {
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
            RcsMigrationService rcsMigrationService = (RcsMigrationService) this;
            krv krvVar = ((kqo) aS()).b;
            rcsMigrationService.a = krvVar.a.hk;
            rcsMigrationService.b = krvVar.at;
        }
        super.onCreate();
    }
}
