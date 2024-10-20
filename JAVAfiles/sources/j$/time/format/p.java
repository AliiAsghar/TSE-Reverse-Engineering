package j$.time.format;

import j$.time.LocalDate;
import j$.time.chrono.AbstractC0077h;
import j$.time.temporal.TemporalField;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class p extends j {
    static final LocalDate h = LocalDate.of(2000, 1, 1);
    private final LocalDate g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ p(TemporalField temporalField, LocalDate localDate, int i) {
        this(temporalField, 2, 2, localDate, i);
    }

    @Override // j$.time.format.j
    final long b(z zVar, long j) {
        int i;
        long abs = Math.abs(j);
        LocalDate localDate = this.g;
        if (localDate != null) {
            i = AbstractC0077h.q(zVar.d()).q(localDate).get(this.a);
        } else {
            i = 0;
        }
        long j2 = i;
        long[] jArr = j.f;
        if (j >= j2) {
            long j3 = jArr[this.b];
            if (j < j2 + j3) {
                return abs % j3;
            }
        }
        return abs % jArr[this.c];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.format.j
    public final boolean c(w wVar) {
        if (!wVar.l()) {
            return false;
        }
        return super.c(wVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [j$.time.format.o] */
    @Override // j$.time.format.j
    public final int d(final w wVar, final long j, final int i, final int i2) {
        int i3;
        long j2;
        LocalDate localDate = this.g;
        if (localDate != null) {
            i3 = wVar.h().q(localDate).get(this.a);
            wVar.a(new Consumer() { // from class: j$.time.format.o
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void q(Object obj) {
                    p.this.d(wVar, j, i, i2);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } else {
            i3 = 0;
        }
        int i4 = i2 - i;
        int i5 = this.b;
        if (i4 == i5 && j >= 0) {
            long j3 = j.f[i5];
            long j4 = i3;
            long j5 = j4 - (j4 % j3);
            if (i3 > 0) {
                j2 = j5 + j;
            } else {
                j2 = j5 - j;
            }
            j = j2;
            if (j < j4) {
                j += j3;
            }
        }
        return wVar.o(this.a, j, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.format.j
    public final j e() {
        if (this.e == -1) {
            return this;
        }
        return new p(this.a, this.b, this.c, this.g, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.format.j
    public final j f(int i) {
        int i2 = this.e + i;
        return new p(this.a, this.b, this.c, this.g, i2);
    }

    @Override // j$.time.format.j
    public final String toString() {
        return "ReducedValue(" + String.valueOf(this.a) + "," + this.b + "," + this.c + "," + String.valueOf(Objects.requireNonNullElse(this.g, 0)) + ")";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(TemporalField temporalField, LocalDate localDate) {
        this(temporalField, 2, 2, localDate, 0);
        if (localDate == null) {
            long j = 0;
            if (!temporalField.n().i(j)) {
                throw new IllegalArgumentException("The base value must be within the range of the field");
            }
            if (j + j.f[2] > 2147483647L) {
                throw new RuntimeException("Unable to add printer-parser as the range exceeds the capacity of an int");
            }
        }
    }

    private p(TemporalField temporalField, int i, int i2, LocalDate localDate, int i3) {
        super(temporalField, i, i2, G.NOT_NEGATIVE, i3);
        this.g = localDate;
    }
}
