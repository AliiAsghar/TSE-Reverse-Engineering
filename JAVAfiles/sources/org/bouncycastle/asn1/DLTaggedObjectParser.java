package org.bouncycastle.asn1;

/* compiled from: PG */
/* loaded from: classes4.dex */
class DLTaggedObjectParser extends BERTaggedObjectParser {
    private final boolean d;

    public DLTaggedObjectParser(int i, int i2, boolean z, ASN1StreamParser aSN1StreamParser) {
        super(i, i2, aSN1StreamParser);
        this.d = z;
    }

    @Override // org.bouncycastle.asn1.BERTaggedObjectParser, org.bouncycastle.asn1.InMemoryRepresentable
    public final ASN1Primitive j() {
        boolean z = this.d;
        int i = this.a;
        int i2 = this.b;
        ASN1StreamParser aSN1StreamParser = this.c;
        if (!z) {
            return ASN1TaggedObject.h(i, i2, ((DefiniteLengthInputStream) aSN1StreamParser.a).a());
        }
        return ASN1TaggedObject.g(i, i2, aSN1StreamParser.c());
    }
}
