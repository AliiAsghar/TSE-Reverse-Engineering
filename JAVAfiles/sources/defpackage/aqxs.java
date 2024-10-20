package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aqxs {
    final InputStream a = null;
    final byte[] b;
    final int c;
    final boolean d;

    public aqxs(byte[] bArr, int i, boolean z) {
        this.b = bArr;
        this.c = i;
        this.d = z;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TransactionData[");
        sb.append(this.c);
        sb.append("b array");
        if (true != this.d) {
            str = "]";
        } else {
            str = "(last)]";
        }
        sb.append(str);
        return sb.toString();
    }
}
