package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class abhh extends arhx {
    public abhh() {
        super(arpj.a);
    }

    public Object c(abgw abgwVar, arpe arpeVar) {
        throw null;
    }

    @Override // defpackage.aqrn
    public final asmb n() {
        aqvw aqvwVar = abhg.a;
        if (aqvwVar == null) {
            synchronized (abhg.class) {
                aqvwVar = abhg.a;
                if (aqvwVar == null) {
                    asmb asmbVar = new asmb("stargate.SatelliteSessionStateNotificationService", (byte[]) null);
                    asmbVar.o(abhg.a());
                    aqvwVar = new aqvw(asmbVar);
                    abhg.a = aqvwVar;
                }
            }
        }
        HashMap hashMap = new HashMap();
        asmb k = aqaw.k(this.c, abhg.a(), new afib((Object) this, 1, (byte[]) null));
        String str = aqvwVar.a;
        aqae.v(k, str, hashMap);
        return aqae.u(str, aqvwVar, hashMap);
    }

    public abhh(arpi arpiVar) {
        super(arpiVar);
    }
}
