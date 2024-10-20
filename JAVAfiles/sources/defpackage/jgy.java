package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jgy {
    public final Uri a;
    public final pyz b;
    public final alhp c;
    public final arwl d;
    public final boolean e;

    public jgy() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jgy)) {
            return false;
        }
        jgy jgyVar = (jgy) obj;
        if (!d.F(this.a, jgyVar.a)) {
            return false;
        }
        pyz pyzVar = jgyVar.b;
        if (!d.F(null, null) || !d.F(this.c, jgyVar.c) || !d.F(this.d, jgyVar.d)) {
            return false;
        }
        boolean z = jgyVar.e;
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        Uri uri = this.a;
        int i = 0;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        alhp alhpVar = this.c;
        if (alhpVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = alhpVar.hashCode();
        }
        int i2 = hashCode * 961;
        arwl arwlVar = this.d;
        if (arwlVar != null) {
            i = arwlVar.hashCode();
        }
        return ((((i2 + hashCode2) * 31) + i) * 31) + 1237;
    }

    public final String toString() {
        String str;
        Uri uri = this.a;
        if (uri != null) {
            str = yyb.bf(uri);
        } else {
            str = null;
        }
        return "Metadata(copy=" + str + ", processingId=null, draftLatencyStopwatch=" + this.c + ")";
    }

    public jgy(Uri uri, alhp alhpVar, arwl arwlVar) {
        this.a = uri;
        this.b = null;
        this.c = alhpVar;
        this.d = arwlVar;
        this.e = false;
    }

    public /* synthetic */ jgy(Uri uri, alhp alhpVar, arwl arwlVar, int i) {
        this(1 == (i & 1) ? null : uri, (i & 4) != 0 ? null : alhpVar, (i & 8) != 0 ? null : arwlVar);
    }
}
