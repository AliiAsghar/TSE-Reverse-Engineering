package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aevv implements aevy {
    public final Uri a;
    public final Boolean b;
    public final String c;
    public final Uri d;
    private final aevs e;

    public /* synthetic */ aevv(Uri uri, Boolean bool, String str, aevs aevsVar, Uri uri2, int i) {
        aevsVar = (i & 8) != 0 ? aevs.a : aevsVar;
        int i2 = i & 2;
        str = (i & 4) != 0 ? null : str;
        bool = i2 != 0 ? null : bool;
        uri2 = (i & 16) != 0 ? null : uri2;
        uri.getClass();
        aevsVar.getClass();
        this.a = uri;
        this.b = bool;
        this.c = str;
        this.e = aevsVar;
        this.d = uri2;
    }

    @Override // defpackage.aevy
    public final aevs a() {
        return this.e;
    }

    @Override // defpackage.aevy
    public final Boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aevv)) {
            return false;
        }
        aevv aevvVar = (aevv) obj;
        if (d.F(this.a, aevvVar.a) && d.F(this.b, aevvVar.b) && d.F(this.c, aevvVar.c) && this.e == aevvVar.e && d.F(this.d, aevvVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.a.hashCode() * 31;
        Boolean bool = this.b;
        int i = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        String str = this.c;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int hashCode4 = (((i2 + hashCode2) * 31) + this.e.hashCode()) * 31;
        Uri uri = this.d;
        if (uri != null) {
            i = uri.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "Glide(uri=" + this.a + ", forceClipToCircle=" + this.b + ", signature=" + this.c + ", monogramBadge=" + this.e + ", fallbackUri=" + this.d + ")";
    }
}
