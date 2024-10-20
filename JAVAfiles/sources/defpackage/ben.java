package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ben extends arrp implements arqg<cjn> {
    final /* synthetic */ bdy a;
    final /* synthetic */ byn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ben(bdy bdyVar, byn bynVar) {
        super(0);
        this.a = bdyVar;
        this.b = bynVar;
    }

    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        axp d;
        long a;
        long j = ((dri) this.b.a()).a;
        bdy bdyVar = this.a;
        bcy f = bdyVar.f();
        long j2 = 9205357640488583168L;
        if (f != null && (d = bdyVar.d()) != null) {
            int ordinal = d.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        a = bej.a(bdyVar, j, f.b);
                    } else {
                        throw new armm();
                    }
                } else {
                    a = bej.a(bdyVar, j, f.a);
                }
                j2 = a;
            } else {
                throw new IllegalStateException("SelectionContainer does not support cursor");
            }
        }
        return new cjn(j2);
    }
}
