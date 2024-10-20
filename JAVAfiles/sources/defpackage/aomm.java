package defpackage;

import java.nio.charset.Charset;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aomm {
    public static final Charset a;
    public static final aoml b;
    private static final anau c;
    private final aonc d;

    static {
        aozy createBuilder = anau.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        anau anauVar = (anau) apagVar;
        anauVar.b |= 1;
        anauVar.c = 0L;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        anau.b((anau) createBuilder.b);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        anau.a((anau) createBuilder.b);
        c = (anau) createBuilder.s();
        a = Charset.forName("UTF-8");
        b = aoml.a().a();
    }

    public aomm(String str, String str2) {
        aozy createBuilder = aone.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        aone aoneVar = (aone) apagVar;
        str.getClass();
        aoneVar.b |= 1;
        aoneVar.c = str;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        aone aoneVar2 = (aone) createBuilder.b;
        aoneVar2.b |= 2;
        aoneVar2.d = str2;
        aozy createBuilder2 = aonc.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        aonc aoncVar = (aonc) createBuilder2.b;
        aone aoneVar3 = (aone) createBuilder.s();
        aoneVar3.getClass();
        aoncVar.c = aoneVar3;
        aoncVar.b |= 1;
        aozy createBuilder3 = aonh.a.createBuilder();
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        aonh aonhVar = (aonh) createBuilder3.b;
        aonhVar.c = 0;
        aonhVar.b |= 1;
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        aonc aoncVar2 = (aonc) createBuilder2.b;
        aonh aonhVar2 = (aonh) createBuilder3.s();
        aonhVar2.getClass();
        aoncVar2.d = aonhVar2;
        aoncVar2.b |= 2;
        this.d = (aonc) createBuilder2.s();
    }

    public static Object a(alwv alwvVar, alvz alvzVar) {
        return alwvVar.i().d(alvzVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final defpackage.aozy c(defpackage.anav r7, int r8, defpackage.aoml r9, java.lang.Object... r10) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aomm.c(anav, int, aoml, java.lang.Object[]):aozy");
    }

    public final aozy b(alwv alwvVar, int i, aoml aomlVar) {
        String str;
        Throwable th;
        aozy c2;
        ashu ashuVar;
        alxx j = alwvVar.j();
        if (j != null) {
            str = j.b;
        } else {
            Object k = alwvVar.k();
            if (k instanceof String) {
                str = (String) k;
            } else if (k != null) {
                str = k.getClass().getName();
            } else {
                str = "null";
            }
        }
        if (i == 2) {
            th = (Throwable) a(alwvVar, alvm.a);
        } else {
            th = null;
        }
        alvr e = alwvVar.e();
        Level m = alwvVar.m();
        String b2 = e.b();
        String d = e.d();
        int a2 = e.a();
        aozy createBuilder = anav.a.createBuilder();
        anau anauVar = c;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        anav anavVar = (anav) createBuilder.b;
        anauVar.getClass();
        anavVar.c = anauVar;
        anavVar.b |= 1;
        String name = Thread.currentThread().getName();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        anav anavVar2 = (anav) createBuilder.b;
        name.getClass();
        anavVar2.b |= 2;
        anavVar2.d = name;
        int intValue = m.intValue();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        anav anavVar3 = (anav) apagVar;
        anavVar3.b |= 4;
        anavVar3.e = intValue;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        anav anavVar4 = (anav) apagVar2;
        b2.getClass();
        anavVar4.b |= 8;
        anavVar4.f = b2;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        apag apagVar3 = createBuilder.b;
        anav anavVar5 = (anav) apagVar3;
        d.getClass();
        anavVar5.b |= 16;
        anavVar5.g = d;
        if (!apagVar3.isMutable()) {
            createBuilder.u();
        }
        apag apagVar4 = createBuilder.b;
        anav anavVar6 = (anav) apagVar4;
        anavVar6.b |= 32;
        anavVar6.h = a2;
        if (str != null) {
            if (!apagVar4.isMutable()) {
                createBuilder.u();
            }
            anav anavVar7 = (anav) createBuilder.b;
            anavVar7.b |= 256;
            anavVar7.i = str;
        }
        if (th != null) {
            aozy cW = albo.cW(th);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            anav anavVar8 = (anav) createBuilder.b;
            anba anbaVar = (anba) cW.s();
            anbaVar.getClass();
            anavVar8.j = anbaVar;
            anavVar8.b |= 1024;
        }
        anav anavVar9 = (anav) createBuilder.s();
        if (alwvVar.j() != null) {
            c2 = c(anavVar9, i, aomlVar, alwvVar.T());
        } else {
            c2 = c(anavVar9, i, aomlVar, new Object[0]);
        }
        if (i == 2 && aomlVar.a && (ashuVar = (ashu) a(alwvVar, aomo.b)) != null) {
            if (!c2.b.isMutable()) {
                c2.u();
            }
            aong aongVar = (aong) c2.b;
            aong aongVar2 = aong.a;
            aongVar.e = ashuVar;
            aongVar.b |= 4;
        }
        return c2;
    }
}
