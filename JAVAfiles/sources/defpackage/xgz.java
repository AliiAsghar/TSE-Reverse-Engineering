package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.stream.Stream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xgz {
    private final xnv d;
    private final wul e;
    private static final xze b = xze.g("Bugle", "ReverseTelephonySync");
    public static final utz a = uuh.e(uuh.b, "reverse_telephony_sync__max_number_of_attempts", 2);
    private static final utz c = uuh.f(uuh.b, "reverse_telephony_sync__max_number_of_attempts_time_window_millis", 86400000);

    public xgz(armf armfVar, xnv xnvVar) {
        this.d = xnvVar;
        znj znjVar = (znj) armfVar.b();
        aiwl a2 = wus.a();
        a2.i(wuk.REVERSE_TELEPHONY_SYNC_STATE);
        a2.k(xgy.a);
        this.e = znjVar.ab(a2.f());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [j$.time.temporal.TemporalAmount, java.lang.Object] */
    public final boolean a() {
        try {
            xgy xgyVar = (xgy) this.e.l();
            atal atalVar = new atal(((Integer) a.e()).intValue(), Duration.ofMillis(((Long) c.e()).longValue()));
            Stream map = Collection.EL.stream(xgyVar.d).map(new xgv(3));
            int i = alog.d;
            alog alogVar = (alog) map.collect(alls.a);
            Instant f = this.d.f();
            if (atalVar.a != -1) {
                Instant minus = f.minus(atalVar.b);
                int size = alogVar.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    if (((Instant) alogVar.get(i3)).isAfter(minus)) {
                        i2++;
                    }
                }
                if (i2 >= atalVar.a) {
                    return true;
                }
            }
        } catch (apba e) {
            b.r("Unable to get state from data store", e);
        }
        return false;
    }
}
