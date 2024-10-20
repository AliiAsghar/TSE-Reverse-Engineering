package defpackage;

import defpackage.dqm;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dir {
    public static final long a = drn.c(14);
    public static final long b = drn.c(0);
    public static final long c = cku.g;
    public static final dqm d = dqm.a.a(cku.a);

    public static final long a(long j, long j2, float f) {
        if (drm.b(j) != 0 && drm.b(j2) != 0) {
            if (drm.b(j) == 0 || drm.b(j2) == 0) {
                drd.a("Cannot perform operation for Unspecified type.");
            }
            if (!a.bB(drm.c(j), drm.c(j2))) {
                drd.a("Cannot perform operation for " + ((Object) dro.a(drm.c(j))) + " and " + ((Object) dro.a(drm.c(j2))));
            }
            return drn.d(drm.b(j), drv.b(drm.a(j), drm.a(j2), f));
        }
        return ((drm) c(new drm(j), new drm(j2), f)).b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0101, code lost:
    
        if (defpackage.a.bB(r12, r24.l) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0094, code lost:
    
        if (defpackage.a.bB(r36, r24.h) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0033, code lost:
    
        if (defpackage.a.bB(r29, r24.b) != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0046, code lost:
    
        if (defpackage.a.bB(r1, r24.a.b()) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0049, code lost:
    
        r10 = r39;
        r11 = r40;
        r16 = r41;
        r12 = r1;
        r2 = r46;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.dip b(defpackage.dip r24, long r25, defpackage.cko r27, float r28, long r29, defpackage.dlx r31, defpackage.dls r32, defpackage.dlt r33, defpackage.dli r34, java.lang.String r35, long r36, defpackage.dqa r38, defpackage.dqn r39, defpackage.dpc r40, long r41, defpackage.dqj r43, defpackage.cma r44, defpackage.din r45, defpackage.cnz r46) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dir.b(dip, long, cko, float, long, dlx, dls, dlt, dli, java.lang.String, long, dqa, dqn, dpc, long, dqj, cma, din, cnz):dip");
    }

    public static final Object c(Object obj, Object obj2, float f) {
        if (f < 0.5d) {
            return obj;
        }
        return obj2;
    }
}
