package org.bouncycastle.asn1;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class BERSequenceParser implements ASN1SequenceParser {
    private final ASN1StreamParser a;

    public BERSequenceParser(ASN1StreamParser aSN1StreamParser) {
        this.a = aSN1StreamParser;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static BERSequence a(ASN1StreamParser aSN1StreamParser) {
        return new BERSequence(aSN1StreamParser.c());
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
            throw new IllegalStateException(e.getMessage());
        }
    }
}
