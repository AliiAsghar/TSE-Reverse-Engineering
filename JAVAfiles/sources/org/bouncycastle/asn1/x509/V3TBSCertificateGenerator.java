package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x500.X500Name;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class V3TBSCertificateGenerator {
    public final DERTaggedObject a = new DERTaggedObject(true, 0, new ASN1Integer(2));
    public ASN1Integer b;
    public AlgorithmIdentifier c;
    public X500Name d;
    public Time e;
    public Time f;
    public X500Name g;
    public SubjectPublicKeyInfo h;
    public Extensions i;
    public boolean j;
}
