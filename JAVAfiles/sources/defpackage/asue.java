package defpackage;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1BitString;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asue extends asub {
    private final Object f;
    private asuc g;
    private volatile boolean h;
    private volatile int i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public asue(defpackage.asuo r9, org.bouncycastle.asn1.x509.CertificateList r10) {
        /*
            r8 = this;
            java.lang.String r0 = "CRL contents invalid: "
            org.bouncycastle.asn1.x509.AlgorithmIdentifier r1 = r10.b     // Catch: java.lang.Exception -> L56
            java.lang.String r5 = defpackage.asuj.a(r1)     // Catch: java.lang.Exception -> L56
            org.bouncycastle.asn1.x509.AlgorithmIdentifier r1 = r10.b     // Catch: java.lang.Exception -> L47
            org.bouncycastle.asn1.ASN1Encodable r1 = r1.b     // Catch: java.lang.Exception -> L47
            r2 = 0
            if (r1 != 0) goto L11
            r6 = r2
            goto L1a
        L11:
            org.bouncycastle.asn1.ASN1Primitive r1 = r1.p()     // Catch: java.lang.Exception -> L47
            byte[] r0 = r1.u()     // Catch: java.lang.Exception -> L47
            r6 = r0
        L1a:
            org.bouncycastle.asn1.ASN1ObjectIdentifier r0 = org.bouncycastle.asn1.x509.Extension.i     // Catch: java.lang.Exception -> L40
            java.lang.String r0 = r0.b     // Catch: java.lang.Exception -> L40
            org.bouncycastle.asn1.ASN1OctetString r0 = defpackage.asub.a(r10, r0)     // Catch: java.lang.Exception -> L40
            if (r0 == 0) goto L26
            byte[] r2 = r0.c     // Catch: java.lang.Exception -> L40
        L26:
            if (r2 != 0) goto L2b
            r0 = 0
        L29:
            r7 = r0
            goto L32
        L2b:
            org.bouncycastle.asn1.x509.IssuingDistributionPoint r0 = org.bouncycastle.asn1.x509.IssuingDistributionPoint.a(r2)     // Catch: java.lang.Exception -> L40
            boolean r0 = r0.a     // Catch: java.lang.Exception -> L40
            goto L29
        L32:
            r2 = r8
            r3 = r9
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.Object r9 = new java.lang.Object
            r9.<init>()
            r8.f = r9
            return
        L40:
            r9 = move-exception
            astv r10 = new astv
            r10.<init>(r9)
            throw r10
        L47:
            r9 = move-exception
            java.security.cert.CRLException r10 = new java.security.cert.CRLException
            java.lang.String r9 = r9.toString()
            java.lang.String r9 = r0.concat(r9)
            r10.<init>(r9)
            throw r10
        L56:
            r9 = move-exception
            asud r10 = new asud
            java.lang.String r1 = r9.getMessage()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = r0.concat(r1)
            r10.<init>(r0, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asue.<init>(asuo, org.bouncycastle.asn1.x509.CertificateList):void");
    }

    private final asuc b() {
        byte[] bArr;
        asud asudVar;
        asuc asucVar;
        synchronized (this.f) {
            asuc asucVar2 = this.g;
            if (asucVar2 != null) {
                return asucVar2;
            }
            try {
                asudVar = null;
                bArr = this.a.u();
            } catch (IOException e) {
                bArr = null;
                asudVar = new asud(e);
            }
            asuc asucVar3 = new asuc(this.e, this.a, this.b, this.c, this.d, bArr, asudVar);
            synchronized (this.f) {
                if (this.g == null) {
                    this.g = asucVar3;
                }
                asucVar = this.g;
            }
            return asucVar;
        }
    }

    @Override // java.security.cert.X509CRL
    public final boolean equals(Object obj) {
        ASN1BitString aSN1BitString;
        if (this == obj) {
            return true;
        }
        if (obj instanceof asue) {
            asue asueVar = (asue) obj;
            if (this.h && asueVar.h) {
                if (this.i != asueVar.i) {
                    return false;
                }
            } else if ((this.g == null || asueVar.g == null) && (aSN1BitString = this.a.c) != null && !aSN1BitString.x(asueVar.a.c)) {
                return false;
            }
            return b().equals(asueVar.b());
        }
        return b().equals(obj);
    }

    @Override // java.security.cert.X509CRL
    public final byte[] getEncoded() {
        return atow.O(b().getEncoded());
    }

    @Override // java.security.cert.X509CRL
    public final int hashCode() {
        if (!this.h) {
            this.i = b().hashCode();
            this.h = true;
        }
        return this.i;
    }
}
