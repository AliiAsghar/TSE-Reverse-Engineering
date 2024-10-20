package defpackage;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ytf {
    static {
        ZoneId.of("America/Los_Angeles");
    }

    public static apct a(long j) {
        int nanos = (int) TimeUnit.MILLISECONDS.toNanos(j % TimeUnit.SECONDS.toMillis(1L));
        aozy createBuilder = apct.a.createBuilder();
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        ((apct) apagVar).b = seconds;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        ((apct) createBuilder.b).c = nanos;
        return (apct) createBuilder.s();
    }

    public static apct b(apct apctVar) {
        return apds.c(Math.round(((float) apctVar.b) / 3600.0f) * 3600);
    }

    public static apct c(apct apctVar) {
        return aotl.j(aotl.l(apctVar).atZone(ZoneOffset.UTC).b().atStartOfDay(ZoneOffset.UTC).toInstant());
    }
}
