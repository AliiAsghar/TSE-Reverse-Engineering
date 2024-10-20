package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anhv implements anhu {
    final anhm a;
    private final /* synthetic */ int b;

    public anhv(anhm anhmVar, int i) {
        this.b = i;
        this.a = anhmVar;
    }

    @Override // defpackage.anhu
    public final String a(aodz aodzVar, anhl anhlVar) {
        if (this.b != 0) {
            if (albo.aC(aodzVar.d()) == 10) {
                long d = aodzVar.d();
                aodzVar.e(d + (albo.aD(d) * 90));
            }
            anhl anhlVar2 = anhl.E164;
            if (anhlVar == anhlVar2) {
                return this.a.e(aodzVar, anhlVar2);
            }
            return this.a.e(aodzVar, anhl.INTERNATIONAL);
        }
        if (aodzVar.c() == 52 && this.a.k(aodzVar)) {
            long d2 = aodzVar.d();
            if (albo.aC(d2) + ((aosw) aodzVar.a).g > 10 && d2 > 0 && ((int) (d2 / albo.aD(d2))) == 1 && (((aosw) aodzVar.a).b & 128) == 0) {
                aodzVar.e(d2 % albo.aD(d2));
            }
        }
        String e = this.a.e(aodzVar, anhlVar);
        if (!albo.ah(e) && anhlVar == anhl.NATIONAL && e.startsWith("01 ")) {
            return e.replaceFirst("01 ", "");
        }
        return e;
    }
}
