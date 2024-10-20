package defpackage;

import android.app.Notification;
import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dyh {
    public dyh() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Notification.Action action) {
        boolean isContextual;
        isContextual = action.isContextual();
        return isContextual;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object b(java.io.File r4, defpackage.arqr r5, defpackage.arpe r6) {
        /*
            boolean r0 = r6 instanceof defpackage.eiq
            if (r0 == 0) goto L13
            r0 = r6
            eiq r0 = (defpackage.eiq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            eiq r0 = new eiq
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.a
            defpackage.aqil.P(r6)     // Catch: java.io.IOException -> L29
            goto L41
        L29:
            r5 = move-exception
            goto L42
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.aqil.P(r6)
            r0.a = r4     // Catch: java.io.IOException -> L29
            r0.c = r3     // Catch: java.io.IOException -> L29
            java.lang.Object r6 = r5.a(r0)     // Catch: java.io.IOException -> L29
            if (r6 != r1) goto L41
            return r1
        L41:
            return r6
        L42:
            boolean r6 = r5 instanceof defpackage.ehm
            if (r6 != 0) goto La8
            r4.getClass()
            java.io.File r4 = (java.io.File) r4
            boolean r6 = r4.exists()
            if (r6 == 0) goto La3
            boolean r6 = r4.isFile()
            if (r6 == 0) goto L7d
            boolean r6 = r4.canRead()
            if (r6 == 0) goto L6d
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L68
            java.io.IOException r4 = c(r4, r5)
            goto La7
        L68:
            java.io.IOException r4 = c(r4, r5)
            goto La7
        L6d:
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L78
            java.io.IOException r4 = c(r4, r5)
            goto La7
        L78:
            java.io.IOException r4 = c(r4, r5)
            goto La7
        L7d:
            boolean r6 = r4.canRead()
            if (r6 == 0) goto L93
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L8e
            java.io.IOException r4 = c(r4, r5)
            goto La7
        L8e:
            java.io.IOException r4 = c(r4, r5)
            goto La7
        L93:
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L9e
            java.io.IOException r4 = c(r4, r5)
            goto La7
        L9e:
            java.io.IOException r4 = c(r4, r5)
            goto La7
        La3:
            java.io.IOException r4 = c(r4, r5)
        La7:
            throw r4
        La8:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dyh.b(java.io.File, arqr, arpe):java.lang.Object");
    }

    public static IOException c(File file, IOException iOException) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return g(file, iOException);
        }
        if (parentFile.exists()) {
            if (parentFile.isFile()) {
                if (parentFile.canRead()) {
                    if (parentFile.canWrite()) {
                        return g(file, iOException);
                    }
                    return g(file, iOException);
                }
                if (parentFile.canWrite()) {
                    return g(file, iOException);
                }
                return g(file, iOException);
            }
            if (parentFile.canRead()) {
                if (parentFile.canWrite()) {
                    return g(file, iOException);
                }
                return g(file, iOException);
            }
            if (parentFile.canWrite()) {
                return g(file, iOException);
            }
            return g(file, iOException);
        }
        return g(file, iOException);
    }

    public static boolean e(gef gefVar, gef gefVar2, gbb gbbVar) {
        gbbVar.getClass();
        if (gefVar2 == null) {
            return true;
        }
        if ((gefVar2 instanceof gee) && (gefVar instanceof ged)) {
            return true;
        }
        if ((gefVar instanceof gee) && (gefVar2 instanceof ged)) {
            return false;
        }
        if (gefVar.e != gefVar2.e || gefVar.f != gefVar2.f || gefVar2.a(gbbVar) > gefVar.a(gbbVar)) {
            return true;
        }
        return false;
    }

    public static void f(hh hhVar, int i, int i2, int i3, int i4, Object obj) {
        int i5 = i - i3;
        if (i5 > 0) {
            hhVar.a(i3, i5, obj);
        }
        int i6 = i4 - i2;
        if (i6 > 0) {
            hhVar.a(i2, i6, obj);
        }
    }

    private static IOException g(File file, IOException iOException) {
        StringBuilder sb = new StringBuilder("Inoperable file:");
        try {
            sb.append(" canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + ']');
        } catch (IOException unused) {
            sb.append(" failed to attach additional metadata");
        }
        return new IOException(sb.toString(), iOException);
    }

    public dyh(byte[] bArr) {
    }

    public Object d(arqv arqvVar, arpe arpeVar) {
        return this;
    }
}
