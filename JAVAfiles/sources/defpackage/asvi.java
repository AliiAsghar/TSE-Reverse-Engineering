package defpackage;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asvi extends ASN1Object {
    public byte[] a;
    public byte[] b;
    public byte[] c;
    public byte[] d;
    public byte[] e;
    private final int f;
    private asvj g;

    public asvi(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, asvj asvjVar) {
        this.f = 0;
        this.a = atow.O(bArr);
        this.b = atow.O(bArr2);
        this.c = atow.O(bArr3);
        this.d = atow.O(bArr4);
        this.e = atow.O(bArr5);
        this.g = asvjVar;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.b(new ASN1Integer(this.f));
        aSN1EncodableVector.b(new DEROctetString(this.a));
        aSN1EncodableVector.b(new DEROctetString(this.b));
        aSN1EncodableVector.b(new DEROctetString(this.c));
        aSN1EncodableVector.b(new DEROctetString(this.d));
        aSN1EncodableVector.b(new DEROctetString(this.e));
        asvj asvjVar = this.g;
        if (asvjVar != null) {
            aSN1EncodableVector.b(new asvj(asvjVar.b()));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public asvi(ASN1Sequence aSN1Sequence) {
        int f = ASN1Integer.m(aSN1Sequence.h(0)).f();
        this.f = f;
        if (f == 0) {
            this.a = atow.O(ASN1OctetString.f(aSN1Sequence.h(1)).c);
            this.b = atow.O(ASN1OctetString.f(aSN1Sequence.h(2)).c);
            this.c = atow.O(ASN1OctetString.f(aSN1Sequence.h(3)).c);
            this.d = atow.O(ASN1OctetString.f(aSN1Sequence.h(4)).c);
            this.e = atow.O(ASN1OctetString.f(aSN1Sequence.h(5)).c);
            if (aSN1Sequence.e() == 7) {
                this.g = asvj.a(aSN1Sequence.h(6));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("unrecognized version");
    }
}
