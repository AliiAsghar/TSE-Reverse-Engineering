package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fhl {
    public final int a;
    public final boolean b;

    public fhl(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fhl fhlVar = (fhl) obj;
            if (this.a == fhlVar.a && this.b == fhlVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1 : 0);
    }
}
