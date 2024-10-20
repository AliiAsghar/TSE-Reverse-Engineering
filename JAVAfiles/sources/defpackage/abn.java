package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class abn<T> implements zr<T> {
    private final zr a;
    private final long b;

    public abn(zr zrVar, long j) {
        this.a = zrVar;
        this.b = j;
    }

    @Override // defpackage.zr
    public final ack a(acg acgVar) {
        return new abo(this.a.a(acgVar), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof abn)) {
            return false;
        }
        abn abnVar = (abn) obj;
        if (abnVar.b != this.b || !d.F(abnVar.a, this.a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.A(this.b);
    }
}
