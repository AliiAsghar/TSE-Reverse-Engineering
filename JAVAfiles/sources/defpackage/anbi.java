package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anbi implements Serializable {
    private static final long serialVersionUID = 0;
    public final String a;
    public final int b;
    private final boolean c;

    private anbi(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }

    public static anbi a(String str, int i) {
        albo.L(d(i), "Port out of range: %s", i);
        anbi b = b(str);
        albo.N(!b.c(), "Host has a port: %s", str);
        return new anbi(b.a, i, b.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.anbi b(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anbi.b(java.lang.String):anbi");
    }

    private static boolean d(int i) {
        if (i >= 0 && i <= 65535) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.b >= 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof anbi) {
            anbi anbiVar = (anbi) obj;
            if (d.B(this.a, anbiVar.a) && this.b == anbiVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.a.length() + 8);
        if (this.a.indexOf(58) >= 0) {
            sb.append('[');
            sb.append(this.a);
            sb.append(']');
        } else {
            sb.append(this.a);
        }
        if (c()) {
            sb.append(':');
            sb.append(this.b);
        }
        return sb.toString();
    }
}
