package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Timer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adrm {
    public ahjj b;
    private static final Timer c = new Timer(true);
    public static final Map a = new ConcurrentHashMap();

    public static final String c(adrc adrcVar, String str) {
        return adrcVar.k + "#" + str;
    }

    public final void a(adrc adrcVar, long j, String str) {
        String c2 = c(adrcVar, str);
        Map map = a;
        adrl adrlVar = (adrl) map.remove(c2);
        if (adrlVar != null) {
            adrlVar.cancel();
        }
        advr.c("Start timer: remote contact will be considered idle in %ds", Long.valueOf(j));
        adrl adrlVar2 = new adrl(this, adrcVar, str);
        map.put(c2, adrlVar2);
        c.schedule(adrlVar2, j * 1000);
    }

    public final void b(adrc adrcVar, String str) {
        advr.c("Stopping timer for contact: %s", advr.a(str));
        adrl adrlVar = (adrl) a.remove(c(adrcVar, str));
        if (adrlVar != null) {
            ahjj ahjjVar = this.b;
            ahjjVar.getClass();
            ahjjVar.m(adrlVar.a, str, false);
            adrlVar.cancel();
        }
    }
}
