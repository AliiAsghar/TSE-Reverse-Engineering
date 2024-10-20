package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xqj {
    public final Uri a;
    public final Uri b;

    public xqj() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xqj) {
            xqj xqjVar = (xqj) obj;
            if (this.a.equals(xqjVar.a)) {
                Uri uri = this.b;
                Uri uri2 = xqjVar.b;
                if (uri != null ? uri.equals(uri2) : uri2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() ^ 1000003;
        Uri uri = this.b;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        return (hashCode2 * 1000003) ^ hashCode;
    }

    public final String toString() {
        Uri uri = this.b;
        return "FileDownloadUris{tempFileUri=" + this.a.toString() + ", telephonyUri=" + String.valueOf(uri) + "}";
    }

    public xqj(Uri uri, Uri uri2) {
        if (uri == null) {
            throw new NullPointerException("Null tempFileUri");
        }
        this.a = uri;
        this.b = uri2;
    }
}
