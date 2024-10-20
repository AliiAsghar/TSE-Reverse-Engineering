package defpackage;

import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kxx extends dyg {
    public static final xze a = xze.g("Bugle", "ConversationListDataSources");
    public static final alvi b = alvi.m("com/google/android/apps/messaging/home/list/ConversationListDataSources");
    public final xnv c;
    public final mgv d;
    public final laj e;
    public final aksr f;
    public final anen g;
    public final armf h;
    public final armf i;
    public final armf j;
    public final uye k;
    public final lbt m;
    public final armf n;
    public final armf o;
    public final armf p;
    public final armf q;
    public gap r;
    public final int v;
    public akul w;
    public akul x;
    private final anen z;
    public boolean s = true;
    public boolean t = true;
    public kxw u = kxw.NOT_STARTED;
    public Map y = new HashMap();
    public final AtomicReference l = new AtomicReference(SuperSortLabel.UNKNOWN);

    public kxx(xnv xnvVar, mgv mgvVar, laj lajVar, aksr aksrVar, anen anenVar, anen anenVar2, lbt lbtVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, uye uyeVar, int i) {
        this.c = xnvVar;
        this.d = mgvVar;
        this.e = lajVar;
        this.f = aksrVar;
        this.g = anenVar2;
        this.h = armfVar;
        this.j = armfVar3;
        this.k = uyeVar;
        this.z = anenVar;
        this.o = armfVar5;
        this.v = i;
        this.m = lbtVar;
        this.n = armfVar4;
        this.i = armfVar2;
        this.p = armfVar6;
        this.q = armfVar7;
    }

    public static long j(kxk kxkVar) {
        return lgc.f(kxkVar.d, kxkVar.b);
    }

    public static String p(aglo agloVar) {
        StringBuilder sb = new StringBuilder("TRIGGER: ");
        if (agloVar.r() != null) {
            sb.append("UPDATE ");
            agpr r = agloVar.r();
            r.getClass();
            sb.append(r.getClass());
            sb.append(" COLUMNS MODIFIED ");
            agpr r2 = agloVar.r();
            r2.getClass();
            sb.append(Arrays.toString(r2.n()));
        }
        if (agloVar.p() != null) {
            sb.append("INSERT ");
            aglz p = agloVar.p();
            p.getClass();
            sb.append(p.getClass());
        }
        if (agloVar.q() != null) {
            sb.append("INSERT-FROM-SQL ");
            agoz q = agloVar.q();
            q.getClass();
            sb.append(q.toString());
        }
        if (agloVar.t() != null) {
            sb.append("BULK-INSERT ");
            aglz[] t = agloVar.t();
            t.getClass();
            for (aglz aglzVar : t) {
                sb.append(aglzVar.toString());
                sb.append(";\n");
            }
        }
        if (agloVar.s() != null) {
            sb.append("DELETE ");
            agpw s = agloVar.s();
            s.getClass();
            sb.append(s.toString());
        }
        return sb.toString();
    }

    public final void k() {
        gap gapVar = this.r;
        if (gapVar != null) {
            gapVar.b();
        }
    }

    public final void l(List list) {
        this.z.submit(new irs(this, list, 13, null));
    }

    public final void m() {
        hlc.v(this.c);
    }

    public final boolean n() {
        alvw g = b.g();
        g.X(alwp.a, "ConversationListDataSources");
        ((alvg) ((alvg) g).h("com/google/android/apps/messaging/home/list/ConversationListDataSources", "hasFinishedFirstLoad", 189, "ConversationListDataSources.java")).B("ConversationListDataSource: hasFinishedFirstLoad loadingStatus=%s hashCode=%s", this.u, hashCode());
        kxw kxwVar = this.u;
        if (kxwVar != kxw.REFRESHING && kxwVar != kxw.FINISHED) {
            return false;
        }
        return true;
    }
}
