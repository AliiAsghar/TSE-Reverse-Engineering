package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aerz extends arrp implements arqv {
    final /* synthetic */ int a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aerz(int i, int i2) {
        super(2);
        this.b = i2;
        this.a = i;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Number) obj2).intValue();
                aeke.aE((bwj) obj, bzh.a(this.a | 1));
                return arnb.a;
            case 1:
                ((Number) obj2).intValue();
                aeke.aD((bwj) obj, bzh.a(this.a | 1));
                return arnb.a;
            case 2:
                ((Number) obj2).intValue();
                aetn.J((bwj) obj, bzh.a(this.a | 1));
                return arnb.a;
            case 3:
                ((Number) obj2).intValue();
                aetn.K((bwj) obj, bzh.a(this.a | 1));
                return arnb.a;
            case 4:
                ((Number) obj2).intValue();
                adcx.bJ((bwj) obj, bzh.a(this.a | 1));
                return arnb.a;
            case 5:
                ((Number) obj2).intValue();
                adcx.bK((bwj) obj, bzh.a(this.a | 1));
                return arnb.a;
            case 6:
                ((Number) obj2).intValue();
                adcx.bL((bwj) obj, bzh.a(this.a | 1));
                return arnb.a;
            case 7:
                ((Number) obj2).intValue();
                adcx.ar(null, (bwj) obj, bzh.a(this.a | 1));
                return arnb.a;
            case 8:
                ((Number) obj2).intValue();
                adcx.au(null, (bwj) obj, bzh.a(this.a | 1));
                return arnb.a;
            case 9:
                ((Number) obj2).intValue();
                adcx.aa((bwj) obj, bzh.a(this.a | 1));
                return arnb.a;
            case 10:
                ((Number) obj2).intValue();
                adcx.Y((bwj) obj, bzh.a(this.a | 1));
                return arnb.a;
            case 11:
                int intValue = ((Number) obj).intValue();
                afmu afmuVar = (afmu) obj2;
                afmuVar.getClass();
                int i = this.a;
                Object obj3 = afpo.b.get(i - (intValue % i));
                obj3.getClass();
                aflr aflrVar = (aflr) obj3;
                Object obj4 = afpo.b.get((intValue / this.a) + 1);
                obj4.getClass();
                aflr aflrVar2 = (aflr) obj4;
                if (true != afmuVar.e().contains(new armo(aflrVar, aflrVar2))) {
                    afmuVar = null;
                }
                if (afmuVar == null) {
                    return null;
                }
                return afmuVar.d(aflrVar, aflrVar2);
            case 12:
                ((Number) obj2).intValue();
                afwv.a((bwj) obj, bzh.a(this.a | 1));
                return arnb.a;
            default:
                ((Number) obj2).intValue();
                agiz.b((bwj) obj, bzh.a(this.a | 1));
                return arnb.a;
        }
    }
}
