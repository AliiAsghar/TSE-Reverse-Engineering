package defpackage;

import j$.util.Objects;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apvl {
    public final long a;
    public final long b;
    public final algw c;
    private final MessageDigest d = null;
    private final boolean e = false;

    public apvl(apvk apvkVar) {
        this.a = apvkVar.a;
        this.b = apvkVar.b;
        this.c = apvkVar.c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof apvl) {
            apvl apvlVar = (apvl) obj;
            if (this.a == apvlVar.a && this.b == apvlVar.b) {
                MessageDigest messageDigest = apvlVar.d;
                if (Objects.equals(null, null) && this.c.equals(apvlVar.c)) {
                    boolean z = apvlVar.e;
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), null, this.c, false});
    }

    public final String toString() {
        return String.format(Locale.US, "TransferOptions[idleTimeout %d sec, resumableTransferThreshold=%d, digest=%s, crc32c=%s, forceMultipart=%s]", Long.valueOf(this.a), Long.valueOf(this.b), null, alfd.a, false);
    }
}
