package defpackage;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asvv extends ASN1Object {
    public final int a;
    public final long b;
    public final long c;
    public final byte[] d;
    public final byte[] e;
    public final byte[] f;
    public final byte[] g;
    private final byte[] h;

    public asvv(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = 0;
        this.b = j;
        this.d = atow.O(bArr);
        this.e = atow.O(bArr2);
        this.f = atow.O(bArr3);
        this.g = atow.O(bArr4);
        this.h = atow.O(bArr5);
        this.c = -1L;
    }

    public final byte[] a() {
        return atow.O(this.h);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        if (this.c >= 0) {
            aSN1EncodableVector.b(new ASN1Integer(1L));
        } else {
            aSN1EncodableVector.b(new ASN1Integer(0L));
        }
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        aSN1EncodableVector2.b(new ASN1Integer(this.b));
        aSN1EncodableVector2.b(new DEROctetString(this.d));
        aSN1EncodableVector2.b(new DEROctetString(this.e));
        aSN1EncodableVector2.b(new DEROctetString(this.f));
        aSN1EncodableVector2.b(new DEROctetString(this.g));
        long j = this.c;
        if (j >= 0) {
            aSN1EncodableVector2.b(new DERTaggedObject(false, 0, new ASN1Integer(j)));
        }
        aSN1EncodableVector.b(new DERSequence(aSN1EncodableVector2));
        aSN1EncodableVector.b(new DERTaggedObject(true, 0, new DEROctetString(this.h)));
        return new DERSequence(aSN1EncodableVector);
    }

    public asvv(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, long j2) {
        this.a = 1;
        this.b = j;
        this.d = atow.O(bArr);
        this.e = atow.O(bArr2);
        this.f = atow.O(bArr3);
        this.g = atow.O(bArr4);
        this.h = atow.O(bArr5);
        this.c = j2;
    }

    public asvv(ASN1Sequence aSN1Sequence) {
        ASN1Integer m = ASN1Integer.m(aSN1Sequence.h(0));
        if (!m.o(0) && !m.o(1)) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        this.a = m.f();
        if (aSN1Sequence.e() != 2 && aSN1Sequence.e() != 3) {
            throw new IllegalArgumentException("key sequence wrong size");
        }
        ASN1Sequence j = ASN1Sequence.j(aSN1Sequence.h(1));
        this.b = ASN1Integer.m(j.h(0)).h();
        this.d = atow.O(DEROctetString.f(j.h(1)).c);
        this.e = atow.O(DEROctetString.f(j.h(2)).c);
        this.f = atow.O(DEROctetString.f(j.h(3)).c);
        this.g = atow.O(DEROctetString.f(j.h(4)).c);
        if (j.e() == 6) {
            ASN1TaggedObject m2 = ASN1TaggedObject.m(j.h(5));
            if (m2.c == 0) {
                this.c = ASN1Integer.n(m2, false).h();
            } else {
                throw new IllegalArgumentException("unknown tag in XMSSPrivateKey");
            }
        } else if (j.e() == 5) {
            this.c = -1L;
        } else {
            throw new IllegalArgumentException("keySeq should be 5 or 6 in length");
        }
        if (aSN1Sequence.e() == 3) {
            this.h = atow.O(DEROctetString.g(ASN1TaggedObject.m(aSN1Sequence.h(2)), true).c);
        } else {
            this.h = null;
        }
    }
}
