package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class abmq implements aqrn {
    public /* synthetic */ void d(abmu abmuVar, arlq arlqVar) {
        throw null;
    }

    public /* synthetic */ void e(abmw abmwVar, arlq arlqVar) {
        throw null;
    }

    public /* synthetic */ void f(abmy abmyVar, arlq arlqVar) {
        throw null;
    }

    @Override // defpackage.aqrn
    public final asmb n() {
        aqvw aqvwVar = abmr.c;
        if (aqvwVar == null) {
            synchronized (abmr.class) {
                aqvwVar = abmr.c;
                if (aqvwVar == null) {
                    asmb asmbVar = new asmb("com.google.android.gms.backup.customd2dapi.CustomD2DSourceService", (byte[]) null);
                    asmbVar.o(abmr.f());
                    asmbVar.o(abmr.e());
                    asmbVar.o(abmr.d());
                    aqvwVar = new aqvw(asmbVar);
                    abmr.c = aqvwVar;
                }
            }
        }
        HashMap hashMap = new HashMap();
        aqux f = abmr.f();
        arlp arlpVar = new arlp(new wcl(this, 0, 2));
        String str = aqvwVar.a;
        aqae.t(f, arlpVar, str, aqvwVar, hashMap);
        aqae.t(abmr.e(), new arlp(new wcl(this, 1, 2)), str, aqvwVar, hashMap);
        aqae.t(abmr.d(), new arlp(new wcl(this, 2, 2)), str, aqvwVar, hashMap);
        return aqae.u(str, aqvwVar, hashMap);
    }
}
