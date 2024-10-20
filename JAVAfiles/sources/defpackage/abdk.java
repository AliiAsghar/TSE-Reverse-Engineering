package defpackage;

import com.google.android.apps.messaging.wearable.WearableBindService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class abdk extends acko implements apxr {
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

    @Override // defpackage.acko, android.app.Service
    public void onCreate() {
        if (!this.c) {
            this.c = true;
            WearableBindService wearableBindService = (WearableBindService) this;
            kqo kqoVar = (kqo) aS();
            krv krvVar = kqoVar.b;
            wearableBindService.c = krvVar.n;
            krx krxVar = krvVar.a;
            wearableBindService.d = krxVar.ho;
            wearableBindService.e = krvVar.yr;
            wearableBindService.f = krvVar.Ch;
            wearableBindService.g = krvVar.uB;
            wearableBindService.h = krvVar.Ci;
            wearableBindService.i = krvVar.ll;
            wearableBindService.j = krvVar.bU;
            wearableBindService.k = krvVar.si;
            wearableBindService.l = krvVar.ne;
            wearableBindService.m = krxVar.hp;
            wearableBindService.n = krvVar.oY;
            wearableBindService.o = krxVar.l;
            wearableBindService.p = krvVar.bV;
            wearableBindService.q = krvVar.at;
            wearableBindService.r = krxVar.bH;
            wearableBindService.s = krxVar.bI;
            wearableBindService.t = krvVar.bB;
            wearableBindService.u = krvVar.m;
            wearableBindService.v = krvVar.z;
            wearableBindService.w = krvVar.ay;
            wearableBindService.x = krvVar.dd;
            wearableBindService.y = krvVar.ld;
            wearableBindService.z = krvVar.yj;
            wearableBindService.A = kqoVar.n;
            apya apyaVar = kqoVar.o;
            wearableBindService.B = krvVar.xC;
            wearableBindService.C = krvVar.yk;
            wearableBindService.D = krxVar.hq;
            wearableBindService.E = krxVar.hr;
        }
        super.onCreate();
    }
}
