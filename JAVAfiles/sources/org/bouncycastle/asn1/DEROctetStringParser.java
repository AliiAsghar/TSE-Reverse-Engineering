package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class DEROctetStringParser implements ASN1OctetStringParser {
    private final DefiniteLengthInputStream a;

    public DEROctetStringParser(DefiniteLengthInputStream definiteLengthInputStream) {
        this.a = definiteLengthInputStream;
    }

    @Override // org.bouncycastle.asn1.ASN1OctetStringParser
    public final InputStream e() {
        return this.a;
    }

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public final ASN1Primitive j() {
        return new DEROctetString(this.a.a());
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
