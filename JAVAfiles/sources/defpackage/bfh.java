package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfh extends arrp implements arqr<agf, arnb> {
    final /* synthetic */ bfb a;
    final /* synthetic */ agi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bfh(bfb bfbVar, agi agiVar) {
        super(1);
        this.a = bfbVar;
        this.b = agiVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        boolean z;
        dcf dcfVar;
        agf agfVar = (agf) obj;
        bfb bfbVar = this.a;
        doy doyVar = bfbVar.e;
        boolean h = djc.h(bfbVar.f().b);
        ayp aypVar = ayp.a;
        boolean z2 = true;
        if (!h && this.a.v()) {
            z = true;
        } else {
            z = false;
        }
        bfb bfbVar2 = this.a;
        if (z) {
            agfVar.a.add(new cdj(262103052, true, new agg(new awt(aypVar), cga.e, new bfd(this.b, bfbVar2))));
        }
        agi agiVar = this.b;
        bfb bfbVar3 = this.a;
        ayp aypVar2 = ayp.b;
        if (!h) {
            agfVar.a.add(new cdj(262103052, true, new agg(new awt(aypVar2), cga.e, new bfe(agiVar, bfbVar3))));
        }
        agi agiVar2 = this.b;
        bfb bfbVar4 = this.a;
        ayp aypVar3 = ayp.c;
        if (!bfbVar4.v() || (dcfVar = this.a.f) == null || !dcfVar.d()) {
            z2 = false;
        }
        bfb bfbVar5 = this.a;
        if (z2) {
            agfVar.a.add(new cdj(262103052, true, new agg(new awt(aypVar3), cga.e, new bff(agiVar2, bfbVar5))));
        }
        agi agiVar3 = this.b;
        bfb bfbVar6 = this.a;
        ayp aypVar4 = ayp.d;
        int b = djc.b(bfbVar6.f().b);
        int length = this.a.f().a().length();
        bfb bfbVar7 = this.a;
        if (b != length) {
            agfVar.a.add(new cdj(262103052, true, new agg(new awt(aypVar4), cga.e, new bfg(agiVar3, bfbVar7))));
        }
        return arnb.a;
    }
}
