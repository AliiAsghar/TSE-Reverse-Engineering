package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bdk extends arrp implements arqv<bwj, Integer, arnb> {
    final /* synthetic */ bdy a;
    final /* synthetic */ arqv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bdk(bdy bdyVar, arqv arqvVar) {
        super(2);
        this.a = bdyVar;
        this.b = arqvVar;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        cga a;
        cga cgaVar;
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
            bwjVar.v();
        } else {
            bdy bdyVar = this.a;
            cga cgaVar2 = cga.e;
            bec becVar = new bec(bdyVar);
            if (bdyVar.y()) {
                cgaVar2 = cru.a(cgaVar2, arnb.a, new beh(becVar));
            }
            a = aem.a(chz.a(civ.a(cur.a(cgaVar2, new bed(bdyVar)), bdyVar.f), new bee(bdyVar)), true, null);
            cga a2 = cpu.a(bdm.b(a, new bef(bdyVar)), new beg(bdyVar));
            if (bdyVar.d() != null && bdyVar.A() && !bdyVar.C()) {
                cgaVar = cga.e;
                if (afc.a()) {
                    cgaVar = cfv.g(cgaVar, new ber(bdyVar));
                }
            } else {
                cgaVar = cga.e;
            }
            bew.a(a2.a(cgaVar), cdk.e(1375295262, new bdj(this.b, this.a), bwjVar), bwjVar, 48);
        }
        return arnb.a;
    }
}
