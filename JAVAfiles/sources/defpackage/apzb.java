package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class apzb extends apyy {
    private final alog b;

    public apzb(Iterable iterable) {
        this.b = alog.j(iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.apyy
    public final apyz a(Object obj) {
        alob alobVar = new alob();
        alog alogVar = this.b;
        int size = alogVar.size();
        for (int i = 0; i < size; i++) {
            apyy apyyVar = (apyy) alogVar.get(i);
            try {
                alobVar.h(apyyVar.a(obj));
            } catch (RuntimeException e) {
                apzg.b(e, apyyVar, obj);
            }
        }
        alog g = alobVar.g();
        if (!g.isEmpty()) {
            if (((alsx) g).c == 1) {
                return new apzf((apyz) alzz.aP(g));
            }
            return new apzc(g);
        }
        return apyz.a;
    }
}
