package org.bouncycastle.asn1.x509;

import defpackage.atde;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class Extensions extends ASN1Object {
    private Hashtable a = new Hashtable();
    private Vector b = new Vector();

    private Extensions(ASN1Sequence aSN1Sequence) {
        Extension extension;
        if (aSN1Sequence.e() != 0) {
            Enumeration f = aSN1Sequence.f();
            while (f.hasMoreElements()) {
                Object nextElement = f.nextElement();
                boolean z = nextElement instanceof Extension;
                ASN1ObjectIdentifier aSN1ObjectIdentifier = Extension.a;
                if (z) {
                    extension = (Extension) nextElement;
                } else if (nextElement != null) {
                    extension = new Extension(ASN1Sequence.j(nextElement));
                } else {
                    extension = null;
                }
                if (this.a.containsKey(extension.s) && !atde.b("org.bouncycastle.x509.ignore_repeated_extensions")) {
                    throw new IllegalArgumentException("repeated extension found: ".concat(String.valueOf(String.valueOf(extension.s))));
                }
                this.a.put(extension.s, extension);
                this.b.addElement(extension.s);
            }
            return;
        }
        throw new IllegalArgumentException("empty extension sequence found");
    }

    public static Extensions c(Object obj) {
        if (obj instanceof Extensions) {
            return (Extensions) obj;
        }
        if (obj != null) {
            return new Extensions(ASN1Sequence.j(obj));
        }
        return null;
    }

    public final Enumeration a() {
        return this.b.elements();
    }

    public final Extension b(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (Extension) this.a.get(aSN1ObjectIdentifier);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public final ASN1Primitive p() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(this.b.size());
        Enumeration elements = this.b.elements();
        while (elements.hasMoreElements()) {
            aSN1EncodableVector.b((Extension) this.a.get((ASN1ObjectIdentifier) elements.nextElement()));
        }
        return new DERSequence(aSN1EncodableVector);
    }
}
