package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeuq implements aeur {
    public final aerb a;
    public final String b;
    private final String c;

    public /* synthetic */ aeuq(aerb aerbVar, String str, int i) {
        aerbVar.getClass();
        this.a = aerbVar;
        this.c = null;
        this.b = (i & 4) != 0 ? null : str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeuq)) {
            return false;
        }
        aeuq aeuqVar = (aeuq) obj;
        if (this.a != aeuqVar.a) {
            return false;
        }
        String str = aeuqVar.c;
        if (d.F(null, null) && d.F(this.b, aeuqVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 961;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "MetatextIconItemUiData(icon=" + this.a + ", iconContentDescription=null, colorIdentifier=" + this.b + ")";
    }
}
