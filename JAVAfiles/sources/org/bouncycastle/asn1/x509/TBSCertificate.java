package org.bouncycastle.asn1.x509;

import defpackage.a;
import defpackage.atde;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x500.X500Name;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class TBSCertificate extends ASN1Object {
    ASN1Sequence a;
    public ASN1Integer b;
    public ASN1Integer c;
    public AlgorithmIdentifier d;
    X500Name e;
    Time f;
    Time g;
    X500Name h;
    public SubjectPublicKeyInfo i;
    public ASN1BitString j;
    public ASN1BitString k;
    public Extensions l;

    private TBSCertificate(ASN1Sequence aSN1Sequence) {
        int i;
        boolean z;
        boolean z2;
        this.a = aSN1Sequence;
        if (aSN1Sequence.h(0) instanceof ASN1TaggedObject) {
            this.b = ASN1Integer.n((ASN1TaggedObject) aSN1Sequence.h(0), true);
            i = 0;
        } else {
            this.b = new ASN1Integer(0L);
            i = -1;
        }
        if (this.b.o(0)) {
            z2 = false;
            z = true;
        } else if (this.b.o(1)) {
            z = false;
            z2 = true;
        } else if (this.b.o(2)) {
            z = false;
            z2 = false;
        } else {
            throw new IllegalArgumentException("version number not recognised");
        }
        this.c = ASN1Integer.m(aSN1Sequence.h(i + 1));
        this.d = AlgorithmIdentifier.a(aSN1Sequence.h(i + 2));
        this.e = X500Name.b(aSN1Sequence.h(i + 3));
        ASN1Sequence aSN1Sequence2 = (ASN1Sequence) aSN1Sequence.h(i + 4);
        this.f = Time.c(aSN1Sequence2.h(0));
        this.g = Time.c(aSN1Sequence2.h(1));
        this.h = X500Name.b(aSN1Sequence.h(i + 5));
        int i2 = i + 6;
        this.i = SubjectPublicKeyInfo.b(aSN1Sequence.h(i2));
        int e = (aSN1Sequence.e() - i2) - 1;
        if (e != 0 && z) {
            throw new IllegalArgumentException("version 1 certificate contains extra data");
        }
        while (e > 0) {
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Sequence.h(i2 + e);
            int i3 = aSN1TaggedObject.c;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        if (!z2) {
                            this.l = Extensions.c(ASN1Sequence.m(aSN1TaggedObject, true));
                        } else {
                            throw new IllegalArgumentException("version 2 certificate cannot contain extensions");
                        }
                    } else {
                        throw new IllegalArgumentException(a.bV(i3, "Unknown tag encountered in structure: "));
                    }
                } else {
                    this.k = ASN1BitString.o(aSN1TaggedObject);
                }
            } else {
                this.j = ASN1BitString.o(aSN1TaggedObject);
            }
            e--;
        }
    }

    public static TBSCertificate a(Object obj) {
        if (obj instanceof TBSCertificate) {
            return (TBSCertificate) obj;
        }
        if (obj != null) {
            return new TBSCertificate(ASN1Sequence.j(obj));
        }
        return null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        if (atde.a("org.bouncycastle.x509.allow_non-der_tbscert") != null && !atde.b("org.bouncycastle.x509.allow_non-der_tbscert")) {
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            if (!this.b.o(0)) {
                aSN1EncodableVector.b(new DERTaggedObject(true, 0, this.b));
            }
            aSN1EncodableVector.b(this.c);
            aSN1EncodableVector.b(this.d);
            aSN1EncodableVector.b(this.e);
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector(2);
            aSN1EncodableVector2.b(this.f);
            aSN1EncodableVector2.b(this.g);
            aSN1EncodableVector.b(new DERSequence(aSN1EncodableVector2));
            X500Name x500Name = this.h;
            if (x500Name != null) {
                aSN1EncodableVector.b(x500Name);
            } else {
                aSN1EncodableVector.b(new DERSequence());
            }
            aSN1EncodableVector.b(this.i);
            ASN1BitString aSN1BitString = this.j;
            if (aSN1BitString != null) {
                aSN1EncodableVector.b(new DERTaggedObject(false, 1, aSN1BitString));
            }
            ASN1BitString aSN1BitString2 = this.k;
            if (aSN1BitString2 != null) {
                aSN1EncodableVector.b(new DERTaggedObject(false, 2, aSN1BitString2));
            }
            Extensions extensions = this.l;
            if (extensions != null) {
                aSN1EncodableVector.b(new DERTaggedObject(true, 3, extensions));
            }
            return new DERSequence(aSN1EncodableVector);
        }
        return this.a;
    }
}
