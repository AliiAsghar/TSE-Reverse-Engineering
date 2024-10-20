package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class agg extends arrp implements arqw<afy, bwj, Integer, arnb> {
    final /* synthetic */ arqv a;
    final /* synthetic */ cga b;
    final /* synthetic */ arqg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agg(arqv arqvVar, cga cgaVar, arqg arqgVar) {
        super(3);
        this.a = arqvVar;
        this.b = cgaVar;
        this.c = arqgVar;
    }

    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        int i;
        afy afyVar = (afy) obj;
        bwj bwjVar = (bwj) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            if (true != bwjVar.G(afyVar)) {
                i = 2;
            } else {
                i = 4;
            }
            intValue |= i;
        }
        if ((intValue & 19) == 18 && bwjVar.L()) {
            bwjVar.v();
        } else {
            ?? a = this.a.a(bwjVar, 0);
            if (arsd.M(a)) {
                aju.d("Label must not be blank");
            }
            agk.d((String) a, afyVar, this.b, this.c, bwjVar, (intValue << 6) & 896);
        }
        return arnb.a;
    }
}
