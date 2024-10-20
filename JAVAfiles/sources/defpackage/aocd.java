package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aocd implements annh {
    public static final ansy a;
    public static final byte[] b;
    public static final byte[] c;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        anme.v(aobr.SHA256, anze.a, hashMap, hashMap2);
        anme.v(aobr.SHA384, anze.b, hashMap, hashMap2);
        anme.v(aobr.SHA512, anze.c, hashMap, hashMap2);
        a = anme.u(hashMap, hashMap2);
        b = new byte[0];
        c = new byte[]{0};
    }

    @Override // defpackage.annh
    public final void a(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
