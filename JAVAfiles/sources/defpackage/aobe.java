package defpackage;

import java.security.interfaces.ECPrivateKey;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aobe implements anmu {
    private final ECPrivateKey a;
    private final String b;
    private final byte[] c;
    private final aobk d;
    private final anrv e;
    private final byte[] f;
    private final ahmn g;

    public aobe(ECPrivateKey eCPrivateKey, byte[] bArr, String str, aobk aobkVar, anrv anrvVar, byte[] bArr2) {
        this.a = eCPrivateKey;
        this.g = new ahmn(eCPrivateKey, null);
        this.c = bArr;
        this.b = str;
        this.d = aobkVar;
        this.e = anrvVar;
        this.f = bArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.security.interfaces.ECPrivateKey, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.security.interfaces.ECPrivateKey, java.lang.Object] */
    @Override // defpackage.anmu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] a(byte[] r10, byte[] r11) {
        /*
            r9 = this;
            byte[] r0 = r9.f
            boolean r0 = defpackage.anuk.e(r0, r10)
            if (r0 == 0) goto L6d
            byte[] r0 = r9.f
            java.security.interfaces.ECPrivateKey r1 = r9.a
            java.security.spec.ECParameterSpec r1 = r1.getParams()
            java.security.spec.EllipticCurve r1 = r1.getCurve()
            aobk r2 = r9.d
            int r1 = defpackage.aode.v(r1)
            int r2 = r2.ordinal()
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 == r3) goto L31
            r3 = 2
            if (r2 != r3) goto L28
            int r1 = r1 + r1
            goto L32
        L28:
            java.security.GeneralSecurityException r10 = new java.security.GeneralSecurityException
            java.lang.String r11 = "unknown EC point format"
            r10.<init>(r11)
            throw r10
        L30:
            int r1 = r1 + r1
        L31:
            int r1 = r1 + r3
        L32:
            int r0 = r0.length
            int r2 = r10.length
            int r1 = r1 + r0
            if (r2 < r1) goto L65
            byte[] r3 = java.util.Arrays.copyOfRange(r10, r0, r1)
            ahmn r0 = r9.g
            java.lang.String r5 = r9.b
            byte[] r6 = r9.c
            anrv r2 = r9.e
            aobk r4 = r9.d
            int r8 = r2.a()
            java.lang.Object r2 = r0.a
            java.security.spec.ECParameterSpec r2 = r2.getParams()
            java.security.interfaces.ECPublicKey r2 = defpackage.aode.D(r2, r4, r3)
            java.lang.Object r0 = r0.a
            byte[] r4 = defpackage.aode.J(r0, r2)
            r7 = r11
            byte[] r11 = defpackage.aode.r(r3, r4, r5, r6, r7, r8)
            anrv r0 = r9.e
            byte[] r10 = r0.b(r11, r10, r1)
            return r10
        L65:
            java.security.GeneralSecurityException r10 = new java.security.GeneralSecurityException
            java.lang.String r11 = "ciphertext too short"
            r10.<init>(r11)
            throw r10
        L6d:
            java.security.GeneralSecurityException r10 = new java.security.GeneralSecurityException
            java.lang.String r11 = "Invalid ciphertext (output prefix mismatch)"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aobe.a(byte[], byte[]):byte[]");
    }
}
