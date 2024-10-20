package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pxz extends pyb {
    private final Uri a;

    public pxz(Uri uri) {
        this.a = uri;
    }

    @Override // defpackage.pyg
    public final int b() {
        return 1;
    }

    @Override // defpackage.pyb, defpackage.pyg
    public final Uri c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pyg) {
            pyg pygVar = (pyg) obj;
            if (pygVar.b() == 1 && this.a.equals(pygVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DownloadResultOrError{downloadUri=" + this.a.toString() + "}";
    }
}
