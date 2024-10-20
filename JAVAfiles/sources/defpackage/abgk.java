package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class abgk extends arhx {
    public abgk() {
        super(arpj.a);
    }

    public Object d(abgs abgsVar, arpe arpeVar) {
        throw null;
    }

    public Object e(abgu abguVar, arpe arpeVar) {
        throw null;
    }

    @Override // defpackage.aqrn
    public final asmb n() {
        aqvw aqvwVar = abgj.a;
        if (aqvwVar == null) {
            synchronized (abgj.class) {
                aqvwVar = abgj.a;
                if (aqvwVar == null) {
                    asmb asmbVar = new asmb("stargate.DatagramNotificationService", (byte[]) null);
                    asmbVar.o(abgj.a());
                    asmbVar.o(abgj.b());
                    aqvwVar = new aqvw(asmbVar);
                    abgj.a = aqvwVar;
                }
            }
        }
        HashMap hashMap = new HashMap();
        asmb k = aqaw.k(this.c, abgj.a(), new ifp(this, 19, (byte[]) null, (byte[]) null));
        String str = aqvwVar.a;
        aqae.v(k, str, hashMap);
        aqae.v(aqaw.k(this.c, abgj.b(), new ifp(this, 20, (char[]) null, (byte[]) null)), str, hashMap);
        return aqae.u(str, aqvwVar, hashMap);
    }

    public abgk(arpi arpiVar) {
        super(arpiVar);
    }
}
