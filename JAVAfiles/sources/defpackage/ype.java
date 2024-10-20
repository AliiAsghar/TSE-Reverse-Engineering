package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ype {
    public final amzp a;
    public final ypk b;
    public final String c;
    public final Integer d;
    public final ypd e;

    public ype(amzp amzpVar, ypk ypkVar, String str, Integer num, ypd ypdVar) {
        amzpVar.getClass();
        ypkVar.getClass();
        this.a = amzpVar;
        this.b = ypkVar;
        this.c = str;
        this.d = num;
        this.e = ypdVar;
        if (num != null && num.intValue() < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ype)) {
            return false;
        }
        ype ypeVar = (ype) obj;
        if (this.a == ypeVar.a && d.F(this.b, ypeVar.b) && d.F(this.c, ypeVar.c) && d.F(this.d, ypeVar.d) && d.F(this.e, ypeVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.a.hashCode() * 31) + this.b.hashCode();
        String str = this.c;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = ((hashCode3 * 31) + hashCode) * 31;
        Integer num = this.d;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        ypd ypdVar = this.e;
        if (ypdVar != null) {
            i = ypdVar.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        return "SpamClassificationResult(outcome=" + this.a + ", score=" + this.b + ", aresInitiatedBy=" + this.c + ", reclassificationDelaySeconds=" + this.d + ", reinforcementParams=" + this.e + ")";
    }

    public /* synthetic */ ype(amzp amzpVar, ypk ypkVar, String str, Integer num, ypd ypdVar, int i) {
        this(amzpVar, ypkVar, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : ypdVar);
    }
}
