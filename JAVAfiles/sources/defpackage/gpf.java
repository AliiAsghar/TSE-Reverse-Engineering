package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpf extends gpg {
    public gpf(int i, int i2) {
        super(i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gpf) {
            gpf gpfVar = (gpf) obj;
            if (this.b == gpfVar.b && this.c == gpfVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b * 31) + this.c;
    }
}
