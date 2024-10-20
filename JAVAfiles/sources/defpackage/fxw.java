package defpackage;

import android.content.Context;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fxw implements fxs, esl {
    public final boolean a = true;
    final /* synthetic */ fxx b;
    private final fxs c;
    private final etm d;

    public fxw(fxx fxxVar, Context context, fxr fxrVar, eqd eqdVar, etm etmVar, eqg eqgVar, eyy eyyVar, List list) {
        this.b = fxxVar;
        this.d = etmVar;
        this.c = fxrVar.a(context, eqdVar, eqgVar, this, andi.a, eyyVar, list);
    }

    @Override // defpackage.esl
    public final void a(long j) {
        this.b.f = j;
        try {
            fxv fxvVar = this.b.e;
            if (fxvVar.k != null) {
                fvp fvpVar = fxvVar.k;
                if (!fvpVar.e.get()) {
                    try {
                        Thread.sleep(30L);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                int i = ewx.a;
                try {
                    fvpVar.b.signalEndOfInputStream();
                } catch (RuntimeException e) {
                    eub.h(e);
                    throw fvpVar.c(e);
                }
            }
        } catch (fwo e2) {
            this.d.a(e2);
        }
    }

    @Override // defpackage.esl
    public final void b(esh eshVar) {
        this.d.a(new fwo("Video frame processing error", eshVar, 5001));
    }

    @Override // defpackage.fxs
    public final fwt c(int i) {
        return this.c.c(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x0389, code lost:
    
        if (r1.equals("T603") != false) goto L164;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0432 A[Catch: fwo -> 0x043f, TryCatch #0 {fwo -> 0x043f, blocks: (B:3:0x0004, B:10:0x000e, B:18:0x0028, B:21:0x003a, B:26:0x0078, B:30:0x00c7, B:32:0x00cc, B:35:0x00d4, B:38:0x00de, B:41:0x00ea, B:44:0x00f4, B:47:0x0119, B:51:0x01e9, B:58:0x0243, B:60:0x0249, B:63:0x0255, B:65:0x0261, B:66:0x026c, B:68:0x0276, B:70:0x027f, B:73:0x0287, B:75:0x0291, B:77:0x029b, B:80:0x02a9, B:82:0x02b5, B:84:0x02b9, B:86:0x02c3, B:88:0x02cc, B:89:0x02cf, B:90:0x02d5, B:93:0x02dd, B:95:0x02e5, B:97:0x0303, B:98:0x0314, B:102:0x032b, B:103:0x0397, B:105:0x039d, B:106:0x03a9, B:108:0x03e3, B:109:0x03e5, B:111:0x03ef, B:113:0x03f6, B:115:0x03fc, B:116:0x0407, B:118:0x0428, B:119:0x042d, B:120:0x03ff, B:122:0x0405, B:123:0x032f, B:127:0x0337, B:129:0x0343, B:131:0x034f, B:133:0x035b, B:135:0x0367, B:137:0x0373, B:139:0x037f, B:141:0x038b, B:142:0x0391, B:143:0x0307, B:144:0x030d, B:145:0x030e, B:146:0x0432, B:147:0x0438, B:148:0x0123, B:151:0x0137, B:154:0x016a, B:157:0x017a, B:160:0x018c, B:168:0x01d5, B:169:0x01d8, B:171:0x014f, B:179:0x0439, B:180:0x043e, B:181:0x00aa, B:186:0x0062, B:189:0x0071), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0439 A[Catch: fwo -> 0x043f, TryCatch #0 {fwo -> 0x043f, blocks: (B:3:0x0004, B:10:0x000e, B:18:0x0028, B:21:0x003a, B:26:0x0078, B:30:0x00c7, B:32:0x00cc, B:35:0x00d4, B:38:0x00de, B:41:0x00ea, B:44:0x00f4, B:47:0x0119, B:51:0x01e9, B:58:0x0243, B:60:0x0249, B:63:0x0255, B:65:0x0261, B:66:0x026c, B:68:0x0276, B:70:0x027f, B:73:0x0287, B:75:0x0291, B:77:0x029b, B:80:0x02a9, B:82:0x02b5, B:84:0x02b9, B:86:0x02c3, B:88:0x02cc, B:89:0x02cf, B:90:0x02d5, B:93:0x02dd, B:95:0x02e5, B:97:0x0303, B:98:0x0314, B:102:0x032b, B:103:0x0397, B:105:0x039d, B:106:0x03a9, B:108:0x03e3, B:109:0x03e5, B:111:0x03ef, B:113:0x03f6, B:115:0x03fc, B:116:0x0407, B:118:0x0428, B:119:0x042d, B:120:0x03ff, B:122:0x0405, B:123:0x032f, B:127:0x0337, B:129:0x0343, B:131:0x034f, B:133:0x035b, B:135:0x0367, B:137:0x0373, B:139:0x037f, B:141:0x038b, B:142:0x0391, B:143:0x0307, B:144:0x030d, B:145:0x030e, B:146:0x0432, B:147:0x0438, B:148:0x0123, B:151:0x0137, B:154:0x016a, B:157:0x017a, B:160:0x018c, B:168:0x01d5, B:169:0x01d8, B:171:0x014f, B:179:0x0439, B:180:0x043e, B:181:0x00aa, B:186:0x0062, B:189:0x0071), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cc A[Catch: fwo -> 0x043f, TryCatch #0 {fwo -> 0x043f, blocks: (B:3:0x0004, B:10:0x000e, B:18:0x0028, B:21:0x003a, B:26:0x0078, B:30:0x00c7, B:32:0x00cc, B:35:0x00d4, B:38:0x00de, B:41:0x00ea, B:44:0x00f4, B:47:0x0119, B:51:0x01e9, B:58:0x0243, B:60:0x0249, B:63:0x0255, B:65:0x0261, B:66:0x026c, B:68:0x0276, B:70:0x027f, B:73:0x0287, B:75:0x0291, B:77:0x029b, B:80:0x02a9, B:82:0x02b5, B:84:0x02b9, B:86:0x02c3, B:88:0x02cc, B:89:0x02cf, B:90:0x02d5, B:93:0x02dd, B:95:0x02e5, B:97:0x0303, B:98:0x0314, B:102:0x032b, B:103:0x0397, B:105:0x039d, B:106:0x03a9, B:108:0x03e3, B:109:0x03e5, B:111:0x03ef, B:113:0x03f6, B:115:0x03fc, B:116:0x0407, B:118:0x0428, B:119:0x042d, B:120:0x03ff, B:122:0x0405, B:123:0x032f, B:127:0x0337, B:129:0x0343, B:131:0x034f, B:133:0x035b, B:135:0x0367, B:137:0x0373, B:139:0x037f, B:141:0x038b, B:142:0x0391, B:143:0x0307, B:144:0x030d, B:145:0x030e, B:146:0x0432, B:147:0x0438, B:148:0x0123, B:151:0x0137, B:154:0x016a, B:157:0x017a, B:160:0x018c, B:168:0x01d5, B:169:0x01d8, B:171:0x014f, B:179:0x0439, B:180:0x043e, B:181:0x00aa, B:186:0x0062, B:189:0x0071), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01e9 A[Catch: fwo -> 0x043f, TRY_LEAVE, TryCatch #0 {fwo -> 0x043f, blocks: (B:3:0x0004, B:10:0x000e, B:18:0x0028, B:21:0x003a, B:26:0x0078, B:30:0x00c7, B:32:0x00cc, B:35:0x00d4, B:38:0x00de, B:41:0x00ea, B:44:0x00f4, B:47:0x0119, B:51:0x01e9, B:58:0x0243, B:60:0x0249, B:63:0x0255, B:65:0x0261, B:66:0x026c, B:68:0x0276, B:70:0x027f, B:73:0x0287, B:75:0x0291, B:77:0x029b, B:80:0x02a9, B:82:0x02b5, B:84:0x02b9, B:86:0x02c3, B:88:0x02cc, B:89:0x02cf, B:90:0x02d5, B:93:0x02dd, B:95:0x02e5, B:97:0x0303, B:98:0x0314, B:102:0x032b, B:103:0x0397, B:105:0x039d, B:106:0x03a9, B:108:0x03e3, B:109:0x03e5, B:111:0x03ef, B:113:0x03f6, B:115:0x03fc, B:116:0x0407, B:118:0x0428, B:119:0x042d, B:120:0x03ff, B:122:0x0405, B:123:0x032f, B:127:0x0337, B:129:0x0343, B:131:0x034f, B:133:0x035b, B:135:0x0367, B:137:0x0373, B:139:0x037f, B:141:0x038b, B:142:0x0391, B:143:0x0307, B:144:0x030d, B:145:0x030e, B:146:0x0432, B:147:0x0438, B:148:0x0123, B:151:0x0137, B:154:0x016a, B:157:0x017a, B:160:0x018c, B:168:0x01d5, B:169:0x01d8, B:171:0x014f, B:179:0x0439, B:180:0x043e, B:181:0x00aa, B:186:0x0062, B:189:0x0071), top: B:2:0x0004 }] */
    @Override // defpackage.esl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(int r26, int r27) {
        /*
            Method dump skipped, instructions count: 1100
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fxw.d(int, int):void");
    }

    @Override // defpackage.esm
    public final void e() {
        this.c.e();
    }

    @Override // defpackage.esm
    public final void f() {
        this.c.f();
    }

    @Override // defpackage.esm
    public final void g(erv ervVar) {
        this.c.g(ervVar);
    }

    @Override // defpackage.esm
    public final boolean h() {
        return this.c.h();
    }

    @Override // defpackage.esl
    public final void i(long j) {
    }
}
