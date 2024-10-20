package j$.time.format;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.AbstractC0077h;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.format.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0088h implements InterfaceC0086f {
    @Override // j$.time.format.InterfaceC0086f
    public final boolean n(z zVar, StringBuilder sb) {
        Long l;
        long j;
        Long e = zVar.e(ChronoField.INSTANT_SECONDS);
        TemporalAccessor d = zVar.d();
        ChronoField chronoField = ChronoField.NANO_OF_SECOND;
        if (d.f(chronoField)) {
            l = Long.valueOf(zVar.d().y(chronoField));
        } else {
            l = null;
        }
        int i = 0;
        if (e == null) {
            return false;
        }
        long longValue = e.longValue();
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        int b0 = chronoField.b0(j);
        if (longValue >= -62167219200L) {
            long j2 = longValue - 253402300800L;
            long f = j$.nio.file.attribute.p.f(j2, 315569520000L) + 1;
            LocalDateTime o0 = LocalDateTime.o0(j$.nio.file.attribute.p.g(j2, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (f > 0) {
                sb.append('+');
                sb.append(f);
            }
            sb.append(o0);
            if (o0.h0() == 0) {
                sb.append(":00");
            }
        } else {
            long j3 = longValue + 62167219200L;
            long j4 = j3 / 315569520000L;
            long j5 = j3 % 315569520000L;
            LocalDateTime o02 = LocalDateTime.o0(j5 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb.length();
            sb.append(o02);
            if (o02.h0() == 0) {
                sb.append(":00");
            }
            if (j4 < 0) {
                if (o02.i0() == -10000) {
                    sb.replace(length, length + 2, Long.toString(j4 - 1));
                } else if (j5 == 0) {
                    sb.insert(length, j4);
                } else {
                    sb.insert(length + 1, Math.abs(j4));
                }
            }
        }
        if (b0 > 0) {
            sb.append('.');
            int i2 = 100000000;
            while (true) {
                if (b0 <= 0 && i % 3 == 0 && i >= -2) {
                    break;
                }
                int i3 = b0 / i2;
                sb.append((char) (i3 + 48));
                b0 -= i3 * i2;
                i2 /= 10;
                i++;
            }
        }
        sb.append('Z');
        return true;
    }

    @Override // j$.time.format.InterfaceC0086f
    public final int t(w wVar, CharSequence charSequence, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        v vVar = new v();
        vVar.a(DateTimeFormatter.ISO_LOCAL_DATE);
        vVar.e('T');
        ChronoField chronoField = ChronoField.HOUR_OF_DAY;
        vVar.o(chronoField, 2);
        vVar.e(':');
        ChronoField chronoField2 = ChronoField.MINUTE_OF_HOUR;
        vVar.o(chronoField2, 2);
        vVar.e(':');
        ChronoField chronoField3 = ChronoField.SECOND_OF_MINUTE;
        vVar.o(chronoField3, 2);
        ChronoField chronoField4 = ChronoField.NANO_OF_SECOND;
        int i6 = 0;
        vVar.b(chronoField4, 0, 9, true);
        vVar.e('Z');
        C0085e g = vVar.x().g();
        w d = wVar.d();
        int t = g.t(d, charSequence, i);
        if (t < 0) {
            return t;
        }
        long longValue = d.j(ChronoField.YEAR).longValue();
        int intValue = d.j(ChronoField.MONTH_OF_YEAR).intValue();
        int intValue2 = d.j(ChronoField.DAY_OF_MONTH).intValue();
        int intValue3 = d.j(chronoField).intValue();
        int intValue4 = d.j(chronoField2).intValue();
        Long j = d.j(chronoField3);
        Long j2 = d.j(chronoField4);
        if (j != null) {
            i2 = j.intValue();
        } else {
            i2 = 0;
        }
        if (j2 != null) {
            i3 = j2.intValue();
        } else {
            i3 = 0;
        }
        if (intValue3 == 24 && intValue4 == 0 && i2 == 0 && i3 == 0) {
            i5 = i2;
            i6 = 1;
            i4 = 0;
        } else if (intValue3 == 23 && intValue4 == 59 && i2 == 60) {
            wVar.p();
            i4 = intValue3;
            i5 = 59;
        } else {
            i4 = intValue3;
            i5 = i2;
        }
        try {
            return wVar.o(chronoField4, i3, i, wVar.o(ChronoField.INSTANT_SECONDS, j$.nio.channels.c.j(longValue / 10000, 315569520000L) + AbstractC0077h.n(LocalDateTime.m0(((int) longValue) % 10000, intValue, intValue2, i4, intValue4, i5).q0(i6), ZoneOffset.UTC), i, t));
        } catch (RuntimeException unused) {
            return ~i;
        }
    }

    public final String toString() {
        return "Instant()";
    }
}
