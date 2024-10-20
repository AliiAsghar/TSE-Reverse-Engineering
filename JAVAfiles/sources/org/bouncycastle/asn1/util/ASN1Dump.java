package org.bouncycastle.asn1.util;

import defpackage.a;
import defpackage.atdg;
import org.bouncycastle.asn1.ASN1BMPString;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1External;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1GraphicString;
import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1NumericString;
import org.bouncycastle.asn1.ASN1ObjectDescriptor;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1PrintableString;
import org.bouncycastle.asn1.ASN1RelativeOID;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1T61String;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1UTCTime;
import org.bouncycastle.asn1.ASN1UTF8String;
import org.bouncycastle.asn1.ASN1Util;
import org.bouncycastle.asn1.ASN1VideotexString;
import org.bouncycastle.asn1.ASN1VisibleString;
import org.bouncycastle.asn1.BEROctetString;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.BERSet;
import org.bouncycastle.asn1.BERTaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.DLBitString;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ASN1Dump {
    /* JADX WARN: Multi-variable type inference failed */
    public static String a(Object obj) {
        if (!(obj instanceof ASN1Primitive)) {
            if (obj instanceof ASN1Encodable) {
                obj.p();
            } else {
                return "unknown object type ".concat(String.valueOf(obj.toString()));
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        b("", (ASN1Primitive) obj, stringBuffer);
        return stringBuffer.toString();
    }

    static void b(String str, ASN1Primitive aSN1Primitive, StringBuffer stringBuffer) {
        boolean z = aSN1Primitive instanceof ASN1Null;
        String str2 = atdg.a;
        if (z) {
            stringBuffer.append(str);
            stringBuffer.append("NULL");
            stringBuffer.append(str2);
            return;
        }
        int i = 0;
        if (aSN1Primitive instanceof ASN1Sequence) {
            stringBuffer.append(str);
            if (aSN1Primitive instanceof BERSequence) {
                stringBuffer.append("BER Sequence");
            } else if (aSN1Primitive instanceof DERSequence) {
                stringBuffer.append("DER Sequence");
            } else {
                stringBuffer.append("Sequence");
            }
            stringBuffer.append(str2);
            ASN1Sequence aSN1Sequence = (ASN1Sequence) aSN1Primitive;
            int e = aSN1Sequence.e();
            while (i < e) {
                b(str.concat("    "), aSN1Sequence.h(i).p(), stringBuffer);
                i++;
            }
            return;
        }
        if (aSN1Primitive instanceof ASN1Set) {
            stringBuffer.append(str);
            if (aSN1Primitive instanceof BERSet) {
                stringBuffer.append("BER Set");
            } else if (aSN1Primitive instanceof DERSet) {
                stringBuffer.append("DER Set");
            } else {
                stringBuffer.append("Set");
            }
            stringBuffer.append(str2);
            ASN1Set aSN1Set = (ASN1Set) aSN1Primitive;
            int e2 = aSN1Set.e();
            while (i < e2) {
                b(str.concat("    "), aSN1Set.f(i).p(), stringBuffer);
                i++;
            }
            return;
        }
        if (aSN1Primitive instanceof ASN1TaggedObject) {
            stringBuffer.append(str);
            if (aSN1Primitive instanceof BERTaggedObject) {
                stringBuffer.append("BER Tagged ");
            } else if (aSN1Primitive instanceof DERTaggedObject) {
                stringBuffer.append("DER Tagged ");
            } else {
                stringBuffer.append("Tagged ");
            }
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Primitive;
            stringBuffer.append(ASN1Util.a(aSN1TaggedObject.b, aSN1TaggedObject.c));
            if (!aSN1TaggedObject.n()) {
                stringBuffer.append(" IMPLICIT ");
            }
            stringBuffer.append(str2);
            b(str.concat("    "), aSN1TaggedObject.e().p(), stringBuffer);
            return;
        }
        if (aSN1Primitive instanceof ASN1OctetString) {
            ASN1OctetString aSN1OctetString = (ASN1OctetString) aSN1Primitive;
            if (aSN1Primitive instanceof BEROctetString) {
                stringBuffer.append(str + "BER Constructed Octet String[" + aSN1OctetString.c.length + "] ");
            } else {
                stringBuffer.append(str + "DER Octet String[" + aSN1OctetString.c.length + "] ");
            }
            stringBuffer.append(str2);
            return;
        }
        if (aSN1Primitive instanceof ASN1ObjectIdentifier) {
            stringBuffer.append(str + "ObjectIdentifier(" + ((ASN1ObjectIdentifier) aSN1Primitive).b + ")" + str2);
            return;
        }
        if (aSN1Primitive instanceof ASN1RelativeOID) {
            stringBuffer.append(str + "RelativeOID(" + ((ASN1RelativeOID) aSN1Primitive).a + ")" + str2);
            return;
        }
        if (aSN1Primitive instanceof ASN1Boolean) {
            stringBuffer.append(str + "Boolean(" + ((ASN1Boolean) aSN1Primitive).h() + ")" + str2);
            return;
        }
        if (aSN1Primitive instanceof ASN1Integer) {
            stringBuffer.append(str + "Integer(" + ((ASN1Integer) aSN1Primitive).j().toString() + ")" + str2);
            return;
        }
        if (aSN1Primitive instanceof ASN1BitString) {
            ASN1BitString aSN1BitString = (ASN1BitString) aSN1Primitive;
            byte[] m = aSN1BitString.m();
            int f = aSN1BitString.f();
            if (aSN1BitString instanceof DERBitString) {
                stringBuffer.append(str + "DER Bit String[" + m.length + ", " + f + "] ");
            } else if (aSN1BitString instanceof DLBitString) {
                stringBuffer.append(str + "DL Bit String[" + m.length + ", " + f + "] ");
            } else {
                stringBuffer.append(str + "BER Bit String[" + m.length + ", " + f + "] ");
            }
            stringBuffer.append(str2);
            return;
        }
        if (aSN1Primitive instanceof ASN1IA5String) {
            stringBuffer.append(str + "IA5String(" + ((ASN1IA5String) aSN1Primitive).e() + ") " + str2);
            return;
        }
        if (aSN1Primitive instanceof ASN1UTF8String) {
            stringBuffer.append(str + "UTF8String(" + ((ASN1UTF8String) aSN1Primitive).e() + ") " + str2);
            return;
        }
        if (aSN1Primitive instanceof ASN1NumericString) {
            stringBuffer.append(str + "NumericString(" + ((ASN1NumericString) aSN1Primitive).e() + ") " + str2);
            return;
        }
        if (aSN1Primitive instanceof ASN1PrintableString) {
            stringBuffer.append(str + "PrintableString(" + ((ASN1PrintableString) aSN1Primitive).e() + ") " + str2);
            return;
        }
        if (aSN1Primitive instanceof ASN1VisibleString) {
            stringBuffer.append(str + "VisibleString(" + ((ASN1VisibleString) aSN1Primitive).e() + ") " + str2);
            return;
        }
        if (aSN1Primitive instanceof ASN1BMPString) {
            stringBuffer.append(str + "BMPString(" + ((ASN1BMPString) aSN1Primitive).e() + ") " + str2);
            return;
        }
        if (aSN1Primitive instanceof ASN1T61String) {
            stringBuffer.append(str + "T61String(" + ((ASN1T61String) aSN1Primitive).e() + ") " + str2);
            return;
        }
        if (aSN1Primitive instanceof ASN1GraphicString) {
            stringBuffer.append(str + "GraphicString(" + ((ASN1GraphicString) aSN1Primitive).e() + ") " + str2);
            return;
        }
        if (aSN1Primitive instanceof ASN1VideotexString) {
            stringBuffer.append(str + "VideotexString(" + ((ASN1VideotexString) aSN1Primitive).e() + ") " + str2);
            return;
        }
        if (aSN1Primitive instanceof ASN1UTCTime) {
            stringBuffer.append(str + "UTCTime(" + ((ASN1UTCTime) aSN1Primitive).f() + ") " + str2);
            return;
        }
        if (aSN1Primitive instanceof ASN1GeneralizedTime) {
            stringBuffer.append(str + "GeneralizedTime(" + ((ASN1GeneralizedTime) aSN1Primitive).e() + ") " + str2);
            return;
        }
        if (aSN1Primitive instanceof ASN1Enumerated) {
            stringBuffer.append(str + "DER Enumerated(" + ((ASN1Enumerated) aSN1Primitive).e().toString() + ")" + str2);
            return;
        }
        if (aSN1Primitive instanceof ASN1ObjectDescriptor) {
            stringBuffer.append(str + "ObjectDescriptor(" + ((ASN1ObjectDescriptor) aSN1Primitive).a.e() + ") " + str2);
            return;
        }
        if (aSN1Primitive instanceof ASN1External) {
            ASN1External aSN1External = (ASN1External) aSN1Primitive;
            stringBuffer.append(a.co(str2, str, "External "));
            ASN1ObjectIdentifier aSN1ObjectIdentifier = aSN1External.a;
            String concat = str.concat("    ");
            if (aSN1ObjectIdentifier != null) {
                stringBuffer.append(concat + "Direct Reference: " + aSN1ObjectIdentifier.b + str2);
            }
            ASN1Integer aSN1Integer = aSN1External.b;
            if (aSN1Integer != null) {
                stringBuffer.append(concat + "Indirect Reference: " + aSN1Integer.toString() + str2);
            }
            ASN1Primitive aSN1Primitive2 = aSN1External.c;
            if (aSN1Primitive2 != null) {
                b(concat, aSN1Primitive2, stringBuffer);
            }
            stringBuffer.append(concat + "Encoding: " + aSN1External.d + str2);
            b(concat, aSN1External.e, stringBuffer);
            return;
        }
        stringBuffer.append(str + aSN1Primitive.toString() + str2);
    }
}
