package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeux {
    public final arqw a;
    public final arqv b;
    public final arqw c;

    public aeux() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeux)) {
            return false;
        }
        aeux aeuxVar = (aeux) obj;
        if (d.F(this.a, aeuxVar.a) && d.F(this.b, aeuxVar.b) && d.F(this.c, aeuxVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() * 31) + this.b.hashCode();
        arqw arqwVar = this.c;
        if (arqwVar == null) {
            hashCode = 0;
        } else {
            hashCode = arqwVar.hashCode();
        }
        return (hashCode2 * 31) + hashCode;
    }

    public final String toString() {
        return "MetatextStyleData(getColor=" + this.a + ", getReadIconTint=" + this.b + ", textTruncator=" + this.c + ")";
    }

    public aeux(arqw arqwVar, arqv arqvVar, arqw arqwVar2) {
        this.a = arqwVar;
        this.b = arqvVar;
        this.c = arqwVar2;
    }

    public /* synthetic */ aeux(byte[] bArr) {
        this(aeua.d, aeui.c, null);
    }
}
