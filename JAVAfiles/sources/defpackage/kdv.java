package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kdv implements kaa {
    public final myr a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final kap l;
    public final arqg m;
    public final arqg n;
    public final boolean o;
    public final tqc p;
    public final MessageId q;
    public final aevr r;
    public final aexx s;
    public final ndk t;
    private final boolean u;
    private final String v;

    public /* synthetic */ kdv(myr myrVar, boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, kap kapVar, ndk ndkVar, arqg arqgVar, arqg arqgVar2, boolean z11, tqc tqcVar, MessageId messageId, aexx aexxVar, int i) {
        arqg arqgVar3 = (i & 16384) != 0 ? kac.n : arqgVar;
        arqg arqgVar4 = (32768 & i) != 0 ? kac.o : arqgVar2;
        boolean z12 = ((65536 & i) == 0) & z11;
        tqc tqcVar2 = (131072 & i) != 0 ? tqc.UNARCHIVED : tqcVar;
        int i2 = i & 4096;
        boolean z13 = (i & 16) == 0;
        kap kapVar2 = i2 != 0 ? null : kapVar;
        boolean z14 = z13 & z3;
        String str2 = (1048576 & i) != 0 ? "" : null;
        aexx aexxVar2 = (i & 2097152) != 0 ? null : aexxVar;
        arqgVar3.getClass();
        arqgVar4.getClass();
        tqcVar2.getClass();
        str2.getClass();
        this.a = myrVar;
        this.b = z;
        this.c = z2;
        this.d = str;
        this.u = z14;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = z8;
        this.j = z9;
        this.k = z10;
        this.l = kapVar2;
        this.t = ndkVar;
        this.m = arqgVar3;
        this.n = arqgVar4;
        this.o = z12;
        this.p = tqcVar2;
        this.q = messageId;
        this.r = null;
        this.v = str2;
        this.s = aexxVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdv)) {
            return false;
        }
        kdv kdvVar = (kdv) obj;
        if (!d.F(this.a, kdvVar.a) || this.b != kdvVar.b || this.c != kdvVar.c || !d.F(this.d, kdvVar.d) || this.u != kdvVar.u || this.e != kdvVar.e || this.f != kdvVar.f || this.g != kdvVar.g || this.h != kdvVar.h || this.i != kdvVar.i || this.j != kdvVar.j || this.k != kdvVar.k || !d.F(this.l, kdvVar.l) || !d.F(this.t, kdvVar.t) || !d.F(this.m, kdvVar.m) || !d.F(this.n, kdvVar.n) || this.o != kdvVar.o || this.p != kdvVar.p || !d.F(this.q, kdvVar.q)) {
            return false;
        }
        aevr aevrVar = kdvVar.r;
        if (d.F(null, null) && d.F(this.v, kdvVar.v) && d.F(this.s, kdvVar.s)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (((((this.a.hashCode() * 31) + a.v(this.b)) * 31) + a.v(this.c)) * 31) + this.d.hashCode();
        kap kapVar = this.l;
        int i = 0;
        if (kapVar == null) {
            hashCode = 0;
        } else {
            hashCode = kapVar.hashCode();
        }
        boolean z = this.u;
        boolean z2 = this.e;
        int v = ((hashCode3 * 31) + a.v(z)) * 31;
        boolean z3 = this.f;
        int v2 = (v + a.v(z2)) * 31;
        boolean z4 = this.g;
        int v3 = (v2 + a.v(z3)) * 31;
        boolean z5 = this.h;
        int v4 = (v3 + a.v(z4)) * 31;
        boolean z6 = this.i;
        int v5 = (((((((((v4 + a.v(z5)) * 31) + a.v(z6)) * 31) + a.v(this.j)) * 31) + a.v(this.k)) * 31) + hashCode) * 31;
        ndk ndkVar = this.t;
        if (ndkVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = ndkVar.hashCode();
        }
        int hashCode4 = (((((((((((((v5 + hashCode2) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + a.v(this.o)) * 31) + this.p.hashCode()) * 31) + this.q.hashCode()) * 961) + this.v.hashCode()) * 31;
        aexx aexxVar = this.s;
        if (aexxVar != null) {
            i = aexxVar.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "TextBubbleArgs(content=" + this.a + ", isHighlighted=" + this.b + ", isOutgoing=" + this.c + ", contentDescription=" + this.d + ", isGroupConversation=" + this.u + ", isRichType=" + this.e + ", isScheduled=" + this.f + ", isContact=" + this.g + ", isSpamRecipient=" + this.h + ", isUserMarkedNotSpamRecipient=" + this.i + ", isBusinessRecipient=" + this.j + ", isBusinessRecipientVerified=" + this.k + ", searchData=" + this.l + ", preview=" + this.t + ", onTapToLoadLinkPreview=" + this.m + ", onAnimatedEmojiShown=" + this.n + ", isReply=" + this.o + ", archiveStatus=" + this.p + ", messageId=" + this.q + ", statusUiData=null, readReceiptsTestTag=" + this.v + ", messageReplySnippetUiData=" + this.s + ")";
    }
}
