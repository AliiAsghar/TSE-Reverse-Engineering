package defpackage;

import defpackage.cvc;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aun extends arrp implements arqr<cvc.a, arnb> {
    final /* synthetic */ List a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aun(List list) {
        super(1);
        this.a = list;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        List list = this.a;
        cvc.a aVar = (cvc.a) obj;
        int size = list.size();
        int i = 0;
        while (i < size) {
            atx atxVar = (atx) list.get(i);
            if (atxVar.i == Integer.MIN_VALUE) {
                aju.c("position() should be called first");
            }
            int size2 = atxVar.b.size();
            int i2 = 0;
            while (i2 < size2) {
                cvc cvcVar = (cvc) atxVar.b.get(i2);
                int[] iArr = atxVar.g;
                int i3 = i2 + i2;
                int i4 = iArr[i3];
                long j = iArr[i3 + 1];
                int i5 = i;
                long d = dre.d((i4 << 32) | (j & 4294967295L), atxVar.c);
                if (atxVar.e) {
                    aVar.h(cvcVar, d, brg.a, cvd.a);
                } else {
                    cvc.a.p(aVar, cvcVar, d);
                }
                i2++;
                i = i5;
            }
            i++;
        }
        return arnb.a;
    }
}
