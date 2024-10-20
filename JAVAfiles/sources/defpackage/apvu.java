package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apvu {
    public final List a;
    public final String b;
    public final String c;
    public final String d;

    public apvu(List list, String str, String str2, String str3) {
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apvu)) {
            return false;
        }
        apvu apvuVar = (apvu) obj;
        if (d.F(this.a, apvuVar.a) && d.F(this.b, apvuVar.b) && d.F(this.c, apvuVar.c) && d.F(this.d, apvuVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() * 31) + this.b.hashCode();
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (((hashCode2 * 31) + hashCode) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "LottieKeyPath(path=" + this.a + ", cl=" + this.b + ", clDark=" + this.c + ", type=" + this.d + ")";
    }

    public /* synthetic */ apvu(List list, String str, String str2) {
        this(list, str, null, str2);
    }
}
