package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mly implements mll {
    private final utk A;
    private final boolean B;
    private final boolean C;
    private final ConversationId a;
    private final boolean b;
    private final tqc c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final String h;
    private final int i;
    private final boolean j;
    private final qpd k;
    private final int l;
    private final amjj m;
    private final String n;
    private final String o;
    private final nfw p;
    private final Uri q;
    private final long r;
    private final String s;
    private final Instant t;
    private final mnk u;
    private final boolean v;
    private final mod w;
    private final mmy x;
    private final boolean y;
    private final vvh z;

    public mly() {
        throw null;
    }

    @Override // defpackage.mll
    public final String A() {
        return this.n;
    }

    @Override // defpackage.mll
    public final String B() {
        return this.o;
    }

    @Override // defpackage.mll
    public final boolean C() {
        return this.j;
    }

    @Override // defpackage.mll
    public final boolean D() {
        return this.v;
    }

    @Override // defpackage.mll
    public final /* synthetic */ boolean E() {
        return lgc.I(this);
    }

    @Override // defpackage.mll
    public final boolean F() {
        if (!this.j && !tvu.e(this.i)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.miu
    public final Uri a() {
        return this.q;
    }

    @Override // defpackage.miu
    public final mit b() {
        if (!this.d) {
            if (!this.j) {
                if (tvu.c(this.i)) {
                    return mit.GROUP;
                }
                return mit.ONE_ON_ONE;
            }
            return mit.RBM;
        }
        return mit.UNKNOWN;
    }

    @Override // defpackage.miu
    public final ConversationId c() {
        return this.a;
    }

    @Override // defpackage.miu
    public final mmy d() {
        return this.x;
    }

    @Override // defpackage.miu
    public final mnk e() {
        return this.u;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        nfw nfwVar;
        Uri uri;
        String str4;
        Instant instant;
        mnk mnkVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof mly) {
            mly mlyVar = (mly) obj;
            if (this.a.equals(mlyVar.a) && this.b == mlyVar.b && this.c.equals(mlyVar.c) && this.d == mlyVar.d && this.e == mlyVar.e && this.f == mlyVar.f && this.g == mlyVar.g && ((str = this.h) != null ? str.equals(mlyVar.h) : mlyVar.h == null) && this.i == mlyVar.i && this.j == mlyVar.j && this.k.equals(mlyVar.k) && this.l == mlyVar.l && this.m.equals(mlyVar.m) && ((str2 = this.n) != null ? str2.equals(mlyVar.n) : mlyVar.n == null) && ((str3 = this.o) != null ? str3.equals(mlyVar.o) : mlyVar.o == null) && ((nfwVar = this.p) != null ? nfwVar.equals(mlyVar.p) : mlyVar.p == null) && ((uri = this.q) != null ? uri.equals(mlyVar.q) : mlyVar.q == null) && this.r == mlyVar.r && ((str4 = this.s) != null ? str4.equals(mlyVar.s) : mlyVar.s == null) && ((instant = this.t) != null ? instant.equals(mlyVar.t) : mlyVar.t == null) && ((mnkVar = this.u) != null ? mnkVar.equals(mlyVar.u) : mlyVar.u == null) && this.v == mlyVar.v && this.w.equals(mlyVar.w) && this.x.equals(mlyVar.x) && this.y == mlyVar.y && this.z.equals(mlyVar.z) && this.A.equals(mlyVar.A) && this.B == mlyVar.B && this.C == mlyVar.C) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.miu
    public final nfw f() {
        return this.p;
    }

    @Override // defpackage.miu
    public final tqc g() {
        return this.c;
    }

    @Override // defpackage.miu
    public final String h() {
        return this.h;
    }

    public final int hashCode() {
        int i;
        int hashCode;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int i7;
        int i8;
        int i9;
        int hashCode8 = this.a.hashCode() ^ 1000003;
        int i10 = 1237;
        if (true != this.b) {
            i = 1237;
        } else {
            i = 1231;
        }
        int hashCode9 = (((hashCode8 * 1000003) ^ i) * 1000003) ^ this.c.hashCode();
        String str = this.h;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        if (true != this.d) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        int i12 = hashCode9 * 1000003;
        if (true != this.e) {
            i3 = 1237;
        } else {
            i3 = 1231;
        }
        int i13 = (i12 ^ i2) * 1000003;
        if (true != this.f) {
            i4 = 1237;
        } else {
            i4 = 1231;
        }
        int i14 = (i13 ^ i3) * 1000003;
        if (true != this.g) {
            i5 = 1237;
        } else {
            i5 = 1231;
        }
        int i15 = (((((((i14 ^ i4) * 1000003) ^ i5) * 1000003) ^ hashCode) * 1000003) ^ this.i) * 1000003;
        if (true != this.j) {
            i6 = 1237;
        } else {
            i6 = 1231;
        }
        int hashCode10 = (((((((i15 ^ i6) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l) * 1000003) ^ this.m.hashCode()) * 1000003;
        String str2 = this.n;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i16 = (hashCode10 ^ hashCode2) * 1000003;
        String str3 = this.o;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i17 = (i16 ^ hashCode3) * 1000003;
        nfw nfwVar = this.p;
        if (nfwVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = nfwVar.hashCode();
        }
        int i18 = (i17 ^ hashCode4) * 1000003;
        Uri uri = this.q;
        if (uri == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = uri.hashCode();
        }
        long j = this.r;
        int i19 = (((i18 ^ hashCode5) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        String str4 = this.s;
        if (str4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str4.hashCode();
        }
        int i20 = (i19 ^ hashCode6) * 1000003;
        Instant instant = this.t;
        if (instant == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = instant.hashCode();
        }
        int i21 = (i20 ^ hashCode7) * 1000003;
        mnk mnkVar = this.u;
        if (mnkVar != null) {
            i11 = mnkVar.hashCode();
        }
        int i22 = (i21 ^ i11) * 1000003;
        if (true != this.v) {
            i7 = 1237;
        } else {
            i7 = 1231;
        }
        int hashCode11 = (((((i22 ^ i7) * 1000003) ^ this.w.hashCode()) * 1000003) ^ this.x.hashCode()) * 1000003;
        if (true != this.y) {
            i8 = 1237;
        } else {
            i8 = 1231;
        }
        int hashCode12 = (((((hashCode11 ^ i8) * 1000003) ^ this.z.hashCode()) * 1000003) ^ this.A.hashCode()) * 1000003;
        if (true != this.B) {
            i9 = 1237;
        } else {
            i9 = 1231;
        }
        int i23 = (hashCode12 ^ i9) * 1000003;
        if (true == this.C) {
            i10 = 1231;
        }
        return i23 ^ i10;
    }

    @Override // defpackage.miu
    public final boolean i() {
        if (b() != mit.RBM) {
            if (!tvu.e(this.i) || this.l != 2) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.miu
    public final boolean j() {
        return this.y;
    }

    @Override // defpackage.miu
    public final boolean k() {
        return this.f;
    }

    @Override // defpackage.miu
    public final boolean l() {
        return this.e;
    }

    @Override // defpackage.miu
    public final boolean m() {
        return this.B;
    }

    @Override // defpackage.miu
    public final boolean n() {
        return this.b;
    }

    @Override // defpackage.miu
    public final boolean o() {
        return this.C;
    }

    @Override // defpackage.miu
    public final boolean p() {
        return this.g;
    }

    @Override // defpackage.miu
    public final boolean q() {
        return this.d;
    }

    @Override // defpackage.mll
    public final int r() {
        return this.i;
    }

    @Override // defpackage.mll
    public final int s() {
        return this.l;
    }

    @Override // defpackage.mll
    public final long t() {
        return this.r;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(b());
        String b = tvu.b(this.i);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.p);
        String bl = yyb.bl(this.q);
        String name = this.k.name();
        String name2 = this.m.name();
        boolean I = lgc.I(this);
        String bk = yyb.bk(this.s);
        String valueOf5 = String.valueOf(this.x);
        boolean i = i();
        String valueOf6 = String.valueOf(this.z);
        String valueOf7 = String.valueOf(this.w);
        StringBuilder sb = new StringBuilder("BugleConversationProperties: {\n  id: ");
        sb.append(valueOf);
        sb.append("\n  kind: ");
        sb.append(valueOf2);
        sb.append("\n  ConversationType: ");
        sb.append(b);
        sb.append("\n  name: ");
        sb.append(this.h);
        sb.append("\n  nameIsAutomatic: ");
        sb.append(this.b);
        sb.append("\n  archiveStatus: ");
        sb.append(valueOf3);
        sb.append("\n  isDeleted: ");
        sb.append(this.d);
        sb.append("\n  activeSelfIdentity: ");
        sb.append(valueOf4);
        sb.append("\n  icon: ");
        sb.append(bl);
        sb.append("\n  isUnread: ");
        sb.append(this.e);
        sb.append("\n  isEncrypted: ");
        sb.append(this.f);
        sb.append("\n  wasPreviouslyEncrypted: ");
        sb.append(this.g);
        sb.append("\n  hasRbmBotRecipient: ");
        sb.append(this.j);
        sb.append("\n  errorState: ");
        sb.append(name);
        sb.append("\n  joinState: ");
        sb.append(this.l);
        sb.append("\n  sendMode: ");
        sb.append(name2);
        sb.append("\n  rcsConferenceUri: ");
        sb.append(this.n);
        sb.append("\n  rcsGroupId: ");
        sb.append(this.o);
        sb.append("\n  rcsChatSessionId: ");
        sb.append(this.r);
        boolean z = this.v;
        boolean z2 = this.y;
        boolean z3 = this.B;
        boolean z4 = this.C;
        sb.append("\n  wasRcs: ");
        sb.append(I);
        sb.append("\n  sessionAllowsRevocation: ");
        sb.append(z);
        sb.append("\n  participantNormalizedDestination: ");
        sb.append(bk);
        sb.append("\n  parentalApprovalStatus: ");
        sb.append(valueOf5);
        sb.append("\n  canRemovePeople: ");
        sb.append(z2);
        sb.append("\n  getCanAddPeople: ");
        sb.append(i);
        sb.append("\n  mmsGroupUpgradeStatus: ");
        sb.append(valueOf6);
        sb.append("\n  palMode: ");
        sb.append(valueOf7);
        sb.append("\n  longPressActionsEnabled: ");
        sb.append(z3);
        sb.append("\n  shouldShowSimName: ");
        sb.append(z4);
        sb.append("\n}");
        return sb.toString();
    }

    @Override // defpackage.mll
    public final mod u() {
        return this.w;
    }

    @Override // defpackage.mll
    public final qpd v() {
        return this.k;
    }

    @Override // defpackage.mll
    public final vvh w() {
        return this.z;
    }

    @Override // defpackage.mll
    public final amjj x() {
        return this.m;
    }

    @Override // defpackage.mll
    public final Instant y() {
        return this.t;
    }

    @Override // defpackage.mll
    public final String z() {
        return this.s;
    }

    public mly(ConversationId conversationId, boolean z, tqc tqcVar, boolean z2, boolean z3, boolean z4, boolean z5, String str, int i, boolean z6, qpd qpdVar, int i2, amjj amjjVar, String str2, String str3, nfw nfwVar, Uri uri, long j, String str4, Instant instant, mnk mnkVar, boolean z7, mod modVar, mmy mmyVar, boolean z8, vvh vvhVar, utk utkVar, boolean z9, boolean z10) {
        this.a = conversationId;
        this.b = z;
        this.c = tqcVar;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = str;
        this.i = i;
        this.j = z6;
        this.k = qpdVar;
        this.l = i2;
        this.m = amjjVar;
        this.n = str2;
        this.o = str3;
        this.p = nfwVar;
        this.q = uri;
        this.r = j;
        this.s = str4;
        this.t = instant;
        this.u = mnkVar;
        this.v = z7;
        this.w = modVar;
        this.x = mmyVar;
        this.y = z8;
        this.z = vvhVar;
        this.A = utkVar;
        this.B = z9;
        this.C = z10;
    }
}
