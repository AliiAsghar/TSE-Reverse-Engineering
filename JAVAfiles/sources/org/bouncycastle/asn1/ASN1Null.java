package org.bouncycastle.asn1;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ASN1Null extends ASN1Primitive {

    /* compiled from: PG */
    /* renamed from: org.bouncycastle.asn1.ASN1Null$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass1 extends ASN1UniversalType {
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public final ASN1Primitive a(DEROctetString dEROctetString) {
            throw null;
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean c(ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof ASN1Null)) {
            return false;
        }
        return true;
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public final int hashCode() {
        return -1;
    }

    public final String toString() {
        return "NULL";
    }
}
