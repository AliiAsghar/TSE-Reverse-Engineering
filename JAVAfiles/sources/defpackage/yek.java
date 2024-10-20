package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yek {
    public final String a;
    public final String b;
    public final List c;

    public yek() {
        throw null;
    }

    public final yel a(String str) {
        return (yel) ((Map) this.c.get(0)).get(str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yek) {
            yek yekVar = (yek) obj;
            if (this.a.equals(yekVar.a) && this.b.equals(yekVar.b) && this.c.equals(yekVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "TenorGif{id=" + this.a + ", url=" + this.b + ", media=" + this.c.toString() + "}";
    }

    public yek(String str, String str2, List list) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.a = str;
        if (str2 != null) {
            this.b = str2;
            if (list != null) {
                this.c = list;
                return;
            }
            throw new NullPointerException("Null media");
        }
        throw new NullPointerException("Null url");
    }
}
