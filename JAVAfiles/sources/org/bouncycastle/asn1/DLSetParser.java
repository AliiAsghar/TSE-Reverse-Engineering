package org.bouncycastle.asn1;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class DLSetParser implements ASN1SetParser {
    private final ASN1StreamParser a;

    public DLSetParser(ASN1StreamParser aSN1StreamParser) {
        this.a = aSN1StreamParser;
    }

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public final ASN1Primitive j() {
        return DLFactory.b(this.a.c());
    }

    @Override // org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        try {
            return j();
        } catch (IOException e) {
            throw new ASN1ParsingException(e.getMessage(), e);
        }
    }
}
