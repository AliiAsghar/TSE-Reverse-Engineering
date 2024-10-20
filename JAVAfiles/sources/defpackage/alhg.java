package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class alhg extends alfw {
    private final char[] a;
    private final boolean b;
    private final long c;

    public alhg(char[] cArr, long j, boolean z, String str) {
        super(str);
        this.a = cArr;
        this.c = j;
        this.b = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int o(int i) {
        return Integer.rotateLeft(i * (-862048943), 15) * 461845907;
    }

    @Override // defpackage.algc
    public final void b(BitSet bitSet) {
        if (this.b) {
            bitSet.set(0);
        }
        for (char c : this.a) {
            if (c != 0) {
                bitSet.set(c);
            }
        }
    }

    @Override // defpackage.algc
    public final boolean c(char c) {
        if (c == 0) {
            return this.b;
        }
        if (((this.c >> c) & 1) == 1) {
            char[] cArr = this.a;
            int o = o(c);
            int length = cArr.length - 1;
            int i = o & length;
            int i2 = i;
            do {
                char c2 = this.a[i2];
                if (c2 == 0) {
                    return false;
                }
                if (c2 == c) {
                    return true;
                }
                i2 = (i2 + 1) & length;
            } while (i2 != i);
        }
        return false;
    }
}
