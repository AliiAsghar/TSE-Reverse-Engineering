package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wjd {
    public final boolean a;
    public final adiv b;
    public final int c;
    public final String d;
    public final String e;
    public final amwt f;
    public final int g;
    public final int h;
    public final apct i;
    public final Optional j;
    public final boolean k;
    public final String l;
    public final boolean m;
    public final boolean n;
    public final String o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final int s;
    private final boolean t;

    public wjd(boolean z, adiv adivVar, int i, String str, String str2, amwt amwtVar, int i2, int i3, apct apctVar, Optional optional, boolean z2, boolean z3, int i4, String str3, boolean z4, boolean z5, String str4, boolean z6, boolean z7, boolean z8) {
        adivVar.getClass();
        apctVar.getClass();
        if (i4 != 0) {
            str3.getClass();
            str4.getClass();
            this.a = z;
            this.b = adivVar;
            this.c = i;
            this.d = str;
            this.e = str2;
            this.f = amwtVar;
            this.g = i2;
            this.h = i3;
            this.i = apctVar;
            this.j = optional;
            this.k = z2;
            this.t = z3;
            this.s = i4;
            this.l = str3;
            this.m = z4;
            this.n = z5;
            this.o = str4;
            this.p = z6;
            this.q = z7;
            this.r = z8;
            return;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wjd)) {
            return false;
        }
        wjd wjdVar = (wjd) obj;
        if (this.a == wjdVar.a && d.F(this.b, wjdVar.b) && this.c == wjdVar.c && d.F(this.d, wjdVar.d) && d.F(this.e, wjdVar.e) && this.f == wjdVar.f && this.g == wjdVar.g && this.h == wjdVar.h && d.F(this.i, wjdVar.i) && d.F(this.j, wjdVar.j) && this.k == wjdVar.k && this.t == wjdVar.t && this.s == wjdVar.s && d.F(this.l, wjdVar.l) && this.m == wjdVar.m && this.n == wjdVar.n && d.F(this.o, wjdVar.o) && this.p == wjdVar.p && this.q == wjdVar.q && this.r == wjdVar.r) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int v = (((((((((((((((((a.v(this.a) * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g) * 31) + this.h) * 31) + this.i.hashCode()) * 31) + this.j.hashCode();
        int i = this.s;
        a.bm(i);
        return (((((((((((((((((((v * 31) + a.v(this.k)) * 31) + a.v(this.t)) * 31) + i) * 31) + this.l.hashCode()) * 31) + a.v(this.m)) * 31) + a.v(this.n)) * 31) + this.o.hashCode()) * 31) + a.v(this.p)) * 31) + a.v(this.q)) * 31) + a.v(this.r);
    }

    public final String toString() {
        return "RcsSettingsSimInfo(rcsEnabled=" + this.a + ", rcsProvisioningId=" + this.b + ", simSlot=" + this.c + ", carrierName=" + this.d + ", rcsMsisdn=" + this.e + ", rcsAvailability=" + this.f + ", subId=" + this.g + ", retryCount=" + this.h + ", lastRetryTimestamp=" + this.i + ", phoneNumberRecord=" + this.j + ", allowManualPhoneNumberInput=" + this.k + ", isDefaultCall=" + this.t + ", rcsTosType=" + ((Object) Integer.toString(a.ap(this.s))) + ", tosLinkUrl=" + this.l + ", legalFyiFlowEnabled=" + this.m + ", showEnabledByCarrierInSettings=" + this.n + ", tosPrivacyPolicyUrl=" + this.o + ", roamingEnabled=" + this.p + ", cellularConnectivity=" + this.q + ", shouldShowFiMultiSyncHelpArticle=" + this.r + ")";
    }
}
