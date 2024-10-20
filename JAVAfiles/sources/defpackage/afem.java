package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afem {
    public final String a;
    public final afej b;
    private final int c = 1;

    public afem(String str, afej afejVar) {
        this.a = str;
        this.b = afejVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afem)) {
            return false;
        }
        afem afemVar = (afem) obj;
        if (!d.F(this.a, afemVar.a)) {
            return false;
        }
        int i = afemVar.c;
        if (d.F(this.b, afemVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + 1) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "AttachmentSerializerMetadata(name=" + this.a + ", version=1, serializer=" + this.b + ")";
    }
}
