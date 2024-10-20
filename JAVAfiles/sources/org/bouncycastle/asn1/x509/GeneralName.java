package org.bouncycastle.asn1.x509;

import defpackage.a;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1UniversalType;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x500.X500Name;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class GeneralName extends ASN1Object implements ASN1Choice {
    public final ASN1Encodable a;
    public final int b;

    public GeneralName(int i, ASN1Encodable aSN1Encodable) {
        this.a = aSN1Encodable;
        this.b = i;
    }

    public static GeneralName a(Object obj) {
        ASN1ObjectIdentifier aSN1ObjectIdentifier;
        if (obj != null && !(obj instanceof GeneralName)) {
            if (obj instanceof ASN1TaggedObject) {
                ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) obj;
                int i = aSN1TaggedObject.c;
                switch (i) {
                    case 0:
                    case 3:
                    case 5:
                        return new GeneralName(i, ASN1Sequence.m(aSN1TaggedObject, false));
                    case 1:
                    case 2:
                    case 6:
                        return new GeneralName(i, (ASN1IA5String) ASN1IA5String.a.d(aSN1TaggedObject, false));
                    case 4:
                        return new GeneralName(i, X500Name.b(ASN1Sequence.m(aSN1TaggedObject, true)));
                    case 7:
                        return new GeneralName(i, ASN1OctetString.g(aSN1TaggedObject, false));
                    case 8:
                        int i2 = aSN1TaggedObject.a;
                        ASN1UniversalType aSN1UniversalType = ASN1ObjectIdentifier.a;
                        if (i2 != 3 && i2 != 4 && aSN1TaggedObject.b == 128) {
                            ASN1Primitive p = aSN1TaggedObject.e().p();
                            if (!(p instanceof ASN1ObjectIdentifier)) {
                                aSN1ObjectIdentifier = ASN1ObjectIdentifier.e(ASN1OctetString.f(p).c, true);
                                return new GeneralName(i, aSN1ObjectIdentifier);
                            }
                        }
                        aSN1ObjectIdentifier = (ASN1ObjectIdentifier) ASN1ObjectIdentifier.a.d(aSN1TaggedObject, false);
                        return new GeneralName(i, aSN1ObjectIdentifier);
                    default:
                        throw new IllegalArgumentException(a.bV(i, "unknown tag: "));
                }
            }
            if (obj instanceof byte[]) {
                try {
                    return a(ASN1Primitive.v((byte[]) obj));
                } catch (IOException unused) {
                    throw new IllegalArgumentException("unable to parse encoded general name");
                }
            }
            throw new IllegalArgumentException("unknown object in getInstance: ".concat(String.valueOf(obj.getClass().getName())));
        }
        return (GeneralName) obj;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        boolean z;
        int i = this.b;
        if (i == 4) {
            z = true;
        } else {
            z = false;
        }
        return new DERTaggedObject(z, i, this.a);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.b);
        stringBuffer.append(": ");
        int i = this.b;
        if (i != 1 && i != 2) {
            if (i != 4) {
                if (i != 6) {
                    stringBuffer.append(this.a.toString());
                }
            } else {
                stringBuffer.append(X500Name.b(this.a).toString());
            }
            return stringBuffer.toString();
        }
        stringBuffer.append(ASN1IA5String.f(this.a).e());
        return stringBuffer.toString();
    }
}
