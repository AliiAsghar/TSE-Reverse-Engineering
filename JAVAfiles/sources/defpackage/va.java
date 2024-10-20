package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class va extends arpv implements arqv {
    Object a;
    Object b;
    int c;
    int d;
    final /* synthetic */ vc e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va(vc vcVar, arpe arpeVar) {
        super(arpeVar);
        this.e = vcVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((va) c((artz) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        artz artzVar;
        Object obj2;
        int i;
        Object obj3;
        arpl arplVar = arpl.a;
        if (this.d != 0) {
            i = this.c;
            obj2 = this.b;
            Object obj4 = this.a;
            artzVar = (artz) this.f;
            aqil.P(obj);
            obj3 = obj4;
        } else {
            aqil.P(obj);
            artzVar = (artz) this.f;
            vc vcVar = this.e;
            Object obj5 = vcVar.b;
            obj2 = vcVar.c;
            i = vcVar.e;
            obj3 = obj5;
        }
        while (i != Integer.MAX_VALUE) {
            long j = ((long[]) obj2)[i] >> 31;
            Object obj6 = ((Object[]) obj3)[i];
            this.f = artzVar;
            this.a = obj3;
            this.b = obj2;
            i = (int) (j & 2147483647L);
            this.c = i;
            this.d = 1;
            if (artzVar.a(obj6, this) == arplVar) {
                return arplVar;
            }
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        va vaVar = new va(this.e, arpeVar);
        vaVar.f = obj;
        return vaVar;
    }
}
