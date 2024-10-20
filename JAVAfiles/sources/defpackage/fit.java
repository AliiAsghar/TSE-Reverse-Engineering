package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fit implements Comparable {
    private final boolean a;
    private final boolean b;

    public fit(eqn eqnVar, int i) {
        this.a = 1 == (eqnVar.e & 1);
        this.b = dzn.j(i, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(fit fitVar) {
        return almj.b.e(this.b, fitVar.b).e(this.a, fitVar.a).a();
    }
}
