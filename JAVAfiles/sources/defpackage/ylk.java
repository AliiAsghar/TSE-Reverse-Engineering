package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ylk extends yld {
    public static final xze d = xze.g("BugleRcs", "CsLibPhenotypeHelper");
    public static final alog e = alog.s("com.google.android.ims.library#com.google.android.apps.messaging", "com.google.android.ims.library#com.google.android.ims");
    private static final alhz i = alfb.a;
    public final armf f;
    public final mbl g;
    public final armf h;
    private final ylt j;
    private final AtomicReference k;
    private final wfh l;

    public ylk(armf armfVar, uub uubVar, xyt xytVar, Executor executor, ylt yltVar, wfh wfhVar, mbl mblVar, armf armfVar2) {
        super(uubVar, xytVar, executor);
        this.k = new AtomicReference();
        this.f = armfVar;
        this.j = yltVar;
        this.l = wfhVar;
        this.g = mblVar;
        this.h = armfVar2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:28|(1:30)|31|(1:33)|34|(1:36)|37|(11:42|(1:(9:45|46|(5:58|(6:63|(1:65)|66|(1:68)|69|(3:71|72|(3:74|75|76)(2:77|78)))|79|72|(0)(0))(1:48)|49|50|51|52|53|54)(9:80|(1:82)|83|(1:85)|86|(1:88)|89|(1:91)|92))|93|46|(0)(0)|49|50|51|52|53|54)|96|46|(0)(0)|49|50|51|52|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x02fd, code lost:
    
        defpackage.yld.a.m("Failed to get app version for phenotype register call, using default");
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x025e, code lost:
    
        r0 = r15.l;
        r1 = defpackage.ylk.i;
        r1.getClass();
        r2 = new defpackage.znj((defpackage.armf) r0.a, r1);
        ((defpackage.alhp) r2.a).e();
        r0 = j$.util.Optional.of(r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x028c A[Catch: all -> 0x0345, TryCatch #1 {, blocks: (B:4:0x0002, B:6:0x0010, B:7:0x0017, B:9:0x0060, B:11:0x00bc, B:13:0x00ce, B:14:0x00d1, B:16:0x00ef, B:17:0x00f2, B:19:0x0108, B:20:0x010b, B:22:0x011d, B:23:0x0120, B:25:0x013e, B:26:0x0141, B:28:0x014a, B:30:0x0158, B:31:0x015b, B:33:0x0182, B:34:0x0184, B:36:0x018c, B:37:0x018e, B:39:0x0196, B:42:0x019c, B:45:0x01a6, B:46:0x027c, B:49:0x02b9, B:51:0x02f1, B:52:0x0305, B:57:0x02fd, B:58:0x028c, B:60:0x0296, B:63:0x029e, B:65:0x02a6, B:66:0x02a8, B:68:0x02b0, B:69:0x02b2, B:72:0x0323, B:74:0x0338, B:79:0x0315, B:80:0x01aa, B:82:0x01ed, B:83:0x01f0, B:85:0x020b, B:86:0x020e, B:88:0x0223, B:89:0x0226, B:91:0x023f, B:92:0x0242, B:93:0x0257, B:95:0x025e, B:96:0x0278, B:98:0x0344, B:99:0x0064, B:101:0x0066, B:103:0x0072, B:104:0x0077, B:105:0x0075, B:107:0x0085), top: B:3:0x0002, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0338 A[Catch: all -> 0x0345, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0002, B:6:0x0010, B:7:0x0017, B:9:0x0060, B:11:0x00bc, B:13:0x00ce, B:14:0x00d1, B:16:0x00ef, B:17:0x00f2, B:19:0x0108, B:20:0x010b, B:22:0x011d, B:23:0x0120, B:25:0x013e, B:26:0x0141, B:28:0x014a, B:30:0x0158, B:31:0x015b, B:33:0x0182, B:34:0x0184, B:36:0x018c, B:37:0x018e, B:39:0x0196, B:42:0x019c, B:45:0x01a6, B:46:0x027c, B:49:0x02b9, B:51:0x02f1, B:52:0x0305, B:57:0x02fd, B:58:0x028c, B:60:0x0296, B:63:0x029e, B:65:0x02a6, B:66:0x02a8, B:68:0x02b0, B:69:0x02b2, B:72:0x0323, B:74:0x0338, B:79:0x0315, B:80:0x01aa, B:82:0x01ed, B:83:0x01f0, B:85:0x020b, B:86:0x020e, B:88:0x0223, B:89:0x0226, B:91:0x023f, B:92:0x0242, B:93:0x0257, B:95:0x025e, B:96:0x0278, B:98:0x0344, B:99:0x0064, B:101:0x0066, B:103:0x0072, B:104:0x0077, B:105:0x0075, B:107:0x0085), top: B:3:0x0002, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0341 A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r0v44, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v79, types: [armf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void b(android.content.Context r16, final defpackage.acgo r17, final defpackage.yll r18) {
        /*
            Method dump skipped, instructions count: 840
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ylk.b(android.content.Context, acgo, yll):void");
    }
}
