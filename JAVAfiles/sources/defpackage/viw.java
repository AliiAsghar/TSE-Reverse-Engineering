package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class viw {
    public final amme a;
    public final Optional b;
    public final Optional c;
    public final Optional d;

    public viw() {
        throw null;
    }

    public static xsr a() {
        xsr xsrVar = new xsr(null, null);
        xsrVar.e(amme.UNKNOWN_ISSUE_TYPE);
        return xsrVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof viw) {
            viw viwVar = (viw) obj;
            if (this.a.equals(viwVar.a) && this.b.equals(viwVar.b) && this.c.equals(viwVar.c) && this.d.equals(viwVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        Optional optional = this.d;
        Optional optional2 = this.c;
        Optional optional3 = this.b;
        return "ReportIssueNotificationData{issueType=" + String.valueOf(this.a) + ", message=" + String.valueOf(optional3) + ", throwable=" + String.valueOf(optional2) + ", psdMap=" + String.valueOf(optional) + "}";
    }

    public viw(amme ammeVar, Optional optional, Optional optional2, Optional optional3) {
        this.a = ammeVar;
        this.b = optional;
        this.c = optional2;
        this.d = optional3;
    }
}
