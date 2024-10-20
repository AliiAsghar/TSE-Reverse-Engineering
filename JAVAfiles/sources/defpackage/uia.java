package defpackage;

import android.app.Service;
import com.google.android.apps.messaging.shared.datamodel.resizing.ResizingService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class uia extends Service implements apxr {
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
            ResizingService resizingService = (ResizingService) this;
            kqo kqoVar = (kqo) aS();
            resizingService.b = (via) kqoVar.b.mt.b();
            resizingService.c = (uih) kqoVar.b.Af.b();
            resizingService.d = (aksr) kqoVar.b.at.b();
        }
        super.onCreate();
    }
}
