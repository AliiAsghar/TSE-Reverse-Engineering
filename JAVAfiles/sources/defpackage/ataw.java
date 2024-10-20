package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ataw {
    public static final Map a;
    public final atbb b;
    public final atbc c;
    public final int d;
    public final int e;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(1, new ataw(20, 2, NISTObjectIdentifiers.c));
        hashMap.put(2, new ataw(20, 4, NISTObjectIdentifiers.c));
        hashMap.put(3, new ataw(40, 2, NISTObjectIdentifiers.c));
        hashMap.put(4, new ataw(40, 4, NISTObjectIdentifiers.c));
        hashMap.put(5, new ataw(40, 8, NISTObjectIdentifiers.c));
        hashMap.put(6, new ataw(60, 3, NISTObjectIdentifiers.c));
        hashMap.put(7, new ataw(60, 6, NISTObjectIdentifiers.c));
        hashMap.put(8, new ataw(60, 12, NISTObjectIdentifiers.c));
        hashMap.put(9, new ataw(20, 2, NISTObjectIdentifiers.e));
        hashMap.put(10, new ataw(20, 4, NISTObjectIdentifiers.e));
        hashMap.put(11, new ataw(40, 2, NISTObjectIdentifiers.e));
        hashMap.put(12, new ataw(40, 4, NISTObjectIdentifiers.e));
        hashMap.put(13, new ataw(40, 8, NISTObjectIdentifiers.e));
        hashMap.put(14, new ataw(60, 3, NISTObjectIdentifiers.e));
        hashMap.put(15, new ataw(60, 6, NISTObjectIdentifiers.e));
        hashMap.put(16, new ataw(60, 12, NISTObjectIdentifiers.e));
        hashMap.put(17, new ataw(20, 2, NISTObjectIdentifiers.m));
        hashMap.put(18, new ataw(20, 4, NISTObjectIdentifiers.m));
        hashMap.put(19, new ataw(40, 2, NISTObjectIdentifiers.m));
        hashMap.put(20, new ataw(40, 4, NISTObjectIdentifiers.m));
        hashMap.put(21, new ataw(40, 8, NISTObjectIdentifiers.m));
        hashMap.put(22, new ataw(60, 3, NISTObjectIdentifiers.m));
        hashMap.put(23, new ataw(60, 6, NISTObjectIdentifiers.m));
        hashMap.put(24, new ataw(60, 12, NISTObjectIdentifiers.m));
        hashMap.put(25, new ataw(20, 2, NISTObjectIdentifiers.n));
        hashMap.put(26, new ataw(20, 4, NISTObjectIdentifiers.n));
        hashMap.put(27, new ataw(40, 2, NISTObjectIdentifiers.n));
        hashMap.put(28, new ataw(40, 4, NISTObjectIdentifiers.n));
        hashMap.put(29, new ataw(40, 8, NISTObjectIdentifiers.n));
        hashMap.put(30, new ataw(60, 3, NISTObjectIdentifiers.n));
        hashMap.put(31, new ataw(60, 6, NISTObjectIdentifiers.n));
        hashMap.put(32, new ataw(60, 12, NISTObjectIdentifiers.n));
        a = DesugarCollections.unmodifiableMap(hashMap);
    }

    public ataw(int i, int i2, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.d = i;
        this.e = i2;
        if (i >= 2) {
            if (i % i2 == 0) {
                int i3 = i / i2;
                if (i3 != 1) {
                    atbc atbcVar = new atbc(i3, aSN1ObjectIdentifier);
                    this.c = atbcVar;
                    this.b = (atag) atag.a.get(atag.a(b(), a(), atbcVar.g.b, i, i2));
                    return;
                }
                throw new IllegalArgumentException("height / layers must be greater than 1");
            }
            throw new IllegalArgumentException("layers must divide totalHeight without remainder");
        }
        throw new IllegalArgumentException("totalHeight must be > 1");
    }

    public final int a() {
        return this.c.f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String b() {
        return this.c.e;
    }

    public ataw(int i, int i2, assy assyVar) {
        this(i, i2, atai.a(assyVar.c()));
    }
}
