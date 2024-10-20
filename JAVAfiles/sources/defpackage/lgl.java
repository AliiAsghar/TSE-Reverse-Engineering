package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lgl extends arpw implements arqx {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ ovn d;
    final /* synthetic */ ovq e;
    final /* synthetic */ nei f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lgl(nei neiVar, ovn ovnVar, ovq ovqVar, arpe arpeVar) {
        super(4, arpeVar);
        this.f = neiVar;
        this.d = ovnVar;
        this.e = ovqVar;
    }

    @Override // defpackage.arqx
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        lgl lglVar = new lgl(this.f, this.d, this.e, (arpe) obj4);
        lglVar.a = (aeno) obj;
        lglVar.b = (aenk) obj2;
        lglVar.c = (aeoi) obj3;
        return lglVar.b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aqil.P(obj);
        Object obj2 = this.a;
        aenk aenkVar = (aenk) this.b;
        List list = aenkVar.a;
        arqr arqrVar = aenkVar.b;
        arqr arqrVar2 = aenkVar.c;
        return new aeoq(new aenr((aeno) obj2, new aenk(list, arqrVar, arqrVar2), (aeoi) this.c, new aenq(null)), new aeom(arnv.a, null, lgk.c), null, null, brg.a, false, new aeop(this.d.a(), false, this.e.a(), 27), 56);
    }
}
