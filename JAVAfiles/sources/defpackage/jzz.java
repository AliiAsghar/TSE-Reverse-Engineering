package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jzz {
    public final boolean a;
    public final tqc b;
    public final kha c;
    public final kap d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final arqr j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final kam q;
    private final boolean r;

    public /* synthetic */ jzz(kam kamVar, boolean z, tqc tqcVar, kha khaVar, kap kapVar, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, arqr arqrVar, boolean z7, boolean z8, boolean z9, boolean z10, int i) {
        tqc tqcVar2;
        kha khaVar2;
        kap kapVar2;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        if ((i & 4) != 0) {
            tqcVar2 = tqc.UNARCHIVED;
        } else {
            tqcVar2 = tqcVar;
        }
        byte b = 0;
        if ((i & 8) != 0) {
            khaVar2 = new kha(b == true ? 1 : 0);
        } else {
            khaVar2 = khaVar;
        }
        if ((i & 16) != 0) {
            kapVar2 = null;
        } else {
            kapVar2 = kapVar;
        }
        if ((i & 32) != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean z22 = z11 & z2;
        if ((i & 64) != 0) {
            z12 = false;
        } else {
            z12 = true;
        }
        boolean z23 = (!z12) | z3;
        if ((i & 128) != 0) {
            z13 = false;
        } else {
            z13 = true;
        }
        boolean z24 = z13 & z4;
        if ((i & 256) != 0) {
            z14 = false;
        } else {
            z14 = true;
        }
        boolean z25 = z14 & z5;
        if ((i & 512) != 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        if ((i & 1024) != 0) {
            z16 = false;
        } else {
            z16 = true;
        }
        boolean z26 = z16 & z6;
        arqr arqrVar2 = (i & 2048) == 0 ? arqrVar : null;
        if ((i & 4096) != 0) {
            z17 = false;
        } else {
            z17 = true;
        }
        boolean z27 = z17 & z7;
        if ((i & 8192) != 0) {
            z18 = false;
        } else {
            z18 = true;
        }
        boolean z28 = z18 & z8;
        if ((i & 16384) != 0) {
            z19 = false;
        } else {
            z19 = true;
        }
        boolean z29 = z19 & z9;
        boolean z30 = (i & 32768) != 0;
        if ((i & 65536) != 0) {
            z20 = true;
        } else {
            z20 = false;
        }
        if ((i & 131072) != 0) {
            z21 = false;
        } else {
            z21 = true;
        }
        kamVar.getClass();
        tqcVar2.getClass();
        khaVar2.getClass();
        this.q = kamVar;
        this.a = z;
        this.b = tqcVar2;
        this.c = khaVar2;
        this.d = kapVar2;
        this.r = z22;
        this.e = z23;
        this.f = z24;
        this.g = z25;
        this.h = z15;
        this.i = z26;
        this.j = arqrVar2;
        this.k = z27;
        this.l = z28;
        this.m = z29;
        this.n = z30;
        this.o = z20;
        this.p = z21 & z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzz)) {
            return false;
        }
        jzz jzzVar = (jzz) obj;
        if (d.F(this.q, jzzVar.q) && this.a == jzzVar.a && this.b == jzzVar.b && d.F(this.c, jzzVar.c) && d.F(this.d, jzzVar.d) && this.r == jzzVar.r && this.e == jzzVar.e && this.f == jzzVar.f && this.g == jzzVar.g && this.h == jzzVar.h && this.i == jzzVar.i && d.F(this.j, jzzVar.j) && this.k == jzzVar.k && this.l == jzzVar.l && this.m == jzzVar.m && this.n == jzzVar.n && this.o == jzzVar.o && this.p == jzzVar.p) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((((this.q.hashCode() * 31) + a.v(this.a)) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        kap kapVar = this.d;
        int i = 0;
        if (kapVar == null) {
            hashCode = 0;
        } else {
            hashCode = kapVar.hashCode();
        }
        int v = ((((((((((((((hashCode2 * 31) + hashCode) * 31) + a.v(this.r)) * 31) + a.v(this.e)) * 31) + a.v(this.f)) * 31) + a.v(this.g)) * 31) + a.v(this.h)) * 31) + a.v(this.i)) * 31;
        arqr arqrVar = this.j;
        if (arqrVar != null) {
            i = arqrVar.hashCode();
        }
        return ((((((((((((v + i) * 31) + a.v(this.k)) * 31) + a.v(this.l)) * 31) + a.v(this.m)) * 31) + a.v(this.n)) * 31) + a.v(this.o)) * 31) + a.v(this.p);
    }

    public final String toString() {
        return "MessageBubbleArgs(messageWithMetadata=" + this.q + ", isGroupConversation=" + this.a + ", archiveStats=" + this.b + ", selectionData=" + this.c + ", searchData=" + this.d + ", canSwipeToReply=" + this.r + ", canLongPress=" + this.e + ", shouldShowSimName=" + this.f + ", shouldShowE2eeStatusChangeNotice=" + this.g + ", shouldShowSeparators=" + this.h + ", hasLastReadMarker=" + this.i + ", onReplySnippetClick=" + this.j + ", shouldCreateLazyUiData=" + this.k + ", isPenpalConversation=" + this.l + ", isScreenEffectTargetedMessageBubble=" + this.m + ", shouldShowMetatext=" + this.n + ", isInteractive=" + this.o + ", isSpatulaSettingsEnabled=" + this.p + ")";
    }
}
