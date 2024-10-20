package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class wcg implements aqrn {
    public /* synthetic */ void c(wbe wbeVar, arlq arlqVar) {
        throw null;
    }

    public /* synthetic */ void d(wbl wblVar, arlq arlqVar) {
        throw null;
    }

    public /* synthetic */ void e(wct wctVar, arlq arlqVar) {
        throw null;
    }

    public /* synthetic */ void f(wcv wcvVar, arlq arlqVar) {
        throw null;
    }

    public /* synthetic */ void g(wdb wdbVar, arlq arlqVar) {
        throw null;
    }

    public /* synthetic */ void h(wdh wdhVar, arlq arlqVar) {
        throw null;
    }

    public /* synthetic */ void i(wdl wdlVar, arlq arlqVar) {
        throw null;
    }

    public /* synthetic */ void j(wdp wdpVar, arlq arlqVar) {
        throw null;
    }

    public /* synthetic */ void k(wdv wdvVar, arlq arlqVar) {
        throw null;
    }

    public /* synthetic */ void l(wdz wdzVar, arlq arlqVar) {
        throw null;
    }

    @Override // defpackage.aqrn
    public final asmb n() {
        aqvw aqvwVar = wch.a;
        if (aqvwVar == null) {
            synchronized (wch.class) {
                aqvwVar = wch.a;
                if (aqvwVar == null) {
                    asmb asmbVar = new asmb("bugle.smapi.rcs.MessagingEngineNotificationService", (byte[]) null);
                    asmbVar.o(wch.d());
                    asmbVar.o(wch.c());
                    asmbVar.o(wch.h());
                    asmbVar.o(wch.g());
                    asmbVar.o(wch.f());
                    asmbVar.o(wch.b());
                    asmbVar.o(wch.a());
                    asmbVar.o(wch.e());
                    asmbVar.o(wch.j());
                    asmbVar.o(wch.i());
                    aqvwVar = new aqvw(asmbVar);
                    wch.a = aqvwVar;
                }
            }
        }
        HashMap hashMap = new HashMap();
        aqux d = wch.d();
        arlp arlpVar = new arlp(new wcl(this, 0, 1));
        String str = aqvwVar.a;
        aqae.t(d, arlpVar, str, aqvwVar, hashMap);
        aqae.t(wch.c(), new arlp(new wcl(this, 1, 1)), str, aqvwVar, hashMap);
        aqae.t(wch.h(), new arlp(new wcl(this, 2, 1)), str, aqvwVar, hashMap);
        aqae.t(wch.g(), new arlp(new wcl(this, 3, 1)), str, aqvwVar, hashMap);
        aqae.t(wch.f(), new arlp(new wcl(this, 4, 1)), str, aqvwVar, hashMap);
        aqae.t(wch.b(), new arlp(new wcl(this, 5, 1)), str, aqvwVar, hashMap);
        aqae.t(wch.a(), new arlp(new wcl(this, 6, 1)), str, aqvwVar, hashMap);
        aqae.t(wch.e(), new arlp(new wcl(this, 7, 1)), str, aqvwVar, hashMap);
        aqae.t(wch.j(), new arlp(new wcl(this, 8, 1)), str, aqvwVar, hashMap);
        aqae.t(wch.i(), new arlp(new wcl(this, 9, 1)), str, aqvwVar, hashMap);
        return aqae.u(str, aqvwVar, hashMap);
    }
}
