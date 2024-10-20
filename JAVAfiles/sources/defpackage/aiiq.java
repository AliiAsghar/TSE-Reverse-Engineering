package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiiq implements aiio {
    private final Context a;
    private final acoc b;

    public aiiq(Context context, acoc acocVar) {
        this.a = context;
        this.b = acocVar;
    }

    private static int a(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return 3;
        }
        if (i2 == 2) {
            return 2;
        }
        if (i2 != 3) {
            return 1;
        }
        return 4;
    }

    private static apfo b(aijb aijbVar, aiiu aiiuVar, int i) {
        return c(aijbVar, aiiuVar, i, 0);
    }

    private static apfo c(aijb aijbVar, aiiu aiiuVar, int i, int i2) {
        aozy f = f(aijbVar);
        d(f, aiiuVar);
        int i3 = aiiuVar.q;
        if (!f.b.isMutable()) {
            f.u();
        }
        apfo apfoVar = (apfo) f.b;
        apfo apfoVar2 = apfo.a;
        int i4 = i3 - 1;
        if (i3 != 0) {
            apfoVar.c = i4;
            apfoVar.b |= 1;
            if (!f.b.isMutable()) {
                f.u();
            }
            apag apagVar = f.b;
            apfo apfoVar3 = (apfo) apagVar;
            apfoVar3.d = 1;
            apfoVar3.b |= 2;
            if (!apagVar.isMutable()) {
                f.u();
            }
            apag apagVar2 = f.b;
            apfo apfoVar4 = (apfo) apagVar2;
            apfoVar4.n = i - 1;
            apfoVar4.b |= 1024;
            String str = aijbVar.c;
            if (!apagVar2.isMutable()) {
                f.u();
            }
            apag apagVar3 = f.b;
            apfo apfoVar5 = (apfo) apagVar3;
            str.getClass();
            apfoVar5.b |= 2048;
            apfoVar5.o = str;
            if (aiiuVar.p == 3) {
                int i5 = aiiuVar.n;
                if (!apagVar3.isMutable()) {
                    f.u();
                }
                apfo apfoVar6 = (apfo) f.b;
                apfoVar6.b |= 8;
                apfoVar6.f = i5;
            }
            if (i2 != 0) {
                if (!f.b.isMutable()) {
                    f.u();
                }
                apfo apfoVar7 = (apfo) f.b;
                apfoVar7.p = i2 - 1;
                apfoVar7.b |= 4096;
            }
            return (apfo) f.s();
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(defpackage.aozy r7, defpackage.aiiu r8) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiiq.d(aozy, aiiu):void");
    }

    private static void e(aozy aozyVar, aiix aiixVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        apfo apfoVar = (apfo) aozyVar.b;
        apfo apfoVar2 = apfo.a;
        apfoVar.d = 2;
        apfoVar.b = 2 | apfoVar.b;
        int i = aiixVar.a;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        apfo apfoVar3 = (apfo) aozyVar.b;
        apfoVar3.b |= 8;
        apfoVar3.f = i;
    }

    private static aozy f(aijb aijbVar) {
        aozy createBuilder = apfo.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        String str = aijbVar.a;
        apag apagVar = createBuilder.b;
        apfo apfoVar = (apfo) apagVar;
        str.getClass();
        apfoVar.b |= 32;
        apfoVar.h = str;
        apfs apfsVar = aijbVar.e;
        if (apfsVar != null) {
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            apfo apfoVar2 = (apfo) createBuilder.b;
            apfoVar2.g = apfsVar;
            apfoVar2.b |= 16;
        }
        return createBuilder;
    }

    @Override // defpackage.aiio
    public final void be(aijb aijbVar, aiiu aiiuVar) {
        this.b.f(this.a, b(aijbVar, aiiuVar, 2));
    }

    @Override // defpackage.aiio
    public final void bf(aijb aijbVar, aiiu aiiuVar) {
        this.b.f(this.a, b(aijbVar, aiiuVar, 2));
    }

    @Override // defpackage.aiio
    public final void bg(aijb aijbVar, aiiu aiiuVar) {
        this.b.f(this.a, b(aijbVar, aiiuVar, 3));
    }

    @Override // defpackage.aiio
    public final /* synthetic */ void bh(aijb aijbVar, aiiu aiiuVar, aiix aiixVar) {
        bk(aijbVar, aiiuVar, 3);
    }

    @Override // defpackage.aiio
    public final void bi(aijb aijbVar, aiix aiixVar, aiiu aiiuVar) {
        aozy f = f(aijbVar);
        d(f, aiiuVar);
        e(f, aiixVar);
        if (!f.b.isMutable()) {
            f.u();
        }
        apfo apfoVar = (apfo) f.b;
        apfo apfoVar2 = apfo.a;
        apfoVar.c = 1;
        apfoVar.b |= 1;
        if (!f.b.isMutable()) {
            f.u();
        }
        apfo apfoVar3 = (apfo) f.b;
        apfoVar3.n = 1;
        apfoVar3.b |= 1024;
        if (aiiuVar != null) {
            long longValue = agkx.W().longValue() - aiiuVar.o;
            if (!f.b.isMutable()) {
                f.u();
            }
            apfo apfoVar4 = (apfo) f.b;
            apfoVar4.b |= 512;
            apfoVar4.l = (int) longValue;
        }
        this.b.f(this.a, (apfo) f.s());
    }

    @Override // defpackage.aiio
    public final void bj(aijb aijbVar, aiix aiixVar, aiiw aiiwVar) {
        aozy f = f(aijbVar);
        e(f, aiixVar);
        if (!f.b.isMutable()) {
            f.u();
        }
        apfo apfoVar = (apfo) f.b;
        apfo apfoVar2 = apfo.a;
        apfoVar.c = 0;
        apfoVar.b |= 1;
        int i = aiiwVar.a;
        if (!f.b.isMutable()) {
            f.u();
        }
        apag apagVar = f.b;
        apfo apfoVar3 = (apfo) apagVar;
        apfoVar3.e = i - 1;
        apfoVar3.b |= 4;
        if (!apagVar.isMutable()) {
            f.u();
        }
        apfo apfoVar4 = (apfo) f.b;
        apfoVar4.n = 1;
        apfoVar4.b |= 1024;
        String str = aiiwVar.d;
        String e = aiiwVar.e(assi.a);
        if (!f.b.isMutable()) {
            f.u();
        }
        apag apagVar2 = f.b;
        apfo apfoVar5 = (apfo) apagVar2;
        str.getClass();
        apfoVar5.b |= 64;
        apfoVar5.i = str;
        if (e != null) {
            if (!apagVar2.isMutable()) {
                f.u();
            }
            apfo apfoVar6 = (apfo) f.b;
            apfoVar6.b |= 128;
            apfoVar6.j = e;
        }
        this.b.f(this.a, (apfo) f.s());
    }

    @Override // defpackage.aiio
    public final void bk(aijb aijbVar, aiiu aiiuVar, int i) {
        if (aiiuVar != null) {
            this.b.f(this.a, c(aijbVar, aiiuVar, 4, a(i)));
            return;
        }
        aozy f = f(aijbVar);
        acoc acocVar = this.b;
        Context context = this.a;
        if (!f.b.isMutable()) {
            f.u();
        }
        apfo apfoVar = (apfo) f.b;
        apfo apfoVar2 = apfo.a;
        apfoVar.n = 3;
        apfoVar.b |= 1024;
        int a = a(i);
        if (!f.b.isMutable()) {
            f.u();
        }
        apfo apfoVar3 = (apfo) f.b;
        apfoVar3.p = a - 1;
        apfoVar3.b |= 4096;
        acocVar.f(context, (apfo) f.s());
    }

    @Override // defpackage.aiio
    public final /* synthetic */ void aN() {
    }

    @Override // defpackage.aiio
    public final /* synthetic */ void aM(aiiu aiiuVar) {
    }

    @Override // defpackage.aiio
    public final /* synthetic */ void bm(aiiw aiiwVar) {
    }
}
