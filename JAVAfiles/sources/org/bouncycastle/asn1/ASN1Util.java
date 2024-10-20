package org.bouncycastle.asn1;

import defpackage.a;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ASN1Util {
    public static String a(int i, int i2) {
        if (i != 64) {
            if (i != 128) {
                if (i != 192) {
                    return a.cb(i2, "[UNIVERSAL ", "]");
                }
                return a.cb(i2, "[PRIVATE ", "]");
            }
            return a.cb(i2, "[CONTEXT ", "]");
        }
        return a.cb(i2, "[APPLICATION ", "]");
    }
}
