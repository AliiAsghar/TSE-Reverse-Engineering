package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wtk {
    public final String a;
    public final Integer b;
    public final Integer c;

    public wtk(String str, Integer num, Integer num2) {
        this.a = str;
        this.b = num;
        this.c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wtk)) {
            return false;
        }
        wtk wtkVar = (wtk) obj;
        if (d.F(this.a, wtkVar.a) && d.F(this.b, wtkVar.b) && d.F(this.c, wtkVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        Integer num = this.b;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        Integer num2 = this.c;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "BodyTextWithPackageNameIndices(text=" + this.a + ", startIndex=" + this.b + ", endIndex=" + this.c + ")";
    }
}
