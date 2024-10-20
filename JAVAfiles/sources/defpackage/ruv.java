package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ruv {
    public static final alwo a = alwo.o("BugleDataModel");
    public final xhv b;
    public final tqc c;
    public final Optional d;
    public final Optional e;
    public final alog f;
    public final boolean g;
    public final boolean h;
    public final Optional i;
    public final int j;
    public final Optional k;
    public final long l;
    public final Optional m;
    public final boolean n;
    public final boolean o;
    public final Optional p;
    public final Optional q;
    public final Optional r;
    public final Optional s;
    public final boolean t;
    public final int u;
    public final int v;

    public ruv() {
        throw null;
    }

    public static ruu a() {
        ruu ruuVar = new ruu((byte[]) null);
        ruuVar.b(tqc.UNARCHIVED);
        ruuVar.h(true);
        ruuVar.i(true);
        ruuVar.r();
        ruuVar.g(0);
        ruuVar.o(-1L);
        ruuVar.q(false);
        ruuVar.p(1);
        ruuVar.t(1);
        return ruuVar;
    }

    public static ruu b(xjn xjnVar) {
        ruu ruuVar = new ruu((byte[]) null);
        ruuVar.b(xjnVar.a);
        ruuVar.r();
        ruuVar.h(!xjnVar.b);
        ruuVar.i(!xjnVar.c);
        ruuVar.b = Optional.ofNullable(xjnVar.d);
        ruuVar.g(xjnVar.e);
        ruuVar.o(xjnVar.f);
        ruuVar.q(false);
        ruuVar.t(1);
        return ruuVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ruv) {
            ruv ruvVar = (ruv) obj;
            if (this.b.equals(ruvVar.b) && this.c.equals(ruvVar.c) && this.d.equals(ruvVar.d) && this.e.equals(ruvVar.e) && alzz.at(this.f, ruvVar.f) && this.g == ruvVar.g && this.h == ruvVar.h && this.i.equals(ruvVar.i) && this.j == ruvVar.j && this.k.equals(ruvVar.k) && this.l == ruvVar.l && this.m.equals(ruvVar.m) && this.n == ruvVar.n) {
                int i = this.u;
                int i2 = ruvVar.u;
                if (i != 0) {
                    if (i == i2 && this.o == ruvVar.o && this.p.equals(ruvVar.p) && this.q.equals(ruvVar.q) && this.r.equals(ruvVar.r) && this.s.equals(ruvVar.s) && this.t == ruvVar.t) {
                        int i3 = this.v;
                        int i4 = ruvVar.v;
                        if (i3 != 0) {
                            if (i3 == i4) {
                                return true;
                            }
                        } else {
                            throw null;
                        }
                    }
                } else {
                    throw null;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int hashCode = ((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
        boolean z = this.h;
        int hashCode2 = this.i.hashCode();
        int i5 = 1237;
        if (true != z) {
            i = 1237;
        } else {
            i = 1231;
        }
        if (true != this.g) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        int hashCode3 = (((((((((hashCode * 1000003) ^ i2) * 1000003) ^ i) * 1000003) ^ hashCode2) * (-721379959)) ^ this.j) * 1000003) ^ this.k.hashCode();
        Optional optional = this.m;
        long j = this.l;
        int hashCode4 = (((hashCode3 * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ optional.hashCode();
        int i6 = this.u;
        a.aS(i6);
        Optional optional2 = this.p;
        boolean z2 = this.o;
        int hashCode5 = optional2.hashCode();
        if (true != z2) {
            i3 = 1237;
        } else {
            i3 = 1231;
        }
        if (true != this.n) {
            i4 = 1237;
        } else {
            i4 = 1231;
        }
        int hashCode6 = (((((((((((((hashCode4 * 1000003) ^ i4) * 1000003) ^ i6) * 1000003) ^ i3) * 1000003) ^ hashCode5) * 1000003) ^ this.q.hashCode()) * 1000003) ^ this.r.hashCode()) * 1000003) ^ this.s.hashCode();
        int i7 = this.v;
        a.bm(i7);
        if (true == this.t) {
            i5 = 1231;
        }
        return (((hashCode6 * 1000003) ^ i5) * 1000003) ^ i7;
    }

    public final String toString() {
        Optional optional = this.s;
        Optional optional2 = this.r;
        Optional optional3 = this.q;
        Optional optional4 = this.p;
        Optional optional5 = this.m;
        Optional optional6 = this.k;
        Optional optional7 = this.i;
        alog alogVar = this.f;
        Optional optional8 = this.e;
        Optional optional9 = this.d;
        tqc tqcVar = this.c;
        return "GetOrCreateConversationParameters{threadId=" + String.valueOf(this.b) + ", archiveStatus=" + String.valueOf(tqcVar) + ", selfId=" + String.valueOf(optional9) + ", defaultSelfParticipant=" + String.valueOf(optional8) + ", participants=" + String.valueOf(alogVar) + ", notificationEnabled=" + this.g + ", notificationVibration=" + this.h + ", soundUri=" + String.valueOf(optional7) + ", sourceType=0, joinState=" + this.j + ", participantIdList=" + String.valueOf(optional6) + ", rcsSessionId=" + this.l + ", conversationName=" + String.valueOf(optional5) + ", hasBeenRestoredFromTelephony=" + this.n + ", restorationSource=" + qlm.g(this.u) + ", isRcsGroup=" + this.o + ", rcsGroupId=" + String.valueOf(optional4) + ", rcsConferenceUri=" + String.valueOf(optional3) + ", rcsGroupSelfMsisdn=" + String.valueOf(optional2) + ", rcsGroupCapabilities=" + String.valueOf(optional) + ", shouldTriggerCreationListeners=" + this.t + ", conversationCreationSource=" + uxi.k(this.v) + "}";
    }

    public ruv(xhv xhvVar, tqc tqcVar, Optional optional, Optional optional2, alog alogVar, boolean z, boolean z2, Optional optional3, int i, Optional optional4, long j, Optional optional5, boolean z3, int i2, boolean z4, Optional optional6, Optional optional7, Optional optional8, Optional optional9, boolean z5, int i3) {
        this.b = xhvVar;
        this.c = tqcVar;
        this.d = optional;
        this.e = optional2;
        this.f = alogVar;
        this.g = z;
        this.h = z2;
        this.i = optional3;
        this.j = i;
        this.k = optional4;
        this.l = j;
        this.m = optional5;
        this.n = z3;
        this.u = i2;
        this.o = z4;
        this.p = optional6;
        this.q = optional7;
        this.r = optional8;
        this.s = optional9;
        this.t = z5;
        this.v = i3;
    }
}
