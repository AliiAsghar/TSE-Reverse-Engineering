package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class gef {
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public gef(int i, int i2, int i3, int i4) {
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    public final int a(gbb gbbVar) {
        gbbVar.getClass();
        int ordinal = gbbVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return this.d;
                }
                throw new armm();
            }
            return this.c;
        }
        throw new IllegalArgumentException("Cannot get presentedItems for loadType: REFRESH");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gef)) {
            return false;
        }
        gef gefVar = (gef) obj;
        if (this.c == gefVar.c && this.d == gefVar.d && this.e == gefVar.e && this.f == gefVar.f) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.c + this.d + this.e + this.f;
    }
}
