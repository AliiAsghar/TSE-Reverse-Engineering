package defpackage;

import java.util.regex.Matcher;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ysz {
    public final Matcher a;
    public final String b;
    public final boolean c;

    public ysz() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ysz) {
            ysz yszVar = (ysz) obj;
            if (this.a.equals(yszVar.a) && this.b.equals(yszVar.b) && this.c == yszVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        if (true != this.c) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (hashCode * 1000003) ^ i;
    }

    public final String toString() {
        return "SanitizationRule{matcher=" + this.a.toString() + ", replacement=" + this.b + ", isLoggingEnabled=" + this.c + "}";
    }

    public ysz(Matcher matcher, String str, boolean z) {
        if (matcher == null) {
            throw new NullPointerException("Null matcher");
        }
        this.a = matcher;
        if (str != null) {
            this.b = str;
            this.c = z;
            return;
        }
        throw new NullPointerException("Null replacement");
    }
}
