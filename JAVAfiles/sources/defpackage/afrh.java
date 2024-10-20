package defpackage;

import java.util.List;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afrh {
    public final List a;
    public final List b;
    public final arqg c;
    public final arqg d;
    public final ascv e;
    public final int f;
    public final List g;
    public final int h;
    private final afrc i;
    private final arqg j;
    private final arqg k;
    private final arqg l;
    private final arqg m;
    private final arqg n;
    private final boolean o;
    private final Future p;

    public afrh() {
        this(null);
    }

    public static /* synthetic */ afrh a(afrh afrhVar, List list, int i, int i2) {
        List list2;
        boolean z;
        List list3;
        arqg arqgVar;
        arqg arqgVar2;
        arqg arqgVar3;
        arqg arqgVar4;
        arqg arqgVar5;
        arqg arqgVar6;
        arqg arqgVar7;
        ascv ascvVar;
        int i3;
        if ((i2 & 1) != 0) {
            list2 = afrhVar.a;
        } else {
            list2 = list;
        }
        if ((i2 & 2) != 0) {
            int i4 = afrhVar.h;
            z = true;
        } else {
            z = false;
        }
        if ((i2 & 4) != 0) {
            list3 = afrhVar.b;
        } else {
            list3 = null;
        }
        if ((i2 & 8) != 0) {
            afrc afrcVar = afrhVar.i;
        }
        if ((i2 & 16) != 0) {
            arqgVar = afrhVar.j;
        } else {
            arqgVar = null;
        }
        if ((i2 & 32) != 0) {
            arqgVar2 = afrhVar.k;
        } else {
            arqgVar2 = null;
        }
        if ((i2 & 64) != 0) {
            arqgVar3 = afrhVar.c;
        } else {
            arqgVar3 = null;
        }
        if ((i2 & 128) != 0) {
            arqgVar4 = afrhVar.d;
        } else {
            arqgVar4 = null;
        }
        if ((i2 & 256) != 0) {
            arqgVar5 = afrhVar.l;
        } else {
            arqgVar5 = null;
        }
        if ((i2 & 512) != 0) {
            arqgVar6 = afrhVar.m;
        } else {
            arqgVar6 = null;
        }
        if ((i2 & 1024) != 0) {
            arqgVar7 = afrhVar.n;
        } else {
            arqgVar7 = null;
        }
        if ((i2 & 2048) != 0) {
            boolean z2 = afrhVar.o;
        }
        if ((i2 & 4096) != 0) {
            ascvVar = afrhVar.e;
        } else {
            ascvVar = null;
        }
        if ((i2 & 8192) != 0) {
            Future future = afrhVar.p;
        }
        if ((i2 & 16384) != 0) {
            i3 = afrhVar.f;
        } else {
            i3 = i;
        }
        List list4 = afrhVar.g;
        list2.getClass();
        if (z) {
            list3.getClass();
            arqgVar.getClass();
            arqgVar2.getClass();
            arqgVar3.getClass();
            arqgVar4.getClass();
            arqgVar5.getClass();
            arqgVar6.getClass();
            arqgVar7.getClass();
            ascvVar.getClass();
            return new afrh(list2, list3, arqgVar, arqgVar2, arqgVar3, arqgVar4, arqgVar5, arqgVar6, arqgVar7, ascvVar, i3, list4);
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afrh)) {
            return false;
        }
        afrh afrhVar = (afrh) obj;
        if (!d.F(this.a, afrhVar.a)) {
            return false;
        }
        int i = afrhVar.h;
        if (!d.F(this.b, afrhVar.b)) {
            return false;
        }
        afrc afrcVar = afrhVar.i;
        if (!d.F(null, null) || !d.F(this.j, afrhVar.j) || !d.F(this.k, afrhVar.k) || !d.F(this.c, afrhVar.c) || !d.F(this.d, afrhVar.d) || !d.F(this.l, afrhVar.l) || !d.F(this.m, afrhVar.m) || !d.F(this.n, afrhVar.n)) {
            return false;
        }
        boolean z = afrhVar.o;
        if (!d.F(this.e, afrhVar.e)) {
            return false;
        }
        Future future = afrhVar.p;
        if (d.F(null, null) && this.f == afrhVar.f && d.F(this.g, afrhVar.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        a.bm(1);
        return ((((((((((((((((((((((this.b.hashCode() + 992) * 961) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + 1237) * 31) + this.e.hashCode()) * 961) + this.f) * 31) + 1;
    }

    public final String toString() {
        return "MagicComposeUiState(smarterReplies=" + this.a + ", magicComposeMode=SUGGESTED_TEXT, rewriteToneUiData=" + this.b + ", errorUiData=null, onRetry=" + this.j + ", onDismiss=" + this.k + ", onScreenClose=" + this.c + ", onScreenStop=" + this.d + ", thumbsUpButtonOnClickListener=" + this.l + ", thumbsDownButtonOnClickListener=" + this.m + ", infoButtonOnClickListener=" + this.n + ", feedbackAndInfoButtonsEnabled=false, onboardedState=" + this.e + ", suggestionsFuture=null, initialSelectedTabIndex=" + this.f + ", styles=" + this.g + ")";
    }

    public afrh(List list, List list2, arqg arqgVar, arqg arqgVar2, arqg arqgVar3, arqg arqgVar4, arqg arqgVar5, arqg arqgVar6, arqg arqgVar7, ascv ascvVar, int i, List list3) {
        this.a = list;
        this.h = 1;
        this.b = list2;
        this.i = null;
        this.j = arqgVar;
        this.k = arqgVar2;
        this.c = arqgVar3;
        this.d = arqgVar4;
        this.l = arqgVar5;
        this.m = arqgVar6;
        this.n = arqgVar7;
        this.o = false;
        this.e = ascvVar;
        this.p = null;
        this.f = i;
        this.g = list3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ afrh(byte[] r14) {
        /*
            r13 = this;
            arnv r2 = defpackage.arnv.a
            aezo r3 = defpackage.aezo.o
            aezo r4 = defpackage.aezo.p
            aezo r5 = defpackage.aezo.q
            aezo r6 = defpackage.aezo.r
            aezo r7 = defpackage.aezo.s
            afrg r8 = defpackage.afrg.b
            afrg r9 = defpackage.afrg.a
            afrd r14 = defpackage.afrd.a
            ascd r10 = defpackage.ascy.a(r14)
            r11 = -1
            arnv r12 = defpackage.arnv.a
            r0 = r13
            r1 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afrh.<init>(byte[]):void");
    }
}
