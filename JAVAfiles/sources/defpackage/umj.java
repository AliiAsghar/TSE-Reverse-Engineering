package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class umj extends unp {
    private final prk a;

    public umj(prk prkVar) {
        this.a = prkVar;
    }

    private static int j(int i) {
        int i2 = i - 2;
        if (i2 == 1) {
            return 4;
        }
        if (i2 == 2) {
            return 3;
        }
        if (i2 != 3 && i2 != 4) {
            throw new IllegalArgumentException("Unrecognized proto enum");
        }
        return 5;
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        return d.av();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("RbmBusinessInfoRetrievalHandler");
    }

    @Override // defpackage.unp
    protected final /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        umk umkVar = (umk) apbtVar;
        int aT = a.aT(umkVar.c);
        int i = 1;
        if (aT != 0 && aT == 4) {
            prk prkVar = this.a;
            String str = umkVar.b;
            int T = a.T(umkVar.d);
            if (T != 0) {
                i = T;
            }
            prl prlVar = new prl(str, j(i));
            String str2 = prlVar.a;
            prk.a.o("Request made for ".concat(str2));
            xyo c = prk.a.c();
            c.H("Initiating business info retrieval handler...");
            c.z("RBM bot id", str2);
            c.q();
            return aktp.ai(new mzn(prkVar, str2, 10, null), prkVar.h).i(new mhv(prkVar, prlVar, str2, 12), prkVar.g).h(new ndd(prkVar, 13), prkVar.g);
        }
        prk prkVar2 = this.a;
        String str3 = umkVar.b;
        int T2 = a.T(umkVar.d);
        if (T2 != 0) {
            i = T2;
        }
        return prkVar2.c(new prl(str3, j(i)));
    }

    @Override // defpackage.unx
    public final apca e() {
        return umk.a.getParserForType();
    }
}
