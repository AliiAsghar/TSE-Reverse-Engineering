package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wfb extends arpw implements arqv {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ int c;
    final /* synthetic */ wyp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wfb(wyp wypVar, boolean z, boolean z2, int i, arpe arpeVar) {
        super(2, arpeVar);
        this.d = wypVar;
        this.a = z;
        this.b = z2;
        this.c = i;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wfb) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aqil.P(obj);
        aozy createBuilder = amxn.a.createBuilder();
        createBuilder.getClass();
        aktp.aW(10, createBuilder);
        aozy createBuilder2 = amxj.a.createBuilder();
        createBuilder2.getClass();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        boolean z = this.a;
        apag apagVar = createBuilder2.b;
        amxj amxjVar = (amxj) apagVar;
        amxjVar.b |= 1;
        amxjVar.c = z;
        if (!apagVar.isMutable()) {
            createBuilder2.u();
        }
        boolean z2 = this.b;
        apag apagVar2 = createBuilder2.b;
        amxj amxjVar2 = (amxj) apagVar2;
        amxjVar2.b |= 2;
        amxjVar2.d = z2;
        if (!apagVar2.isMutable()) {
            createBuilder2.u();
        }
        int i = this.c;
        amxj amxjVar3 = (amxj) createBuilder2.b;
        amxjVar3.b |= 4;
        amxjVar3.e = i;
        apag s = createBuilder2.s();
        s.getClass();
        amxj amxjVar4 = (amxj) s;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amxn amxnVar = (amxn) createBuilder.b;
        amxnVar.h = amxjVar4;
        amxnVar.b |= 8;
        this.d.q(aktp.aU(createBuilder));
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new wfb(this.d, this.a, this.b, this.c, arpeVar);
    }
}
