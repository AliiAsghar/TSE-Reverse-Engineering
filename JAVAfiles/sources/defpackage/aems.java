package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aems extends arrp implements arqg {
    final /* synthetic */ int a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aems(int i, Object obj, int i2) {
        super(0);
        this.c = i2;
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [byk, java.lang.Object] */
    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        switch (this.c) {
            case 0:
                int i = this.a;
                Object obj = this.b;
                ((aenk) obj).c.a(Integer.valueOf(i));
                return arnb.a;
            case 1:
                this.b.d(this.a);
                return arnb.a;
            case 2:
                int i2 = this.a;
                Object obj2 = this.b;
                ((aenk) obj2).b.a(Integer.valueOf(i2));
                return arnb.a;
            case 3:
                int i3 = this.a;
                Object obj3 = this.b;
                ((aenk) obj3).d.a(Integer.valueOf(i3));
                return arnb.a;
            case 4:
                int i4 = this.a;
                Object obj4 = this.b;
                ((aenk) obj4).c.a(Integer.valueOf(i4));
                return arnb.a;
            case 5:
                int i5 = this.a;
                Object obj5 = this.b;
                ((aenk) obj5).b.a(Integer.valueOf(i5));
                return arnb.a;
            case 6:
                int i6 = this.a;
                Object obj6 = this.b;
                ((aenk) obj6).d.a(Integer.valueOf(i6));
                return arnb.a;
            default:
                if (this.a == 0) {
                    return arts.a;
                }
                return arrn.k(new aruf(new artt(aqjn.aF(this.b.values()), true, aeys.p), new zyv(4)), this.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aems(aenk aenkVar, int i, int i2) {
        super(0);
        this.c = i2;
        this.b = aenkVar;
        this.a = i;
    }
}
