package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anjw {
    public final String a;
    public final aqfn b;
    public final aqfn c;
    public final alog d;
    public final aqfn e;
    public final anix f;
    public final int g;
    public final int h;

    public anjw(String str, aqfn aqfnVar, aqfn aqfnVar2, int i, int i2, alog alogVar, aqfn aqfnVar3, anix anixVar) {
        str.getClass();
        aqfnVar.getClass();
        aqfnVar2.getClass();
        if (i != 0 && i2 != 0) {
            alogVar.getClass();
            this.a = str;
            this.b = aqfnVar;
            this.c = aqfnVar2;
            this.g = i;
            this.h = i2;
            this.d = alogVar;
            this.e = aqfnVar3;
            this.f = anixVar;
            return;
        }
        throw null;
    }

    public final Optional a() {
        return Optional.ofNullable(this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anjw)) {
            return false;
        }
        anjw anjwVar = (anjw) obj;
        if (d.F(this.a, anjwVar.a) && d.F(this.b, anjwVar.b) && d.F(this.c, anjwVar.c) && this.g == anjwVar.g && this.h == anjwVar.h && d.F(this.d, anjwVar.d) && d.F(this.e, anjwVar.e) && d.F(this.f, anjwVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        int i = this.g;
        a.bm(i);
        int i2 = this.h;
        a.bm(i2);
        int hashCode3 = (((((hashCode2 * 31) + i) * 31) + i2) * 31) + this.d.hashCode();
        aqfn aqfnVar = this.e;
        int i3 = 0;
        if (aqfnVar == null) {
            hashCode = 0;
        } else {
            hashCode = aqfnVar.hashCode();
        }
        int i4 = ((hashCode3 * 31) + hashCode) * 31;
        anix anixVar = this.f;
        if (anixVar != null) {
            i3 = anixVar.hashCode();
        }
        return i4 + i3;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("MessageMetadata(messageId=");
        sb.append(this.a);
        sb.append(", senderId=");
        sb.append(this.b);
        sb.append(", recipientId=");
        sb.append(this.c);
        sb.append(", messageType=");
        sb.append((Object) anme.g(this.g));
        sb.append(", messagePriority=");
        int i = this.h;
        if (i != 1) {
            if (i != 2) {
                str = "NORMAL";
            } else {
                str = "HIGH";
            }
        } else {
            str = "UNKNOWN";
        }
        sb.append((Object) str);
        sb.append(", headers=");
        sb.append(this.d);
        sb.append(", groupContext=");
        sb.append(this.e);
        sb.append(", traceId=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
