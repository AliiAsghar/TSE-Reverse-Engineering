package defpackage;

import com.google.android.apps.messaging.go.BugleGo_Application;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ksh extends kqf {
    private boolean x = false;
    private final apxg y = new apxg(new qdq(this, null));

    @Override // defpackage.aklb, defpackage.apxr
    public final /* synthetic */ apxq aR() {
        return this.y;
    }

    @Override // defpackage.aklb
    public final apxg c() {
        return this.y;
    }

    @Override // defpackage.kqg, defpackage.iaz, defpackage.ngr, defpackage.aklc, android.app.Application
    public void onCreate() {
        if (!this.x) {
            this.x = true;
            BugleGo_Application bugleGo_Application = (BugleGo_Application) this;
            krx krxVar = ((krv) aS()).b.a;
            bugleGo_Application.v = (aksr) krxVar.a.at.b();
            bugleGo_Application.w = krxVar.j;
            bugleGo_Application.f = krxVar.p;
            krv krvVar = krxVar.a;
            bugleGo_Application.g = krvVar.ez;
            bugleGo_Application.h = krxVar.r;
            bugleGo_Application.i = krvVar.pn;
            bugleGo_Application.j = krvVar.z;
            bugleGo_Application.k = krxVar.s;
            bugleGo_Application.l = krvVar.mq;
            bugleGo_Application.m = krvVar.ay;
            bugleGo_Application.n = (aksr) krvVar.at.b();
            bugleGo_Application.o = krxVar.Q;
            krv krvVar2 = krxVar.a;
            bugleGo_Application.p = krvVar2.bD;
            bugleGo_Application.q = krxVar.R;
            bugleGo_Application.r = (ocs) krvVar2.qY.b();
            krv krvVar3 = krxVar.a;
            apya apyaVar = krvVar3.bN;
            bugleGo_Application.s = new nlr(apyaVar);
            bugleGo_Application.t = krxVar.M();
            bugleGo_Application.u = new nlm(apyaVar);
            ((iaz) bugleGo_Application).a = krxVar.S;
            bugleGo_Application.b = krvVar3.ef;
        }
        super.onCreate();
    }
}
