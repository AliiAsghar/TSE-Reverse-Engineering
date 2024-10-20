package defpackage;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akmy {
    public final Object a;

    public akmy(Object obj) {
        this.a = obj;
    }

    public static akmy c(enm enmVar, eoz eozVar) {
        boolean z;
        akmc akmcVar = (akmc) new eoy(eozVar.aL(), new akmd()).a(akmc.class);
        if (akmcVar.a.put(enmVar, new to()) == null) {
            z = true;
        } else {
            z = false;
        }
        albo.U(z, "A single instance of a LifecycleOwner was observed twice. Please report this occurrence using go/tiktok-bug.");
        enmVar.N().c(akmcVar);
        if (!akmcVar.b) {
            akmcVar.b = true;
            akmcVar.c = enmVar;
        }
        return new akmy(akmcVar);
    }

    public static alpt g(Set set, vl vlVar, akno aknoVar) {
        if (vlVar.containsKey(aknoVar)) {
            alpr alprVar = new alpr();
            for (akno aknoVar2 : (Set) vlVar.get(aknoVar)) {
                if (set.contains(aknoVar2)) {
                    alprVar.c(aknoVar2);
                } else {
                    alprVar.j(g(set, vlVar, aknoVar2));
                }
            }
            return alprVar.g();
        }
        return altg.a;
    }

    public static void h(vl vlVar, akno aknoVar, akno aknoVar2) {
        Set set = (Set) vlVar.get(aknoVar);
        if (set == null) {
            set = Collections.newSetFromMap(new tm());
            vlVar.put(aknoVar, set);
        }
        set.add(aknoVar2);
    }

    public final Object a(int i, enm enmVar, akmb akmbVar, akma akmaVar) {
        return ((akmc) this.a).a(i, enmVar, akmbVar, akmaVar);
    }

    public final void b() {
        if (((akec) ((algw) ((apxx) this.a).a).e()) == null) {
        } else {
            throw null;
        }
    }

    public final void d(String str) {
        ((agrk) this.a).x(str);
    }

    public final void e(String str) {
        ((agrk) this.a).z(str);
    }

    public final Object[] f() {
        return (Object[]) ((agrk) this.a).b;
    }

    public final akmy i() {
        return new akmy(((agrk) this.a).J());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.function.Consumer, java.lang.Object] */
    public final void j(int i) {
        Bundle a;
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 1) {
                a = akwu.e.a();
            } else {
                a = akwu.d.a();
            }
        } else {
            a = akwu.a.a();
        }
        this.a.accept(a);
    }

    public final akwa k(akvv akvvVar) {
        if (!((vl) this.a).isEmpty()) {
            Class<?> cls = akvvVar.getClass();
            int i = 0;
            while (true) {
                vl vlVar = (vl) this.a;
                if (i >= vlVar.d) {
                    break;
                }
                Class cls2 = (Class) vlVar.d(i);
                akvz akvzVar = (akvz) ((vl) this.a).g(i);
                if (cls2.isAssignableFrom(cls)) {
                    return akvzVar.a(akvvVar);
                }
                i++;
            }
        }
        return akwa.b;
    }

    public final void l(Class cls, akvz akvzVar) {
        int i = 0;
        while (true) {
            vl vlVar = (vl) this.a;
            if (i < vlVar.d) {
                Class<?> cls2 = (Class) vlVar.d(i);
                albo.N(!cls.equals(cls2), "Class %s is already registered as a listener. Are you adding the same listener twice?", cls.getSimpleName());
                albo.Q(!cls.isAssignableFrom(cls2), "For class %s, a listener is already registered as a subtype: %s", cls.getSimpleName(), cls2.getSimpleName());
                albo.Q(!cls2.isAssignableFrom(cls), "For class %s, a listener is already registered as a supertype: %s", cls.getSimpleName(), cls2.getSimpleName());
                i++;
            } else {
                vlVar.put(cls, akvzVar);
                return;
            }
        }
    }

    public final ListenableFuture m(Callable callable, Executor executor) {
        return ((atkn) this.a).a(akto.k(callable), executor);
    }

    public final ListenableFuture n(ancr ancrVar, Executor executor) {
        return ((atkn) this.a).b(akto.c(ancrVar), executor);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final boolean o() {
        return ((asqc) this.a.b()).y("com.google.android.apps.messaging.auto 45654233").e();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final boolean p() {
        return ((asqc) this.a.b()).y("com.google.android.apps.messaging.auto 45646636").e();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final boolean q() {
        return ((asqc) this.a.b()).y("com.google.android.apps.messaging.auto 45650151").e();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final boolean r() {
        return ((asqc) this.a.b()).y("com.google.android.apps.messaging.auto 45650578").e();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final boolean s() {
        return ((asqc) this.a.b()).y("com.google.android.apps.messaging.auto 45643135").e();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final boolean t() {
        return ((asqc) this.a.b()).y("com.google.android.apps.messaging.auto 45659809").e();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final boolean u() {
        return ((asqc) this.a.b()).y("com.google.android.apps.messaging.auto 45647521").e();
    }

    public akmy(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public akmy() {
        this.a = new agrk((short[]) null);
    }

    public akmy(ajwt ajwtVar, ansy ansyVar, agxw agxwVar, algw algwVar) {
        this.a = new akbj(new mtz(ansyVar, ajwtVar, agxwVar, algwVar, 12, null), andi.a);
    }

    public akmy(armf armfVar, armf armfVar2) {
        armfVar.getClass();
        armfVar2.getClass();
        this.a = armfVar;
        new LinkedHashMap();
    }

    public akmy(byte[] bArr) {
        this.a = new vl();
    }
}
