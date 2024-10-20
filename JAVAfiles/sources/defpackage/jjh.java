package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jjh {
    public final aerb a;
    public final int b;
    public final Integer c;
    public final jjg d;
    public final Integer e;

    public jjh(aerb aerbVar, int i, Integer num, jjg jjgVar, Integer num2) {
        aerbVar.getClass();
        this.a = aerbVar;
        this.b = i;
        this.c = num;
        this.d = jjgVar;
        this.e = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jjh)) {
            return false;
        }
        jjh jjhVar = (jjh) obj;
        if (this.a == jjhVar.a && this.b == jjhVar.b && d.F(this.c, jjhVar.c) && this.d == jjhVar.d && d.F(this.e, jjhVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.a.hashCode() * 31;
        Integer num = this.c;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (((hashCode3 + this.b) * 31) + hashCode) * 31;
        jjg jjgVar = this.d;
        if (jjgVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = jjgVar.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Integer num2 = this.e;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        return "SendIconData(icon=" + this.a + ", contentDescription=" + this.b + ", label=" + this.c + ", disabled=" + this.d + ", contentDescriptionWithProfile=" + this.e + ")";
    }

    public /* synthetic */ jjh(aerb aerbVar, int i, Integer num, Integer num2, int i2) {
        this(aerbVar, i, (i2 & 4) != 0 ? null : num, (jjg) null, (i2 & 16) != 0 ? null : num2);
    }
}
