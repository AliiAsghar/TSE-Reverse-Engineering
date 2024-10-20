package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qkb extends qke implements asai {
    private final String b;
    private final asai c;

    public qkb(String str, asai asaiVar) {
        super(str);
        this.b = str;
        this.c = asaiVar;
    }

    @Override // defpackage.asai
    public final Object a(asaj asajVar, arpe arpeVar) {
        return this.c.a(asajVar, arpeVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qkb)) {
            return false;
        }
        qkb qkbVar = (qkb) obj;
        if (d.F(this.b, qkbVar.b) && d.F(this.c, qkbVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    @Override // defpackage.qke
    public final String toString() {
        return "NamedFlow(name=" + this.b + ", flow=" + this.c + ")";
    }
}
