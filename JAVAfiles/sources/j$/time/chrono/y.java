package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes5.dex */
public final class y extends AbstractC0073d {
    static final LocalDate d = LocalDate.of(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;
    private final transient LocalDate a;
    private transient z b;
    private transient int c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(LocalDate localDate) {
        if (!localDate.k0(d)) {
            z g = z.g(localDate);
            this.b = g;
            this.c = (localDate.j0() - g.m().j0()) + 1;
            this.a = localDate;
            return;
        }
        throw new RuntimeException("JapaneseDate before Meiji 6 is not supported");
    }

    private y i0(LocalDate localDate) {
        if (localDate.equals(this.a)) {
            return this;
        }
        return new y(localDate);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 4, this);
    }

    @Override // j$.time.chrono.AbstractC0073d, j$.time.chrono.InterfaceC0071b
    public final ChronoLocalDateTime B(LocalTime localTime) {
        return C0075f.b0(this, localTime);
    }

    @Override // j$.time.chrono.AbstractC0073d, j$.time.chrono.InterfaceC0071b
    public final n H() {
        return this.b;
    }

    @Override // j$.time.chrono.AbstractC0073d, j$.time.chrono.InterfaceC0071b
    public final InterfaceC0071b O(TemporalAmount temporalAmount) {
        return (y) super.O(temporalAmount);
    }

    @Override // j$.time.chrono.AbstractC0073d, j$.time.chrono.InterfaceC0071b
    /* renamed from: S */
    public final InterfaceC0071b n(long j, TemporalUnit temporalUnit) {
        return (y) super.n(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC0073d, j$.time.chrono.InterfaceC0071b
    public final int U() {
        int U;
        z zVar = this.b;
        z o = zVar.o();
        LocalDate localDate = this.a;
        if (o != null && o.m().j0() == localDate.j0()) {
            U = o.m().g0() - 1;
        } else {
            U = localDate.U();
        }
        if (this.c == 1) {
            return U - (zVar.m().g0() - 1);
        }
        return U;
    }

    @Override // j$.time.chrono.InterfaceC0071b
    public final m a() {
        return w.d;
    }

    @Override // j$.time.chrono.AbstractC0073d
    final InterfaceC0071b c0(long j) {
        return i0(this.a.plusDays(j));
    }

    @Override // j$.time.chrono.AbstractC0073d, j$.time.chrono.InterfaceC0071b, j$.time.temporal.Temporal
    public final InterfaceC0071b d(long j, TemporalUnit temporalUnit) {
        return (y) super.d(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC0073d
    final InterfaceC0071b d0(long j) {
        return i0(this.a.t0(j));
    }

    @Override // j$.time.chrono.AbstractC0073d
    final InterfaceC0071b e0(long j) {
        return i0(this.a.v0(j));
    }

    @Override // j$.time.chrono.AbstractC0073d, j$.time.chrono.InterfaceC0071b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            return this.a.equals(((y) obj).a);
        }
        return false;
    }

    @Override // j$.time.chrono.AbstractC0073d, j$.time.chrono.InterfaceC0071b, j$.time.temporal.TemporalAccessor
    public final boolean f(TemporalField temporalField) {
        if (temporalField == ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH || temporalField == ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR || temporalField == ChronoField.ALIGNED_WEEK_OF_MONTH || temporalField == ChronoField.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).a0();
        }
        if (temporalField == null || !temporalField.y(this)) {
            return false;
        }
        return true;
    }

    public final z f0() {
        return this.b;
    }

    public final y g0(long j, ChronoUnit chronoUnit) {
        return (y) super.d(j, (TemporalUnit) chronoUnit);
    }

    @Override // j$.time.chrono.AbstractC0073d, j$.time.temporal.Temporal
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public final y c(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            if (y(chronoField) == j) {
                return this;
            }
            int[] iArr = x.a;
            int i = iArr[chronoField.ordinal()];
            LocalDate localDate = this.a;
            if (i == 3 || i == 8 || i == 9) {
                w wVar = w.d;
                int a = wVar.Q(chronoField).a(j, chronoField);
                int i2 = iArr[chronoField.ordinal()];
                if (i2 != 3) {
                    if (i2 != 8) {
                        if (i2 == 9) {
                            return i0(localDate.A0(a));
                        }
                    } else {
                        return i0(localDate.A0(wVar.g(z.q(a), this.c)));
                    }
                } else {
                    return i0(localDate.A0(wVar.g(this.b, a)));
                }
            }
            return i0(localDate.c(j, temporalField));
        }
        return (y) super.c(j, temporalField);
    }

    @Override // j$.time.chrono.AbstractC0073d, j$.time.chrono.InterfaceC0071b
    public final int hashCode() {
        w.d.getClass();
        return this.a.hashCode() ^ (-688086063);
    }

    public final y j0(j$.time.temporal.m mVar) {
        return (y) super.t(mVar);
    }

    @Override // j$.time.chrono.AbstractC0073d, j$.time.chrono.InterfaceC0071b
    /* renamed from: k */
    public final InterfaceC0071b t(j$.time.temporal.k kVar) {
        return (y) super.t(kVar);
    }

    @Override // j$.time.chrono.AbstractC0073d, j$.time.temporal.Temporal
    public final Temporal n(long j, ChronoUnit chronoUnit) {
        return (y) super.n(j, chronoUnit);
    }

    @Override // j$.time.chrono.AbstractC0073d, j$.time.temporal.Temporal
    public final Temporal t(LocalDate localDate) {
        return (y) super.t(localDate);
    }

    @Override // j$.time.chrono.AbstractC0073d, j$.time.chrono.InterfaceC0071b
    public final long toEpochDay() {
        return this.a.toEpochDay();
    }

    @Override // j$.time.chrono.AbstractC0073d, j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p u(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (f(temporalField)) {
                ChronoField chronoField = (ChronoField) temporalField;
                int i = x.a[chronoField.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return w.d.Q(chronoField);
                        }
                        z zVar = this.b;
                        int j0 = zVar.m().j0();
                        if (zVar.o() != null) {
                            return j$.time.temporal.p.j(1L, (r6.m().j0() - j0) + 1);
                        }
                        return j$.time.temporal.p.j(1L, 999999999 - j0);
                    }
                    return j$.time.temporal.p.j(1L, U());
                }
                return j$.time.temporal.p.j(1L, this.a.l0());
            }
            throw new RuntimeException("Unsupported field: ".concat(String.valueOf(temporalField)));
        }
        return temporalField.G(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long y(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i = x.a[((ChronoField) temporalField).ordinal()];
            int i2 = this.c;
            z zVar = this.b;
            LocalDate localDate = this.a;
            switch (i) {
                case 2:
                    if (i2 == 1) {
                        return (localDate.g0() - zVar.m().g0()) + 1;
                    }
                    return localDate.g0();
                case 3:
                    return i2;
                case 4:
                case 5:
                case 6:
                case 7:
                    throw new RuntimeException("Unsupported field: ".concat(String.valueOf(temporalField)));
                case 8:
                    return zVar.getValue();
                default:
                    return localDate.y(temporalField);
            }
        }
        return temporalField.u(this);
    }

    @Override // j$.time.chrono.AbstractC0073d, j$.time.temporal.Temporal
    public final Temporal d(long j, TemporalUnit temporalUnit) {
        return (y) super.d(j, temporalUnit);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(z zVar, int i, LocalDate localDate) {
        if (!localDate.k0(d)) {
            this.b = zVar;
            this.c = i;
            this.a = localDate;
            return;
        }
        throw new RuntimeException("JapaneseDate before Meiji 6 is not supported");
    }
}
