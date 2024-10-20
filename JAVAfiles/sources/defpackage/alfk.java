package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alfk extends algc {
    final algc a;
    final algc b;

    public alfk(algc algcVar, algc algcVar2) {
        this.a = algcVar;
        this.b = algcVar2;
    }

    @Override // defpackage.algc
    public final void b(BitSet bitSet) {
        BitSet bitSet2 = new BitSet();
        this.a.b(bitSet2);
        BitSet bitSet3 = new BitSet();
        this.b.b(bitSet3);
        bitSet2.and(bitSet3);
        bitSet.or(bitSet2);
    }

    @Override // defpackage.algc
    public final boolean c(char c) {
        if (this.a.c(c) && this.b.c(c)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        algc algcVar = this.b;
        return "CharMatcher.and(" + this.a.toString() + ", " + algcVar.toString() + ")";
    }
}
