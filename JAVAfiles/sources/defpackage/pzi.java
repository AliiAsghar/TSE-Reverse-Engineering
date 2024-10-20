package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pzi extends pzm {
    public final Uri a;
    public final String b;
    public final xsc c;
    public final aozb d;

    public pzi() {
        this(null, null, null, null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pzi)) {
            return false;
        }
        pzi pziVar = (pzi) obj;
        if (d.F(this.a, pziVar.a) && d.F(this.b, pziVar.b) && d.F(this.c, pziVar.c) && d.F(this.d, pziVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        Uri uri = this.a;
        int i = 0;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        String str = this.b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i2 = hashCode * 31;
        xsc xscVar = this.c;
        if (xscVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = xscVar.hashCode();
        }
        int i3 = (((i2 + hashCode2) * 31) + hashCode3) * 31;
        aozb aozbVar = this.d;
        if (aozbVar != null) {
            i = aozbVar.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        return "StepInfo(fileUri=" + this.a + ", contentType=" + this.b + ", uploadResult=" + this.c + ", thumbnailBytes=" + this.d + ")";
    }

    public pzi(Uri uri, String str, xsc xscVar, aozb aozbVar) {
        this.a = uri;
        this.b = str;
        this.c = xscVar;
        this.d = aozbVar;
    }

    public /* synthetic */ pzi(Uri uri, String str, xsc xscVar, aozb aozbVar, int i) {
        this(1 == (i & 1) ? null : uri, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : xscVar, (i & 8) != 0 ? null : aozbVar);
    }
}
