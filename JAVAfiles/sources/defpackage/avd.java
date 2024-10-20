package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class avd extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
    int a;
    final /* synthetic */ avc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avd(avc avcVar, arpe arpeVar) {
        super(2, arpeVar);
        this.b = avcVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avd) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        Object obj2 = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            avc avcVar = this.b;
            this.a = 1;
            Object s = avc.s(avcVar, afd.a, new ahu(null), this);
            if (s != arpl.a) {
                s = arnb.a;
            }
            if (s == obj2) {
                return obj2;
            }
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new avd(this.b, arpeVar);
    }
}
