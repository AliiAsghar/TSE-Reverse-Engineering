package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import defpackage.dbu;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dfd {
    public static final Map a = new LinkedHashMap();

    public static final bwr a(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof bwr) {
            return (bwr) tag;
        }
        return null;
    }

    public static final void b(View view, bwr bwrVar) {
        view.setTag(R.id.androidx_compose_ui_view_composition_context, bwrVar);
    }

    public static /* synthetic */ bzj c(View view, arpi arpiVar, int i) {
        arpi arpiVar2;
        byv byvVar;
        arpi arpiVar3;
        if ((i & 1) != 0) {
            arpiVar = arpj.a;
        }
        if (arpiVar.get(arpf.k) == null || arpiVar.get(byd.e) == null) {
            arml armlVar = dbu.a;
            if (dbv.a()) {
                arpiVar2 = dbu.a.a();
            } else {
                arpiVar2 = (arpi) dbu.b.get();
                if (arpiVar2 == null) {
                    throw new IllegalStateException("no AndroidUiDispatcher for this thread");
                }
            }
            arpiVar = arpiVar2.plus(arpiVar);
        }
        byd bydVar = (byd) arpiVar.get(byd.e);
        enh enhVar = null;
        if (bydVar != null) {
            byv byvVar2 = new byv(bydVar);
            bxy bxyVar = byvVar2.a;
            synchronized (bxyVar.a) {
                bxyVar.d = false;
            }
            byvVar = byvVar2;
        } else {
            byvVar = null;
        }
        arsb arsbVar = new arsb();
        arpi arpiVar4 = (cge) arpiVar.get(cge.a);
        if (arpiVar4 == null) {
            arpiVar4 = new ddg();
            arsbVar.a = arpiVar4;
        }
        if (byvVar != null) {
            arpiVar3 = byvVar;
        } else {
            arpiVar3 = arpj.a;
        }
        arpi plus = arpiVar.plus(arpiVar3).plus(arpiVar4);
        bzj bzjVar = new bzj(plus);
        bzjVar.v();
        arwe e = arwi.e(plus);
        enm c = dyx.c(view);
        if (c != null) {
            enhVar = c.N();
        }
        if (enhVar != null) {
            view.addOnAttachStateChangeListener(new dez(view, bzjVar));
            enhVar.c(new dfa(e, byvVar, bzjVar, arsbVar, view));
            return bzjVar;
        }
        Objects.toString(view);
        csg.a("ViewTreeLifecycleOwner not found from ".concat(String.valueOf(view)));
        throw new armj();
    }
}
