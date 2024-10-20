package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fta implements Comparable {
    public final int a;
    public final fsy b;

    public fta(int i, fsy fsyVar) {
        this.a = i;
        this.b = fsyVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.a, ((fta) obj).a);
    }
}
