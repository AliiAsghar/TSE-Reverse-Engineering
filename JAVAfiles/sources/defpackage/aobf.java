package defpackage;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aobf implements anmv {
    public static final ansy a;
    public static final ansy b;
    private final String c;
    private final byte[] d;
    private final aobk e;
    private final anrv f;
    private final byte[] g;
    private final ahmn h;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        anme.v(aobi.NIST_P256, anqt.a, hashMap, hashMap2);
        anme.v(aobi.NIST_P384, anqt.b, hashMap, hashMap2);
        anme.v(aobi.NIST_P521, anqt.c, hashMap, hashMap2);
        a = anme.u(hashMap, hashMap2);
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        anme.v(aobk.UNCOMPRESSED, anqv.b, hashMap3, hashMap4);
        anme.v(aobk.COMPRESSED, anqv.a, hashMap3, hashMap4);
        anme.v(aobk.DO_NOT_USE_CRUNCHY_UNCOMPRESSED, anqv.c, hashMap3, hashMap4);
        b = anme.u(hashMap3, hashMap4);
    }

    public aobf(ECPublicKey eCPublicKey, byte[] bArr, String str, aobk aobkVar, anrv anrvVar, byte[] bArr2) {
        aode.G(eCPublicKey);
        this.h = new ahmn(eCPublicKey, null);
        this.d = bArr;
        this.c = str;
        this.e = aobkVar;
        this.f = anrvVar;
        this.g = bArr2;
    }

    public static final String b(anqu anquVar) {
        if (anquVar.equals(anqu.a)) {
            return "HmacSha1";
        }
        if (anquVar.equals(anqu.b)) {
            return "HmacSha224";
        }
        if (anquVar.equals(anqu.c)) {
            return "HmacSha256";
        }
        if (anquVar.equals(anqu.d)) {
            return "HmacSha384";
        }
        if (anquVar.equals(anqu.e)) {
            return "HmacSha512";
        }
        throw new GeneralSecurityException("hash unsupported for EciesAeadHkdf: ".concat(String.valueOf(String.valueOf(anquVar))));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.security.interfaces.ECPublicKey] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.security.interfaces.ECPublicKey] */
    @Override // defpackage.anmv
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        ahmn ahmnVar = this.h;
        ?? r1 = ahmnVar.a;
        int a2 = this.f.a();
        KeyPair x = aode.x(r1.getParams());
        ECPublicKey eCPublicKey = (ECPublicKey) x.getPublic();
        byte[] J = aode.J((ECPrivateKey) x.getPrivate(), ahmnVar.a);
        byte[] L = aode.L(eCPublicKey.getParams().getCurve(), this.e, eCPublicKey.getW());
        byte[] r = aode.r(L, J, this.c, this.d, bArr2, a2);
        aocj b2 = aocj.b(L);
        byte[] c = aocj.b(r).c();
        byte[] c2 = b2.c();
        return this.f.c(c, this.g, c2, bArr);
    }
}
