package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aomb {
    public final aquo a;
    public final aqsj b;
    public final aqsj c;
    public final aqsj d;

    public aomb(aquo aquoVar, aqsj aqsjVar, aqsj aqsjVar2, aqsj aqsjVar3) {
        this.a = aquoVar;
        this.b = aqsjVar;
        this.c = aqsjVar2;
        this.d = aqsjVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aomb)) {
            return false;
        }
        aomb aombVar = (aomb) obj;
        if (d.F(this.a, aombVar.a) && d.F(this.b, aombVar.b) && d.F(this.c, aombVar.c) && d.F(this.d, aombVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "ParcelableOverMetadataKeys(metadataKey=" + this.a + ", requestKey=" + this.b + ", responseHeaderKey=" + this.c + ", responseTrailerKey=" + this.d + ")";
    }
}
