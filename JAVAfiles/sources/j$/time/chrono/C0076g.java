package j$.time.chrono;

import j$.time.Instant;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* renamed from: j$.time.chrono.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C0076g implements TemporalAmount, Serializable {
    public static final /* synthetic */ int e = 0;
    private static final long serialVersionUID = 57387258289L;
    private final m a;
    final int b;
    final int c;
    final int d;

    static {
        j$.desugar.sun.nio.fs.g.b(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0076g(m mVar, int i, int i2, int i3) {
        this.a = mVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    private long a() {
        j$.time.temporal.p Q = this.a.Q(ChronoField.MONTH_OF_YEAR);
        if (Q.g() && Q.h()) {
            return (Q.d() - Q.e()) + 1;
        }
        return -1L;
    }

    private void b(Temporal temporal) {
        m mVar = (m) temporal.D(j$.time.temporal.j.e());
        if (mVar != null) {
            m mVar2 = this.a;
            if (!mVar2.equals(mVar)) {
                throw new RuntimeException(j$.time.d.d("Chronology mismatch, expected: ", mVar2.m(), ", actual: ", mVar.m()));
            }
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0076g)) {
            return false;
        }
        C0076g c0076g = (C0076g) obj;
        if (this.b == c0076g.b && this.c == c0076g.c && this.d == c0076g.d && this.a.equals(c0076g.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ (Integer.rotateLeft(this.d, 16) + (Integer.rotateLeft(this.c, 8) + this.b));
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal n(Temporal temporal) {
        b(temporal);
        int i = this.b;
        int i2 = this.c;
        if (i2 == 0) {
            if (i != 0) {
                temporal = temporal.d(i, ChronoUnit.YEARS);
            }
        } else {
            long a = a();
            if (a > 0) {
                temporal = temporal.d((i * a) + i2, ChronoUnit.MONTHS);
            } else {
                if (i != 0) {
                    temporal = temporal.d(i, ChronoUnit.YEARS);
                }
                temporal = temporal.d(i2, ChronoUnit.MONTHS);
            }
        }
        int i3 = this.d;
        if (i3 != 0) {
            return temporal.d(i3, ChronoUnit.DAYS);
        }
        return temporal;
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal t(Instant instant) {
        b(instant);
        int i = this.b;
        int i2 = this.c;
        if (i2 == 0) {
            if (i != 0) {
                instant = instant.n(i, ChronoUnit.YEARS);
            }
        } else {
            long a = a();
            if (a > 0) {
                instant = instant.n((i * a) + i2, ChronoUnit.MONTHS);
            } else {
                if (i != 0) {
                    instant = instant.n(i, ChronoUnit.YEARS);
                }
                instant = instant.n(i2, ChronoUnit.MONTHS);
            }
        }
        int i3 = this.d;
        if (i3 != 0) {
            return instant.n(i3, ChronoUnit.DAYS);
        }
        return instant;
    }

    public final String toString() {
        m mVar = this.a;
        int i = this.d;
        int i2 = this.c;
        int i3 = this.b;
        if (i3 == 0 && i2 == 0 && i == 0) {
            return mVar.toString() + " P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(mVar.toString());
        sb.append(" P");
        if (i3 != 0) {
            sb.append(i3);
            sb.append('Y');
        }
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        if (i != 0) {
            sb.append(i);
            sb.append('D');
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeUTF(this.a.m());
        objectOutput.writeInt(this.b);
        objectOutput.writeInt(this.c);
        objectOutput.writeInt(this.d);
    }

    protected Object writeReplace() {
        return new F((byte) 9, this);
    }
}
