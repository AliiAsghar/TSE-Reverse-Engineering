package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vms {
    public final Uri a;
    public final String b;

    public vms() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vms) {
            vms vmsVar = (vms) obj;
            Uri uri = this.a;
            if (uri != null ? uri.equals(vmsVar.a) : vmsVar.a == null) {
                String str = this.b;
                String str2 = vmsVar.b;
                if (str != null ? str.equals(str2) : str2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Uri uri = this.a;
        int i = 0;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return ((hashCode ^ 1000003) * 1000003) ^ i;
    }

    public final String toString() {
        return "Attachment{uri=" + String.valueOf(this.a) + ", contentType=" + this.b + "}";
    }

    public vms(Uri uri, String str) {
        this.a = uri;
        this.b = str;
    }
}
