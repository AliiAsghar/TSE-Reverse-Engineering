package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rwx {
    public final String a;
    public final Uri b;

    public rwx() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rwx) {
            rwx rwxVar = (rwx) obj;
            String str = this.a;
            if (str != null ? str.equals(rwxVar.a) : rwxVar.a == null) {
                Uri uri = this.b;
                Uri uri2 = rwxVar.b;
                if (uri != null ? uri.equals(uri2) : uri2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        Uri uri = this.b;
        if (uri != null) {
            i = uri.hashCode();
        }
        return ((hashCode ^ 1000003) * 1000003) ^ i;
    }

    public final String toString() {
        return "MessagePartContent{type=" + this.a + ", uri=" + String.valueOf(this.b) + "}";
    }

    public rwx(String str, Uri uri) {
        this.a = str;
        this.b = uri;
    }
}
