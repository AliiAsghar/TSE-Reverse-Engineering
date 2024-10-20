package defpackage;

import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class actg {
    public final int a;
    public final Optional b;
    public final alor c;

    public actg() {
        throw null;
    }

    public static actg a(int i, Optional optional, Map map) {
        return new actg(i, optional, alor.j(map));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof actg) {
            actg actgVar = (actg) obj;
            if (this.a == actgVar.a && this.b.equals(actgVar.b) && this.c.equals(actgVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        alor alorVar = this.c;
        return "HttpDownloadResponse{responseCode=" + this.a + ", inputStream=" + this.b.toString() + ", responseHeaders=" + alorVar.toString() + "}";
    }

    public actg(int i, Optional optional, alor alorVar) {
        this.a = i;
        this.b = optional;
        if (alorVar == null) {
            throw new NullPointerException("Null responseHeaders");
        }
        this.c = alorVar;
    }
}
