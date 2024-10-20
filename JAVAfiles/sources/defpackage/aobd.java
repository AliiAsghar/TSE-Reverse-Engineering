package defpackage;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.ECPublicKey;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aobd implements annh {
    static final ansy a;
    static final ansy b;
    static final ansy c;
    private static final byte[] d = new byte[0];
    private static final byte[] e = {0};
    private final ECPublicKey f;
    private final String g;
    private final aobj h;
    private final byte[] i;
    private final byte[] j;
    private final Provider k;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        anme.v(aobr.SHA256, anyf.a, hashMap, hashMap2);
        anme.v(aobr.SHA384, anyf.b, hashMap, hashMap2);
        anme.v(aobr.SHA512, anyf.c, hashMap, hashMap2);
        a = anme.u(hashMap, hashMap2);
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        anme.v(aobj.IEEE_P1363, anyg.a, hashMap3, hashMap4);
        anme.v(aobj.DER, anyg.b, hashMap3, hashMap4);
        b = anme.u(hashMap3, hashMap4);
        HashMap hashMap5 = new HashMap();
        HashMap hashMap6 = new HashMap();
        anme.v(aobi.NIST_P256, anye.a, hashMap5, hashMap6);
        anme.v(aobi.NIST_P384, anye.b, hashMap5, hashMap6);
        anme.v(aobi.NIST_P521, anye.c, hashMap5, hashMap6);
        c = anme.u(hashMap5, hashMap6);
    }

    private aobd(ECPublicKey eCPublicKey, aobr aobrVar, aobj aobjVar, byte[] bArr, byte[] bArr2) {
        if (anme.z(2)) {
            aode.G(eCPublicKey);
            this.g = aode.o(aobrVar);
            this.f = eCPublicKey;
            this.h = aobjVar;
            this.i = bArr;
            this.j = bArr2;
            this.k = ansq.a();
            return;
        }
        throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
    }

    public static annh b(anyk anykVar) {
        byte[] bArr;
        ECPublicKey C = aode.C((aobi) c.a(anykVar.e.f), anykVar.f.getAffineX().toByteArray(), anykVar.f.getAffineY().toByteArray());
        aobr aobrVar = (aobr) a.a(anykVar.e.g);
        aobj aobjVar = (aobj) b.a(anykVar.e.e);
        byte[] c2 = anykVar.g.c();
        if (anykVar.e.h.equals(anyh.c)) {
            bArr = e;
        } else {
            bArr = d;
        }
        return new aobd(C, aobrVar, aobjVar, c2, bArr);
    }

    private final void c(byte[] bArr, byte[] bArr2) {
        Signature signature;
        byte[] bArr3;
        int i;
        if (this.h == aobj.IEEE_P1363) {
            EllipticCurve curve = this.f.getParams().getCurve();
            int length = bArr.length;
            int v = aode.v(curve);
            if (length == v + v) {
                if ((length & 1) == 0 && length != 0 && length <= 132) {
                    int i2 = length >> 1;
                    byte[] M = aode.M(Arrays.copyOf(bArr, i2));
                    byte[] M2 = aode.M(Arrays.copyOfRange(bArr, i2, length));
                    int length2 = M.length;
                    int length3 = M2.length;
                    int i3 = length2 + 4 + length3;
                    if (i3 >= 128) {
                        bArr3 = new byte[i3 + 3];
                        bArr3[0] = 48;
                        bArr3[1] = -127;
                        bArr3[2] = (byte) i3;
                        i = 3;
                    } else {
                        bArr3 = new byte[i3 + 2];
                        bArr3[0] = 48;
                        bArr3[1] = (byte) i3;
                        i = 2;
                    }
                    int i4 = i + 1;
                    bArr3[i] = 2;
                    int i5 = i + 2;
                    bArr3[i4] = (byte) length2;
                    System.arraycopy(M, 0, bArr3, i5, length2);
                    int i6 = i5 + length2;
                    bArr3[i6] = 2;
                    bArr3[i6 + 1] = (byte) length3;
                    System.arraycopy(M2, 0, bArr3, i6 + 2, length3);
                    bArr = bArr3;
                } else {
                    throw new GeneralSecurityException("Invalid IEEE_P1363 encoding");
                }
            } else {
                throw new GeneralSecurityException("Invalid signature");
            }
        }
        if (aode.I(bArr)) {
            String str = this.g;
            Provider provider = this.k;
            if (provider != null) {
                signature = Signature.getInstance(str, provider);
            } else {
                signature = (Signature) aobo.c.a(str);
            }
            signature.initVerify(this.f);
            signature.update(bArr2);
            byte[] bArr4 = this.j;
            if (bArr4.length > 0) {
                signature.update(bArr4);
            }
            try {
                if (signature.verify(bArr)) {
                    return;
                }
            } catch (RuntimeException unused) {
            }
            throw new GeneralSecurityException("Invalid signature");
        }
        throw new GeneralSecurityException("Invalid signature");
    }

    @Override // defpackage.annh
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.i;
        if (bArr3.length == 0) {
            c(bArr, bArr2);
        } else {
            if (anuk.e(bArr3, bArr)) {
                byte[] bArr4 = this.i;
                c(Arrays.copyOfRange(bArr, bArr4.length, bArr.length), bArr2);
                return;
            }
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
    }
}
