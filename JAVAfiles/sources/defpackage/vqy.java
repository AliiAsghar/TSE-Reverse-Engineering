package defpackage;

import android.os.Bundle;
import com.google.android.ims.rcsservice.group.GroupInfo;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vqy {
    public final rve a;
    public final String b;
    public final qei c;
    public final qei d;
    public final String e;
    public final String f;
    public final boolean g;
    public final String h;
    public final String i;
    public final long j;
    public final long k;
    public final String l;
    public final long m;
    public final String n;
    public final GroupInfo o;
    public final int p;
    public final boolean q;
    public final apwq r;
    public final LocationInformation s;
    public final int t;
    public final Bundle u;
    public final boolean v;
    public final boolean w;

    public vqy() {
        throw null;
    }

    public static vqx a() {
        vqx vqxVar = new vqx();
        vqxVar.g(0);
        vqxVar.b(Bundle.EMPTY);
        return vqxVar;
    }

    public final void b(tbx tbxVar) {
        tbxVar.l(this.a);
        tbxVar.d(this.l);
        tbxVar.o(this.c.d);
        tbxVar.k(this.e);
        tbxVar.n(this.f);
        tbxVar.m(this.k);
        tbxVar.q(this.j);
        tbxVar.r(this.m);
        tbxVar.s(this.n);
        tbxVar.t(this.p);
        tbxVar.f(this.r);
        qei qeiVar = this.d;
        if (qeiVar != null) {
            tbxVar.p(qeiVar.d);
        }
        tbxVar.i(this.g);
        tbxVar.e(this.h);
        tbxVar.c(this.i);
        if (aczf.E()) {
            tbxVar.g(this.v);
            tbxVar.h(this.w);
        }
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        GroupInfo groupInfo;
        apwq apwqVar;
        LocationInformation locationInformation;
        if (obj == this) {
            return true;
        }
        if (obj instanceof vqy) {
            vqy vqyVar = (vqy) obj;
            if (this.a.equals(vqyVar.a) && this.b.equals(vqyVar.b) && this.c.equals(vqyVar.c) && this.d.equals(vqyVar.d) && ((str = this.e) != null ? str.equals(vqyVar.e) : vqyVar.e == null) && ((str2 = this.f) != null ? str2.equals(vqyVar.f) : vqyVar.f == null) && this.g == vqyVar.g && ((str3 = this.h) != null ? str3.equals(vqyVar.h) : vqyVar.h == null) && ((str4 = this.i) != null ? str4.equals(vqyVar.i) : vqyVar.i == null) && this.j == vqyVar.j && this.k == vqyVar.k && ((str5 = this.l) != null ? str5.equals(vqyVar.l) : vqyVar.l == null) && this.m == vqyVar.m && ((str6 = this.n) != null ? str6.equals(vqyVar.n) : vqyVar.n == null) && ((groupInfo = this.o) != null ? groupInfo.equals(vqyVar.o) : vqyVar.o == null) && this.p == vqyVar.p && this.q == vqyVar.q && ((apwqVar = this.r) != null ? apwqVar.equals(vqyVar.r) : vqyVar.r == null) && ((locationInformation = this.s) != null ? locationInformation.equals(vqyVar.s) : vqyVar.s == null) && this.t == vqyVar.t && this.u.equals(vqyVar.u) && this.v == vqyVar.v && this.w == vqyVar.w) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int i2;
        int hashCode8;
        int i3;
        int hashCode9 = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        String str = this.e;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = ((hashCode9 * 1000003) ^ hashCode) * 1000003;
        String str2 = this.f;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i6 = (i5 ^ hashCode2) * 1000003;
        int i7 = 1237;
        if (true != this.g) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i8 = (i6 ^ i) * 1000003;
        String str3 = this.h;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i9 = (i8 ^ hashCode3) * 1000003;
        String str4 = this.i;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        long j = this.j;
        int i10 = (((i9 ^ hashCode4) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.k;
        int i11 = (i10 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str5 = this.l;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i12 = (i11 ^ hashCode5) * 1000003;
        long j3 = this.m;
        int i13 = (i12 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str6 = this.n;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i14 = (i13 ^ hashCode6) * 1000003;
        GroupInfo groupInfo = this.o;
        if (groupInfo == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = groupInfo.hashCode();
        }
        int i15 = (((i14 ^ hashCode7) * 1000003) ^ this.p) * 1000003;
        if (true != this.q) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        int i16 = (i15 ^ i2) * 1000003;
        apwq apwqVar = this.r;
        if (apwqVar == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = apwqVar.hashCode();
        }
        int i17 = (i16 ^ hashCode8) * 1000003;
        LocationInformation locationInformation = this.s;
        if (locationInformation != null) {
            i4 = locationInformation.hashCode();
        }
        int hashCode10 = (((((i17 ^ i4) * 1000003) ^ this.t) * 1000003) ^ this.u.hashCode()) * 1000003;
        if (true != this.v) {
            i3 = 1237;
        } else {
            i3 = 1231;
        }
        int i18 = (hashCode10 ^ i3) * 1000003;
        if (true == this.w) {
            i7 = 1231;
        }
        return i18 ^ i7;
    }

    public final String toString() {
        Bundle bundle = this.u;
        LocationInformation locationInformation = this.s;
        apwq apwqVar = this.r;
        GroupInfo groupInfo = this.o;
        qei qeiVar = this.d;
        qei qeiVar2 = this.c;
        return "ReceiveRcsActionParameters{rcsMessageId=" + String.valueOf(this.a) + ", remoteUserId=" + this.b + ", remoteChatEndpoint=" + String.valueOf(qeiVar2) + ", selfChatEndpoint=" + String.valueOf(qeiVar) + ", messageRawText=" + this.e + ", remoteInstance=" + this.f + ", isGroup=" + this.g + ", rcsConversationId=" + this.h + ", rcsConferenceUri=" + this.i + ", sentTimestamp=" + this.j + ", receivedTimestamp=" + this.k + ", contentType=" + this.l + ", rcsSessionId=" + this.m + ", alias=" + this.n + ", groupInfo=" + String.valueOf(groupInfo) + ", spamVerdict=" + this.p + ", isMarkedAsBot=" + this.q + ", customHeaders=" + String.valueOf(apwqVar) + ", locationInformation=" + String.valueOf(locationInformation) + ", messageStatus=" + this.t + ", additionalMessageDetails=" + String.valueOf(bundle) + ", isDeliveryReportRequested=" + this.v + ", isDisplayReportRequested=" + this.w + "}";
    }

    public vqy(rve rveVar, String str, qei qeiVar, qei qeiVar2, String str2, String str3, boolean z, String str4, String str5, long j, long j2, String str6, long j3, String str7, GroupInfo groupInfo, int i, boolean z2, apwq apwqVar, LocationInformation locationInformation, int i2, Bundle bundle, boolean z3, boolean z4) {
        this.a = rveVar;
        this.b = str;
        this.c = qeiVar;
        this.d = qeiVar2;
        this.e = str2;
        this.f = str3;
        this.g = z;
        this.h = str4;
        this.i = str5;
        this.j = j;
        this.k = j2;
        this.l = str6;
        this.m = j3;
        this.n = str7;
        this.o = groupInfo;
        this.p = i;
        this.q = z2;
        this.r = apwqVar;
        this.s = locationInformation;
        this.t = i2;
        this.u = bundle;
        this.v = z3;
        this.w = z4;
    }
}
