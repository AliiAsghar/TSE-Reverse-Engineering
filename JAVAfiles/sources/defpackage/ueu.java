package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ueu {
    public final String a;
    public final Uri b;

    public ueu(String str, Uri uri) {
        this.a = str;
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ueu)) {
            return false;
        }
        ueu ueuVar = (ueu) obj;
        if (d.F(this.a, ueuVar.a) && d.F(this.b, ueuVar.b)) {
            return true;
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
        return (hashCode * 31) + i;
    }

    public final String toString() {
        return "VCardDetails(displayName=" + this.a + ", avatarUri=" + this.b + ")";
    }
}
