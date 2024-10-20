package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class B extends AbstractC0070a implements Serializable {
    public static final B d = new B();
    private static final long serialVersionUID = 1039765215346859963L;

    private B() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0071b A(int i, int i2) {
        return new D(LocalDate.r0(i + 1911, i2));
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0071b M(int i, int i2, int i3) {
        return new D(LocalDate.of(i + 1911, i2, i3));
    }

    @Override // j$.time.chrono.AbstractC0070a, j$.time.chrono.m
    public final InterfaceC0071b P(Map map, j$.time.format.F f) {
        return (D) super.P(map, f);
    }

    @Override // j$.time.chrono.m
    public final j$.time.temporal.p Q(ChronoField chronoField) {
        int i = A.a[chronoField.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return chronoField.n();
                }
                j$.time.temporal.p n = ChronoField.YEAR.n();
                return j$.time.temporal.p.j(n.e() - 1911, n.d() - 1911);
            }
            j$.time.temporal.p n2 = ChronoField.YEAR.n();
            return j$.time.temporal.p.k(1L, n2.d() - 1911, (-n2.e()) + 1912);
        }
        j$.time.temporal.p n3 = ChronoField.PROLEPTIC_MONTH.n();
        return j$.time.temporal.p.j(n3.e() - 22932, n3.d() - 22932);
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0079j R(Instant instant, ZoneId zoneId) {
        return l.b0(this, instant, zoneId);
    }

    @Override // j$.time.chrono.m
    public final List T() {
        return j$.desugar.sun.nio.fs.g.b(E.values());
    }

    @Override // j$.time.chrono.m
    public final boolean W(long j) {
        return t.d.W(j + 1911);
    }

    @Override // j$.time.chrono.m
    public final n X(int i) {
        if (i != 0) {
            if (i == 1) {
                return E.ROC;
            }
            throw new RuntimeException("Invalid era: " + i);
        }
        return E.BEFORE_ROC;
    }

    @Override // j$.time.chrono.m
    public final int g(n nVar, int i) {
        if (nVar instanceof E) {
            if (nVar != E.ROC) {
                return 1 - i;
            }
            return i;
        }
        throw new ClassCastException("Era must be MinguoEra");
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0071b l(long j) {
        return new D(LocalDate.q0(j));
    }

    @Override // j$.time.chrono.m
    public final String m() {
        return "Minguo";
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0071b q(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof D) {
            return (D) temporalAccessor;
        }
        return new D(LocalDate.c0(temporalAccessor));
    }

    @Override // j$.time.chrono.AbstractC0070a
    public final InterfaceC0071b t() {
        return new D(LocalDate.c0(LocalDate.o0(j$.time.b.c())));
    }

    Object writeReplace() {
        return new F((byte) 1, this);
    }

    @Override // j$.time.chrono.m
    public final String x() {
        return "roc";
    }
}
