package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class brp extends arrp implements arqv<cvn, dqs, cuf> {
    final /* synthetic */ float a;
    final /* synthetic */ arqv b;
    final /* synthetic */ arqv c;
    final /* synthetic */ bpd d;
    final /* synthetic */ int e;
    final /* synthetic */ arqw f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public brp(float f, arqv arqvVar, arqv arqvVar2, bpd bpdVar, int i, arqw arqwVar) {
        super(2);
        this.a = f;
        this.b = arqvVar;
        this.c = arqvVar2;
        this.d = bpdVar;
        this.e = i;
        this.f = arqwVar;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        cuf et;
        cvn cvnVar = (cvn) obj;
        long j = ((dqs) obj2).a;
        int eo = cvnVar.eo(90.0f);
        int eo2 = cvnVar.eo(this.a);
        List a = cvnVar.a(brq.a, this.b);
        Integer num = 0;
        int size = a.size();
        for (int i = 0; i < size; i++) {
            num = Integer.valueOf(Math.max(num.intValue(), ((cuc) a.get(i)).a(Integer.MAX_VALUE)));
        }
        int intValue = num.intValue();
        long k = dqs.k(j, eo, 0, intValue, intValue, 2);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size2 = a.size();
        for (int i2 = 0; i2 < size2; i2++) {
            cuc cucVar = (cuc) a.get(i2);
            cvc e = cucVar.e(k);
            float eh = cvnVar.eh(Math.min(cucVar.b(e.b), e.a));
            float f = brg.b;
            arrayList.add(e);
            arrayList2.add(new dqy(eh - (f + f)));
        }
        Integer valueOf = Integer.valueOf(eo2 + eo2);
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            valueOf = Integer.valueOf(valueOf.intValue() + ((cvc) arrayList.get(i3)).a);
        }
        int intValue2 = valueOf.intValue();
        et = cvnVar.et(intValue2, intValue, arnw.a, new bro(eo2, arrayList, cvnVar, this.c, this.d, this.e, arrayList2, j, intValue2, intValue, this.f));
        return et;
    }
}
