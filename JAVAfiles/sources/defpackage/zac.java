package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zac extends gdk {
    private static final xze a = xze.g("BugleContacts", "ContactListPagingSource");
    private final ahqr b;
    private final mjx c;
    private final ifq d;

    /* JADX WARN: Type inference failed for: r1v1, types: [alhr, java.lang.Object] */
    public zac(ahqr ahqrVar, ifq ifqVar) {
        this.b = ahqrVar;
        this.d = ifqVar;
        mjx mjxVar = (mjx) ifqVar.c.get();
        mjxVar.getClass();
        this.c = mjxVar;
    }

    private final xyo c(gdg gdgVar) {
        xyo c = a.c();
        c.z("pagingKey", gdgVar.a());
        c.x("size", gdgVar.b);
        return c;
    }

    @Override // defpackage.gdk
    public final /* bridge */ /* synthetic */ Object a(gdl gdlVar) {
        mkj mkjVar;
        Integer num = gdlVar.b;
        if (num != null) {
            mkjVar = mjx.c(num);
        } else {
            mkjVar = null;
        }
        xyo c = a.c();
        Objects.toString(mkjVar);
        c.H("Refreshing from key ".concat(String.valueOf(mkjVar)));
        c.q();
        return mkjVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:1|(2:3|(17:5|6|7|(2:160|(1:(1:(4:164|165|166|128)(2:167|168))(4:169|170|171|101))(4:172|173|174|30))(8:9|10|11|13|14|15|(4:17|18|19|(3:(2:22|(1:68)(1:26))(2:69|(1:71)(2:72|73))|27|(2:29|30))(2:74|75))(2:86|(4:88|89|90|(2:92|(5:94|(1:96)|97|98|(2:100|101))(2:102|103))(2:104|105))(2:116|(4:118|119|120|(2:122|(3:124|125|(2:127|128))(2:129|130))(2:131|132))(2:143|144)))|67)|31|32|(1:34)(1:63)|35|(1:37)(1:62)|38|(7:41|(1:43)|44|45|46|47|39)|56|57|58|59|52|53))|182|6|7|(0)(0)|31|32|(0)(0)|35|(0)(0)|38|(1:39)|56|57|58|59|52|53|(2:(0)|(1:156))) */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x012b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x032b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x032c, code lost:
    
        r20 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:160:0x002c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x024d A[Catch: all -> 0x0127, Exception -> 0x032b, TryCatch #3 {Exception -> 0x032b, blocks: (B:32:0x0245, B:34:0x024d, B:35:0x0265, B:37:0x026b, B:38:0x027a, B:39:0x02df, B:41:0x02e5, B:43:0x02ed, B:44:0x02f0), top: B:31:0x0245 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x026b A[Catch: all -> 0x0127, Exception -> 0x032b, TryCatch #3 {Exception -> 0x032b, blocks: (B:32:0x0245, B:34:0x024d, B:35:0x0265, B:37:0x026b, B:38:0x027a, B:39:0x02df, B:41:0x02e5, B:43:0x02ed, B:44:0x02f0), top: B:31:0x0245 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02e5 A[Catch: all -> 0x0127, Exception -> 0x032b, TryCatch #3 {Exception -> 0x032b, blocks: (B:32:0x0245, B:34:0x024d, B:35:0x0265, B:37:0x026b, B:38:0x027a, B:39:0x02df, B:41:0x02e5, B:43:0x02ed, B:44:0x02f0), top: B:31:0x0245 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006f  */
    /* JADX WARN: Type inference failed for: r0v72, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [ahqr] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, gdg] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3, types: [ahqq] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r4v16, types: [zac] */
    /* JADX WARN: Type inference failed for: r4v2, types: [zab, arpe] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v5, types: [zac] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9, types: [zac] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r6v0, types: [int] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v21, types: [akrh] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v16, types: [akrh] */
    @Override // defpackage.gdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.gdg r20, defpackage.arpe r21) {
        /*
            Method dump skipped, instructions count: 964
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zac.b(gdg, arpe):java.lang.Object");
    }

    @Override // defpackage.gdk
    public final boolean d() {
        return true;
    }
}
