package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jnp {
    public final jnr a;
    public final Uri b;

    public jnp(jnr jnrVar, Uri uri) {
        this.a = jnrVar;
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jnp)) {
            return false;
        }
        jnp jnpVar = (jnp) obj;
        if (d.F(this.a, jnpVar.a) && d.F(this.b, jnpVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        Uri uri = this.b;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        String str;
        Uri uri = this.b;
        if (uri != null) {
            str = yyb.bf(uri);
        } else {
            str = null;
        }
        return "DraftAttachmentContent(mapiContent=" + this.a + ", originalUri=" + str + ")";
    }
}
