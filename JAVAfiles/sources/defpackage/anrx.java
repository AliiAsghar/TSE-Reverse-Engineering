package defpackage;

import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anrx {
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
        aocj b2 = anuk.b("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        h = b2;
        aocj b3 = anuk.b("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
        i = b3;
        int i2 = 11;
        b = new antv(anqx.class, anub.class, new anoy(i2));
        c = new antv(b2, anub.class, new anoz(i2));
        int i3 = 12;
        d = new antv(anqz.class, anua.class, new anpa(i3));
        f = new antv(b3, anua.class, new anpb(i3));
        int i4 = 13;
        e = new antv(anqy.class, anua.class, new anpa(i4));
        g = new antv(b2, anua.class, new anpb(i4));
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        anme.v(anxp.RAW, anqw.c, hashMap, hashMap2);
        anme.v(anxp.TINK, anqw.a, hashMap, hashMap2);
        anme.v(anxp.LEGACY, anqw.b, hashMap, hashMap2);
        anme.v(anxp.CRUNCHY, anqw.b, hashMap, hashMap2);
        a = anme.u(hashMap, hashMap2);
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        anme.v(anwu.SHA1, anqu.a, hashMap3, hashMap4);
        anme.v(anwu.SHA224, anqu.b, hashMap3, hashMap4);
        anme.v(anwu.SHA256, anqu.c, hashMap3, hashMap4);
        anme.v(anwu.SHA384, anqu.d, hashMap3, hashMap4);
        anme.v(anwu.SHA512, anqu.e, hashMap3, hashMap4);
        j = anme.u(hashMap3, hashMap4);
        HashMap hashMap5 = new HashMap();
        HashMap hashMap6 = new HashMap();
        anme.v(anws.NIST_P256, anqt.a, hashMap5, hashMap6);
        anme.v(anws.NIST_P384, anqt.b, hashMap5, hashMap6);
        anme.v(anws.NIST_P521, anqt.c, hashMap5, hashMap6);
        anme.v(anws.CURVE25519, anqt.d, hashMap5, hashMap6);
        k = anme.u(hashMap5, hashMap6);
        HashMap hashMap7 = new HashMap();
        HashMap hashMap8 = new HashMap();
        anme.v(anwe.UNCOMPRESSED, anqv.b, hashMap7, hashMap8);
        anme.v(anwe.COMPRESSED, anqv.a, hashMap7, hashMap8);
        anme.v(anwe.DO_NOT_USE_CRUNCHY_UNCOMPRESSED, anqv.c, hashMap7, hashMap8);
        l = anme.u(hashMap7, hashMap8);
    }

    public static int a(anqt anqtVar) {
        if (anqt.a.equals(anqtVar)) {
            return 33;
        }
        if (anqt.b.equals(anqtVar)) {
            return 49;
        }
        if (anqt.c.equals(anqtVar)) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType ".concat(String.valueOf(String.valueOf(anqtVar))));
    }

    public static anqx b(anxp anxpVar, anwl anwlVar) {
        aozy createBuilder = anxg.a.createBuilder();
        anwj anwjVar = anwlVar.d;
        if (anwjVar == null) {
            anwjVar = anwj.a;
        }
        anxg anxgVar = anwjVar.c;
        if (anxgVar == null) {
            anxgVar = anxg.a;
        }
        String str = anxgVar.b;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        str.getClass();
        ((anxg) apagVar).b = str;
        anxp anxpVar2 = anxp.RAW;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        ((anxg) createBuilder.b).d = anxpVar2.a();
        anwj anwjVar2 = anwlVar.d;
        if (anwjVar2 == null) {
            anwjVar2 = anwj.a;
        }
        anxg anxgVar2 = anwjVar2.c;
        if (anxgVar2 == null) {
            anxgVar2 = anxg.a;
        }
        aozb aozbVar = anxgVar2.c;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        anxg anxgVar3 = (anxg) createBuilder.b;
        aozbVar.getClass();
        anxgVar3.c = aozbVar;
        anxg anxgVar4 = (anxg) createBuilder.s();
        aqxc aqxcVar = new aqxc(null, null);
        aqxcVar.b = (anqw) a.b(anxpVar);
        ansy ansyVar = k;
        anwo anwoVar = anwlVar.c;
        if (anwoVar == null) {
            anwoVar = anwo.a;
        }
        anws b2 = anws.b(anwoVar.b);
        if (b2 == null) {
            b2 = anws.UNRECOGNIZED;
        }
        aqxcVar.f = (anqt) ansyVar.b(b2);
        ansy ansyVar2 = j;
        anwo anwoVar2 = anwlVar.c;
        if (anwoVar2 == null) {
            anwoVar2 = anwo.a;
        }
        anwu b3 = anwu.b(anwoVar2.c);
        if (b3 == null) {
            b3 = anwu.UNRECOGNIZED;
        }
        aqxcVar.a = (anqu) ansyVar2.b(b3);
        aqxcVar.k(anme.o(anxgVar4.toByteArray()));
        anwo anwoVar3 = anwlVar.c;
        if (anwoVar3 == null) {
            anwoVar3 = anwo.a;
        }
        aocj b4 = aocj.b(anwoVar3.d.H());
        if (b4.a() == 0) {
            aqxcVar.d = null;
        } else {
            aqxcVar.d = b4;
        }
        anwo anwoVar4 = anwlVar.c;
        if (anwoVar4 == null) {
            anwoVar4 = anwo.a;
        }
        anws b5 = anws.b(anwoVar4.b);
        if (b5 == null) {
            b5 = anws.UNRECOGNIZED;
        }
        if (!b5.equals(anws.CURVE25519)) {
            ansy ansyVar3 = l;
            anwe b6 = anwe.b(anwlVar.e);
            if (b6 == null) {
                b6 = anwe.UNRECOGNIZED;
            }
            aqxcVar.e = (anqv) ansyVar3.b(b6);
        } else {
            anwe b7 = anwe.b(anwlVar.e);
            if (b7 == null) {
                b7 = anwe.UNRECOGNIZED;
            }
            if (!b7.equals(anwe.COMPRESSED)) {
                throw new GeneralSecurityException("For CURVE25519 EcPointFormat must be compressed");
            }
        }
        return aqxcVar.e();
    }

    public static anwl c(anqx anqxVar) {
        aozy createBuilder = anwo.a.createBuilder();
        anws anwsVar = (anws) k.a(anqxVar.f);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((anwo) createBuilder.b).b = anwsVar.a();
        anwu anwuVar = (anwu) j.a(anqxVar.g);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((anwo) createBuilder.b).c = anwuVar.a();
        aocj aocjVar = anqxVar.j;
        if (aocjVar != null && aocjVar.a() > 0) {
            aozb w = aozb.w(aocjVar.c());
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((anwo) createBuilder.b).d = w;
        }
        anwo anwoVar = (anwo) createBuilder.s();
        try {
            byte[] p = anme.p(anqxVar.k);
            aozs aozsVar = aozs.a;
            apcc apccVar = apcc.a;
            anxg anxgVar = (anxg) apag.parseFrom(anxg.a, p, aozs.a);
            aozy createBuilder2 = anwj.a.createBuilder();
            aozy createBuilder3 = anxg.a.createBuilder();
            String str = anxgVar.b;
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            apag apagVar = createBuilder3.b;
            str.getClass();
            ((anxg) apagVar).b = str;
            anxp anxpVar = anxp.TINK;
            if (!apagVar.isMutable()) {
                createBuilder3.u();
            }
            ((anxg) createBuilder3.b).d = anxpVar.a();
            aozb aozbVar = anxgVar.c;
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            anxg anxgVar2 = (anxg) createBuilder3.b;
            aozbVar.getClass();
            anxgVar2.c = aozbVar;
            anxg anxgVar3 = (anxg) createBuilder3.s();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            anwj anwjVar = (anwj) createBuilder2.b;
            anxgVar3.getClass();
            anwjVar.c = anxgVar3;
            anwjVar.b |= 1;
            anwj anwjVar2 = (anwj) createBuilder2.s();
            anqv anqvVar = anqxVar.h;
            if (anqvVar == null) {
                anqvVar = anqv.a;
            }
            aozy createBuilder4 = anwl.a.createBuilder();
            if (!createBuilder4.b.isMutable()) {
                createBuilder4.u();
            }
            apag apagVar2 = createBuilder4.b;
            anwl anwlVar = (anwl) apagVar2;
            anwoVar.getClass();
            anwlVar.c = anwoVar;
            anwlVar.b |= 1;
            if (!apagVar2.isMutable()) {
                createBuilder4.u();
            }
            anwl anwlVar2 = (anwl) createBuilder4.b;
            anwjVar2.getClass();
            anwlVar2.d = anwjVar2;
            anwlVar2.b |= 2;
            anwe anweVar = (anwe) l.a(anqvVar);
            if (!createBuilder4.b.isMutable()) {
                createBuilder4.u();
            }
            ((anwl) createBuilder4.b).e = anweVar.a();
            return (anwl) createBuilder4.s();
        } catch (apba e2) {
            throw new GeneralSecurityException("Parsing EciesParameters failed: ", e2);
        }
    }

    public static anwn d(anqz anqzVar) {
        if (anqzVar.e.f.equals(anqt.d)) {
            aozy createBuilder = anwn.a.createBuilder();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((anwn) createBuilder.b).c = 0;
            anwl c2 = c(anqzVar.e);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            anwn anwnVar = (anwn) createBuilder.b;
            c2.getClass();
            anwnVar.d = c2;
            anwnVar.b |= 1;
            aozb w = aozb.w(anqzVar.g.c());
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            ((anwn) apagVar).e = w;
            aozb aozbVar = aozb.b;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            anwn anwnVar2 = (anwn) createBuilder.b;
            aozbVar.getClass();
            anwnVar2.f = aozbVar;
            return (anwn) createBuilder.s();
        }
        anqt anqtVar = anqzVar.e.f;
        ECPoint eCPoint = anqzVar.f;
        int a2 = a(anqtVar);
        if (eCPoint != null) {
            aozy createBuilder2 = anwn.a.createBuilder();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            ((anwn) createBuilder2.b).c = 0;
            anwl c3 = c(anqzVar.e);
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            anwn anwnVar3 = (anwn) createBuilder2.b;
            c3.getClass();
            anwnVar3.d = c3;
            anwnVar3.b |= 1;
            aozb w2 = aozb.w(anme.x(eCPoint.getAffineX(), a2));
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            ((anwn) createBuilder2.b).e = w2;
            aozb w3 = aozb.w(anme.x(eCPoint.getAffineY(), a2));
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            ((anwn) createBuilder2.b).f = w3;
            return (anwn) createBuilder2.s();
        }
        throw new GeneralSecurityException("NistCurvePoint was null for NIST curve");
    }
}
