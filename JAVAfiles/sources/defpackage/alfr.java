package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alfr extends alfq {
    private final char a;
    private final char b;

    public alfr(char c, char c2) {
        boolean z;
        if (c2 >= c) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        this.a = c;
        this.b = c2;
    }

    @Override // defpackage.algc
    public final void b(BitSet bitSet) {
        bitSet.set(this.a, this.b + 1);
    }

    @Override // defpackage.algc
    public final boolean c(char c) {
        if (this.a <= c && c <= this.b) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "CharMatcher.inRange('" + algc.n(this.a) + "', '" + algc.n(this.b) + "')";
    }
}
