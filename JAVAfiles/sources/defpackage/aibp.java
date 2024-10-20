package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aibp {
    private final Uri a;

    public aibp() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aibp)) {
            return false;
        }
        Uri uri = this.a;
        Uri uri2 = ((aibp) obj).a;
        if (uri == null) {
            if (uri2 == null) {
                return true;
            }
            return false;
        }
        return uri.equals(uri2);
    }

    public final int hashCode() {
        int hashCode;
        Uri uri = this.a;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        return hashCode ^ 1000003;
    }

    public final String toString() {
        return "FetchResolvedPhotoUriResponse{uri=" + String.valueOf(this.a) + "}";
    }

    public aibp(Uri uri) {
        this.a = uri;
    }
}
