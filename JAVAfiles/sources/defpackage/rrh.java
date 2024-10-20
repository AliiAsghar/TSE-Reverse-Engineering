package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rrh {
    private static final ArrayList e;
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    private final armf f;
    private final armf g;
    private boolean h;
    private boolean i;
    private boolean j;
    private rrg k;
    private static final xze c = xze.g("Bugle", "CequintCallerIdManager");
    static final uuf a = uuh.r(166321560, "enable_cequint_permission_check_pre_observer");
    private static final Uri d = Uri.parse("content://com.cequint.ecid/external/lookup/sms");

    static {
        ArrayList arrayList = new ArrayList(5);
        e = arrayList;
        arrayList.add(0, new byte[]{26, 12, -8, -115, 91, -30, 106, -19, 80, -123, -2, -120, -96, -98, -20, 37, 30, -54, 22, -105, 80, -38, 33, -52, 24, -55, -104, -81, 38, -51, 6, 113});
        arrayList.add(1, new byte[]{-54, 47, -82, -12, 9, -17, 76, 121, -8, 76, -40, -105, -65, 26, 21, 15, -16, 94, 84, 116, -74, 74, -54, -51, 5, 126, 30, -104, -58, 31, 92, 69});
        arrayList.add(2, new byte[]{-26, 122, 14, -80, 118, 78, -61, 40, -73, -63, 27, 27, -48, -124, 40, -90, 22, -39, -13, -21, -80, 32, -89, -40, -33, 20, 114, -127, 76, 19, -13, -55});
        arrayList.add(3, new byte[]{26, -70, -94, -124, 12, 97, -106, 9, -111, 94, -111, -107, 61, 41, 60, -112, -20, -76, -119, 29, -64, -79, 35, 88, -104, -21, -26, -44, 9, -27, -114, -99});
        arrayList.add(4, new byte[]{39, -7, 109, -70, -73, 123, 49, -10, -107, 62, 76, -46, -62, -34, -2, 21, -11, -41, -57, -113, 7, 61, -41, 22, 32, 24, -17, 71, 107, 9, 124, 52});
    }

    public rrh(armf armfVar, armf armfVar2) {
        this.f = armfVar;
        this.g = armfVar2;
    }

    private static String c(Cursor cursor, int i) {
        if (!cursor.isNull(i)) {
            String string = cursor.getString(i);
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008b, code lost:
    
        if (r9 == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
    
        if (r9 == 1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0090, code lost:
    
        if (r9 == 2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0093, code lost:
    
        if (r9 == 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009d, code lost:
    
        defpackage.rrh.c.o("This is Sprint Support Package Caller Name ID APK.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bc, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0095, code lost:
    
        defpackage.rrh.c.o("This is SprintPackage Caller Name ID APK.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c0, code lost:
    
        r12 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00df, code lost:
    
        r0 = defpackage.rrh.c.b();
        r0.H("Couldn't find package info");
        r0.z("packageName", r2);
        r0.r(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00be, code lost:
    
        r12 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d5, code lost:
    
        defpackage.rrh.c.n("Device does not have the algorithm to hash the signatures.", r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a5, code lost:
    
        defpackage.rrh.c.o("This is VZWPackage Caller Name ID APK.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ad, code lost:
    
        defpackage.rrh.c.o("This is 2048-signed Caller Name ID APK.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b5, code lost:
    
        defpackage.rrh.c.o("This is 1024-signed Caller Name ID APK.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean d(android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rrh.d(android.content.Context):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x01f9, code lost:
    
        r0.append(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01fc, code lost:
    
        if (r16 != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01fe, code lost:
    
        r0.append(" ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x02f7, code lost:
    
        if (r6 != null) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x020e A[Catch: all -> 0x02ef, TryCatch #2 {all -> 0x02ef, blocks: (B:50:0x011d, B:52:0x0123, B:54:0x0135, B:57:0x014f, B:59:0x01cd, B:64:0x01eb, B:65:0x0208, B:68:0x0215, B:70:0x021b, B:71:0x0225, B:75:0x0231, B:76:0x023d, B:78:0x0243, B:81:0x024f, B:84:0x0261, B:86:0x0267, B:89:0x028a, B:91:0x02b3, B:93:0x02bf, B:94:0x02c3, B:96:0x02d6, B:99:0x02e5, B:102:0x02df, B:103:0x026e, B:105:0x0274, B:107:0x027a, B:108:0x0281, B:112:0x020e, B:114:0x01f1, B:116:0x01f9, B:118:0x01fe, B:120:0x0205, B:45:0x02f2), top: B:49:0x011d, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.rrg a(android.content.Context r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 807
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rrh.a(android.content.Context, java.lang.String):rrg");
    }

    public final synchronized boolean b(Context context) {
        if (!this.i) {
            this.i = true;
            this.j = d(context);
        }
        return this.j;
    }
}
