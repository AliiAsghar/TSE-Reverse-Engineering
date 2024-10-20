package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yym {
    public final arqg a;
    public final MessageId b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public yym(arqg arqgVar, MessageId messageId, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = arqgVar;
        this.b = messageId;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yym)) {
            return false;
        }
        yym yymVar = (yym) obj;
        if (d.F(this.a, yymVar.a) && d.F(this.b, yymVar.b) && d.F(this.c, yymVar.c) && this.d == yymVar.d && this.e == yymVar.e && this.f == yymVar.f && this.g == yymVar.g && this.h == yymVar.h && this.i == yymVar.i) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        boolean z = this.i;
        boolean z2 = this.h;
        boolean z3 = this.g;
        boolean z4 = this.f;
        return (((((((((((hashCode * 31) + a.v(this.d)) * 31) + a.v(this.e)) * 31) + a.v(z4)) * 31) + a.v(z3)) * 31) + a.v(z2)) * 31) + a.v(z);
    }

    public final String toString() {
        return "SafeUrlLinkUiAdapterArgs(defaultOnClickBehavior=" + this.a + ", messageId=" + this.b + ", url=" + this.c + ", isIncoming=" + this.d + ", isContact=" + this.e + ", isRbm=" + this.f + ", isDetectedSpam=" + this.g + ", isUserMarkedNotSpam=" + this.h + ", isSpamFolder=" + this.i + ")";
    }
}
