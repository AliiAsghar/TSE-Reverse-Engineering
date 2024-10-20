package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anlr {
    public final String a;
    private final String b;

    public anlr(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final Optional a() {
        return Optional.ofNullable(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anlr)) {
            return false;
        }
        anlr anlrVar = (anlr) obj;
        if (d.F(this.a, anlrVar.a) && d.F(this.b, anlrVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Capability(name=" + this.a + ", value=" + this.b + ")";
    }
}
