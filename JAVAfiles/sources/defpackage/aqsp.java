package defpackage;

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqsp {
    static final algs a = algs.c(',');
    public static final aqsp b = new aqsp(aqry.a, false, new aqsp(new aqry(1), true, new aqsp()));
    public final byte[] c;
    private final Map d;

    public aqsp() {
        this.d = new LinkedHashMap(0);
        this.c = new byte[0];
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [aqso, java.lang.Object] */
    public final aqso a(String str) {
        atkn atknVar = (atkn) this.d.get(str);
        if (atknVar != null) {
            return atknVar.b;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aqso, java.lang.Object] */
    private aqsp(aqso aqsoVar, boolean z, aqsp aqspVar) {
        String c = aqsoVar.c();
        d.t(!c.contains(","), "Comma is currently not allowed in message encoding");
        int size = aqspVar.d.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(aqspVar.d.containsKey(aqsoVar.c()) ? size : size + 1);
        for (atkn atknVar : aqspVar.d.values()) {
            String c2 = atknVar.b.c();
            if (!c2.equals(c)) {
                linkedHashMap.put(c2, new atkn(atknVar.b, atknVar.a));
            }
        }
        linkedHashMap.put(c, new atkn(aqsoVar, z));
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        this.d = unmodifiableMap;
        algs algsVar = a;
        HashSet hashSet = new HashSet(unmodifiableMap.size());
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            if (((atkn) entry.getValue()).a) {
                hashSet.add((String) entry.getKey());
            }
        }
        this.c = algsVar.d(DesugarCollections.unmodifiableSet(hashSet)).getBytes(Charset.forName("US-ASCII"));
    }
}
