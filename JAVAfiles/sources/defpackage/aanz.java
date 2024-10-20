package defpackage;

import androidx.compose.foundation.layout.AspectRatioElement;
import defpackage.cfq;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aanz extends arrp implements arqv {
    final /* synthetic */ boolean a;
    final /* synthetic */ int b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    final /* synthetic */ Object f;
    final /* synthetic */ Object g;
    private final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aanz(aaoc aaocVar, cga cgaVar, boolean z, String str, String str2, arqg arqgVar, int i, int i2) {
        super(2);
        this.h = i2;
        this.c = aaocVar;
        this.d = cgaVar;
        this.a = z;
        this.e = str;
        this.f = str2;
        this.g = arqgVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.Object, cga] */
    /* JADX WARN: Type inference failed for: r15v12, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object, cga] */
    /* JADX WARN: Type inference failed for: r15v9, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, yg] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, cga] */
    /* JADX WARN: Type inference failed for: r4v5, types: [ajr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r5v1, types: [wh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, cfq$c] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, arqw] */
    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        cga a;
        boolean booleanValue;
        boolean z;
        int i = this.h;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    bwj bwjVar = (bwj) obj;
                    ((Number) obj2).intValue();
                    int i2 = this.b;
                    ?? r8 = this.g;
                    ?? r7 = this.c;
                    ?? r6 = this.e;
                    aetn.aa(this.f, this.d, this.a, r6, r7, r8, bwjVar, bzh.a(i2 | 1));
                    return arnb.a;
                }
                bwj bwjVar2 = (bwj) obj;
                if ((((Number) obj2).intValue() & 11) != 2 || !bwjVar2.L()) {
                    a = this.f.a(new AspectRatioElement());
                    cga a2 = dea.a(a, "LottieAnimation");
                    if (this.e != null) {
                        booleanValue = ((Boolean) this.d.a()).booleanValue();
                    } else {
                        booleanValue = this.a;
                    }
                    if (booleanValue && !arsd.O(((aerk) this.g).a, "unit_test")) {
                        z = true;
                    } else {
                        z = false;
                    }
                    gvf.am((hbb) this.c.a(), a2, z, false, (hdv) this.e, brg.a, this.b, 0, null, bwjVar2, 8, 0, 262048);
                } else {
                    bwjVar2.v();
                }
                return arnb.a;
            }
            bwj bwjVar3 = (bwj) obj;
            ((Number) obj2).intValue();
            int i3 = this.b;
            ?? r5 = this.d;
            boolean z2 = this.a;
            Object obj3 = this.e;
            aabr.M(this.c, this.g, (zzl) this.f, (zzu) obj3, z2, r5, bwjVar3, bzh.a(i3 | 1));
            return arnb.a;
        }
        bwj bwjVar4 = (bwj) obj;
        ((Number) obj2).intValue();
        Object obj4 = this.c;
        ?? r15 = this.d;
        boolean z3 = this.a;
        Object obj5 = this.e;
        String str = (String) obj5;
        aaoc.d((aaoc) obj4, r15, z3, str, (String) this.f, this.g, bwjVar4, bzh.a(this.b | 1));
        return arnb.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aanz(cga cgaVar, ajr ajrVar, boolean z, arqg arqgVar, cfq.c cVar, arqw arqwVar, int i, int i2) {
        super(2);
        this.h = i2;
        this.f = cgaVar;
        this.d = ajrVar;
        this.a = z;
        this.e = arqgVar;
        this.c = cVar;
        this.g = arqwVar;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aanz(cga cgaVar, hdv hdvVar, boolean z, aerk aerkVar, byn bynVar, int i, byn bynVar2, int i2) {
        super(2);
        this.h = i2;
        this.f = cgaVar;
        this.e = hdvVar;
        this.a = z;
        this.g = aerkVar;
        this.c = bynVar;
        this.b = i;
        this.d = bynVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aanz(yg ygVar, List list, zzl zzlVar, zzu zzuVar, boolean z, wh whVar, int i, int i2) {
        super(2);
        this.h = i2;
        this.c = ygVar;
        this.g = list;
        this.f = zzlVar;
        this.e = zzuVar;
        this.a = z;
        this.d = whVar;
        this.b = i;
    }
}
