package defpackage;

import com.android.vcard.VCardConfig;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeul implements aetq {
    public final int A;
    public final int B;
    private final aeve C;
    public final String a;
    public final List b;
    public final List c;
    public final arqg d;
    public final aeuh e;
    public final boolean f;
    public final boolean g;
    public final aevm h;
    public final aeva i;
    public final aeva j;
    public final aevq k;
    public final aelg l;
    public final aexx m;
    public final boolean n;
    public final arqg o;
    public final arqg p;
    public final arqv q;
    public final arqr r;
    public final String s;
    public final arqg t;
    public final boolean u;
    public final boolean v;
    public final apdv w;
    public final arqg x;
    public final aeuk y;
    public final aevr z;

    public aeul(String str, List list, List list2, arqg arqgVar, int i, aeuh aeuhVar, boolean z, boolean z2, int i2, aevm aevmVar, aeve aeveVar, aeva aevaVar, aeva aevaVar2, aevq aevqVar, aelg aelgVar, aexx aexxVar, boolean z3, arqg arqgVar2, arqg arqgVar3, arqv arqvVar, arqr arqrVar, String str2, boolean z4, boolean z5, apdv apdvVar, arqg arqgVar4, aeuk aeukVar) {
        str.getClass();
        list.getClass();
        list2.getClass();
        arqgVar.getClass();
        aeuhVar.getClass();
        if (i2 == 0) {
            throw null;
        }
        arqgVar2.getClass();
        arqgVar3.getClass();
        arqvVar.getClass();
        aeukVar.getClass();
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = arqgVar;
        this.A = i;
        this.e = aeuhVar;
        this.f = z;
        this.g = z2;
        this.B = i2;
        this.h = aevmVar;
        this.C = aeveVar;
        this.i = aevaVar;
        this.j = aevaVar2;
        this.k = aevqVar;
        this.l = aelgVar;
        this.m = aexxVar;
        this.n = z3;
        this.o = arqgVar2;
        this.p = arqgVar3;
        this.q = arqvVar;
        this.r = arqrVar;
        this.s = str2;
        this.t = null;
        this.u = z4;
        this.v = z5;
        this.w = apdvVar;
        this.x = arqgVar4;
        this.y = aeukVar;
        this.z = null;
    }

    @Override // defpackage.aetq
    public final String b() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeul)) {
            return false;
        }
        aeul aeulVar = (aeul) obj;
        if (!d.F(this.a, aeulVar.a) || !d.F(this.b, aeulVar.b) || !d.F(this.c, aeulVar.c) || !d.F(this.d, aeulVar.d) || this.A != aeulVar.A || this.e != aeulVar.e || this.f != aeulVar.f || this.g != aeulVar.g || this.B != aeulVar.B || !d.F(this.h, aeulVar.h) || !d.F(this.C, aeulVar.C) || !d.F(this.i, aeulVar.i) || !d.F(this.j, aeulVar.j) || !d.F(this.k, aeulVar.k) || !d.F(this.l, aeulVar.l) || !d.F(this.m, aeulVar.m) || this.n != aeulVar.n || !d.F(this.o, aeulVar.o) || !d.F(this.p, aeulVar.p) || !d.F(this.q, aeulVar.q) || !d.F(this.r, aeulVar.r) || !d.F(this.s, aeulVar.s)) {
            return false;
        }
        arqg arqgVar = aeulVar.t;
        if (!d.F(null, null) || this.u != aeulVar.u || this.v != aeulVar.v || !d.F(this.w, aeulVar.w) || !d.F(this.x, aeulVar.x) || !d.F(this.y, aeulVar.y)) {
            return false;
        }
        aevr aevrVar = aeulVar.z;
        if (d.F(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10 = (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + 1) * 31) + this.d.hashCode();
        int i = this.A;
        a.bm(i);
        int hashCode11 = (((hashCode10 * 31) + i) * 31) + this.e.hashCode();
        int i2 = this.B;
        a.bm(i2);
        if (this.h == null) {
            int v = (((((hashCode11 * 31) + a.v(this.f)) * 31) + a.v(this.g)) * 31) + i2;
            aeve aeveVar = this.C;
            int i3 = 0;
            if (aeveVar == null) {
                hashCode = 0;
            } else {
                hashCode = aeveVar.hashCode();
            }
            int i4 = ((v * 961) + hashCode) * 31;
            aeva aevaVar = this.i;
            if (aevaVar == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = aevaVar.hashCode();
            }
            int i5 = (i4 + hashCode2) * 31;
            aeva aevaVar2 = this.j;
            if (aevaVar2 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = aevaVar2.hashCode();
            }
            int i6 = (i5 + hashCode3) * 31;
            aevq aevqVar = this.k;
            if (aevqVar == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = aevqVar.hashCode();
            }
            int i7 = (i6 + hashCode4) * 31;
            aelg aelgVar = this.l;
            if (aelgVar == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = aelgVar.hashCode();
            }
            int i8 = (i7 + hashCode5) * 31;
            aexx aexxVar = this.m;
            if (aexxVar == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = aexxVar.hashCode();
            }
            int v2 = (((((((((i8 + hashCode6) * 31) + a.v(this.n)) * 31) + this.o.hashCode()) * 31) + this.p.hashCode()) * 31) + this.q.hashCode()) * 31;
            arqr arqrVar = this.r;
            if (arqrVar == null) {
                hashCode7 = 0;
            } else {
                hashCode7 = arqrVar.hashCode();
            }
            int i9 = (v2 + hashCode7) * 31;
            String str = this.s;
            if (str == null) {
                hashCode8 = 0;
            } else {
                hashCode8 = str.hashCode();
            }
            int v3 = (((((i9 + hashCode8) * 961) + a.v(this.u)) * 31) + a.v(this.v)) * 31;
            apdv apdvVar = this.w;
            if (apdvVar == null) {
                hashCode9 = 0;
            } else {
                hashCode9 = apdvVar.hashCode();
            }
            int i10 = (v3 + hashCode9) * 31;
            arqg arqgVar = this.x;
            if (arqgVar != null) {
                i3 = arqgVar.hashCode();
            }
            return (((i10 + i3) * 31) + this.y.hashCode()) * 31;
        }
        throw null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("MessageBubbleUiData(id=");
        sb.append(this.a);
        sb.append(", extraIcons=");
        sb.append(this.b);
        sb.append(", extraText=");
        sb.append(this.c);
        sb.append(", getTimestamp=");
        sb.append(this.d);
        sb.append(", horizontalAlignment=");
        sb.append((Object) adcx.ct(this.A));
        sb.append(", shape=");
        sb.append(this.e);
        sb.append(", animateShape=");
        sb.append(this.f);
        sb.append(", isExpandable=");
        sb.append(this.g);
        sb.append(", widthModifier=");
        int i = this.B;
        if (i != 1) {
            if (i != 2) {
                str = "FILL_MAX_WIDTH";
            } else {
                str = "INTRINSIC_MIN";
            }
        } else {
            str = "INTRINSIC_MAX";
        }
        sb.append((Object) str);
        sb.append(", reactionsBar=");
        sb.append(this.h);
        sb.append(", progressBar=");
        sb.append(this.C);
        sb.append(", topMetatext=");
        sb.append(this.i);
        sb.append(", bottomMetatext=");
        sb.append(this.j);
        sb.append(", separators=");
        sb.append(this.k);
        sb.append(", badges=");
        sb.append(this.l);
        sb.append(", replySnippet=");
        sb.append(this.m);
        sb.append(", isError=");
        sb.append(this.n);
        sb.append(", contentOnClick=");
        sb.append(this.o);
        sb.append(", onClick=");
        sb.append(this.p);
        sb.append(", onLongClick=");
        sb.append(this.q);
        sb.append(", onDoubleTap=");
        sb.append(this.r);
        sb.append(", doubleTapLabel=");
        sb.append(this.s);
        sb.append(", onSwiped=null, allowFocusOnContentDecoratorsForAccessibility=");
        aeuk aeukVar = this.y;
        arqg arqgVar = this.x;
        apdv apdvVar = this.w;
        boolean z = this.v;
        sb.append(this.u);
        sb.append(", useGroupHorizontalPadding=");
        sb.append(z);
        sb.append(", effect=");
        sb.append(apdvVar);
        sb.append(", onEffectFinished=");
        sb.append(arqgVar);
        sb.append(", flags=");
        sb.append(aeukVar);
        sb.append(", statusUiData=null)");
        return sb.toString();
    }

    public /* synthetic */ aeul(String str, List list, int i, aeuh aeuhVar, aelg aelgVar, aeuk aeukVar, int i2) {
        this(str, (i2 & 2) != 0 ? arnv.a : list, (i2 & 4) != 0 ? arnv.a : null, (i2 & 8) != 0 ? aepz.r : null, (i2 & 16) != 0 ? 1 : i, (i2 & 32) != 0 ? aeuh.a : aeuhVar, false, (i2 & 128) != 0, (i2 & 256) != 0 ? 1 : 0, null, null, null, null, null, (i2 & 16384) != 0 ? null : aelgVar, null, false, (131072 & i2) != 0 ? aepz.s : null, (262144 & i2) != 0 ? aepz.t : null, (524288 & i2) != 0 ? aeui.a : null, null, null, (8388608 & i2) != 0, false, null, null, (i2 & VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS) != 0 ? new aeuk(false, 31) : aeukVar);
    }
}
