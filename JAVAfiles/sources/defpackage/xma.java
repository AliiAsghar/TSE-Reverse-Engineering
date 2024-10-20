package defpackage;

import j$.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xma implements xkt {
    public final armf a;
    public final xnv b;
    public final arpi c;
    public boolean d;
    private final armf e;
    private final armf f;
    private final armf g;
    private final armf h;
    private final armf i;
    private final armf j;
    private final armf k;
    private final arwe l;
    private final armf m;
    private final armf n;
    private final xze o;
    private final alvi p;
    private final ascc q;
    private final List r;
    private final xlj s;
    private final asgm t;
    private final wyj u;

    public xma(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, xnv xnvVar, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, arpi arpiVar, arwe arweVar, wyj wyjVar, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        xnvVar.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        armfVar7.getClass();
        armfVar8.getClass();
        arpiVar.getClass();
        arweVar.getClass();
        armfVar9.getClass();
        armfVar10.getClass();
        armfVar11.getClass();
        armfVar12.getClass();
        this.e = armfVar;
        this.f = armfVar2;
        this.g = armfVar3;
        this.a = armfVar4;
        this.b = xnvVar;
        this.h = armfVar5;
        this.i = armfVar6;
        this.j = armfVar7;
        this.k = armfVar8;
        this.c = arpiVar;
        this.l = arweVar;
        this.u = wyjVar;
        this.m = armfVar9;
        this.n = armfVar12;
        this.o = xze.g("Bugle", "MergingForwardSyncWorkOrganizer");
        this.p = alvi.m("com/google/android/apps/messaging/shared/telephony/forwardsync/workorganizer/MergingForwardSyncWorkOrganizer");
        akrh e = aktp.e("MergingForwardSyncWorkOrganizer::init");
        try {
            qjh.l(arweVar, null, new xjs(this, (arpe) null, 2), 3);
            armd.i(e, null);
            this.q = asck.d(0, 100, 2);
            this.r = new ArrayList();
            this.t = new asgm();
            this.s = new xlj(armfVar11, this);
        } finally {
        }
    }

    private final armo w(Collection collection) {
        Object b = this.e.b();
        b.getClass();
        xlb xlbVar = (xlb) aqjn.ae(collection, (Comparator) b);
        List az = aqjn.az(collection);
        arsd.h(az);
        az.remove(xlbVar);
        return new armo(xlbVar, az);
    }

    private final void x(String str, xlb xlbVar) {
        xyo c = this.o.c();
        c.H(str);
        yyb.ce(c, xlbVar, "syncId");
        c.z("syncParams", yyb.cc(xlbVar));
        c.q();
    }

    private final boolean y(xkz xkzVar, xla xlaVar) {
        xkz xkzVar2 = xlaVar.c;
        if (xkzVar2 == null) {
            xkzVar2 = xkz.a;
        }
        if (d.F(xkzVar, xkzVar2)) {
            ((alvg) this.p.i().h("com/google/android/apps/messaging/shared/telephony/forwardsync/workorganizer/MergingForwardSyncWorkOrganizer", "noChangeAfterRetry", 597, "MergingForwardSyncWorkOrganizer.kt")).q("Detected the same out-of-sync messages after retrying sync");
            ((alvg) this.p.g().h("com/google/android/apps/messaging/shared/telephony/forwardsync/workorganizer/MergingForwardSyncWorkOrganizer", "noChangeAfterRetry", 600, "MergingForwardSyncWorkOrganizer.kt")).u("Telephony message count: [%d], Bugle message count: [%d]", xkzVar.b, xkzVar.c);
            return true;
        }
        return false;
    }

    private static final boolean z(xkj xkjVar) {
        if (aqjn.B(xkk.a, xkk.b).contains(xkjVar.a) && !xkjVar.b) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x035f, code lost:
    
        if (r2.a(r0, r5, r3) == r4) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0336, code lost:
    
        if (r7.a(r2, r0, r3) != r4) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x02f5, code lost:
    
        if (r7.n(r0, r2, r3) != r4) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x02d6, code lost:
    
        if (r2.a(r5, r6, r3) == r4) goto L113;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x002a. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00bb  */
    @Override // defpackage.xkt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.xlb r18, defpackage.amvm r19, defpackage.arpe r20) {
        /*
            Method dump skipped, instructions count: 900
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xma.a(xlb, amvm, arpe):java.lang.Object");
    }

    @Override // defpackage.xkt
    public final void b(Instant instant) {
        if (this.d) {
            this.o.o(a.cc(instant, "New message inserted at timestamp [", "] while sync in progress"));
            this.r.add(instant);
        }
    }

    @Override // defpackage.xkt
    public final boolean c() {
        return this.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:207:0x09b1, code lost:
    
        r4 = r1;
        r2 = r8;
        r14 = r10;
        r5 = r5;
        r10 = r17;
        r12 = r18;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0028. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0657 A[Catch: all -> 0x09e1, TryCatch #0 {all -> 0x09e1, blocks: (B:100:0x064e, B:102:0x0657, B:104:0x065d, B:107:0x0698, B:109:0x06a6, B:112:0x06ad, B:114:0x06b1, B:116:0x06b7, B:118:0x06c1, B:120:0x06cd, B:121:0x06d9, B:123:0x06f6, B:124:0x06f8, B:126:0x0713, B:127:0x0715, B:214:0x09dd, B:215:0x09e0, B:222:0x0664, B:223:0x0668, B:225:0x066e, B:228:0x067f, B:231:0x0687, B:236:0x0694, B:238:0x09e6, B:239:0x09eb), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x06a6 A[Catch: all -> 0x09e1, TryCatch #0 {all -> 0x09e1, blocks: (B:100:0x064e, B:102:0x0657, B:104:0x065d, B:107:0x0698, B:109:0x06a6, B:112:0x06ad, B:114:0x06b1, B:116:0x06b7, B:118:0x06c1, B:120:0x06cd, B:121:0x06d9, B:123:0x06f6, B:124:0x06f8, B:126:0x0713, B:127:0x0715, B:214:0x09dd, B:215:0x09e0, B:222:0x0664, B:223:0x0668, B:225:0x066e, B:228:0x067f, B:231:0x0687, B:236:0x0694, B:238:0x09e6, B:239:0x09eb), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x06f6 A[Catch: all -> 0x09e1, TryCatch #0 {all -> 0x09e1, blocks: (B:100:0x064e, B:102:0x0657, B:104:0x065d, B:107:0x0698, B:109:0x06a6, B:112:0x06ad, B:114:0x06b1, B:116:0x06b7, B:118:0x06c1, B:120:0x06cd, B:121:0x06d9, B:123:0x06f6, B:124:0x06f8, B:126:0x0713, B:127:0x0715, B:214:0x09dd, B:215:0x09e0, B:222:0x0664, B:223:0x0668, B:225:0x066e, B:228:0x067f, B:231:0x0687, B:236:0x0694, B:238:0x09e6, B:239:0x09eb), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0713 A[Catch: all -> 0x09e1, TryCatch #0 {all -> 0x09e1, blocks: (B:100:0x064e, B:102:0x0657, B:104:0x065d, B:107:0x0698, B:109:0x06a6, B:112:0x06ad, B:114:0x06b1, B:116:0x06b7, B:118:0x06c1, B:120:0x06cd, B:121:0x06d9, B:123:0x06f6, B:124:0x06f8, B:126:0x0713, B:127:0x0715, B:214:0x09dd, B:215:0x09e0, B:222:0x0664, B:223:0x0668, B:225:0x066e, B:228:0x067f, B:231:0x0687, B:236:0x0694, B:238:0x09e6, B:239:0x09eb), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x074b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x075e A[Catch: all -> 0x09da, TRY_LEAVE, TryCatch #28 {all -> 0x09da, blocks: (B:132:0x0756, B:134:0x075e), top: B:131:0x0756 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x07c6 A[Catch: all -> 0x09d5, TRY_LEAVE, TryCatch #25 {all -> 0x09d5, blocks: (B:141:0x07bd, B:143:0x07c6, B:147:0x07de, B:175:0x089f, B:177:0x08a8), top: B:140:0x07bd }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x096a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0994  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x09bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x07b0  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x09e5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0305 A[Catch: all -> 0x0a26, TryCatch #2 {all -> 0x0a26, blocks: (B:20:0x0301, B:22:0x0305, B:24:0x0319, B:26:0x033b, B:27:0x033d, B:29:0x034f, B:30:0x0351, B:33:0x0364, B:35:0x0371, B:36:0x0373, B:38:0x037b, B:40:0x0383, B:41:0x0385, B:43:0x0393, B:44:0x039a, B:330:0x0398, B:333:0x0a07, B:403:0x0a31, B:404:0x0a34, B:418:0x0285), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0694 A[Catch: all -> 0x09e1, TryCatch #0 {all -> 0x09e1, blocks: (B:100:0x064e, B:102:0x0657, B:104:0x065d, B:107:0x0698, B:109:0x06a6, B:112:0x06ad, B:114:0x06b1, B:116:0x06b7, B:118:0x06c1, B:120:0x06cd, B:121:0x06d9, B:123:0x06f6, B:124:0x06f8, B:126:0x0713, B:127:0x0715, B:214:0x09dd, B:215:0x09e0, B:222:0x0664, B:223:0x0668, B:225:0x066e, B:228:0x067f, B:231:0x0687, B:236:0x0694, B:238:0x09e6, B:239:0x09eb), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x09f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x045a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0438 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x03eb A[Catch: all -> 0x0439, TryCatch #18 {all -> 0x0439, blocks: (B:48:0x03d8, B:50:0x03e5, B:51:0x03ef, B:325:0x03eb), top: B:47:0x03d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0a06  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x02c5 A[Catch: all -> 0x0a2c, TRY_LEAVE, TryCatch #5 {all -> 0x0a2c, blocks: (B:395:0x02c1, B:397:0x02c5, B:410:0x02a6), top: B:409:0x02a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:412:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0a2f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x03e5 A[Catch: all -> 0x0439, TryCatch #18 {all -> 0x0439, blocks: (B:48:0x03d8, B:50:0x03e5, B:51:0x03ef, B:325:0x03eb), top: B:47:0x03d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0477 A[Catch: all -> 0x0461, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0461, blocks: (B:310:0x045a, B:65:0x0477, B:69:0x0485, B:71:0x0489, B:72:0x048b, B:73:0x04a5, B:75:0x04ab, B:77:0x04b8, B:79:0x04bf, B:80:0x04bd, B:83:0x04cb, B:85:0x04da, B:86:0x04dc, B:90:0x05ef, B:260:0x04f8, B:266:0x050a, B:268:0x0510, B:269:0x0512, B:270:0x0534, B:271:0x0535, B:273:0x053b, B:274:0x053d, B:276:0x0544, B:277:0x054b, B:279:0x054f, B:280:0x0551, B:284:0x056a, B:286:0x056e, B:287:0x0570, B:291:0x05ca, B:295:0x0585, B:300:0x0595, B:302:0x059b, B:303:0x059d, B:304:0x05bd, B:306:0x0549), top: B:309:0x045a }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0485 A[Catch: all -> 0x0461, TRY_ENTER, TryCatch #1 {all -> 0x0461, blocks: (B:310:0x045a, B:65:0x0477, B:69:0x0485, B:71:0x0489, B:72:0x048b, B:73:0x04a5, B:75:0x04ab, B:77:0x04b8, B:79:0x04bf, B:80:0x04bd, B:83:0x04cb, B:85:0x04da, B:86:0x04dc, B:90:0x05ef, B:260:0x04f8, B:266:0x050a, B:268:0x0510, B:269:0x0512, B:270:0x0534, B:271:0x0535, B:273:0x053b, B:274:0x053d, B:276:0x0544, B:277:0x054b, B:279:0x054f, B:280:0x0551, B:284:0x056a, B:286:0x056e, B:287:0x0570, B:291:0x05ca, B:295:0x0585, B:300:0x0595, B:302:0x059b, B:303:0x059d, B:304:0x05bd, B:306:0x0549), top: B:309:0x045a }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x05ef A[Catch: all -> 0x0461, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0461, blocks: (B:310:0x045a, B:65:0x0477, B:69:0x0485, B:71:0x0489, B:72:0x048b, B:73:0x04a5, B:75:0x04ab, B:77:0x04b8, B:79:0x04bf, B:80:0x04bd, B:83:0x04cb, B:85:0x04da, B:86:0x04dc, B:90:0x05ef, B:260:0x04f8, B:266:0x050a, B:268:0x0510, B:269:0x0512, B:270:0x0534, B:271:0x0535, B:273:0x053b, B:274:0x053d, B:276:0x0544, B:277:0x054b, B:279:0x054f, B:280:0x0551, B:284:0x056a, B:286:0x056e, B:287:0x0570, B:291:0x05ca, B:295:0x0585, B:300:0x0595, B:302:0x059b, B:303:0x059d, B:304:0x05bd, B:306:0x0549), top: B:309:0x045a }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0636  */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v110, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v123 */
    /* JADX WARN: Type inference failed for: r5v124 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v67 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [asgm] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v64 */
    /* JADX WARN: Type inference failed for: r6v65 */
    /* JADX WARN: Type inference failed for: r6v66 */
    /* JADX WARN: Type inference failed for: r6v69 */
    /* JADX WARN: Type inference failed for: r6v70 */
    /* JADX WARN: Type inference failed for: r6v71 */
    /* JADX WARN: Type inference failed for: r6v72 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:161:0x0994 -> B:16:0x099f). Please report as a decompilation issue!!! */
    @Override // defpackage.xkt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.xkf r34, defpackage.arpe r35) {
        /*
            Method dump skipped, instructions count: 2650
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xma.d(xkf, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.arpe r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.xle
            if (r0 == 0) goto L13
            r0 = r5
            xle r0 = (defpackage.xle) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            xle r0 = new xle
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r5)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.aqil.P(r5)
            xlj r5 = r4.s
            xih r2 = defpackage.xih.c
            r0.c = r3
            java.lang.Object r5 = r5.c(r2, r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            xlc r5 = (defpackage.xlc) r5
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xma.e(arpe):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x017e, code lost:
    
        if (r7.o(r1, r5, r3) != r4) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x013a, code lost:
    
        if (defpackage.yyb.bU(r2) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0159, code lost:
    
        r8 = r9;
        r9 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0157, code lost:
    
        if (defpackage.arro.F(r2, r3) == r4) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0108, code lost:
    
        if (defpackage.arro.F(r5, r3) != r4) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.xku r17, defpackage.xkk r18, defpackage.arpe r19) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xma.f(xku, xkk, arpe):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
    
        if (r5 != r1) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.arpe r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.xll
            if (r0 == 0) goto L13
            r0 = r5
            xll r0 = (defpackage.xll) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            xll r0 = new xll
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r5)
            goto L3c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.aqil.P(r5)
            xlj r5 = r4.s
            r0.c = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 == r1) goto L51
        L3c:
            r0 = r5
            xlc r0 = (defpackage.xlc) r0
            int r0 = r0.b
            r0 = r0 & r3
            r1 = 0
            if (r3 == r0) goto L46
            r5 = r1
        L46:
            xlc r5 = (defpackage.xlc) r5
            if (r5 == 0) goto L51
            xku r5 = r5.d
            if (r5 != 0) goto L50
            xku r5 = defpackage.xku.a
        L50:
            return r5
        L51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xma.g(arpe):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
    
        if (r5 != r1) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(defpackage.arpe r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.xlm
            if (r0 == 0) goto L13
            r0 = r5
            xlm r0 = (defpackage.xlm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            xlm r0 = new xlm
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r5)
            goto L3c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.aqil.P(r5)
            xlj r5 = r4.s
            r0.c = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 == r1) goto L52
        L3c:
            r0 = r5
            xlc r0 = (defpackage.xlc) r0
            int r0 = r0.b
            r0 = r0 & 2
            r1 = 0
            if (r0 != 0) goto L47
            r5 = r1
        L47:
            xlc r5 = (defpackage.xlc) r5
            if (r5 == 0) goto L52
            xkw r5 = r5.e
            if (r5 != 0) goto L51
            xkw r5 = defpackage.xkw.a
        L51:
            return r5
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xma.h(arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(defpackage.xku r19, defpackage.arpe r20) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xma.i(xku, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0070 A[PHI: r7
  0x0070: PHI (r7v10 java.lang.Object) = (r7v7 java.lang.Object), (r7v1 java.lang.Object) binds: [B:21:0x006d, B:11:0x0029] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(defpackage.arpe r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.xlo
            if (r0 == 0) goto L13
            r0 = r7
            xlo r0 = (defpackage.xlo) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            xlo r0 = new xlo
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.aqil.P(r7)
            goto L70
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            xma r2 = r0.d
            defpackage.aqil.P(r7)
            goto L5d
        L3b:
            xma r2 = r0.d
            defpackage.aqil.P(r7)
            goto L4f
        L41:
            defpackage.aqil.P(r7)
            r0.d = r6
            r0.c = r5
            java.lang.Object r7 = r6.h(r0)
            if (r7 == r1) goto L71
            r2 = r6
        L4f:
            xkw r7 = (defpackage.xkw) r7
            if (r7 == 0) goto L64
            r0.d = r2
            r0.c = r4
            java.lang.Object r7 = r2.s(r7, r0)
            if (r7 == r1) goto L63
        L5d:
            xku r7 = (defpackage.xku) r7
            if (r7 != 0) goto L62
            goto L64
        L62:
            return r7
        L63:
            return r1
        L64:
            r7 = 0
            r0.d = r7
            r0.c = r3
            java.lang.Object r7 = r2.k(r0)
            if (r7 != r1) goto L70
            return r1
        L70:
            return r7
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xma.j(arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00fd A[PHI: r13
  0x00fd: PHI (r13v21 java.lang.Object) = (r13v20 java.lang.Object), (r13v1 java.lang.Object) binds: [B:21:0x00fa, B:12:0x002d] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00fc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(defpackage.arpe r13) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xma.k(arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(defpackage.arpe r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.xlq
            if (r0 == 0) goto L13
            r0 = r5
            xlq r0 = (defpackage.xlq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            xlq r0 = new xlq
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.aqil.P(r5)
            xlj r5 = r4.s
            r0.c = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            xlc r5 = (defpackage.xlc) r5
            apax r5 = r5.c
            int r5 = r5.size()
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xma.l(arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(defpackage.xmn r11, defpackage.arpe r12) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xma.m(xmn, arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(defpackage.xmo r11, java.util.UUID r12, defpackage.arpe r13) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xma.n(xmo, java.util.UUID, arpe):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x016a, code lost:
    
        if (r3.fv(r1, r4) == r5) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(defpackage.xkk r23, defpackage.xku r24, defpackage.arpe r25) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xma.o(xkk, xku, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(defpackage.xku r9, java.util.UUID r10, boolean r11, defpackage.arpe r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof defpackage.xlu
            if (r0 == 0) goto L13
            r0 = r12
            xlu r0 = (defpackage.xlu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            xlu r0 = new xlu
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            xjk r9 = r0.e
            xma r10 = r0.d
            defpackage.aqil.P(r12)
            goto Lb8
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            defpackage.aqil.P(r12)
            xlb r12 = r9.c
            if (r12 != 0) goto L3d
            xlb r12 = defpackage.xlb.a
        L3d:
            r12.getClass()
            java.lang.String r2 = "Resumed sync"
            r8.x(r2, r12)
            armf r12 = r8.k
            java.lang.Object r12 = r12.b()
            wyp r12 = (defpackage.wyp) r12
            xlb r2 = r9.c
            if (r2 != 0) goto L53
            xlb r2 = defpackage.xlb.a
        L53:
            aozb r2 = r2.e
            r2.getClass()
            java.util.UUID r2 = defpackage.yyb.bY(r2)
            amvo r4 = defpackage.amvo.a
            aozy r4 = r4.createBuilder()
            aozb r10 = defpackage.a.ah(r10)
            apag r5 = r4.b
            boolean r5 = r5.isMutable()
            if (r5 != 0) goto L71
            r4.u()
        L71:
            apag r5 = r4.b
            r6 = r5
            amvo r6 = (defpackage.amvo) r6
            int r7 = r6.b
            r7 = r7 | r3
            r6.b = r7
            r6.c = r10
            boolean r10 = r5.isMutable()
            if (r10 != 0) goto L86
            r4.u()
        L86:
            apag r10 = r4.b
            amvo r10 = (defpackage.amvo) r10
            int r5 = r10.b
            r5 = r5 | 2
            r10.b = r5
            r10.d = r11
            apag r10 = r4.s()
            amvo r10 = (defpackage.amvo) r10
            java.lang.Object r11 = r12.g
            int r12 = defpackage.alog.d
            alog r12 = defpackage.alsx.a
            xjc r11 = (defpackage.xjc) r11
            r11.b(r2, r12, r10)
            xjk r10 = new xjk
            r10.<init>(r9)
            ascc r9 = r8.q
            r0.d = r8
            r0.e = r10
            r0.c = r3
            java.lang.Object r9 = r9.fv(r10, r0)
            if (r9 == r1) goto Lca
            r9 = r10
            r10 = r8
        Lb8:
            wyj r10 = r10.u
            r9.getClass()
            xjl r11 = new xjl
            xku r9 = r9.a
            r11.<init>(r9)
            r10.d(r11)
            arnb r9 = defpackage.arnb.a
            return r9
        Lca:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xma.p(xku, java.util.UUID, boolean, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(defpackage.xku r10, java.util.UUID r11, defpackage.arpe r12) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xma.q(xku, java.util.UUID, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(defpackage.xku r9, defpackage.arpe r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.xlw
            if (r0 == 0) goto L13
            r0 = r10
            xlw r0 = (defpackage.xlw) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            xlw r0 = new xlw
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.c
            arpl r1 = defpackage.arpl.a
            int r2 = r0.e
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L55
            if (r2 == r5) goto L47
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r9 = r0.a
            xmn r9 = (defpackage.xmn) r9
            defpackage.aqil.P(r10)
            goto La5
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            java.lang.Object r9 = r0.b
            xmn r9 = (defpackage.xmn) r9
            java.lang.Object r2 = r0.a
            xma r2 = (defpackage.xma) r2
            defpackage.aqil.P(r10)
            goto L98
        L47:
            xku r9 = r0.f
            java.lang.Object r2 = r0.b
            xmp r2 = (defpackage.xmp) r2
            java.lang.Object r5 = r0.a
            xma r5 = (defpackage.xma) r5
            defpackage.aqil.P(r10)
            goto L72
        L55:
            defpackage.aqil.P(r10)
            armf r10 = r8.f
            java.lang.Object r10 = r10.b()
            r2 = r10
            xmp r2 = (defpackage.xmp) r2
            xlj r10 = r8.s
            r0.a = r8
            r0.b = r2
            r0.f = r9
            r0.e = r5
            java.lang.Object r10 = r10.b(r0)
            if (r10 == r1) goto La8
            r5 = r8
        L72:
            xlc r10 = (defpackage.xlc) r10
            apax r10 = r10.c
            r10.getClass()
            xmn r9 = r2.a(r9, r10)
            if (r9 != 0) goto L80
            return r6
        L80:
            xlj r10 = r5.s
            wyk r2 = new wyk
            r7 = 14
            r2.<init>(r9, r7)
            r0.a = r5
            r0.b = r9
            r0.f = r6
            r0.e = r4
            java.lang.Object r10 = r10.c(r2, r0)
            if (r10 == r1) goto La8
            r2 = r5
        L98:
            r0.a = r9
            r0.b = r6
            r0.e = r3
            java.lang.Object r10 = r2.m(r9, r0)
            if (r10 != r1) goto La5
            return r1
        La5:
            xku r9 = r9.b
            return r9
        La8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xma.r(xku, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object s(defpackage.xkw r6, defpackage.arpe r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.xly
            if (r0 == 0) goto L13
            r0 = r7
            xly r0 = (defpackage.xly) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            xly r0 = new xly
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            xku r6 = r0.f
            xku r1 = r0.e
            xma r0 = r0.d
            defpackage.aqil.P(r7)
            goto L57
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            defpackage.aqil.P(r7)
            xku r6 = r6.c
            if (r6 != 0) goto L3e
            xku r6 = defpackage.xku.a
        L3e:
            xlj r7 = r5.s
            wyk r2 = new wyk
            r4 = 15
            r2.<init>(r6, r4)
            r0.d = r5
            r0.e = r6
            r0.f = r6
            r0.c = r3
            java.lang.Object r7 = r7.c(r2, r0)
            if (r7 == r1) goto L71
            r0 = r5
            r1 = r6
        L57:
            xze r7 = r0.o
            xyo r7 = r7.c()
            java.lang.String r0 = "Restored interrupted sync to active"
            r7.H(r0)
            xlb r6 = r6.c
            if (r6 != 0) goto L68
            xlb r6 = defpackage.xlb.a
        L68:
            r6.getClass()
            defpackage.yyb.cf(r7, r6)
            r7.q()
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xma.s(xkw, arpe):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x020d, code lost:
    
        if (r15.f(r14, r0, r4) == r2) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0233, code lost:
    
        if (r3 == r2) goto L86;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x024f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(defpackage.xku r20, defpackage.xmk r21, defpackage.xkj r22, java.util.UUID r23, defpackage.xkf r24, defpackage.arpe r25) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xma.t(xku, xmk, xkj, java.util.UUID, xkf, arpe):java.lang.Object");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0020. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object u(defpackage.xku r10, defpackage.xkf r11, j$.time.Instant r12, java.util.UUID r13, defpackage.arpe r14) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xma.u(xku, xkf, j$.time.Instant, java.util.UUID, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object v(defpackage.xku r11, defpackage.xkj r12, defpackage.xkf r13, defpackage.arpe r14) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xma.v(xku, xkj, xkf, arpe):java.lang.Object");
    }
}
