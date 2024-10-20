package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agdi implements agcz {
    public final Uri a;
    public final String b;
    public final arqg c;
    public final agde d;

    public agdi(Uri uri, agde agdeVar, String str, arqg arqgVar) {
        this.a = uri;
        this.d = agdeVar;
        this.b = str;
        this.c = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agdi)) {
            return false;
        }
        agdi agdiVar = (agdi) obj;
        if (d.F(this.a, agdiVar.a) && d.F(this.d, agdiVar.d) && d.F(this.b, agdiVar.b) && d.F(this.c, agdiVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.d.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "LocalVideoRendererUiData(uri=" + this.a + ", videoPlayer=" + this.d + ", contentDescription=" + this.b + ", onDeleteButtonClick=" + this.c + ")";
    }
}
