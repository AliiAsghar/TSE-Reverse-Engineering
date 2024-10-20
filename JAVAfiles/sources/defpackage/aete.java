package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aete implements aetf {
    public final aerb a;
    public final String b;

    public aete(aerb aerbVar, String str) {
        aerbVar.getClass();
        this.a = aerbVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aete)) {
            return false;
        }
        aete aeteVar = (aete) obj;
        if (this.a == aeteVar.a && d.F(this.b, aeteVar.b)) {
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
        return "Icon(icon=" + this.a + ", bottomLabel=" + this.b + ")";
    }

    public /* synthetic */ aete(aerb aerbVar) {
        this(aerbVar, null);
    }
}
