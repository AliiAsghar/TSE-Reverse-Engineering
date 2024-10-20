package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aavk {
    public final Uri a;
    public final int b;
    public final int c;
    public final String d;

    public aavk() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aavk) {
            aavk aavkVar = (aavk) obj;
            if (this.a.equals(aavkVar.a) && this.b == aavkVar.b && this.c == aavkVar.c && this.d.equals(aavkVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * (-721379959)) ^ this.d.hashCode();
    }

    public final String toString() {
        return "MediaResult{uri=" + String.valueOf(this.a) + ", width=" + this.b + ", height=" + this.c + ", durationMillis=0, contentType=" + this.d + "}";
    }

    public aavk(Uri uri, int i, int i2, String str) {
        this.a = uri;
        this.b = i;
        this.c = i2;
        this.d = str;
    }
}
