package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asvg implements asvd {
    protected final asvd a;
    protected final asvf b;

    public asvg(asvd asvdVar, asvf asvfVar) {
        this.a = asvdVar;
        this.b = asvfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof asvg)) {
            return false;
        }
        asvg asvgVar = (asvg) obj;
        if (this.a.equals(asvgVar.a) && this.b.equals(asvgVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ Integer.rotateLeft(this.b.hashCode(), 16);
    }
}
