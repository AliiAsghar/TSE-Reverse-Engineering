package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.RSAKeyGenParameterSpec;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class annw implements antj {
    private final /* synthetic */ int a;

    public /* synthetic */ annw(int i) {
        this.a = i;
    }

    @Override // defpackage.antj
    public final anme a(anme anmeVar, Integer num) {
        ECParameterSpec eCParameterSpec;
        aobi aobiVar;
        aocj b;
        aojh A;
        int i = 1;
        switch (this.a) {
            case 0:
                annz annzVar = (annz) anmeVar;
                int i2 = annzVar.e;
                antv antvVar = annx.a;
                if (i2 != 24) {
                    return anme.m(annzVar, aojh.z(annzVar.e), num);
                }
                throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
            case 1:
                annu annuVar = (annu) anmeVar;
                int i3 = annuVar.e;
                antv antvVar2 = annr.a;
                if (i3 != 16 && annuVar.e != 32) {
                    throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
                }
                return anme.n(annuVar, aojh.z(annuVar.e), aojh.z(annuVar.f), num);
            case 2:
                anoe anoeVar = (anoe) anmeVar;
                int i4 = anoeVar.e;
                antv antvVar3 = anoc.a;
                if (i4 != 24) {
                    return anme.l(anoeVar, aojh.z(anoeVar.e), num);
                }
                throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
            case 3:
                anoi anoiVar = (anoi) anmeVar;
                return anme.k(anoiVar, aojh.z(anoiVar.e), num);
            case 4:
                return anoj.F(((anom) anmeVar).e, aojh.z(32), num);
            case 5:
                return anoq.F((anos) anmeVar, num);
            case 6:
                return anou.F((anox) anmeVar, num);
            case 7:
                return anpf.F((anpi) anmeVar, aojh.z(32), num);
            case 8:
                return anpj.F(((anpm) anmeVar).e, aojh.z(32), num);
            case 9:
                anqm anqmVar = (anqm) anmeVar;
                anqk.a(anqmVar);
                return anme.B(anqmVar, aojh.z(anqmVar.e), num);
            case 10:
                anqx anqxVar = (anqx) anmeVar;
                anqt anqtVar = anqxVar.f;
                if (anqtVar == anqt.a) {
                    eCParameterSpec = ansx.a;
                } else if (anqtVar == anqt.b) {
                    eCParameterSpec = ansx.b;
                } else if (anqtVar == anqt.c) {
                    eCParameterSpec = ansx.c;
                } else {
                    throw new GeneralSecurityException("Unsupported curve type: ".concat(String.valueOf(String.valueOf(anqtVar))));
                }
                KeyPair x = aode.x(eCParameterSpec);
                return anqy.H(anqz.G(anqxVar, ((ECPublicKey) x.getPublic()).getW(), num), new ahmn(((ECPrivateKey) x.getPrivate()).getS(), null));
            case 11:
                anrf anrfVar = (anrf) anmeVar;
                if (anrfVar.e.equals(anrd.f)) {
                    byte[] d = aode.d();
                    A = aojh.A(d);
                    b = aocj.b(aode.e(d));
                } else {
                    if (!anrfVar.e.equals(anrd.a) && !anrfVar.e.equals(anrd.b) && !anrfVar.e.equals(anrd.c)) {
                        throw new GeneralSecurityException("Unknown KEM ID");
                    }
                    anrd anrdVar = anrfVar.e;
                    if (anrdVar == anrd.a) {
                        aobiVar = aobi.NIST_P256;
                    } else if (anrdVar == anrd.b) {
                        aobiVar = aobi.NIST_P384;
                    } else if (anrdVar == anrd.c) {
                        aobiVar = aobi.NIST_P521;
                    } else {
                        throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
                    }
                    KeyPair w = aode.w(aobiVar);
                    b = aocj.b(aode.K(aobiVar, aobk.UNCOMPRESSED, ((ECPublicKey) w.getPublic()).getW()));
                    A = aojh.A(anme.x(((ECPrivateKey) w.getPrivate()).getS(), ansf.a(anrfVar.e)));
                }
                return anrg.H(anri.F(anrfVar, b, num), A);
            case 12:
                anub anubVar = ((antg) anmeVar).e;
                antk antkVar = antk.a;
                anta antaVar = anta.a;
                anxg anxgVar = anubVar.b;
                anmw a = antaVar.a(anxgVar.b);
                if (((Boolean) anta.a.b.get(anxgVar.b)).booleanValue()) {
                    anxf a2 = a.a(anxgVar.c);
                    String str = a2.b;
                    aozb aozbVar = a2.c;
                    int T = a.T(a2.d);
                    if (T != 0) {
                        i = T;
                    }
                    anxp b2 = anxp.b(anxgVar.d);
                    if (b2 == null) {
                        b2 = anxp.UNRECOGNIZED;
                    }
                    return new antf(anua.a(str, aozbVar, i, b2, num));
                }
                throw new GeneralSecurityException("Creating new keys is not allowed.");
            case 13:
                anuo anuoVar = (anuo) anmeVar;
                anum.a(anuoVar);
                return anme.A(anuoVar, aojh.z(anuoVar.e), num);
            case 14:
                anuv anuvVar = (anuv) anmeVar;
                return anme.t(anuvVar, aojh.z(anuvVar.e), num);
            case 15:
                anyi anyiVar = (anyi) anmeVar;
                KeyPair x2 = aode.x(anyiVar.f.e);
                return anme.D(aode.T(anyiVar, ((ECPublicKey) x2.getPublic()).getW(), num), new ahmn(((ECPrivateKey) x2.getPrivate()).getS(), null));
            case 16:
                anyn anynVar = (anyn) anmeVar;
                antv antvVar4 = anyp.a;
                byte[] b3 = anud.b(32);
                if (b3.length == 32) {
                    return anyo.H(anyq.G(anynVar.e, aocj.b(Arrays.copyOf(ansu.g(ansu.f(b3)), 32)), num), aojh.A(Arrays.copyOf(b3, 32)));
                }
                throw new IllegalArgumentException(String.format("Given secret seed length is not %s", 32));
            case 17:
                anyz anyzVar = (anyz) anmeVar;
                antv antvVar5 = anzc.a;
                KeyPairGenerator keyPairGenerator = (KeyPairGenerator) aobo.f.a("RSA");
                keyPairGenerator.initialize(new RSAKeyGenParameterSpec(anyzVar.f, new BigInteger(1, anyzVar.g.toByteArray())));
                KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
                RSAPublicKey rSAPublicKey = (RSAPublicKey) generateKeyPair.getPublic();
                RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) generateKeyPair.getPrivate();
                anzb S = aode.S(anyzVar, rSAPublicKey.getModulus(), num);
                anzh anzhVar = new anzh();
                anzhVar.g = S;
                anzhVar.H(new ahmn(rSAPrivateCrtKey.getPrimeP(), null), new ahmn(rSAPrivateCrtKey.getPrimeQ(), null));
                anzhVar.a = new ahmn(rSAPrivateCrtKey.getPrivateExponent(), null);
                anzhVar.G(new ahmn(rSAPrivateCrtKey.getPrimeExponentP(), null), new ahmn(rSAPrivateCrtKey.getPrimeExponentQ(), null));
                anzhVar.f = new ahmn(rSAPrivateCrtKey.getCrtCoefficient(), null);
                return anzhVar.b();
            case 18:
                anzg anzgVar = (anzg) anmeVar;
                antv antvVar6 = anzk.a;
                KeyPairGenerator keyPairGenerator2 = (KeyPairGenerator) aobo.f.a("RSA");
                keyPairGenerator2.initialize(new RSAKeyGenParameterSpec(anzgVar.f, new BigInteger(1, anzgVar.g.toByteArray())));
                KeyPair generateKeyPair2 = keyPairGenerator2.generateKeyPair();
                RSAPublicKey rSAPublicKey2 = (RSAPublicKey) generateKeyPair2.getPublic();
                RSAPrivateCrtKey rSAPrivateCrtKey2 = (RSAPrivateCrtKey) generateKeyPair2.getPrivate();
                anzj R = aode.R(anzgVar, rSAPublicKey2.getModulus(), num);
                anzh anzhVar2 = new anzh();
                anzhVar2.g = R;
                anzhVar2.F(new ahmn(rSAPrivateCrtKey2.getPrimeP(), null), new ahmn(rSAPrivateCrtKey2.getPrimeQ(), null));
                anzhVar2.a = new ahmn(rSAPrivateCrtKey2.getPrivateExponent(), null);
                anzhVar2.E(new ahmn(rSAPrivateCrtKey2.getPrimeExponentP(), null), new ahmn(rSAPrivateCrtKey2.getPrimeExponentQ(), null));
                anzhVar2.f = new ahmn(rSAPrivateCrtKey2.getCrtCoefficient(), null);
                return anzhVar2.a();
            case 19:
                aoaa aoaaVar = (aoaa) anmeVar;
                antv antvVar7 = anzy.a;
                return anzx.F(aoaaVar, aojh.z(aoaaVar.I()));
            default:
                aoaf aoafVar = (aoaf) anmeVar;
                antv antvVar8 = aoac.a;
                return aoab.F(aoafVar, aojh.z(aoafVar.H()));
        }
    }
}
