package defpackage;

import defpackage.cnr;

/* compiled from: PG */
/* loaded from: classes.dex */
final class awj extends arrp implements arqr<cnt, arnb> {
    final /* synthetic */ float a;
    final /* synthetic */ clg b;
    final /* synthetic */ ckv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awj(float f, clg clgVar, ckv ckvVar) {
        super(1);
        this.a = f;
        this.b = clgVar;
        this.c = ckvVar;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        cnt cntVar = (cnt) obj;
        cntVar.p();
        cnu q = cntVar.q();
        long a = q.a();
        q.b().l();
        clg clgVar = this.b;
        ckv ckvVar = this.c;
        float f = this.a;
        try {
            coa coaVar = ((cnr.AnonymousClass1) q).a;
            coaVar.e(f, brg.a);
            coaVar.c(45.0f, 0L);
            cntVar.z(clgVar, coc.a, ckvVar);
            q.b().j();
            q.h(a);
            return arnb.a;
        } catch (Throwable th) {
            q.b().j();
            q.h(a);
            throw th;
        }
    }
}
