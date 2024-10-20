package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aets extends arrp implements arqw {
    final /* synthetic */ int a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aets(int i, cas casVar, int i2) {
        super(3);
        this.c = i2;
        this.a = i;
        this.b = casVar;
    }

    /* JADX WARN: Type inference failed for: r14v2, types: [byk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [cas, java.lang.Object] */
    @Override // defpackage.arqw
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cuf et;
        cuf et2;
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    bwj bwjVar = (bwj) obj2;
                    int intValue = ((Number) obj3).intValue();
                    ((ake) obj).getClass();
                    if ((intValue & 81) == 16 && bwjVar.L()) {
                        bwjVar.v();
                    } else {
                        Object obj4 = this.b;
                        adcx.bh((aevy) ((aewf) obj4).a.get(this.a), null, null, null, null, bwjVar, 0, 28);
                    }
                    return arnb.a;
                }
                bwj bwjVar2 = (bwj) obj2;
                int intValue2 = ((Number) obj3).intValue();
                ((ake) obj).getClass();
                if ((intValue2 & 81) == 16 && bwjVar2.L()) {
                    bwjVar2.v();
                } else {
                    Object obj5 = this.b;
                    adcx.bh(new aevw(((aewf) obj5).a.size() - this.a, aevs.a), "", null, null, null, bwjVar2, 48, 28);
                }
                return arnb.a;
            }
            cuh cuhVar = (cuh) obj;
            cuc cucVar = (cuc) obj2;
            long j = ((dqs) obj3).a;
            cuhVar.getClass();
            cucVar.getClass();
            cvc e = cucVar.e(j);
            int i2 = e.a;
            int i3 = this.a;
            et2 = cuhVar.et(i2, aett.b(this.b) + i3, arnw.a, new mgc(e, i3, 8));
            return et2;
        }
        cuh cuhVar2 = (cuh) obj;
        cuc cucVar2 = (cuc) obj2;
        long j2 = ((dqs) obj3).a;
        cuhVar2.getClass();
        cucVar2.getClass();
        this.b.d(cucVar2.e(j2).b);
        et = cuhVar2.et(0, this.a, arnw.a, aedh.r);
        return et;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aets(aewe aeweVar, int i, int i2) {
        super(3);
        this.c = i2;
        this.b = aeweVar;
        this.a = i;
    }
}
