package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class due extends ddb implements cuz {
    private final dtz a;
    private final arqr b;

    public due(dtz dtzVar, arqr arqrVar) {
        this.a = dtzVar;
        this.b = arqrVar;
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

    @Override // defpackage.cuz
    public final /* bridge */ /* synthetic */ Object d() {
        return new dud(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        due dueVar;
        arqr arqrVar = null;
        if (obj instanceof due) {
            dueVar = (due) obj;
        } else {
            dueVar = null;
        }
        if (dueVar != null) {
            arqrVar = dueVar.b;
        }
        if (this.b == arqrVar) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
