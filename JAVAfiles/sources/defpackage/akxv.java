package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akxv {
    public final String a;
    public final Function b;
    private final akxu c;

    public akxv() {
        throw null;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        if (obj == this) {
            return true;
        }
        if (obj instanceof akxv) {
            akxv akxvVar = (akxv) obj;
            if (this.a.equals(akxvVar.a)) {
                equals = this.b.equals(akxvVar.b);
                if (equals && this.c.equals(akxvVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() ^ 1000003;
        hashCode = this.b.hashCode();
        return (((hashCode2 * 1000003) ^ hashCode) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        akxu akxuVar = this.c;
        return "FieldBinding{name=" + this.a + ", valueGetter=" + this.b.toString() + ", valueSetter=" + akxuVar.toString() + "}";
    }

    public akxv(String str, Function function, akxu akxuVar) {
        this.a = str;
        this.b = function;
        this.c = akxuVar;
    }
}
