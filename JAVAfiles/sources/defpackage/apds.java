package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apds {
    public static final apct a;
    public static final apct b;
    public static final ThreadLocal c;

    static {
        aozy createBuilder = apct.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        ((apct) apagVar).b = -62135596800L;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        ((apct) createBuilder.b).c = 0;
        a = (apct) createBuilder.s();
        aozy createBuilder2 = apct.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar2 = createBuilder2.b;
        ((apct) apagVar2).b = 253402300799L;
        if (!apagVar2.isMutable()) {
            createBuilder2.u();
        }
        ((apct) createBuilder2.b).c = 999999999;
        aozy createBuilder3 = apct.a.createBuilder();
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        apag apagVar3 = createBuilder3.b;
        ((apct) apagVar3).b = 0L;
        if (!apagVar3.isMutable()) {
            createBuilder3.u();
        }
        ((apct) createBuilder3.b).c = 0;
        b = (apct) createBuilder3.s();
        c = new apdq();
        h("now");
        h("getEpochSecond");
        h("getNano");
    }

    public static long a(apct apctVar) {
        f(apctVar);
        return albo.cK(albo.cL(apctVar.b, 1000L), apctVar.c / 1000000);
    }

    public static apct b(long j) {
        return d(j / 1000, (int) ((j % 1000) * 1000000));
    }

    public static apct c(long j) {
        return d(j, 0);
    }

    public static apct d(long j, int i) {
        if (g(j)) {
            if (i <= -1000000000 || i >= 1000000000) {
                j = albo.cK(j, i / 1000000000);
                i %= 1000000000;
            }
            if (i < 0) {
                i += 1000000000;
                j = albo.cM(j, 1L);
            }
            aozy createBuilder = apct.a.createBuilder();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            ((apct) apagVar).b = j;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            ((apct) createBuilder.b).c = i;
            apct apctVar = (apct) createBuilder.s();
            f(apctVar);
            return apctVar;
        }
        throw new IllegalArgumentException(String.format("Timestamp is not valid. Input seconds is too large. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. ", Long.valueOf(j)));
    }

    public static String e(apct apctVar) {
        String format;
        f(apctVar);
        long j = apctVar.b;
        int i = apctVar.c;
        StringBuilder sb = new StringBuilder();
        sb.append(((SimpleDateFormat) c.get()).format(new Date(j * 1000)));
        if (i != 0) {
            sb.append(".");
            if (i % 1000000 == 0) {
                format = String.format(Locale.ENGLISH, "%1$03d", Integer.valueOf(i / 1000000));
            } else if (i % 1000 == 0) {
                format = String.format(Locale.ENGLISH, "%1$06d", Integer.valueOf(i / 1000));
            } else {
                format = String.format(Locale.ENGLISH, "%1$09d", Integer.valueOf(i));
            }
            sb.append(format);
        }
        sb.append("Z");
        return sb.toString();
    }

    public static void f(apct apctVar) {
        long j = apctVar.b;
        boolean g = g(j);
        int i = apctVar.c;
        if (g && i >= 0 && i < 1000000000) {
        } else {
            throw new IllegalArgumentException(String.format("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", Long.valueOf(j), Integer.valueOf(i)));
        }
    }

    private static boolean g(long j) {
        if (j >= -62135596800L && j <= 253402300799L) {
            return true;
        }
        return false;
    }

    private static void h(String str) {
        try {
            Class.forName("java.time.Instant").getMethod(str, null);
        } catch (Exception unused) {
        }
    }
}
