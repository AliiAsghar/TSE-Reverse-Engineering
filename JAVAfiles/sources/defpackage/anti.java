package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anti {
    public final int a;
    private final anmx b;
    private final String c;
    private final String d;

    public anti(anmx anmxVar, int i, String str, String str2) {
        this.b = anmxVar;
        this.a = i;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof anti)) {
            return false;
        }
        anti antiVar = (anti) obj;
        if (this.b != antiVar.b || this.a != antiVar.a || !this.c.equals(antiVar.c) || !this.d.equals(antiVar.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.b, Integer.valueOf(this.a), this.c, this.d);
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.b, Integer.valueOf(this.a), this.c, this.d);
    }
}
