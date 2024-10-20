package defpackage;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aocb implements annh {
    static final ansy a;
    private static final byte[] b = new byte[0];
    private static final byte[] c = {0};

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        anme.v(aobr.SHA256, anyx.a, hashMap, hashMap2);
        anme.v(aobr.SHA384, anyx.b, hashMap, hashMap2);
        anme.v(aobr.SHA512, anyx.c, hashMap, hashMap2);
        a = anme.u(hashMap, hashMap2);
    }

    public static annh b(anzb anzbVar) {
        byte[] bArr;
        byte[] bArr2;
        if (anzt.b()) {
            if (anzt.b()) {
                RSAPublicKey rSAPublicKey = (RSAPublicKey) KeyFactory.getInstance("RSA", anzt.c).generatePublic(new RSAPublicKeySpec(anzbVar.f, anzbVar.e.g));
                anyx anyxVar = anzbVar.e.i;
                byte[] c2 = anzbVar.g.c();
                if (anzbVar.e.h.equals(anyy.c)) {
                    bArr2 = anzt.b;
                } else {
                    bArr2 = anzt.a;
                }
                return new anzt(rSAPublicKey, anyxVar, c2, bArr2);
            }
            throw new GeneralSecurityException("RSA-PKCS1.5 using Conscrypt is not supported.");
        }
        RSAPublicKey rSAPublicKey2 = (RSAPublicKey) ((KeyFactory) aobo.g.a("RSA")).generatePublic(new RSAPublicKeySpec(anzbVar.f, anzbVar.e.g));
        aobr aobrVar = (aobr) a.a(anzbVar.e.i);
        byte[] c3 = anzbVar.g.c();
        if (anzbVar.e.h.equals(anyy.c)) {
            bArr = c;
        } else {
            bArr = b;
        }
        return new aoca(rSAPublicKey2, aobrVar, c3, bArr);
    }

    @Override // defpackage.annh
    public final void a(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
