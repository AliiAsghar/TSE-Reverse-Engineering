package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ukf {
    public final anlw a;
    public final tqr b;
    public final Uri c;

    public ukf() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static pa a(tqr tqrVar) {
        pa paVar = new pa((char[]) null);
        paVar.h(anlw.a);
        paVar.i(tqr.VERIFICATION_NA);
        paVar.i(tqrVar);
        return paVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ukf) {
            ukf ukfVar = (ukf) obj;
            if (this.a.equals(ukfVar.a) && this.b.equals(ukfVar.b)) {
                Uri uri = this.c;
                Uri uri2 = ukfVar.c;
                if (uri != null ? uri.equals(uri2) : uri2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        Uri uri = this.c;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        return (hashCode2 * 1000003) ^ hashCode;
    }

    public final String toString() {
        Uri uri = this.c;
        tqr tqrVar = this.b;
        return "BrandAndVerification{brandInfo=" + String.valueOf(this.a) + ", status=" + String.valueOf(tqrVar) + ", localLogoUri=" + String.valueOf(uri) + "}";
    }

    public ukf(anlw anlwVar, tqr tqrVar, Uri uri) {
        this.a = anlwVar;
        this.b = tqrVar;
        this.c = uri;
    }
}
