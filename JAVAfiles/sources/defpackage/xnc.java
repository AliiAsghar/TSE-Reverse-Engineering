package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xnc implements xhj {
    public static final /* synthetic */ int b = 0;
    private final wul d;
    private final wzs e;
    private final armf f;
    private final Context g;
    private final xnf h;
    private static final xze c = xze.g("Bugle", "PartTableDetectionHeuristic");
    static final uuf a = uuh.r(153021568, "restore_settings_after_bugle_wipeout");

    public xnc(Context context, znj znjVar, wzs wzsVar, armf armfVar) {
        this.g = context;
        aiwl a2 = wus.a();
        a2.i(wuk.PART_WIPEOUT_HEURISTIC);
        a2.k(xnd.a);
        wul ab = znjVar.ab(a2.f());
        this.d = ab;
        this.e = wzsVar;
        this.f = armfVar;
        this.h = new xnf(context, ab);
    }

    private final void b() {
        this.h.a(Uri.parse("content://mms/2047483647/part"), new xnb(0));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00e0 A[Catch: apba -> 0x0148, TRY_ENTER, TryCatch #1 {apba -> 0x0148, blocks: (B:2:0x0000, B:4:0x0011, B:6:0x003c, B:7:0x0051, B:10:0x0056, B:15:0x00e0, B:16:0x00e3, B:18:0x00e9, B:20:0x00f7, B:22:0x00ff, B:23:0x010b, B:25:0x0114, B:27:0x011c, B:29:0x012b, B:43:0x0147, B:48:0x0144, B:45:0x013f, B:32:0x007d, B:34:0x0083, B:36:0x0095, B:37:0x0098, B:39:0x00c3, B:40:0x00c6, B:13:0x00da), top: B:1:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e9 A[Catch: apba -> 0x0148, TryCatch #1 {apba -> 0x0148, blocks: (B:2:0x0000, B:4:0x0011, B:6:0x003c, B:7:0x0051, B:10:0x0056, B:15:0x00e0, B:16:0x00e3, B:18:0x00e9, B:20:0x00f7, B:22:0x00ff, B:23:0x010b, B:25:0x0114, B:27:0x011c, B:29:0x012b, B:43:0x0147, B:48:0x0144, B:45:0x013f, B:32:0x007d, B:34:0x0083, B:36:0x0095, B:37:0x0098, B:39:0x00c3, B:40:0x00c6, B:13:0x00da), top: B:1:0x0000, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0114 A[Catch: apba -> 0x0148, TryCatch #1 {apba -> 0x0148, blocks: (B:2:0x0000, B:4:0x0011, B:6:0x003c, B:7:0x0051, B:10:0x0056, B:15:0x00e0, B:16:0x00e3, B:18:0x00e9, B:20:0x00f7, B:22:0x00ff, B:23:0x010b, B:25:0x0114, B:27:0x011c, B:29:0x012b, B:43:0x0147, B:48:0x0144, B:45:0x013f, B:32:0x007d, B:34:0x0083, B:36:0x0095, B:37:0x0098, B:39:0x00c3, B:40:0x00c6, B:13:0x00da), top: B:1:0x0000, inners: #0, #2 }] */
    @Override // defpackage.xhj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j$.util.Optional a() {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xnc.a():j$.util.Optional");
    }
}
