package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kfy extends gdk implements Closeable {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingSource");
    private final ahqr b;
    private final mjd c;
    private final kgb d;
    private final kgd e;
    private final kge f;
    private final piv g;
    private final kfm h = new kfm();
    private final kfz i;
    private final lxs j;
    private final jxv k;

    public kfy(ahqr ahqrVar, mjd mjdVar, jxv jxvVar, kgb kgbVar, kgd kgdVar, kge kgeVar, piv pivVar) {
        this.b = ahqrVar;
        this.c = mjdVar;
        this.k = jxvVar;
        this.d = kgbVar;
        this.e = kgdVar;
        this.f = kgeVar;
        this.g = pivVar;
        this.j = new lxs(mjdVar);
        this.i = new kfz(this, kgdVar, mjdVar);
    }

    private final void k(gdg gdgVar) {
        ((alvg) a.g().h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingSource", "logInfo", 405, "MessageListPagingSource.kt")).B("pagingKey: %s, load size: %d", gdgVar.a(), gdgVar.b);
    }

    private final void l(gdg gdgVar) {
        ((alvg) a.i().h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingSource", "logWarn", 409, "MessageListPagingSource.kt")).B("pagingKey: %s, load size: %d", gdgVar.a(), gdgVar.b);
    }

    private final void m(ahqq ahqqVar) {
        this.b.f(ahqqVar, mgv.b, null, ahqp.SUCCESS);
        ((alvg) a.g().h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingSource", "onPagingDone", 263, "MessageListPagingSource.kt")).q("MessageListPagingSource load complete.");
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [arwe, java.lang.Object] */
    private final dyi n(Exception exc) {
        if (exc instanceof kfi) {
            jxv jxvVar = this.k;
            qjh.l(jxvVar.a, null, new jsu(jxvVar, (arpe) null, 14), 3);
            this.d.a();
            if (this.d.b()) {
                ((alvg) a.i().h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingSource", "handlePagingError", 233, "MessageListPagingSource.kt")).q("Number of retries is over limit, returning loading error.");
                jxv jxvVar2 = this.k;
                qjh.l(jxvVar2.a, null, new jsu(jxvVar2, (arpe) null, 17, (short[]) null), 3);
                return new gdh(exc);
            }
            ((alvg) a.i().h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingSource", "handlePagingError", 237, "MessageListPagingSource.kt")).q("Paging error encountered. Retrying with source invalidation.");
            return new gdi();
        }
        jxv jxvVar3 = this.k;
        qjh.l(jxvVar3.a, null, new jsu(jxvVar3, (arpe) null, 16, (char[]) null), 3);
        this.d.a();
        if (this.d.b()) {
            ((alvg) a.i().h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingSource", "handlePagingError", 245, "MessageListPagingSource.kt")).q("Number of retries is over limit, returning loading error.");
            jxv jxvVar4 = this.k;
            qjh.l(jxvVar4.a, null, new jsu(jxvVar4, (arpe) null, 18, (int[]) null), 3);
            return new gdh(exc);
        }
        ((alvg) a.i().h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingSource", "handlePagingError", 249, "MessageListPagingSource.kt")).q("Paging error encountered. Retrying with source invalidation.");
        return new gdi();
    }

    @Override // defpackage.gdk
    public final /* bridge */ /* synthetic */ Object a(gdl gdlVar) {
        mjb mjbVar;
        Integer num = gdlVar.b;
        if (num != null) {
            mjbVar = this.c.b(num);
        } else {
            mjbVar = null;
        }
        ((alvg) a.g().h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingSource", "getRefreshKey", 72, "MessageListPagingSource.kt")).D("Refreshing from key %s and and position %d", mjbVar, gdlVar.b);
        return mjbVar;
    }

    @Override // defpackage.gdk
    public final Object b(gdg gdgVar, arpe arpeVar) {
        if (this.g.a()) {
            return j(gdgVar, arpeVar);
        }
        return i(gdgVar, arpeVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x04ca A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0511 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0322 A[Catch: all -> 0x073f, TryCatch #2 {all -> 0x073f, blocks: (B:31:0x0310, B:33:0x0322, B:35:0x0329, B:37:0x0335, B:38:0x033b, B:40:0x0341, B:42:0x0362, B:44:0x036c, B:46:0x0373, B:51:0x0398, B:54:0x03a5, B:61:0x03b5), top: B:30:0x0310 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0341 A[Catch: all -> 0x073f, TryCatch #2 {all -> 0x073f, blocks: (B:31:0x0310, B:33:0x0322, B:35:0x0329, B:37:0x0335, B:38:0x033b, B:40:0x0341, B:42:0x0362, B:44:0x036c, B:46:0x0373, B:51:0x0398, B:54:0x03a5, B:61:0x03b5), top: B:30:0x0310 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0398 A[Catch: all -> 0x073f, TryCatch #2 {all -> 0x073f, blocks: (B:31:0x0310, B:33:0x0322, B:35:0x0329, B:37:0x0335, B:38:0x033b, B:40:0x0341, B:42:0x0362, B:44:0x036c, B:46:0x0373, B:51:0x0398, B:54:0x03a5, B:61:0x03b5), top: B:30:0x0310 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03a5 A[Catch: all -> 0x073f, TryCatch #2 {all -> 0x073f, blocks: (B:31:0x0310, B:33:0x0322, B:35:0x0329, B:37:0x0335, B:38:0x033b, B:40:0x0341, B:42:0x0362, B:44:0x036c, B:46:0x0373, B:51:0x0398, B:54:0x03a5, B:61:0x03b5), top: B:30:0x0310 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r2v27, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v30, types: [mjb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v33, types: [mjd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v38, types: [mjd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v48, types: [mjd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v50, types: [mjd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10, types: [mjd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v16, types: [mjd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [int, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.gdg r28, defpackage.arpe r29) {
        /*
            Method dump skipped, instructions count: 1915
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kfy.c(gdg, arpe):java.lang.Object");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.i.close();
    }

    @Override // defpackage.gdk
    public final boolean d() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r12v5, types: [akrh] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(defpackage.gdg r11, defpackage.arpe r12) {
        /*
            Method dump skipped, instructions count: 198
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kfy.i(gdg, arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0095 A[Catch: all -> 0x00d9, TRY_LEAVE, TryCatch #5 {all -> 0x00d9, blocks: (B:21:0x008b, B:23:0x0095, B:27:0x00a4), top: B:20:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a4 A[Catch: all -> 0x00d9, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x00d9, blocks: (B:21:0x008b, B:23:0x0095, B:27:0x00a4), top: B:20:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r12v8, types: [akrh] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(defpackage.gdg r11, defpackage.arpe r12) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kfy.j(gdg, arpe):java.lang.Object");
    }
}
