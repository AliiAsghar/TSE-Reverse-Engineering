package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import org.bouncycastle.asn1.ASN1Sequence;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public class LazyEncodedSequence extends ASN1Sequence {
    private byte[] c;

    public LazyEncodedSequence(byte[] bArr) {
        if (bArr != null) {
            this.c = bArr;
            return;
        }
        throw new NullPointerException("'encoded' cannot be null");
    }

    private final synchronized void r() {
        if (this.c != null) {
            ASN1InputStream aSN1InputStream = new ASN1InputStream(this.c, (byte[]) null);
            try {
                ASN1EncodableVector c = aSN1InputStream.c();
                aSN1InputStream.close();
                this.b = c.d();
                this.c = null;
            } catch (IOException e) {
                throw new ASN1ParsingException("malformed ASN.1: ".concat(e.toString()), e);
            }
        }
    }

    private final synchronized byte[] y() {
        return this.c;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int a(boolean z) {
        byte[] y = y();
        if (y != null) {
            return ASN1OutputStream.b(z, y.length);
        }
        return super.l().a(z);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void b(ASN1OutputStream aSN1OutputStream, boolean z) {
        byte[] y = y();
        if (y != null) {
            aSN1OutputStream.j(z, 48, y);
        } else {
            super.l().b(aSN1OutputStream, z);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    public final int e() {
        r();
        return super.e();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    public final Enumeration f() {
        byte[] y = y();
        if (y != null) {
            return new LazyConstructionEnumeration(y);
        }
        return new ASN1Sequence.AnonymousClass2();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    public final ASN1BitString g() {
        return ((ASN1Sequence) l()).g();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    public final ASN1Encodable h(int i) {
        r();
        return super.h(i);
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence, org.bouncycastle.asn1.ASN1Object
    public final int hashCode() {
        r();
        return super.hashCode();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    public final ASN1OctetString i() {
        return ((ASN1Sequence) l()).i();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence, java.lang.Iterable
    public final Iterator<ASN1Encodable> iterator() {
        r();
        return super.iterator();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence, org.bouncycastle.asn1.ASN1Primitive
    public final ASN1Primitive k() {
        r();
        return super.k();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence, org.bouncycastle.asn1.ASN1Primitive
    public final ASN1Primitive l() {
        r();
        return super.l();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    public final ASN1Set n() {
        return ((ASN1Sequence) l()).n();
    }
}
