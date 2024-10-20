package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class azy extends arrp implements arqw<cuh, cuc, dqs, cuf> {
    final /* synthetic */ azw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azy(azw azwVar) {
        super(3);
        this.a = azwVar;
    }

    @Override // defpackage.arqw
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cuf et;
        long j = ((dqs) obj3).a;
        long j2 = this.a.f;
        int d = dqs.d(j);
        int b = dqs.b(j);
        cvc e = ((cuc) obj2).e(dqs.k(j, arrn.u((int) (j2 >> 32), d, b), 0, arrn.u((int) (j2 & 4294967295L), dqs.c(j), dqs.a(j)), 0, 10));
        et = ((cuh) obj).et(e.a, e.b, arnw.a, new azx(e));
        return et;
    }
}
