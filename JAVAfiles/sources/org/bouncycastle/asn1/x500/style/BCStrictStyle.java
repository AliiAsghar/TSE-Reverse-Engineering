package org.bouncycastle.asn1.x500.style;

import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class BCStrictStyle extends BCStyle {
    static {
        new BCStrictStyle();
    }

    @Override // org.bouncycastle.asn1.x500.style.AbstractX500NameStyle, org.bouncycastle.asn1.x500.X500NameStyle
    public final boolean c(X500Name x500Name, X500Name x500Name2) {
        if (x500Name.a() != x500Name2.a()) {
            return false;
        }
        RDN[] c = x500Name.c();
        RDN[] c2 = x500Name2.c();
        for (int i = 0; i != c.length; i++) {
            if (!IETFUtils.e(c[i], c2[i])) {
                return false;
            }
        }
        return true;
    }
}
