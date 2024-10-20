package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hrr implements hns {
    private Object a;
    private final /* synthetic */ int b;
    private final Object c;
    private final Object d;

    public hrr(Uri uri, gpx gpxVar, int i) {
        this.b = i;
        this.d = uri;
        this.c = gpxVar;
    }

    public static hrr b(Context context, Uri uri, hok hokVar) {
        return new hrr(uri, new gpx(hkz.b(context).c.b().q(), hokVar, hkz.b(context).e, context.getContentResolver()), 1);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [hrs, java.lang.Object] */
    @Override // defpackage.hns
    public final Class a() {
        if (this.b != 0) {
            return InputStream.class;
        }
        return this.d.a();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [hrs, java.lang.Object] */
    @Override // defpackage.hns
    public final void d() {
        if (this.b != 0) {
            Object obj = this.a;
            if (obj != null) {
                try {
                    ((InputStream) obj).close();
                    return;
                } catch (IOException unused) {
                    return;
                }
            }
            return;
        }
        Object obj2 = this.a;
        if (obj2 != null) {
            try {
                this.d.c(obj2);
            } catch (IOException unused2) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002b, code lost:
    
        if (r4 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002d, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0030, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0047, code lost:
    
        if (r4 != null) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00e5: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:230), block:B:83:0x00e5 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e A[Catch: FileNotFoundException -> 0x00ec, TRY_LEAVE, TryCatch #11 {FileNotFoundException -> 0x00ec, blocks: (B:15:0x0007, B:73:0x0025, B:23:0x004a, B:28:0x008e, B:33:0x00d8, B:34:0x00de, B:43:0x00d4, B:58:0x0052, B:60:0x005d, B:62:0x0067, B:64:0x006b, B:67:0x0077, B:68:0x008a, B:21:0x002d, B:85:0x00e8, B:86:0x00eb, B:30:0x0092, B:49:0x00ba, B:51:0x00c0), top: B:14:0x0007, inners: #7, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d8 A[Catch: FileNotFoundException -> 0x00ec, TryCatch #11 {FileNotFoundException -> 0x00ec, blocks: (B:15:0x0007, B:73:0x0025, B:23:0x004a, B:28:0x008e, B:33:0x00d8, B:34:0x00de, B:43:0x00d4, B:58:0x0052, B:60:0x005d, B:62:0x0067, B:64:0x006b, B:67:0x0077, B:68:0x008a, B:21:0x002d, B:85:0x00e8, B:86:0x00eb, B:30:0x0092, B:49:0x00ba, B:51:0x00c0), top: B:14:0x0007, inners: #7, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e8 A[Catch: FileNotFoundException -> 0x00ec, TryCatch #11 {FileNotFoundException -> 0x00ec, blocks: (B:15:0x0007, B:73:0x0025, B:23:0x004a, B:28:0x008e, B:33:0x00d8, B:34:0x00de, B:43:0x00d4, B:58:0x0052, B:60:0x005d, B:62:0x0067, B:64:0x006b, B:67:0x0077, B:68:0x008a, B:21:0x002d, B:85:0x00e8, B:86:0x00eb, B:30:0x0092, B:49:0x00ba, B:51:0x00c0), top: B:14:0x0007, inners: #7, #9 }] */
    /* JADX WARN: Type inference failed for: r10v15, types: [hrs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [hnr] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r4v15, types: [hok, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Throwable, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.hns
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(defpackage.hlh r10, defpackage.hnr r11) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hrr.f(hlh, hnr):void");
    }

    @Override // defpackage.hns
    public final int g() {
        return 1;
    }

    public hrr(File file, hrs hrsVar, int i) {
        this.b = i;
        this.c = file;
        this.d = hrsVar;
    }

    @Override // defpackage.hns
    public final void eX() {
    }
}
