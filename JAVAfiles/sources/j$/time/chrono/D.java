package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes5.dex */
public final class D extends AbstractC0073d {
    private static final long serialVersionUID = 1300372329181994526L;
    private final transient LocalDate a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public D(LocalDate localDate) {
        Objects.a(localDate, "isoDate");
        this.a = localDate;
    }

    private int f0() {
        return this.a.j0() - 1911;
    }

    private D h0(LocalDate localDate) {
        if (localDate.equals(this.a)) {
            return this;
        }
        return new D(localDate);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 7, this);
    }

    @Override // j$.time.chrono.AbstractC0073d, j$.time.chrono.InterfaceC0071b
    public final ChronoLocalDateTime B(LocalTime localTime) {
        return C0075f.b0(this, localTime);
    }

    @Override // j$.time.chrono.AbstractC0073d, j$.time.chrono.InterfaceC0071b
    public final n H() {
        if (f0() >= 1) {
            return E.ROC;
        }
        return E.BEFORE_ROC;
    }

    @Override // j$.time.chrono.AbstractC0073d, j$.time.chrono.InterfaceC0071b
    public final InterfaceC0071b O(TemporalAmount temporalAmount) {
        return (D) super.O(temporalAmount);
    }

    @Override // j$.time.chrono.AbstractC0073d, j$.time.chrono.InterfaceC0071b
    /* renamed from: S */
    public final InterfaceC0071b n(long j, TemporalUnit temporalUnit) {
        return (D) super.n(j, temporalUnit);
    }

    @Override // j$.time.chrono.InterfaceC0071b
    public final m a() {
        return B.d;
    }

    @Override // j$.time.chrono.AbstractC0073d
    final InterfaceC0071b c0(long j) {
        return h0(this.a.plusDays(j));
    }

    @Override // j$.time.chrono.AbstractC0073d, j$.time.chrono.InterfaceC0071b, j$.time.temporal.Temporal
    public final InterfaceC0071b d(long j, TemporalUnit temporalUnit) {
        return (D) super.d(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC0073d
    final InterfaceC0071b d0(long j) {
        return h0(this.a.t0(j));
    }

    @Override // j$.time.chrono.AbstractC0073d
    final InterfaceC0071b e0(long j) {
        return h0(this.a.v0(j));
    }

    @Override // j$.time.chrono.AbstractC0073d, j$.time.chrono.InterfaceC0071b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof D) {
            return this.a.equals(((D) obj).a);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if (r2 != 7) goto L20;
     */
    @Override // j$.time.chrono.AbstractC0073d, j$.time.temporal.Temporal
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j$.time.chrono.D c(long r9, j$.time.temporal.TemporalField r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof j$.time.temporal.ChronoField
            if (r0 == 0) goto L9a
            r0 = r11
            j$.time.temporal.ChronoField r0 = (j$.time.temporal.ChronoField) r0
            long r1 = r8.y(r0)
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 != 0) goto L10
            return r8
        L10:
            int[] r1 = j$.time.chrono.C.a
            int r2 = r0.ordinal()
            r2 = r1[r2]
            j$.time.LocalDate r3 = r8.a
            r4 = 7
            r5 = 6
            r6 = 4
            if (r2 == r6) goto L4c
            r7 = 5
            if (r2 == r7) goto L27
            if (r2 == r5) goto L4c
            if (r2 == r4) goto L4c
            goto L62
        L27:
            j$.time.chrono.B r11 = j$.time.chrono.B.d
            j$.time.temporal.p r11 = r11.Q(r0)
            r11.b(r9, r0)
            int r11 = r8.f0()
            long r0 = (long) r11
            r4 = 12
            long r0 = r0 * r4
            int r11 = r3.h0()
            long r4 = (long) r11
            long r0 = r0 + r4
            r4 = 1
            long r0 = r0 - r4
            long r9 = r9 - r0
            j$.time.LocalDate r9 = r3.t0(r9)
            j$.time.chrono.D r9 = r8.h0(r9)
            return r9
        L4c:
            j$.time.chrono.B r2 = j$.time.chrono.B.d
            j$.time.temporal.p r2 = r2.Q(r0)
            int r2 = r2.a(r9, r0)
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r6) goto L85
            if (r0 == r5) goto L7a
            if (r0 == r4) goto L6b
        L62:
            j$.time.LocalDate r9 = r3.c(r9, r11)
            j$.time.chrono.D r9 = r8.h0(r9)
            return r9
        L6b:
            int r9 = r8.f0()
            int r9 = 1912 - r9
            j$.time.LocalDate r9 = r3.A0(r9)
            j$.time.chrono.D r9 = r8.h0(r9)
            return r9
        L7a:
            int r2 = r2 + 1911
            j$.time.LocalDate r9 = r3.A0(r2)
            j$.time.chrono.D r9 = r8.h0(r9)
            return r9
        L85:
            int r9 = r8.f0()
            r10 = 1
            if (r9 < r10) goto L8f
            int r2 = r2 + 1911
            goto L91
        L8f:
            int r2 = 1912 - r2
        L91:
            j$.time.LocalDate r9 = r3.A0(r2)
            j$.time.chrono.D r9 = r8.h0(r9)
            return r9
        L9a:
            j$.time.chrono.b r9 = super.c(r9, r11)
            j$.time.chrono.D r9 = (j$.time.chrono.D) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.D.c(long, j$.time.temporal.TemporalField):j$.time.chrono.D");
    }

    @Override // j$.time.chrono.AbstractC0073d, j$.time.chrono.InterfaceC0071b
    public final int hashCode() {
        B.d.getClass();
        return this.a.hashCode() ^ (-1990173233);
    }

    @Override // j$.time.chrono.AbstractC0073d, j$.time.chrono.InterfaceC0071b
    /* renamed from: k */
    public final InterfaceC0071b t(j$.time.temporal.k kVar) {
        return (D) super.t(kVar);
    }

    @Override // j$.time.chrono.AbstractC0073d, j$.time.temporal.Temporal
    public final Temporal n(long j, ChronoUnit chronoUnit) {
        return (D) super.n(j, chronoUnit);
    }

    @Override // j$.time.chrono.AbstractC0073d, j$.time.temporal.Temporal
    public final Temporal t(LocalDate localDate) {
        return (D) super.t(localDate);
    }

    @Override // j$.time.chrono.AbstractC0073d, j$.time.chrono.InterfaceC0071b
    public final long toEpochDay() {
        return this.a.toEpochDay();
    }

    @Override // j$.time.chrono.AbstractC0073d, j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p u(TemporalField temporalField) {
        long d;
        if (temporalField instanceof ChronoField) {
            if (AbstractC0077h.h(this, temporalField)) {
                ChronoField chronoField = (ChronoField) temporalField;
                int i = C.a[chronoField.ordinal()];
                if (i != 1 && i != 2 && i != 3) {
                    if (i != 4) {
                        return B.d.Q(chronoField);
                    }
                    j$.time.temporal.p n = ChronoField.YEAR.n();
                    if (f0() <= 0) {
                        d = (-n.e()) + 1912;
                    } else {
                        d = n.d() - 1911;
                    }
                    return j$.time.temporal.p.j(1L, d);
                }
                return this.a.u(temporalField);
            }
            throw new RuntimeException("Unsupported field: ".concat(String.valueOf(temporalField)));
        }
        return temporalField.G(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long y(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i = C.a[((ChronoField) temporalField).ordinal()];
            int i2 = 1;
            if (i != 4) {
                LocalDate localDate = this.a;
                if (i != 5) {
                    if (i != 6) {
                        if (i != 7) {
                            return localDate.y(temporalField);
                        }
                        if (f0() < 1) {
                            i2 = 0;
                        }
                        return i2;
                    }
                    return f0();
                }
                return ((f0() * 12) + localDate.h0()) - 1;
            }
            int f0 = f0();
            if (f0 < 1) {
                f0 = 1 - f0;
            }
            return f0;
        }
        return temporalField.u(this);
    }

    @Override // j$.time.chrono.AbstractC0073d, j$.time.temporal.Temporal
    public final Temporal d(long j, TemporalUnit temporalUnit) {
        return (D) super.d(j, temporalUnit);
    }
}
