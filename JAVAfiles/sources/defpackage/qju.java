package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qju extends arpw implements arqx {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    final /* synthetic */ arrb e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qju(arrb arrbVar, arpe arpeVar) {
        super(4, arpeVar);
        this.e = arrbVar;
    }

    @Override // defpackage.arqx
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        qju qjuVar = new qju(this.e, (arpe) obj4);
        qjuVar.b = (armt) obj;
        qjuVar.c = (armt) obj2;
        qjuVar.d = obj3;
        return qjuVar.b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            Object obj2 = this.b;
            Object obj3 = this.c;
            Object obj4 = this.d;
            arrb arrbVar = this.e;
            armt armtVar = (armt) obj2;
            Object obj5 = armtVar.a;
            Object obj6 = armtVar.b;
            Object obj7 = armtVar.c;
            armt armtVar2 = (armt) obj3;
            Object obj8 = armtVar2.a;
            Object obj9 = armtVar2.b;
            Object obj10 = armtVar2.c;
            this.b = null;
            this.c = null;
            this.a = 1;
            boolean booleanValue = ((Boolean) obj10).booleanValue();
            kkd kkdVar = new kkd(((kkd) arrbVar).h, this);
            kkdVar.a = (miu) obj5;
            kkdVar.b = (khd) obj6;
            kkdVar.c = (String) obj7;
            kkdVar.d = (alog) obj8;
            kkdVar.e = (afam) obj9;
            kkdVar.f = booleanValue;
            kkdVar.g = (mmy) obj4;
            obj = kkdVar.b(arnb.a);
            if (obj == arplVar) {
                return arplVar;
            }
        }
        return obj;
    }
}
