package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqc implements dqm {
    private final long a;

    public dqc(long j) {
        this.a = j;
        if (j != 16) {
            return;
        }
        doz.b("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // defpackage.dqm
    public final float a() {
        return cku.a(this.a);
    }

    @Override // defpackage.dqm
    public final long b() {
        return this.a;
    }

    @Override // defpackage.dqm
    public final cko c() {
        return null;
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
        if ((obj instanceof dqc) && a.bB(this.a, ((dqc) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a.A(this.a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) cku.g(this.a)) + ')';
    }
}
