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
import java.io.ObjectOutput;

/* loaded from: classes5.dex */
public final class r extends AbstractC0073d {
    private static final long serialVersionUID = -5207853542612002020L;
    private final transient p a;
    private final transient int b;
    private final transient int c;
    private final transient int d;

    private r(p pVar, int i, int i2, int i3) {
        pVar.h0(i, i2, i3);
        this.a = pVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    private int f0() {
        return this.a.g0(this.b, this.c) + this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static r g0(p pVar, int i, int i2, int i3) {
        return new r(pVar, i, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static r h0(p pVar, long j) {
        return new r(pVar, j);
    }

    private r k0(int i, int i2, int i3) {
        p pVar = this.a;
        int j0 = pVar.j0(i, i2);
        if (i3 > j0) {
            i3 = j0;
        }
        return new r(pVar, i, i2, i3);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 6, this);
    }

    @Override // j$.time.chrono.AbstractC0073d, j$.time.chrono.InterfaceC0071b
    public final ChronoLocalDateTime B(LocalTime localTime) {
        return C0075f.b0(this, localTime);
    }

    @Override // j$.time.chrono.AbstractC0073d, j$.time.chrono.InterfaceC0071b
    public final n H() {
        return s.AH;
    }

    @Override // j$.time.chrono.AbstractC0073d, j$.time.chrono.InterfaceC0071b
    public final boolean N() {
        return this.a.W(this.b);
    }

    @Override // j$.time.chrono.AbstractC0073d, j$.time.chrono.InterfaceC0071b
    public final InterfaceC0071b O(TemporalAmount temporalAmount) {
        return (r) super.O(temporalAmount);
    }

    @Override // j$.time.chrono.AbstractC0073d, j$.time.chrono.InterfaceC0071b
    /* renamed from: S */
    public final InterfaceC0071b n(long j, TemporalUnit temporalUnit) {
        return (r) super.n(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC0073d, j$.time.chrono.InterfaceC0071b
    public final int U() {
        return this.a.k0(this.b);
    }

    @Override // j$.time.chrono.InterfaceC0071b
    public final m a() {
        return this.a;
    }

    @Override // j$.time.chrono.AbstractC0073d, j$.time.chrono.InterfaceC0071b, j$.time.temporal.Temporal
    public final InterfaceC0071b d(long j, TemporalUnit temporalUnit) {
        return (r) super.d(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC0073d
    final InterfaceC0071b e0(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = this.b + ((int) j);
        int i = (int) j2;
        if (j2 == i) {
            return k0(i, this.c, this.d);
        }
        throw new ArithmeticException();
    }

    @Override // j$.time.chrono.AbstractC0073d, j$.time.chrono.InterfaceC0071b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.b == rVar.b && this.c == rVar.c && this.d == rVar.d && this.a.equals(rVar.a)) {
            return true;
        }
        return false;
    }

    @Override // j$.time.chrono.AbstractC0073d, j$.time.chrono.InterfaceC0071b
    public final int hashCode() {
        int hashCode = this.a.m().hashCode();
        int i = this.b;
        return (hashCode ^ (i & (-2048))) ^ (((i << 11) + (this.c << 6)) + this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.AbstractC0073d
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public final r c0(long j) {
        return new r(this.a, toEpochDay() + j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.AbstractC0073d
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public final r d0(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.b * 12) + (this.c - 1) + j;
        return k0(this.a.d0(j$.nio.file.attribute.p.f(j2, 12L)), ((int) j$.nio.file.attribute.p.g(j2, 12L)) + 1, this.d);
    }

    @Override // j$.time.chrono.AbstractC0073d, j$.time.chrono.InterfaceC0071b
    /* renamed from: k */
    public final InterfaceC0071b t(j$.time.temporal.k kVar) {
        return (r) super.t(kVar);
    }

    @Override // j$.time.chrono.AbstractC0073d, j$.time.temporal.Temporal
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public final r c(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            p pVar = this.a;
            pVar.Q(chronoField).b(j, chronoField);
            int i = (int) j;
            int i2 = q.a[chronoField.ordinal()];
            int i3 = this.d;
            int i4 = this.c;
            int i5 = this.b;
            switch (i2) {
                case 1:
                    return k0(i5, i4, i);
                case 2:
                    return c0(Math.min(i, U()) - f0());
                case 3:
                    return c0((j - y(ChronoField.ALIGNED_WEEK_OF_MONTH)) * 7);
                case 4:
                    return c0(j - (((int) j$.nio.file.attribute.p.g(toEpochDay() + 3, 7)) + 1));
                case 5:
                    return c0(j - y(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
                case 6:
                    return c0(j - y(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
                case 7:
                    return new r(pVar, j);
                case 8:
                    return c0((j - y(ChronoField.ALIGNED_WEEK_OF_YEAR)) * 7);
                case 9:
                    return k0(i5, i, i3);
                case 10:
                    return d0(j - (((i5 * 12) + i4) - 1));
                case 11:
                    if (i5 < 1) {
                        i = 1 - i;
                    }
                    return k0(i, i4, i3);
                case 12:
                    return k0(i, i4, i3);
                case 13:
                    return k0(1 - i5, i4, i3);
                default:
                    throw new RuntimeException("Unsupported field: ".concat(String.valueOf(temporalField)));
            }
        }
        return (r) super.c(j, temporalField);
    }

    @Override // j$.time.chrono.AbstractC0073d, j$.time.temporal.Temporal
    public final Temporal n(long j, ChronoUnit chronoUnit) {
        return (r) super.n(j, chronoUnit);
    }

    @Override // j$.time.chrono.AbstractC0073d, j$.time.temporal.Temporal
    public final Temporal t(LocalDate localDate) {
        return (r) super.t(localDate);
    }

    @Override // j$.time.chrono.AbstractC0073d, j$.time.chrono.InterfaceC0071b
    public final long toEpochDay() {
        return this.a.h0(this.b, this.c, this.d);
    }

    @Override // j$.time.chrono.AbstractC0073d, j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p u(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (AbstractC0077h.h(this, temporalField)) {
                ChronoField chronoField = (ChronoField) temporalField;
                int i = q.a[chronoField.ordinal()];
                p pVar = this.a;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return pVar.Q(chronoField);
                        }
                        return j$.time.temporal.p.j(1L, 5L);
                    }
                    return j$.time.temporal.p.j(1L, U());
                }
                return j$.time.temporal.p.j(1L, pVar.j0(this.b, this.c));
            }
            throw new RuntimeException("Unsupported field: ".concat(String.valueOf(temporalField)));
        }
        return temporalField.G(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.a);
        objectOutput.writeInt(j$.time.temporal.j.a(this, ChronoField.YEAR));
        objectOutput.writeByte(j$.time.temporal.j.a(this, ChronoField.MONTH_OF_YEAR));
        objectOutput.writeByte(j$.time.temporal.j.a(this, ChronoField.DAY_OF_MONTH));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long y(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i = q.a[((ChronoField) temporalField).ordinal()];
            int i2 = this.c;
            int i3 = 1;
            int i4 = this.d;
            int i5 = this.b;
            switch (i) {
                case 1:
                    return i4;
                case 2:
                    return f0();
                case 3:
                    return ((i4 - 1) / 7) + 1;
                case 4:
                    return ((int) j$.nio.file.attribute.p.g(toEpochDay() + 3, 7)) + 1;
                case 5:
                    return ((i4 - 1) % 7) + 1;
                case 6:
                    return ((f0() - 1) % 7) + 1;
                case 7:
                    return toEpochDay();
                case 8:
                    return ((f0() - 1) / 7) + 1;
                case 9:
                    return i2;
                case 10:
                    return ((i5 * 12) + i2) - 1;
                case 11:
                    return i5;
                case 12:
                    return i5;
                case 13:
                    if (i5 <= 1) {
                        i3 = 0;
                    }
                    return i3;
                default:
                    throw new RuntimeException("Unsupported field: ".concat(String.valueOf(temporalField)));
            }
        }
        return temporalField.u(this);
    }

    @Override // j$.time.chrono.AbstractC0073d, j$.time.temporal.Temporal
    public final Temporal d(long j, TemporalUnit temporalUnit) {
        return (r) super.d(j, temporalUnit);
    }

    private r(p pVar, long j) {
        int[] i0 = pVar.i0((int) j);
        this.a = pVar;
        this.b = i0[0];
        this.c = i0[1];
        this.d = i0[2];
    }
}
