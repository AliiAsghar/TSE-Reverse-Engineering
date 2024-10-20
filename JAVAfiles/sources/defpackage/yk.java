package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class yk extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
    final /* synthetic */ yd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yk(yd ydVar, arpe arpeVar) {
        super(2, arpeVar);
        this.a = ydVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yk) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aqil.P(obj);
        if (this.a.d.isEmpty()) {
            yd ydVar = this.a;
            ydVar.b.i.g(ydVar.a);
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new yk(this.a, arpeVar);
    }
}
