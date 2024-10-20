package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mmi {
    public final String a;
    public final String b;
    private final String c;
    private final Uri d;

    public mmi() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mmi) {
            mmi mmiVar = (mmi) obj;
            String str = this.a;
            if (str != null ? str.equals(mmiVar.a) : mmiVar.a == null) {
                String str2 = this.c;
                if (str2 != null ? str2.equals(mmiVar.c) : mmiVar.c == null) {
                    Uri uri = this.d;
                    if (uri != null ? uri.equals(mmiVar.d) : mmiVar.d == null) {
                        String str3 = this.b;
                        String str4 = mmiVar.b;
                        if (str3 != null ? str3.equals(str4) : str4 == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        String str2 = this.c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = hashCode ^ 1000003;
        Uri uri = this.d;
        if (uri == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = uri.hashCode();
        }
        int i3 = ((((i2 * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003;
        String str3 = this.b;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i3 ^ i;
    }

    public final String toString() {
        return "DraftSnippet{text=" + this.a + ", subject=" + this.c + ", previewUri=" + String.valueOf(this.d) + ", previewContentType=" + this.b + "}";
    }

    public mmi(String str, String str2, Uri uri, String str3) {
        this.a = str;
        this.c = str2;
        this.d = uri;
        this.b = str3;
    }
}
