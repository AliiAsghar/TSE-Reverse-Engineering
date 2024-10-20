package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ypl {
    public final ypk a;
    public final String b;
    public final String c;

    public ypl() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ypl) {
            ypl yplVar = (ypl) obj;
            if (this.a.equals(yplVar.a) && this.b.equals(yplVar.b) && this.c.equals(yplVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "LinkPreviewSpamCheckParams{messageSuspiciousnessScore=" + String.valueOf(this.a) + ", countryCode=" + this.b + ", locale=" + this.c + "}";
    }

    public ypl(ypk ypkVar, String str, String str2) {
        this.a = ypkVar;
        this.b = str;
        this.c = str2;
    }
}
