package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ikl {
    public final tqc a;
    public final ConversationIdType b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final String h;
    public final String i;
    public final String j;
    public final Optional k;
    public final long l;
    public final int m;
    public final boolean n;
    public final String o;
    public final String p;
    public final qpd q;
    public final boolean r;
    public final mmy s;
    public final Optional t;
    private final boolean u;
    private final xhv v;
    private final boolean w;

    public ikl() {
        throw null;
    }

    public static ikk a() {
        ikk ikkVar = new ikk(null);
        ikkVar.j(true);
        ikkVar.q(new xhv());
        ikkVar.g(false);
        return ikkVar;
    }

    public final boolean b() {
        return tvu.c(this.c);
    }

    public final boolean c() {
        return tvu.d(this.c);
    }

    public final boolean d() {
        return tvu.e(this.c);
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ikl) {
            ikl iklVar = (ikl) obj;
            if (this.a.equals(iklVar.a) && this.b.equals(iklVar.b) && this.c == iklVar.c && this.d == iklVar.d && this.e == iklVar.e && this.f == iklVar.f && this.g == iklVar.g && ((str = this.h) != null ? str.equals(iklVar.h) : iklVar.h == null) && ((str2 = this.i) != null ? str2.equals(iklVar.i) : iklVar.i == null) && ((str3 = this.j) != null ? str3.equals(iklVar.j) : iklVar.j == null) && this.u == iklVar.u && this.k.equals(iklVar.k) && this.l == iklVar.l && this.m == iklVar.m && this.n == iklVar.n && ((str4 = this.o) != null ? str4.equals(iklVar.o) : iklVar.o == null) && ((str5 = this.p) != null ? str5.equals(iklVar.p) : iklVar.p == null) && this.v.equals(iklVar.v) && this.w == iklVar.w && this.q.equals(iklVar.q) && this.r == iklVar.r && this.s.equals(iklVar.s) && this.t.equals(iklVar.t)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int i2;
        int i3;
        int hashCode2;
        int hashCode3;
        int i4;
        int i5;
        int hashCode4;
        int i6;
        int hashCode5 = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        String str = this.h;
        int i7 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i8 = this.c;
        int i9 = hashCode5 * 1000003;
        int i10 = 1237;
        if (true != this.d) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i11 = (i9 ^ i8) * 1000003;
        if (true != this.e) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        int i12 = (i11 ^ i) * 1000003;
        if (true != this.f) {
            i3 = 1237;
        } else {
            i3 = 1231;
        }
        int i13 = (((((((i12 ^ i2) * 1000003) ^ i3) * 1000003) ^ this.g) * 1000003) ^ hashCode) * 1000003;
        String str2 = this.i;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i14 = (i13 ^ hashCode2) * 1000003;
        String str3 = this.j;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i15 = (i14 ^ hashCode3) * 1000003;
        if (true != this.u) {
            i4 = 1237;
        } else {
            i4 = 1231;
        }
        int hashCode6 = (((i15 ^ i4) * 1000003) ^ this.k.hashCode()) * 1000003;
        long j = this.l;
        int i16 = (((hashCode6 ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.m) * 1000003;
        if (true != this.n) {
            i5 = 1237;
        } else {
            i5 = 1231;
        }
        int i17 = (i16 ^ i5) * 1000003;
        String str4 = this.o;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i18 = (i17 ^ hashCode4) * 1000003;
        String str5 = this.p;
        if (str5 != null) {
            i7 = str5.hashCode();
        }
        int hashCode7 = (((i18 ^ i7) * 1000003) ^ this.v.hashCode()) * 1000003;
        if (true != this.w) {
            i6 = 1237;
        } else {
            i6 = 1231;
        }
        int hashCode8 = (((hashCode7 ^ i6) * 1000003) ^ this.q.hashCode()) * 1000003;
        if (true == this.r) {
            i10 = 1231;
        }
        return ((((hashCode8 ^ i10) * 1000003) ^ this.s.hashCode()) * 1000003) ^ this.t.hashCode();
    }

    public final String toString() {
        Optional optional = this.t;
        mmy mmyVar = this.s;
        qpd qpdVar = this.q;
        xhv xhvVar = this.v;
        Optional optional2 = this.k;
        ConversationIdType conversationIdType = this.b;
        return "ConversationMetadata{archiveStatus=" + String.valueOf(this.a) + ", conversationId=" + String.valueOf(conversationIdType) + ", conversationType=" + this.c + ", shouldEncryptDrafts=" + this.d + ", hasRbmBotRecipient=" + this.e + ", includeEmailAddress=" + this.f + ", joinState=" + this.g + ", name=" + this.h + ", subtitle=" + this.i + ", icon=" + this.j + ", nameIsAutomatic=" + this.u + ", otherParticipantMessagingIdentity=" + String.valueOf(optional2) + ", rcsSessionId=" + this.l + ", sendMode=" + this.m + ", isValid=" + this.n + ", rcsGroupId=" + this.o + ", rcsConferenceUri=" + this.p + ", smsThreadId=" + String.valueOf(xhvVar) + ", awaitingReverseSync=" + this.w + ", errorState=" + String.valueOf(qpdVar) + ", hasBeenE2ee=" + this.r + ", conversationParentalApprovalStatus=" + String.valueOf(mmyVar) + ", rcsGroupLastSyncTimestamp=" + String.valueOf(optional) + "}";
    }

    public ikl(tqc tqcVar, ConversationIdType conversationIdType, int i, boolean z, boolean z2, boolean z3, int i2, String str, String str2, String str3, boolean z4, Optional optional, long j, int i3, boolean z5, String str4, String str5, xhv xhvVar, boolean z6, qpd qpdVar, boolean z7, mmy mmyVar, Optional optional2) {
        this.a = tqcVar;
        this.b = conversationIdType;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = i2;
        this.h = str;
        this.i = str2;
        this.j = str3;
        this.u = z4;
        this.k = optional;
        this.l = j;
        this.m = i3;
        this.n = z5;
        this.o = str4;
        this.p = str5;
        this.v = xhvVar;
        this.w = z6;
        this.q = qpdVar;
        this.r = z7;
        this.s = mmyVar;
        this.t = optional2;
    }
}
