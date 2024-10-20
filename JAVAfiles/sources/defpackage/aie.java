package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aie extends arpw implements arqv<cjn, arpe<? super cjn>, Object> {
    int a;
    /* synthetic */ long b;
    final /* synthetic */ aia c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aie(aia aiaVar, arpe arpeVar) {
        super(2, arpeVar);
        this.c = aiaVar;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aie) c(new cjn(((cjn) obj).a), (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            long j = this.b;
            aia aiaVar = this.c;
            this.a = 1;
            obj = ahy.b(aiaVar.k, j, this);
            if (obj == arplVar) {
                return arplVar;
            }
        }
        return obj;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        aie aieVar = new aie(this.c, arpeVar);
        aieVar.b = ((cjn) obj).a;
        return aieVar;
    }
}
