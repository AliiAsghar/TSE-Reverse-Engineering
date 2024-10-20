package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ucw {
    public final String a;
    public final String b;
    public final alog c;

    public ucw() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ucw) {
            ucw ucwVar = (ucw) obj;
            if (this.a.equals(ucwVar.a) && this.b.equals(ucwVar.b) && alzz.at(this.c, ucwVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "LoggingEvent{originalSql=" + this.a + ", canonicalSql=" + this.b + ", stack=" + String.valueOf(this.c) + "}";
    }

    public ucw(String str, String str2, alog alogVar) {
        this.a = str;
        this.b = str2;
        if (alogVar == null) {
            throw new NullPointerException("Null stack");
        }
        this.c = alogVar;
    }
}
