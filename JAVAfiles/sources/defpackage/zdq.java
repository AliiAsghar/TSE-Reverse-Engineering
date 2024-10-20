package defpackage;

import java.util.List;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zdq {
    public final String a;
    public final List b;
    public final Pattern c;
    public final ahqq d;

    public zdq() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zdq)) {
            return false;
        }
        zdq zdqVar = (zdq) obj;
        if (d.F(this.a, zdqVar.a) && d.F(this.b, zdqVar.b) && d.F(this.c, zdqVar.c) && d.F(this.d, zdqVar.d)) {
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

    public zdq(String str, List list, Pattern pattern, ahqq ahqqVar) {
        str.getClass();
        this.a = str;
        this.b = list;
        this.c = pattern;
        this.d = ahqqVar;
    }

    public /* synthetic */ zdq(byte[] bArr) {
        this("", arnv.a, null, null);
    }
}
