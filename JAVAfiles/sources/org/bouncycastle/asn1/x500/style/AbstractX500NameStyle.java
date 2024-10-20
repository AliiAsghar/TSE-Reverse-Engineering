package org.bouncycastle.asn1.x500.style;

import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.x500.AttributeTypeAndValue;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.X500NameStyle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class AbstractX500NameStyle implements X500NameStyle {
    public static Hashtable d(Hashtable hashtable) {
        Hashtable hashtable2 = new Hashtable();
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Object nextElement = keys.nextElement();
            hashtable2.put(nextElement, hashtable.get(nextElement));
        }
        return hashtable2;
    }

    private static final int e(ASN1Encodable aSN1Encodable) {
        return IETFUtils.a(aSN1Encodable).hashCode();
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public final int a(X500Name x500Name) {
        RDN[] c = x500Name.c();
        int i = 0;
        for (int i2 = 0; i2 != c.length; i2++) {
            if (c[i2].c()) {
                AttributeTypeAndValue[] d = c[i2].d();
                for (int i3 = 0; i3 != d.length; i3++) {
                    i = (i ^ d[i3].a.hashCode()) ^ e(d[i3].b);
                }
            } else {
                i = (i ^ c[i2].b().a.hashCode()) ^ e(c[i2].b().b);
            }
        }
        return i;
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public boolean c(X500Name x500Name, X500Name x500Name2) {
        if (x500Name.a() != x500Name2.a()) {
            return false;
        }
        RDN[] c = x500Name.c();
        RDN[] c2 = x500Name2.c();
        AttributeTypeAndValue b = c[0].b();
        AttributeTypeAndValue b2 = c2[0].b();
        boolean z = (b != null && b2 != null) ? !b.a.x(b2.a) : false;
        loop0: for (int i = 0; i != c.length; i++) {
            RDN rdn = c[i];
            if (z) {
                int length = c2.length;
                while (true) {
                    length--;
                    if (length < 0) {
                        break loop0;
                    }
                    RDN rdn2 = c2[length];
                    if (rdn2 != null && IETFUtils.e(rdn, rdn2)) {
                        c2[length] = null;
                        break;
                    }
                }
                return false;
            }
            for (int i2 = 0; i2 != c2.length; i2++) {
                RDN rdn3 = c2[i2];
                if (rdn3 != null && IETFUtils.e(rdn, rdn3)) {
                    c2[i2] = null;
                }
            }
            return false;
        }
        return true;
    }
}
