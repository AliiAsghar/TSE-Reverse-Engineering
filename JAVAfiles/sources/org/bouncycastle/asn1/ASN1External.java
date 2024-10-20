package org.bouncycastle.asn1;

import defpackage.a;
import defpackage.atow;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ASN1External extends ASN1Primitive {
    public ASN1ObjectIdentifier a;
    public ASN1Integer b;
    public ASN1Primitive c;
    public int d;
    public ASN1Primitive e;

    /* compiled from: PG */
    /* renamed from: org.bouncycastle.asn1.ASN1External$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass1 extends ASN1UniversalType {
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public final ASN1Primitive b(ASN1Sequence aSN1Sequence) {
            throw null;
        }
    }

    public ASN1External(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Integer aSN1Integer, ASN1Primitive aSN1Primitive, int i, ASN1Primitive aSN1Primitive2) {
        this.a = aSN1ObjectIdentifier;
        this.b = aSN1Integer;
        this.c = aSN1Primitive;
        g(i);
        this.d = i;
        if (i == 1) {
            ASN1OctetString.a.e(aSN1Primitive2);
        } else if (i == 2) {
            ASN1BitString.a.e(aSN1Primitive2);
        }
        this.e = aSN1Primitive2;
    }

    private static ASN1Primitive f(ASN1Sequence aSN1Sequence, int i) {
        if (aSN1Sequence.e() > i) {
            return aSN1Sequence.h(i).p();
        }
        throw new IllegalArgumentException("too few objects in input sequence");
    }

    private static void g(int i) {
        if (i >= 0 && i <= 2) {
        } else {
            throw new IllegalArgumentException(a.bV(i, "invalid encoding value: "));
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int a(boolean z) {
        return e().a(z);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void b(ASN1OutputStream aSN1OutputStream, boolean z) {
        aSN1OutputStream.m(z, 40);
        e().b(aSN1OutputStream, false);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean c(ASN1Primitive aSN1Primitive) {
        if (this == aSN1Primitive) {
            return true;
        }
        if (!(aSN1Primitive instanceof ASN1External)) {
            return false;
        }
        ASN1External aSN1External = (ASN1External) aSN1Primitive;
        if (atow.L(this.a, aSN1External.a) && atow.L(this.b, aSN1External.b) && atow.L(this.c, aSN1External.c) && this.d == aSN1External.d && this.e.x(aSN1External.e)) {
            return true;
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean d() {
        return true;
    }

    public abstract ASN1Sequence e();

    @Override // org.bouncycastle.asn1.ASN1Object
    public final int hashCode() {
        return (((atow.K(this.a) ^ atow.K(this.b)) ^ atow.K(this.c)) ^ this.d) ^ this.e.hashCode();
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive k() {
        return new DERExternal(this.a, this.b, this.c, this.d, this.e);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive l() {
        return new DLExternal(this.a, this.b, this.c, this.d, this.e);
    }

    public ASN1External(ASN1Sequence aSN1Sequence) {
        int i;
        ASN1Primitive p;
        ASN1Primitive f = f(aSN1Sequence, 0);
        if (f instanceof ASN1ObjectIdentifier) {
            this.a = (ASN1ObjectIdentifier) f;
            f = f(aSN1Sequence, 1);
            i = 1;
        } else {
            i = 0;
        }
        if (f instanceof ASN1Integer) {
            this.b = (ASN1Integer) f;
            i++;
            f = f(aSN1Sequence, i);
        }
        if (!(f instanceof ASN1TaggedObject)) {
            this.c = f;
            i++;
            f = f(aSN1Sequence, i);
        }
        if (aSN1Sequence.e() == i + 1) {
            if (f instanceof ASN1TaggedObject) {
                ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) f;
                int i2 = aSN1TaggedObject.c;
                g(i2);
                this.d = i2;
                int i3 = aSN1TaggedObject.b;
                int i4 = aSN1TaggedObject.c;
                if (i3 != 128) {
                    throw new IllegalArgumentException("invalid tag: ".concat(ASN1Util.a(i3, i4)));
                }
                if (i4 == 0) {
                    p = aSN1TaggedObject.f().p();
                } else if (i4 == 1) {
                    p = ASN1OctetString.g(aSN1TaggedObject, false);
                } else if (i4 == 2) {
                    p = ASN1BitString.o(aSN1TaggedObject);
                } else {
                    throw new IllegalArgumentException("invalid tag: ".concat(ASN1Util.a(128, i4)));
                }
                this.e = p;
                return;
            }
            throw new IllegalArgumentException("No tagged object found in sequence. Structure doesn't seem to be of type External");
        }
        throw new IllegalArgumentException("input sequence too large");
    }
}
