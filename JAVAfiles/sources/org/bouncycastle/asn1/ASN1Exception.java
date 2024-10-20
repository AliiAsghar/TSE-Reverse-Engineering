package org.bouncycastle.asn1;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ASN1Exception extends IOException {
    private Throwable a;

    public ASN1Exception(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }

    public ASN1Exception(String str, Throwable th) {
        super(str);
        this.a = th;
    }
}
