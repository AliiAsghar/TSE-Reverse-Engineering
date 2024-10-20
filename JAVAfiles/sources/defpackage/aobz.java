package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Signature;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aobz implements anng {
    private static final byte[] a = new byte[0];
    private static final byte[] b = {0};
    private static final byte[] c = {1, 2, 3};
    private final RSAPrivateCrtKey d;
    private final RSAPublicKey e;
    private final String f;
    private final byte[] g;
    private final byte[] h;

    private aobz(RSAPrivateCrtKey rSAPrivateCrtKey, aobr aobrVar, byte[] bArr, byte[] bArr2) {
        if (anme.z(2)) {
            aoci.d(aobrVar);
            aoci.b(rSAPrivateCrtKey.getModulus().bitLength());
            aoci.c(rSAPrivateCrtKey.getPublicExponent());
            this.d = rSAPrivateCrtKey;
            aoci.d(aobrVar);
            this.f = aobrVar.toString().concat("withRSA");
            this.e = (RSAPublicKey) ((KeyFactory) aobo.g.a("RSA")).generatePublic(new RSAPublicKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent()));
            this.g = bArr;
            this.h = bArr2;
            return;
        }
        throw new GeneralSecurityException("Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
    }

    public static anng a(anza anzaVar) {
        byte[] bArr;
        KeyFactory keyFactory = (KeyFactory) aobo.g.a("RSA");
        BigInteger bigInteger = anzaVar.e.f;
        BigInteger bigInteger2 = anzaVar.F().g;
        Object obj = anzaVar.f.a;
        Object obj2 = anzaVar.g.a;
        Object obj3 = anzaVar.h.a;
        Object obj4 = anzaVar.i.a;
        BigInteger bigInteger3 = (BigInteger) anzaVar.j.a;
        BigInteger bigInteger4 = (BigInteger) obj4;
        BigInteger bigInteger5 = (BigInteger) obj3;
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(bigInteger, bigInteger2, (BigInteger) obj, (BigInteger) obj2, bigInteger5, bigInteger4, bigInteger3, (BigInteger) anzaVar.k.a));
        aobr aobrVar = (aobr) aocb.a.a(anzaVar.F().i);
        byte[] c2 = anzaVar.I().c();
        if (anzaVar.F().h.equals(anyy.c)) {
            bArr = b;
        } else {
            bArr = a;
        }
        aobz aobzVar = new aobz(rSAPrivateCrtKey, aobrVar, c2, bArr);
        annh b2 = aocb.b(anzaVar.e);
        try {
            byte[] bArr2 = c;
            Signature signature = (Signature) aobo.c.a(aobzVar.f);
            signature.initSign(aobzVar.d);
            signature.update(bArr2);
            byte[] bArr3 = aobzVar.h;
            if (bArr3.length > 0) {
                signature.update(bArr3);
            }
            byte[] sign = signature.sign();
            Signature signature2 = (Signature) aobo.c.a(aobzVar.f);
            signature2.initVerify(aobzVar.e);
            signature2.update(bArr2);
            byte[] bArr4 = aobzVar.h;
            if (bArr4.length > 0) {
                signature2.update(bArr4);
            }
            if (signature2.verify(sign)) {
                byte[] bArr5 = aobzVar.g;
                if (bArr5.length != 0) {
                    sign = aode.O(bArr5, sign);
                }
                b2.a(sign, bArr2);
                return aobzVar;
            }
            throw new RuntimeException("Security bug: RSA signature computation error");
        } catch (GeneralSecurityException e) {
            throw new GeneralSecurityException("RsaSsaPkcs1 signing with private key followed by verifying with public key failed. The key may be corrupted.", e);
        }
    }
}
