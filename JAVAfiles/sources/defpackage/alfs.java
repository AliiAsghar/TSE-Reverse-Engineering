package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alfs extends alfq {
    public final char a;

    public alfs(char c) {
        this.a = c;
    }

    @Override // defpackage.algc
    public final void b(BitSet bitSet) {
        bitSet.set(this.a);
    }

    @Override // defpackage.algc
    public final boolean c(char c) {
        if (c == this.a) {
            return true;
        }
        return false;
    }

    @Override // defpackage.alfq, defpackage.algc
    public final algc f() {
        return new alfu(this.a);
    }

    @Override // defpackage.algc
    public final algc g(algc algcVar) {
        if (algcVar.c(this.a)) {
            return algcVar;
        }
        return new alga(this, algcVar);
    }

    public final String toString() {
        return "CharMatcher.is('" + algc.n(this.a) + "')";
    }
}
