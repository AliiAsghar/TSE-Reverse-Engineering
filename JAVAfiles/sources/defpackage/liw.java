package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class liw {
    public final String a;
    public final Pattern b;

    public liw() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof liw)) {
            return false;
        }
        liw liwVar = (liw) obj;
        if (d.F(this.a, liwVar.a) && d.F(this.b, liwVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        Pattern pattern = this.b;
        if (pattern == null) {
            hashCode = 0;
        } else {
            hashCode = pattern.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "QueryWithHighlightPattern(query=" + this.a + ", highlightPattern=" + this.b + ")";
    }

    public liw(String str, Pattern pattern) {
        str.getClass();
        this.a = str;
        this.b = pattern;
    }

    public /* synthetic */ liw(byte[] bArr) {
        this("", null);
    }
}
