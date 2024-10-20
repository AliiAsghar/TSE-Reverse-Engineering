package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atid extends atht {
    private static final long serialVersionUID = -3205227092378684157L;
    private final int b;

    public atid(atgd atgdVar, atgf atgfVar) {
        super(atgdVar, atgfVar);
        this.b = 100;
    }

    @Override // defpackage.atht, defpackage.atgd
    public final long a(long j, int i) {
        return this.a.b(j, i * 100);
    }

    @Override // defpackage.atht, defpackage.atgd
    public final long b(long j, long j2) {
        long j3 = j2 * 100;
        if (j3 / 100 == j2) {
            return this.a.b(j, j3);
        }
        throw new ArithmeticException(a.cn(j2, "Multiplication overflows a long: ", " * 100"));
    }

    @Override // defpackage.atht, defpackage.atgd
    public final long c() {
        return this.a.c() * 100;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof atid) {
            atid atidVar = (atid) obj;
            if (this.a.equals(atidVar.a) && this.d == atidVar.d) {
                int i = atidVar.b;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + 100 + this.a.hashCode();
    }
}
