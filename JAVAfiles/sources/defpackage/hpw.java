package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hpw implements hnr {
    final /* synthetic */ hpx a;
    final /* synthetic */ kkc b;

    public hpw(hpx hpxVar, kkc kkcVar) {
        this.b = kkcVar;
        this.a = hpxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, hne] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, hns] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, hns] */
    @Override // defpackage.hnr
    public final void b(Object obj) {
        if (this.a.e(this.b)) {
            hpx hpxVar = this.a;
            kkc kkcVar = this.b;
            hpb hpbVar = hpxVar.a.o;
            if (obj != null && hpbVar.c(kkcVar.b.g())) {
                hpxVar.c = obj;
                ((how) hpxVar.b).e(2);
            } else {
                hos hosVar = hpxVar.b;
                ?? r3 = kkcVar.c;
                ?? r4 = kkcVar.b;
                hosVar.d(r3, obj, r4, r4.g(), hpxVar.d);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, hns] */
    @Override // defpackage.hnr
    public final void e(Exception exc) {
        if (this.a.e(this.b)) {
            hpx hpxVar = this.a;
            kkc kkcVar = this.b;
            hor horVar = hpxVar.d;
            ?? r1 = kkcVar.b;
            hpxVar.b.b(horVar, exc, r1, r1.g());
        }
    }
}
