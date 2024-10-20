package defpackage;

import defpackage.cnr;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ado extends arrp implements arqr<cnt, arnb> {
    final /* synthetic */ boolean a;
    final /* synthetic */ cko b;
    final /* synthetic */ long c;
    final /* synthetic */ float d;
    final /* synthetic */ float e;
    final /* synthetic */ long f;
    final /* synthetic */ long g;
    final /* synthetic */ cod h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ado(boolean z, cko ckoVar, long j, float f, float f2, long j2, long j3, cod codVar) {
        super(1);
        this.a = z;
        this.b = ckoVar;
        this.c = j;
        this.d = f;
        this.e = f2;
        this.f = j2;
        this.g = j3;
        this.h = codVar;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        cnt cntVar = (cnt) obj;
        cntVar.p();
        if (this.a) {
            cnw.e(cntVar, this.b, 0L, 0L, this.c, null, 246);
        } else {
            long j = this.c;
            float f = this.d;
            if (Float.intBitsToFloat((int) (j >> 32)) < f) {
                float f2 = this.e;
                long o = cntVar.o() >> 32;
                float intBitsToFloat = Float.intBitsToFloat((int) o) - this.e;
                long o2 = cntVar.o() & 4294967295L;
                float intBitsToFloat2 = Float.intBitsToFloat((int) o2) - this.e;
                cko ckoVar = this.b;
                long j2 = this.c;
                cnu q = cntVar.q();
                long a = q.a();
                q.b().l();
                try {
                    ((cnr.AnonymousClass1) q).a.b(f2, f2, intBitsToFloat, intBitsToFloat2, 0);
                    cnw.e(cntVar, ckoVar, 0L, 0L, j2, null, 246);
                } finally {
                    q.b().j();
                    q.h(a);
                }
            } else {
                cnw.e(cntVar, this.b, this.f, this.g, adl.a(this.c, f), this.h, 208);
            }
        }
        return arnb.a;
    }
}
