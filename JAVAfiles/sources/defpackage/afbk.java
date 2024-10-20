package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afbk extends arpw implements arqv {
    int a;
    final /* synthetic */ crk b;
    final /* synthetic */ boolean c;
    final /* synthetic */ arqr d;
    final /* synthetic */ afbo e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afbk(crk crkVar, boolean z, arqr arqrVar, afbo afboVar, arpe arpeVar) {
        super(2, arpeVar);
        this.b = crkVar;
        this.c = z;
        this.d = arqrVar;
        this.e = afboVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((afbk) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            arwe arweVar = (arwe) this.f;
            crk crkVar = this.b;
            afbj afbjVar = new afbj(arweVar, this.c, this.d, this.e, null);
            this.a = 1;
            if (ahm.b(crkVar, afbjVar, this) == arplVar) {
                return arplVar;
            }
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        afbk afbkVar = new afbk(this.b, this.c, this.d, this.e, arpeVar);
        afbkVar.f = obj;
        return afbkVar;
    }
}
