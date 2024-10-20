package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kop {
    public final knc a;
    public final String b;
    public final int c;

    public kop() {
        throw null;
    }

    public final boolean equals(Object obj) {
        knc kncVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof kop) {
            kop kopVar = (kop) obj;
            if (this.c == kopVar.c && ((kncVar = this.a) != null ? kncVar.equals(kopVar.a) : kopVar.a == null) && this.b.equals(kopVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = this.c;
        a.aS(i);
        knc kncVar = this.a;
        if (kncVar == null) {
            hashCode = 0;
        } else {
            hashCode = kncVar.hashCode();
        }
        return ((((i ^ 1000003) * 1000003) ^ hashCode) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str;
        if (this.c != 1) {
            str = "ON_CANCEL_BUTTON_CLICKED";
        } else {
            str = "ON_REPORT_BUTTON_CLICKED";
        }
        knc kncVar = this.a;
        String str2 = this.b;
        return "TakeBugReportRequestData{dialogUserInputType=" + str + ", category=" + String.valueOf(kncVar) + ", comment=" + str2 + "}";
    }

    public kop(int i, knc kncVar, String str) {
        this.c = i;
        this.a = kncVar;
        if (str == null) {
            throw new NullPointerException("Null comment");
        }
        this.b = str;
    }
}
