package org.bouncycastle.asn1;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
class BERTaggedObjectParser implements ASN1TaggedObjectParser {
    final int a;
    final int b;
    final ASN1StreamParser c;

    public BERTaggedObjectParser(int i, int i2, ASN1StreamParser aSN1StreamParser) {
        this.a = i;
        this.b = i2;
        this.c = aSN1StreamParser;
    }

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public ASN1Primitive j() {
        return this.c.d(this.a, this.b);
    }

    @Override // org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        try {
            return j();
        } catch (IOException e) {
            throw new ASN1ParsingException(e.getMessage());
        }
    }
}
