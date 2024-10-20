package defpackage;

import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class asuw {
    protected final asvd c;
    protected asuy d;
    protected asuy e;
    protected BigInteger f;
    protected BigInteger g;
    protected int h = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    public asuw(asvd asvdVar) {
        this.c = asvdVar;
    }

    public asva b(BigInteger bigInteger, BigInteger bigInteger2) {
        throw null;
    }

    public abstract asuy c(BigInteger bigInteger);

    public abstract asva d();

    public final asva e(asva asvaVar) {
        if (this == asvaVar.b) {
            return asvaVar;
        }
        if (asvaVar.m()) {
            return d();
        }
        asva i = asvaVar.i();
        return b(i.c.b(), i.c().b());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof asuw) && f((asuw) obj)) {
            return true;
        }
        return false;
    }

    public final boolean f(asuw asuwVar) {
        if (this == asuwVar) {
            return true;
        }
        if (asuwVar == null || !this.c.equals(asuwVar.c) || !this.d.b().equals(asuwVar.d.b())) {
            return false;
        }
        if (this.e.b().equals(asuwVar.e.b())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.c.hashCode() ^ Integer.rotateLeft(this.d.b().hashCode(), 8)) ^ Integer.rotateLeft(this.e.b().hashCode(), 16);
    }
}
