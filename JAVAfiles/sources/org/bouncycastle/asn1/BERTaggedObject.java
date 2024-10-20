package org.bouncycastle.asn1;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class BERTaggedObject extends ASN1TaggedObject {
    public BERTaggedObject(int i, int i2, int i3, ASN1Encodable aSN1Encodable) {
        super(i, i2, i3, aSN1Encodable);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int a(boolean z) {
        int i;
        ASN1Primitive p = this.d.p();
        boolean n = n();
        int a = p.a(n);
        if (n) {
            a += 3;
        }
        if (z) {
            i = ASN1OutputStream.c(this.c);
        } else {
            i = 0;
        }
        return a + i;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void b(ASN1OutputStream aSN1OutputStream, boolean z) {
        ASN1Primitive p = this.d.p();
        boolean n = n();
        if (z) {
            int i = this.b;
            if (n || p.d()) {
                i |= 32;
            }
            aSN1OutputStream.o(i, this.c);
        }
        if (n) {
            aSN1OutputStream.f(128);
            p.b(aSN1OutputStream, true);
            aSN1OutputStream.f(0);
            aSN1OutputStream.f(0);
            return;
        }
        p.b(aSN1OutputStream, false);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean d() {
        if (!n() && !this.d.p().d()) {
            return false;
        }
        return true;
    }

    @Override // org.bouncycastle.asn1.ASN1TaggedObject
    public final ASN1Sequence i(ASN1Primitive aSN1Primitive) {
        return new BERSequence(aSN1Primitive);
    }

    public BERTaggedObject(ASN1Encodable aSN1Encodable) {
        super(true, 0, aSN1Encodable);
    }
}
