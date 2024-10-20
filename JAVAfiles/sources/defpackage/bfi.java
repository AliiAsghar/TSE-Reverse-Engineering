package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bfi extends arrp implements arqg<cjn> {
    final /* synthetic */ bfb a;
    final /* synthetic */ byn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bfi(bfb bfbVar, byn bynVar) {
        super(0);
        this.a = bfbVar;
        this.b = bynVar;
    }

    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        dhv e;
        axp c;
        int e2;
        baa d;
        ayd aydVar;
        ayq ayqVar;
        dhv dhvVar;
        long j = ((dri) this.b.a()).a;
        bfb bfbVar = this.a;
        cjn d2 = bfbVar.d();
        long j2 = 9205357640488583168L;
        if (d2 != null && (e = bfbVar.e()) != null && e.a() != 0 && (c = bfbVar.c()) != null) {
            int ordinal = c.ordinal();
            if (ordinal != 0 && ordinal != 1) {
                if (ordinal == 2) {
                    e2 = djc.a(bfbVar.f().b);
                } else {
                    throw new armm();
                }
            } else {
                e2 = djc.e(bfbVar.f().b);
            }
            ayd aydVar2 = bfbVar.c;
            if (aydVar2 != null && (d = aydVar2.d()) != null && (aydVar = bfbVar.c) != null && (ayqVar = aydVar.a) != null && (dhvVar = ayqVar.a) != null) {
                long j3 = d2.a;
                int u = arrn.u(bfbVar.a.a(e2), 0, dhvVar.a());
                long b = d.b(j3) >> 32;
                diy diyVar = d.a;
                float intBitsToFloat = Float.intBitsToFloat((int) b);
                int g = diyVar.g(u);
                float b2 = diyVar.b(g);
                float c2 = diyVar.c(g);
                float q = arrn.q(intBitsToFloat, Math.min(b2, c2), Math.max(b2, c2));
                if (a.bB(j, 0L) || Math.abs(intBitsToFloat - q) <= ((int) (j >> 32)) / 2) {
                    float d3 = diyVar.d(g);
                    j2 = (Float.floatToRawIntBits(q) << 32) | (Float.floatToRawIntBits(((diyVar.a(g) - d3) / 2.0f) + d3) & 4294967295L);
                }
            }
        }
        return new cjn(j2);
    }
}
