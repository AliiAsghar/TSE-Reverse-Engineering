package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class apzc extends apyz {
    private final alog b;

    public apzc(alog alogVar) {
        this.b = alogVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.apyz
    public final apyu a(apyv apyvVar) {
        alob alobVar = new alob();
        int i = 0;
        while (true) {
            alog alogVar = this.b;
            if (i >= ((alsx) alogVar).c) {
                break;
            }
            apyz apyzVar = (apyz) alogVar.get(i);
            try {
                alobVar.h(apyzVar.a(apyvVar));
            } catch (RuntimeException e) {
                apzg.d(e, apyzVar, apyvVar);
            }
            i++;
        }
        alog g = alobVar.g();
        if (!g.isEmpty()) {
            if (((alsx) g).c == 1) {
                return new apzd((apyu) alzz.aP(g));
            }
            return new apza(g);
        }
        return apyu.a;
    }
}
