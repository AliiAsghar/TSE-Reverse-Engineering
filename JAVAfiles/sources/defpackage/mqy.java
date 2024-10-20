package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mqy {
    public final alog a;
    public final alog b;
    public final Optional c;
    public final boolean d;
    public final Integer e;
    public final int f;

    public /* synthetic */ mqy(alog alogVar, alog alogVar2, Optional optional, int i, boolean z, Integer num, int i2) {
        boolean z2;
        if ((i2 & 2) != 0) {
            int i3 = alog.d;
            alogVar2 = alsx.a;
        }
        optional = (i2 & 4) != 0 ? Optional.empty() : optional;
        if ((i2 & 16) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z3 = z & z2;
        num = (i2 & 32) != 0 ? null : num;
        alogVar.getClass();
        alogVar2.getClass();
        optional.getClass();
        this.a = alogVar;
        this.b = alogVar2;
        this.c = optional;
        this.f = i;
        this.d = z3;
        this.e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mqy)) {
            return false;
        }
        mqy mqyVar = (mqy) obj;
        if (d.F(this.a, mqyVar.a) && d.F(this.b, mqyVar.b) && d.F(this.c, mqyVar.c) && this.f == mqyVar.f && this.d == mqyVar.d && d.F(this.e, mqyVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        int i = this.f;
        a.bm(i);
        Integer num = this.e;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return (((((hashCode2 * 31) + i) * 31) + a.v(this.d)) * 31) + hashCode;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("FindConversationFilter(requiredRecipients=");
        sb.append(this.a);
        sb.append(", optionalRecipients=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", matchMode=");
        int i = this.f;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    str = "EXACT_RECIPIENTS_MATCH";
                } else {
                    str = "BEST_MATCH";
                }
            } else {
                str = "PARTIAL_MATCH";
            }
        } else {
            str = "EXACT_MATCH";
        }
        sb.append((Object) str);
        sb.append(", isGroup=");
        sb.append(this.d);
        sb.append(", limit=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
