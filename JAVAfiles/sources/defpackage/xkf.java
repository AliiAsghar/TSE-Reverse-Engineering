package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xkf {
    private static final xze a = xze.g("Bugle", "ForwardSyncEngineImpl");
    private static final alvi b = alvi.m("com/google/android/apps/messaging/shared/telephony/forwardsync/syncengine/impl/ForwardSyncEngineImpl");
    private final armf c;
    private final armf d;
    private final armf e;
    private final armf f;
    private final armf g;
    private final armf h;
    private final armf i;
    private final armf j;
    private final armf k;
    private final xnv l;
    private final ahqr m;
    private final wzs n;
    private final armf o;
    private final armf p;
    private final armf q;

    public xkf(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, xnv xnvVar, ahqr ahqrVar, wzs wzsVar, armf armfVar10, armf armfVar11, armf armfVar12) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        armfVar7.getClass();
        armfVar8.getClass();
        armfVar9.getClass();
        xnvVar.getClass();
        ahqrVar.getClass();
        wzsVar.getClass();
        armfVar10.getClass();
        armfVar11.getClass();
        armfVar12.getClass();
        this.c = armfVar;
        this.d = armfVar2;
        this.e = armfVar3;
        this.f = armfVar4;
        this.g = armfVar5;
        this.h = armfVar6;
        this.i = armfVar7;
        this.j = armfVar8;
        this.k = armfVar9;
        this.l = xnvVar;
        this.m = ahqrVar;
        this.n = wzsVar;
        this.o = armfVar10;
        this.p = armfVar11;
        this.q = armfVar12;
    }

    private final int e(Instant instant) {
        xiu x = ((aiqj) this.c.b()).x(instant.toEpochMilli(), 9223372036854774807L);
        try {
            x.i(-1);
            int d = x.d();
            armd.i(x, null);
            return d;
        } finally {
        }
    }

    public final xkz a(Instant instant, Instant instant2) {
        instant.getClass();
        instant2.getClass();
        xiu x = ((aiqj) this.c.b()).x(instant.toEpochMilli(), instant2.toEpochMilli());
        try {
            aozy createBuilder = xkz.a.createBuilder();
            createBuilder.getClass();
            int b2 = xiu.b(x.d);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((xkz) createBuilder.b).c = b2;
            int e = x.e(x.e, x.f);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((xkz) createBuilder.b).b = e;
            apag s = createBuilder.s();
            s.getClass();
            xkz xkzVar = (xkz) s;
            armd.i(x, null);
            ((alvg) b.g().h("com/google/android/apps/messaging/shared/telephony/forwardsync/syncengine/impl/ForwardSyncEngineImpl", "getDatabaseMessageCounts", 523, "ForwardSyncEngineImpl.kt")).u("Found [%d] messages in Telephony and [%d] messages in BugleDb.", xkzVar.b, xkzVar.c);
            return xkzVar;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0338 A[Catch: all -> 0x02ef, TRY_ENTER, TRY_LEAVE, TryCatch #10 {all -> 0x02ef, blocks: (B:141:0x01dc, B:143:0x01f4, B:147:0x0338, B:194:0x0203, B:199:0x02ca, B:210:0x0296, B:211:0x0299), top: B:95:0x010a }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0404 A[Catch: all -> 0x0653, TRY_ENTER, TryCatch #34 {all -> 0x0653, blocks: (B:152:0x0348, B:156:0x0406, B:159:0x0416, B:155:0x0404), top: B:151:0x0348 }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009a A[Catch: all -> 0x00b0, TRY_ENTER, TRY_LEAVE, TryCatch #12 {all -> 0x00b0, blocks: (B:18:0x009a, B:88:0x00c3, B:90:0x00d1), top: B:16:0x0098 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x04d3 A[Catch: all -> 0x064f, TRY_LEAVE, TryCatch #33 {all -> 0x064f, blocks: (B:22:0x042d, B:30:0x0441, B:31:0x0485, B:33:0x04d3, B:43:0x0615, B:68:0x0638, B:69:0x063b, B:70:0x063c, B:72:0x044b, B:73:0x0469, B:74:0x046a, B:75:0x0474, B:76:0x047e, B:35:0x04d9, B:37:0x04e1, B:41:0x051e, B:55:0x05cf, B:56:0x05d2, B:57:0x05d3, B:59:0x05fd, B:60:0x0608, B:39:0x04f1, B:51:0x05cc, B:64:0x0635), top: B:21:0x042d, inners: #16, #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x063c A[Catch: all -> 0x064f, TRY_LEAVE, TryCatch #33 {all -> 0x064f, blocks: (B:22:0x042d, B:30:0x0441, B:31:0x0485, B:33:0x04d3, B:43:0x0615, B:68:0x0638, B:69:0x063b, B:70:0x063c, B:72:0x044b, B:73:0x0469, B:74:0x046a, B:75:0x0474, B:76:0x047e, B:35:0x04d9, B:37:0x04e1, B:41:0x051e, B:55:0x05cf, B:56:0x05d2, B:57:0x05d3, B:59:0x05fd, B:60:0x0608, B:39:0x04f1, B:51:0x05cc, B:64:0x0635), top: B:21:0x042d, inners: #16, #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x047e A[Catch: all -> 0x064f, TryCatch #33 {all -> 0x064f, blocks: (B:22:0x042d, B:30:0x0441, B:31:0x0485, B:33:0x04d3, B:43:0x0615, B:68:0x0638, B:69:0x063b, B:70:0x063c, B:72:0x044b, B:73:0x0469, B:74:0x046a, B:75:0x0474, B:76:0x047e, B:35:0x04d9, B:37:0x04e1, B:41:0x051e, B:55:0x05cf, B:56:0x05d2, B:57:0x05d3, B:59:0x05fd, B:60:0x0608, B:39:0x04f1, B:51:0x05cc, B:64:0x0635), top: B:21:0x042d, inners: #16, #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00b5 A[Catch: all -> 0x0670, TRY_ENTER, TRY_LEAVE, TryCatch #13 {all -> 0x0670, blocks: (B:14:0x0085, B:86:0x00b5, B:91:0x00d9), top: B:13:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r10v31, types: [xjb] */
    /* JADX WARN: Type inference failed for: r15v7, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v40, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v58, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [int] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v54, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v69 */
    /* JADX WARN: Type inference failed for: r7v70 */
    /* JADX WARN: Type inference failed for: r8v24, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v28, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.xmk r42, defpackage.arpe r43) {
        /*
            Method dump skipped, instructions count: 1668
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xkf.b(xmk, arpe):java.lang.Object");
    }

    public final boolean c(Instant instant, Instant instant2) {
        instant.getClass();
        instant2.getClass();
        xiu x = ((aiqj) this.c.b()).x(instant.toEpochMilli(), instant2.toEpochMilli());
        try {
            boolean k = x.k();
            armd.i(x, null);
            return k;
        } finally {
        }
    }

    public final Object d(xlb xlbVar) {
        int e;
        xkx xkxVar;
        int ca = yyb.ca(xlbVar) - 1;
        if (ca != 0) {
            if (ca != 1) {
                e = yyb.bQ(xlbVar).size();
            } else {
                if (xlbVar.c == 4) {
                    xkxVar = (xkx) xlbVar.d;
                } else {
                    xkxVar = xkx.a;
                }
                apct apctVar = xkxVar.c;
                if (apctVar == null) {
                    apctVar = apct.a;
                }
                Instant l = aotl.l(apctVar);
                l.getClass();
                e = e(l);
            }
        } else {
            Instant instant = Instant.EPOCH;
            instant.getClass();
            e = e(instant);
        }
        return new Integer(e);
    }
}
