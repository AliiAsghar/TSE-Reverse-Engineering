package defpackage;

import android.content.Context;
import android.net.Uri;
import com.android.vcard.VCardConfig;
import com.android.vcard.VCardEntryCounter;
import com.android.vcard.VCardInterpreter;
import com.android.vcard.VCardSourceDetector;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uev implements ufw {
    private static final xze h = xze.g("Bugle", "VCardRequest");
    private static final int i = (int) TimeUnit.SECONDS.toMillis(10);
    public final armf a;
    public final Context b;
    public final List c = new ArrayList();
    public uey d;
    public final xvc e;
    public final uac f;
    public final uli g;
    private final armf j;
    private final ufx k;
    private final Uri l;

    public uev(armf armfVar, xvc xvcVar, uac uacVar, uli uliVar, armf armfVar2, Context context, ufx ufxVar, Uri uri) {
        this.j = armfVar;
        this.e = xvcVar;
        this.f = uacVar;
        this.g = uliVar;
        this.a = armfVar2;
        this.b = context;
        this.k = ufxVar;
        this.l = uri;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0026 A[Catch: all -> 0x0045, TryCatch #2 {all -> 0x0045, blocks: (B:5:0x0016, B:15:0x001f, B:16:0x0022, B:18:0x0026, B:19:0x0031, B:21:0x0035, B:26:0x0048, B:27:0x004f), top: B:4:0x0016, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean a(android.net.Uri r6, int r7, com.android.vcard.VCardInterpreter r8, boolean r9) {
        /*
            r5 = this;
            defpackage.xyl.h()
            android.content.Context r0 = r5.b
            android.content.ContentResolver r0 = r0.getContentResolver()
            r1 = 0
            java.io.InputStream r2 = r0.openInputStream(r6)     // Catch: defpackage.hjk -> L56 defpackage.hjp -> L57 java.io.IOException -> L63
            com.android.vcard.VCardParser_V21 r3 = new com.android.vcard.VCardParser_V21     // Catch: defpackage.hjk -> L56 defpackage.hjp -> L57 java.io.IOException -> L63
            r3.<init>(r7)     // Catch: defpackage.hjk -> L56 defpackage.hjp -> L57 java.io.IOException -> L63
            r3.addInterpreter(r8)     // Catch: defpackage.hjk -> L56 defpackage.hjp -> L57 java.io.IOException -> L63
            r3.parse(r2)     // Catch: defpackage.hjq -> L1f java.lang.Throwable -> L45
            if (r2 == 0) goto L43
        L1b:
            r2.close()     // Catch: java.io.IOException -> L43 defpackage.hjk -> L56 defpackage.hjp -> L57
            goto L43
        L1f:
            r2.close()     // Catch: java.io.IOException -> L22 java.lang.Throwable -> L45
        L22:
            boolean r3 = r8 instanceof defpackage.ugj     // Catch: java.lang.Throwable -> L45
            if (r3 == 0) goto L31
            r3 = r8
            ugj r3 = (defpackage.ugj) r3     // Catch: java.lang.Throwable -> L45
            r4 = 0
            r3.b = r4     // Catch: java.lang.Throwable -> L45
            java.util.List r3 = r3.a     // Catch: java.lang.Throwable -> L45
            r3.clear()     // Catch: java.lang.Throwable -> L45
        L31:
            java.io.InputStream r2 = r0.openInputStream(r6)     // Catch: java.lang.Throwable -> L45
            com.android.vcard.VCardParser_V30 r6 = new com.android.vcard.VCardParser_V30     // Catch: java.lang.Throwable -> L45 defpackage.hjq -> L47
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L45 defpackage.hjq -> L47
            r6.addInterpreter(r8)     // Catch: java.lang.Throwable -> L45 defpackage.hjq -> L47
            r6.parse(r2)     // Catch: java.lang.Throwable -> L45 defpackage.hjq -> L47
            if (r2 == 0) goto L43
            goto L1b
        L43:
            r6 = 1
            return r6
        L45:
            r6 = move-exception
            goto L50
        L47:
            r6 = move-exception
            hjk r7 = new hjk     // Catch: java.lang.Throwable -> L45
            java.lang.String r8 = "vCard with unsupported version."
            r7.<init>(r8, r6)     // Catch: java.lang.Throwable -> L45
            throw r7     // Catch: java.lang.Throwable -> L45
        L50:
            if (r2 == 0) goto L55
            r2.close()     // Catch: java.io.IOException -> L55 defpackage.hjk -> L56 defpackage.hjp -> L57
        L55:
            throw r6     // Catch: defpackage.hjk -> L56 defpackage.hjp -> L57 java.io.IOException -> L63
        L56:
            return r1
        L57:
            r6 = move-exception
            boolean r7 = r6 instanceof defpackage.hjo
            if (r7 == 0) goto L62
            if (r9 != 0) goto L5f
            goto L62
        L5f:
            hjo r6 = (defpackage.hjo) r6
            throw r6
        L62:
            return r1
        L63:
            r6 = move-exception
            xze r7 = defpackage.uev.h
            java.lang.String r8 = "IOException was emitted."
            r7.n(r8, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uev.a(android.net.Uri, int, com.android.vcard.VCardInterpreter, boolean):boolean");
    }

    @Override // defpackage.ufw
    public final int c() {
        return 0;
    }

    @Override // defpackage.ufw
    public final int d() {
        return 3;
    }

    @Override // defpackage.ufw
    public final ufv j() {
        return ((uie) this.j.b()).a(4);
    }

    @Override // defpackage.ufw
    public final ufx k() {
        return this.k;
    }

    @Override // defpackage.ufw
    public final /* bridge */ /* synthetic */ ugg l(List list) {
        boolean a;
        xyl.h();
        xyl.i(this.d);
        xyl.a(0, this.c.size());
        CountDownLatch countDownLatch = new CountDownLatch(1);
        xyl.h();
        VCardInterpreter vCardEntryCounter = new VCardEntryCounter();
        VCardSourceDetector vCardSourceDetector = new VCardSourceDetector();
        Uri uri = this.l;
        try {
            try {
                a = a(uri, 0, vCardSourceDetector, true);
            } catch (hjo e) {
                h.n("Must not reach here.", e);
            }
        } catch (hjo unused) {
            a = a(uri, vCardSourceDetector.getEstimatedType(), vCardEntryCounter, false);
        }
        if (a) {
            xyl.h();
            int estimatedType = vCardSourceDetector.getEstimatedType();
            if (estimatedType == 0) {
                estimatedType = VCardConfig.getVCardTypeFromString("default");
            }
            ugj ugjVar = new ugj(estimatedType);
            ugjVar.c.add(new use(this, countDownLatch));
            try {
                if (a(uri, estimatedType, ugjVar, false)) {
                    countDownLatch.await(i, TimeUnit.MILLISECONDS);
                    uey ueyVar = this.d;
                    if (ueyVar != null) {
                        return ueyVar;
                    }
                    throw new hjk("Failure or timeout loading vcard");
                }
            } catch (hjo e2) {
                h.n("Must not reach here.", e2);
            }
        }
        throw new hjk("Invalid vcard");
    }

    @Override // defpackage.ufw
    public final String m() {
        return this.l.toString();
    }
}
