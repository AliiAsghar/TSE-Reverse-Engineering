package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adb extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
    int a;
    final /* synthetic */ ajr b;
    final /* synthetic */ ajn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adb(ajr ajrVar, ajn ajnVar, arpe arpeVar) {
        super(2, arpeVar);
        this.b = ajrVar;
        this.c = ajnVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((adb) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            ajr ajrVar = this.b;
            ajn ajnVar = this.c;
            this.a = 1;
            if (ajrVar.b(ajnVar, this) == arplVar) {
                return arplVar;
            }
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new adb(this.b, this.c, arpeVar);
    }
}
