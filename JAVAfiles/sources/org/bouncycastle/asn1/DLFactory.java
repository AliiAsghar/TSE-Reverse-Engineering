package org.bouncycastle.asn1;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public class DLFactory {
    static final DLSequence a = new DLSequence();
    static final DLSet b = new DLSet();

    DLFactory() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static DLSequence a(ASN1EncodableVector aSN1EncodableVector) {
        if (aSN1EncodableVector.c <= 0) {
            return a;
        }
        return new DLSequence(aSN1EncodableVector);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static DLSet b(ASN1EncodableVector aSN1EncodableVector) {
        if (aSN1EncodableVector.c <= 0) {
            return b;
        }
        return new DLSet(aSN1EncodableVector);
    }
}
