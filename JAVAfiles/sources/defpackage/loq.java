package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class loq {
    public final String a;
    public final Uri b;

    public loq(String str, Uri uri) {
        this.a = str;
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof loq)) {
            return false;
        }
        loq loqVar = (loq) obj;
        if (d.F(this.a, loqVar.a) && d.F(this.b, loqVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "TypedUri(contentType=" + this.a + ", uri=" + this.b + ")";
    }
}
