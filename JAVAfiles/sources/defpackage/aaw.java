package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaw<T> implements zr<T> {
    private final aaj a;
    private final abj b;
    private final long c = 0;

    public aaw(aaj aajVar, abj abjVar) {
        this.a = aajVar;
        this.b = abjVar;
    }

    @Override // defpackage.zr
    public final ack a(acg acgVar) {
        return new act(this.a.a(acgVar), this.b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aaw) {
            aaw aawVar = (aaw) obj;
            if (d.F(aawVar.a, this.a) && aawVar.b == this.b) {
                long j = aawVar.c;
                if (a.bB(0L, 0L)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + a.A(0L);
    }
}
