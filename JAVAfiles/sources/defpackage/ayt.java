package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ayt extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
    int a;
    final /* synthetic */ baw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayt(baw bawVar, arpe arpeVar) {
        super(2, arpeVar);
        this.b = bawVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ayt) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        Object obj2 = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            baw bawVar = this.b;
            this.a = 1;
            Object d = arwi.d(new bav(bawVar, null), this);
            if (d != arpl.a) {
                d = arnb.a;
            }
            if (d == obj2) {
                return obj2;
            }
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new ayt(this.b, arpeVar);
    }
}
