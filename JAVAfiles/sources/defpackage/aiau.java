package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aiau implements Parcelable {
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final ahyx f;

    public aiau() {
        throw null;
    }

    public static aiat a(String str) {
        aiat aiatVar = new aiat();
        if (str != null) {
            aiatVar.a = str;
            aiatVar.d(0);
            aiatVar.c(0);
            aiatVar.b("");
            return aiatVar;
        }
        throw new NullPointerException("Null photoReference");
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aiau) {
            aiau aiauVar = (aiau) obj;
            if (this.a.equals(aiauVar.a) && this.b == aiauVar.b && this.c == aiauVar.c && this.d.equals(aiauVar.d) && ((str = this.e) != null ? str.equals(aiauVar.e) : aiauVar.e == null)) {
                ahyx ahyxVar = this.f;
                ahyx ahyxVar2 = aiauVar.f;
                if (ahyxVar != null ? ahyxVar.equals(ahyxVar2) : ahyxVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode();
        String str = this.e;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = ((hashCode2 * 1000003) ^ hashCode) * 1000003;
        ahyx ahyxVar = this.f;
        if (ahyxVar != null) {
            i = ahyxVar.hashCode();
        }
        return i2 ^ i;
    }

    public final String toString() {
        return "PhotoMetadata{attributions=" + this.a + ", height=" + this.b + ", width=" + this.c + ", photoReference=" + this.d + ", name=" + this.e + ", authorAttributions=" + String.valueOf(this.f) + "}";
    }

    public aiau(String str, int i, int i2, String str2, String str3, ahyx ahyxVar) {
        if (str == null) {
            throw new NullPointerException("Null attributions");
        }
        this.a = str;
        this.b = i;
        this.c = i2;
        if (str2 != null) {
            this.d = str2;
            this.e = str3;
            this.f = ahyxVar;
            return;
        }
        throw new NullPointerException("Null photoReference");
    }
}
