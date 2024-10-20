package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.ECPrivateKey;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aobc implements anng {
    private static final byte[] a = new byte[0];
    private static final byte[] b = {0};
    private static final byte[] c = {1, 2, 3};
    private final ECPrivateKey d;
    private final String e;
    private final aobj f;
    private final byte[] g;
    private final byte[] h;
    private final Provider i;

    private aobc(ECPrivateKey eCPrivateKey, aobr aobrVar, aobj aobjVar, byte[] bArr, byte[] bArr2) {
        if (anme.z(2)) {
            this.d = eCPrivateKey;
            this.e = aode.o(aobrVar);
            this.f = aobjVar;
            this.g = bArr;
            this.h = bArr2;
            this.i = ansq.a();
            return;
        }
        throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
    }

    public static anng a(anyj anyjVar) {
        byte[] bArr;
        Signature signature;
        int i;
        int i2;
        int i3;
        aobr aobrVar = (aobr) aobd.a.a(anyjVar.F().g);
        aobj aobjVar = (aobj) aobd.b.a(anyjVar.F().e);
        ECPrivateKey z = aode.z((aobi) aobd.c.a(anyjVar.F().f), ((BigInteger) anyjVar.f.a).toByteArray());
        byte[] c2 = anyjVar.I().c();
        if (anyjVar.F().h.equals(anyh.c)) {
            bArr = b;
        } else {
            bArr = a;
        }
        aobc aobcVar = new aobc(z, aobrVar, aobjVar, c2, bArr);
        annh b2 = aobd.b(anyjVar.e);
        try {
            byte[] bArr2 = c;
            String str = aobcVar.e;
            Provider provider = aobcVar.i;
            if (provider != null) {
                signature = Signature.getInstance(str, provider);
            } else {
                signature = (Signature) aobo.c.a(str);
            }
            signature.initSign(aobcVar.d);
            signature.update(bArr2);
            byte[] bArr3 = aobcVar.h;
            if (bArr3.length > 0) {
                signature.update(bArr3);
            }
            byte[] sign = signature.sign();
            if (aobcVar.f == aobj.IEEE_P1363) {
                int v = aode.v(aobcVar.d.getParams().getCurve());
                int i4 = v + v;
                if (aode.I(sign)) {
                    byte[] bArr4 = new byte[i4];
                    if ((sign[1] & 255) >= 128) {
                        i = 3;
                    } else {
                        i = 2;
                    }
                    int i5 = i + 1;
                    int i6 = i + 2;
                    int i7 = sign[i5];
                    if (sign[i6] == 0) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    System.arraycopy(sign, i6 + i2, bArr4, ((i4 / 2) - i7) + i2, i7 - i2);
                    int i8 = i6 + i7 + 1;
                    int i9 = i8 + 1;
                    int i10 = sign[i8];
                    if (sign[i9] == 0) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    System.arraycopy(sign, i9 + i3, bArr4, (i4 - i10) + i3, i10 - i3);
                    sign = bArr4;
                } else {
                    throw new GeneralSecurityException("Invalid DER encoding");
                }
            }
            byte[] bArr5 = aobcVar.g;
            if (bArr5.length != 0) {
                sign = aode.O(bArr5, sign);
            }
            b2.a(sign, bArr2);
            return aobcVar;
        } catch (GeneralSecurityException e) {
            throw new GeneralSecurityException("ECDSA signing with private key followed by verifying with public key failed. The key may be corrupted.", e);
        }
    }
}
