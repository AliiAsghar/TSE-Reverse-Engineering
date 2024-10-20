package j$.nio.file.attribute;

import j$.time.Instant;
import j$.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class y implements Comparable {
    private final TimeUnit a;
    private final long b;
    private Instant c = null;
    private String d;

    private y(long j, TimeUnit timeUnit) {
        this.b = j;
        this.a = timeUnit;
    }

    private static long D(long j, long j2, long j3) {
        if (j > j3) {
            return Long.MAX_VALUE;
        }
        if (j < (-j3)) {
            return Long.MIN_VALUE;
        }
        return j * j2;
    }

    private long a0(long j) {
        TimeUnit timeUnit = this.a;
        if (timeUnit != null) {
            return timeUnit.toNanos(this.b - timeUnit.convert(j, TimeUnit.DAYS));
        }
        return TimeUnit.SECONDS.toNanos(b0().getEpochSecond() - TimeUnit.DAYS.toSeconds(j));
    }

    private static void n(StringBuilder sb, int i, int i2) {
        while (i > 0) {
            sb.append((char) ((i2 / i) + 48));
            i2 %= i;
            i /= 10;
        }
    }

    public static y u(long j, TimeUnit timeUnit) {
        Objects.a(timeUnit, "unit");
        return new y(j, timeUnit);
    }

    public static y y(long j) {
        return new y(j, TimeUnit.MILLISECONDS);
    }

    public final long G(TimeUnit timeUnit) {
        Objects.a(timeUnit, "unit");
        TimeUnit timeUnit2 = this.a;
        if (timeUnit2 != null) {
            return timeUnit.convert(this.b, timeUnit2);
        }
        long convert = timeUnit.convert(this.c.getEpochSecond(), TimeUnit.SECONDS);
        if (convert != Long.MIN_VALUE && convert != Long.MAX_VALUE) {
            long convert2 = timeUnit.convert(this.c.getNano(), TimeUnit.NANOSECONDS);
            long j = convert + convert2;
            if (((convert2 ^ j) & (convert ^ j)) < 0) {
                if (convert < 0) {
                    return Long.MIN_VALUE;
                }
                return Long.MAX_VALUE;
            }
            return j;
        }
        return convert;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0011. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j$.time.Instant b0() {
        /*
            r13 = this;
            j$.time.Instant r0 = r13.c
            if (r0 != 0) goto L97
            int[] r0 = j$.nio.file.attribute.x.a
            java.util.concurrent.TimeUnit r1 = r13.a
            int r1 = r1.ordinal()
            r0 = r0[r1]
            long r1 = r13.b
            r3 = 0
            switch(r0) {
                case 1: goto L66;
                case 2: goto L58;
                case 3: goto L4a;
                case 4: goto L74;
                case 5: goto L39;
                case 6: goto L2a;
                case 7: goto L1c;
                default: goto L14;
            }
        L14:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "Unit not handled"
            r0.<init>(r1)
            throw r0
        L1c:
            r3 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r5 = j$.nio.file.attribute.p.f(r1, r3)
            long r0 = j$.nio.file.attribute.p.g(r1, r3)
            int r3 = (int) r0
        L28:
            r1 = r5
            goto L74
        L2a:
            r3 = 1000000(0xf4240, double:4.940656E-318)
            long r5 = j$.nio.file.attribute.p.f(r1, r3)
            long r0 = j$.nio.file.attribute.p.g(r1, r3)
            int r1 = (int) r0
            int r3 = r1 * 1000
            goto L28
        L39:
            r3 = 1000(0x3e8, double:4.94E-321)
            long r5 = j$.nio.file.attribute.p.f(r1, r3)
            long r0 = j$.nio.file.attribute.p.g(r1, r3)
            int r1 = (int) r0
            r0 = 1000000(0xf4240, float:1.401298E-39)
            int r3 = r1 * r0
            goto L28
        L4a:
            r9 = 60
            r11 = 153722867280912930(0x222222222222222, double:2.166167076120538E-298)
            long r7 = r13.b
            long r1 = D(r7, r9, r11)
            goto L74
        L58:
            r6 = 3600(0xe10, double:1.7786E-320)
            r8 = 2562047788015215(0x91a2b3c4d5e6f, double:1.2658197950618743E-308)
            long r4 = r13.b
            long r1 = D(r4, r6, r8)
            goto L74
        L66:
            r6 = 86400(0x15180, double:4.26873E-319)
            r8 = 106751991167300(0x611722833944, double:5.2742491460911E-310)
            long r4 = r13.b
            long r1 = D(r4, r6, r8)
        L74:
            r4 = -31557014167219200(0xff8fe31014641400, double:-2.7989734602046733E306)
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 > 0) goto L82
            j$.time.Instant r0 = j$.time.Instant.MIN
            r13.c = r0
            goto L97
        L82:
            r4 = 31556889864403199(0x701cd2fa9578ff, double:1.434068493154717E-306)
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 < 0) goto L90
            j$.time.Instant r0 = j$.time.Instant.MAX
            r13.c = r0
            goto L97
        L90:
            long r3 = (long) r3
            j$.time.Instant r0 = j$.time.Instant.ofEpochSecond(r1, r3)
            r13.c = r0
        L97:
            j$.time.Instant r0 = r13.c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.nio.file.attribute.y.b0():j$.time.Instant");
    }

    public final long c0() {
        TimeUnit timeUnit = this.a;
        if (timeUnit != null) {
            return timeUnit.toMillis(this.b);
        }
        long epochSecond = this.c.getEpochSecond();
        int nano = this.c.getNano();
        long j = epochSecond * 1000;
        if (((Math.abs(epochSecond) | 1000) >>> 31) != 0 && j / 1000 != epochSecond) {
            if (epochSecond < 0) {
                return Long.MIN_VALUE;
            }
            return Long.MAX_VALUE;
        }
        return j + (nano / 1000000);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y) || compareTo((y) obj) != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return b0().hashCode();
    }

    @Override // java.lang.Comparable
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final int compareTo(y yVar) {
        long days;
        long days2;
        long j = this.b;
        TimeUnit timeUnit = this.a;
        if (timeUnit != null && timeUnit == yVar.a) {
            return Long.compare(j, yVar.b);
        }
        long epochSecond = b0().getEpochSecond();
        int compare = Long.compare(epochSecond, yVar.b0().getEpochSecond());
        if (compare != 0) {
            return compare;
        }
        int compare2 = Long.compare(b0().getNano(), yVar.b0().getNano());
        if (compare2 != 0) {
            return compare2;
        }
        if (epochSecond != 31556889864403199L && epochSecond != -31557014167219200L) {
            return 0;
        }
        if (timeUnit != null) {
            days = timeUnit.toDays(j);
        } else {
            days = TimeUnit.SECONDS.toDays(b0().getEpochSecond());
        }
        TimeUnit timeUnit2 = yVar.a;
        if (timeUnit2 != null) {
            days2 = timeUnit2.toDays(yVar.b);
        } else {
            days2 = TimeUnit.SECONDS.toDays(yVar.b0().getEpochSecond());
        }
        if (days == days2) {
            return Long.compare(a0(days), yVar.a0(days2));
        }
        return Long.compare(days, days2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r12 = this;
            java.lang.String r0 = r12.d
            if (r0 != 0) goto Lfb
            j$.time.Instant r0 = r12.c
            if (r0 != 0) goto L1a
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.TimeUnit r1 = r12.a
            int r0 = r1.compareTo(r0)
            if (r0 < 0) goto L1a
            long r2 = r12.b
            long r0 = r1.toSeconds(r2)
            r2 = 0
            goto L2a
        L1a:
            j$.time.Instant r0 = r12.b0()
            long r0 = r0.getEpochSecond()
            j$.time.Instant r2 = r12.b0()
            int r2 = r2.getNano()
        L2a:
            r3 = -62167219200(0xfffffff1868b8400, double:NaN)
            r5 = 10000(0x2710, float:1.4013E-41)
            r6 = 62167219200(0xe79747c00, double:3.0714687304E-313)
            r8 = 315569520000(0x497968bd80, double:1.559120587066E-312)
            int r10 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r10 < 0) goto L60
            r3 = 253402300800(0x3afff44180, double:1.251973714024E-312)
            long r0 = r0 - r3
            long r3 = j$.nio.file.attribute.p.f(r0, r8)
            r10 = 1
            long r3 = r3 + r10
            long r0 = j$.nio.file.attribute.p.g(r0, r8)
            long r0 = r0 - r6
            j$.time.ZoneOffset r6 = j$.time.ZoneOffset.UTC
            j$.time.LocalDateTime r0 = j$.time.LocalDateTime.o0(r0, r2, r6)
            int r1 = r0.i0()
        L5b:
            int r2 = (int) r3
            int r2 = r2 * 10000
            int r2 = r2 + r1
            goto L70
        L60:
            long r0 = r0 + r6
            long r3 = r0 / r8
            long r0 = r0 % r8
            long r0 = r0 - r6
            j$.time.ZoneOffset r6 = j$.time.ZoneOffset.UTC
            j$.time.LocalDateTime r0 = j$.time.LocalDateTime.o0(r0, r2, r6)
            int r1 = r0.i0()
            goto L5b
        L70:
            if (r2 > 0) goto L74
            int r2 = r2 + (-1)
        L74:
            int r1 = r0.g0()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 64
            r3.<init>(r4)
            if (r2 >= 0) goto L84
            java.lang.String r4 = "-"
            goto L86
        L84:
            java.lang.String r4 = ""
        L86:
            r3.append(r4)
            int r2 = java.lang.Math.abs(r2)
            if (r2 >= r5) goto L99
            r4 = 1000(0x3e8, float:1.401E-42)
            int r2 = java.lang.Math.abs(r2)
            n(r3, r4, r2)
            goto La0
        L99:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r3.append(r2)
        La0:
            r2 = 45
            r3.append(r2)
            int r4 = r0.f0()
            r5 = 10
            n(r3, r5, r4)
            r3.append(r2)
            int r2 = r0.c0()
            n(r3, r5, r2)
            r2 = 84
            r3.append(r2)
            int r2 = r0.getHour()
            n(r3, r5, r2)
            r2 = 58
            r3.append(r2)
            int r4 = r0.e0()
            n(r3, r5, r4)
            r3.append(r2)
            int r0 = r0.h0()
            n(r3, r5, r0)
            if (r1 == 0) goto Lf0
            r0 = 46
            r3.append(r0)
            r0 = 100000000(0x5f5e100, float:2.3122341E-35)
        Le4:
            int r2 = r1 % 10
            if (r2 != 0) goto Led
            int r1 = r1 / 10
            int r0 = r0 / 10
            goto Le4
        Led:
            n(r3, r0, r1)
        Lf0:
            r0 = 90
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r12.d = r0
        Lfb:
            java.lang.String r0 = r12.d
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.nio.file.attribute.y.toString():java.lang.String");
    }
}
