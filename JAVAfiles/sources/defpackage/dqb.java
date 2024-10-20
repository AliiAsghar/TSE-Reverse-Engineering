package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqb implements dqm {
    public final clz a;
    private final float b;

    public dqb(clz clzVar, float f) {
        this.a = clzVar;
        this.b = f;
    }

    @Override // defpackage.dqm
    public final float a() {
        return this.b;
    }

    @Override // defpackage.dqm
    public final long b() {
        return cku.h;
    }

    @Override // defpackage.dqm
    public final cko c() {
        return this.a;
    }

    @Override // defpackage.dqm
    public final /* synthetic */ dqm d(dqm dqmVar) {
        return dql.a(this, dqmVar);
    }

    @Override // defpackage.dqm
    public final /* synthetic */ dqm e(arqg arqgVar) {
        return dql.b(this, arqgVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqb)) {
            return false;
        }
        dqb dqbVar = (dqb) obj;
        if (d.F(this.a, dqbVar.a) && Float.compare(this.b, dqbVar.b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "BrushStyle(value=" + this.a + ", alpha=" + this.b + ')';
    }
}
