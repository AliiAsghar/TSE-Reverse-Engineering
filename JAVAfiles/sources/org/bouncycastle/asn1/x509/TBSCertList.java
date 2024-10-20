package org.bouncycastle.asn1.x509;

import java.util.Enumeration;
import java.util.NoSuchElementException;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1UTCTime;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x500.X500Name;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class TBSCertList extends ASN1Object {
    public ASN1Integer a;
    public AlgorithmIdentifier b;
    X500Name c;
    public Time d;
    public Time e;
    ASN1Sequence f;
    public Extensions g;

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static class CRLEntry extends ASN1Object {
        public ASN1Sequence a;
        Extensions b;

        private CRLEntry(ASN1Sequence aSN1Sequence) {
            if (aSN1Sequence.e() >= 2 && aSN1Sequence.e() <= 3) {
                this.a = aSN1Sequence;
                return;
            }
            throw new IllegalArgumentException("Bad sequence size: " + aSN1Sequence.e());
        }

        public static CRLEntry c(Object obj) {
            if (obj instanceof CRLEntry) {
                return (CRLEntry) obj;
            }
            if (obj != null) {
                return new CRLEntry(ASN1Sequence.j(obj));
            }
            return null;
        }

        public final ASN1Integer a() {
            return ASN1Integer.m(this.a.h(0));
        }

        public final Extensions b() {
            if (this.b == null && this.a.e() == 3) {
                this.b = Extensions.c(this.a.h(2));
            }
            return this.b;
        }

        public final boolean d() {
            if (this.a.e() == 3) {
                return true;
            }
            return false;
        }

        @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
        public final ASN1Primitive p() {
            return this.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static class EmptyEnumeration implements Enumeration {
        @Override // java.util.Enumeration
        public final boolean hasMoreElements() {
            return false;
        }

        @Override // java.util.Enumeration
        public final Object nextElement() {
            throw new NoSuchElementException("Empty Enumeration");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static class RevokedCertificatesEnumeration implements Enumeration {
        private final Enumeration a;

        public RevokedCertificatesEnumeration(Enumeration enumeration) {
            this.a = enumeration;
        }

        @Override // java.util.Enumeration
        public final boolean hasMoreElements() {
            return this.a.hasMoreElements();
        }

        @Override // java.util.Enumeration
        public final Object nextElement() {
            return CRLEntry.c(this.a.nextElement());
        }
    }

    public TBSCertList(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.e() >= 3 && aSN1Sequence.e() <= 7) {
            int i = 0;
            if (aSN1Sequence.h(0) instanceof ASN1Integer) {
                this.a = ASN1Integer.m(aSN1Sequence.h(0));
                i = 1;
            } else {
                this.a = null;
            }
            this.b = AlgorithmIdentifier.a(aSN1Sequence.h(i));
            this.c = X500Name.b(aSN1Sequence.h(i + 1));
            int i2 = i + 3;
            this.d = Time.c(aSN1Sequence.h(i + 2));
            if (i2 < aSN1Sequence.e() && ((aSN1Sequence.h(i2) instanceof ASN1UTCTime) || (aSN1Sequence.h(i2) instanceof ASN1GeneralizedTime) || (aSN1Sequence.h(i2) instanceof Time))) {
                this.e = Time.c(aSN1Sequence.h(i2));
                i2 = i + 4;
            }
            if (i2 < aSN1Sequence.e() && !(aSN1Sequence.h(i2) instanceof ASN1TaggedObject)) {
                this.f = ASN1Sequence.j(aSN1Sequence.h(i2));
                i2++;
            }
            if (i2 < aSN1Sequence.e() && (aSN1Sequence.h(i2) instanceof ASN1TaggedObject)) {
                this.g = Extensions.c(ASN1Sequence.m((ASN1TaggedObject) aSN1Sequence.h(i2), true));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + aSN1Sequence.e());
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(7);
        ASN1Integer aSN1Integer = this.a;
        if (aSN1Integer != null) {
            aSN1EncodableVector.b(aSN1Integer);
        }
        aSN1EncodableVector.b(this.b);
        aSN1EncodableVector.b(this.c);
        aSN1EncodableVector.b(this.d);
        Time time = this.e;
        if (time != null) {
            aSN1EncodableVector.b(time);
        }
        ASN1Sequence aSN1Sequence = this.f;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.b(aSN1Sequence);
        }
        Extensions extensions = this.g;
        if (extensions != null) {
            aSN1EncodableVector.b(new DERTaggedObject(extensions));
        }
        return new DERSequence(aSN1EncodableVector);
    }
}
