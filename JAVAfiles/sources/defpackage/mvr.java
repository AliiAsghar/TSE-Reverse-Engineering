package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mvr implements miz, mvt {
    private final MessageId a;
    private final ConversationId b;
    private final mym c;
    private final String d;
    private final mje e;
    private final Instant f;
    private final Long g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final nbe k;
    private final ncq l;
    private final alog m;
    private final naz n;
    private final Instant o;
    private final atok p;
    private final int q;
    private final miy r;
    private final String s;
    private final nbv t;
    private final int u;
    private final int v;
    private final ndk w;
    private final qdq x;
    private final lgc y;

    public /* synthetic */ mvr(MessageId messageId, ConversationId conversationId, mym mymVar, String str, mje mjeVar, Instant instant, Long l, boolean z, qdq qdqVar, atok atokVar, int i, lgc lgcVar, int i2) {
        String str2;
        Long l2;
        ncr ncrVar = new ncr(0);
        int i3 = alog.d;
        alog alogVar = alsx.a;
        Instant instant2 = Instant.EPOCH;
        alogVar.getClass();
        instant2.getClass();
        this.a = messageId;
        this.b = conversationId;
        this.c = mymVar;
        if ((i2 & 8) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        this.d = str2;
        this.e = mjeVar;
        this.f = instant;
        if ((i2 & 64) != 0) {
            l2 = null;
        } else {
            l2 = l;
        }
        this.g = l2;
        this.h = false;
        this.i = z;
        this.j = false;
        this.u = 1;
        this.w = null;
        this.k = null;
        this.l = ncrVar;
        this.m = alogVar;
        this.n = null;
        this.v = 1;
        this.o = instant2;
        this.t = null;
        this.x = qdqVar;
        this.p = atokVar;
        this.q = i;
        this.y = lgcVar;
        miy ay = lga.ay(i);
        ay.getClass();
        this.r = ay;
        this.s = MessageData.al(i);
    }

    @Override // defpackage.miz
    public final miy a() {
        return this.r;
    }

    @Override // defpackage.miz
    public final /* synthetic */ MessageId b() {
        return this.a;
    }

    @Override // defpackage.miz
    public final mje c() {
        return this.e;
    }

    @Override // defpackage.miz
    public final ConversationId d() {
        return this.b;
    }

    @Override // defpackage.miz
    public final /* synthetic */ mym e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mvr)) {
            return false;
        }
        mvr mvrVar = (mvr) obj;
        if (!d.F(this.a, mvrVar.a) || !d.F(this.b, mvrVar.b) || !d.F(this.c, mvrVar.c) || !d.F(this.d, mvrVar.d) || !d.F(this.e, mvrVar.e) || !d.F(this.f, mvrVar.f) || !d.F(this.g, mvrVar.g)) {
            return false;
        }
        boolean z = mvrVar.h;
        if (this.i != mvrVar.i) {
            return false;
        }
        boolean z2 = mvrVar.j;
        int i = mvrVar.u;
        ndk ndkVar = mvrVar.w;
        if (!d.F(null, null)) {
            return false;
        }
        nbe nbeVar = mvrVar.k;
        if (!d.F(null, null) || !d.F(this.l, mvrVar.l) || !d.F(this.m, mvrVar.m)) {
            return false;
        }
        naz nazVar = mvrVar.n;
        if (!d.F(null, null)) {
            return false;
        }
        int i2 = mvrVar.v;
        if (!d.F(this.o, mvrVar.o)) {
            return false;
        }
        nbv nbvVar = mvrVar.t;
        if (d.F(null, null) && d.F(this.x, mvrVar.x) && d.F(this.p, mvrVar.p) && this.q == mvrVar.q && d.F(this.y, mvrVar.y)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.miz
    public final nbe f() {
        return null;
    }

    @Override // defpackage.miz
    public final akul g() {
        akul ag = aktp.ag("Message details not available for this message");
        ag.getClass();
        return ag;
    }

    @Override // defpackage.miz
    public final Instant h() {
        return this.f;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        String str = this.d;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode5 = ((((((hashCode4 * 31) + hashCode) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31;
        Long l = this.g;
        if (l == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l.hashCode();
        }
        int v = (((((((hashCode5 + hashCode2) * 31) + a.v(false)) * 31) + a.v(this.i)) * 31) + a.v(false)) * 31;
        a.bm(1);
        int hashCode6 = ((((v + 1) * 29791) + this.l.hashCode()) * 31) + this.m.hashCode();
        a.bm(1);
        int hashCode7 = (((hashCode6 * 961) + 1) * 31) + this.o.hashCode();
        qdq qdqVar = this.x;
        if (qdqVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = qdqVar.hashCode();
        }
        int i2 = ((hashCode7 * 961) + hashCode3) * 31;
        atok atokVar = this.p;
        if (atokVar != null) {
            i = atokVar.hashCode();
        }
        return ((((i2 + i) * 31) + this.q) * 31) + this.y.hashCode();
    }

    @Override // defpackage.miz
    public final Instant i() {
        return this.o;
    }

    @Override // defpackage.miz
    public final Long j() {
        return this.g;
    }

    @Override // defpackage.miz
    public final String k() {
        return this.d;
    }

    @Override // defpackage.miz
    public final String l() {
        return this.s;
    }

    @Override // defpackage.miz
    public final boolean m() {
        return lgc.B(this);
    }

    @Override // defpackage.miz
    public final boolean n() {
        return this.i;
    }

    @Override // defpackage.miz
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // defpackage.miz
    public final boolean p() {
        return false;
    }

    @Override // defpackage.miz
    public final nbv q() {
        return null;
    }

    @Override // defpackage.miz
    public final int r() {
        return 1;
    }

    @Override // defpackage.miz
    public final int s() {
        return 1;
    }

    @Override // defpackage.miz
    public final ndk t() {
        return null;
    }

    public final String toString() {
        return "TemporaryMessage(id=" + this.a + ", conversationId=" + this.b + ", content=" + this.c + ", caption=" + this.d + ", provenance=" + this.e + ", receivedTimestamp=" + this.f + ", analyticsStableId=" + this.g + ", isStarred=false, isEncrypted=" + this.i + ", isRead=false, interactability=NONE, preview=null, reactions=null, replyCount=" + this.l + ", editHistory=" + this.m + ", editStatus=null, category=NORMAL, sentTimestamp=" + this.o + ", status=null, repliedTo=" + this.x + ", traceId=" + this.p + ", protocol=" + this.q + ", canForwardMessageUtil=" + this.y + ")";
    }

    @Override // defpackage.miz
    public final qdq u() {
        return this.x;
    }

    @Override // defpackage.mvt
    public final int v() {
        return this.q;
    }

    @Override // defpackage.mvt
    public final atok x() {
        return this.p;
    }
}
