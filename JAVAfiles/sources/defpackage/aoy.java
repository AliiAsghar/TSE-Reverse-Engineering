package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoy extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
    int a;
    final /* synthetic */ aov b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoy(aov aovVar, arpe arpeVar) {
        super(2, arpeVar);
        this.b = aovVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aoy) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            zt ztVar = this.b.r;
            Float f = new Float(brg.a);
            abm c = zs.c(brg.a, 400.0f, new Float(0.5f), 1);
            this.a = 1;
            if (abq.j(ztVar, f, c, true, null, this, 8) == arplVar) {
                return arplVar;
            }
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new aoy(this.b, arpeVar);
    }
}
