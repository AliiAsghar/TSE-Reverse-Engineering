package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jiv {
    public final jjh a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public jiv(jjh jjhVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = jjhVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jiv)) {
            return false;
        }
        jiv jivVar = (jiv) obj;
        if (d.F(this.a, jivVar.a) && this.b == jivVar.b && this.c == jivVar.c && this.d == jivVar.d && this.e == jivVar.e && this.f == jivVar.f && this.g == jivVar.g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        boolean z = this.g;
        boolean z2 = this.f;
        boolean z3 = this.e;
        boolean z4 = this.d;
        return ((((((((((hashCode + a.v(this.b)) * 31) + a.v(this.c)) * 31) + a.v(z4)) * 31) + a.v(z3)) * 31) + a.v(z2)) * 31) + a.v(z);
    }

    public final String toString() {
        return "SendIconData(sendIcon=" + this.a + ", isScheduledMessage=" + this.b + ", isEditMessage=" + this.c + ", processingAttachment=" + this.d + ", editMessageTextChanged=" + this.e + ", hasSendableContent=" + this.f + ", disableSendDueToTextLength=" + this.g + ")";
    }
}
