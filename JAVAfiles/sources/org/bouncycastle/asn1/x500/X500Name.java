package org.bouncycastle.asn1.x500;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x500.style.BCStyle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class X500Name extends ASN1Object implements ASN1Choice {
    public static final /* synthetic */ int b = 0;
    private static final X500NameStyle c = BCStyle.K;
    public DERSequence a;
    private boolean d;
    private int e;
    private X500NameStyle f;
    private RDN[] g;

    public X500Name(X500NameStyle x500NameStyle, ASN1Sequence aSN1Sequence) {
        RDN rdn;
        int e = aSN1Sequence.e();
        this.f = x500NameStyle;
        this.g = new RDN[e];
        boolean z = true;
        for (int i = 0; i < e; i++) {
            ASN1Encodable h = aSN1Sequence.h(i);
            if (h instanceof RDN) {
                rdn = (RDN) h;
            } else {
                rdn = h != null ? new RDN(ASN1Set.g(h)) : null;
            }
            z &= rdn == h;
            this.g[i] = rdn;
        }
        if (z) {
            this.a = (DERSequence) aSN1Sequence.k();
        } else {
            this.a = new DERSequence(this.g);
        }
    }

    public static X500Name b(Object obj) {
        if (obj instanceof X500Name) {
            return (X500Name) obj;
        }
        if (obj != null) {
            return new X500Name(c, ASN1Sequence.j(obj));
        }
        return null;
    }

    public final int a() {
        return this.g.length;
    }

    public final RDN[] c() {
        return (RDN[]) this.g.clone();
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof X500Name) && !(obj instanceof ASN1Sequence)) {
            return false;
        }
        if (this.a.x(((ASN1Encodable) obj).p())) {
            return true;
        }
        try {
            return this.f.c(this, b(obj));
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public final int hashCode() {
        if (this.d) {
            return this.e;
        }
        this.d = true;
        int a = this.f.a(this);
        this.e = a;
        return a;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        return this.a;
    }

    public final String toString() {
        return this.f.b(this);
    }

    public X500Name(X500NameStyle x500NameStyle, X500Name x500Name) {
        this.f = x500NameStyle;
        this.g = x500Name.g;
        this.a = x500Name.a;
    }
}
