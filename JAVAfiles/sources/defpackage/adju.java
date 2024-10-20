package defpackage;

import com.google.android.ims.provisioning.config.ImsConfiguration;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adju {
    public final String A;
    public final boolean B;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final float o;
    public final String p;
    public final int q;
    public final boolean r;
    public final String s;
    public final String t;
    public final String u;
    public final String v;
    public final String w;
    public final int x;
    public final int y;
    public final String z;

    public adju() {
        throw null;
    }

    public static adjt a() {
        adjt adjtVar = new adjt();
        adjtVar.q("unknown");
        adjtVar.o("unknown");
        adjtVar.p("unknown");
        adjtVar.C("unknown");
        adjtVar.A("unknown");
        adjtVar.B("unknown");
        adjtVar.w(500);
        adjtVar.x(9500);
        adjtVar.y(10000);
        adjtVar.i(5762);
        adjtVar.n("");
        adjtVar.r("");
        adjtVar.z("");
        adjtVar.f("");
        adjtVar.s(brg.a);
        adjtVar.k("");
        adjtVar.l(-1);
        adjtVar.h(false);
        adjtVar.m("");
        adjtVar.e("");
        adjtVar.d("");
        adjtVar.b("");
        adjtVar.c("");
        adjtVar.u(1800);
        adjtVar.v(3600);
        adjtVar.j("sip");
        adjtVar.g("sip");
        adjtVar.t(false);
        return adjtVar;
    }

    public static adjt b(ImsConfiguration imsConfiguration) {
        adjt a = a();
        if (!Objects.isNull(imsConfiguration)) {
            if (Objects.nonNull(imsConfiguration.mPsSipTransport)) {
                a.q(imsConfiguration.mPsSipTransport);
            }
            if (Objects.nonNull(imsConfiguration.mPsMediaTransport)) {
                a.o(imsConfiguration.mPsMediaTransport);
            }
            if (Objects.nonNull(imsConfiguration.mPsRtpTransport)) {
                a.p(imsConfiguration.mPsRtpTransport);
            }
            if (Objects.nonNull(imsConfiguration.mWifiSipTransport)) {
                a.C(imsConfiguration.mWifiSipTransport);
            }
            if (Objects.nonNull(imsConfiguration.mWifiMediaTransport)) {
                a.A(imsConfiguration.mWifiMediaTransport);
            }
            if (Objects.nonNull(imsConfiguration.mWifiRtpTransport)) {
                a.B(imsConfiguration.mWifiRtpTransport);
            }
            a.w(imsConfiguration.mT1);
            a.x(imsConfiguration.mT2);
            a.y(imsConfiguration.mT4);
            a.i(imsConfiguration.mLocalSipPort);
            if (Objects.nonNull(imsConfiguration.mPrivateIdentity)) {
                a.n(imsConfiguration.mPrivateIdentity);
            }
            if (Objects.nonNull(imsConfiguration.mPublicIdentity)) {
                a.r(imsConfiguration.mPublicIdentity);
            }
            if (Objects.nonNull(imsConfiguration.mUserName)) {
                a.z(imsConfiguration.mUserName);
            }
            if (Objects.nonNull(imsConfiguration.mDomain)) {
                a.f(imsConfiguration.mDomain);
            }
            a.s(imsConfiguration.mQ);
            if (Objects.nonNull(imsConfiguration.mPcscfAddress)) {
                a.k(imsConfiguration.mPcscfAddress);
            }
            a.l(imsConfiguration.mPcsfPort);
            a.h(imsConfiguration.mKeepAlive);
            if (Objects.nonNull(imsConfiguration.mPhoneContext)) {
                a.m(imsConfiguration.mPhoneContext);
            }
            if (Objects.nonNull(imsConfiguration.mAuthenticationScheme)) {
                a.e(imsConfiguration.mAuthenticationScheme);
            }
            if (Objects.nonNull(imsConfiguration.mAuthDigestUsername)) {
                a.d(imsConfiguration.mAuthDigestUsername);
            }
            if (Objects.nonNull(imsConfiguration.mAuthDigestPassword)) {
                a.b(imsConfiguration.mAuthDigestPassword);
            }
            if (Objects.nonNull(imsConfiguration.mAuthDigestRealm)) {
                a.c(imsConfiguration.mAuthDigestRealm);
            }
            a.u(imsConfiguration.mRegRetryBaseTime);
            a.v(imsConfiguration.mRegRetryMaxTime);
            if (Objects.nonNull(imsConfiguration.mNatUrlFmt)) {
                a.j(imsConfiguration.mNatUrlFmt);
            }
            if (Objects.nonNull(imsConfiguration.mIntUrlFmt)) {
                a.g(imsConfiguration.mIntUrlFmt);
            }
            a.t(imsConfiguration.rcsVolteSingleRegistration);
        }
        return a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adju) {
            adju adjuVar = (adju) obj;
            if (this.a.equals(adjuVar.a) && this.b.equals(adjuVar.b) && this.c.equals(adjuVar.c) && this.d.equals(adjuVar.d) && this.e.equals(adjuVar.e) && this.f.equals(adjuVar.f) && this.g == adjuVar.g && this.h == adjuVar.h && this.i == adjuVar.i && this.j == adjuVar.j && this.k.equals(adjuVar.k) && this.l.equals(adjuVar.l) && this.m.equals(adjuVar.m) && this.n.equals(adjuVar.n)) {
                if (Float.floatToIntBits(this.o) == Float.floatToIntBits(adjuVar.o) && this.p.equals(adjuVar.p) && this.q == adjuVar.q && this.r == adjuVar.r && this.s.equals(adjuVar.s) && this.t.equals(adjuVar.t) && this.u.equals(adjuVar.u) && this.v.equals(adjuVar.v) && this.w.equals(adjuVar.w) && this.x == adjuVar.x && this.y == adjuVar.y && this.z.equals(adjuVar.z) && this.A.equals(adjuVar.A) && this.B == adjuVar.B) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((((((((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003) ^ this.j) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ Float.floatToIntBits(this.o)) * 1000003) ^ this.p.hashCode();
        int i2 = 1237;
        if (true != this.r) {
            i = 1237;
        } else {
            i = 1231;
        }
        int hashCode2 = ((((((((((((((((((((((hashCode * 1000003) ^ this.q) * 1000003) ^ i) * 1000003) ^ this.s.hashCode()) * 1000003) ^ this.t.hashCode()) * 1000003) ^ this.u.hashCode()) * 1000003) ^ this.v.hashCode()) * 1000003) ^ this.w.hashCode()) * 1000003) ^ this.x) * 1000003) ^ this.y) * 1000003) ^ this.z.hashCode()) * 1000003) ^ this.A.hashCode()) * 1000003;
        if (true == this.B) {
            i2 = 1231;
        }
        return hashCode2 ^ i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableImsConfiguration{psSipTransport=");
        sb.append(this.a);
        sb.append(", psMediaTransport=");
        sb.append(this.b);
        sb.append(", psRtpTransport=");
        sb.append(this.c);
        sb.append(", wifiSipTransport=");
        sb.append(this.d);
        sb.append(", wifiMediaTransport=");
        sb.append(this.e);
        sb.append(", wifiRtpTransport=");
        sb.append(this.f);
        sb.append(", timerT1=");
        sb.append(this.g);
        sb.append(", timerT2=");
        sb.append(this.h);
        sb.append(", timerT4=");
        sb.append(this.i);
        sb.append(", localSipPort=");
        sb.append(this.j);
        sb.append(", privateIdentity=");
        sb.append(this.k);
        sb.append(", publicIdentity=");
        sb.append(this.l);
        sb.append(", username=");
        sb.append(this.m);
        sb.append(", domain=");
        sb.append(this.n);
        sb.append(", q=");
        sb.append(this.o);
        sb.append(", pcscfAddress=");
        sb.append(this.p);
        sb.append(", pcscfPort=");
        sb.append(this.q);
        sb.append(", keepAlive=");
        sb.append(this.r);
        sb.append(", phoneContext=");
        sb.append(this.s);
        sb.append(", authenticationScheme=");
        sb.append(this.t);
        sb.append(", authDigestUsername=");
        sb.append(this.u);
        sb.append(", authDigestPassword=");
        sb.append(this.v);
        sb.append(", authDigestRealm=");
        sb.append(this.w);
        sb.append(", regRetryBaseTime=");
        boolean z = this.B;
        String str = this.A;
        String str2 = this.z;
        int i = this.y;
        sb.append(this.x);
        sb.append(", regRetryMaxTime=");
        sb.append(i);
        sb.append(", natUrlFmt=");
        sb.append(str2);
        sb.append(", intUrlFmt=");
        sb.append(str);
        sb.append(", rcsVolteSingleRegistration=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    public adju(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, int i3, int i4, String str7, String str8, String str9, String str10, float f, String str11, int i5, boolean z, String str12, String str13, String str14, String str15, String str16, int i6, int i7, String str17, String str18, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = str7;
        this.l = str8;
        this.m = str9;
        this.n = str10;
        this.o = f;
        this.p = str11;
        this.q = i5;
        this.r = z;
        this.s = str12;
        this.t = str13;
        this.u = str14;
        this.v = str15;
        this.w = str16;
        this.x = i6;
        this.y = i7;
        this.z = str17;
        this.A = str18;
        this.B = z2;
    }
}
