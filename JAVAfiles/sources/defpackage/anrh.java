package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anrh {
    public static final ansy a;
    public static final antv b;
    public static final antv c;
    public static final antv d;
    public static final antv e;
    public static final antv f;
    public static final antv g;
    private static final aocj h;
    private static final aocj i;
    private static final ansy j;
    private static final ansy k;
    private static final ansy l;

    static {
        aocj b2 = anuk.b("type.googleapis.com/google.crypto.tink.HpkePrivateKey");
        h = b2;
        aocj b3 = anuk.b("type.googleapis.com/google.crypto.tink.HpkePublicKey");
        i = b3;
        int i2 = 10;
        b = new antv(anrf.class, anub.class, new anoy(i2));
        c = new antv(b2, anub.class, new anoz(i2));
        d = new antv(anri.class, anua.class, new anpa(i2));
        f = new antv(b3, anua.class, new anpb(i2));
        int i3 = 11;
        e = new antv(anrg.class, anua.class, new anpa(i3));
        g = new antv(b2, anua.class, new anpb(i3));
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        anme.v(anxp.RAW, anre.c, hashMap, hashMap2);
        anme.v(anxp.TINK, anre.a, hashMap, hashMap2);
        anme.v(anxp.LEGACY, anre.b, hashMap, hashMap2);
        anme.v(anxp.CRUNCHY, anre.b, hashMap, hashMap2);
        a = anme.u(hashMap, hashMap2);
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        anme.v(anxa.DHKEM_P256_HKDF_SHA256, anrd.a, hashMap3, hashMap4);
        anme.v(anxa.DHKEM_P384_HKDF_SHA384, anrd.b, hashMap3, hashMap4);
        anme.v(anxa.DHKEM_P521_HKDF_SHA512, anrd.c, hashMap3, hashMap4);
        anme.v(anxa.DHKEM_X25519_HKDF_SHA256, anrd.f, hashMap3, hashMap4);
        j = anme.u(hashMap3, hashMap4);
        HashMap hashMap5 = new HashMap();
        HashMap hashMap6 = new HashMap();
        anme.v(anwz.HKDF_SHA256, anrc.a, hashMap5, hashMap6);
        anme.v(anwz.HKDF_SHA384, anrc.b, hashMap5, hashMap6);
        anme.v(anwz.HKDF_SHA512, anrc.c, hashMap5, hashMap6);
        k = anme.u(hashMap5, hashMap6);
        HashMap hashMap7 = new HashMap();
        HashMap hashMap8 = new HashMap();
        anme.v(anwy.AES_128_GCM, anra.a, hashMap7, hashMap8);
        anme.v(anwy.AES_256_GCM, anra.b, hashMap7, hashMap8);
        anme.v(anwy.CHACHA20_POLY1305, anra.c, hashMap7, hashMap8);
        l = anme.u(hashMap7, hashMap8);
    }

    public static anrf a(anxp anxpVar, anxc anxcVar) {
        anxa anxaVar;
        anwz anwzVar;
        anre anreVar = (anre) a.b(anxpVar);
        ansy ansyVar = j;
        int i2 = anxcVar.b;
        anwy anwyVar = null;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            anxaVar = null;
                        } else {
                            anxaVar = anxa.DHKEM_P521_HKDF_SHA512;
                        }
                    } else {
                        anxaVar = anxa.DHKEM_P384_HKDF_SHA384;
                    }
                } else {
                    anxaVar = anxa.DHKEM_P256_HKDF_SHA256;
                }
            } else {
                anxaVar = anxa.DHKEM_X25519_HKDF_SHA256;
            }
        } else {
            anxaVar = anxa.KEM_UNKNOWN;
        }
        if (anxaVar == null) {
            anxaVar = anxa.UNRECOGNIZED;
        }
        anrd anrdVar = (anrd) ansyVar.b(anxaVar);
        ansy ansyVar2 = k;
        int i3 = anxcVar.c;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        anwzVar = null;
                    } else {
                        anwzVar = anwz.HKDF_SHA512;
                    }
                } else {
                    anwzVar = anwz.HKDF_SHA384;
                }
            } else {
                anwzVar = anwz.HKDF_SHA256;
            }
        } else {
            anwzVar = anwz.KDF_UNKNOWN;
        }
        if (anwzVar == null) {
            anwzVar = anwz.UNRECOGNIZED;
        }
        anrc anrcVar = (anrc) ansyVar2.b(anwzVar);
        ansy ansyVar3 = l;
        int i4 = anxcVar.d;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        anwyVar = anwy.CHACHA20_POLY1305;
                    }
                } else {
                    anwyVar = anwy.AES_256_GCM;
                }
            } else {
                anwyVar = anwy.AES_128_GCM;
            }
        } else {
            anwyVar = anwy.AEAD_UNKNOWN;
        }
        if (anwyVar == null) {
            anwyVar = anwy.UNRECOGNIZED;
        }
        return new anrf(anrdVar, anrcVar, (anra) ansyVar3.b(anwyVar), anreVar);
    }

    public static anxc b(anrf anrfVar) {
        aozy createBuilder = anxc.a.createBuilder();
        anxa anxaVar = (anxa) j.a(anrfVar.e);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((anxc) createBuilder.b).b = anxaVar.a();
        anwz anwzVar = (anwz) k.a(anrfVar.f);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((anxc) createBuilder.b).c = anwzVar.a();
        anwy anwyVar = (anwy) l.a(anrfVar.g);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((anxc) createBuilder.b).d = anwyVar.a();
        return (anxc) createBuilder.s();
    }

    public static anxe c(anri anriVar) {
        aozy createBuilder = anxe.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((anxe) createBuilder.b).c = 0;
        anxc b2 = b(anriVar.e);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        anxe anxeVar = (anxe) createBuilder.b;
        b2.getClass();
        anxeVar.d = b2;
        anxeVar.b |= 1;
        aozb w = aozb.w(anriVar.f.c());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((anxe) createBuilder.b).e = w;
        return (anxe) createBuilder.s();
    }

    public static aocj d(anrd anrdVar, byte[] bArr) {
        int i2;
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (anrdVar == anrd.f) {
            i2 = 32;
        } else if (anrdVar == anrd.a) {
            i2 = 65;
        } else if (anrdVar == anrd.b) {
            i2 = 97;
        } else if (anrdVar == anrd.c) {
            i2 = 133;
        } else {
            throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
        }
        return aocj.b(anme.x(bigInteger, i2));
    }
}
