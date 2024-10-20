package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class asbu extends arpw implements arqv {
    /* synthetic */ int a;

    public asbu(arpe arpeVar) {
        super(2, arpeVar);
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((asbu) c(Integer.valueOf(((Number) obj).intValue()), (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        boolean z;
        aqil.P(obj);
        if (this.a > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        asbu asbuVar = new asbu(arpeVar);
        asbuVar.a = ((Number) obj).intValue();
        return asbuVar;
    }
}
