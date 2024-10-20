package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.chrono.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0075f implements ChronoLocalDateTime, Temporal, j$.time.temporal.k, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;
    private final transient InterfaceC0071b a;
    private final transient LocalTime b;

    private C0075f(InterfaceC0071b interfaceC0071b, LocalTime localTime) {
        Objects.a(localTime, "time");
        this.a = interfaceC0071b;
        this.b = localTime;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C0075f a0(m mVar, Temporal temporal) {
        C0075f c0075f = (C0075f) temporal;
        if (mVar.equals(c0075f.a.a())) {
            return c0075f;
        }
        throw new ClassCastException(j$.time.d.d("Chronology mismatch, required: ", mVar.m(), ", actual: ", c0075f.a.a().m()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C0075f b0(InterfaceC0071b interfaceC0071b, LocalTime localTime) {
        return new C0075f(interfaceC0071b, localTime);
    }

    private C0075f e0(InterfaceC0071b interfaceC0071b, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        LocalTime localTime = this.b;
        if (j5 == 0) {
            return g0(interfaceC0071b, localTime);
        }
        long j6 = j2 / 1440;
        long j7 = j / 24;
        long j8 = (j2 % 1440) * 60000000000L;
        long j9 = ((j % 24) * 3600000000000L) + j8 + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long r0 = localTime.r0();
        long j10 = j9 + r0;
        long f = j$.nio.file.attribute.p.f(j10, 86400000000000L) + j7 + j6 + (j3 / 86400) + (j4 / 86400000000000L);
        long g = j$.nio.file.attribute.p.g(j10, 86400000000000L);
        if (g != r0) {
            localTime = LocalTime.j0(g);
        }
        return g0(interfaceC0071b.d(f, (TemporalUnit) ChronoUnit.DAYS), localTime);
    }

    private C0075f g0(Temporal temporal, LocalTime localTime) {
        InterfaceC0071b interfaceC0071b = this.a;
        if (interfaceC0071b == temporal && this.b == localTime) {
            return this;
        }
        return new C0075f(AbstractC0073d.a0(interfaceC0071b.a(), temporal), localTime);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 2, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object D(j$.time.temporal.n nVar) {
        return AbstractC0077h.k(this, nVar);
    }

    @Override // j$.time.temporal.k
    public final Temporal G(Temporal temporal) {
        return temporal.c(b().toEpochDay(), ChronoField.EPOCH_DAY).c(toLocalTime().r0(), ChronoField.NANO_OF_DAY);
    }

    @Override // java.lang.Comparable
    /* renamed from: K */
    public final /* synthetic */ int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        return AbstractC0077h.c(this, chronoLocalDateTime);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final m a() {
        return this.a.a();
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final InterfaceC0071b b() {
        return this.a;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final C0075f d(long j, TemporalUnit temporalUnit) {
        boolean z = temporalUnit instanceof ChronoUnit;
        InterfaceC0071b interfaceC0071b = this.a;
        if (z) {
            int i = AbstractC0074e.a[((ChronoUnit) temporalUnit).ordinal()];
            LocalTime localTime = this.b;
            switch (i) {
                case 1:
                    return e0(this.a, 0L, 0L, 0L, j);
                case 2:
                    C0075f g0 = g0(interfaceC0071b.d(j / 86400000000L, (TemporalUnit) ChronoUnit.DAYS), localTime);
                    return g0.e0(g0.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
                case 3:
                    C0075f g02 = g0(interfaceC0071b.d(j / 86400000, (TemporalUnit) ChronoUnit.DAYS), localTime);
                    return g02.e0(g02.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
                case 4:
                    return d0(j);
                case 5:
                    return e0(this.a, 0L, j, 0L, 0L);
                case 6:
                    return e0(this.a, j, 0L, 0L, 0L);
                case 7:
                    C0075f g03 = g0(interfaceC0071b.d(j / 256, (TemporalUnit) ChronoUnit.DAYS), localTime);
                    return g03.e0(g03.a, (j % 256) * 12, 0L, 0L, 0L);
                default:
                    return g0(interfaceC0071b.d(j, temporalUnit), localTime);
            }
        }
        return a0(interfaceC0071b.a(), temporalUnit.n(this, j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C0075f d0(long j) {
        return e0(this.a, 0L, 0L, j, 0L);
    }

    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        boolean z;
        Objects.a(temporal, "endExclusive");
        InterfaceC0071b interfaceC0071b = this.a;
        ChronoLocalDateTime F = interfaceC0071b.a().F(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            ChronoUnit chronoUnit = ChronoUnit.DAYS;
            if (((ChronoUnit) temporalUnit).compareTo(chronoUnit) < 0) {
                z = true;
            } else {
                z = false;
            }
            LocalTime localTime = this.b;
            if (z) {
                ChronoField chronoField = ChronoField.EPOCH_DAY;
                long y = F.y(chronoField) - interfaceC0071b.y(chronoField);
                switch (AbstractC0074e.a[((ChronoUnit) temporalUnit).ordinal()]) {
                    case 1:
                        y = j$.nio.channels.c.j(y, 86400000000000L);
                        break;
                    case 2:
                        y = j$.nio.channels.c.j(y, 86400000000L);
                        break;
                    case 3:
                        y = j$.nio.channels.c.j(y, 86400000L);
                        break;
                    case 4:
                        y = j$.nio.channels.c.j(y, 86400);
                        break;
                    case 5:
                        y = j$.nio.channels.c.j(y, 1440);
                        break;
                    case 6:
                        y = j$.nio.channels.c.j(y, 24);
                        break;
                    case 7:
                        y = j$.nio.channels.c.j(y, 2);
                        break;
                }
                return j$.nio.channels.c.g(y, localTime.e(F.toLocalTime(), temporalUnit));
            }
            InterfaceC0071b b = F.b();
            if (F.toLocalTime().compareTo(localTime) < 0) {
                b = b.n(1L, chronoUnit);
            }
            return interfaceC0071b.e(b, temporalUnit);
        }
        Objects.a(temporalUnit, "unit");
        return temporalUnit.between(this, F);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ChronoLocalDateTime) && AbstractC0077h.c(this, (ChronoLocalDateTime) obj) == 0) {
            return true;
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            if (chronoField.a0() || chronoField.d0()) {
                return true;
            }
            return false;
        }
        if (temporalField != null && temporalField.y(this)) {
            return true;
        }
        return false;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public final C0075f c(long j, TemporalField temporalField) {
        boolean z = temporalField instanceof ChronoField;
        InterfaceC0071b interfaceC0071b = this.a;
        if (z) {
            boolean d0 = ((ChronoField) temporalField).d0();
            LocalTime localTime = this.b;
            if (d0) {
                return g0(interfaceC0071b, localTime.c(j, temporalField));
            }
            return g0(interfaceC0071b.c(j, temporalField), localTime);
        }
        return a0(interfaceC0071b.a(), temporalField.D(this, j));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (((ChronoField) temporalField).d0()) {
                return this.b.get(temporalField);
            }
            return this.a.get(temporalField);
        }
        return u(temporalField).a(y(temporalField), temporalField);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal n(long j, ChronoUnit chronoUnit) {
        return a0(this.a.a(), j$.time.temporal.j.b(this, j, chronoUnit));
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final InterfaceC0079j p(ZoneId zoneId) {
        return l.a0(zoneId, null, this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal t(LocalDate localDate) {
        if (localDate instanceof InterfaceC0071b) {
            return g0(localDate, this.b);
        }
        m a = this.a.a();
        localDate.getClass();
        return a0(a, (C0075f) AbstractC0077h.a(localDate, this));
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final /* synthetic */ long toEpochSecond(ZoneOffset zoneOffset) {
        return AbstractC0077h.n(this, zoneOffset);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final LocalTime toLocalTime() {
        return this.b;
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p u(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (((ChronoField) temporalField).d0()) {
                LocalTime localTime = this.b;
                localTime.getClass();
                return j$.time.temporal.j.d(localTime, temporalField);
            }
            return this.a.u(temporalField);
        }
        return temporalField.G(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.a);
        objectOutput.writeObject(this.b);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long y(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (((ChronoField) temporalField).d0()) {
                return this.b.y(temporalField);
            }
            return this.a.y(temporalField);
        }
        return temporalField.u(this);
    }
}
