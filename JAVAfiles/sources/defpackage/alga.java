package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alga extends algc {
    final algc a;
    final algc b;

    public alga(algc algcVar, algc algcVar2) {
        this.a = algcVar;
        algcVar2.getClass();
        this.b = algcVar2;
    }

    @Override // defpackage.algc
    public final void b(BitSet bitSet) {
        this.a.b(bitSet);
        this.b.b(bitSet);
    }

    @Override // defpackage.algc
    public final boolean c(char c) {
        if (!this.a.c(c) && !this.b.c(c)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        algc algcVar = this.b;
        return "CharMatcher.or(" + this.a.toString() + ", " + algcVar.toString() + ")";
    }
}
