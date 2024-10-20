package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anip {
    public final String a;
    public final String b;
    public final alor c;

    public anip() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof anip) {
            anip anipVar = (anip) obj;
            if (this.a.equals(anipVar.a) && this.b.equals(anipVar.b) && alzz.am(this.c, anipVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a + "/" + this.b);
        for (Map.Entry entry : this.c.entrySet()) {
            Object key = entry.getKey();
            key.getClass();
            Object value = entry.getValue();
            value.getClass();
            sb.append("; " + ((String) key) + "=" + ((String) value));
        }
        return sb.toString();
    }

    public anip(String str, String str2, alor alorVar) {
        this.a = str;
        this.b = str2;
        this.c = alorVar;
    }
}
