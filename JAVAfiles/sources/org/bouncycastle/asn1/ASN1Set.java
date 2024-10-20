package org.bouncycastle.asn1;

import defpackage.atda;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ASN1Set extends ASN1Primitive implements Iterable<ASN1Encodable> {
    static final ASN1UniversalType a = new ASN1UniversalType(ASN1Set.class) { // from class: org.bouncycastle.asn1.ASN1Set.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public final ASN1Primitive b(ASN1Sequence aSN1Sequence) {
            return aSN1Sequence.n();
        }
    };
    protected final ASN1Encodable[] b;
    protected ASN1Encodable[] c;

    /* compiled from: PG */
    /* renamed from: org.bouncycastle.asn1.ASN1Set$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass2 implements Enumeration {
        @Override // java.util.Enumeration
        public final boolean hasMoreElements() {
            throw null;
        }

        @Override // java.util.Enumeration
        public final Object nextElement() {
            throw null;
        }
    }

    /* compiled from: PG */
    /* renamed from: org.bouncycastle.asn1.ASN1Set$3, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass3 implements ASN1SetParser {
        @Override // org.bouncycastle.asn1.InMemoryRepresentable
        public final ASN1Primitive j() {
            throw null;
        }

        @Override // org.bouncycastle.asn1.ASN1Encodable
        public final ASN1Primitive p() {
            throw null;
        }
    }

    public ASN1Set() {
        ASN1Encodable[] aSN1EncodableArr = ASN1EncodableVector.a;
        this.b = aSN1EncodableArr;
        this.c = aSN1EncodableArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ASN1Set g(Object obj) {
        if (obj != 0 && !(obj instanceof ASN1Set)) {
            ASN1Primitive p = obj.p();
            if (p instanceof ASN1Set) {
                return (ASN1Set) p;
            }
            throw new IllegalArgumentException("unknown object in getInstance: ".concat(String.valueOf(obj.getClass().getName())));
        }
        return (ASN1Set) obj;
    }

    public static ASN1Set h(ASN1TaggedObject aSN1TaggedObject) {
        return (ASN1Set) a.d(aSN1TaggedObject, false);
    }

    private static void i(ASN1Encodable[] aSN1EncodableArr) {
        byte[] bArr;
        ASN1Encodable aSN1Encodable;
        int i;
        int length = aSN1EncodableArr.length;
        if (length < 2) {
            return;
        }
        ASN1Encodable aSN1Encodable2 = aSN1EncodableArr[0];
        ASN1Encodable aSN1Encodable3 = aSN1EncodableArr[1];
        byte[] m = m(aSN1Encodable2);
        byte[] m2 = m(aSN1Encodable3);
        boolean j = j(m2, m);
        if (true != j) {
            bArr = m2;
        } else {
            bArr = m;
        }
        if (true == j) {
            m = m2;
        }
        if (true != j) {
            aSN1Encodable = aSN1Encodable3;
        } else {
            aSN1Encodable = aSN1Encodable2;
        }
        if (true == j) {
            aSN1Encodable2 = aSN1Encodable3;
        }
        for (int i2 = 2; i2 < length; i2++) {
            ASN1Encodable aSN1Encodable4 = aSN1EncodableArr[i2];
            byte[] m3 = m(aSN1Encodable4);
            if (j(bArr, m3)) {
                aSN1EncodableArr[i2 - 2] = aSN1Encodable2;
                aSN1Encodable2 = aSN1Encodable;
                m = bArr;
                aSN1Encodable = aSN1Encodable4;
                bArr = m3;
            } else if (j(m, m3)) {
                aSN1EncodableArr[i2 - 2] = aSN1Encodable2;
                aSN1Encodable2 = aSN1Encodable4;
                m = m3;
            } else {
                int i3 = i2 - 1;
                while (true) {
                    i = i3 - 1;
                    if (i <= 0) {
                        break;
                    }
                    ASN1Encodable aSN1Encodable5 = aSN1EncodableArr[i3 - 2];
                    if (j(m(aSN1Encodable5), m3)) {
                        break;
                    }
                    aSN1EncodableArr[i] = aSN1Encodable5;
                    i3 = i;
                }
                aSN1EncodableArr[i] = aSN1Encodable4;
            }
        }
        aSN1EncodableArr[length - 2] = aSN1Encodable2;
        aSN1EncodableArr[length - 1] = aSN1Encodable;
    }

    private static boolean j(byte[] bArr, byte[] bArr2) {
        int i = bArr[0] & 223;
        int i2 = bArr2[0] & 223;
        if (i != i2) {
            if (i >= i2) {
                return false;
            }
            return true;
        }
        int min = Math.min(bArr.length, bArr2.length) - 1;
        for (int i3 = 1; i3 < min; i3++) {
            byte b = bArr[i3];
            byte b2 = bArr2[i3];
            if (b != b2) {
                if ((b & 255) >= (b2 & 255)) {
                    return false;
                }
                return true;
            }
        }
        if ((bArr[min] & 255) > (bArr2[min] & 255)) {
            return false;
        }
        return true;
    }

    private static byte[] m(ASN1Encodable aSN1Encodable) {
        try {
            return aSN1Encodable.p().u();
        } catch (IOException unused) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean c(ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof ASN1Set)) {
            return false;
        }
        ASN1Set aSN1Set = (ASN1Set) aSN1Primitive;
        int e = e();
        if (aSN1Set.e() != e) {
            return false;
        }
        ASN1Primitive k = k();
        ASN1Primitive k2 = aSN1Set.k();
        for (int i = 0; i < e; i++) {
            ASN1Primitive p = ((DERSet) k).b[i].p();
            ASN1Primitive p2 = ((DERSet) k2).b[i].p();
            if (p != p2 && !p.c(p2)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean d() {
        return true;
    }

    public final int e() {
        return this.b.length;
    }

    public final ASN1Encodable f(int i) {
        return this.b[i];
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public final int hashCode() {
        int length = this.b.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length >= 0) {
                i += this.b[length].p().hashCode();
            } else {
                return i;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<ASN1Encodable> iterator() {
        return new atda(ASN1EncodableVector.c(this.b), 0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive k() {
        if (this.c == null) {
            ASN1Encodable[] aSN1EncodableArr = (ASN1Encodable[]) this.b.clone();
            this.c = aSN1EncodableArr;
            i(aSN1EncodableArr);
        }
        return new DERSet(this.c);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive l() {
        return new DLSet(this.b, this.c);
    }

    public final String toString() {
        int e = e();
        if (e == 0) {
            return "[]";
        }
        StringBuffer stringBuffer = new StringBuffer("[");
        int i = 0;
        while (true) {
            stringBuffer.append(this.b[i]);
            i++;
            if (i >= e) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }

    public ASN1Set(ASN1Encodable[] aSN1EncodableArr, ASN1Encodable[] aSN1EncodableArr2) {
        this.b = aSN1EncodableArr;
        this.c = aSN1EncodableArr2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ASN1Set(ASN1EncodableVector aSN1EncodableVector, boolean z) {
        ASN1Encodable[] d;
        int i;
        if (z && (i = aSN1EncodableVector.c) >= 2) {
            d = new ASN1Encodable[i];
            System.arraycopy(aSN1EncodableVector.b, 0, d, 0, i);
            i(d);
        } else {
            d = aSN1EncodableVector.d();
        }
        this.b = d;
        if (!z && d.length >= 2) {
            d = null;
        }
        this.c = d;
    }

    public ASN1Set(boolean z, ASN1Encodable[] aSN1EncodableArr) {
        this.b = aSN1EncodableArr;
        if (!z && aSN1EncodableArr.length >= 2) {
            aSN1EncodableArr = null;
        }
        this.c = aSN1EncodableArr;
    }
}
