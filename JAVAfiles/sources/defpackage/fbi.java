package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbi {
    public static final fbi a;
    public static final fbi b;
    public final long c;
    public final long d;

    static {
        fbi fbiVar = new fbi(0L, 0L);
        a = fbiVar;
        new fbi(Long.MAX_VALUE, Long.MAX_VALUE);
        new fbi(Long.MAX_VALUE, 0L);
        new fbi(0L, Long.MAX_VALUE);
        b = fbiVar;
    }

    public fbi(long j, long j2) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        d.s(j2 >= 0);
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fbi fbiVar = (fbi) obj;
            if (this.c == fbiVar.c && this.d == fbiVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.c) * 31) + ((int) this.d);
    }
}
