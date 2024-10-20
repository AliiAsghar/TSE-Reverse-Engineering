package defpackage;

import com.google.android.apps.messaging.shared.fcm.impl.BugleFirebaseMessagingService;
import com.google.firebase.messaging.FirebaseMessagingService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class uuw extends FirebaseMessagingService implements apxr {
    private volatile apxl a;
    private final Object b = new Object();
    private boolean c = false;

    @Override // defpackage.apxq
    public final Object aS() {
        return aR().aS();
    }

    @Override // defpackage.apxr
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
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

    @Override // android.app.Service
    public final void onCreate() {
        if (!this.c) {
            this.c = true;
            BugleFirebaseMessagingService bugleFirebaseMessagingService = (BugleFirebaseMessagingService) this;
            kqo kqoVar = (kqo) aS();
            krx krxVar = kqoVar.b.a;
            bugleFirebaseMessagingService.a = alor.n("prewarm", krxVar.hm, "", kqoVar.h, "check_tickle_connection", kqoVar.l);
            bugleFirebaseMessagingService.b = (mbl) kqoVar.b.bB.b();
            bugleFirebaseMessagingService.c = (aksr) kqoVar.b.at.b();
            krv krvVar = kqoVar.b;
            bugleFirebaseMessagingService.d = krvVar.bY;
            krv krvVar2 = kqoVar.b;
            bugleFirebaseMessagingService.e = krvVar2.dF;
            bugleFirebaseMessagingService.f = krvVar2.a.hn;
            bugleFirebaseMessagingService.g = krvVar2.ih;
        }
        super.onCreate();
    }
}
