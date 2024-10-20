package defpackage;

import java.io.ByteArrayOutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atpj {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(java.lang.Exception r5, defpackage.arpe r6) {
        /*
            boolean r0 = r6 instanceof defpackage.atpi
            if (r0 == 0) goto L13
            r0 = r6
            atpi r0 = (defpackage.atpi) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            atpi r0 = new atpi
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2b:
            java.lang.Object r5 = r0.a
            defpackage.aqil.P(r6)
            goto L50
        L31:
            defpackage.aqil.P(r6)
            r0.a = r5
            r0.c = r3
            arwb r6 = defpackage.arws.a
            arpi r2 = r0.u()
            atep r3 = new atep
            r4 = 10
            r3.<init>(r0, r5, r4)
            r6.a(r2, r3)
            arpl r5 = defpackage.arpl.a
            r0.getClass()
            if (r5 != r1) goto L50
            return r1
        L50:
            armj r5 = new armj
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atpj.a(java.lang.Exception, arpe):java.lang.Object");
    }

    public static int b(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static String c(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (byte b : bArr) {
            byteArrayOutputStream.write("0123456789ABCDEF".charAt((b & 255) >> 4));
            byteArrayOutputStream.write("0123456789ABCDEF".charAt(b & 15));
        }
        return new String(byteArrayOutputStream.toByteArray());
    }
}
