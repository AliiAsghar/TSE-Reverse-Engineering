package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class H extends AbstractC0070a implements Serializable {
    public static final H d = new H();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        hashMap.put("en", new String[]{"BB", "BE"});
        hashMap.put("th", new String[]{"BB", "BE"});
        hashMap2.put("en", new String[]{"B.B.", "B.E."});
        hashMap2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        hashMap3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        hashMap3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    private H() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0071b A(int i, int i2) {
        return new J(LocalDate.r0(i - 543, i2));
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0071b M(int i, int i2, int i3) {
        return new J(LocalDate.of(i - 543, i2, i3));
    }

    @Override // j$.time.chrono.AbstractC0070a, j$.time.chrono.m
    public final InterfaceC0071b P(Map map, j$.time.format.F f) {
        return (J) super.P(map, f);
    }

    @Override // j$.time.chrono.m
    public final j$.time.temporal.p Q(ChronoField chronoField) {
        int i = G.a[chronoField.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return chronoField.n();
                }
                j$.time.temporal.p n = ChronoField.YEAR.n();
                return j$.time.temporal.p.j(n.e() + 543, n.d() + 543);
            }
            j$.time.temporal.p n2 = ChronoField.YEAR.n();
            return j$.time.temporal.p.k(1L, (-(n2.e() + 543)) + 1, n2.d() + 543);
        }
        j$.time.temporal.p n3 = ChronoField.PROLEPTIC_MONTH.n();
        return j$.time.temporal.p.j(n3.e() + 6516, n3.d() + 6516);
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0079j R(Instant instant, ZoneId zoneId) {
        return l.b0(this, instant, zoneId);
    }

    @Override // j$.time.chrono.m
    public final List T() {
        return j$.desugar.sun.nio.fs.g.b(K.values());
    }

    @Override // j$.time.chrono.m
    public final boolean W(long j) {
        return t.d.W(j - 543);
    }

    @Override // j$.time.chrono.m
    public final n X(int i) {
        if (i != 0) {
            if (i == 1) {
                return K.BE;
            }
            throw new RuntimeException("Invalid era: " + i);
        }
        return K.BEFORE_BE;
    }

    @Override // j$.time.chrono.m
    public final int g(n nVar, int i) {
        if (nVar instanceof K) {
            if (nVar != K.BE) {
                return 1 - i;
            }
            return i;
        }
        throw new ClassCastException("Era must be BuddhistEra");
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0071b l(long j) {
        return new J(LocalDate.q0(j));
    }

    @Override // j$.time.chrono.m
    public final String m() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0071b q(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof J) {
            return (J) temporalAccessor;
        }
        return new J(LocalDate.c0(temporalAccessor));
    }

    @Override // j$.time.chrono.AbstractC0070a
    public final InterfaceC0071b t() {
        return new J(LocalDate.c0(LocalDate.o0(j$.time.b.c())));
    }

    Object writeReplace() {
        return new F((byte) 1, this);
    }

    @Override // j$.time.chrono.m
    public final String x() {
        return "buddhist";
    }
}
