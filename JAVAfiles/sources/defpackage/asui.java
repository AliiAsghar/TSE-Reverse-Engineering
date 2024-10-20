package defpackage;

import java.io.IOException;
import java.security.PublicKey;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.util.Date;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1BitString;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asui extends asuf {
    private final Object g;
    private asug h;
    private X500Principal i;
    private PublicKey j;
    private X500Principal k;
    private long[] l;
    private volatile boolean m;
    private volatile int n;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public asui(defpackage.asuo r11, org.bouncycastle.asn1.x509.Certificate r12) {
        /*
            r10 = this;
            java.lang.String r0 = "2.5.29.19"
            byte[] r0 = b(r12, r0)     // Catch: java.lang.Exception -> Lb6
            r1 = 0
            if (r0 != 0) goto Lb
            r5 = r1
            goto L14
        Lb:
            org.bouncycastle.asn1.ASN1Primitive r0 = org.bouncycastle.asn1.ASN1Primitive.v(r0)     // Catch: java.lang.Exception -> Lb6
            org.bouncycastle.asn1.x509.BasicConstraints r0 = org.bouncycastle.asn1.x509.BasicConstraints.a(r0)     // Catch: java.lang.Exception -> Lb6
            r5 = r0
        L14:
            java.lang.String r0 = "2.5.29.15"
            byte[] r0 = b(r12, r0)     // Catch: java.lang.Exception -> La5
            if (r0 != 0) goto L1e
            r6 = r1
            goto L54
        L1e:
            org.bouncycastle.asn1.ASN1Primitive r0 = org.bouncycastle.asn1.ASN1Primitive.v(r0)     // Catch: java.lang.Exception -> La5
            org.bouncycastle.asn1.ASN1BitString r0 = org.bouncycastle.asn1.ASN1BitString.i(r0)     // Catch: java.lang.Exception -> La5
            byte[] r2 = r0.m()     // Catch: java.lang.Exception -> La5
            int r3 = r2.length     // Catch: java.lang.Exception -> La5
            int r3 = r3 * 8
            int r0 = r0.f()     // Catch: java.lang.Exception -> La5
            int r3 = r3 - r0
            r0 = 9
            if (r3 >= r0) goto L37
            goto L38
        L37:
            r0 = r3
        L38:
            boolean[] r0 = new boolean[r0]     // Catch: java.lang.Exception -> La5
            r4 = 0
            r6 = r4
        L3c:
            if (r6 == r3) goto L53
            int r7 = r6 / 8
            r7 = r2[r7]     // Catch: java.lang.Exception -> La5
            int r8 = r6 % 8
            r9 = 128(0x80, float:1.8E-43)
            int r8 = r9 >>> r8
            r7 = r7 & r8
            if (r7 == 0) goto L4d
            r7 = 1
            goto L4e
        L4d:
            r7 = r4
        L4e:
            r0[r6] = r7     // Catch: java.lang.Exception -> La5
            int r6 = r6 + 1
            goto L3c
        L53:
            r6 = r0
        L54:
            org.bouncycastle.asn1.x509.AlgorithmIdentifier r0 = r12.c     // Catch: java.lang.Exception -> L94
            java.lang.String r7 = defpackage.asuj.a(r0)     // Catch: java.lang.Exception -> L94
            org.bouncycastle.asn1.x509.AlgorithmIdentifier r0 = r12.c     // Catch: java.lang.Exception -> L83
            org.bouncycastle.asn1.ASN1Encodable r0 = r0.b     // Catch: java.lang.Exception -> L83
            if (r0 != 0) goto L62
        L60:
            r8 = r1
            goto L6b
        L62:
            org.bouncycastle.asn1.ASN1Primitive r0 = r0.p()     // Catch: java.lang.Exception -> L83
            byte[] r1 = r0.u()     // Catch: java.lang.Exception -> L83
            goto L60
        L6b:
            r2 = r10
            r3 = r11
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.lang.Object r11 = new java.lang.Object
            r11.<init>()
            r10.g = r11
            java.util.Hashtable r11 = new java.util.Hashtable
            r11.<init>()
            java.util.Vector r11 = new java.util.Vector
            r11.<init>()
            return
        L83:
            r11 = move-exception
            java.security.cert.CertificateParsingException r12 = new java.security.cert.CertificateParsingException
            java.lang.String r11 = r11.toString()
            java.lang.String r0 = "cannot construct SigAlgParams: "
            java.lang.String r11 = r0.concat(r11)
            r12.<init>(r11)
            throw r12
        L94:
            r11 = move-exception
            java.security.cert.CertificateParsingException r12 = new java.security.cert.CertificateParsingException
            java.lang.String r11 = r11.toString()
            java.lang.String r0 = "cannot construct SigAlgName: "
            java.lang.String r11 = r0.concat(r11)
            r12.<init>(r11)
            throw r12
        La5:
            r11 = move-exception
            java.security.cert.CertificateParsingException r12 = new java.security.cert.CertificateParsingException
            java.lang.String r11 = r11.toString()
            java.lang.String r0 = "cannot construct KeyUsage: "
            java.lang.String r11 = r0.concat(r11)
            r12.<init>(r11)
            throw r12
        Lb6:
            r11 = move-exception
            java.security.cert.CertificateParsingException r12 = new java.security.cert.CertificateParsingException
            java.lang.String r11 = r11.toString()
            java.lang.String r0 = "cannot construct BasicConstraints: "
            java.lang.String r11 = r0.concat(r11)
            r12.<init>(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asui.<init>(asuo, org.bouncycastle.asn1.x509.Certificate):void");
    }

    private final asug c() {
        byte[] bArr;
        asuh asuhVar;
        asug asugVar;
        synchronized (this.g) {
            asug asugVar2 = this.h;
            if (asugVar2 != null) {
                return asugVar2;
            }
            try {
                asuhVar = null;
                bArr = this.a.u();
            } catch (IOException e) {
                bArr = null;
                asuhVar = new asuh(e);
            }
            asug asugVar3 = new asug(this.f, this.a, this.b, this.c, this.d, this.e, bArr, asuhVar);
            synchronized (this.g) {
                if (this.h == null) {
                    this.h = asugVar3;
                }
                asugVar = this.h;
            }
            return asugVar;
        }
    }

    @Override // defpackage.asuf, java.security.cert.X509Certificate
    public final void checkValidity(Date date) {
        long[] jArr;
        Object obj = this.g;
        long time = date.getTime();
        synchronized (obj) {
            jArr = this.l;
            if (jArr == null) {
                long[] jArr2 = {super.getNotBefore().getTime(), super.getNotAfter().getTime()};
                synchronized (this.g) {
                    if (this.l == null) {
                        this.l = jArr2;
                    }
                    jArr = this.l;
                }
            }
        }
        if (time <= jArr[1]) {
            if (time >= jArr[0]) {
                return;
            } else {
                throw new CertificateNotYetValidException("certificate not valid till ".concat(this.a.e().a()));
            }
        }
        throw new CertificateExpiredException("certificate expired on ".concat(this.a.d().a()));
    }

    @Override // java.security.cert.Certificate
    public final boolean equals(Object obj) {
        ASN1BitString aSN1BitString;
        if (obj == this) {
            return true;
        }
        if (obj instanceof asui) {
            asui asuiVar = (asui) obj;
            if (this.m && asuiVar.m) {
                if (this.n != asuiVar.n) {
                    return false;
                }
            } else if ((this.h == null || asuiVar.h == null) && (aSN1BitString = this.a.d) != null && !aSN1BitString.x(asuiVar.a.d)) {
                return false;
            }
            return c().equals(asuiVar.c());
        }
        return c().equals(obj);
    }

    @Override // java.security.cert.Certificate
    public final byte[] getEncoded() {
        return atow.O(c().getEncoded());
    }

    @Override // defpackage.asuf, java.security.cert.X509Certificate
    public final X500Principal getIssuerX500Principal() {
        X500Principal x500Principal;
        synchronized (this.g) {
            X500Principal x500Principal2 = this.i;
            if (x500Principal2 != null) {
                return x500Principal2;
            }
            X500Principal issuerX500Principal = super.getIssuerX500Principal();
            synchronized (this.g) {
                if (this.i == null) {
                    this.i = issuerX500Principal;
                }
                x500Principal = this.i;
            }
            return x500Principal;
        }
    }

    @Override // defpackage.asuf, java.security.cert.Certificate
    public final PublicKey getPublicKey() {
        PublicKey publicKey;
        synchronized (this.g) {
            PublicKey publicKey2 = this.j;
            if (publicKey2 != null) {
                return publicKey2;
            }
            PublicKey publicKey3 = super.getPublicKey();
            if (publicKey3 == null) {
                return null;
            }
            synchronized (this.g) {
                if (this.j == null) {
                    this.j = publicKey3;
                }
                publicKey = this.j;
            }
            return publicKey;
        }
    }

    @Override // defpackage.asuf, java.security.cert.X509Certificate
    public final X500Principal getSubjectX500Principal() {
        X500Principal x500Principal;
        synchronized (this.g) {
            X500Principal x500Principal2 = this.k;
            if (x500Principal2 != null) {
                return x500Principal2;
            }
            X500Principal subjectX500Principal = super.getSubjectX500Principal();
            synchronized (this.g) {
                if (this.k == null) {
                    this.k = subjectX500Principal;
                }
                x500Principal = this.k;
            }
            return x500Principal;
        }
    }

    @Override // java.security.cert.Certificate
    public final int hashCode() {
        if (!this.m) {
            this.n = c().hashCode();
            this.m = true;
        }
        return this.n;
    }
}
