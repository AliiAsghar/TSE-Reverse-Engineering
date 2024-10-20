package org.bouncycastle.asn1.x509;

import defpackage.aotl;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERSequence;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class X509Extensions extends ASN1Object {
    private Hashtable a = new Hashtable();
    private Vector b = new Vector();

    static {
        aotl.K();
    }

    public X509Extensions(Vector vector, Hashtable hashtable) {
        Enumeration elements = vector.elements();
        while (elements.hasMoreElements()) {
            this.b.addElement(ASN1ObjectIdentifier.f(elements.nextElement()));
        }
        Enumeration elements2 = this.b.elements();
        while (elements2.hasMoreElements()) {
            ASN1ObjectIdentifier f = ASN1ObjectIdentifier.f(elements2.nextElement());
            this.a.put(f, (X509Extension) hashtable.get(f));
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(this.b.size());
        Enumeration elements = this.b.elements();
        if (!elements.hasMoreElements()) {
            return new DERSequence(aSN1EncodableVector);
        }
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector(3);
        ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) elements.nextElement();
        aSN1EncodableVector2.b(aSN1ObjectIdentifier);
        throw null;
    }
}
