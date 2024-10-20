package defpackage;

import defpackage.cvc;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aqa extends arrp implements arqr<cvc.a, arnb> {
    final /* synthetic */ List a;
    final /* synthetic */ List b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqa(List list, List list2) {
        super(1);
        this.a = list;
        this.b = list2;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        List list = this.a;
        cvc.a aVar = (cvc.a) obj;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((aqf) list.get(i)).n(aVar);
        }
        List list2 = this.b;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((aqf) list2.get(i2)).n(aVar);
        }
        return arnb.a;
    }
}
