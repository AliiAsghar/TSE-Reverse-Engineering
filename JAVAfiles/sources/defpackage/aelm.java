package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aelm extends arrp implements arqv {
    final /* synthetic */ boolean a;
    final /* synthetic */ int b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aelm(aewe aeweVar, int i, boolean z, int i2) {
        super(2);
        this.d = i2;
        this.c = aeweVar;
        this.b = i;
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, arqw] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, arqw] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, arqw] */
    /* JADX WARN: Type inference failed for: r0v4, types: [aelq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, aewe] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, aewe] */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.lang.Object, arqg] */
    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Number) obj2).intValue();
                int i = this.b;
                aeke.al((String) this.c, this.a, (bwj) obj, bzh.a(i | 1));
                return arnb.a;
            case 1:
                ((Number) obj2).intValue();
                kic.h((khy) this.c, this.a, (bwj) obj, bzh.a(1 | this.b));
                return arnb.a;
            case 2:
                ((Number) obj2).intValue();
                aeke.au((aerb) this.c, this.a, (bwj) obj, bzh.a(1 | this.b));
                return arnb.a;
            case 3:
                ((Number) obj2).intValue();
                aeke.aw(this.c, this.a, (bwj) obj, bzh.a(1 | this.b));
                return arnb.a;
            case 4:
                ((Number) obj2).intValue();
                adom.aH(this.c, this.a, (bwj) obj, bzh.a(1 | this.b));
                return arnb.a;
            case 5:
                ((Number) obj2).intValue();
                int i2 = this.b;
                adom.ap(this.a, this.c, (bwj) obj, bzh.a(i2 | 1));
                return arnb.a;
            case 6:
                ((Number) obj2).intValue();
                int i3 = this.b;
                aeke.aM((aerb) this.c, this.a, (bwj) obj, bzh.a(i3 | 1));
                return arnb.a;
            case 7:
                ((Number) obj2).intValue();
                int i4 = this.b;
                aetn.s((String) this.c, this.a, (bwj) obj, bzh.a(i4 | 1));
                return arnb.a;
            case 8:
                ((Number) obj2).intValue();
                int i5 = this.b;
                aetn.h((String) this.c, this.a, (bwj) obj, bzh.a(i5 | 1));
                return arnb.a;
            case 9:
                ((Number) obj2).intValue();
                adcx.bc(this.a, this.c, (bwj) obj, bzh.a(1 | this.b));
                return arnb.a;
            case 10:
                bwj bwjVar = (bwj) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && bwjVar.L()) {
                    bwjVar.v();
                } else {
                    int size = ((aewf) this.c).a.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        int i7 = this.b;
                        int i8 = i7 - 1;
                        if (i6 <= i8) {
                            if (i6 == i8 && ((aewf) this.c).a.size() > i7) {
                                bwjVar.y(369007713);
                                adcx.bc(this.a, cdk.e(-1466777080, new aets((aewe) this.c, i6, 2), bwjVar), bwjVar, 48);
                                bwjVar.q();
                            } else {
                                bwjVar.y(369272422);
                                adcx.bc(this.a, cdk.e(-1033169775, new aets((aewe) this.c, i6, 3), bwjVar), bwjVar, 48);
                                bwjVar.q();
                            }
                        }
                    }
                }
                return arnb.a;
            case 11:
                ((Number) obj2).intValue();
                adcx.ah((String) this.c, true, (bwj) obj, bzh.a(this.b | 1));
                return arnb.a;
            case 12:
                ((Number) obj2).intValue();
                adcx.aj((String) this.c, true, (bwj) obj, bzh.a(this.b | 1));
                return arnb.a;
            case 13:
                ((Number) obj2).intValue();
                int i9 = this.b;
                adcx.ab(this.a, this.c, (bwj) obj, bzh.a(i9 | 1));
                return arnb.a;
            case 14:
                ((Number) obj2).intValue();
                int i10 = this.b;
                adom.bG(this.a, this.c, (bwj) obj, bzh.a(i10 | 1));
                return arnb.a;
            default:
                ((Number) obj2).intValue();
                int i11 = this.b;
                agiz.g((aggy) this.c, this.a, (bwj) obj, bzh.a(i11 | 1));
                return arnb.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aelm(Object obj, boolean z, int i, int i2) {
        super(2);
        this.d = i2;
        this.c = obj;
        this.a = z;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aelm(String str, boolean z, int i, int i2, int[] iArr) {
        super(2);
        this.d = i2;
        this.c = str;
        this.a = true;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aelm(boolean z, Object obj, int i, int i2) {
        super(2);
        this.d = i2;
        this.a = z;
        this.c = obj;
        this.b = i;
    }
}
