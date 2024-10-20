package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class almu extends alur {
    final /* synthetic */ Iterable[] a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public almu(Iterable[] iterableArr) {
        super(2, 0);
        this.a = iterableArr;
    }

    @Override // defpackage.alur
    public final /* bridge */ /* synthetic */ Object a(int i) {
        return this.a[i].iterator();
    }
}
