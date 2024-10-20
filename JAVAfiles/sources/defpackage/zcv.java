package defpackage;

import java.util.List;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zcv {
    public final String a;
    public final List b;
    public final Pattern c;

    public zcv() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zcv)) {
            return false;
        }
        zcv zcvVar = (zcv) obj;
        if (d.F(this.a, zcvVar.a) && d.F(this.b, zcvVar.b) && d.F(this.c, zcvVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() * 31) + this.b.hashCode();
        Pattern pattern = this.c;
        if (pattern == null) {
            hashCode = 0;
        } else {
            hashCode = pattern.hashCode();
        }
        return (hashCode2 * 31) + hashCode;
    }

    public final String toString() {
        return "BasicSearchResults(query=" + this.a + ", contacts=" + this.b + ", highlightPattern=" + this.c + ")";
    }

    public zcv(String str, List list, Pattern pattern) {
        str.getClass();
        this.a = str;
        this.b = list;
        this.c = pattern;
    }

    public /* synthetic */ zcv(byte[] bArr) {
        this("", arnv.a, null);
    }
}
