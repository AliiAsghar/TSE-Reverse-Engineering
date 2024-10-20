package j$.time;

import j$.time.temporal.ChronoField;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class ZoneOffset extends ZoneId implements TemporalAccessor, j$.time.temporal.k, Comparable<ZoneOffset>, Serializable {
    private static final long serialVersionUID = 2357656521762053153L;
    private final int b;
    private final transient String c;
    private static final ConcurrentHashMap d = new ConcurrentHashMap(16, 0.75f, 4);
    private static final ConcurrentHashMap e = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ZoneOffset UTC = ofTotalSeconds(0);
    public static final ZoneOffset f = ofTotalSeconds(-64800);
    public static final ZoneOffset g = ofTotalSeconds(64800);

    private ZoneOffset(int i) {
        String str;
        String str2;
        String str3;
        String sb;
        this.b = i;
        if (i == 0) {
            sb = "Z";
        } else {
            int abs = Math.abs(i);
            StringBuilder sb2 = new StringBuilder();
            int i2 = abs / 3600;
            int i3 = (abs / 60) % 60;
            if (i < 0) {
                str = "-";
            } else {
                str = "+";
            }
            sb2.append(str);
            if (i2 < 10) {
                str2 = "0";
            } else {
                str2 = "";
            }
            sb2.append(str2);
            sb2.append(i2);
            if (i3 >= 10) {
                str3 = ":";
            } else {
                str3 = ":0";
            }
            sb2.append(str3);
            sb2.append(i3);
            int i4 = abs % 60;
            if (i4 != 0) {
                sb2.append(i4 < 10 ? ":0" : ":");
                sb2.append(i4);
            }
            sb = sb2.toString();
        }
        this.c = sb;
    }

    public static ZoneOffset h0(Temporal temporal) {
        Objects.a(temporal, "temporal");
        ZoneOffset zoneOffset = (ZoneOffset) temporal.D(j$.time.temporal.j.i());
        if (zoneOffset != null) {
            return zoneOffset;
        }
        throw new RuntimeException(d.d("Unable to obtain ZoneOffset from TemporalAccessor: ", String.valueOf(temporal), " of type ", temporal.getClass().getName()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static j$.time.ZoneOffset j0(java.lang.String r7) {
        /*
            java.lang.String r0 = "offsetId"
            j$.util.Objects.a(r7, r0)
            j$.util.concurrent.ConcurrentHashMap r0 = j$.time.ZoneOffset.e
            java.lang.Object r0 = r0.get(r7)
            j$.time.ZoneOffset r0 = (j$.time.ZoneOffset) r0
            if (r0 == 0) goto L10
            return r0
        L10:
            int r0 = r7.length()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L63
            r1 = 3
            if (r0 == r1) goto L7f
            r4 = 5
            if (r0 == r4) goto L5a
            r5 = 6
            r6 = 4
            if (r0 == r5) goto L50
            r5 = 7
            if (r0 == r5) goto L43
            r1 = 9
            if (r0 != r1) goto L37
            int r0 = l0(r7, r2, r3)
            int r1 = l0(r7, r6, r2)
            int r2 = l0(r7, r5, r2)
            goto L85
        L37:
            j$.time.DateTimeException r0 = new j$.time.DateTimeException
            java.lang.String r1 = "Invalid ID for ZoneOffset, invalid format: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L43:
            int r0 = l0(r7, r2, r3)
            int r1 = l0(r7, r1, r3)
            int r2 = l0(r7, r4, r3)
            goto L85
        L50:
            int r0 = l0(r7, r2, r3)
            int r1 = l0(r7, r6, r2)
        L58:
            r2 = 0
            goto L85
        L5a:
            int r0 = l0(r7, r2, r3)
            int r1 = l0(r7, r1, r3)
            goto L58
        L63:
            char r0 = r7.charAt(r3)
            char r7 = r7.charAt(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
        L7f:
            int r0 = l0(r7, r2, r3)
            r1 = 0
            goto L58
        L85:
            char r3 = r7.charAt(r3)
            r4 = 43
            r5 = 45
            if (r3 == r4) goto L9e
            if (r3 != r5) goto L92
            goto L9e
        L92:
            j$.time.DateTimeException r0 = new j$.time.DateTimeException
            java.lang.String r1 = "Invalid ID for ZoneOffset, plus/minus not found when expected: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L9e:
            if (r3 != r5) goto La8
            int r7 = -r0
            int r0 = -r1
            int r1 = -r2
            j$.time.ZoneOffset r7 = k0(r7, r0, r1)
            return r7
        La8:
            j$.time.ZoneOffset r7 = k0(r0, r1, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.ZoneOffset.j0(java.lang.String):j$.time.ZoneOffset");
    }

    public static ZoneOffset k0(int i, int i2, int i3) {
        if (i >= -18 && i <= 18) {
            if (i > 0) {
                if (i2 < 0 || i3 < 0) {
                    throw new RuntimeException("Zone offset minutes and seconds must be positive because hours is positive");
                }
            } else if (i < 0) {
                if (i2 > 0 || i3 > 0) {
                    throw new RuntimeException("Zone offset minutes and seconds must be negative because hours is negative");
                }
            } else if ((i2 > 0 && i3 < 0) || (i2 < 0 && i3 > 0)) {
                throw new RuntimeException("Zone offset minutes and seconds must have the same sign");
            }
            if (i2 >= -59 && i2 <= 59) {
                if (i3 >= -59 && i3 <= 59) {
                    if (Math.abs(i) == 18 && (i2 | i3) != 0) {
                        throw new RuntimeException("Zone offset not in valid range: -18:00 to +18:00");
                    }
                    return ofTotalSeconds((i2 * 60) + (i * 3600) + i3);
                }
                throw new RuntimeException("Zone offset seconds not in valid range: value " + i3 + " is not in the range -59 to 59");
            }
            throw new RuntimeException("Zone offset minutes not in valid range: value " + i2 + " is not in the range -59 to 59");
        }
        throw new RuntimeException("Zone offset hours not in valid range: value " + i + " is not in the range -18 to 18");
    }

    private static int l0(String str, int i, boolean z) {
        if (z && str.charAt(i - 1) != ':') {
            throw new RuntimeException("Invalid ID for ZoneOffset, colon not found when expected: ".concat(str));
        }
        char charAt = str.charAt(i);
        char charAt2 = str.charAt(i + 1);
        if (charAt >= '0' && charAt <= '9' && charAt2 >= '0' && charAt2 <= '9') {
            return (charAt2 - '0') + ((charAt - '0') * 10);
        }
        throw new RuntimeException("Invalid ID for ZoneOffset, non numeric characters found: ".concat(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ZoneOffset m0(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        if (readByte == Byte.MAX_VALUE) {
            return ofTotalSeconds(objectInput.readInt());
        }
        return ofTotalSeconds(readByte * 900);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ZoneOffset ofTotalSeconds(int i) {
        if (i >= -64800 && i <= 64800) {
            if (i % 900 == 0) {
                Integer valueOf = Integer.valueOf(i);
                ConcurrentHashMap concurrentHashMap = d;
                ZoneOffset zoneOffset = (ZoneOffset) concurrentHashMap.get(valueOf);
                if (zoneOffset == null) {
                    concurrentHashMap.putIfAbsent(valueOf, new ZoneOffset(i));
                    ZoneOffset zoneOffset2 = (ZoneOffset) concurrentHashMap.get(valueOf);
                    e.putIfAbsent(zoneOffset2.c, zoneOffset2);
                    return zoneOffset2;
                }
                return zoneOffset;
            }
            return new ZoneOffset(i);
        }
        throw new RuntimeException("Zone offset not in valid range: -18:00 to +18:00");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 8, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object D(j$.time.temporal.n nVar) {
        if (nVar != j$.time.temporal.j.i() && nVar != j$.time.temporal.j.k()) {
            return j$.time.temporal.j.c(this, nVar);
        }
        return this;
    }

    @Override // j$.time.temporal.k
    public final Temporal G(Temporal temporal) {
        return temporal.c(this.b, ChronoField.OFFSET_SECONDS);
    }

    @Override // j$.time.ZoneId
    public final j$.time.zone.e b0() {
        return j$.time.zone.e.j(this);
    }

    @Override // j$.time.ZoneId
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZoneOffset)) {
            return false;
        }
        if (this.b == ((ZoneOffset) obj).b) {
            return true;
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField != ChronoField.OFFSET_SECONDS) {
                return false;
            }
            return true;
        }
        if (temporalField == null || !temporalField.y(this)) {
            return false;
        }
        return true;
    }

    @Override // j$.time.ZoneId
    final void f0(ObjectOutput objectOutput) {
        objectOutput.writeByte(8);
        n0(objectOutput);
    }

    @Override // java.lang.Comparable
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ZoneOffset zoneOffset) {
        return zoneOffset.b - this.b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        if (temporalField == ChronoField.OFFSET_SECONDS) {
            return this.b;
        }
        if (!(temporalField instanceof ChronoField)) {
            return j$.time.temporal.j.d(this, temporalField).a(y(temporalField), temporalField);
        }
        throw new RuntimeException("Unsupported field: ".concat(String.valueOf(temporalField)));
    }

    @Override // j$.time.ZoneId
    public final int hashCode() {
        return this.b;
    }

    public final int i0() {
        return this.b;
    }

    @Override // j$.time.ZoneId
    public final String m() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n0(DataOutput dataOutput) {
        int i;
        int i2 = this.b;
        if (i2 % 900 == 0) {
            i = i2 / 900;
        } else {
            i = 127;
        }
        dataOutput.writeByte(i);
        if (i == 127) {
            dataOutput.writeInt(i2);
        }
    }

    @Override // j$.time.ZoneId
    public final String toString() {
        return this.c;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p u(TemporalField temporalField) {
        return j$.time.temporal.j.d(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long y(TemporalField temporalField) {
        if (temporalField == ChronoField.OFFSET_SECONDS) {
            return this.b;
        }
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.u(this);
        }
        throw new RuntimeException("Unsupported field: ".concat(String.valueOf(temporalField)));
    }
}
