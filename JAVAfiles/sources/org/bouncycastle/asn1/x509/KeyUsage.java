package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class KeyUsage extends ASN1Object {
    private final ASN1BitString a;

    public KeyUsage(ASN1BitString aSN1BitString) {
        this.a = aSN1BitString;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        return this.a;
    }

    public final String toString() {
        byte[] m = this.a.m();
        if (m.length == 1) {
            return "KeyUsage: 0x".concat(String.valueOf(Integer.toHexString(m[0] & 255)));
        }
        int i = m[1] & 255;
        return "KeyUsage: 0x".concat(String.valueOf(Integer.toHexString((m[0] & 255) | (i << 8))));
    }
}
