package defpackage;

import java.io.IOException;
import java.security.Principal;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.X509Name;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asup extends X509Name implements Principal {
    public asup(X500Name x500Name) {
        super(x500Name.a);
    }

    @Override // java.security.Principal
    public final String getName() {
        return toString();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, defpackage.atdc
    public final byte[] s() {
        try {
            return u();
        } catch (IOException e) {
            throw new RuntimeException(e.toString());
        }
    }

    public asup(byte[] bArr) {
        try {
            super(ASN1Sequence.j(new ASN1InputStream(bArr).f()));
        } catch (IllegalArgumentException e) {
            throw new IOException("not an ASN.1 Sequence: ".concat(e.toString()));
        }
    }
}
