package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahjs implements Runnable, Delayed {
    final /* synthetic */ ahjo a;
    final /* synthetic */ ahjv b;

    public ahjs() {
        throw null;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Delayed delayed) {
        return 0;
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return 0L;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|6|6|(9:(8:394|395|396|48|49|(1:51)|35|36)(5:8|9|10|11|(6:13|14|15|(1:17)|19|20)(2:24|(11:26|27|28|29|30|31|32|33|(1:37)|35|36)(1:(15:58|59|60|62|63|64|65|67|68|31|32|33|(0)|35|36)(16:95|96|97|(5:100|101|(3:104|105|102)|106|98)|169|170|171|(8:353|354|355|356|357|358|359|360)(1:173)|174|175|176|177|232|330|332|333))))|114|(3:116|117|118)(2:134|(1:136)(3:137|(1:139)(3:141|(1:143)(1:145)|144)|140))|119|120|121|(1:123)|(2:126|127)(3:(2:129|130)|35|36)|(5:(0)|(1:334)|(2:197|198)|(15:222|223|224|(1:226)(1:285)|227|228|230|231|232|233|234|(1:236)|238|35|36)|(3:238|35|36)))|111|112|113) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:(8:394|395|396|48|49|(1:51)|35|36)(5:8|9|10|11|(6:13|14|15|(1:17)|19|20)(2:24|(11:26|27|28|29|30|31|32|33|(1:37)|35|36)(1:(15:58|59|60|62|63|64|65|67|68|31|32|33|(0)|35|36)(16:95|96|97|(5:100|101|(3:104|105|102)|106|98)|169|170|171|(8:353|354|355|356|357|358|359|360)(1:173)|174|175|176|177|232|330|332|333))))|114|(3:116|117|118)(2:134|(1:136)(3:137|(1:139)(3:141|(1:143)(1:145)|144)|140))|119|120|121|(1:123)|(2:126|127)(3:(2:129|130)|35|36)|(5:(0)|(1:334)|(2:197|198)|(15:222|223|224|(1:226)(1:285)|227|228|230|231|232|233|234|(1:236)|238|35|36)|(3:238|35|36))) */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x04d8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x04d9, code lost:
    
        android.util.Log.w(defpackage.ahjv.a, "Maybe reset connectionAttempts failed, see exception: ", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x04ef, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x04f0, code lost:
    
        r16 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0257, code lost:
    
        if (r6 == null) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x025b, code lost:
    
        if ((r6 instanceof defpackage.ahjt) == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x025d, code lost:
    
        r16 = new defpackage.aksr(defpackage.ahjm.INVALID_REQUEST, -1, r6.getMessage(), (java.lang.Throwable) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x026e, code lost:
    
        r4 = r2.b.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0273, code lost:
    
        if (r14 >= 3) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0275, code lost:
    
        defpackage.ahjv.h(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x027e, code lost:
    
        if (r11.D() <= r9) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0280, code lost:
    
        r3.h = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0284, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0285, code lost:
    
        android.util.Log.w(defpackage.ahjv.a, "Maybe reset connectionAttempts failed, see exception: ", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0298, code lost:
    
        throw new defpackage.ahju(r6, defpackage.ahjm.REQUEST_ERROR);
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0299, code lost:
    
        r6 = r1.getResponseCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x029f, code lost:
    
        if (r6 < 200) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x02a3, code lost:
    
        if (r6 >= 300) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x02ab, code lost:
    
        if (r1.getResponseCode() != 206) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x02ad, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x02b1, code lost:
    
        if (r6 == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x02b3, code lost:
    
        if (r9 != 0) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x02b5, code lost:
    
        android.util.Log.e(defpackage.ahjv.a, "Got partial HTTP response, but no existing bytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x02bc, code lost:
    
        if (r9 <= 0) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x02be, code lost:
    
        if (r6 == false) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x02c0, code lost:
    
        android.util.Log.d(defpackage.ahjv.a, "File " + r15.getName() + " existed (" + r9 + " bytes), attempted and succeeded with range download");
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x02e8, code lost:
    
        android.util.Log.d(defpackage.ahjv.a, "File " + r15.getName() + " existed, attempted range download, but server didn't response with partial content, so re-downloading whole file.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0307, code lost:
    
        r4 = r1.getHeaderField("Transfer-Encoding");
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x030d, code lost:
    
        if (r4 == null) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0315, code lost:
    
        if (r4.equals("identity") == false) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0317, code lost:
    
        r4 = r1.getHeaderField("Content-Length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x031d, code lost:
    
        if (r4 == null) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x031f, code lost:
    
        java.lang.Long.parseLong(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0323, code lost:
    
        android.util.Log.e(defpackage.ahjv.a, defpackage.a.cp(r4, "Unparseable Content-Length: "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x02af, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x03cd, code lost:
    
        r4 = defpackage.ahjv.a;
        r12 = new java.lang.StringBuilder();
        r12.append("Non-success http response code ");
        r12.append(r6);
        r12.append(" for: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x03e1, code lost:
    
        r13 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x03e3, code lost:
    
        r12.append(r13);
        android.util.Log.e(r4, r12.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x03ef, code lost:
    
        if (r6 != 416) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x03f1, code lost:
    
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x03fc, code lost:
    
        r16 = new defpackage.aksr(defpackage.ahjm.HTTP_ERROR, r6, (java.lang.String) null, (java.lang.Throwable) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x041a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x043a, code lost:
    
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x041c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x0246, code lost:
    
        r16 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0474 A[Catch: all -> 0x04ef, TRY_LEAVE, TryCatch #46 {all -> 0x04ef, blocks: (B:113:0x046e, B:116:0x0474), top: B:112:0x046e }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04d4 A[Catch: IOException -> 0x04d8, TRY_LEAVE, TryCatch #52 {IOException -> 0x04d8, blocks: (B:121:0x04cc, B:123:0x04d4), top: B:120:0x04cc }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x048c A[Catch: all -> 0x04ed, TryCatch #44 {all -> 0x04ed, blocks: (B:118:0x0487, B:134:0x048c, B:136:0x0496, B:137:0x04a6, B:139:0x04b1, B:141:0x04bb, B:143:0x04bf, B:144:0x04c4, B:145:0x04c2), top: B:114:0x0472 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0503 A[Catch: IOException -> 0x0507, TRY_LEAVE, TryCatch #9 {IOException -> 0x0507, blocks: (B:151:0x04fb, B:153:0x0503), top: B:150:0x04fb }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x040d A[Catch: IOException -> 0x0412, TRY_LEAVE, TryCatch #26 {IOException -> 0x0412, blocks: (B:33:0x0405, B:37:0x040d), top: B:32:0x0405 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0174 A[Catch: IOException -> 0x0178, TRY_LEAVE, TryCatch #2 {IOException -> 0x0178, blocks: (B:49:0x016a, B:51:0x0174), top: B:48:0x016a }] */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v55 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahjs.run():void");
    }

    public ahjs(ahjv ahjvVar, ahjo ahjoVar) {
        this.a = ahjoVar;
        this.b = ahjvVar;
    }
}
