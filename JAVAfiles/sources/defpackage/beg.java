package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class beg extends arrp implements arqr<cps, Boolean> {
    final /* synthetic */ bdy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public beg(bdy bdyVar) {
        super(1);
        this.a = bdyVar;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        boolean z;
        if (axy.a.a(((cps) obj).a) == axu.q) {
            this.a.j();
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
