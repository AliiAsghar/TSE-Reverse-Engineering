package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeug extends arpw implements arqv {
    /* synthetic */ long a;
    final /* synthetic */ aeva b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeug(aeva aevaVar, arpe arpeVar) {
        super(2, arpeVar);
        this.b = aevaVar;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aeug) c(new dre(((dre) obj).a), (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aqil.P(obj);
        aeva aevaVar = this.b;
        long j = this.a;
        arqr arqrVar = ((aeun) aevaVar).d;
        if (arqrVar != null) {
            arqrVar.a(new dre(j));
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        aeug aeugVar = new aeug(this.b, arpeVar);
        aeugVar.a = ((dre) obj).a;
        return aeugVar;
    }
}
