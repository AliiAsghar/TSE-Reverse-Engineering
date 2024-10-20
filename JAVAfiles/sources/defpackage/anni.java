package defpackage;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.HashSet;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anni {
    public static final /* synthetic */ int a = 0;

    static {
        Logger.getLogger(anni.class.getName());
        new ConcurrentHashMap();
        HashSet hashSet = new HashSet();
        hashSet.add(anmr.class);
        hashSet.add(anmt.class);
        hashSet.add(annk.class);
        hashSet.add(anmv.class);
        hashSet.add(anmu.class);
        hashSet.add(anne.class);
        hashSet.add(anve.class);
        hashSet.add(anng.class);
        hashSet.add(annh.class);
        DesugarCollections.unmodifiableSet(hashSet);
    }

    private anni() {
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    public static Class a(Class cls) {
        try {
            asmb asmbVar = (asmb) antp.a.b.get();
            if (asmbVar.a.containsKey(cls)) {
                return ((antz) asmbVar.a.get(cls)).a();
            }
            throw new GeneralSecurityException(a.bX(cls, "No input primitive class for ", " available"));
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static Object b(anxf anxfVar, Class cls) {
        String str = anxfVar.b;
        aozb aozbVar = anxfVar.c;
        anmw a2 = anta.a.a(str);
        if (a2.b().equals(cls)) {
            return a2.c(aozbVar);
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + String.valueOf(a2.getClass()) + ", which only supports: " + a2.b().toString());
    }
}
