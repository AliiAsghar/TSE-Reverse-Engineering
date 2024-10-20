package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class akp implements cvu {
    private final arqr a;
    private and b;

    public akp(arqr arqrVar) {
        this.a = arqrVar;
    }

    @Override // defpackage.cga
    public final /* synthetic */ cga a(cga cgaVar) {
        return cfz.a(this, cgaVar);
    }

    @Override // defpackage.cga
    public final /* synthetic */ Object b(Object obj, arqv arqvVar) {
        return cgb.a(this, obj, arqvVar);
    }

    @Override // defpackage.cga
    public final /* synthetic */ boolean c(arqr arqrVar) {
        return cgb.b(this, arqrVar);
    }

    @Override // defpackage.cvu
    public final void d(cwb cwbVar) {
        and andVar = (and) cwbVar.q(anh.a);
        if (!d.F(andVar, this.b)) {
            this.b = andVar;
            this.a.a(andVar);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof akp) && ((akp) obj).a == this.a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
