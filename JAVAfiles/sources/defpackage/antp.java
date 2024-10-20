package defpackage;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class antp {
    public static final antp a = new antp();
    public final AtomicReference b = new AtomicReference(new asmb(new asmb((byte[]) null, (char[]) null), (byte[]) null));

    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.Map, java.lang.Object] */
    public final synchronized void a(antv antvVar) {
        asmb asmbVar = new asmb((asmb) this.b.get());
        if (antvVar != null) {
            antw antwVar = new antw((Class) antvVar.a, (Class) antvVar.b);
            if (asmbVar.b.containsKey(antwVar)) {
                antv antvVar2 = (antv) asmbVar.b.get(antwVar);
                if (!antvVar2.equals(antvVar) || !antvVar.equals(antvVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(antwVar.toString()));
                }
            } else {
                asmbVar.b.put(antwVar, antvVar);
            }
            this.b.set(new asmb(asmbVar, (byte[]) null));
        } else {
            throw new NullPointerException("primitive constructor must be non-null");
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.Map, java.lang.Object] */
    public final synchronized void b(antz antzVar) {
        asmb asmbVar = new asmb((asmb) this.b.get());
        ?? r0 = asmbVar.a;
        Class b = antzVar.b();
        if (r0.containsKey(b)) {
            antz antzVar2 = (antz) asmbVar.a.get(b);
            if (!antzVar2.equals(antzVar) || !antzVar.equals(antzVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(b.toString()));
            }
        } else {
            asmbVar.a.put(b, antzVar);
        }
        this.b.set(new asmb(asmbVar, (byte[]) null));
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [antu, java.lang.Object] */
    public final Object c(anme anmeVar, Class cls) {
        asmb asmbVar = (asmb) this.b.get();
        antw antwVar = new antw(anmeVar.getClass(), cls);
        if (asmbVar.b.containsKey(antwVar)) {
            return ((antv) asmbVar.b.get(antwVar)).c.a(anmeVar);
        }
        throw new GeneralSecurityException(a.bX(antwVar, "No PrimitiveConstructor for ", " available"));
    }
}
