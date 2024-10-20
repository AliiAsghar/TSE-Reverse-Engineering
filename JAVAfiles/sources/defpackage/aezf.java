package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aezf implements aeip, aetv {
    public final String a;
    public final List b;
    public final aeze c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final arqg i;
    public final boolean j;
    public final List k;
    public final arqg l;
    public final boolean m;
    public final apdv n;
    public final boolean o;
    public final aexx p;
    public final aevr q;
    public final boolean r;
    private final arqg s;
    private final aezj t;
    private final aeio u;

    public aezf(String str, List list, aeze aezeVar, boolean z, boolean z2, String str2, boolean z3, boolean z4, arqg arqgVar, arqg arqgVar2, boolean z5, List list2, aezj aezjVar, arqg arqgVar3, boolean z6, apdv apdvVar, boolean z7, aexx aexxVar, boolean z8, aeio aeioVar) {
        str.getClass();
        list.getClass();
        arqgVar.getClass();
        arqgVar2.getClass();
        aezjVar.getClass();
        arqgVar3.getClass();
        aeioVar.getClass();
        this.a = str;
        this.b = list;
        this.c = aezeVar;
        this.d = z;
        this.e = z2;
        this.f = str2;
        this.g = z3;
        this.h = z4;
        this.s = arqgVar;
        this.i = arqgVar2;
        this.j = z5;
        this.k = list2;
        this.t = aezjVar;
        this.l = arqgVar3;
        this.m = z6;
        this.n = apdvVar;
        this.o = z7;
        this.p = aexxVar;
        this.q = null;
        this.r = z8;
        this.u = aeioVar;
    }

    public static /* synthetic */ aezf h(aezf aezfVar, String str, List list, aeze aezeVar, arqg arqgVar, apdv apdvVar, boolean z, int i) {
        String str2;
        List list2;
        aeze aezeVar2;
        boolean z2;
        boolean z3;
        String str3;
        boolean z4;
        boolean z5;
        arqg arqgVar2;
        arqg arqgVar3;
        boolean z6;
        List list3;
        aezj aezjVar;
        arqg arqgVar4;
        boolean z7;
        apdv apdvVar2;
        boolean z8;
        if ((i & 1) != 0) {
            str2 = aezfVar.a;
        } else {
            str2 = str;
        }
        if ((i & 2) != 0) {
            list2 = aezfVar.b;
        } else {
            list2 = list;
        }
        if ((i & 4) != 0) {
            aezeVar2 = aezfVar.c;
        } else {
            aezeVar2 = aezeVar;
        }
        if ((i & 8) != 0) {
            z2 = aezfVar.d;
        } else {
            z2 = false;
        }
        if ((i & 16) != 0) {
            z3 = aezfVar.e;
        } else {
            z3 = false;
        }
        if ((i & 32) != 0) {
            str3 = aezfVar.f;
        } else {
            str3 = null;
        }
        if ((i & 64) != 0) {
            z4 = aezfVar.g;
        } else {
            z4 = false;
        }
        if ((i & 128) != 0) {
            z5 = aezfVar.h;
        } else {
            z5 = false;
        }
        if ((i & 256) != 0) {
            arqgVar2 = aezfVar.s;
        } else {
            arqgVar2 = null;
        }
        if ((i & 512) != 0) {
            arqgVar3 = aezfVar.i;
        } else {
            arqgVar3 = arqgVar;
        }
        if ((i & 1024) != 0) {
            z6 = aezfVar.j;
        } else {
            z6 = false;
        }
        if ((i & 2048) != 0) {
            list3 = aezfVar.k;
        } else {
            list3 = null;
        }
        if ((i & 4096) != 0) {
            aezjVar = aezfVar.t;
        } else {
            aezjVar = null;
        }
        if ((i & 8192) != 0) {
            arqgVar4 = aezfVar.l;
        } else {
            arqgVar4 = null;
        }
        if ((i & 16384) != 0) {
            z7 = aezfVar.m;
        } else {
            z7 = false;
        }
        if ((32768 & i) != 0) {
            apdvVar2 = aezfVar.n;
        } else {
            apdvVar2 = apdvVar;
        }
        if ((i & 65536) != 0) {
            z8 = aezfVar.o;
        } else {
            z8 = z;
        }
        aexx aexxVar = aezfVar.p;
        aevr aevrVar = aezfVar.q;
        boolean z9 = aezfVar.r;
        aeio aeioVar = aezfVar.u;
        str2.getClass();
        list2.getClass();
        arqgVar2.getClass();
        arqgVar3.getClass();
        aezjVar.getClass();
        arqgVar4.getClass();
        return new aezf(str2, list2, aezeVar2, z2, z3, str3, z4, z5, arqgVar2, arqgVar3, z6, list3, aezjVar, arqgVar4, z7, apdvVar2, z8, aexxVar, z9, aeioVar);
    }

    @Override // defpackage.aeip
    public final String a() {
        return this.f;
    }

    @Override // defpackage.aetv
    public final arqg b() {
        return this.s;
    }

    @Override // defpackage.aetv
    public final arqg c() {
        throw null;
    }

    @Override // defpackage.aetv
    public final boolean d() {
        throw null;
    }

    @Override // defpackage.aeip
    public final aeio e() {
        return this.u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aezf)) {
            return false;
        }
        aezf aezfVar = (aezf) obj;
        if (!d.F(this.a, aezfVar.a) || !d.F(this.b, aezfVar.b) || !d.F(this.c, aezfVar.c) || this.d != aezfVar.d || this.e != aezfVar.e || !d.F(this.f, aezfVar.f) || this.g != aezfVar.g || this.h != aezfVar.h || !d.F(this.s, aezfVar.s) || !d.F(this.i, aezfVar.i) || this.j != aezfVar.j || !d.F(this.k, aezfVar.k) || !d.F(this.t, aezfVar.t) || !d.F(this.l, aezfVar.l) || this.m != aezfVar.m || !d.F(this.n, aezfVar.n) || this.o != aezfVar.o || !d.F(this.p, aezfVar.p)) {
            return false;
        }
        aevr aevrVar = aezfVar.q;
        if (d.F(null, null) && this.r == aezfVar.r && d.F(this.u, aezfVar.u)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.aeip
    public final String f() {
        return this.a;
    }

    @Override // defpackage.aeip
    public final List g() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = (this.a.hashCode() * 31) + this.b.hashCode();
        aeze aezeVar = this.c;
        int i = 0;
        if (aezeVar == null) {
            hashCode = 0;
        } else {
            hashCode = aezeVar.hashCode();
        }
        int v = ((((((hashCode5 * 31) + hashCode) * 31) + a.v(this.d)) * 31) + a.v(this.e)) * 31;
        String str = this.f;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int v2 = (((((((((((v + hashCode2) * 31) + a.v(this.g)) * 31) + a.v(this.h)) * 31) + this.s.hashCode()) * 31) + this.i.hashCode()) * 31) + a.v(this.j)) * 31;
        List list = this.k;
        if (list == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list.hashCode();
        }
        int hashCode6 = (((((((v2 + hashCode3) * 31) + 1228341) * 31) + this.l.hashCode()) * 31) + a.v(this.m)) * 31;
        apdv apdvVar = this.n;
        if (apdvVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = apdvVar.hashCode();
        }
        int v3 = (((hashCode6 + hashCode4) * 31) + a.v(this.o)) * 31;
        aexx aexxVar = this.p;
        if (aexxVar != null) {
            i = aexxVar.hashCode();
        }
        return ((((v3 + i) * 961) + a.v(this.r)) * 31) + this.u.hashCode();
    }

    public final String toString() {
        return "TextBubbleUiData(text=" + this.a + ", annotations=" + this.b + ", preview=" + this.c + ", isRichType=" + this.d + ", useLargeFontSize=" + this.e + ", contentDescription=" + this.f + ", isHighlighted=" + this.g + ", isOutgoing=" + this.h + ", onClick=" + this.s + ", onLayout=" + this.i + ", isEmojiOnly=" + this.j + ", emojiAnimationFiles=" + this.k + ", flags=" + this.t + ", onAnimatedEmojiShown=" + this.l + ", isReply=" + this.m + ", effect=" + this.n + ", isCaption=" + this.o + ", messageReplySnippetUiData=" + this.p + ", statusUiData=null, isSensitiveContent=" + this.r + ", annotationFlags=" + this.u + ")";
    }

    public /* synthetic */ aezf(String str, List list, boolean z, boolean z2, String str2, boolean z3, boolean z4, arqg arqgVar, boolean z5, List list2, aezj aezjVar, arqg arqgVar2, boolean z6, boolean z7, aexx aexxVar, boolean z8, aeio aeioVar, int i) {
        this(str, (i & 2) != 0 ? arnv.a : list, null, ((i & 8) == 0) & z, ((i & 16) == 0) & z2, str2, ((i & 64) == 0) & z3, ((i & 128) == 0) & z4, (i & 256) != 0 ? aewh.p : null, (i & 512) != 0 ? aewh.q : arqgVar, ((i & 1024) == 0) & z5, (i & 2048) != 0 ? null : list2, (i & 4096) != 0 ? new aezj((char[]) null) : aezjVar, (i & 8192) != 0 ? aewh.r : arqgVar2, ((i & 16384) == 0) & z6, null, ((65536 & i) == 0) & z7, (131072 & i) != 0 ? null : aexxVar, ((524288 & i) == 0) & z8, (i & 1048576) != 0 ? new aeio((byte[]) null) : aeioVar);
    }
}
