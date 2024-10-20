package defpackage;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asvn extends ASN1Object {
    public int a;
    public int b;
    public byte[] c;
    public byte[] d;
    public AlgorithmIdentifier e;
    private byte[] f;

    public asvn(int i, int i2, atcu atcuVar, atcy atcyVar, atcx atcxVar, AlgorithmIdentifier algorithmIdentifier) {
        this.a = i;
        this.b = i2;
        int i3 = atcuVar.b;
        int i4 = 1;
        this.f = new byte[]{(byte) i3, (byte) (i3 >>> 8), (byte) (i3 >>> 16), (byte) (i3 >> 24)};
        int i5 = 8;
        while (atcyVar.a.a > i5) {
            i5 += 8;
            i4++;
        }
        byte[] bArr = new byte[atcyVar.c.length * i4];
        int i6 = 0;
        for (int i7 = 0; i7 < atcyVar.c.length; i7++) {
            int i8 = 0;
            while (i8 < i5) {
                bArr[i6] = (byte) (atcyVar.c[i7] >>> i8);
                i8 += 8;
                i6++;
            }
        }
        this.c = bArr;
        int length = atcxVar.a.length;
        int a = atcv.a(length - 1);
        byte[] bArr2 = new byte[(length * a) + 4];
        atow.Y(length, bArr2, 0);
        for (int i9 = 0; i9 < length; i9++) {
            int i10 = atcxVar.a[i9];
            int i11 = (i9 * a) + 4;
            for (int i12 = a - 1; i12 >= 0; i12--) {
                bArr2[i11 + i12] = (byte) (i10 >>> (i12 * 8));
            }
        }
        this.d = bArr2;
        this.e = algorithmIdentifier;
    }

    public final atcu a() {
        return new atcu(this.f);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.b(new ASN1Integer(this.a));
        aSN1EncodableVector.b(new ASN1Integer(this.b));
        aSN1EncodableVector.b(new DEROctetString(this.f));
        aSN1EncodableVector.b(new DEROctetString(this.c));
        aSN1EncodableVector.b(new DEROctetString(this.d));
        aSN1EncodableVector.b(this.e);
        return new DERSequence(aSN1EncodableVector);
    }

    public asvn(ASN1Sequence aSN1Sequence) {
        this.a = ((ASN1Integer) aSN1Sequence.h(0)).f();
        this.b = ((ASN1Integer) aSN1Sequence.h(1)).f();
        this.f = ((ASN1OctetString) aSN1Sequence.h(2)).c;
        this.c = ((ASN1OctetString) aSN1Sequence.h(3)).c;
        this.d = ((ASN1OctetString) aSN1Sequence.h(4)).c;
        this.e = AlgorithmIdentifier.a(aSN1Sequence.h(5));
    }
}
