package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fis extends fjb implements Comparable {
    private final int e;
    private final int f;

    public fis(int i, esa esaVar, int i2, fiv fivVar, int i3) {
        super(i, esaVar, i2);
        this.e = dzn.j(i3, fivVar.N) ? 1 : 0;
        this.f = this.d.a();
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(fis fisVar) {
        return Integer.compare(this.f, fisVar.f);
    }

    @Override // defpackage.fjb
    public final int b() {
        return this.e;
    }

    @Override // defpackage.fjb
    public final /* bridge */ /* synthetic */ boolean c(fjb fjbVar) {
        return false;
    }
}
