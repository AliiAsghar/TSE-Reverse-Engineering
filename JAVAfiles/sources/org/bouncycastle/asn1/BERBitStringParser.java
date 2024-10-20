package org.bouncycastle.asn1;

import defpackage.atow;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class BERBitStringParser implements ASN1BitStringParser {
    private final ASN1StreamParser a;
    private ConstructedBitStream b;

    public BERBitStringParser(ASN1StreamParser aSN1StreamParser) {
        this.a = aSN1StreamParser;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static BERBitString a(ASN1StreamParser aSN1StreamParser) {
        ConstructedBitStream constructedBitStream = new ConstructedBitStream(aSN1StreamParser);
        return new BERBitString(atow.A(constructedBitStream), constructedBitStream.a);
    }

    @Override // org.bouncycastle.asn1.ASN1BitStringParser
    public final int f() {
        return this.b.a;
    }

    @Override // org.bouncycastle.asn1.ASN1BitStringParser
    public final InputStream g() {
        ConstructedBitStream constructedBitStream = new ConstructedBitStream(this.a);
        this.b = constructedBitStream;
        return constructedBitStream;
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
            throw new ASN1ParsingException("IOException converting stream to byte array: ".concat(String.valueOf(e.getMessage())), e);
        }
    }
}
