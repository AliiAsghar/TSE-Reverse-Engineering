package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alfu extends alfq {
    private final char a;

    public alfu(char c) {
        this.a = c;
    }

    @Override // defpackage.algc
    public final void b(BitSet bitSet) {
        bitSet.set(0, this.a);
        bitSet.set(this.a + 1, 65536);
    }

    @Override // defpackage.algc
    public final boolean c(char c) {
        if (c != this.a) {
            return true;
        }
        return false;
    }

    @Override // defpackage.alfq, defpackage.algc
    public final algc f() {
        return new alfs(this.a);
    }

    @Override // defpackage.algc
    public final algc g(algc algcVar) {
        if (algcVar.c(this.a)) {
            return alfl.a;
        }
        return this;
    }

    public final String toString() {
        return "CharMatcher.isNot('" + algc.n(this.a) + "')";
    }
}
