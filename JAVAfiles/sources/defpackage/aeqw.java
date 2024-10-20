package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeqw implements aeqx {
    private final Uri a;
    private final String b;
    private final arqg c;

    public aeqw(Uri uri, String str, arqg arqgVar) {
        this.a = uri;
        this.b = str;
        this.c = arqgVar;
    }

    @Override // defpackage.aeqx
    public final Uri a() {
        return this.a;
    }

    @Override // defpackage.aeqx
    public final String b() {
        return this.b;
    }

    @Override // defpackage.aeqx
    public final arqg c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeqw)) {
            return false;
        }
        aeqw aeqwVar = (aeqw) obj;
        if (d.F(this.a, aeqwVar.a) && d.F(this.b, aeqwVar.b) && d.F(this.c, aeqwVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "GalleryImageUiData(uri=" + this.a + ", contentDescription=" + this.b + ", onClick=" + this.c + ")";
    }
}
