package j$.time.zone;

import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.ZoneOffset;
import j$.time.chrono.t;
import j$.time.temporal.l;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class d implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;
    private final j$.time.i a;
    private final byte b;
    private final DayOfWeek c;
    private final LocalTime d;
    private final boolean e;
    private final c f;
    private final ZoneOffset g;
    private final ZoneOffset h;
    private final ZoneOffset i;

    d(j$.time.i iVar, int i, DayOfWeek dayOfWeek, LocalTime localTime, boolean z, c cVar, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.a = iVar;
        this.b = (byte) i;
        this.c = dayOfWeek;
        this.d = localTime;
        this.e = z;
        this.f = cVar;
        this.g = zoneOffset;
        this.h = zoneOffset2;
        this.i = zoneOffset3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d b(ObjectInput objectInput) {
        DayOfWeek a0;
        LocalTime of;
        int i;
        ZoneOffset ofTotalSeconds;
        ZoneOffset ofTotalSeconds2;
        boolean z;
        int readInt = objectInput.readInt();
        j$.time.i d0 = j$.time.i.d0(readInt >>> 28);
        int i2 = ((264241152 & readInt) >>> 22) - 32;
        int i3 = (3670016 & readInt) >>> 19;
        if (i3 == 0) {
            a0 = null;
        } else {
            a0 = DayOfWeek.a0(i3);
        }
        DayOfWeek dayOfWeek = a0;
        int i4 = (507904 & readInt) >>> 14;
        c cVar = c.values()[(readInt & 12288) >>> 12];
        int i5 = (readInt & 4080) >>> 4;
        int i6 = (readInt & 12) >>> 2;
        int i7 = readInt & 3;
        if (i4 == 31) {
            of = LocalTime.k0(objectInput.readInt());
        } else {
            of = LocalTime.of(i4 % 24, 0);
        }
        if (i5 == 255) {
            i = objectInput.readInt();
        } else {
            i = (i5 - 128) * 900;
        }
        ZoneOffset ofTotalSeconds3 = ZoneOffset.ofTotalSeconds(i);
        if (i6 == 3) {
            ofTotalSeconds = ZoneOffset.ofTotalSeconds(objectInput.readInt());
        } else {
            ofTotalSeconds = ZoneOffset.ofTotalSeconds((i6 * 1800) + ofTotalSeconds3.i0());
        }
        ZoneOffset zoneOffset = ofTotalSeconds;
        if (i7 == 3) {
            ofTotalSeconds2 = ZoneOffset.ofTotalSeconds(objectInput.readInt());
        } else {
            ofTotalSeconds2 = ZoneOffset.ofTotalSeconds((i7 * 1800) + ofTotalSeconds3.i0());
        }
        if (i4 == 24) {
            z = true;
        } else {
            z = false;
        }
        Objects.a(d0, "month");
        Objects.a(of, "time");
        Objects.a(cVar, "timeDefnition");
        Objects.a(ofTotalSeconds3, "standardOffset");
        Objects.a(zoneOffset, "offsetBefore");
        Objects.a(ofTotalSeconds2, "offsetAfter");
        if (i2 >= -28 && i2 <= 31 && i2 != 0) {
            if (z && !of.equals(LocalTime.g)) {
                throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
            }
            if (of.g0() == 0) {
                return new d(d0, i2, dayOfWeek, of, z, cVar, ofTotalSeconds3, zoneOffset, ofTotalSeconds2);
            }
            throw new IllegalArgumentException("Time's nano-of-second must be zero");
        }
        throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    public final b a(int i) {
        LocalDate p0;
        j$.time.i iVar = this.a;
        DayOfWeek dayOfWeek = this.c;
        byte b = this.b;
        if (b < 0) {
            p0 = LocalDate.p0(i, iVar, iVar.b0(t.d.W(i)) + 1 + b);
            if (dayOfWeek != null) {
                p0 = p0.k(new l(dayOfWeek.getValue(), 1));
            }
        } else {
            p0 = LocalDate.p0(i, iVar, b);
            if (dayOfWeek != null) {
                p0 = p0.k(new l(dayOfWeek.getValue(), 0));
            }
        }
        if (this.e) {
            p0 = p0.plusDays(1L);
        }
        LocalDateTime n0 = LocalDateTime.n0(p0, this.d);
        int ordinal = this.f.ordinal();
        ZoneOffset zoneOffset = this.h;
        if (ordinal != 0) {
            if (ordinal == 2) {
                n0 = n0.r0(zoneOffset.i0() - this.g.i0());
            }
        } else {
            n0 = n0.r0(zoneOffset.i0() - ZoneOffset.UTC.i0());
        }
        return new b(n0, zoneOffset, this.i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.a == dVar.a && this.b == dVar.b && this.c == dVar.c && this.f == dVar.f && this.d.equals(dVar.d) && this.e == dVar.e && this.g.equals(dVar.g) && this.h.equals(dVar.h) && this.i.equals(dVar.i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int ordinal;
        int s0 = ((this.d.s0() + (this.e ? 1 : 0)) << 15) + (this.a.ordinal() << 11) + ((this.b + 32) << 5);
        DayOfWeek dayOfWeek = this.c;
        if (dayOfWeek == null) {
            ordinal = 7;
        } else {
            ordinal = dayOfWeek.ordinal();
        }
        return ((this.g.hashCode() ^ (this.f.ordinal() + (s0 + (ordinal << 2)))) ^ this.h.hashCode()) ^ this.i.hashCode();
    }

    public final String toString() {
        String str;
        String localTime;
        StringBuilder sb = new StringBuilder("TransitionRule[");
        ZoneOffset zoneOffset = this.h;
        ZoneOffset zoneOffset2 = this.i;
        if (zoneOffset.compareTo(zoneOffset2) > 0) {
            str = "Gap ";
        } else {
            str = "Overlap ";
        }
        sb.append(str);
        sb.append(zoneOffset);
        sb.append(" to ");
        sb.append(zoneOffset2);
        sb.append(", ");
        j$.time.i iVar = this.a;
        byte b = this.b;
        DayOfWeek dayOfWeek = this.c;
        if (dayOfWeek != null) {
            if (b == -1) {
                sb.append(dayOfWeek.name());
                sb.append(" on or before last day of ");
                sb.append(iVar.name());
            } else if (b < 0) {
                sb.append(dayOfWeek.name());
                sb.append(" on or before last day minus ");
                sb.append((-b) - 1);
                sb.append(" of ");
                sb.append(iVar.name());
            } else {
                sb.append(dayOfWeek.name());
                sb.append(" on or after ");
                sb.append(iVar.name());
                sb.append(' ');
                sb.append((int) b);
            }
        } else {
            sb.append(iVar.name());
            sb.append(' ');
            sb.append((int) b);
        }
        sb.append(" at ");
        if (this.e) {
            localTime = "24:00";
        } else {
            localTime = this.d.toString();
        }
        sb.append(localTime);
        sb.append(" ");
        sb.append(this.f);
        sb.append(", standard offset ");
        sb.append(this.g);
        sb.append(']');
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        int s0;
        int i;
        int i2;
        int i3;
        int i4;
        int value;
        LocalTime localTime = this.d;
        boolean z = this.e;
        if (z) {
            s0 = 86400;
        } else {
            s0 = localTime.s0();
        }
        int i0 = this.g.i0();
        ZoneOffset zoneOffset = this.h;
        int i02 = zoneOffset.i0() - i0;
        ZoneOffset zoneOffset2 = this.i;
        int i03 = zoneOffset2.i0() - i0;
        if (s0 % 3600 == 0) {
            if (z) {
                i = 24;
            } else {
                i = localTime.e0();
            }
        } else {
            i = 31;
        }
        if (i0 % 900 == 0) {
            i2 = (i0 / 900) + 128;
        } else {
            i2 = 255;
        }
        if (i02 != 0 && i02 != 1800 && i02 != 3600) {
            i3 = 3;
        } else {
            i3 = i02 / 1800;
        }
        if (i03 != 0 && i03 != 1800 && i03 != 3600) {
            i4 = 3;
        } else {
            i4 = i03 / 1800;
        }
        DayOfWeek dayOfWeek = this.c;
        if (dayOfWeek == null) {
            value = 0;
        } else {
            value = dayOfWeek.getValue();
        }
        objectOutput.writeInt((this.a.getValue() << 28) + ((this.b + 32) << 22) + (value << 19) + (i << 14) + (this.f.ordinal() << 12) + (i2 << 4) + (i3 << 2) + i4);
        if (i == 31) {
            objectOutput.writeInt(s0);
        }
        if (i2 == 255) {
            objectOutput.writeInt(i0);
        }
        if (i3 == 3) {
            objectOutput.writeInt(zoneOffset.i0());
        }
        if (i4 == 3) {
            objectOutput.writeInt(zoneOffset2.i0());
        }
    }
}
