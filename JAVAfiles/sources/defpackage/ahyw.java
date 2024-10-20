package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ahyw implements Parcelable {
    public final String a;
    public final String b;
    public final String c;

    public ahyw() {
        throw null;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahyw) {
            ahyw ahywVar = (ahyw) obj;
            if (this.a.equals(ahywVar.a) && ((str = this.b) != null ? str.equals(ahywVar.b) : ahywVar.b == null)) {
                String str2 = this.c;
                String str3 = ahywVar.c;
                if (str2 != null ? str2.equals(str3) : str3 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() ^ 1000003;
        String str = this.b;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = ((hashCode2 * 1000003) ^ hashCode) * 1000003;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 ^ i;
    }

    public final String toString() {
        return "AuthorAttribution{name=" + this.a + ", uri=" + this.b + ", photoUri=" + this.c + "}";
    }

    public ahyw(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
