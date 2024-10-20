package defpackage;

import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zdu {
    public final String a;
    public final Pattern b;

    public zdu() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zdu)) {
            return false;
        }
        zdu zduVar = (zdu) obj;
        if (d.F(this.a, zduVar.a) && d.F(this.b, zduVar.b)) {
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

    public zdu(String str, Pattern pattern) {
        str.getClass();
        this.a = str;
        this.b = pattern;
    }

    public /* synthetic */ zdu(byte[] bArr) {
        this("", null);
    }
}
