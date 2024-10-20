package defpackage;

import java.util.BitSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alft extends alfq {
    private final char a;
    private final char b;

    public alft(char c, char c2) {
        this.a = c;
        this.b = c2;
    }

    @Override // defpackage.algc
    public final void b(BitSet bitSet) {
        bitSet.set(this.a);
        bitSet.set(this.b);
    }

    @Override // defpackage.algc
    public final boolean c(char c) {
        if (c != this.a && c != this.b) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "CharMatcher.anyOf(\"" + algc.n(this.a) + algc.n(this.b) + "\")";
    }
}
