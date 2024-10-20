package defpackage;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class antq {
    public static final antq a = (antq) anuj.a(new anpd(9));
    public final AtomicReference b = new AtomicReference(new atii(new atii(), (byte[]) null));

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [antb, java.lang.Object] */
    public final anme a(anuf anufVar, annj annjVar) {
        atii atiiVar = (atii) this.b.get();
        anug anugVar = new anug(anufVar.getClass(), ((anua) anufVar).b);
        if (atiiVar.c.containsKey(anugVar)) {
            return ((antv) atiiVar.c.get(anugVar)).c.a(anufVar);
        }
        throw new GeneralSecurityException(a.bX(anugVar, "No Key Parser for requested key type ", " available"));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [antc, java.lang.Object] */
    public final anuf b(anme anmeVar, Class cls, annj annjVar) {
        atii atiiVar = (atii) this.b.get();
        anuh anuhVar = new anuh(anmeVar.getClass(), cls);
        if (atiiVar.b.containsKey(anuhVar)) {
            return ((antv) atiiVar.b.get(anuhVar)).c.a(anmeVar);
        }
        throw new GeneralSecurityException(a.bX(anuhVar, "No Key serializer for ", " available"));
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.Map, java.lang.Object] */
    public final synchronized void c(antv antvVar) {
        atii atiiVar = new atii((atii) this.b.get());
        anuh anuhVar = new anuh((Class) antvVar.b, (Class) antvVar.a);
        if (atiiVar.a.containsKey(anuhVar)) {
            antv antvVar2 = (antv) atiiVar.a.get(anuhVar);
            if (!antvVar2.equals(antvVar) || !antvVar.equals(antvVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(anuhVar.toString()));
            }
        } else {
            atiiVar.a.put(anuhVar, antvVar);
        }
        this.b.set(new atii(atiiVar, (byte[]) null));
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.Map, java.lang.Object] */
    public final synchronized void d(antv antvVar) {
        atii atiiVar = new atii((atii) this.b.get());
        anug anugVar = new anug((Class) antvVar.a, (aocj) antvVar.b);
        if (atiiVar.b.containsKey(anugVar)) {
            antv antvVar2 = (antv) atiiVar.b.get(anugVar);
            if (!antvVar2.equals(antvVar) || !antvVar.equals(antvVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(anugVar.toString()));
            }
        } else {
            atiiVar.b.put(anugVar, antvVar);
        }
        this.b.set(new atii(atiiVar, (byte[]) null));
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.Map, java.lang.Object] */
    public final synchronized void e(antv antvVar) {
        atii atiiVar = new atii((atii) this.b.get());
        anuh anuhVar = new anuh((Class) antvVar.b, (Class) antvVar.a);
        if (atiiVar.d.containsKey(anuhVar)) {
            antv antvVar2 = (antv) atiiVar.d.get(anuhVar);
            if (!antvVar2.equals(antvVar) || !antvVar.equals(antvVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(anuhVar.toString()));
            }
        } else {
            atiiVar.d.put(anuhVar, antvVar);
        }
        this.b.set(new atii(atiiVar, (byte[]) null));
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.Map, java.lang.Object] */
    public final synchronized void f(antv antvVar) {
        atii atiiVar = new atii((atii) this.b.get());
        anug anugVar = new anug((Class) antvVar.a, (aocj) antvVar.b);
        if (atiiVar.c.containsKey(anugVar)) {
            antv antvVar2 = (antv) atiiVar.c.get(anugVar);
            if (!antvVar2.equals(antvVar) || !antvVar.equals(antvVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(anugVar.toString()));
            }
        } else {
            atiiVar.c.put(anugVar, antvVar);
        }
        this.b.set(new atii(atiiVar, (byte[]) null));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [ants, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map, java.lang.Object] */
    public final anme g(anuf anufVar) {
        atii atiiVar = (atii) this.b.get();
        anug anugVar = new anug(anufVar.getClass(), ((anub) anufVar).a);
        if (atiiVar.a.containsKey(anugVar)) {
            return ((antv) atiiVar.a.get(anugVar)).c.a(anufVar);
        }
        throw new GeneralSecurityException(a.bX(anugVar, "No Parameters Parser for requested key type ", " available"));
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [antt, java.lang.Object] */
    public final anuf h(anme anmeVar, Class cls) {
        atii atiiVar = (atii) this.b.get();
        anuh anuhVar = new anuh(anmeVar.getClass(), cls);
        if (atiiVar.d.containsKey(anuhVar)) {
            return ((antv) atiiVar.d.get(anuhVar)).c.a(anmeVar);
        }
        throw new GeneralSecurityException(a.bX(anuhVar, "No Key Format serializer for ", " available"));
    }
}
