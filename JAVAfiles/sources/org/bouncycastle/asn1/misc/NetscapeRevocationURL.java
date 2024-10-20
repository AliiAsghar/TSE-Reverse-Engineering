package org.bouncycastle.asn1.misc;

import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.DERIA5String;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class NetscapeRevocationURL extends DERIA5String {
    public NetscapeRevocationURL(ASN1IA5String aSN1IA5String) {
        super(aSN1IA5String.e());
    }

    @Override // org.bouncycastle.asn1.ASN1IA5String
    public final String toString() {
        return "NetscapeRevocationURL: ".concat(e());
    }
}
