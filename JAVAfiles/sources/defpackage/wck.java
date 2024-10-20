package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class wck implements aqrn {
    public /* synthetic */ void b(wbg wbgVar, arlq arlqVar) {
        throw null;
    }

    public /* synthetic */ void c(wbn wbnVar, arlq arlqVar) {
        throw null;
    }

    public /* synthetic */ void d(wdd wddVar, arlq arlqVar) {
        throw null;
    }

    public /* synthetic */ void e(wdn wdnVar, arlq arlqVar) {
        throw null;
    }

    public /* synthetic */ void f(wdr wdrVar, arlq arlqVar) {
        throw null;
    }

    public /* synthetic */ void g(wdx wdxVar, arlq arlqVar) {
        throw null;
    }

    public /* synthetic */ void h(web webVar, arlq arlqVar) {
        throw null;
    }

    public /* synthetic */ void i() {
        throw null;
    }

    @Override // defpackage.aqrn
    public final asmb n() {
        aqvw aqvwVar = wcm.a;
        if (aqvwVar == null) {
            synchronized (wcm.class) {
                aqvwVar = wcm.a;
                if (aqvwVar == null) {
                    asmb asmbVar = new asmb("bugle.smapi.rcs.MessagingEngineService", (byte[]) null);
                    asmbVar.o(wcm.f());
                    asmbVar.o(wcm.e());
                    asmbVar.o(wcm.d());
                    asmbVar.o(wcm.b());
                    asmbVar.o(wcm.a());
                    asmbVar.o(wcm.c());
                    asmbVar.o(wcm.h());
                    asmbVar.o(wcm.g());
                    aqvwVar = new aqvw(asmbVar);
                    wcm.a = aqvwVar;
                }
            }
        }
        HashMap hashMap = new HashMap();
        aqux f = wcm.f();
        arlp arlpVar = new arlp(new wcl(this, 0, 0));
        String str = aqvwVar.a;
        aqae.t(f, arlpVar, str, aqvwVar, hashMap);
        aqae.t(wcm.e(), new arlp(new wcl(this, 1, 0)), str, aqvwVar, hashMap);
        aqae.t(wcm.d(), new arlp(new wcl(this, 2, 0)), str, aqvwVar, hashMap);
        aqae.t(wcm.b(), new arlp(new wcl(this, 3, 0)), str, aqvwVar, hashMap);
        aqae.t(wcm.a(), new arlp(new wcl(this, 4, 0)), str, aqvwVar, hashMap);
        aqae.t(wcm.c(), new arlp(new wcl(this, 5, 0)), str, aqvwVar, hashMap);
        aqae.t(wcm.h(), new arlp(new wcl(this, 6, 0)), str, aqvwVar, hashMap);
        aqae.t(wcm.g(), new arlp(new wcl(this, 7, 0)), str, aqvwVar, hashMap);
        return aqae.u(str, aqvwVar, hashMap);
    }
}
