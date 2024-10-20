package org.bouncycastle.asn1;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ASN1ObjectDescriptor extends ASN1Primitive {
    public final ASN1GraphicString a;

    /* compiled from: PG */
    /* renamed from: org.bouncycastle.asn1.ASN1ObjectDescriptor$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass1 extends ASN1UniversalType {
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public final ASN1Primitive a(DEROctetString dEROctetString) {
            throw null;
        }

        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public final ASN1Primitive b(ASN1Sequence aSN1Sequence) {
            throw null;
        }
    }

    public ASN1ObjectDescriptor(ASN1GraphicString aSN1GraphicString) {
        this.a = aSN1GraphicString;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int a(boolean z) {
        return this.a.a(z);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void b(ASN1OutputStream aSN1OutputStream, boolean z) {
        aSN1OutputStream.m(z, 7);
        this.a.b(aSN1OutputStream, false);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean c(ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof ASN1ObjectDescriptor)) {
            return false;
        }
        return this.a.c(((ASN1ObjectDescriptor) aSN1Primitive).a);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean d() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public final int hashCode() {
        return ~this.a.hashCode();
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final ASN1Primitive k() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final ASN1Primitive l() {
        return this;
    }
}
