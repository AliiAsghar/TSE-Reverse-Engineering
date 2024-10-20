package defpackage;

import j$.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fca {
    public static final fca a;
    public final int b;
    public final int c;
    public final alpt d;

    static {
        fca fcaVar;
        if (eul.a >= 33) {
            alpr alprVar = new alpr();
            for (int i = 1; i <= 10; i++) {
                alprVar.c(Integer.valueOf(eul.h(i)));
            }
            fcaVar = new fca(2, alprVar.g());
        } else {
            fcaVar = new fca(2, 10);
        }
        a = fcaVar;
    }

    public fca(int i, int i2) {
        this.b = i;
        this.c = i2;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fca)) {
            return false;
        }
        fca fcaVar = (fca) obj;
        if (this.b == fcaVar.b && this.c == fcaVar.c && Objects.equals(this.d, fcaVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        alpt alptVar = this.d;
        if (alptVar == null) {
            hashCode = 0;
        } else {
            hashCode = alptVar.hashCode();
        }
        return (((this.b * 31) + this.c) * 31) + hashCode;
    }

    public final String toString() {
        return "AudioProfile[format=" + this.b + ", maxChannelCount=" + this.c + ", channelMasks=" + String.valueOf(this.d) + "]";
    }

    public fca(int i, Set set) {
        this.b = i;
        alpt o = alpt.o(set);
        this.d = o;
        aluq listIterator = o.listIterator();
        int i2 = 0;
        while (listIterator.hasNext()) {
            i2 = Math.max(i2, Integer.bitCount(((Integer) listIterator.next()).intValue()));
        }
        this.c = i2;
    }
}
