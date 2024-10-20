package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vor {
    public final Uri a;
    public final boolean b;
    private final vox c;

    public /* synthetic */ vor(Uri uri, vox voxVar, boolean z, int i) {
        boolean z2;
        voxVar = (i & 2) != 0 ? vox.PROFILE_PEOPLE_SHARING_SOURCE : voxVar;
        if ((i & 4) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        voxVar.getClass();
        this.a = uri;
        this.c = voxVar;
        this.b = z & z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vor)) {
            return false;
        }
        vor vorVar = (vor) obj;
        if (d.F(this.a, vorVar.a) && this.c == vorVar.c && this.b == vorVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Uri uri = this.a;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        return (((hashCode * 31) + this.c.hashCode()) * 31) + a.v(this.b);
    }

    public final String toString() {
        return "DefaultProfilePhoto(uri=" + this.a + ", source=" + this.c + ", hasPhoto=" + this.b + ")";
    }
}
