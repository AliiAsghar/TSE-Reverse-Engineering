package defpackage;

import android.os.CancellationSignal;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lbt {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/label/data/cache/HomeScreenQueryCache");
    public final xnv b;
    public agmc e;
    public agmc f;
    public final armf j;
    public final lxe k;
    private final armf l;
    public kzh i = lga.F(altc.a, null, null);
    public ldc c = null;
    public lca d = null;
    public final Map g = new HashMap();
    public final Map h = new HashMap();

    public lbt(xnv xnvVar, lxe lxeVar, armf armfVar, armf armfVar2) {
        this.b = xnvVar;
        this.k = lxeVar;
        this.j = armfVar;
        this.l = armfVar2;
    }

    public static void e(String str, uye uyeVar, SuperSortLabel superSortLabel, boolean z) {
        alvw g = a.g();
        g.X(alwp.a, "Bugle");
        ((alvg) ((alvg) g).h("com/google/android/apps/messaging/label/data/cache/HomeScreenQueryCache", "logQuery", 457, "HomeScreenQueryCache.java")).K("%s\nConversationListGroup: %s\nLabel: %s\nfirstLoad: %b", str, uyeVar, superSortLabel, Boolean.valueOf(z));
    }

    public final lca a(lca lcaVar, agmc agmcVar, CancellationSignal cancellationSignal) {
        agmc agmcVar2;
        if (((pgq) this.l.b()).a() && cancellationSignal.isCanceled()) {
            throw new agpd((byte[]) null);
        }
        lca lcaVar2 = this.d;
        if (lcaVar2 != null && (agmcVar2 = this.f) != null) {
            lcaVar2.G(agmcVar2);
        }
        this.d = lcaVar;
        this.f = agmcVar;
        lcaVar.E(agmcVar);
        return this.d;
    }

    public final lci b(uye uyeVar, SuperSortLabel superSortLabel) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        lci lciVar = (lci) this.h.get(superSortLabel);
        if (lciVar == null) {
            int ordinal = uyeVar.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    bool2 = true;
                    bool = null;
                    bool3 = null;
                } else {
                    bool3 = true;
                    bool = null;
                    bool2 = null;
                }
            } else {
                bool = true;
                bool2 = null;
                bool3 = null;
            }
            lci lciVar2 = new lci(bool, bool2, bool3, null, null, null);
            this.h.put(superSortLabel, lciVar2);
            return lciVar2;
        }
        return lciVar;
    }

    public final ldc c(ldc ldcVar, agmc agmcVar) {
        agmc agmcVar2;
        ldc ldcVar2 = this.c;
        if (ldcVar2 != null && (agmcVar2 = this.e) != null) {
            ldcVar2.G(agmcVar2);
        }
        this.c = ldcVar;
        this.e = agmcVar;
        ldcVar.E(agmcVar);
        return this.c;
    }

    public final ldk d(uye uyeVar, SuperSortLabel superSortLabel) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        ldk ldkVar = (ldk) this.g.get(superSortLabel);
        if (ldkVar == null) {
            int ordinal = uyeVar.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    bool2 = true;
                    bool = null;
                    bool3 = null;
                } else {
                    bool3 = true;
                    bool = null;
                    bool2 = null;
                }
            } else {
                bool = true;
                bool2 = null;
                bool3 = null;
            }
            lbv lbvVar = new lbv(bool, bool2, bool3, null, null, null);
            this.g.put(superSortLabel, lbvVar);
            return lbvVar;
        }
        return ldkVar;
    }

    public final List f(lca lcaVar, Map map, SuperSortLabel superSortLabel, CancellationSignal cancellationSignal) {
        Stream w;
        if (((pgj) this.j.b()).a()) {
            w = ((lbz) lcaVar.o(cancellationSignal)).cT();
        } else {
            w = lcaVar.w();
        }
        try {
            List list = (List) w.map(new kzr(this, cancellationSignal, superSortLabel, 2, null)).map(new kzr(this, cancellationSignal, map, 3, null)).collect(Collectors.toCollection(new ijk(17)));
            if (w != null) {
                w.close();
            }
            return list;
        } catch (Throwable th) {
            if (w != null) {
                try {
                    w.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final List g(ldc ldcVar, Map map, SuperSortLabel superSortLabel, CancellationSignal cancellationSignal) {
        Stream w;
        if (((pgj) this.j.b()).a()) {
            w = ((lbz) ldcVar.o(cancellationSignal)).cT();
        } else {
            w = ldcVar.w();
        }
        try {
            List list = (List) w.map(new kzr(this, cancellationSignal, superSortLabel, 4, null)).map(new kzr(this, cancellationSignal, map, 5, null)).collect(Collectors.toCollection(new ijk(17)));
            if (w != null) {
                w.close();
            }
            return list;
        } catch (Throwable th) {
            if (w != null) {
                try {
                    w.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
