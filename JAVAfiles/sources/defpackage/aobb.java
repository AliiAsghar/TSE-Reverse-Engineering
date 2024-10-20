package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aobb implements anmt {
    public final byte[] b;
    public final byte[] c;
    private final aobv f;
    private static final Collection d = Arrays.asList(64);
    private static final byte[] e = new byte[16];
    public static final ThreadLocal a = new aoba();

    private aobb(byte[] bArr, aocj aocjVar) {
        if (anme.z(1)) {
            int length = bArr.length;
            if (d.contains(Integer.valueOf(length))) {
                int i = length >> 1;
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i);
                this.b = Arrays.copyOfRange(bArr, i, length);
                this.f = new aobv(copyOfRange);
                this.c = aocjVar.c();
                return;
            }
            throw new InvalidKeyException(a.cb(length, "invalid key size: ", " bytes; key must have 64 bytes"));
        }
        throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
    }

    public static anmt a(anqj anqjVar) {
        return new aobb(anqjVar.h.y(), anqjVar.f);
    }

    public final byte[] b(byte[]... bArr) {
        byte[] P;
        byte[] a2 = this.f.a(e, 16);
        for (char c = 0; c <= 0; c = 1) {
            byte[] bArr2 = bArr[0];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            a2 = aode.P(anme.s(a2), this.f.a(bArr2, 16));
        }
        byte[] bArr3 = bArr[1];
        int length = bArr3.length;
        if (length >= 16) {
            int length2 = a2.length;
            if (length >= length2) {
                P = Arrays.copyOf(bArr3, length);
                for (int i = 0; i < a2.length; i++) {
                    int i2 = (length - length2) + i;
                    P[i2] = (byte) (P[i2] ^ a2[i]);
                }
            } else {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
        } else {
            P = aode.P(anme.r(bArr3), anme.s(a2));
        }
        return this.f.a(P, 16);
    }
}
