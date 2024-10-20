package defpackage;

import defpackage.cvc;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bhd extends arrp implements arqr<cvc.a, arnb> {
    final /* synthetic */ List a;
    final /* synthetic */ List b;
    final /* synthetic */ List c;
    final /* synthetic */ List d;
    final /* synthetic */ List e;
    final /* synthetic */ int f;
    final /* synthetic */ int g;
    final /* synthetic */ int h;
    final /* synthetic */ Integer i;
    final /* synthetic */ bgp j;
    final /* synthetic */ Integer k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhd(List list, List list2, List list3, List list4, List list5, int i, int i2, int i3, Integer num, bgp bgpVar, Integer num2) {
        super(1);
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = list5;
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = num;
        this.j = bgpVar;
        this.k = num2;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        int i;
        int i2;
        int i3;
        cvc.a aVar = (cvc.a) obj;
        List list = this.a;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            aVar.e((cvc) list.get(i4), 0, this.f, brg.a);
        }
        List list2 = this.b;
        int size2 = list2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            aVar.e((cvc) list2.get(i5), 0, 0, brg.a);
        }
        List list3 = this.c;
        int i6 = this.g;
        int i7 = this.h;
        int size3 = list3.size();
        for (int i8 = 0; i8 < size3; i8++) {
            aVar.e((cvc) list3.get(i8), 0, i6 - i7, brg.a);
        }
        List list4 = this.d;
        int i9 = this.g;
        Integer num = this.i;
        int size4 = list4.size();
        for (int i10 = 0; i10 < size4; i10++) {
            cvc cvcVar = (cvc) list4.get(i10);
            if (num != null) {
                i3 = num.intValue();
            } else {
                i3 = 0;
            }
            aVar.e(cvcVar, 0, i9 - i3, brg.a);
        }
        List list5 = this.e;
        bgp bgpVar = this.j;
        int i11 = this.g;
        Integer num2 = this.k;
        int size5 = list5.size();
        for (int i12 = 0; i12 < size5; i12++) {
            cvc cvcVar2 = (cvc) list5.get(i12);
            if (bgpVar != null) {
                i = bgpVar.a;
            } else {
                i = 0;
            }
            if (num2 != null) {
                i2 = num2.intValue();
            } else {
                i2 = 0;
            }
            aVar.e(cvcVar2, i, i11 - i2, brg.a);
        }
        return arnb.a;
    }
}
