package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
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
import java.util.List;

/* loaded from: classes5.dex */
final class l implements InterfaceC0079j, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;
    private final transient C0075f a;
    private final transient ZoneOffset b;
    private final transient ZoneId c;

    private l(ZoneId zoneId, ZoneOffset zoneOffset, C0075f c0075f) {
        Objects.a(c0075f, "dateTime");
        this.a = c0075f;
        Objects.a(zoneOffset, "offset");
        this.b = zoneOffset;
        Objects.a(zoneId, "zone");
        this.c = zoneId;
    }

    static l G(m mVar, Temporal temporal) {
        l lVar = (l) temporal;
        if (mVar.equals(lVar.a())) {
            return lVar;
        }
        throw new ClassCastException(j$.time.d.d("Chronology mismatch, required: ", mVar.m(), ", actual: ", lVar.a().m()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static InterfaceC0079j a0(ZoneId zoneId, ZoneOffset zoneOffset, C0075f c0075f) {
        Objects.a(c0075f, "localDateTime");
        Objects.a(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new l(zoneId, (ZoneOffset) zoneId, c0075f);
        }
        j$.time.zone.e b0 = zoneId.b0();
        LocalDateTime b02 = LocalDateTime.b0(c0075f);
        List g = b0.g(b02);
        if (g.size() == 1) {
            zoneOffset = (ZoneOffset) g.get(0);
        } else if (g.size() == 0) {
            j$.time.zone.b f = b0.f(b02);
            c0075f = c0075f.d0(f.u().getSeconds());
            zoneOffset = f.y();
        } else if (zoneOffset == null || !g.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) g.get(0);
        }
        Objects.a(zoneOffset, "offset");
        return new l(zoneId, zoneOffset, c0075f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static l b0(m mVar, Instant instant, ZoneId zoneId) {
        ZoneOffset d = zoneId.b0().d(instant);
        Objects.a(d, "offset");
        return new l(zoneId, d, (C0075f) mVar.F(LocalDateTime.o0(instant.getEpochSecond(), instant.getNano(), d)));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 3, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object D(j$.time.temporal.n nVar) {
        return AbstractC0077h.l(this, nVar);
    }

    @Override // j$.time.chrono.InterfaceC0079j
    public final ChronoLocalDateTime L() {
        return this.a;
    }

    @Override // j$.time.chrono.InterfaceC0079j
    public final /* synthetic */ long Z() {
        return AbstractC0077h.o(this);
    }

    @Override // j$.time.chrono.InterfaceC0079j
    public final m a() {
        return b().a();
    }

    @Override // j$.time.chrono.InterfaceC0079j
    public final InterfaceC0071b b() {
        return ((C0075f) L()).b();
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal c(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            int i = AbstractC0080k.a[chronoField.ordinal()];
            if (i != 1) {
                ZoneId zoneId = this.c;
                C0075f c0075f = this.a;
                if (i != 2) {
                    return a0(zoneId, this.b, c0075f.c(j, temporalField));
                }
                ZoneOffset ofTotalSeconds = ZoneOffset.ofTotalSeconds(chronoField.b0(j));
                c0075f.getClass();
                return b0(a(), AbstractC0077h.p(c0075f, ofTotalSeconds), zoneId);
            }
            return d(j - AbstractC0077h.o(this), ChronoUnit.SECONDS);
        }
        return G(a(), temporalField.D(this, j));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final InterfaceC0079j d(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return G(a(), this.a.d(j, temporalUnit).G(this));
        }
        return G(a(), temporalUnit.n(this, j));
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC0077h.d(this, (InterfaceC0079j) obj);
    }

    @Override // j$.time.temporal.Temporal
    public final long e(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.a(temporal, "endExclusive");
        InterfaceC0079j C = a().C(temporal);
        if (temporalUnit instanceof ChronoUnit) {
            return this.a.e(C.i(this.b).L(), temporalUnit);
        }
        Objects.a(temporalUnit, "unit");
        return temporalUnit.between(this, C);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof InterfaceC0079j) && AbstractC0077h.d(this, (InterfaceC0079j) obj) == 0) {
            return true;
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField) && (temporalField == null || !temporalField.y(this))) {
            return false;
        }
        return true;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int get(TemporalField temporalField) {
        return AbstractC0077h.e(this, temporalField);
    }

    @Override // j$.time.chrono.InterfaceC0079j
    public final ZoneOffset h() {
        return this.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.hashCode()) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    @Override // j$.time.chrono.InterfaceC0079j
    public final InterfaceC0079j i(ZoneId zoneId) {
        Objects.a(zoneId, "zone");
        if (this.c.equals(zoneId)) {
            return this;
        }
        C0075f c0075f = this.a;
        c0075f.getClass();
        return b0(a(), AbstractC0077h.p(c0075f, this.b), zoneId);
    }

    @Override // j$.time.chrono.InterfaceC0079j
    public final InterfaceC0079j j(ZoneId zoneId) {
        return a0(zoneId, this.b, this.a);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal n(long j, ChronoUnit chronoUnit) {
        return G(a(), j$.time.temporal.j.b(this, j, chronoUnit));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal t(LocalDate localDate) {
        return G(a(), localDate.G(this));
    }

    @Override // j$.time.chrono.InterfaceC0079j
    public final LocalTime toLocalTime() {
        return ((C0075f) L()).toLocalTime();
    }

    public final String toString() {
        String c0075f = this.a.toString();
        ZoneOffset zoneOffset = this.b;
        String str = c0075f + zoneOffset.toString();
        ZoneId zoneId = this.c;
        if (zoneOffset != zoneId) {
            return str + "[" + zoneId.toString() + "]";
        }
        return str;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p u(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField != ChronoField.INSTANT_SECONDS && temporalField != ChronoField.OFFSET_SECONDS) {
                return ((C0075f) L()).u(temporalField);
            }
            return ((ChronoField) temporalField).n();
        }
        return temporalField.G(this);
    }

    @Override // j$.time.chrono.InterfaceC0079j
    public final ZoneId w() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.a);
        objectOutput.writeObject(this.b);
        objectOutput.writeObject(this.c);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long y(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i = AbstractC0078i.a[((ChronoField) temporalField).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return ((C0075f) L()).y(temporalField);
                }
                return h().i0();
            }
            return Z();
        }
        return temporalField.u(this);
    }
}
