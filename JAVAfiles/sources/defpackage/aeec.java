package defpackage;

import android.content.Context;
import java.io.File;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeec {
    private static final alvi a = alvi.m("com/google/android/libraries/abuse/hades/moirai/storage/ProtectionsPersistence");
    private static final asgm d = new asgm();
    private final Context b;
    private final aebz c;

    public aeec(Context context, aebz aebzVar) {
        context.getClass();
        this.b = context;
        this.c = aebzVar;
    }

    private final File f(aecj aecjVar) {
        String str = "moirai_persephone_scar";
        if (!d.F(aecjVar.b, "")) {
            str = String.format("%s_%s", Arrays.copyOf(new Object[]{"moirai_persephone_scar", aecjVar.b}, 2));
            str.getClass();
        }
        return this.b.getFileStreamPath(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.aecj r5, defpackage.arpe r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.aedy
            if (r0 == 0) goto L13
            r0 = r6
            aedy r0 = (defpackage.aedy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aedy r0 = new aedy
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            asgm r5 = r0.f
            aecj r1 = r0.e
            aeec r0 = r0.d
            defpackage.aqil.P(r6)
            r6 = r5
            r5 = r1
            goto L4b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            defpackage.aqil.P(r6)
            asgm r6 = defpackage.aeec.d
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.c = r3
            java.lang.Object r0 = r6.b(r0)
            if (r0 == r1) goto L83
            r0 = r4
        L4b:
            java.io.File r5 = r0.f(r5)     // Catch: java.lang.Throwable -> L7e
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L7e
            java.lang.String r1 = r5.getPath()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r2 = ".new"
            java.lang.String r1 = r1.concat(r2)     // Catch: java.lang.Throwable -> L7e
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L7e
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L7e
            java.lang.String r2 = r5.getPath()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r3 = ".bak"
            java.lang.String r2 = r2.concat(r3)     // Catch: java.lang.Throwable -> L7e
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L7e
            defpackage.dyd.h(r5, r0, r1)     // Catch: java.lang.Throwable -> L7e
            r6.d()
            arnb r5 = defpackage.arnb.a
            return r5
        L7e:
            r5 = move-exception
            r6.d()
            throw r5
        L83:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeec.a(aecj, arpe):java.lang.Object");
    }

    public final Object b(aecj aecjVar, arpe arpeVar) {
        aedh aedhVar = aedh.b;
        File f = f(aecjVar);
        f.getClass();
        return c(aecjVar, aedhVar, f, arpeVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:1|(2:3|(17:5|6|7|(1:(1:(6:11|12|13|14|15|16)(2:22|23))(3:24|25|26))(10:73|74|75|76|77|78|79|80|81|(1:83)(1:84))|27|28|(1:30)|31|(1:37)|38|39|40|41|42|43|44|45))|95|6|7|(0)(0)|27|28|(0)|31|(3:33|35|37)|38|39|40|41|42|43|44|45|(2:(1:51)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01d5, code lost:
    
        r1 = null;
        ((defpackage.alvg) defpackage.aeec.a.g().h("com/google/android/libraries/abuse/hades/moirai/storage/ProtectionsPersistence", "readInternal", 150, "ProtectionsPersistence.kt")).q("No previous Persephone sync found");
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3 A[Catch: all -> 0x00ff, TryCatch #7 {all -> 0x00ff, blocks: (B:28:0x0083, B:30:0x00b3, B:31:0x00b9, B:33:0x00bf, B:35:0x00c8, B:37:0x00ce, B:38:0x00e0, B:42:0x00ed, B:54:0x00fb, B:55:0x00fe, B:40:0x00e8, B:50:0x00f8), top: B:27:0x0083, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.aecj r18, defpackage.arqr r19, java.io.File r20, defpackage.arpe r21) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeec.c(aecj, arqr, java.io.File, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.aecj r18, defpackage.aote r19, defpackage.arqv r20, defpackage.arpe r21) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeec.d(aecj, aote, arqv, arpe):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:(2:3|(16:5|6|(1:(1:9)(2:56|57))(2:58|(1:60))|10|11|(1:13)|14|15|17|18|(1:20)|21|22|23|24|25))|10|11|(0)|14|15|17|18|(0)|21|22|23|24|25) */
    /* JADX WARN: Can't wrap try/catch for region: R(19:1|(2:3|(16:5|6|(1:(1:9)(2:56|57))(2:58|(1:60))|10|11|(1:13)|14|15|17|18|(1:20)|21|22|23|24|25))|61|6|(0)(0)|10|11|(0)|14|15|17|18|(0)|21|22|23|24|25|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b6, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b7, code lost:
    
        android.util.Log.e("AtomicFile", "Failed to close file output stream", r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00db, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00dc, code lost:
    
        ((defpackage.alvg) ((defpackage.alvg) defpackage.aeec.a.h()).g(r11).h("com/google/android/libraries/abuse/hades/moirai/storage/ProtectionsPersistence", "writeInternal", 132, "ProtectionsPersistence.kt")).t("Error writing persephone sync to file %s", ((java.io.File) r12).getAbsolutePath());
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ff, code lost:
    
        if (defpackage.dyd.g(r7) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0101, code lost:
    
        android.util.Log.e("AtomicFile", "Failed to sync file output stream");
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0104, code lost:
    
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0110, code lost:
    
        if (r6.delete() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0112, code lost:
    
        r6.toString();
        android.util.Log.e("AtomicFile", "Failed to delete new file ".concat(r6.toString()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0108, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0109, code lost:
    
        android.util.Log.e("AtomicFile", "Failed to close file output stream", r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009f, code lost:
    
        if (r6.getParentFile().mkdirs() != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x013c, code lost:
    
        r6.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x014e, code lost:
    
        throw new java.io.IOException("Failed to create directory for ".concat(r6.toString()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a1, code lost:
    
        r7 = new java.io.FileOutputStream(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0128, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0129, code lost:
    
        r6.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x013b, code lost:
    
        throw new java.io.IOException("Failed to create new file ".concat(r6.toString()), r11);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008b A[Catch: all -> 0x014f, TRY_LEAVE, TryCatch #5 {all -> 0x014f, blocks: (B:11:0x0059, B:13:0x008b, B:15:0x0091, B:43:0x0097, B:48:0x00a1, B:45:0x013c, B:46:0x014e, B:51:0x0129, B:52:0x013b, B:18:0x00a6, B:20:0x00af, B:22:0x00b2, B:30:0x00b7, B:23:0x00ba, B:32:0x00dc, B:34:0x0101, B:36:0x0104, B:42:0x0109, B:37:0x010c, B:39:0x0112), top: B:10:0x0059, inners: #0, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00af A[Catch: IOException -> 0x00db, all -> 0x014f, TRY_LEAVE, TryCatch #4 {IOException -> 0x00db, blocks: (B:18:0x00a6, B:20:0x00af, B:30:0x00b7, B:23:0x00ba), top: B:17:0x00a6, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.apbt r11, java.io.File r12, defpackage.arpe r13) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeec.e(apbt, java.io.File, arpe):java.lang.Object");
    }
}
