package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agdb implements agcz {
    public final Uri a;
    public final String b;
    public final boolean c = false;
    public final arqg d;
    private final String e;

    public agdb(Uri uri, String str, String str2, arqg arqgVar) {
        this.a = uri;
        this.e = str;
        this.b = str2;
        this.d = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agdb)) {
            return false;
        }
        agdb agdbVar = (agdb) obj;
        if (!d.F(this.a, agdbVar.a) || !d.F(this.e, agdbVar.e) || !d.F(this.b, agdbVar.b)) {
            return false;
        }
        boolean z = agdbVar.c;
        if (d.F(this.d, agdbVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        String str = this.e;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((((((hashCode2 + hashCode) * 31) + this.b.hashCode()) * 31) + a.v(false)) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "LocalImageRendererUiData(uri=" + this.a + ", displayName=" + this.e + ", contentDescription=" + this.b + ", canZoom=false, onDeleteButtonClick=" + this.d + ")";
    }
}
