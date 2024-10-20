package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class BasicConstraints extends ASN1Object {
    ASN1Boolean a;
    public ASN1Integer b;

    private BasicConstraints(ASN1Sequence aSN1Sequence) {
        this.a = ASN1Boolean.g(false);
        this.b = null;
        if (aSN1Sequence.e() == 0) {
            this.a = null;
            this.b = null;
            return;
        }
        if (aSN1Sequence.h(0) instanceof ASN1Boolean) {
            this.a = ASN1Boolean.f(aSN1Sequence.h(0));
        } else {
            this.a = null;
            this.b = ASN1Integer.m(aSN1Sequence.h(0));
        }
        if (aSN1Sequence.e() > 1) {
            if (this.a != null) {
                this.b = ASN1Integer.m(aSN1Sequence.h(1));
                return;
            }
            throw new IllegalArgumentException("wrong sequence in constructor");
        }
    }

    public static BasicConstraints a(Object obj) {
        if (obj != null) {
            return new BasicConstraints(ASN1Sequence.j(obj));
        }
        return null;
    }

    public final boolean b() {
        ASN1Boolean aSN1Boolean = this.a;
        if (aSN1Boolean != null && aSN1Boolean.h()) {
            return true;
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        ASN1Boolean aSN1Boolean = this.a;
        if (aSN1Boolean != null) {
            aSN1EncodableVector.b(aSN1Boolean);
        }
        ASN1Integer aSN1Integer = this.b;
        if (aSN1Integer != null) {
            aSN1EncodableVector.b(aSN1Integer);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public final String toString() {
        ASN1Integer aSN1Integer = this.b;
        if (aSN1Integer == null) {
            return "BasicConstraints: isCa(" + b() + ")";
        }
        return "BasicConstraints: isCa(" + b() + "), pathLenConstraint = " + aSN1Integer.j().toString();
    }
}
