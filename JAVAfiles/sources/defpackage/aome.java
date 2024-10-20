package defpackage;

import com.google.frameworks.client.data.android.server.tiktok.MainProcessEndpointService;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class aome extends enq implements apxr {
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

    @Override // defpackage.enq, android.app.Service
    public void onCreate() {
        if (!this.c) {
            this.c = true;
            MainProcessEndpointService mainProcessEndpointService = (MainProcessEndpointService) this;
            kqo kqoVar = (kqo) aS();
            mainProcessEndpointService.a = new aolz(kqoVar.a, (ScheduledExecutorService) kqoVar.b.m.b(), (aqsx) kqoVar.b.a.hh.b(), algw.i((List) kqoVar.b.a.hi.b()));
            mainProcessEndpointService.b = (aqwt) kqoVar.b.a.hs.b();
            altg altgVar = altg.a;
        }
        super.onCreate();
    }
}
