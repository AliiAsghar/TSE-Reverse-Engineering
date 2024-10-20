package j$.time.zone;

import j$.time.ZoneOffset;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.util.TimeZone;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class a implements Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;
    private byte a;
    private Serializable b;

    public a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long a(ObjectInput objectInput) {
        if ((objectInput.readByte() & 255) == 255) {
            return objectInput.readLong();
        }
        return ((((r0 << 16) + ((objectInput.readByte() & 255) << 8)) + (objectInput.readByte() & 255)) * 900) - 4575744000L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ZoneOffset b(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        if (readByte == Byte.MAX_VALUE) {
            return ZoneOffset.ofTotalSeconds(objectInput.readInt());
        }
        return ZoneOffset.ofTotalSeconds(readByte * 900);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(long j, ObjectOutput objectOutput) {
        if (j >= -4575744000L && j < 10413792000L && j % 900 == 0) {
            int i = (int) ((j + 4575744000L) / 900);
            objectOutput.writeByte((i >>> 16) & 255);
            objectOutput.writeByte((i >>> 8) & 255);
            objectOutput.writeByte(i & 255);
            return;
        }
        objectOutput.writeByte(255);
        objectOutput.writeLong(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(ZoneOffset zoneOffset, ObjectOutput objectOutput) {
        int i;
        int i0 = zoneOffset.i0();
        if (i0 % 900 == 0) {
            i = i0 / 900;
        } else {
            i = 127;
        }
        objectOutput.writeByte(i);
        if (i == 127) {
            objectOutput.writeInt(i0);
        }
    }

    private Object readResolve() {
        return this.b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        Serializable l;
        byte readByte = objectInput.readByte();
        this.a = readByte;
        if (readByte != 1) {
            if (readByte != 2) {
                if (readByte != 3) {
                    if (readByte == 100) {
                        l = new e(TimeZone.getTimeZone(objectInput.readUTF()));
                    } else {
                        throw new StreamCorruptedException("Unknown serialized type");
                    }
                } else {
                    l = d.b(objectInput);
                }
            } else {
                long a = a(objectInput);
                ZoneOffset b = b(objectInput);
                ZoneOffset b2 = b(objectInput);
                if (!b.equals(b2)) {
                    l = new b(a, b, b2);
                } else {
                    throw new IllegalArgumentException("Offsets must not be equal");
                }
            }
        } else {
            l = e.l(objectInput);
        }
        this.b = l;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b = this.a;
        Serializable serializable = this.b;
        objectOutput.writeByte(b);
        if (b != 1) {
            if (b != 2) {
                if (b != 3) {
                    if (b == 100) {
                        ((e) serializable).m(objectOutput);
                        return;
                    }
                    throw new InvalidClassException("Unknown serialized type");
                }
                ((d) serializable).writeExternal(objectOutput);
                return;
            }
            ((b) serializable).writeExternal(objectOutput);
            return;
        }
        ((e) serializable).writeExternal(objectOutput);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(byte b, Serializable serializable) {
        this.a = b;
        this.b = serializable;
    }
}
