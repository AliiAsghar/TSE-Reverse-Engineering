package defpackage;

import defpackage.cnr;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bch extends arrp implements arqr<cnt, arnb> {
    final /* synthetic */ arqg a;
    final /* synthetic */ boolean b;
    final /* synthetic */ clg c;
    final /* synthetic */ ckv d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bch(arqg arqgVar, boolean z, clg clgVar, ckv ckvVar) {
        super(1);
        this.a = arqgVar;
        this.b = z;
        this.c = clgVar;
        this.d = ckvVar;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        cnt cntVar = (cnt) obj;
        cntVar.p();
        if (((Boolean) this.a.a()).booleanValue()) {
            if (!this.b) {
                cntVar.z(this.c, coc.a, this.d);
            } else {
                clg clgVar = this.c;
                ckv ckvVar = this.d;
                long a = cntVar.a();
                cnu q = cntVar.q();
                long a2 = q.a();
                q.b().l();
                try {
                    ((cnr.AnonymousClass1) q).a.d(-1.0f, 1.0f, a);
                    cntVar.z(clgVar, coc.a, ckvVar);
                } finally {
                    q.b().j();
                    q.h(a2);
                }
            }
        }
        return arnb.a;
    }
}
