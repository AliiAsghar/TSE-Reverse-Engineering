package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yyn extends arpw implements arqv {
    boolean a;
    int b;
    final /* synthetic */ abvz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yyn(abvz abvzVar, arpe arpeVar) {
        super(2, arpeVar);
        this.c = abvzVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yyn) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [armf, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        boolean z;
        arpl arplVar = arpl.a;
        boolean z2 = true;
        if (this.b != 0) {
            z = this.a;
            aqil.P(obj);
        } else {
            aqil.P(obj);
            alhr alhrVar = kpt.a;
            akul b = ((kkc) this.c.i.b()).b();
            boolean c = ((yyt) this.c.g.b()).c();
            this.a = c;
            this.b = 1;
            obj = arro.F(b, this);
            if (obj != arplVar) {
                z = c;
            } else {
                return arplVar;
            }
        }
        abvz abvzVar = this.c;
        if (!((Boolean) obj).booleanValue() || !z) {
            z2 = false;
        }
        abvzVar.a = z2;
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new yyn(this.c, arpeVar);
    }
}
