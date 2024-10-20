package defpackage;

import android.content.Context;
import android.os.StatFs;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import java.io.File;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xng {
    public static final xze a = xze.g("Bugle", "CopyFileTelephonyParts");
    public static final Pattern b = Pattern.compile("conversation_\\d+_message_\\d+_part_(\\d+)_.bin");
    private static final utz d = uuh.f(uuh.b, "maximum_cache_size_bytes", 209715200);
    private static final utz e = uuh.f(uuh.b, "minimum_available_free_disk_space", 314572800);
    public final anen c;
    private final Context f;
    private final armf g;
    private final armf h;
    private final armf i;

    public xng(Context context, anen anenVar, armf armfVar, armf armfVar2, armf armfVar3) {
        this.f = context;
        this.c = anenVar;
        this.g = armfVar;
        this.h = armfVar2;
        this.i = armfVar3;
    }

    public static boolean d(File file) {
        try {
            return file.delete();
        } catch (Throwable th) {
            xyo e2 = a.e();
            e2.H("Unable to delete file");
            e2.z("file", file.getAbsolutePath());
            e2.r(th);
            return false;
        }
    }

    public final File a() {
        File file = new File(this.f.getCacheDir(), "telephony_cache");
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(long j) {
        tbs d2 = PartsTable.d();
        d2.w("currentSizeUsage");
        d2.g(new xgv(14));
        d2.q();
        long j2 = d2.b().j(PartsTable.d.R, "SUM");
        if (j2 <= j && e()) {
            return;
        }
        tbs d3 = PartsTable.d();
        d3.w("garbageCollectOldestUntilSizeIsMet1");
        d3.g(new xgv(16));
        d3.d(new xgv(15));
        d3.h(new atkn((Object) PartsTable.d.j, true));
        String str = (String) PartsTable.c.get(PartsTable.d.S.d());
        if (str != null) {
            d3.a.c = str;
            tbn tbnVar = (tbn) d3.b().n();
            while (tbnVar.moveToNext() && (j2 > j || !e())) {
                try {
                    String R = tbnVar.R();
                    albo.C(R);
                    File file = new File(R);
                    if (!file.exists() || d(file)) {
                        tbt tbtVar = new tbt();
                        tbtVar.aj("garbageCollectOldestUntilSizeIsMet2");
                        tbtVar.m();
                        tbtVar.i();
                        tbtVar.v(new xgt(tbnVar, 16));
                        tbtVar.a().e();
                        j2 -= tbnVar.m();
                    }
                } catch (Throwable th) {
                    try {
                        tbnVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            tbnVar.close();
            return;
        }
        throw new IllegalArgumentException("column null does not have a single index");
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0251, code lost:
    
        if (r9.exists() == false) goto L138;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0203 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[Catch: IOException -> 0x020d, FileNotFoundException -> 0x020f, all -> 0x0259, SYNTHETIC, TRY_LEAVE, TryCatch #14 {all -> 0x0259, blocks: (B:78:0x01d4, B:117:0x0227, B:41:0x020c, B:40:0x0209), top: B:20:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x029b A[Catch: SQLiteDiskIOException -> 0x029f, TryCatch #17 {SQLiteDiskIOException -> 0x029f, blocks: (B:58:0x0295, B:60:0x029b, B:61:0x029e, B:85:0x0284, B:123:0x024d, B:113:0x0253, B:110:0x027d), top: B:20:0x00a9 }] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.String r20, android.net.Uri r21) {
        /*
            Method dump skipped, instructions count: 695
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xng.c(java.lang.String, android.net.Uri):void");
    }

    public final boolean e() {
        if (new StatFs(a().getAbsolutePath()).getAvailableBytes() > ((Long) e.e()).longValue()) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (((yjf) this.g.b()).m() && yhx.h(this.f) && ((yjr) this.h.b()).y()) {
            return true;
        }
        return false;
    }
}
