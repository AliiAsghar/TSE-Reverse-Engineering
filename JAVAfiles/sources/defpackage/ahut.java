package defpackage;

import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahut {
    public static final ahlp f = new ahlp();
    public final ahta a;
    public final String b;
    public final akkw h;
    private final Set j;
    private final Object i = new Object();
    public final String c = "";
    public final boolean d = false;
    public final boolean e = false;
    private volatile aiim k = null;
    public final ahmn g = new ahmn((byte[]) null);

    public ahut(ahta ahtaVar, String str, boolean z, Set set) {
        this.a = ahtaVar;
        this.b = str;
        this.j = set;
        this.h = new akkw(ahtaVar, str, "", z);
    }

    public final ListenableFuture a() {
        ListenableFuture a;
        aiim d = d();
        String b = d.b();
        ahuj a2 = this.a.f.a();
        if (a2.l) {
            if (albo.ah(b) && !a2.m) {
                return aneh.a;
            }
            aozy createBuilder = ahtt.a.createBuilder();
            Object obj = d.d;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ahtt ahttVar = (ahtt) createBuilder.b;
            obj.getClass();
            ahttVar.d = (ahts) obj;
            ahttVar.b |= 2;
            if (!albo.ah(b)) {
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ahtt ahttVar2 = (ahtt) createBuilder.b;
                b.getClass();
                ahttVar2.b |= 1;
                ahttVar2.c = b;
            }
            if (a2.m) {
                String str = this.b;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ahtt ahttVar3 = (ahtt) createBuilder.b;
                ahttVar3.b |= 4;
                ahttVar3.e = str;
            }
            a = this.a.b().b((ahtt) createBuilder.s());
        } else {
            if (albo.ah(b)) {
                return aneh.a;
            }
            a = this.a.b().a(b);
        }
        return ancd.g(a, ahty.class, new ahce(this, 5), this.a.d());
    }

    public final void b() {
        akkw akkwVar = this.h;
        ListenableFuture d = akkwVar.d(this.c);
        ancj.g(d, new ahce(akkwVar, 4), this.a.d()).c(new ahnu(this, d, 9, null), this.a.d());
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.Map, java.lang.Object] */
    public final /* synthetic */ void c(ListenableFuture listenableFuture) {
        try {
            aiim c = aiim.c((ahvp) albo.bQ(listenableFuture));
            synchronized (this.i) {
                if (this.k != null) {
                    boolean am = alzz.am(this.k.c, c.c);
                    if (!am) {
                        ahvd ahvdVar = (ahvd) ((algw) this.a.e.get()).e();
                        if (ahvdVar != null) {
                            ahvdVar.a();
                            return;
                        }
                        return;
                    }
                } else {
                    this.k = c;
                }
                ((AtomicInteger) this.g.a).incrementAndGet();
            }
        } catch (CancellationException | ExecutionException e) {
            if (!(e.getCause() instanceof SecurityException)) {
                Log.w("MobStoreFlagStore", "Unable to update local snapshot for " + this.b + ", may result in stale flags.", e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x045b A[Catch: all -> 0x063d, TryCatch #5 {all -> 0x063d, blocks: (B:10:0x0011, B:12:0x0027, B:14:0x0040, B:16:0x0044, B:17:0x0046, B:19:0x0051, B:21:0x0055, B:22:0x0057, B:23:0x005c, B:24:0x00b2, B:26:0x00c7, B:28:0x00d5, B:29:0x00d8, B:30:0x0457, B:32:0x045b, B:73:0x0476, B:77:0x048d, B:79:0x04b3, B:80:0x04b6, B:82:0x04ce, B:83:0x04d1, B:86:0x04ee, B:88:0x0514, B:89:0x0517, B:91:0x052f, B:92:0x0532, B:93:0x00f6, B:95:0x00fa, B:97:0x0108, B:98:0x010b, B:99:0x0127, B:101:0x012f, B:103:0x013d, B:104:0x0140, B:105:0x015c, B:107:0x016d, B:109:0x0175, B:111:0x0183, B:112:0x0186, B:113:0x01a2, B:115:0x01aa, B:117:0x01b8, B:118:0x01bb, B:120:0x01d8, B:122:0x01e0, B:124:0x01f2, B:126:0x0213, B:127:0x0216, B:129:0x022d, B:130:0x0230, B:131:0x024e, B:133:0x0252, B:134:0x025f, B:135:0x0267, B:144:0x0356, B:149:0x03f0, B:150:0x03f3, B:155:0x03a6, B:165:0x03f6, B:167:0x041c, B:168:0x041f, B:170:0x0437, B:171:0x043a, B:173:0x006d, B:175:0x0087, B:177:0x008b, B:178:0x008d, B:180:0x0097, B:182:0x009b, B:183:0x009d, B:184:0x00a2), top: B:9:0x0011, outer: #2, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x055e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0584 A[Catch: all -> 0x0645, TryCatch #2 {, blocks: (B:6:0x0009, B:8:0x000d, B:33:0x054f, B:36:0x057a, B:37:0x057c, B:39:0x0584, B:41:0x058e, B:42:0x0639, B:43:0x05a4, B:45:0x05bb, B:47:0x05cd, B:49:0x05ef, B:51:0x060b, B:52:0x060e, B:54:0x0617, B:55:0x0619, B:66:0x0636, B:68:0x0637, B:69:0x05c1, B:70:0x055f, B:72:0x0576, B:188:0x063e, B:189:0x0642, B:190:0x0643, B:57:0x061a, B:59:0x061e, B:60:0x0631, B:10:0x0011, B:12:0x0027, B:14:0x0040, B:16:0x0044, B:17:0x0046, B:19:0x0051, B:21:0x0055, B:22:0x0057, B:23:0x005c, B:24:0x00b2, B:26:0x00c7, B:28:0x00d5, B:29:0x00d8, B:30:0x0457, B:32:0x045b, B:73:0x0476, B:77:0x048d, B:79:0x04b3, B:80:0x04b6, B:82:0x04ce, B:83:0x04d1, B:86:0x04ee, B:88:0x0514, B:89:0x0517, B:91:0x052f, B:92:0x0532, B:93:0x00f6, B:95:0x00fa, B:97:0x0108, B:98:0x010b, B:99:0x0127, B:101:0x012f, B:103:0x013d, B:104:0x0140, B:105:0x015c, B:107:0x016d, B:109:0x0175, B:111:0x0183, B:112:0x0186, B:113:0x01a2, B:115:0x01aa, B:117:0x01b8, B:118:0x01bb, B:120:0x01d8, B:122:0x01e0, B:124:0x01f2, B:126:0x0213, B:127:0x0216, B:129:0x022d, B:130:0x0230, B:131:0x024e, B:133:0x0252, B:134:0x025f, B:135:0x0267, B:144:0x0356, B:149:0x03f0, B:150:0x03f3, B:155:0x03a6, B:165:0x03f6, B:167:0x041c, B:168:0x041f, B:170:0x0437, B:171:0x043a, B:173:0x006d, B:175:0x0087, B:177:0x008b, B:178:0x008d, B:180:0x0097, B:182:0x009b, B:183:0x009d, B:184:0x00a2), top: B:5:0x0009, inners: #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x05bb A[Catch: all -> 0x0645, TryCatch #2 {, blocks: (B:6:0x0009, B:8:0x000d, B:33:0x054f, B:36:0x057a, B:37:0x057c, B:39:0x0584, B:41:0x058e, B:42:0x0639, B:43:0x05a4, B:45:0x05bb, B:47:0x05cd, B:49:0x05ef, B:51:0x060b, B:52:0x060e, B:54:0x0617, B:55:0x0619, B:66:0x0636, B:68:0x0637, B:69:0x05c1, B:70:0x055f, B:72:0x0576, B:188:0x063e, B:189:0x0642, B:190:0x0643, B:57:0x061a, B:59:0x061e, B:60:0x0631, B:10:0x0011, B:12:0x0027, B:14:0x0040, B:16:0x0044, B:17:0x0046, B:19:0x0051, B:21:0x0055, B:22:0x0057, B:23:0x005c, B:24:0x00b2, B:26:0x00c7, B:28:0x00d5, B:29:0x00d8, B:30:0x0457, B:32:0x045b, B:73:0x0476, B:77:0x048d, B:79:0x04b3, B:80:0x04b6, B:82:0x04ce, B:83:0x04d1, B:86:0x04ee, B:88:0x0514, B:89:0x0517, B:91:0x052f, B:92:0x0532, B:93:0x00f6, B:95:0x00fa, B:97:0x0108, B:98:0x010b, B:99:0x0127, B:101:0x012f, B:103:0x013d, B:104:0x0140, B:105:0x015c, B:107:0x016d, B:109:0x0175, B:111:0x0183, B:112:0x0186, B:113:0x01a2, B:115:0x01aa, B:117:0x01b8, B:118:0x01bb, B:120:0x01d8, B:122:0x01e0, B:124:0x01f2, B:126:0x0213, B:127:0x0216, B:129:0x022d, B:130:0x0230, B:131:0x024e, B:133:0x0252, B:134:0x025f, B:135:0x0267, B:144:0x0356, B:149:0x03f0, B:150:0x03f3, B:155:0x03a6, B:165:0x03f6, B:167:0x041c, B:168:0x041f, B:170:0x0437, B:171:0x043a, B:173:0x006d, B:175:0x0087, B:177:0x008b, B:178:0x008d, B:180:0x0097, B:182:0x009b, B:183:0x009d, B:184:0x00a2), top: B:5:0x0009, inners: #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x05ef A[Catch: all -> 0x0645, TryCatch #2 {, blocks: (B:6:0x0009, B:8:0x000d, B:33:0x054f, B:36:0x057a, B:37:0x057c, B:39:0x0584, B:41:0x058e, B:42:0x0639, B:43:0x05a4, B:45:0x05bb, B:47:0x05cd, B:49:0x05ef, B:51:0x060b, B:52:0x060e, B:54:0x0617, B:55:0x0619, B:66:0x0636, B:68:0x0637, B:69:0x05c1, B:70:0x055f, B:72:0x0576, B:188:0x063e, B:189:0x0642, B:190:0x0643, B:57:0x061a, B:59:0x061e, B:60:0x0631, B:10:0x0011, B:12:0x0027, B:14:0x0040, B:16:0x0044, B:17:0x0046, B:19:0x0051, B:21:0x0055, B:22:0x0057, B:23:0x005c, B:24:0x00b2, B:26:0x00c7, B:28:0x00d5, B:29:0x00d8, B:30:0x0457, B:32:0x045b, B:73:0x0476, B:77:0x048d, B:79:0x04b3, B:80:0x04b6, B:82:0x04ce, B:83:0x04d1, B:86:0x04ee, B:88:0x0514, B:89:0x0517, B:91:0x052f, B:92:0x0532, B:93:0x00f6, B:95:0x00fa, B:97:0x0108, B:98:0x010b, B:99:0x0127, B:101:0x012f, B:103:0x013d, B:104:0x0140, B:105:0x015c, B:107:0x016d, B:109:0x0175, B:111:0x0183, B:112:0x0186, B:113:0x01a2, B:115:0x01aa, B:117:0x01b8, B:118:0x01bb, B:120:0x01d8, B:122:0x01e0, B:124:0x01f2, B:126:0x0213, B:127:0x0216, B:129:0x022d, B:130:0x0230, B:131:0x024e, B:133:0x0252, B:134:0x025f, B:135:0x0267, B:144:0x0356, B:149:0x03f0, B:150:0x03f3, B:155:0x03a6, B:165:0x03f6, B:167:0x041c, B:168:0x041f, B:170:0x0437, B:171:0x043a, B:173:0x006d, B:175:0x0087, B:177:0x008b, B:178:0x008d, B:180:0x0097, B:182:0x009b, B:183:0x009d, B:184:0x00a2), top: B:5:0x0009, inners: #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x05c1 A[Catch: all -> 0x0645, TryCatch #2 {, blocks: (B:6:0x0009, B:8:0x000d, B:33:0x054f, B:36:0x057a, B:37:0x057c, B:39:0x0584, B:41:0x058e, B:42:0x0639, B:43:0x05a4, B:45:0x05bb, B:47:0x05cd, B:49:0x05ef, B:51:0x060b, B:52:0x060e, B:54:0x0617, B:55:0x0619, B:66:0x0636, B:68:0x0637, B:69:0x05c1, B:70:0x055f, B:72:0x0576, B:188:0x063e, B:189:0x0642, B:190:0x0643, B:57:0x061a, B:59:0x061e, B:60:0x0631, B:10:0x0011, B:12:0x0027, B:14:0x0040, B:16:0x0044, B:17:0x0046, B:19:0x0051, B:21:0x0055, B:22:0x0057, B:23:0x005c, B:24:0x00b2, B:26:0x00c7, B:28:0x00d5, B:29:0x00d8, B:30:0x0457, B:32:0x045b, B:73:0x0476, B:77:0x048d, B:79:0x04b3, B:80:0x04b6, B:82:0x04ce, B:83:0x04d1, B:86:0x04ee, B:88:0x0514, B:89:0x0517, B:91:0x052f, B:92:0x0532, B:93:0x00f6, B:95:0x00fa, B:97:0x0108, B:98:0x010b, B:99:0x0127, B:101:0x012f, B:103:0x013d, B:104:0x0140, B:105:0x015c, B:107:0x016d, B:109:0x0175, B:111:0x0183, B:112:0x0186, B:113:0x01a2, B:115:0x01aa, B:117:0x01b8, B:118:0x01bb, B:120:0x01d8, B:122:0x01e0, B:124:0x01f2, B:126:0x0213, B:127:0x0216, B:129:0x022d, B:130:0x0230, B:131:0x024e, B:133:0x0252, B:134:0x025f, B:135:0x0267, B:144:0x0356, B:149:0x03f0, B:150:0x03f3, B:155:0x03a6, B:165:0x03f6, B:167:0x041c, B:168:0x041f, B:170:0x0437, B:171:0x043a, B:173:0x006d, B:175:0x0087, B:177:0x008b, B:178:0x008d, B:180:0x0097, B:182:0x009b, B:183:0x009d, B:184:0x00a2), top: B:5:0x0009, inners: #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x055f A[Catch: all -> 0x0645, TryCatch #2 {, blocks: (B:6:0x0009, B:8:0x000d, B:33:0x054f, B:36:0x057a, B:37:0x057c, B:39:0x0584, B:41:0x058e, B:42:0x0639, B:43:0x05a4, B:45:0x05bb, B:47:0x05cd, B:49:0x05ef, B:51:0x060b, B:52:0x060e, B:54:0x0617, B:55:0x0619, B:66:0x0636, B:68:0x0637, B:69:0x05c1, B:70:0x055f, B:72:0x0576, B:188:0x063e, B:189:0x0642, B:190:0x0643, B:57:0x061a, B:59:0x061e, B:60:0x0631, B:10:0x0011, B:12:0x0027, B:14:0x0040, B:16:0x0044, B:17:0x0046, B:19:0x0051, B:21:0x0055, B:22:0x0057, B:23:0x005c, B:24:0x00b2, B:26:0x00c7, B:28:0x00d5, B:29:0x00d8, B:30:0x0457, B:32:0x045b, B:73:0x0476, B:77:0x048d, B:79:0x04b3, B:80:0x04b6, B:82:0x04ce, B:83:0x04d1, B:86:0x04ee, B:88:0x0514, B:89:0x0517, B:91:0x052f, B:92:0x0532, B:93:0x00f6, B:95:0x00fa, B:97:0x0108, B:98:0x010b, B:99:0x0127, B:101:0x012f, B:103:0x013d, B:104:0x0140, B:105:0x015c, B:107:0x016d, B:109:0x0175, B:111:0x0183, B:112:0x0186, B:113:0x01a2, B:115:0x01aa, B:117:0x01b8, B:118:0x01bb, B:120:0x01d8, B:122:0x01e0, B:124:0x01f2, B:126:0x0213, B:127:0x0216, B:129:0x022d, B:130:0x0230, B:131:0x024e, B:133:0x0252, B:134:0x025f, B:135:0x0267, B:144:0x0356, B:149:0x03f0, B:150:0x03f3, B:155:0x03a6, B:165:0x03f6, B:167:0x041c, B:168:0x041f, B:170:0x0437, B:171:0x043a, B:173:0x006d, B:175:0x0087, B:177:0x008b, B:178:0x008d, B:180:0x0097, B:182:0x009b, B:183:0x009d, B:184:0x00a2), top: B:5:0x0009, inners: #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0476 A[Catch: all -> 0x063d, TRY_LEAVE, TryCatch #5 {all -> 0x063d, blocks: (B:10:0x0011, B:12:0x0027, B:14:0x0040, B:16:0x0044, B:17:0x0046, B:19:0x0051, B:21:0x0055, B:22:0x0057, B:23:0x005c, B:24:0x00b2, B:26:0x00c7, B:28:0x00d5, B:29:0x00d8, B:30:0x0457, B:32:0x045b, B:73:0x0476, B:77:0x048d, B:79:0x04b3, B:80:0x04b6, B:82:0x04ce, B:83:0x04d1, B:86:0x04ee, B:88:0x0514, B:89:0x0517, B:91:0x052f, B:92:0x0532, B:93:0x00f6, B:95:0x00fa, B:97:0x0108, B:98:0x010b, B:99:0x0127, B:101:0x012f, B:103:0x013d, B:104:0x0140, B:105:0x015c, B:107:0x016d, B:109:0x0175, B:111:0x0183, B:112:0x0186, B:113:0x01a2, B:115:0x01aa, B:117:0x01b8, B:118:0x01bb, B:120:0x01d8, B:122:0x01e0, B:124:0x01f2, B:126:0x0213, B:127:0x0216, B:129:0x022d, B:130:0x0230, B:131:0x024e, B:133:0x0252, B:134:0x025f, B:135:0x0267, B:144:0x0356, B:149:0x03f0, B:150:0x03f3, B:155:0x03a6, B:165:0x03f6, B:167:0x041c, B:168:0x041f, B:170:0x0437, B:171:0x043a, B:173:0x006d, B:175:0x0087, B:177:0x008b, B:178:0x008d, B:180:0x0097, B:182:0x009b, B:183:0x009d, B:184:0x00a2), top: B:9:0x0011, outer: #2, inners: #0, #4 }] */
    /* JADX WARN: Type inference failed for: r10v3, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v22, types: [alhr, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.aiim d() {
        /*
            Method dump skipped, instructions count: 1610
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahut.d():aiim");
    }
}
