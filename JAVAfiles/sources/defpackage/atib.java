package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atib extends athr {
    private static final long serialVersionUID = -8346152187724495365L;
    private final long a;

    public atib(atgf atgfVar, long j) {
        super(atgfVar);
        this.a = j;
    }

    @Override // defpackage.atgd
    public final long a(long j, int i) {
        return atow.p(j, i * this.a);
    }

    @Override // defpackage.atgd
    public final long b(long j, long j2) {
        long j3 = this.a;
        if (j2 != 1) {
            long j4 = 0;
            if (j2 != 0) {
                j4 = j2 * j3;
                if (j4 / j3 != j2) {
                    throw new ArithmeticException(a.cs(j3, j2, "Multiplication overflows a long: ", " * "));
                }
            }
            j3 = j4;
        }
        return atow.p(j, j3);
    }

    @Override // defpackage.atgd
    public final long c() {
        return this.a;
    }

    @Override // defpackage.atgd
    public final boolean e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof atib) {
            atib atibVar = (atib) obj;
            if (this.d == atibVar.d && this.a == atibVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((int) this.a) + this.d.hashCode();
    }
}
