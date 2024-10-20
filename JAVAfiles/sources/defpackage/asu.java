package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class asu extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
    int a;
    final /* synthetic */ ast b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asu(ast astVar, int i, arpe arpeVar) {
        super(2, arpeVar);
        this.b = astVar;
        this.c = i;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((asu) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            ast astVar = this.b;
            int i2 = this.c;
            asr asrVar = astVar.b;
            this.a = 1;
            if (asrVar.f(i2, this) == arplVar) {
                return arplVar;
            }
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new asu(this.b, this.c, arpeVar);
    }
}
