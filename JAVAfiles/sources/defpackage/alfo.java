package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alfo extends alfw {
    private final BitSet a;

    public alfo(BitSet bitSet, String str) {
        super(str);
        this.a = bitSet.length() + 64 < bitSet.size() ? (BitSet) bitSet.clone() : bitSet;
    }

    @Override // defpackage.algc
    public final void b(BitSet bitSet) {
        bitSet.or(this.a);
    }

    @Override // defpackage.algc
    public final boolean c(char c) {
        return this.a.get(c);
    }
}
