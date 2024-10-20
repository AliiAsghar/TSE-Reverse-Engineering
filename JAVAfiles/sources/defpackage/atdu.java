package defpackage;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.V3TBSCertificateGenerator;
import org.bouncycastle.asn1.x509.X509ExtensionsGenerator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atdu {
    public final astu a;
    public final V3TBSCertificateGenerator b;
    public ASN1ObjectIdentifier c;
    public AlgorithmIdentifier d;
    public String e;
    public final X509ExtensionsGenerator f;

    public atdu() {
        new asuo();
        this.a = new astu();
        this.b = new V3TBSCertificateGenerator();
        this.f = new X509ExtensionsGenerator();
    }
}
