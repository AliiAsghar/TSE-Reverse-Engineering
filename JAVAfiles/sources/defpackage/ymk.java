package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ymk {
    public final apzk a;
    public final ypj b;
    public final String c;

    public ymk(apzk apzkVar, ypj ypjVar, String str) {
        apzkVar.getClass();
        this.a = apzkVar;
        this.b = ypjVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ymk)) {
            return false;
        }
        ymk ymkVar = (ymk) obj;
        if (this.a == ymkVar.a && d.F(this.b, ymkVar.b) && d.F(this.c, ymkVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Action(type=" + this.a + ", contributorsClassificationSources=" + this.b + ", spamPolicyConfigId=" + this.c + ")";
    }
}
