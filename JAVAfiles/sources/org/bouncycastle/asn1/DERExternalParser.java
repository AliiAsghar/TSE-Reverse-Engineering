package org.bouncycastle.asn1;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class DERExternalParser implements ASN1ExternalParser {
    private final ASN1StreamParser a;

    public DERExternalParser(ASN1StreamParser aSN1StreamParser) {
        this.a = aSN1StreamParser;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static DLExternal a(ASN1StreamParser aSN1StreamParser) {
        try {
            return new DLExternal(new DLSequence(aSN1StreamParser.c()));
        } catch (IllegalArgumentException e) {
            throw new ASN1Exception(e.getMessage(), e);
        }
    }

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public final ASN1Primitive j() {
        return a(this.a);
    }

    @Override // org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        try {
            return j();
        } catch (IOException e) {
            throw new ASN1ParsingException("unable to get DER object", e);
        } catch (IllegalArgumentException e2) {
            throw new ASN1ParsingException("unable to get DER object", e2);
        }
    }
}
