package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class job {
    private static final alvi c = alvi.m("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/copier/LegacyAttachmentCopier");
    public final Context a;
    public final uff b;
    private final arpi d;

    public job(Context context, arpi arpiVar, uff uffVar) {
        context.getClass();
        arpiVar.getClass();
        uffVar.getClass();
        this.a = context;
        this.d = arpiVar;
        this.b = uffVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.net.Uri r11, defpackage.arpe r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.jnz
            if (r0 == 0) goto L13
            r0 = r12
            jnz r0 = (defpackage.jnz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            jnz r0 = new jnz
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            akrh r11 = r0.d
            defpackage.aqil.P(r12)     // Catch: java.lang.Throwable -> L2a
            goto L72
        L2a:
            r12 = move-exception
            goto L7d
        L2c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L34:
            defpackage.aqil.P(r12)
            java.lang.String r12 = "LegacyAttachmentCopier#copy"
            akrh r12 = defpackage.aktp.e(r12)
            alvi r2 = defpackage.job.c     // Catch: java.lang.Throwable -> L79
            alvw r2 = r2.e()     // Catch: java.lang.Throwable -> L79
            alvz r5 = defpackage.alwp.a     // Catch: java.lang.Throwable -> L79
            java.lang.String r6 = "BugleComposeRow2"
            r2.X(r5, r6)     // Catch: java.lang.Throwable -> L79
            java.lang.String r5 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/copier/LegacyAttachmentCopier"
            java.lang.String r6 = "copy"
            java.lang.String r7 = "LegacyAttachmentCopier.kt"
            r8 = 36
            alvw r2 = r2.h(r5, r6, r8, r7)     // Catch: java.lang.Throwable -> L79
            alvg r2 = (defpackage.alvg) r2     // Catch: java.lang.Throwable -> L79
            java.lang.String r5 = "Copying %s in scratch space"
            r2.t(r5, r11)     // Catch: java.lang.Throwable -> L79
            arpi r2 = r10.d     // Catch: java.lang.Throwable -> L79
            jli r5 = new jli     // Catch: java.lang.Throwable -> L79
            r6 = 3
            r5.<init>(r10, r11, r3, r6)     // Catch: java.lang.Throwable -> L79
            r0.d = r12     // Catch: java.lang.Throwable -> L79
            r0.c = r4     // Catch: java.lang.Throwable -> L79
            java.lang.Object r11 = defpackage.arro.q(r2, r5, r0)     // Catch: java.lang.Throwable -> L79
            if (r11 == r1) goto L78
            r9 = r12
            r12 = r11
            r11 = r9
        L72:
            android.net.Uri r12 = (android.net.Uri) r12     // Catch: java.lang.Throwable -> L2a
            defpackage.armd.i(r11, r3)
            return r12
        L78:
            return r1
        L79:
            r11 = move-exception
            r9 = r12
            r12 = r11
            r11 = r9
        L7d:
            throw r12     // Catch: java.lang.Throwable -> L7e
        L7e:
            r0 = move-exception
            defpackage.armd.i(r11, r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.job.a(android.net.Uri, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(android.net.Uri r13, defpackage.arpe r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof defpackage.joa
            if (r0 == 0) goto L13
            r0 = r14
            joa r0 = (defpackage.joa) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            joa r0 = new joa
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            akrh r13 = r0.d
            defpackage.aqil.P(r14)     // Catch: java.lang.Throwable -> L29
            goto L7a
        L29:
            r14 = move-exception
            goto L86
        L2b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L33:
            defpackage.aqil.P(r14)
            boolean r14 = r12.c(r13)
            if (r14 == 0) goto L8c
            java.lang.String r14 = "LegacyAttachmentCopier#delete"
            akrh r14 = defpackage.aktp.e(r14)
            alvi r2 = defpackage.job.c     // Catch: java.lang.Throwable -> L82
            alvw r2 = r2.e()     // Catch: java.lang.Throwable -> L82
            alvz r4 = defpackage.alwp.a     // Catch: java.lang.Throwable -> L82
            java.lang.String r5 = "BugleComposeRow2"
            r2.X(r4, r5)     // Catch: java.lang.Throwable -> L82
            java.lang.String r4 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/copier/LegacyAttachmentCopier"
            java.lang.String r5 = "delete"
            java.lang.String r6 = "LegacyAttachmentCopier.kt"
            r7 = 48
            alvw r2 = r2.h(r4, r5, r7, r6)     // Catch: java.lang.Throwable -> L82
            alvg r2 = (defpackage.alvg) r2     // Catch: java.lang.Throwable -> L82
            java.lang.String r4 = "Deleting copy %s from scratch space"
            r2.t(r4, r13)     // Catch: java.lang.Throwable -> L82
            arpi r2 = r12.d     // Catch: java.lang.Throwable -> L82
            jli r10 = new jli     // Catch: java.lang.Throwable -> L82
            r8 = 4
            r9 = 0
            r7 = 0
            r4 = r10
            r5 = r12
            r6 = r13
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L82
            r0.d = r14     // Catch: java.lang.Throwable -> L82
            r0.c = r3     // Catch: java.lang.Throwable -> L82
            java.lang.Object r13 = defpackage.arro.q(r2, r10, r0)     // Catch: java.lang.Throwable -> L82
            if (r13 == r1) goto L81
            r13 = r14
        L7a:
            r14 = 0
            defpackage.armd.i(r13, r14)
            arnb r13 = defpackage.arnb.a
            return r13
        L81:
            return r1
        L82:
            r13 = move-exception
            r11 = r14
            r14 = r13
            r13 = r11
        L86:
            throw r14     // Catch: java.lang.Throwable -> L87
        L87:
            r0 = move-exception
            defpackage.armd.i(r13, r14)
            throw r0
        L8c:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "Failed requirement."
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.job.b(android.net.Uri, arpe):java.lang.Object");
    }

    public final boolean c(Uri uri) {
        uri.getClass();
        return this.b.k(uri);
    }
}
