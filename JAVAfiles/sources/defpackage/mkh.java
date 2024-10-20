package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mkh {
    public final Long a;
    public final String b;
    public final String c;
    public final String d;
    public final alog e;
    public final Uri f;

    public mkh() {
        throw null;
    }

    public static mkh a(long j, String str, String str2, String str3, alog alogVar, Uri uri) {
        return new mkh(Long.valueOf(j), str, str2, str3, alogVar, uri);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mkh) {
            mkh mkhVar = (mkh) obj;
            if (this.a.equals(mkhVar.a) && this.b.equals(mkhVar.b) && this.c.equals(mkhVar.c) && this.d.equals(mkhVar.d) && alzz.at(this.e, mkhVar.e)) {
                Uri uri = this.f;
                Uri uri2 = mkhVar.f;
                if (uri != null ? uri.equals(uri2) : uri2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
        Uri uri = this.f;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        return (hashCode2 * 1000003) ^ hashCode;
    }

    public final String toString() {
        Uri uri = this.f;
        return "DefaultContactEntry{contactId=" + this.a + ", lookupKey=" + this.b + ", header=" + this.c + ", displayName=" + this.d + ", destinations=" + String.valueOf(this.e) + ", photo=" + String.valueOf(uri) + "}";
    }

    public mkh(Long l, String str, String str2, String str3, alog alogVar, Uri uri) {
        this.a = l;
        if (str == null) {
            throw new NullPointerException("Null lookupKey");
        }
        this.b = str;
        if (str2 != null) {
            this.c = str2;
            if (str3 != null) {
                this.d = str3;
                if (alogVar != null) {
                    this.e = alogVar;
                    this.f = uri;
                    return;
                }
                throw new NullPointerException("Null destinations");
            }
            throw new NullPointerException("Null displayName");
        }
        throw new NullPointerException("Null header");
    }
}
