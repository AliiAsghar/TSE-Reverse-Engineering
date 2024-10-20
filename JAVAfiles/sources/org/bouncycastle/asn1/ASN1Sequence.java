package org.bouncycastle.asn1;

import defpackage.atda;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ASN1Sequence extends ASN1Primitive implements Iterable<ASN1Encodable> {
    static final ASN1UniversalType a = new ASN1UniversalType(ASN1Sequence.class) { // from class: org.bouncycastle.asn1.ASN1Sequence.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public final ASN1Primitive b(ASN1Sequence aSN1Sequence) {
            return aSN1Sequence;
        }
    };
    ASN1Encodable[] b;

    /* compiled from: PG */
    /* renamed from: org.bouncycastle.asn1.ASN1Sequence$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass2 implements Enumeration {
        private int b = 0;

        public AnonymousClass2() {
        }

        @Override // java.util.Enumeration
        public final boolean hasMoreElements() {
            if (this.b < ASN1Sequence.this.b.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.Enumeration
        public final Object nextElement() {
            ASN1Sequence aSN1Sequence = ASN1Sequence.this;
            int i = this.b;
            ASN1Encodable[] aSN1EncodableArr = aSN1Sequence.b;
            if (i < aSN1EncodableArr.length) {
                this.b = i + 1;
                return aSN1EncodableArr[i];
            }
            throw new NoSuchElementException();
        }
    }

    /* compiled from: PG */
    /* renamed from: org.bouncycastle.asn1.ASN1Sequence$3, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass3 implements ASN1SequenceParser {
        @Override // org.bouncycastle.asn1.InMemoryRepresentable
        public final ASN1Primitive j() {
            throw null;
        }

        @Override // org.bouncycastle.asn1.ASN1Encodable
        public final ASN1Primitive p() {
            throw null;
        }
    }

    public ASN1Sequence() {
        this.b = ASN1EncodableVector.a;
    }

    public static ASN1Sequence j(Object obj) {
        if (obj != null && !(obj instanceof ASN1Sequence)) {
            if (obj instanceof ASN1Encodable) {
                ASN1Primitive p = ((ASN1Encodable) obj).p();
                if (p instanceof ASN1Sequence) {
                    return (ASN1Sequence) p;
                }
            } else if (obj instanceof byte[]) {
                try {
                    return (ASN1Sequence) a.c((byte[]) obj);
                } catch (IOException e) {
                    throw new IllegalArgumentException("failed to construct sequence from byte[]: ".concat(String.valueOf(e.getMessage())));
                }
            }
            throw new IllegalArgumentException("unknown object in getInstance: ".concat(String.valueOf(obj.getClass().getName())));
        }
        return (ASN1Sequence) obj;
    }

    public static ASN1Sequence m(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return (ASN1Sequence) a.d(aSN1TaggedObject, z);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean c(ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof ASN1Sequence)) {
            return false;
        }
        ASN1Sequence aSN1Sequence = (ASN1Sequence) aSN1Primitive;
        int e = e();
        if (aSN1Sequence.e() != e) {
            return false;
        }
        for (int i = 0; i < e; i++) {
            ASN1Primitive p = this.b[i].p();
            ASN1Primitive p2 = aSN1Sequence.b[i].p();
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

    public int e() {
        return this.b.length;
    }

    public Enumeration f() {
        return new AnonymousClass2();
    }

    public abstract ASN1BitString g();

    public ASN1Encodable h(int i) {
        return this.b[i];
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        int length = this.b.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length >= 0) {
                i = (i * 257) ^ this.b[length].p().hashCode();
            } else {
                return i;
            }
        }
    }

    public abstract ASN1OctetString i();

    @Override // java.lang.Iterable
    public Iterator<ASN1Encodable> iterator() {
        return new atda(this.b, 0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive k() {
        return new DERSequence(this.b, null);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive l() {
        return new DLSequence(this.b);
    }

    public abstract ASN1Set n();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ASN1BitString[] o() {
        int e = e();
        ASN1BitString[] aSN1BitStringArr = new ASN1BitString[e];
        for (int i = 0; i < e; i++) {
            aSN1BitStringArr[i] = ASN1BitString.i(this.b[i]);
        }
        return aSN1BitStringArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ASN1OctetString[] q() {
        int e = e();
        ASN1OctetString[] aSN1OctetStringArr = new ASN1OctetString[e];
        for (int i = 0; i < e; i++) {
            aSN1OctetStringArr[i] = ASN1OctetString.f(this.b[i]);
        }
        return aSN1OctetStringArr;
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

    public ASN1Sequence(ASN1Encodable[] aSN1EncodableArr, byte[] bArr) {
        this.b = aSN1EncodableArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ASN1Sequence(ASN1Encodable aSN1Encodable) {
        if (aSN1Encodable == null) {
            throw new NullPointerException("'element' cannot be null");
        }
        this.b = new ASN1Encodable[]{aSN1Encodable};
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ASN1Sequence(ASN1EncodableVector aSN1EncodableVector) {
        this.b = aSN1EncodableVector.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ASN1Sequence(ASN1Encodable[] aSN1EncodableArr) {
        if (aSN1EncodableArr != null) {
            for (ASN1Encodable aSN1Encodable : aSN1EncodableArr) {
                if (aSN1Encodable != null) {
                }
            }
            this.b = ASN1EncodableVector.c(aSN1EncodableArr);
            return;
        }
        throw new NullPointerException("'elements' cannot be null, or contain null");
    }
}
