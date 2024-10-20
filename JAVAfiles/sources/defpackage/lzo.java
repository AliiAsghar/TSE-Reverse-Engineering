package defpackage;

import android.app.IntentService;
import com.google.android.apps.messaging.shared.NoConfirmationSmsSendService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class lzo extends IntentService implements apxr {
    private volatile apxl a;
    private final Object b;
    private boolean c;

    public lzo() {
        super("com.google.android.apps.messaging.shared.NoConfirmationSmsSendService");
        this.b = new Object();
        this.c = false;
    }

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

    @Override // android.app.IntentService, android.app.Service
    public final void onCreate() {
        if (!this.c) {
            this.c = true;
            ((NoConfirmationSmsSendService) this).a = (rjb) ((kqo) aS()).b.a.ap.b();
        }
        super.onCreate();
    }
}
