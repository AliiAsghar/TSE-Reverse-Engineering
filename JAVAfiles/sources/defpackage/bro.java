package defpackage;

import defpackage.cvc;
import defpackage.dqs;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bro extends arrp implements arqr<cvc.a, arnb> {
    final /* synthetic */ int a;
    final /* synthetic */ List b;
    final /* synthetic */ cvn c;
    final /* synthetic */ arqv d;
    final /* synthetic */ bpd e;
    final /* synthetic */ int f;
    final /* synthetic */ List g;
    final /* synthetic */ long h;
    final /* synthetic */ int i;
    final /* synthetic */ int j;
    final /* synthetic */ arqw k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bro(int i, List list, cvn cvnVar, arqv arqvVar, bpd bpdVar, int i2, List list2, long j, int i3, int i4, arqw arqwVar) {
        super(1);
        this.a = i;
        this.b = list;
        this.c = cvnVar;
        this.d = arqvVar;
        this.e = bpdVar;
        this.f = i2;
        this.g = list2;
        this.h = j;
        this.i = i3;
        this.j = i4;
        this.k = arqwVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        cvc.a aVar = (cvc.a) obj;
        ArrayList arrayList = new ArrayList();
        int i = this.a;
        List list = this.b;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = this.g;
            cvn cvnVar = this.c;
            cvc cvcVar = (cvc) list.get(i2);
            cvc.a.m(aVar, cvcVar, i, 0);
            arrayList.add(new brj(cvnVar.eh(i), cvnVar.eh(cvcVar.a), ((dqy) list2.get(i2)).a));
            i += cvcVar.a;
        }
        List a = this.c.a(brq.b, this.d);
        long j = this.h;
        int i3 = this.i;
        int i4 = this.j;
        int i5 = 0;
        for (int size2 = a.size(); i5 < size2; size2 = size2) {
            cvc e = ((cuc) a.get(i5)).e(dqs.k(j, i3, i3, 0, 0, 8));
            cvc.a.m(aVar, e, 0, i4 - e.b);
            i5++;
        }
        List a2 = this.c.a(brq.c, new cdj(1734082948, true, new brn(this.k, arrayList)));
        int i6 = this.i;
        int i7 = this.j;
        int size3 = a2.size();
        for (int i8 = 0; i8 < size3; i8++) {
            cvc.a.m(aVar, ((cuc) a2.get(i8)).e(dqs.a.c(i6, i7)), 0, 0);
        }
        bpd bpdVar = this.e;
        cvn cvnVar2 = this.c;
        int i9 = this.a;
        int i10 = this.f;
        Integer num = bpdVar.d;
        if (num == null || num.intValue() != i10) {
            bpdVar.d = Integer.valueOf(i10);
            brj brjVar = (brj) aqjn.aa(arrayList, i10);
            if (brjVar != null) {
                int eo = cvnVar2.eo(((brj) aqjn.ac(arrayList)).a()) + i9;
                int b = eo - bpdVar.a.b();
                int eo2 = cvnVar2.eo(brjVar.a) - ((b / 2) - (cvnVar2.eo(brjVar.b) / 2));
                afv afvVar = bpdVar.a;
                int u = arrn.u(eo2, 0, arrn.r(eo - b, 0));
                if (afvVar.c() != u) {
                    arrn.J(bpdVar.b, null, null, new bpc(bpdVar, u, null), 3);
                }
            }
        }
        return arnb.a;
    }
}
