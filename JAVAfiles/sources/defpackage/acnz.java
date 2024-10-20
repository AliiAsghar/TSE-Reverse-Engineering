package defpackage;

import android.content.Context;
import j$.util.DesugarCollections;
import j$.util.Map;
import j$.util.Optional;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acnz extends acny {
    public static final /* synthetic */ int e = 0;
    public final acnu b;

    public acnz(adeo adeoVar, adtn adtnVar, amnn amnnVar, anen anenVar, acnu acnuVar) {
        super(adeoVar, adtnVar, amnnVar, anenVar, acnuVar);
        this.b = acnuVar;
    }

    private static apko t(Throwable th) {
        if (th instanceof abra) {
            int a = ((abra) th).a();
            aozy createBuilder = apko.a.createBuilder();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apko apkoVar = (apko) createBuilder.b;
            apkoVar.b = 1;
            apkoVar.c = Integer.valueOf(a);
            return (apko) createBuilder.s();
        }
        aozy createBuilder2 = apko.a.createBuilder();
        String name = th.getClass().getName();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apko apkoVar2 = (apko) createBuilder2.b;
        name.getClass();
        apkoVar2.b = 2;
        apkoVar2.c = name;
        return (apko) createBuilder2.s();
    }

    public final void d(Context context, apkn apknVar, String str, adiv adivVar, apkk... apkkVarArr) {
        aozy createBuilder = apjl.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apjl apjlVar = (apjl) createBuilder.b;
        apjlVar.c = apknVar.H;
        apjlVar.b |= 1;
        List asList = Arrays.asList(apkkVarArr);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apjl apjlVar2 = (apjl) createBuilder.b;
        apao apaoVar = apjlVar2.i;
        if (!apaoVar.c()) {
            apjlVar2.i = apag.mutableCopy(apaoVar);
        }
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            apjlVar2.i.g(((apkk) it.next()).m);
        }
        z(context, p(createBuilder, adivVar), str);
    }

    public final void e(Context context, apkn apknVar, String str, adiv adivVar) {
        z(context, j(apknVar, 6, adivVar), str);
    }

    public final void f(Context context, admx admxVar, String str, adiv adivVar) {
        aozy builder = admxVar.e.toBuilder();
        if (!builder.b.isMutable()) {
            builder.u();
        }
        ((apig) builder.b).a().clear();
        if (!builder.b.isMutable()) {
            builder.u();
        }
        ((apig) builder.b).b().clear();
        Map.EL.forEach(DesugarCollections.unmodifiableMap(admxVar.e.e), new lui(builder, 9));
        apig apigVar = (apig) builder.s();
        aozy createBuilder = apjl.a.createBuilder();
        aozy createBuilder2 = apib.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar = createBuilder2.b;
        apib apibVar = (apib) apagVar;
        str.getClass();
        apibVar.b |= 2;
        apibVar.f = str;
        if (!apagVar.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar2 = createBuilder2.b;
        apib apibVar2 = (apib) apagVar2;
        apigVar.getClass();
        apibVar2.d = apigVar;
        apibVar2.c = 1;
        if (!apagVar2.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar3 = createBuilder2.b;
        apib apibVar3 = (apib) apagVar3;
        apibVar3.e = 2;
        apibVar3.b |= 1;
        int i = admxVar.g;
        if (!apagVar3.isMutable()) {
            createBuilder2.u();
        }
        apib apibVar4 = (apib) createBuilder2.b;
        int i2 = i - 1;
        if (i != 0) {
            apibVar4.h = i2;
            apibVar4.b |= 8;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apjl apjlVar = (apjl) createBuilder.b;
            apib apibVar5 = (apib) createBuilder2.s();
            apibVar5.getClass();
            apjlVar.r = apibVar5;
            apjlVar.b |= 16384;
            apkn apknVar = admxVar.a;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apjl apjlVar2 = (apjl) createBuilder.b;
            apjlVar2.c = apknVar.H;
            apjlVar2.b |= 1;
            z(context, p(createBuilder, adivVar), admxVar.c);
            return;
        }
        throw null;
    }

    public final void g(Context context, admz admzVar, adiv adivVar) {
        aozy createBuilder = apjl.a.createBuilder();
        aozy createBuilder2 = apib.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apih apihVar = admzVar.d;
        apag apagVar = createBuilder2.b;
        apib apibVar = (apib) apagVar;
        apihVar.getClass();
        apibVar.d = apihVar;
        apibVar.c = 2;
        String str = admzVar.b;
        if (!apagVar.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar2 = createBuilder2.b;
        apib apibVar2 = (apib) apagVar2;
        str.getClass();
        apibVar2.b |= 2;
        apibVar2.f = str;
        if (!apagVar2.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar3 = createBuilder2.b;
        apib apibVar3 = (apib) apagVar3;
        apibVar3.e = 2;
        apibVar3.b |= 1;
        int i = admzVar.e;
        if (!apagVar3.isMutable()) {
            createBuilder2.u();
        }
        apib apibVar4 = (apib) createBuilder2.b;
        int i2 = i - 1;
        if (i != 0) {
            apibVar4.h = i2;
            apibVar4.b |= 8;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apjl apjlVar = (apjl) createBuilder.b;
            apib apibVar5 = (apib) createBuilder2.s();
            apibVar5.getClass();
            apjlVar.r = apibVar5;
            apjlVar.b |= 16384;
            apkn apknVar = admzVar.a;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apjl apjlVar2 = (apjl) createBuilder.b;
            apjlVar2.c = apknVar.H;
            apjlVar2.b |= 1;
            z(context, p(createBuilder, adivVar), admzVar.c);
            return;
        }
        throw null;
    }

    public final void h(Context context, apkn apknVar, String str, adiv adivVar) {
        z(context, j(apknVar, 8, adivVar), str);
    }

    public final void i(Context context, apkn apknVar, String str, adiv adivVar) {
        z(context, j(apknVar, 4, adivVar), str);
    }

    public final apjl j(apkn apknVar, int i, adiv adivVar) {
        aozy createBuilder = apjl.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        apjl apjlVar = (apjl) apagVar;
        apjlVar.c = apknVar.H;
        apjlVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apjl apjlVar2 = (apjl) createBuilder.b;
        apjlVar2.d = i - 1;
        apjlVar2.b |= 2;
        amva a = this.b.a(adivVar);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apjl apjlVar3 = (apjl) createBuilder.b;
        a.getClass();
        apjlVar3.w = a;
        apjlVar3.b |= 524288;
        return (apjl) createBuilder.s();
    }

    public final void k(Context context, apkn apknVar, int i, int i2, String str, adiv adivVar) {
        aozy createBuilder = apjl.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        apjl apjlVar = (apjl) apagVar;
        apjlVar.c = apknVar.H;
        apjlVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        apjl apjlVar2 = (apjl) apagVar2;
        apjlVar2.h = i - 1;
        apjlVar2.b |= 32;
        long j = i2;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        apjl apjlVar3 = (apjl) createBuilder.b;
        apjlVar3.b |= 512;
        apjlVar3.m = j;
        z(context, p(createBuilder, adivVar), str);
    }

    public final void l(Context context, apkn apknVar, int i, String str, adiv adivVar) {
        z(context, j(apknVar, i, adivVar), str);
    }

    public final void m(Context context, apkn apknVar, int i, String str, String str2, adiv adivVar) {
        aozy createBuilder = apjl.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        apjl apjlVar = (apjl) apagVar;
        apjlVar.c = apknVar.H;
        apjlVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        apjl apjlVar2 = (apjl) apagVar2;
        apjlVar2.j = i - 1;
        apjlVar2.b |= 64;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        apjl apjlVar3 = (apjl) createBuilder.b;
        str.getClass();
        apjlVar3.b |= 128;
        apjlVar3.k = str;
        z(context, p(createBuilder, adivVar), str2);
    }

    public final void n(Context context, Supplier supplier, String str, int i, int i2, String str2) {
        Object obj;
        aozy createBuilder = apjj.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        apjj apjjVar = (apjj) apagVar;
        apjjVar.c = i - 1;
        apjjVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apjj apjjVar2 = (apjj) createBuilder.b;
        apjjVar2.b |= 2;
        apjjVar2.d = i2;
        apjj apjjVar3 = (apjj) createBuilder.s();
        aozy createBuilder2 = apjl.a.createBuilder();
        obj = supplier.get();
        apkn apknVar = (apkn) obj;
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar2 = createBuilder2.b;
        apjl apjlVar = (apjl) apagVar2;
        apjlVar.c = apknVar.H;
        apjlVar.b |= 1;
        String ag = albo.ag(str);
        if (!apagVar2.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar3 = createBuilder2.b;
        apjl apjlVar2 = (apjl) apagVar3;
        apjlVar2.b |= 8192;
        apjlVar2.q = ag;
        if (!apagVar3.isMutable()) {
            createBuilder2.u();
        }
        apjl apjlVar3 = (apjl) createBuilder2.b;
        apjjVar3.getClass();
        apjlVar3.s = apjjVar3;
        apjlVar3.b |= 32768;
        z(context, (apjl) createBuilder2.s(), str2);
    }

    public final void o(Context context, String str, String str2, String str3, String str4, int i, boolean z, Optional optional, int i2, int i3, adiv adivVar, Optional optional2, Optional optional3) {
        apke apkeVar;
        aozy createBuilder = apkf.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        apkf apkfVar = (apkf) apagVar;
        apkfVar.c = i - 1;
        apkfVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apkf apkfVar2 = (apkf) createBuilder.b;
        apkfVar2.b |= 2;
        apkfVar2.d = z;
        int intValue = ((Integer) optional2.orElse(-1)).intValue();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apkf apkfVar3 = (apkf) createBuilder.b;
        apkfVar3.b |= 8;
        apkfVar3.f = intValue;
        optional.ifPresent(new aauv(createBuilder, 19));
        if (optional3.isPresent()) {
            aozy createBuilder2 = apke.a.createBuilder();
            aozy createBuilder3 = apkh.a.createBuilder();
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            apkh apkhVar = (apkh) createBuilder3.b;
            apkf apkfVar4 = (apkf) createBuilder.s();
            apkfVar4.getClass();
            apkhVar.c = apkfVar4;
            apkhVar.b = 2;
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            apke apkeVar2 = (apke) createBuilder2.b;
            apkh apkhVar2 = (apkh) createBuilder3.s();
            apkhVar2.getClass();
            apkeVar2.d = apkhVar2;
            apkeVar2.c = 2;
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            apag apagVar2 = createBuilder2.b;
            apke apkeVar3 = (apke) apagVar2;
            str2.getClass();
            apkeVar3.b |= 1;
            apkeVar3.e = str2;
            if (!apagVar2.isMutable()) {
                createBuilder2.u();
            }
            apag apagVar3 = createBuilder2.b;
            apke apkeVar4 = (apke) apagVar3;
            str3.getClass();
            apkeVar4.b |= 2;
            apkeVar4.f = str3;
            if (!apagVar3.isMutable()) {
                createBuilder2.u();
            }
            apag apagVar4 = createBuilder2.b;
            apke apkeVar5 = (apke) apagVar4;
            str4.getClass();
            apkeVar5.b |= 4;
            apkeVar5.g = str4;
            if (!apagVar4.isMutable()) {
                createBuilder2.u();
            }
            apag apagVar5 = createBuilder2.b;
            apke apkeVar6 = (apke) apagVar5;
            apkeVar6.b |= 8;
            apkeVar6.h = i2;
            if (!apagVar5.isMutable()) {
                createBuilder2.u();
            }
            apke apkeVar7 = (apke) createBuilder2.b;
            apkeVar7.b |= 16;
            apkeVar7.i = i3;
            Object obj = optional3.get();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            apke apkeVar8 = (apke) createBuilder2.b;
            apkeVar8.j = ((anhz) obj).a();
            apkeVar8.b |= 32;
            apkeVar = (apke) createBuilder2.s();
        } else {
            aozy createBuilder4 = apke.a.createBuilder();
            aozy createBuilder5 = apkh.a.createBuilder();
            if (!createBuilder5.b.isMutable()) {
                createBuilder5.u();
            }
            apkh apkhVar3 = (apkh) createBuilder5.b;
            apkf apkfVar5 = (apkf) createBuilder.s();
            apkfVar5.getClass();
            apkhVar3.c = apkfVar5;
            apkhVar3.b = 2;
            if (!createBuilder4.b.isMutable()) {
                createBuilder4.u();
            }
            apke apkeVar9 = (apke) createBuilder4.b;
            apkh apkhVar4 = (apkh) createBuilder5.s();
            apkhVar4.getClass();
            apkeVar9.d = apkhVar4;
            apkeVar9.c = 2;
            if (!createBuilder4.b.isMutable()) {
                createBuilder4.u();
            }
            apag apagVar6 = createBuilder4.b;
            apke apkeVar10 = (apke) apagVar6;
            str2.getClass();
            apkeVar10.b |= 1;
            apkeVar10.e = str2;
            if (!apagVar6.isMutable()) {
                createBuilder4.u();
            }
            apag apagVar7 = createBuilder4.b;
            apke apkeVar11 = (apke) apagVar7;
            str3.getClass();
            apkeVar11.b |= 2;
            apkeVar11.f = str3;
            if (!apagVar7.isMutable()) {
                createBuilder4.u();
            }
            apag apagVar8 = createBuilder4.b;
            apke apkeVar12 = (apke) apagVar8;
            str4.getClass();
            apkeVar12.b |= 4;
            apkeVar12.g = str4;
            if (!apagVar8.isMutable()) {
                createBuilder4.u();
            }
            apag apagVar9 = createBuilder4.b;
            apke apkeVar13 = (apke) apagVar9;
            apkeVar13.b |= 8;
            apkeVar13.h = i2;
            if (!apagVar9.isMutable()) {
                createBuilder4.u();
            }
            apke apkeVar14 = (apke) createBuilder4.b;
            apkeVar14.b |= 16;
            apkeVar14.i = i3;
            apkeVar = (apke) createBuilder4.s();
        }
        aozy createBuilder6 = apjl.a.createBuilder();
        if (!createBuilder6.b.isMutable()) {
            createBuilder6.u();
        }
        apjl apjlVar = (apjl) createBuilder6.b;
        apkeVar.getClass();
        apjlVar.v = apkeVar;
        apjlVar.b |= 262144;
        z(context, p(createBuilder6, adivVar), str);
    }

    public final apjl p(aozy aozyVar, adiv adivVar) {
        amva a = this.b.a(adivVar);
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        apjl apjlVar = (apjl) aozyVar.b;
        apjl apjlVar2 = apjl.a;
        a.getClass();
        apjlVar.w = a;
        apjlVar.b |= 524288;
        return (apjl) aozyVar.s();
    }

    public final void q(Context context, String str, int i, wfo wfoVar, boolean z, boolean z2, Throwable th) {
        int i2;
        aozy createBuilder = apji.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        apji apjiVar = (apji) apagVar;
        int i3 = 3;
        apjiVar.g = 3;
        apjiVar.b |= 32;
        if (true != z2) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        apji apjiVar2 = (apji) apagVar2;
        apjiVar2.c = i2 - 1;
        apjiVar2.b |= 1;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        apji apjiVar3 = (apji) createBuilder.b;
        apjiVar3.b |= 2;
        apjiVar3.d = i;
        if (true == wfoVar.equals(wfo.GOOGLE_TOS_CONSENTED)) {
            i3 = 2;
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar3 = createBuilder.b;
        apji apjiVar4 = (apji) apagVar3;
        apjiVar4.e = i3 - 1;
        apjiVar4.b |= 4;
        if (!apagVar3.isMutable()) {
            createBuilder.u();
        }
        apji apjiVar5 = (apji) createBuilder.b;
        apjiVar5.b |= 16;
        apjiVar5.f = z;
        if (th != null) {
            apko t = t(th);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apji apjiVar6 = (apji) createBuilder.b;
            t.getClass();
            apjiVar6.h = t;
            apjiVar6.b |= 64;
        }
        aozy createBuilder2 = apjl.a.createBuilder();
        apji apjiVar7 = (apji) createBuilder.s();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apjl apjlVar = (apjl) createBuilder2.b;
        apjiVar7.getClass();
        apjlVar.u = apjiVar7;
        apjlVar.b |= 131072;
        z(context, (apjl) createBuilder2.s(), str);
    }

    public final void r(Context context, int i, String str, adiv adivVar) {
        aozy createBuilder = apjl.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        apjl apjlVar = (apjl) apagVar;
        apjlVar.g = i - 1;
        apjlVar.b |= 16;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apjl apjlVar2 = (apjl) createBuilder.b;
        apjlVar2.f = 1;
        apjlVar2.b |= 8;
        z(context, p(createBuilder, adivVar), str);
    }

    public final void s(Context context, String str, int i, wfo wfoVar, whk whkVar, apkl apklVar, boolean z, boolean z2, boolean z3, Throwable th, boolean z4) {
        int i2;
        aozy createBuilder = apjk.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        apjk apjkVar = (apjk) apagVar;
        apjkVar.h = 3;
        apjkVar.b |= 512;
        if (true != z3) {
            i2 = 4;
        } else {
            i2 = 3;
        }
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        apjk apjkVar2 = (apjk) apagVar2;
        apjkVar2.c = i2 - 1;
        apjkVar2.b |= 1;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        apjk apjkVar3 = (apjk) createBuilder.b;
        int i3 = 2;
        apjkVar3.b |= 2;
        apjkVar3.d = i;
        if (true != wfoVar.equals(wfo.GOOGLE_TOS_CONSENTED)) {
            i3 = 3;
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar3 = createBuilder.b;
        apjk apjkVar4 = (apjk) apagVar3;
        apjkVar4.e = i3 - 1;
        apjkVar4.b |= 32;
        if (!apagVar3.isMutable()) {
            createBuilder.u();
        }
        apag apagVar4 = createBuilder.b;
        apjk apjkVar5 = (apjk) apagVar4;
        apjkVar5.g = apklVar.f;
        apjkVar5.b |= 256;
        if (!apagVar4.isMutable()) {
            createBuilder.u();
        }
        apag apagVar5 = createBuilder.b;
        apjk apjkVar6 = (apjk) apagVar5;
        apjkVar6.b |= 128;
        apjkVar6.f = z2;
        if (!apagVar5.isMutable()) {
            createBuilder.u();
        }
        apjk apjkVar7 = (apjk) createBuilder.b;
        apjkVar7.b |= 2048;
        apjkVar7.j = z;
        if (apklVar.equals(apkl.LEGAL_FYI_SEEN) && whkVar.equals(whk.LEGAL_FYI_SEEN)) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apjk apjkVar8 = (apjk) createBuilder.b;
            apjkVar8.e = 1;
            apjkVar8.b |= 32;
        }
        if (aczv.J() && z4) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apjk apjkVar9 = (apjk) createBuilder.b;
            apjkVar9.e = 3;
            apjkVar9.b |= 32;
        }
        if (th != null) {
            apko t = t(th);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apjk apjkVar10 = (apjk) createBuilder.b;
            t.getClass();
            apjkVar10.i = t;
            apjkVar10.b |= 1024;
        }
        aozy createBuilder2 = apjl.a.createBuilder();
        apjk apjkVar11 = (apjk) createBuilder.s();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apjl apjlVar = (apjl) createBuilder2.b;
        apjkVar11.getClass();
        apjlVar.t = apjkVar11;
        apjlVar.b |= 65536;
        z(context, (apjl) createBuilder2.s(), str);
    }
}
