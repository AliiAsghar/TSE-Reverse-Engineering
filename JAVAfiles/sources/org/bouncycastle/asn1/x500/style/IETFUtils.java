package org.bouncycastle.asn1.x500.style;

import defpackage.atdg;
import defpackage.atdm;
import java.io.IOException;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.ASN1UniversalString;
import org.bouncycastle.asn1.x500.AttributeTypeAndValue;
import org.bouncycastle.asn1.x500.RDN;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class IETFUtils {
    public static String a(ASN1Encodable aSN1Encodable) {
        String b = b(aSN1Encodable);
        if (b.length() > 0 && b.charAt(0) == '#') {
            try {
                ASN1Encodable v = ASN1Primitive.v(atdm.f(b, b.length() - 1));
                if (v instanceof ASN1String) {
                    b = ((ASN1String) v).e();
                }
            } catch (IOException e) {
                throw new IllegalStateException("unknown encoding in name: ".concat(e.toString()));
            }
        }
        String b2 = atdg.b(b);
        int length = b2.length();
        if (length >= 2) {
            int i = length - 1;
            int i2 = 0;
            while (i2 < i && b2.charAt(i2) == '\\' && b2.charAt(i2 + 1) == ' ') {
                i2 += 2;
            }
            int i3 = i2 + 1;
            int i4 = i;
            while (i4 > i3 && b2.charAt(i4 - 1) == '\\' && b2.charAt(i4) == ' ') {
                i4 -= 2;
            }
            if (i2 > 0 || i4 < i) {
                b2 = b2.substring(i2, i4 + 1);
            }
            if (b2.indexOf("  ") >= 0) {
                StringBuffer stringBuffer = new StringBuffer();
                char charAt = b2.charAt(0);
                stringBuffer.append(charAt);
                for (int i5 = 1; i5 < b2.length(); i5++) {
                    char charAt2 = b2.charAt(i5);
                    if (charAt == ' ' && charAt2 == ' ') {
                        charAt = ' ';
                    } else {
                        stringBuffer.append(charAt2);
                        charAt = charAt2;
                    }
                }
                return stringBuffer.toString();
            }
            return b2;
        }
        return b2;
    }

    public static String b(ASN1Encodable aSN1Encodable) {
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        if ((aSN1Encodable instanceof ASN1String) && !(aSN1Encodable instanceof ASN1UniversalString)) {
            String e = ((ASN1String) aSN1Encodable).e();
            if (e.length() > 0 && e.charAt(0) == '#') {
                stringBuffer.append('\\');
            }
            stringBuffer.append(e);
        } else {
            try {
                stringBuffer.append('#');
                stringBuffer.append(atdm.a(aSN1Encodable.p().u()));
            } catch (IOException unused) {
                throw new IllegalArgumentException("Other value has no encoded form");
            }
        }
        int length = stringBuffer.length();
        int i2 = 2;
        if (stringBuffer.length() < 2 || stringBuffer.charAt(0) != '\\' || stringBuffer.charAt(1) != '#') {
            i2 = 0;
        }
        while (i2 != length) {
            char charAt = stringBuffer.charAt(i2);
            if (charAt != '\"' && charAt != '\\' && charAt != '+' && charAt != ',') {
                switch (charAt) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        break;
                    default:
                        i2++;
                        continue;
                }
            }
            stringBuffer.insert(i2, "\\");
            length++;
            i2 += 2;
        }
        if (stringBuffer.length() > 0) {
            while (stringBuffer.length() > i && stringBuffer.charAt(i) == ' ') {
                stringBuffer.insert(i, "\\");
                i += 2;
            }
        }
        int length2 = stringBuffer.length();
        while (true) {
            length2--;
            if (length2 >= i && stringBuffer.charAt(length2) == ' ') {
                stringBuffer.insert(length2, '\\');
            }
        }
        return stringBuffer.toString();
    }

    public static void c(StringBuffer stringBuffer, RDN rdn, Hashtable hashtable) {
        if (rdn.c()) {
            AttributeTypeAndValue[] d = rdn.d();
            boolean z = true;
            int i = 0;
            while (i != d.length) {
                if (!z) {
                    stringBuffer.append('+');
                }
                d(stringBuffer, d[i], hashtable);
                i++;
                z = false;
            }
            return;
        }
        if (rdn.b() != null) {
            d(stringBuffer, rdn.b(), hashtable);
        }
    }

    public static void d(StringBuffer stringBuffer, AttributeTypeAndValue attributeTypeAndValue, Hashtable hashtable) {
        String str = (String) hashtable.get(attributeTypeAndValue.a);
        if (str != null) {
            stringBuffer.append(str);
        } else {
            stringBuffer.append(attributeTypeAndValue.a.b);
        }
        stringBuffer.append('=');
        stringBuffer.append(b(attributeTypeAndValue.b));
    }

    public static boolean e(RDN rdn, RDN rdn2) {
        if (rdn.a() != rdn2.a()) {
            return false;
        }
        AttributeTypeAndValue[] d = rdn.d();
        AttributeTypeAndValue[] d2 = rdn2.d();
        if (d.length != d2.length) {
            return false;
        }
        for (int i = 0; i != d.length; i++) {
            AttributeTypeAndValue attributeTypeAndValue = d[i];
            AttributeTypeAndValue attributeTypeAndValue2 = d2[i];
            if (attributeTypeAndValue != attributeTypeAndValue2) {
                if (attributeTypeAndValue != null && attributeTypeAndValue2 != null) {
                    if (attributeTypeAndValue.a.x(attributeTypeAndValue2.a)) {
                        if (!a(attributeTypeAndValue.b).equals(a(attributeTypeAndValue2.b))) {
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }
}
