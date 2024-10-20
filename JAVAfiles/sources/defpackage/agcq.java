package defpackage;

import defpackage.cvc;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class agcq extends arrp implements arqr {
    final /* synthetic */ List a;
    final /* synthetic */ List b;
    final /* synthetic */ List c;
    final /* synthetic */ List d;
    final /* synthetic */ List e;
    final /* synthetic */ List f;
    final /* synthetic */ long g;
    final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agcq(List list, List list2, List list3, List list4, List list5, List list6, long j, int i) {
        super(1);
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = list5;
        this.f = list6;
        this.g = j;
        this.h = i;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        cvc.a aVar = (cvc.a) obj;
        aVar.getClass();
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            cvc.a.m(aVar, (cvc) list.get(i), 0, 0);
        }
        List list2 = this.b;
        long j = this.g;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            cvc cvcVar = (cvc) list2.get(i2);
            cvc.a.m(aVar, cvcVar, 0, dqs.a(j) - cvcVar.b);
        }
        int i3 = 0;
        for (cvc cvcVar2 : this.c) {
            cvc.a.m(aVar, cvcVar2, 0, i3);
            i3 += cvcVar2.b;
        }
        List<cvc> list3 = this.d;
        long j2 = this.g;
        int i4 = this.h;
        int i5 = 0;
        for (cvc cvcVar3 : list3) {
            cvc.a.m(aVar, cvcVar3, 0, (dqs.a(j2) - i4) + i5);
            i5 += cvcVar3.b;
        }
        List list4 = this.e;
        long j3 = this.g;
        int size3 = list4.size();
        for (int i6 = 0; i6 < size3; i6++) {
            cvc cvcVar4 = (cvc) list4.get(i6);
            cvc.a.m(aVar, cvcVar4, 0, dqs.a(j3) - cvcVar4.b);
        }
        List list5 = this.f;
        if (list5 != null) {
            long j4 = this.g;
            int size4 = list5.size();
            for (int i7 = 0; i7 < size4; i7++) {
                cvc cvcVar5 = (cvc) list5.get(i7);
                cvc.a.m(aVar, cvcVar5, (dqs.b(j4) - cvcVar5.a) / 2, dqs.a(j4) - cvcVar5.b);
            }
        }
        return arnb.a;
    }
}
