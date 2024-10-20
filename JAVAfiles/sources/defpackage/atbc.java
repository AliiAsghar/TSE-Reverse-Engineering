package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atbc {
    public static final Map a;
    public final atbb b;
    public final int c;
    public final int d;
    public final String e;
    public final int f;
    public final atar g;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(1, new atbc(10, NISTObjectIdentifiers.c));
        hashMap.put(2, new atbc(16, NISTObjectIdentifiers.c));
        hashMap.put(3, new atbc(20, NISTObjectIdentifiers.c));
        hashMap.put(4, new atbc(10, NISTObjectIdentifiers.e));
        hashMap.put(5, new atbc(16, NISTObjectIdentifiers.e));
        hashMap.put(6, new atbc(20, NISTObjectIdentifiers.e));
        hashMap.put(7, new atbc(10, NISTObjectIdentifiers.m));
        hashMap.put(8, new atbc(16, NISTObjectIdentifiers.m));
        hashMap.put(9, new atbc(20, NISTObjectIdentifiers.m));
        hashMap.put(10, new atbc(10, NISTObjectIdentifiers.n));
        hashMap.put(11, new atbc(16, NISTObjectIdentifiers.n));
        hashMap.put(12, new atbc(20, NISTObjectIdentifiers.n));
        a = DesugarCollections.unmodifiableMap(hashMap);
    }

    public atbc(int i, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (i < 2) {
            throw new IllegalArgumentException("height must be >= 2");
        }
        if (aSN1ObjectIdentifier != null) {
            this.c = i;
            int i2 = 2;
            while (true) {
                int i3 = this.c;
                if (i2 > i3) {
                    throw new IllegalStateException("should never happen...");
                }
                if ((i3 - i2) % 2 == 0) {
                    this.d = i2;
                    String str = (String) atai.a.get(aSN1ObjectIdentifier);
                    if (str != null) {
                        this.e = str;
                        atar atarVar = new atar(aSN1ObjectIdentifier);
                        this.g = atarVar;
                        int i4 = atarVar.a;
                        this.f = i4;
                        this.b = (atah) atah.a.get(atah.a(str, i4, atarVar.b, i));
                        return;
                    }
                    throw new IllegalArgumentException("unrecognized digest oid: ".concat(aSN1ObjectIdentifier.toString()));
                }
                i2++;
            }
        } else {
            throw new NullPointerException("digest == null");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final atap a() {
        return new atap(this.g);
    }

    public atbc(int i, assy assyVar) {
        this(i, atai.a(assyVar.c()));
    }
}
