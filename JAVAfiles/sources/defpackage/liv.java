package defpackage;

import java.util.List;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class liv {
    public final String a;
    public final List b;
    public final Pattern c;
    public final ahqq d;

    public liv() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof liv)) {
            return false;
        }
        liv livVar = (liv) obj;
        if (d.F(this.a, livVar.a) && d.F(this.b, livVar.b) && d.F(this.c, livVar.c) && d.F(this.d, livVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() * 31) + this.b.hashCode();
        Pattern pattern = this.c;
        int i = 0;
        if (pattern == null) {
            hashCode = 0;
        } else {
            hashCode = pattern.hashCode();
        }
        int i2 = ((hashCode2 * 31) + hashCode) * 31;
        ahqq ahqqVar = this.d;
        if (ahqqVar != null) {
            i = ahqqVar.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "PersonalSearchResults(query=" + this.a + ", contacts=" + this.b + ", highlightPattern=" + this.c + ", timer=" + this.d + ")";
    }

    public liv(String str, List list, Pattern pattern, ahqq ahqqVar) {
        str.getClass();
        this.a = str;
        this.b = list;
        this.c = pattern;
        this.d = ahqqVar;
    }

    public /* synthetic */ liv(byte[] bArr) {
        this("", arnv.a, null, null);
    }
}
