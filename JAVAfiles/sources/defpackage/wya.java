package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wya {
    public final String a;
    public final byte[] b;

    public wya() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wya) {
            wya wyaVar = (wya) obj;
            if (this.a.equals(wyaVar.a)) {
                boolean z = wyaVar instanceof wya;
                if (Arrays.equals(this.b, wyaVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "CustomRcsReport{mimeType=" + this.a + ", customReport=" + Arrays.toString(this.b) + "}";
    }

    public wya(String str, byte[] bArr) {
        if (str == null) {
            throw new NullPointerException("Null mimeType");
        }
        this.a = str;
        if (bArr != null) {
            this.b = bArr;
            return;
        }
        throw new NullPointerException("Null customReport");
    }
}
