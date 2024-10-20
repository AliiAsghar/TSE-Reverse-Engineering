package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aesi {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public aesi(int i, int i2, int i3, int i4) {
        this.c = i;
        this.d = i2;
        this.a = i3;
        this.b = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aesi)) {
            return false;
        }
        aesi aesiVar = (aesi) obj;
        if (this.c == aesiVar.c && this.d == aesiVar.d && this.a == aesiVar.a && this.b == aesiVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.c;
        a.bm(i);
        int i2 = this.d;
        a.bm(i2);
        return (((((i * 31) + i2) * 31) + this.a) * 31) + this.b;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("ContactListItemAnnotation(type=");
        if (this.c != 1) {
            str = "TTS";
        } else {
            str = "HIGHLIGHT";
        }
        sb.append((Object) str);
        sb.append(", target=");
        if (this.d != 1) {
            str2 = "SUBTITLE";
        } else {
            str2 = VCardConstants.PROPERTY_TITLE;
        }
        sb.append((Object) str2);
        sb.append(", start=");
        sb.append(this.a);
        sb.append(", end=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
