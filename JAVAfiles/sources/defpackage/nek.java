package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nek {
    public final Uri a;
    public final Uri b;
    public final vox c;

    public nek(Uri uri, Uri uri2, vox voxVar) {
        voxVar.getClass();
        this.a = uri;
        this.b = uri2;
        this.c = voxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nek)) {
            return false;
        }
        nek nekVar = (nek) obj;
        if (d.F(this.a, nekVar.a) && d.F(this.b, nekVar.b) && this.c == nekVar.c) {
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
        return ((hashCode2 + hashCode) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "RecipientPhotoImpl(highResolutionPhotoUri=" + this.a + ", thumbnailPhotoUri=" + this.b + ", source=" + this.c + ")";
    }
}
