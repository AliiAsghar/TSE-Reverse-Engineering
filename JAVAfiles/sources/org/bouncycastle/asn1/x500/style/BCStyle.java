package org.bouncycastle.asn1.x500.style;

import com.android.vcard.VCardConstants;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.X500NameStyle;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class BCStyle extends AbstractX500NameStyle {
    public static final ASN1ObjectIdentifier A;
    public static final ASN1ObjectIdentifier B;
    public static final ASN1ObjectIdentifier C;
    public static final ASN1ObjectIdentifier D;
    public static final ASN1ObjectIdentifier E;
    public static final ASN1ObjectIdentifier F;
    public static final ASN1ObjectIdentifier G;
    public static final ASN1ObjectIdentifier H;
    public static final ASN1ObjectIdentifier I;
    public static final ASN1ObjectIdentifier J;
    public static final X500NameStyle K;
    private static final Hashtable M;
    private static final Hashtable N;
    public static final ASN1ObjectIdentifier a;
    public static final ASN1ObjectIdentifier b;
    public static final ASN1ObjectIdentifier c;
    public static final ASN1ObjectIdentifier d;
    public static final ASN1ObjectIdentifier e;
    public static final ASN1ObjectIdentifier f;
    public static final ASN1ObjectIdentifier g;
    public static final ASN1ObjectIdentifier h;
    public static final ASN1ObjectIdentifier i;
    public static final ASN1ObjectIdentifier j;
    public static final ASN1ObjectIdentifier k;
    public static final ASN1ObjectIdentifier l;
    public static final ASN1ObjectIdentifier m;
    public static final ASN1ObjectIdentifier n;
    public static final ASN1ObjectIdentifier o;
    public static final ASN1ObjectIdentifier p;
    public static final ASN1ObjectIdentifier q;
    public static final ASN1ObjectIdentifier r;
    public static final ASN1ObjectIdentifier s;
    public static final ASN1ObjectIdentifier t;
    public static final ASN1ObjectIdentifier u;
    public static final ASN1ObjectIdentifier v;
    public static final ASN1ObjectIdentifier w;
    public static final ASN1ObjectIdentifier x;
    public static final ASN1ObjectIdentifier y;
    public static final ASN1ObjectIdentifier z;
    protected final Hashtable L = d(M);

    static {
        ASN1ObjectIdentifier g2 = new ASN1ObjectIdentifier("2.5.4.6").g();
        a = g2;
        ASN1ObjectIdentifier g3 = new ASN1ObjectIdentifier("2.5.4.10").g();
        b = g3;
        ASN1ObjectIdentifier g4 = new ASN1ObjectIdentifier("2.5.4.11").g();
        c = g4;
        ASN1ObjectIdentifier g5 = new ASN1ObjectIdentifier("2.5.4.12").g();
        d = g5;
        ASN1ObjectIdentifier g6 = new ASN1ObjectIdentifier("2.5.4.3").g();
        e = g6;
        new ASN1ObjectIdentifier("2.5.4.5").g();
        ASN1ObjectIdentifier g7 = new ASN1ObjectIdentifier("2.5.4.9").g();
        f = g7;
        ASN1ObjectIdentifier g8 = new ASN1ObjectIdentifier("2.5.4.5").g();
        g = g8;
        ASN1ObjectIdentifier g9 = new ASN1ObjectIdentifier("2.5.4.7").g();
        h = g9;
        ASN1ObjectIdentifier g10 = new ASN1ObjectIdentifier("2.5.4.8").g();
        i = g10;
        ASN1ObjectIdentifier g11 = new ASN1ObjectIdentifier("2.5.4.4").g();
        j = g11;
        ASN1ObjectIdentifier g12 = new ASN1ObjectIdentifier("2.5.4.42").g();
        k = g12;
        ASN1ObjectIdentifier g13 = new ASN1ObjectIdentifier("2.5.4.43").g();
        l = g13;
        ASN1ObjectIdentifier g14 = new ASN1ObjectIdentifier("2.5.4.44").g();
        m = g14;
        ASN1ObjectIdentifier g15 = new ASN1ObjectIdentifier("2.5.4.45").g();
        n = g15;
        ASN1ObjectIdentifier g16 = new ASN1ObjectIdentifier("2.5.4.13").g();
        o = g16;
        ASN1ObjectIdentifier g17 = new ASN1ObjectIdentifier("2.5.4.15").g();
        p = g17;
        ASN1ObjectIdentifier g18 = new ASN1ObjectIdentifier("2.5.4.17").g();
        q = g18;
        ASN1ObjectIdentifier g19 = new ASN1ObjectIdentifier("2.5.4.46").g();
        r = g19;
        ASN1ObjectIdentifier g20 = new ASN1ObjectIdentifier("2.5.4.65").g();
        s = g20;
        ASN1ObjectIdentifier g21 = new ASN1ObjectIdentifier("2.5.4.72").g();
        t = g21;
        ASN1ObjectIdentifier g22 = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.1").g();
        u = g22;
        ASN1ObjectIdentifier g23 = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.2").g();
        v = g23;
        ASN1ObjectIdentifier g24 = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.3").g();
        w = g24;
        ASN1ObjectIdentifier g25 = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.4").g();
        x = g25;
        ASN1ObjectIdentifier g26 = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.5").g();
        y = g26;
        ASN1ObjectIdentifier g27 = new ASN1ObjectIdentifier("1.3.36.8.3.14").g();
        z = g27;
        ASN1ObjectIdentifier g28 = new ASN1ObjectIdentifier("2.5.4.16").g();
        A = g28;
        new ASN1ObjectIdentifier("2.5.4.54").g();
        ASN1ObjectIdentifier aSN1ObjectIdentifier = X509ObjectIdentifiers.a;
        B = aSN1ObjectIdentifier;
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = X509ObjectIdentifiers.b;
        C = aSN1ObjectIdentifier2;
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = X509ObjectIdentifiers.c;
        D = aSN1ObjectIdentifier3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = PKCSObjectIdentifiers.v;
        E = aSN1ObjectIdentifier4;
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = PKCSObjectIdentifiers.w;
        F = aSN1ObjectIdentifier5;
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = PKCSObjectIdentifiers.x;
        G = aSN1ObjectIdentifier6;
        H = aSN1ObjectIdentifier4;
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = new ASN1ObjectIdentifier("0.9.2342.19200300.100.1.25");
        I = aSN1ObjectIdentifier7;
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = new ASN1ObjectIdentifier("0.9.2342.19200300.100.1.1");
        J = aSN1ObjectIdentifier8;
        Hashtable hashtable = new Hashtable();
        M = hashtable;
        Hashtable hashtable2 = new Hashtable();
        N = hashtable2;
        hashtable.put(g2, "C");
        hashtable.put(g3, "O");
        hashtable.put(g5, "T");
        hashtable.put(g4, "OU");
        hashtable.put(g6, "CN");
        hashtable.put(g9, "L");
        hashtable.put(g10, "ST");
        hashtable.put(g8, "SERIALNUMBER");
        hashtable.put(aSN1ObjectIdentifier4, "E");
        hashtable.put(aSN1ObjectIdentifier7, "DC");
        hashtable.put(aSN1ObjectIdentifier8, VCardConstants.PROPERTY_UID);
        hashtable.put(g7, "STREET");
        hashtable.put(g11, "SURNAME");
        hashtable.put(g12, "GIVENNAME");
        hashtable.put(g13, "INITIALS");
        hashtable.put(g14, "GENERATION");
        hashtable.put(g16, "DESCRIPTION");
        hashtable.put(g21, VCardConstants.PROPERTY_ROLE);
        hashtable.put(aSN1ObjectIdentifier6, "unstructuredAddress");
        hashtable.put(aSN1ObjectIdentifier5, "unstructuredName");
        hashtable.put(g15, "UniqueIdentifier");
        hashtable.put(g19, "DN");
        hashtable.put(g20, "Pseudonym");
        hashtable.put(g28, "PostalAddress");
        hashtable.put(g27, "NameAtBirth");
        hashtable.put(g25, "CountryOfCitizenship");
        hashtable.put(g26, "CountryOfResidence");
        hashtable.put(g24, "Gender");
        hashtable.put(g23, "PlaceOfBirth");
        hashtable.put(g22, "DateOfBirth");
        hashtable.put(g18, "PostalCode");
        hashtable.put(g17, "BusinessCategory");
        hashtable.put(aSN1ObjectIdentifier, "TelephoneNumber");
        hashtable.put(aSN1ObjectIdentifier2, "Name");
        hashtable.put(aSN1ObjectIdentifier3, "organizationIdentifier");
        hashtable2.put("c", g2);
        hashtable2.put("o", g3);
        hashtable2.put("t", g5);
        hashtable2.put("ou", g4);
        hashtable2.put("cn", g6);
        hashtable2.put("l", g9);
        hashtable2.put("st", g10);
        hashtable2.put("sn", g11);
        hashtable2.put("serialnumber", g8);
        hashtable2.put("street", g7);
        hashtable2.put("emailaddress", aSN1ObjectIdentifier4);
        hashtable2.put("dc", aSN1ObjectIdentifier7);
        hashtable2.put("e", aSN1ObjectIdentifier4);
        hashtable2.put("uid", aSN1ObjectIdentifier8);
        hashtable2.put("surname", g11);
        hashtable2.put("givenname", g12);
        hashtable2.put("initials", g13);
        hashtable2.put("generation", g14);
        hashtable2.put("description", g16);
        hashtable2.put("role", g21);
        hashtable2.put("unstructuredaddress", aSN1ObjectIdentifier6);
        hashtable2.put("unstructuredname", aSN1ObjectIdentifier5);
        hashtable2.put("uniqueidentifier", g15);
        hashtable2.put("dn", g19);
        hashtable2.put("pseudonym", g20);
        hashtable2.put("postaladdress", g28);
        hashtable2.put("nameatbirth", g27);
        hashtable2.put("countryofcitizenship", g25);
        hashtable2.put("countryofresidence", g26);
        hashtable2.put("gender", g24);
        hashtable2.put("placeofbirth", g23);
        hashtable2.put("dateofbirth", g22);
        hashtable2.put("postalcode", g18);
        hashtable2.put("businesscategory", g17);
        hashtable2.put("telephonenumber", aSN1ObjectIdentifier);
        hashtable2.put("name", aSN1ObjectIdentifier2);
        hashtable2.put("organizationidentifier", aSN1ObjectIdentifier3);
        K = new BCStyle();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BCStyle() {
        d(N);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public final String b(X500Name x500Name) {
        StringBuffer stringBuffer = new StringBuffer();
        RDN[] c2 = x500Name.c();
        boolean z2 = true;
        int i2 = 0;
        while (i2 < c2.length) {
            if (!z2) {
                stringBuffer.append(',');
            }
            IETFUtils.c(stringBuffer, c2[i2], this.L);
            i2++;
            z2 = false;
        }
        return stringBuffer.toString();
    }
}
