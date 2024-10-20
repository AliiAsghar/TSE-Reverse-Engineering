package j$.time.format;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.Period;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.InterfaceC0071b;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class E implements TemporalAccessor {
    ZoneId b;
    j$.time.chrono.m c;
    boolean d;
    private F e;
    private InterfaceC0071b f;
    private LocalTime g;
    final HashMap a = new HashMap();
    Period h = Period.d;

    private void g(TemporalAccessor temporalAccessor) {
        Iterator it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            TemporalField temporalField = (TemporalField) entry.getKey();
            if (temporalAccessor.f(temporalField)) {
                try {
                    long y = temporalAccessor.y(temporalField);
                    long longValue = ((Long) entry.getValue()).longValue();
                    if (y == longValue) {
                        it.remove();
                    } else {
                        throw new RuntimeException("Conflict found: Field " + String.valueOf(temporalField) + " " + y + " differs from " + String.valueOf(temporalField) + " " + longValue + " derived from " + String.valueOf(temporalAccessor));
                    }
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    private void m() {
        HashMap hashMap = this.a;
        if (hashMap.containsKey(ChronoField.INSTANT_SECONDS)) {
            ZoneId zoneId = this.b;
            if (zoneId != null) {
                o(zoneId);
                return;
            }
            Long l = (Long) hashMap.get(ChronoField.OFFSET_SECONDS);
            if (l != null) {
                o(ZoneOffset.ofTotalSeconds(l.intValue()));
            }
        }
    }

    private void o(ZoneId zoneId) {
        HashMap hashMap = this.a;
        ChronoField chronoField = ChronoField.INSTANT_SECONDS;
        v(this.c.R(Instant.ofEpochSecond(((Long) hashMap.remove(chronoField)).longValue()), zoneId).b());
        x(chronoField, ChronoField.SECOND_OF_DAY, Long.valueOf(r5.toLocalTime().s0()));
    }

    private void q(long j, long j2, long j3, long j4) {
        if (this.e == F.LENIENT) {
            long g = j$.nio.channels.c.g(j$.nio.channels.c.g(j$.nio.channels.c.g(j$.nio.channels.c.j(j, 3600000000000L), j$.nio.channels.c.j(j2, 60000000000L)), j$.nio.channels.c.j(j3, 1000000000L)), j4);
            s(LocalTime.j0(j$.nio.file.attribute.p.g(g, 86400000000000L)), Period.b((int) j$.nio.file.attribute.p.f(g, 86400000000000L)));
            return;
        }
        int b0 = ChronoField.MINUTE_OF_HOUR.b0(j2);
        int b02 = ChronoField.NANO_OF_SECOND.b0(j4);
        if (this.e == F.SMART && j == 24 && b0 == 0 && j3 == 0 && b02 == 0) {
            s(LocalTime.g, Period.b(1));
        } else {
            s(LocalTime.i0(ChronoField.HOUR_OF_DAY.b0(j), b0, ChronoField.SECOND_OF_MINUTE.b0(j3), b02), Period.d);
        }
    }

    private void r() {
        HashMap hashMap = this.a;
        ChronoField chronoField = ChronoField.CLOCK_HOUR_OF_DAY;
        long j = 0;
        if (hashMap.containsKey(chronoField)) {
            long longValue = ((Long) hashMap.remove(chronoField)).longValue();
            F f = this.e;
            if (f == F.STRICT || (f == F.SMART && longValue != 0)) {
                chronoField.c0(longValue);
            }
            ChronoField chronoField2 = ChronoField.HOUR_OF_DAY;
            if (longValue == 24) {
                longValue = 0;
            }
            x(chronoField, chronoField2, Long.valueOf(longValue));
        }
        ChronoField chronoField3 = ChronoField.CLOCK_HOUR_OF_AMPM;
        if (hashMap.containsKey(chronoField3)) {
            long longValue2 = ((Long) hashMap.remove(chronoField3)).longValue();
            F f2 = this.e;
            if (f2 == F.STRICT || (f2 == F.SMART && longValue2 != 0)) {
                chronoField3.c0(longValue2);
            }
            ChronoField chronoField4 = ChronoField.HOUR_OF_AMPM;
            if (longValue2 != 12) {
                j = longValue2;
            }
            x(chronoField3, chronoField4, Long.valueOf(j));
        }
        ChronoField chronoField5 = ChronoField.AMPM_OF_DAY;
        if (hashMap.containsKey(chronoField5)) {
            ChronoField chronoField6 = ChronoField.HOUR_OF_AMPM;
            if (hashMap.containsKey(chronoField6)) {
                long longValue3 = ((Long) hashMap.remove(chronoField5)).longValue();
                long longValue4 = ((Long) hashMap.remove(chronoField6)).longValue();
                if (this.e == F.LENIENT) {
                    x(chronoField5, ChronoField.HOUR_OF_DAY, Long.valueOf(j$.nio.channels.c.g(j$.nio.channels.c.j(longValue3, 12), longValue4)));
                } else {
                    chronoField5.c0(longValue3);
                    chronoField6.c0(longValue3);
                    x(chronoField5, ChronoField.HOUR_OF_DAY, Long.valueOf((longValue3 * 12) + longValue4));
                }
            }
        }
        ChronoField chronoField7 = ChronoField.NANO_OF_DAY;
        if (hashMap.containsKey(chronoField7)) {
            long longValue5 = ((Long) hashMap.remove(chronoField7)).longValue();
            if (this.e != F.LENIENT) {
                chronoField7.c0(longValue5);
            }
            x(chronoField7, ChronoField.HOUR_OF_DAY, Long.valueOf(longValue5 / 3600000000000L));
            x(chronoField7, ChronoField.MINUTE_OF_HOUR, Long.valueOf((longValue5 / 60000000000L) % 60));
            x(chronoField7, ChronoField.SECOND_OF_MINUTE, Long.valueOf((longValue5 / 1000000000) % 60));
            x(chronoField7, ChronoField.NANO_OF_SECOND, Long.valueOf(longValue5 % 1000000000));
        }
        ChronoField chronoField8 = ChronoField.MICRO_OF_DAY;
        if (hashMap.containsKey(chronoField8)) {
            long longValue6 = ((Long) hashMap.remove(chronoField8)).longValue();
            if (this.e != F.LENIENT) {
                chronoField8.c0(longValue6);
            }
            x(chronoField8, ChronoField.SECOND_OF_DAY, Long.valueOf(longValue6 / 1000000));
            x(chronoField8, ChronoField.MICRO_OF_SECOND, Long.valueOf(longValue6 % 1000000));
        }
        ChronoField chronoField9 = ChronoField.MILLI_OF_DAY;
        if (hashMap.containsKey(chronoField9)) {
            long longValue7 = ((Long) hashMap.remove(chronoField9)).longValue();
            if (this.e != F.LENIENT) {
                chronoField9.c0(longValue7);
            }
            x(chronoField9, ChronoField.SECOND_OF_DAY, Long.valueOf(longValue7 / 1000));
            x(chronoField9, ChronoField.MILLI_OF_SECOND, Long.valueOf(longValue7 % 1000));
        }
        ChronoField chronoField10 = ChronoField.SECOND_OF_DAY;
        if (hashMap.containsKey(chronoField10)) {
            long longValue8 = ((Long) hashMap.remove(chronoField10)).longValue();
            if (this.e != F.LENIENT) {
                chronoField10.c0(longValue8);
            }
            x(chronoField10, ChronoField.HOUR_OF_DAY, Long.valueOf(longValue8 / 3600));
            x(chronoField10, ChronoField.MINUTE_OF_HOUR, Long.valueOf((longValue8 / 60) % 60));
            x(chronoField10, ChronoField.SECOND_OF_MINUTE, Long.valueOf(longValue8 % 60));
        }
        ChronoField chronoField11 = ChronoField.MINUTE_OF_DAY;
        if (hashMap.containsKey(chronoField11)) {
            long longValue9 = ((Long) hashMap.remove(chronoField11)).longValue();
            if (this.e != F.LENIENT) {
                chronoField11.c0(longValue9);
            }
            x(chronoField11, ChronoField.HOUR_OF_DAY, Long.valueOf(longValue9 / 60));
            x(chronoField11, ChronoField.MINUTE_OF_HOUR, Long.valueOf(longValue9 % 60));
        }
        ChronoField chronoField12 = ChronoField.NANO_OF_SECOND;
        if (hashMap.containsKey(chronoField12)) {
            long longValue10 = ((Long) hashMap.get(chronoField12)).longValue();
            F f3 = this.e;
            F f4 = F.LENIENT;
            if (f3 != f4) {
                chronoField12.c0(longValue10);
            }
            ChronoField chronoField13 = ChronoField.MICRO_OF_SECOND;
            if (hashMap.containsKey(chronoField13)) {
                long longValue11 = ((Long) hashMap.remove(chronoField13)).longValue();
                if (this.e != f4) {
                    chronoField13.c0(longValue11);
                }
                longValue10 = (longValue10 % 1000) + (longValue11 * 1000);
                x(chronoField13, chronoField12, Long.valueOf(longValue10));
            }
            ChronoField chronoField14 = ChronoField.MILLI_OF_SECOND;
            if (hashMap.containsKey(chronoField14)) {
                long longValue12 = ((Long) hashMap.remove(chronoField14)).longValue();
                if (this.e != f4) {
                    chronoField14.c0(longValue12);
                }
                x(chronoField14, chronoField12, Long.valueOf((longValue10 % 1000000) + (longValue12 * 1000000)));
            }
        }
        ChronoField chronoField15 = ChronoField.HOUR_OF_DAY;
        if (hashMap.containsKey(chronoField15)) {
            ChronoField chronoField16 = ChronoField.MINUTE_OF_HOUR;
            if (hashMap.containsKey(chronoField16)) {
                ChronoField chronoField17 = ChronoField.SECOND_OF_MINUTE;
                if (hashMap.containsKey(chronoField17) && hashMap.containsKey(chronoField12)) {
                    q(((Long) hashMap.remove(chronoField15)).longValue(), ((Long) hashMap.remove(chronoField16)).longValue(), ((Long) hashMap.remove(chronoField17)).longValue(), ((Long) hashMap.remove(chronoField12)).longValue());
                }
            }
        }
    }

    private void s(LocalTime localTime, Period period) {
        LocalTime localTime2 = this.g;
        if (localTime2 != null) {
            if (localTime2.equals(localTime)) {
                Period period2 = this.h;
                period2.getClass();
                Period period3 = Period.d;
                if (period2 == period3 || period == period3 || this.h.equals(period)) {
                    this.h = period;
                    return;
                }
                throw new RuntimeException(j$.time.d.d("Conflict found: Fields resolved to different excess periods: ", String.valueOf(this.h), " ", String.valueOf(period)));
            }
            throw new RuntimeException(j$.time.d.d("Conflict found: Fields resolved to different times: ", String.valueOf(this.g), " ", String.valueOf(localTime)));
        }
        this.g = localTime;
        this.h = period;
    }

    private void v(InterfaceC0071b interfaceC0071b) {
        InterfaceC0071b interfaceC0071b2 = this.f;
        if (interfaceC0071b2 != null) {
            if (interfaceC0071b != null && !interfaceC0071b2.equals(interfaceC0071b)) {
                throw new RuntimeException(j$.time.d.d("Conflict found: Fields resolved to two different dates: ", String.valueOf(this.f), " ", String.valueOf(interfaceC0071b)));
            }
        } else if (interfaceC0071b != null) {
            if (this.c.equals(interfaceC0071b.a())) {
                this.f = interfaceC0071b;
                return;
            }
            throw new RuntimeException("ChronoLocalDate must use the effective parsed chronology: ".concat(String.valueOf(this.c)));
        }
    }

    private void x(TemporalField temporalField, ChronoField chronoField, Long l) {
        Long l2 = (Long) this.a.put(chronoField, l);
        if (l2 != null && l2.longValue() != l.longValue()) {
            throw new RuntimeException("Conflict found: " + String.valueOf(chronoField) + " " + l2 + " differs from " + String.valueOf(chronoField) + " " + l + " while resolving  " + String.valueOf(temporalField));
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object D(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.j.l()) {
            return this.b;
        }
        if (nVar == j$.time.temporal.j.e()) {
            return this.c;
        }
        if (nVar == j$.time.temporal.j.f()) {
            InterfaceC0071b interfaceC0071b = this.f;
            if (interfaceC0071b == null) {
                return null;
            }
            return LocalDate.c0(interfaceC0071b);
        }
        if (nVar == j$.time.temporal.j.g()) {
            return this.g;
        }
        if (nVar == j$.time.temporal.j.i()) {
            Long l = (Long) this.a.get(ChronoField.OFFSET_SECONDS);
            if (l != null) {
                return ZoneOffset.ofTotalSeconds(l.intValue());
            }
            ZoneId zoneId = this.b;
            if (zoneId instanceof ZoneOffset) {
                return zoneId;
            }
            return nVar.g(this);
        }
        if (nVar == j$.time.temporal.j.k()) {
            return nVar.g(this);
        }
        if (nVar == j$.time.temporal.j.j()) {
            return null;
        }
        return nVar.g(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(TemporalField temporalField) {
        if (this.a.containsKey(temporalField)) {
            return true;
        }
        InterfaceC0071b interfaceC0071b = this.f;
        if (interfaceC0071b != null && interfaceC0071b.f(temporalField)) {
            return true;
        }
        LocalTime localTime = this.g;
        if (localTime != null && localTime.f(temporalField)) {
            return true;
        }
        if (temporalField != null && !(temporalField instanceof ChronoField) && temporalField.y(this)) {
            return true;
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int get(TemporalField temporalField) {
        return j$.time.temporal.j.a(this, temporalField);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x027d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(j$.time.format.F r24) {
        /*
            Method dump skipped, instructions count: 748
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.E.l(j$.time.format.F):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(this.a);
        sb.append(',');
        sb.append(this.c);
        if (this.b != null) {
            sb.append(',');
            sb.append(this.b);
        }
        if (this.f != null || this.g != null) {
            sb.append(" resolved to ");
            InterfaceC0071b interfaceC0071b = this.f;
            if (interfaceC0071b != null) {
                sb.append(interfaceC0071b);
                if (this.g != null) {
                    sb.append('T');
                    sb.append(this.g);
                }
            } else {
                sb.append(this.g);
            }
        }
        return sb.toString();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ j$.time.temporal.p u(TemporalField temporalField) {
        return j$.time.temporal.j.d(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long y(TemporalField temporalField) {
        Objects.a(temporalField, "field");
        Long l = (Long) this.a.get(temporalField);
        if (l != null) {
            return l.longValue();
        }
        InterfaceC0071b interfaceC0071b = this.f;
        if (interfaceC0071b != null && interfaceC0071b.f(temporalField)) {
            return this.f.y(temporalField);
        }
        LocalTime localTime = this.g;
        if (localTime != null && localTime.f(temporalField)) {
            return this.g.y(temporalField);
        }
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.u(this);
        }
        throw new RuntimeException("Unsupported field: ".concat(String.valueOf(temporalField)));
    }
}
