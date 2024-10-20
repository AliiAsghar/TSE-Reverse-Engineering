package defpackage;

import android.net.Uri;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vlq {
    public final String a;
    public final Uri b;
    public final Optional c;

    public vlq() {
        throw null;
    }

    public static vlq a(String str, Uri uri) {
        return new vlq(str, uri, Optional.empty());
    }

    public static vlq b(String str, Uri uri, Uri uri2) {
        return new vlq(str, uri, Optional.ofNullable(uri2));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vlq) {
            vlq vlqVar = (vlq) obj;
            if (this.a.equals(vlqVar.a) && this.b.equals(vlqVar.b) && this.c.equals(vlqVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        Optional optional = this.c;
        return "PersonInfo{name=" + this.a + ", iconUri=" + this.b.toString() + ", contactUri=" + optional.toString() + "}";
    }

    public vlq(String str, Uri uri, Optional optional) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.a = str;
        if (uri != null) {
            this.b = uri;
            this.c = optional;
            return;
        }
        throw new NullPointerException("Null iconUri");
    }
}
