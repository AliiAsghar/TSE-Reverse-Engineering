package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lcr {
    public final MessageIdType a;
    public final String b;
    public final Uri c;
    public final String d;
    public final long e;

    public lcr() {
        throw null;
    }

    public final boolean equals(Object obj) {
        String str;
        Uri uri;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof lcr) {
            lcr lcrVar = (lcr) obj;
            if (this.a.equals(lcrVar.a) && ((str = this.b) != null ? str.equals(lcrVar.b) : lcrVar.b == null) && ((uri = this.c) != null ? uri.equals(lcrVar.c) : lcrVar.c == null) && ((str2 = this.d) != null ? str2.equals(lcrVar.d) : lcrVar.d == null) && this.e == lcrVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.a.hashCode() ^ 1000003;
        String str = this.b;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = ((hashCode3 * 1000003) ^ hashCode) * 1000003;
        Uri uri = this.c;
        if (uri == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = uri.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        String str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        long j = this.e;
        return ((i3 ^ i) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        Uri uri = this.c;
        return "SnippetParameters{messageId=" + this.a.toString() + ", previewContentType=" + this.b + ", previewUri=" + String.valueOf(uri) + ", textSnippet=" + this.d + ", sortTimestamp=" + this.e + "}";
    }

    public lcr(MessageIdType messageIdType, String str, Uri uri, String str2, long j) {
        if (messageIdType == null) {
            throw new NullPointerException("Null messageId");
        }
        this.a = messageIdType;
        this.b = str;
        this.c = uri;
        this.d = str2;
        this.e = j;
    }
}
