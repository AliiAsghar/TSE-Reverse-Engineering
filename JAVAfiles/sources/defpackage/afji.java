package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afji {
    public final String a;
    public final arqr b;
    public final arqv c;

    public afji(String str, arqr arqrVar, arqv arqvVar) {
        this.a = str;
        this.b = arqrVar;
        this.c = arqvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afji)) {
            return false;
        }
        afji afjiVar = (afji) obj;
        if (d.F(this.a, afjiVar.a) && d.F(this.b, afjiVar.b) && d.F(this.c, afjiVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "EntityDescriptor(name=" + this.a + ", serializer=" + this.b + ", deserializer=" + this.c + ")";
    }
}
