package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bdx extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
    int a;
    final /* synthetic */ zj b;
    final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bdx(zj zjVar, long j, arpe arpeVar) {
        super(2, arpeVar);
        this.b = zjVar;
        this.c = j;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bdx) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            zj zjVar = this.b;
            cjn cjnVar = new cjn(this.c);
            abm abmVar = bdu.d;
            this.a = 1;
            if (zj.j(zjVar, cjnVar, abmVar, this, 12) == arplVar) {
                return arplVar;
            }
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new bdx(this.b, this.c, arpeVar);
    }
}
