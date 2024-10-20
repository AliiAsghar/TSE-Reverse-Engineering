package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class alfx extends algc {
    final algc b;

    public alfx(algc algcVar) {
        this.b = algcVar;
    }

    @Override // defpackage.algc
    public final void b(BitSet bitSet) {
        BitSet bitSet2 = new BitSet();
        this.b.b(bitSet2);
        bitSet2.flip(0, 65536);
        bitSet.or(bitSet2);
    }

    @Override // defpackage.algc
    public final boolean c(char c) {
        if (!this.b.c(c)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.algc
    public final algc f() {
        return this.b;
    }

    @Override // defpackage.algc
    public final boolean h(CharSequence charSequence) {
        return this.b.i(charSequence);
    }

    @Override // defpackage.algc
    public final boolean i(CharSequence charSequence) {
        return this.b.h(charSequence);
    }

    public String toString() {
        return this.b.toString().concat(".negate()");
    }
}
