package defpackage;

import android.view.ActionMode;
import com.google.android.apps.messaging.R;
import j$.util.Collection;
import j$.util.Optional;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kvf extends gvf {
    final /* synthetic */ kvw a;

    public kvf(kvw kvwVar) {
        this.a = kvwVar;
    }

    @Override // defpackage.gvf
    public final /* bridge */ /* synthetic */ void a(Object obj, boolean z) {
        Optional findFirst;
        String str = (String) obj;
        xyo a = kuy.a.a();
        a.H("onItemStateChanged");
        a.z("key", str);
        a.A("selected", z);
        a.q();
        kvw kvwVar = this.a;
        if (kvwVar.b.fe() != null && kvwVar.aH.k(str) == z) {
            if (z && !kvwVar.A()) {
                kvwVar.n();
            }
            if (kvwVar.A()) {
                aaig l = kvw.l(kvwVar.b.F());
                if (l.e(ruy.b(str)) != z) {
                    gcj m = ((kxm) kvwVar.p.b()).m();
                    if (m == null) {
                        findFirst = Optional.empty();
                    } else {
                        findFirst = Collection.EL.stream(m).filter(new isg(str, 6)).findFirst();
                    }
                    findFirst.ifPresent(new ivo(kvwVar, l, z, 3));
                    if (kvwVar.aG.e().isPresent()) {
                        ((ActionMode) kvwVar.aG.e().get()).setTitle(kvwVar.b.z().getQuantityString(R.plurals.selected_count, l.a(), Integer.valueOf(l.a())));
                    }
                    kvwVar.aG.g();
                }
            }
        }
    }
}
