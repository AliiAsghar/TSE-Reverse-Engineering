package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class Period implements TemporalAmount, Serializable {
    public static final Period d = new Period(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;
    private final int a;
    private final int b;
    private final int c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        j$.desugar.sun.nio.fs.g.b(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    private Period(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static Period b(int i) {
        if (i == 0) {
            return d;
        }
        return new Period(0, 0, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Period c(ObjectInput objectInput) {
        int readInt = objectInput.readInt();
        int readInt2 = objectInput.readInt();
        int readInt3 = objectInput.readInt();
        if ((readInt | readInt2 | readInt3) == 0) {
            return d;
        }
        return new Period(readInt, readInt2, readInt3);
    }

    private static void e(Temporal temporal) {
        j$.time.chrono.m mVar = (j$.time.chrono.m) temporal.D(j$.time.temporal.j.e());
        if (mVar != null && !j$.time.chrono.t.d.equals(mVar)) {
            throw new RuntimeException("Chronology mismatch, expected: ISO, actual: " + mVar.m());
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 14, this);
    }

    public final int a() {
        return this.c;
    }

    public final long d() {
        return (this.a * 12) + this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Period)) {
            return false;
        }
        Period period = (Period) obj;
        if (this.a == period.a && this.b == period.b && this.c == period.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.c, 16) + Integer.rotateLeft(this.b, 8) + this.a;
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal n(Temporal temporal) {
        e(temporal);
        if (this.b == 0) {
            int i = this.a;
            if (i != 0) {
                temporal = temporal.d(i, ChronoUnit.YEARS);
            }
        } else {
            long d2 = d();
            if (d2 != 0) {
                temporal = temporal.d(d2, ChronoUnit.MONTHS);
            }
        }
        int i2 = this.c;
        if (i2 != 0) {
            return temporal.d(i2, ChronoUnit.DAYS);
        }
        return temporal;
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal t(Instant instant) {
        e(instant);
        if (this.b == 0) {
            int i = this.a;
            if (i != 0) {
                instant = instant.n(i, ChronoUnit.YEARS);
            }
        } else {
            long d2 = d();
            if (d2 != 0) {
                instant = instant.n(d2, ChronoUnit.MONTHS);
            }
        }
        int i2 = this.c;
        if (i2 != 0) {
            return instant.n(i2, ChronoUnit.DAYS);
        }
        return instant;
    }

    public String toString() {
        if (this == d) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder("P");
        int i = this.a;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.b;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.c;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeInt(this.a);
        objectOutput.writeInt(this.b);
        objectOutput.writeInt(this.c);
    }
}
