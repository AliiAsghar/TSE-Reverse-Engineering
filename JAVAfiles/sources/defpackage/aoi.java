package defpackage;

import defpackage.cvc;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aoi extends arrp implements arqr<cvc.a, arnb> {
    final /* synthetic */ List a;
    final /* synthetic */ List b;
    final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoi(List list, List list2, boolean z) {
        super(1);
        this.a = list;
        this.b = list2;
        this.c = z;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        List list = this.a;
        cvc.a aVar = (cvc.a) obj;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((aon) list.get(i)).m(aVar, this.c);
        }
        List list2 = this.b;
        boolean z = this.c;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((aon) list2.get(i2)).m(aVar, z);
        }
        return arnb.a;
    }
}
