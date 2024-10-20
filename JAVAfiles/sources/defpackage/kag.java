package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kag {
    private static final alvi e = alvi.m("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/MessageBubbleUiAdapterImpl");
    public final Optional a;
    public final khb b;
    public final kaq c;
    public final kcy d;
    private final kdh f;
    private final kbq g;
    private final Optional h;
    private final xnv i;
    private final Optional j;
    private final armf k;
    private final armf l;
    private final ock m;
    private final obm n;
    private final armf o;
    private final pkg p;
    private final armf q;
    private final kcc r;
    private final iji s;
    private final iji t;
    private final mlt u;
    private final jxv v;
    private final nei w;

    public kag(arwe arweVar, kdh kdhVar, kbq kbqVar, mlt mltVar, iji ijiVar, Optional optional, khb khbVar, nei neiVar, Optional optional2, kaq kaqVar, jxv jxvVar, armf armfVar, kcy kcyVar, kcc kccVar, xnv xnvVar, Optional optional3, iji ijiVar2, Context context, armf armfVar2, armf armfVar3, ock ockVar, obm obmVar, obk obkVar, armf armfVar4, pkg pkgVar, armf armfVar5) {
        arweVar.getClass();
        kdhVar.getClass();
        khbVar.getClass();
        neiVar.getClass();
        kaqVar.getClass();
        armfVar.getClass();
        xnvVar.getClass();
        ijiVar2.getClass();
        context.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        ockVar.getClass();
        obmVar.getClass();
        obkVar.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        this.f = kdhVar;
        this.g = kbqVar;
        this.u = mltVar;
        this.s = ijiVar;
        this.a = optional;
        this.b = khbVar;
        this.w = neiVar;
        this.h = optional2;
        this.c = kaqVar;
        this.v = jxvVar;
        this.d = kcyVar;
        this.r = kccVar;
        this.i = xnvVar;
        this.j = optional3;
        this.t = ijiVar2;
        this.k = armfVar2;
        this.l = armfVar3;
        this.m = ockVar;
        this.n = obmVar;
        this.o = armfVar4;
        this.p = pkgVar;
        this.q = armfVar5;
    }

    public static final jzx b(jzx jzxVar, aetv aetvVar, aevm aevmVar, aeve aeveVar, aexx aexxVar, aevq aevqVar, aeva aevaVar, apdv apdvVar, kdi kdiVar, apdv apdvVar2) {
        arqr arqrVar;
        String str;
        apdv apdvVar3;
        arqg b = aetvVar.b();
        if (kdiVar != null) {
            arqrVar = kdiVar.a;
        } else {
            arqrVar = null;
        }
        if (kdiVar != null) {
            str = kdiVar.b;
        } else {
            str = null;
        }
        if (apdvVar != null) {
            apdvVar3 = apdvVar;
        } else {
            apdvVar3 = apdvVar2;
        }
        aeul aeulVar = jzxVar.a;
        String str2 = aeulVar.a;
        List list = aeulVar.b;
        List list2 = aeulVar.c;
        arqg arqgVar = aeulVar.d;
        int i = aeulVar.A;
        aeuh aeuhVar = aeulVar.e;
        arqg arqgVar2 = aeulVar.p;
        boolean z = aeulVar.f;
        boolean z2 = aeulVar.g;
        int i2 = aeulVar.B;
        arqv arqvVar = aeulVar.q;
        arqg arqgVar3 = aeulVar.x;
        aeuk aeukVar = aeulVar.y;
        boolean z3 = aeulVar.u;
        boolean z4 = aeulVar.v;
        return jzx.c(jzxVar, new aeul(str2, list, list2, arqgVar, i, aeuhVar, z, z2, i2, aevmVar, aeveVar, aeulVar.i, aevaVar, aevqVar, aeulVar.l, aexxVar, aeulVar.n, b, arqgVar2, arqvVar, arqrVar, str, z3, z4, apdvVar3, arqgVar3, aeukVar), aetvVar, 28);
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x0654, code lost:
    
        r1 = (defpackage.qkg[]) defpackage.aqil.o(r15).toArray(new defpackage.qkg[0]);
        r7 = new defpackage.kaf((defpackage.asai[]) java.util.Arrays.copyOf(r1, r1.length), (defpackage.qkg[]) r15, r58, r56, r3, 0);
        r1 = new java.util.ArrayList(9);
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0680, code lost:
    
        if (r7 >= 9) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0682, code lost:
    
        r2 = r15[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0684, code lost:
    
        if (r2 == 0) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0686, code lost:
    
        r2 = r2.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x068c, code lost:
    
        r1.add(r2);
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x068b, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0692, code lost:
    
        r1 = r1.toArray(new java.lang.Object[0]);
        r2 = r1[0];
        r2.getClass();
        r46 = (defpackage.aetv) r2;
        r2 = (defpackage.aevm) r1[1];
        r48 = (defpackage.aeve) r1[2];
        r49 = (defpackage.aexx) r1[3];
        r50 = (defpackage.aevq) r1[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x06b9, code lost:
    
        if (r58.n == false) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x06bb, code lost:
    
        r51 = (defpackage.aeva) r1[5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x06c5, code lost:
    
        r2 = new defpackage.qki(r7, b(r3, r46, r2, r48, r49, r50, r51, (defpackage.apdv) r1[6], (defpackage.kdi) r1[7], (defpackage.apdv) r1[8]), 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x06c3, code lost:
    
        r51 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x06eb, code lost:
    
        r2 = new defpackage.qjp(new defpackage.kad(r15, r58, r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x01b9, code lost:
    
        if (((defpackage.kdb) ((j$.util.Optional) r2.m).get()).a() != false) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x04df A[Catch: all -> 0x0255, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0255, blocks: (B:39:0x01ef, B:41:0x0209, B:50:0x029b, B:58:0x038d, B:62:0x03e7, B:65:0x03f3, B:70:0x0407, B:76:0x0455, B:83:0x048e, B:90:0x04a5, B:94:0x04b8, B:99:0x04d3, B:102:0x04df, B:106:0x04f0, B:108:0x04f6, B:110:0x04ff, B:112:0x0505, B:116:0x05b7, B:123:0x05c5, B:125:0x05cb, B:129:0x064a, B:131:0x064e, B:137:0x0654, B:139:0x0682, B:141:0x0686, B:143:0x068c, B:147:0x0692, B:149:0x06bb, B:150:0x06c5, B:174:0x05f3, B:197:0x039b, B:200:0x02c6, B:202:0x02ce, B:204:0x02e5, B:205:0x0320, B:207:0x0329, B:208:0x02f5, B:211:0x02fb, B:214:0x030f, B:218:0x0338, B:220:0x033e, B:221:0x035d, B:223:0x034e, B:226:0x036e, B:232:0x01fa), top: B:26:0x0191 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x05c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x05cb A[Catch: all -> 0x0255, TRY_LEAVE, TryCatch #2 {all -> 0x0255, blocks: (B:39:0x01ef, B:41:0x0209, B:50:0x029b, B:58:0x038d, B:62:0x03e7, B:65:0x03f3, B:70:0x0407, B:76:0x0455, B:83:0x048e, B:90:0x04a5, B:94:0x04b8, B:99:0x04d3, B:102:0x04df, B:106:0x04f0, B:108:0x04f6, B:110:0x04ff, B:112:0x0505, B:116:0x05b7, B:123:0x05c5, B:125:0x05cb, B:129:0x064a, B:131:0x064e, B:137:0x0654, B:139:0x0682, B:141:0x0686, B:143:0x068c, B:147:0x0692, B:149:0x06bb, B:150:0x06c5, B:174:0x05f3, B:197:0x039b, B:200:0x02c6, B:202:0x02ce, B:204:0x02e5, B:205:0x0320, B:207:0x0329, B:208:0x02f5, B:211:0x02fb, B:214:0x030f, B:218:0x0338, B:220:0x033e, B:221:0x035d, B:223:0x034e, B:226:0x036e, B:232:0x01fa), top: B:26:0x0191 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x064a A[Catch: all -> 0x0255, TRY_ENTER, TryCatch #2 {all -> 0x0255, blocks: (B:39:0x01ef, B:41:0x0209, B:50:0x029b, B:58:0x038d, B:62:0x03e7, B:65:0x03f3, B:70:0x0407, B:76:0x0455, B:83:0x048e, B:90:0x04a5, B:94:0x04b8, B:99:0x04d3, B:102:0x04df, B:106:0x04f0, B:108:0x04f6, B:110:0x04ff, B:112:0x0505, B:116:0x05b7, B:123:0x05c5, B:125:0x05cb, B:129:0x064a, B:131:0x064e, B:137:0x0654, B:139:0x0682, B:141:0x0686, B:143:0x068c, B:147:0x0692, B:149:0x06bb, B:150:0x06c5, B:174:0x05f3, B:197:0x039b, B:200:0x02c6, B:202:0x02ce, B:204:0x02e5, B:205:0x0320, B:207:0x0329, B:208:0x02f5, B:211:0x02fb, B:214:0x030f, B:218:0x0338, B:220:0x033e, B:221:0x035d, B:223:0x034e, B:226:0x036e, B:232:0x01fa), top: B:26:0x0191 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x06eb A[EDGE_INSN: B:157:0x06eb->B:158:0x06eb BREAK  A[LOOP:0: B:128:0x0648->B:135:0x06e7], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x05ed A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04d9 A[Catch: all -> 0x06fc, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x06fc, blocks: (B:43:0x027e, B:47:0x0293, B:53:0x02a5, B:60:0x039f, B:63:0x03ef, B:67:0x0402, B:71:0x0423, B:74:0x044b, B:78:0x045e, B:81:0x048a, B:85:0x0499, B:92:0x04b0, B:96:0x04c3, B:114:0x050c, B:126:0x060b, B:158:0x06eb, B:169:0x05db, B:180:0x04ea, B:181:0x04d9, B:186:0x0481, B:191:0x0430, B:192:0x041c, B:195:0x0395, B:198:0x02b0, B:216:0x0330, B:222:0x0387, B:224:0x0368, B:242:0x0264), top: B:241:0x0264 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0481 A[Catch: all -> 0x06fc, TryCatch #5 {all -> 0x06fc, blocks: (B:43:0x027e, B:47:0x0293, B:53:0x02a5, B:60:0x039f, B:63:0x03ef, B:67:0x0402, B:71:0x0423, B:74:0x044b, B:78:0x045e, B:81:0x048a, B:85:0x0499, B:92:0x04b0, B:96:0x04c3, B:114:0x050c, B:126:0x060b, B:158:0x06eb, B:169:0x05db, B:180:0x04ea, B:181:0x04d9, B:186:0x0481, B:191:0x0430, B:192:0x041c, B:195:0x0395, B:198:0x02b0, B:216:0x0330, B:222:0x0387, B:224:0x0368, B:242:0x0264), top: B:241:0x0264 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0430 A[Catch: all -> 0x06fc, TryCatch #5 {all -> 0x06fc, blocks: (B:43:0x027e, B:47:0x0293, B:53:0x02a5, B:60:0x039f, B:63:0x03ef, B:67:0x0402, B:71:0x0423, B:74:0x044b, B:78:0x045e, B:81:0x048a, B:85:0x0499, B:92:0x04b0, B:96:0x04c3, B:114:0x050c, B:126:0x060b, B:158:0x06eb, B:169:0x05db, B:180:0x04ea, B:181:0x04d9, B:186:0x0481, B:191:0x0430, B:192:0x041c, B:195:0x0395, B:198:0x02b0, B:216:0x0330, B:222:0x0387, B:224:0x0368, B:242:0x0264), top: B:241:0x0264 }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x041c A[Catch: all -> 0x06fc, TRY_ENTER, TryCatch #5 {all -> 0x06fc, blocks: (B:43:0x027e, B:47:0x0293, B:53:0x02a5, B:60:0x039f, B:63:0x03ef, B:67:0x0402, B:71:0x0423, B:74:0x044b, B:78:0x045e, B:81:0x048a, B:85:0x0499, B:92:0x04b0, B:96:0x04c3, B:114:0x050c, B:126:0x060b, B:158:0x06eb, B:169:0x05db, B:180:0x04ea, B:181:0x04d9, B:186:0x0481, B:191:0x0430, B:192:0x041c, B:195:0x0395, B:198:0x02b0, B:216:0x0330, B:222:0x0387, B:224:0x0368, B:242:0x0264), top: B:241:0x0264 }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02b0 A[Catch: all -> 0x06fc, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x06fc, blocks: (B:43:0x027e, B:47:0x0293, B:53:0x02a5, B:60:0x039f, B:63:0x03ef, B:67:0x0402, B:71:0x0423, B:74:0x044b, B:78:0x045e, B:81:0x048a, B:85:0x0499, B:92:0x04b0, B:96:0x04c3, B:114:0x050c, B:126:0x060b, B:158:0x06eb, B:169:0x05db, B:180:0x04ea, B:181:0x04d9, B:186:0x0481, B:191:0x0430, B:192:0x041c, B:195:0x0395, B:198:0x02b0, B:216:0x0330, B:222:0x0387, B:224:0x0368, B:242:0x0264), top: B:241:0x0264 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03e7 A[Catch: all -> 0x0255, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0255, blocks: (B:39:0x01ef, B:41:0x0209, B:50:0x029b, B:58:0x038d, B:62:0x03e7, B:65:0x03f3, B:70:0x0407, B:76:0x0455, B:83:0x048e, B:90:0x04a5, B:94:0x04b8, B:99:0x04d3, B:102:0x04df, B:106:0x04f0, B:108:0x04f6, B:110:0x04ff, B:112:0x0505, B:116:0x05b7, B:123:0x05c5, B:125:0x05cb, B:129:0x064a, B:131:0x064e, B:137:0x0654, B:139:0x0682, B:141:0x0686, B:143:0x068c, B:147:0x0692, B:149:0x06bb, B:150:0x06c5, B:174:0x05f3, B:197:0x039b, B:200:0x02c6, B:202:0x02ce, B:204:0x02e5, B:205:0x0320, B:207:0x0329, B:208:0x02f5, B:211:0x02fb, B:214:0x030f, B:218:0x0338, B:220:0x033e, B:221:0x035d, B:223:0x034e, B:226:0x036e, B:232:0x01fa), top: B:26:0x0191 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x03f3 A[Catch: all -> 0x0255, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0255, blocks: (B:39:0x01ef, B:41:0x0209, B:50:0x029b, B:58:0x038d, B:62:0x03e7, B:65:0x03f3, B:70:0x0407, B:76:0x0455, B:83:0x048e, B:90:0x04a5, B:94:0x04b8, B:99:0x04d3, B:102:0x04df, B:106:0x04f0, B:108:0x04f6, B:110:0x04ff, B:112:0x0505, B:116:0x05b7, B:123:0x05c5, B:125:0x05cb, B:129:0x064a, B:131:0x064e, B:137:0x0654, B:139:0x0682, B:141:0x0686, B:143:0x068c, B:147:0x0692, B:149:0x06bb, B:150:0x06c5, B:174:0x05f3, B:197:0x039b, B:200:0x02c6, B:202:0x02ce, B:204:0x02e5, B:205:0x0320, B:207:0x0329, B:208:0x02f5, B:211:0x02fb, B:214:0x030f, B:218:0x0338, B:220:0x033e, B:221:0x035d, B:223:0x034e, B:226:0x036e, B:232:0x01fa), top: B:26:0x0191 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0407 A[Catch: all -> 0x0255, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0255, blocks: (B:39:0x01ef, B:41:0x0209, B:50:0x029b, B:58:0x038d, B:62:0x03e7, B:65:0x03f3, B:70:0x0407, B:76:0x0455, B:83:0x048e, B:90:0x04a5, B:94:0x04b8, B:99:0x04d3, B:102:0x04df, B:106:0x04f0, B:108:0x04f6, B:110:0x04ff, B:112:0x0505, B:116:0x05b7, B:123:0x05c5, B:125:0x05cb, B:129:0x064a, B:131:0x064e, B:137:0x0654, B:139:0x0682, B:141:0x0686, B:143:0x068c, B:147:0x0692, B:149:0x06bb, B:150:0x06c5, B:174:0x05f3, B:197:0x039b, B:200:0x02c6, B:202:0x02ce, B:204:0x02e5, B:205:0x0320, B:207:0x0329, B:208:0x02f5, B:211:0x02fb, B:214:0x030f, B:218:0x0338, B:220:0x033e, B:221:0x035d, B:223:0x034e, B:226:0x036e, B:232:0x01fa), top: B:26:0x0191 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0455 A[Catch: all -> 0x0255, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0255, blocks: (B:39:0x01ef, B:41:0x0209, B:50:0x029b, B:58:0x038d, B:62:0x03e7, B:65:0x03f3, B:70:0x0407, B:76:0x0455, B:83:0x048e, B:90:0x04a5, B:94:0x04b8, B:99:0x04d3, B:102:0x04df, B:106:0x04f0, B:108:0x04f6, B:110:0x04ff, B:112:0x0505, B:116:0x05b7, B:123:0x05c5, B:125:0x05cb, B:129:0x064a, B:131:0x064e, B:137:0x0654, B:139:0x0682, B:141:0x0686, B:143:0x068c, B:147:0x0692, B:149:0x06bb, B:150:0x06c5, B:174:0x05f3, B:197:0x039b, B:200:0x02c6, B:202:0x02ce, B:204:0x02e5, B:205:0x0320, B:207:0x0329, B:208:0x02f5, B:211:0x02fb, B:214:0x030f, B:218:0x0338, B:220:0x033e, B:221:0x035d, B:223:0x034e, B:226:0x036e, B:232:0x01fa), top: B:26:0x0191 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x048e A[Catch: all -> 0x0255, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0255, blocks: (B:39:0x01ef, B:41:0x0209, B:50:0x029b, B:58:0x038d, B:62:0x03e7, B:65:0x03f3, B:70:0x0407, B:76:0x0455, B:83:0x048e, B:90:0x04a5, B:94:0x04b8, B:99:0x04d3, B:102:0x04df, B:106:0x04f0, B:108:0x04f6, B:110:0x04ff, B:112:0x0505, B:116:0x05b7, B:123:0x05c5, B:125:0x05cb, B:129:0x064a, B:131:0x064e, B:137:0x0654, B:139:0x0682, B:141:0x0686, B:143:0x068c, B:147:0x0692, B:149:0x06bb, B:150:0x06c5, B:174:0x05f3, B:197:0x039b, B:200:0x02c6, B:202:0x02ce, B:204:0x02e5, B:205:0x0320, B:207:0x0329, B:208:0x02f5, B:211:0x02fb, B:214:0x030f, B:218:0x0338, B:220:0x033e, B:221:0x035d, B:223:0x034e, B:226:0x036e, B:232:0x01fa), top: B:26:0x0191 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x04a5 A[Catch: all -> 0x0255, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0255, blocks: (B:39:0x01ef, B:41:0x0209, B:50:0x029b, B:58:0x038d, B:62:0x03e7, B:65:0x03f3, B:70:0x0407, B:76:0x0455, B:83:0x048e, B:90:0x04a5, B:94:0x04b8, B:99:0x04d3, B:102:0x04df, B:106:0x04f0, B:108:0x04f6, B:110:0x04ff, B:112:0x0505, B:116:0x05b7, B:123:0x05c5, B:125:0x05cb, B:129:0x064a, B:131:0x064e, B:137:0x0654, B:139:0x0682, B:141:0x0686, B:143:0x068c, B:147:0x0692, B:149:0x06bb, B:150:0x06c5, B:174:0x05f3, B:197:0x039b, B:200:0x02c6, B:202:0x02ce, B:204:0x02e5, B:205:0x0320, B:207:0x0329, B:208:0x02f5, B:211:0x02fb, B:214:0x030f, B:218:0x0338, B:220:0x033e, B:221:0x035d, B:223:0x034e, B:226:0x036e, B:232:0x01fa), top: B:26:0x0191 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x04b8 A[Catch: all -> 0x0255, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0255, blocks: (B:39:0x01ef, B:41:0x0209, B:50:0x029b, B:58:0x038d, B:62:0x03e7, B:65:0x03f3, B:70:0x0407, B:76:0x0455, B:83:0x048e, B:90:0x04a5, B:94:0x04b8, B:99:0x04d3, B:102:0x04df, B:106:0x04f0, B:108:0x04f6, B:110:0x04ff, B:112:0x0505, B:116:0x05b7, B:123:0x05c5, B:125:0x05cb, B:129:0x064a, B:131:0x064e, B:137:0x0654, B:139:0x0682, B:141:0x0686, B:143:0x068c, B:147:0x0692, B:149:0x06bb, B:150:0x06c5, B:174:0x05f3, B:197:0x039b, B:200:0x02c6, B:202:0x02ce, B:204:0x02e5, B:205:0x0320, B:207:0x0329, B:208:0x02f5, B:211:0x02fb, B:214:0x030f, B:218:0x0338, B:220:0x033e, B:221:0x035d, B:223:0x034e, B:226:0x036e, B:232:0x01fa), top: B:26:0x0191 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x04d3 A[Catch: all -> 0x0255, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0255, blocks: (B:39:0x01ef, B:41:0x0209, B:50:0x029b, B:58:0x038d, B:62:0x03e7, B:65:0x03f3, B:70:0x0407, B:76:0x0455, B:83:0x048e, B:90:0x04a5, B:94:0x04b8, B:99:0x04d3, B:102:0x04df, B:106:0x04f0, B:108:0x04f6, B:110:0x04ff, B:112:0x0505, B:116:0x05b7, B:123:0x05c5, B:125:0x05cb, B:129:0x064a, B:131:0x064e, B:137:0x0654, B:139:0x0682, B:141:0x0686, B:143:0x068c, B:147:0x0692, B:149:0x06bb, B:150:0x06c5, B:174:0x05f3, B:197:0x039b, B:200:0x02c6, B:202:0x02ce, B:204:0x02e5, B:205:0x0320, B:207:0x0329, B:208:0x02f5, B:211:0x02fb, B:214:0x030f, B:218:0x0338, B:220:0x033e, B:221:0x035d, B:223:0x034e, B:226:0x036e, B:232:0x01fa), top: B:26:0x0191 }] */
    /* JADX WARN: Type inference failed for: r10v2, types: [ock, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v37, types: [aeva] */
    /* JADX WARN: Type inference failed for: r12v12, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v20, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v9, types: [java.lang.Object[], qkg[]] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v3, types: [aevq] */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1, types: [aexx] */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r2v64, types: [qkg] */
    /* JADX WARN: Type inference failed for: r2v71, types: [asai, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.qkg a(defpackage.arwe r57, defpackage.jzz r58) {
        /*
            Method dump skipped, instructions count: 1802
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kag.a(arwe, jzz):qkg");
    }
}
