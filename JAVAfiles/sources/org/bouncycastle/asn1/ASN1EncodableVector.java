package org.bouncycastle.asn1;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ASN1EncodableVector {
    static final ASN1Encodable[] a = new ASN1Encodable[0];
    public ASN1Encodable[] b;
    public int c;
    private boolean d;

    public ASN1EncodableVector() {
        this(10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ASN1Encodable[] c(ASN1Encodable[] aSN1EncodableArr) {
        if (aSN1EncodableArr.length <= 0) {
            return a;
        }
        return (ASN1Encodable[]) aSN1EncodableArr.clone();
    }

    public final ASN1Encodable a(int i) {
        int i2 = this.c;
        if (i < i2) {
            return this.b[i];
        }
        throw new ArrayIndexOutOfBoundsException(i + " >= " + i2);
    }

    public final void b(ASN1Encodable aSN1Encodable) {
        if (aSN1Encodable != null) {
            int length = this.b.length;
            boolean z = true;
            int i = this.c + 1;
            if (i <= length) {
                z = false;
            }
            if (z | this.d) {
                ASN1Encodable[] aSN1EncodableArr = new ASN1Encodable[Math.max(length, (i >> 1) + i)];
                System.arraycopy(this.b, 0, aSN1EncodableArr, 0, this.c);
                this.b = aSN1EncodableArr;
                this.d = false;
            }
            this.b[this.c] = aSN1Encodable;
            this.c = i;
            return;
        }
        throw new NullPointerException("'element' cannot be null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ASN1Encodable[] d() {
        int i = this.c;
        if (i == 0) {
            return a;
        }
        ASN1Encodable[] aSN1EncodableArr = this.b;
        if (aSN1EncodableArr.length == i) {
            this.d = true;
            return aSN1EncodableArr;
        }
        ASN1Encodable[] aSN1EncodableArr2 = new ASN1Encodable[i];
        System.arraycopy(aSN1EncodableArr, 0, aSN1EncodableArr2, 0, i);
        return aSN1EncodableArr2;
    }

    public ASN1EncodableVector(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("'initialCapacity' must not be negative");
        }
        this.b = i == 0 ? a : new ASN1Encodable[i];
        this.c = 0;
        this.d = false;
    }
}
