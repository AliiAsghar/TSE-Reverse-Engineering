package defpackage;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class arjf implements Runnable {
    final /* synthetic */ CountDownLatch a;
    final /* synthetic */ CyclicBarrier b;
    final /* synthetic */ arip c;
    final /* synthetic */ CountDownLatch d;
    final /* synthetic */ arjh e;

    public arjf(arjh arjhVar, CountDownLatch countDownLatch, CyclicBarrier cyclicBarrier, arip aripVar, CountDownLatch countDownLatch2) {
        this.a = countDownLatch;
        this.b = cyclicBarrier;
        this.c = aripVar;
        this.d = countDownLatch2;
        this.e = arjhVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x00e0, code lost:
    
        r7 = new defpackage.asqu();
        r7.R(r15, 0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x00e9, code lost:
    
        if (r8 >= r9) goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x00eb, code lost:
    
        r3 = r15.codePointAt(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x00ef, code lost:
    
        r17 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x00f3, code lost:
    
        if (r3 != 37) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x00f5, code lost:
    
        r3 = r8 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x00f7, code lost:
    
        if (r3 >= r9) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x00fb, code lost:
    
        r5 = defpackage.arku.a(r15.charAt(r8 + 1));
        r3 = defpackage.arku.a(r15.charAt(r3));
        r18 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0110, code lost:
    
        if (r5 == (-1)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0112, code lost:
    
        if (r3 == (-1)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0114, code lost:
    
        r7.M((r5 << 4) + r3);
        r8 = r3;
        r3 = 37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x012c, code lost:
    
        r8 = r8 + java.lang.Character.charCount(r3);
        r5 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x011f, code lost:
    
        r3 = 37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0127, code lost:
    
        r7.S(r3);
        r8 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0122, code lost:
    
        r18 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0125, code lost:
    
        r18 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0134, code lost:
    
        r3 = r7.m();
     */
    /* JADX WARN: Removed duplicated region for block: B:333:0x065a A[Catch: all -> 0x0695, Exception -> 0x0697, StatusException -> 0x0699, TRY_ENTER, TryCatch #19 {StatusException -> 0x0699, Exception -> 0x0697, all -> 0x0695, blocks: (B:12:0x0395, B:14:0x039b, B:16:0x03a7, B:17:0x03ae, B:19:0x03bd, B:20:0x03c8, B:22:0x03df, B:23:0x03f0, B:25:0x0405, B:27:0x0413, B:28:0x0420, B:30:0x042e, B:31:0x0431, B:33:0x0437, B:34:0x043b, B:36:0x044b, B:37:0x0474, B:39:0x04a1, B:41:0x04a9, B:42:0x04b6, B:44:0x04c0, B:45:0x04e3, B:95:0x04c5, B:96:0x04d4, B:98:0x044e, B:100:0x0458, B:101:0x045b, B:103:0x0465, B:104:0x0468, B:106:0x0472, B:107:0x04d5, B:108:0x04e0, B:110:0x0417, B:111:0x0409, B:113:0x03c2, B:114:0x03ac, B:142:0x00fb, B:145:0x0114, B:147:0x012c, B:149:0x0127, B:333:0x065a, B:334:0x065d, B:335:0x066d, B:155:0x0134, B:156:0x0142, B:158:0x014a, B:160:0x0152, B:165:0x0222, B:169:0x022f, B:171:0x0235, B:173:0x0239, B:178:0x026e, B:179:0x0293, B:181:0x0297, B:182:0x029c, B:183:0x029d, B:185:0x02d5, B:187:0x02f0, B:189:0x0307, B:191:0x030f, B:193:0x0317, B:195:0x0320, B:196:0x034c, B:202:0x0354, B:203:0x035c, B:205:0x0364, B:207:0x036a, B:208:0x0370, B:209:0x037b, B:211:0x037c, B:218:0x0390, B:220:0x05a1, B:222:0x05a6, B:225:0x05c9, B:226:0x05cc, B:227:0x05f1, B:232:0x05b1, B:199:0x05fe, B:200:0x0609, B:235:0x05f2, B:236:0x05fd, B:239:0x0326, B:240:0x0329, B:241:0x0334, B:242:0x0335, B:243:0x0340, B:244:0x0341, B:246:0x0349, B:247:0x060a, B:248:0x0615, B:249:0x0616, B:250:0x061d, B:251:0x061e, B:252:0x0625, B:253:0x0626, B:254:0x0631, B:255:0x0632, B:256:0x063f, B:257:0x0164, B:260:0x0170, B:265:0x017a, B:267:0x017e, B:269:0x0184, B:271:0x0187, B:277:0x0193, B:283:0x019a, B:284:0x01a2, B:288:0x01a9, B:290:0x01b3, B:296:0x01bf, B:297:0x01c2, B:300:0x01dc, B:301:0x01e3, B:302:0x01e8, B:305:0x01ed, B:309:0x01ff, B:311:0x0205, B:315:0x0212, B:327:0x013b, B:328:0x0640, B:329:0x0649, B:346:0x066e, B:347:0x0694), top: B:8:0x003a }] */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.util.List, java.lang.Object] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1769
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arjf.run():void");
    }
}
