package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rcm extends arpw implements arqv {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ rcr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rcm(boolean z, boolean z2, rcr rcrVar, arpe arpeVar) {
        super(2, arpeVar);
        this.a = z;
        this.b = z2;
        this.c = rcrVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((rcm) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aqil.P(obj);
        xze xzeVar = rcr.a;
        rbk.d(riw.e(this.a, this.b), this.c.r);
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new rcm(this.a, this.b, this.c, arpeVar);
    }
}
