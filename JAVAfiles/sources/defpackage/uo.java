package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class uo extends arpv implements arqv {
    Object a;
    Object b;
    Object c;
    int d;
    int e;
    final /* synthetic */ up f;
    final /* synthetic */ vc g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo(vc vcVar, up upVar, arpe arpeVar) {
        super(arpeVar);
        this.g = vcVar;
        this.f = upVar;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((uo) c((artz) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        artz artzVar;
        Object obj2;
        Object obj3;
        int i;
        Object obj4;
        arpl arplVar = arpl.a;
        if (this.e != 0) {
            i = this.d;
            obj3 = this.c;
            Object obj5 = this.b;
            obj2 = this.a;
            artzVar = (artz) this.h;
            aqil.P(obj);
            obj4 = obj5;
        } else {
            aqil.P(obj);
            artzVar = (artz) this.h;
            vc vcVar = this.g;
            obj2 = this.f;
            obj3 = vcVar.c;
            i = vcVar.e;
            obj4 = vcVar;
        }
        while (i != Integer.MAX_VALUE) {
            long j = ((long[]) obj3)[i] >> 31;
            ((up) obj2).a = i;
            Object obj6 = ((vc) obj4).b[i];
            this.h = artzVar;
            this.a = obj2;
            this.b = obj4;
            this.c = obj3;
            i = (int) (j & 2147483647L);
            this.d = i;
            this.e = 1;
            if (artzVar.a(obj6, this) == arplVar) {
                return arplVar;
            }
        }
        return arnb.a;
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        uo uoVar = new uo(this.g, this.f, arpeVar);
        uoVar.h = obj;
        return uoVar;
    }
}
