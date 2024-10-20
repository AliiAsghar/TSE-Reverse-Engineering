package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ypu {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final int h;
    public final msh i;

    public ypu(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, int i2, msh mshVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = i;
        this.h = i2;
        this.i = mshVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ypu)) {
            return false;
        }
        ypu ypuVar = (ypu) obj;
        if (this.a == ypuVar.a && this.b == ypuVar.b && this.c == ypuVar.c && this.d == ypuVar.d && this.e == ypuVar.e && this.f == ypuVar.f && this.g == ypuVar.g && this.h == ypuVar.h && d.F(this.i, ypuVar.i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int v = a.v(this.a);
        msh mshVar = this.i;
        boolean z = this.f;
        boolean z2 = this.e;
        boolean z3 = this.d;
        return (((((((((((((((v * 31) + a.v(this.b)) * 31) + a.v(this.c)) * 31) + a.v(z3)) * 31) + a.v(z2)) * 31) + a.v(z)) * 31) + this.g) * 31) + this.h) * 31) + mshVar.hashCode();
    }

    public final String toString() {
        return "SpamPrechecksResult(isSpamProtectionOn=" + this.a + ", isSenderInContacts=" + this.b + ", wasSenderMarkedAsNotSpamByUser=" + this.c + ", isConversationStartedByUser=" + this.d + ", isEarliestMessage=" + this.e + ", isSenderRbmBot=" + this.f + ", userMessagesCount=" + this.g + ", conversationAgeInDays=" + this.h + ", senderMessagingIdentity=" + this.i + ")";
    }
}
