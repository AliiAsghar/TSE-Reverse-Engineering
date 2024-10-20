package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vsj {
    public static final alwo a = alwo.o("BugleGroupManagement");
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final Optional e;
    public final Optional f;
    public final Optional g;
    public final Optional h;
    public final Optional i;
    public final Optional j;
    public final Optional k;
    public final Optional l;
    public final Optional m;
    public final Optional n;
    public final int o;
    public final xhv p;
    public final boolean q;
    public final Optional r;
    public final boolean s;
    public final int t;
    public final int u;

    public vsj() {
        throw null;
    }

    public static vsi a() {
        vsi vsiVar = new vsi((byte[]) null);
        vsiVar.m(0);
        vsiVar.c = new xhv();
        vsiVar.f(false);
        vsiVar.d = 1;
        vsiVar.q(false);
        vsiVar.e = 1;
        return vsiVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Optional b(vsj vsjVar) {
        if (vsjVar.g.isPresent()) {
            return vsjVar.g;
        }
        return vsjVar.f.flatMap(new vrx(3));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vsj) {
            vsj vsjVar = (vsj) obj;
            if (this.b == vsjVar.b && this.c == vsjVar.c && this.d == vsjVar.d && this.e.equals(vsjVar.e) && this.f.equals(vsjVar.f) && this.g.equals(vsjVar.g) && this.h.equals(vsjVar.h) && this.i.equals(vsjVar.i) && this.j.equals(vsjVar.j) && this.k.equals(vsjVar.k) && this.l.equals(vsjVar.l) && this.m.equals(vsjVar.m) && this.n.equals(vsjVar.n) && this.o == vsjVar.o && this.p.equals(vsjVar.p) && this.q == vsjVar.q) {
                int i = this.t;
                int i2 = vsjVar.t;
                if (i != 0) {
                    if (i == i2 && this.r.equals(vsjVar.r) && this.s == vsjVar.s) {
                        int i3 = this.u;
                        int i4 = vsjVar.u;
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
        boolean z = this.d;
        int hashCode = this.e.hashCode();
        int i5 = 1237;
        if (true != z) {
            i = 1237;
        } else {
            i = 1231;
        }
        if (true != this.c) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        if (true != this.b) {
            i3 = 1237;
        } else {
            i3 = 1231;
        }
        int hashCode2 = ((((((((((((((((((((((((i ^ ((i2 ^ ((i3 ^ 1000003) * 1000003)) * 1000003)) * 1000003) ^ hashCode) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o) * 1000003) ^ this.p.hashCode();
        int i6 = this.t;
        a.aS(i6);
        Optional optional = this.r;
        boolean z2 = this.q;
        int hashCode3 = optional.hashCode();
        if (true != z2) {
            i4 = 1237;
        } else {
            i4 = 1231;
        }
        int i7 = (((((hashCode2 * 1000003) ^ i4) * 1000003) ^ i6) * 1000003) ^ hashCode3;
        int i8 = this.u;
        a.bm(i8);
        if (true == this.s) {
            i5 = 1231;
        }
        return (((i7 * 1000003) ^ i5) * 1000003) ^ i8;
    }

    public final String toString() {
        Optional optional = this.r;
        xhv xhvVar = this.p;
        Optional optional2 = this.n;
        Optional optional3 = this.m;
        Optional optional4 = this.l;
        Optional optional5 = this.k;
        Optional optional6 = this.j;
        Optional optional7 = this.i;
        Optional optional8 = this.h;
        Optional optional9 = this.g;
        Optional optional10 = this.f;
        return "RcsConversationAndThreadIdQueryParameters{createConversationIfNotPresent=" + this.b + ", isBot=" + this.c + ", isRcsGroup=" + this.d + ", rcsSessionId=" + String.valueOf(this.e) + ", rcsGroupInfo=" + String.valueOf(optional10) + ", rcsGroupId=" + String.valueOf(optional9) + ", rcsConferenceUri=" + String.valueOf(optional8) + ", groupName=" + String.valueOf(optional7) + ", rcsGroupSelfMsisdn=" + String.valueOf(optional6) + ", defaultSelfParticipant=" + String.valueOf(optional5) + ", participants=" + String.valueOf(optional4) + ", rcsGroupCapabilities=" + String.valueOf(optional3) + ", rcsGroupResolutionTriggerSource=" + String.valueOf(optional2) + ", rcsGroupJoinState=" + this.o + ", knownThreadForConversationCreation=" + String.valueOf(xhvVar) + ", hasBeenRestoredFromTelephony=" + this.q + ", restorationSource=" + qlm.g(this.t) + ", customHeaders=" + String.valueOf(optional) + ", shouldTriggerCreationListeners=" + this.s + ", conversationCreationSource=" + uxi.k(this.u) + "}";
    }

    public vsj(boolean z, boolean z2, boolean z3, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6, Optional optional7, Optional optional8, Optional optional9, Optional optional10, int i, xhv xhvVar, boolean z4, int i2, Optional optional11, boolean z5, int i3) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = optional;
        this.f = optional2;
        this.g = optional3;
        this.h = optional4;
        this.i = optional5;
        this.j = optional6;
        this.k = optional7;
        this.l = optional8;
        this.m = optional9;
        this.n = optional10;
        this.o = i;
        this.p = xhvVar;
        this.q = z4;
        this.t = i2;
        this.r = optional11;
        this.s = z5;
        this.u = i3;
    }
}
