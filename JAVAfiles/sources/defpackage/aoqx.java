package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aoqx extends aoon {
    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ Object a(aoro aoroVar) {
        BitSet bitSet = new BitSet();
        aoroVar.l();
        int t = aoroVar.t();
        int i = 0;
        while (t != 2) {
            int i2 = t - 1;
            if (i2 != 5 && i2 != 6) {
                if (i2 == 7) {
                    if (!aoroVar.s()) {
                        i++;
                        t = aoroVar.t();
                    }
                    bitSet.set(i);
                    i++;
                    t = aoroVar.t();
                } else {
                    throw new aook("Invalid bitset value type: " + d.C(t) + "; at path " + aoroVar.e());
                }
            } else {
                int c = aoroVar.c();
                if (c != 0) {
                    if (c != 1) {
                        throw new aook("Invalid bitset value " + c + ", expected 0 or 1; at path " + aoroVar.f());
                    }
                    bitSet.set(i);
                    i++;
                    t = aoroVar.t();
                } else {
                    continue;
                    i++;
                    t = aoroVar.t();
                }
            }
        }
        aoroVar.n();
        return bitSet;
    }

    @Override // defpackage.aoon
    public final /* bridge */ /* synthetic */ void b(aorp aorpVar, Object obj) {
        BitSet bitSet = (BitSet) obj;
        aorpVar.e();
        int length = bitSet.length();
        for (int i = 0; i < length; i++) {
            aorpVar.k(bitSet.get(i) ? 1L : 0L);
        }
        aorpVar.g();
    }
}
