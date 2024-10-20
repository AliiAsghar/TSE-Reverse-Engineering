package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akdp implements apxw {
    public static arwe a(arpi arpiVar) {
        arpiVar.getClass();
        return arwi.e(arpiVar.plus(new aryj(null)));
    }

    public static arwe c(arpi arpiVar) {
        arpiVar.getClass();
        return arwi.e(arpiVar.plus(new aryj(null)));
    }

    public static arwe d(arpi arpiVar, cg cgVar) {
        arpiVar.getClass();
        enh N = cgVar.N();
        N.getClass();
        return aktp.z(arpiVar, N);
    }

    public static arwe e(arpi arpiVar, apwu apwuVar) {
        arpiVar.getClass();
        apwuVar.getClass();
        aiut.c();
        aryj aryjVar = new aryj(null);
        apwuVar.a(new akdu(aryjVar, 0));
        return arwi.e(arpiVar.plus(aryjVar));
    }

    public static ajyk f(akka akkaVar) {
        akkaVar.getClass();
        return new akaf(akkaVar, 2);
    }

    public static Map g(Map map, Map map2, Map map3, Map map4, Map map5) {
        map4.getClass();
        map5.getClass();
        alok alokVar = new alok();
        for (Map.Entry entry : ((alor) map).entrySet()) {
            alokVar.h(akec.i(map3, (akjd) entry.getKey()), new akdj((armf) entry.getValue(), 4));
        }
        for (Map.Entry entry2 : ((alor) map2).entrySet()) {
            alokVar.h(akec.i(map3, (akjd) entry2.getKey()), new akdj((armf) entry2.getValue(), 5));
        }
        alor b = alokVar.b();
        Set keySet = map4.keySet();
        alpt keySet2 = b.keySet();
        keySet2.getClass();
        if (keySet.containsAll(keySet2)) {
            alpt keySet3 = b.keySet();
            keySet3.getClass();
            ArrayList arrayList = new ArrayList();
            for (Object obj : keySet3) {
                if (map5.keySet().contains((String) obj)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                return b;
            }
            arrayList.toString();
            throw new IllegalStateException("Packages cannot use both @PhenotypeApplicationSpecificProperties and @PhenotypeRuntimeProperties. Conflicting packages: ".concat(arrayList.toString()));
        }
        throw new IllegalStateException("Parameters provided for mendel package not in use. Known packages: " + map4.keySet() + ", params provided: " + b.keySet());
    }

    public static Map h(Map map, Map map2, Map map3, Map map4) {
        map3.getClass();
        map4.getClass();
        alok alokVar = new alok();
        for (Map.Entry entry : ((alor) map).entrySet()) {
            alokVar.h(akec.i(map2, (akjd) entry.getKey()), ((armf) entry.getValue()).b());
        }
        alor b = alokVar.b();
        Set keySet = map3.keySet();
        alpt keySet2 = b.keySet();
        keySet2.getClass();
        if (keySet.containsAll(keySet2)) {
            alpt keySet3 = b.keySet();
            keySet3.getClass();
            ArrayList arrayList = new ArrayList();
            for (Object obj : keySet3) {
                if (map4.keySet().contains((String) obj)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                return b;
            }
            arrayList.toString();
            throw new IllegalStateException("Packages cannot use both @PhenotypeApplicationSpecificProperties and @PhenotypeRuntimeProperties. Conflicting packages: ".concat(arrayList.toString()));
        }
        throw new IllegalStateException("Parameters provided for mendel package not in use. Known packages: " + map3.keySet() + ", params provided: " + b.keySet());
    }

    public static akkj i(final ahtx ahtxVar, final akjh akjhVar) {
        ahtxVar.getClass();
        return new akkj() { // from class: akji
            /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, anen] */
            @Override // defpackage.akkj
            public final ListenableFuture a() {
                akjj akjjVar = new akjj(ahtxVar, 0);
                akrh f = aktp.f("Registering packages with phenotype", akrk.a);
                akjh akjhVar2 = akjh.this;
                try {
                    Set keySet = akjhVar2.f.keySet();
                    ArrayList arrayList = new ArrayList(aqjn.J(keySet, 10));
                    Iterator it = keySet.iterator();
                    while (it.hasNext()) {
                        String h = akjhVar2.m.h((String) it.next());
                        asqe asqeVar = akjhVar2.l;
                        ListenableFuture submit = asqeVar.c.submit(akto.k(new ahes(asqeVar, h, 19)));
                        submit.getClass();
                        ListenableFuture Z = aktp.Z(aktp.Z(submit, new ajzp(new aaoa((Object) akjhVar2, (Object) h, (Object) akjjVar, 11, (char[]) null), 11), akjhVar2.b), new akjx(new afho(akjhVar2, h, 20), 1), andi.a);
                        akat.c(Z, "Failed to register for %s", h);
                        arrayList.add(Z);
                    }
                    f.b(aktp.aq(arrayList).n(new akdj(akjhVar2, 10), andi.a));
                    armd.i(f, null);
                    return aneh.a;
                } finally {
                }
            }
        };
    }

    public static void j(ajwt ajwtVar) {
        boolean z;
        if (ajwtVar != null) {
            z = true;
        } else {
            z = false;
        }
        albo.U(z, "Null propagated AccountId! Check that you have included one of the following modules:\n\t//java/com/google/apps/tiktok/account:module\n\t//java/com/google/apps/tiktok/account/testing:module");
        ajwtVar.getClass();
    }

    public static cj k(Activity activity) {
        try {
            return (cj) activity;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Expected activity to be a FragmentActivity: ".concat(activity.toString()), e);
        }
    }

    public static enh l(cj cjVar) {
        enh N = cjVar.N();
        N.getClass();
        return N;
    }

    public static String m(Bundle bundle) {
        d.t(bundle.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "String @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(String argument) overload.");
        String string = bundle.getString("TIKTOK_FRAGMENT_ARGUMENT");
        string.getClass();
        return string;
    }

    public static aomv n(Context context, apwt apwtVar, algw algwVar) {
        apwtVar.getClass();
        return new aomv(context, new acss(apwtVar, 13), ((Boolean) algwVar.d(false)).booleanValue());
    }

    public static akkj o(akyr akyrVar) {
        akyrVar.getClass();
        return new akiz(akyrVar, 0);
    }

    public static akgu p(cg cgVar, akmy akmyVar, ahiy ahiyVar, Executor executor) {
        return new akhc(new akhf(new akgz(cgVar, akmyVar, executor), akmyVar, ahiyVar, executor, cgVar));
    }

    public static arpi q(ahlp ahlpVar, aneo aneoVar) {
        aneoVar.getClass();
        arpi i = ahlpVar.i(aneoVar);
        i.getClass();
        return i;
    }

    public static arpi r(ahlp ahlpVar, aneo aneoVar) {
        aneoVar.getClass();
        arpi i = ahlpVar.i(aneoVar);
        i.getClass();
        return i;
    }

    public static arpi s(ahlp ahlpVar, aneo aneoVar) {
        aneoVar.getClass();
        arpi i = ahlpVar.i(aneoVar);
        i.getClass();
        return i;
    }

    public static arpi t(ahlp ahlpVar, aneo aneoVar, algw algwVar) {
        aneoVar.getClass();
        Boolean bool = true;
        bool.getClass();
        arpi i = ahlpVar.i(new agth(albo.bB(new akbl(aneoVar, true, ((Boolean) algwVar.d(false)).booleanValue())), aneoVar, 1));
        i.getClass();
        return i;
    }

    public static asqe u(akjz akjzVar, qdq qdqVar, ajwt ajwtVar, Map map, akac akacVar, akyr akyrVar, Executor executor, ahiy ahiyVar, ahlp ahlpVar) {
        akjzVar.getClass();
        qdqVar.getClass();
        ajwtVar.getClass();
        akyrVar.getClass();
        executor.getClass();
        ahiyVar.getClass();
        return qdqVar.D(akic.d, new aggd(akacVar, 12), executor, map, akjv.a, new afya(akjzVar, 11, (float[][]) null), new ahsi(akyrVar, ajwtVar, 14, null), new akkc(ahiyVar, ajwtVar, ahlpVar, 1));
    }

    public static asqe v(qdq qdqVar, anen anenVar, ajwt ajwtVar, akjz akjzVar, akac akacVar, akyr akyrVar, Map map, ahiy ahiyVar, ahlp ahlpVar) {
        qdqVar.getClass();
        anenVar.getClass();
        ajwtVar.getClass();
        akjzVar.getClass();
        akyrVar.getClass();
        ahiyVar.getClass();
        return qdqVar.D(akic.b, new aggd(akacVar, 13), anenVar, map, akkb.a, new afya(akjzVar, 12, (float[][]) null), new ahsi(akyrVar, ajwtVar, 16, null), new akkc(ahiyVar, ajwtVar, ahlpVar, 0));
    }

    @Override // defpackage.armf, defpackage.arme
    public final /* synthetic */ Object b() {
        throw null;
    }
}
