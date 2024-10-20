package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.temporal.ChronoField;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class z implements n, Serializable {
    public static final z d;
    private static final z[] e;
    private static final long serialVersionUID = 1466499369062886794L;
    private final transient int a;
    private final transient LocalDate b;
    private final transient String c;

    static {
        z zVar = new z(-1, LocalDate.of(1868, 1, 1), "Meiji");
        d = zVar;
        z zVar2 = new z(0, LocalDate.of(1912, 7, 30), "Taisho");
        z zVar3 = new z(1, LocalDate.of(1926, 12, 25), "Showa");
        z zVar4 = new z(2, LocalDate.of(1989, 1, 8), "Heisei");
        z zVar5 = new z(3, LocalDate.of(2019, 5, 1), "Reiwa");
        e = r8;
        z[] zVarArr = {zVar, zVar2, zVar3, zVar4, zVar5};
    }

    private z(int i, LocalDate localDate, String str) {
        this.a = i;
        this.b = localDate;
        this.c = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static z g(LocalDate localDate) {
        if (!localDate.k0(y.d)) {
            z[] zVarArr = e;
            for (int length = zVarArr.length - 1; length >= 0; length--) {
                z zVar = zVarArr[length];
                if (localDate.compareTo(zVar.b) >= 0) {
                    return zVar;
                }
            }
            return null;
        }
        throw new RuntimeException("JapaneseDate before Meiji 6 are not supported");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static z l() {
        return e[r0.length - 1];
    }

    public static z q(int i) {
        int i2 = i + 1;
        if (i2 >= 0) {
            z[] zVarArr = e;
            if (i2 < zVarArr.length) {
                return zVarArr[i2];
            }
        }
        throw new RuntimeException("Invalid era: " + i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long r() {
        long f = ChronoField.DAY_OF_YEAR.n().f();
        for (z zVar : e) {
            f = Math.min(f, (zVar.b.U() - zVar.b.g0()) + 1);
            if (zVar.o() != null) {
                f = Math.min(f, zVar.o().b.g0() - 1);
            }
        }
        return f;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long s() {
        int j0 = 1000000000 - l().b.j0();
        z[] zVarArr = e;
        int j02 = zVarArr[0].b.j0();
        for (int i = 1; i < zVarArr.length; i++) {
            z zVar = zVarArr[i];
            j0 = Math.min(j0, (zVar.b.j0() - j02) + 1);
            j02 = zVar.b.j0();
        }
        return j0;
    }

    public static z[] v() {
        z[] zVarArr = e;
        return (z[]) Arrays.copyOf(zVarArr, zVarArr.length);
    }

    private Object writeReplace() {
        return new F((byte) 5, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object D(j$.time.temporal.n nVar) {
        return AbstractC0077h.m(this, nVar);
    }

    @Override // j$.time.temporal.k
    public final Temporal G(Temporal temporal) {
        return temporal.c(getValue(), ChronoField.ERA);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ boolean f(TemporalField temporalField) {
        return AbstractC0077h.i(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int get(TemporalField temporalField) {
        return AbstractC0077h.f(this, temporalField);
    }

    @Override // j$.time.chrono.n
    public final int getValue() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final LocalDate m() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final z o() {
        if (this == l()) {
            return null;
        }
        return q(this.a + 1);
    }

    public final String toString() {
        return this.c;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p u(TemporalField temporalField) {
        ChronoField chronoField = ChronoField.ERA;
        if (temporalField == chronoField) {
            return w.d.Q(chronoField);
        }
        return j$.time.temporal.j.d(this, temporalField);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void x(DataOutput dataOutput) {
        dataOutput.writeByte(this.a);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ long y(TemporalField temporalField) {
        return AbstractC0077h.g(this, temporalField);
    }
}
