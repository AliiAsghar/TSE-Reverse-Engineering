package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adc extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
    int a;
    final /* synthetic */ ajr b;
    final /* synthetic */ ajo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adc(ajr ajrVar, ajo ajoVar, arpe arpeVar) {
        super(2, arpeVar);
        this.b = ajrVar;
        this.c = ajoVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((adc) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            ajr ajrVar = this.b;
            ajo ajoVar = this.c;
            this.a = 1;
            if (ajrVar.b(ajoVar, this) == arplVar) {
                return arplVar;
            }
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new adc(this.b, this.c, arpeVar);
    }
}
