package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agao extends arsm {
    final /* synthetic */ agap a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agao(Object obj, agap agapVar) {
        super(obj);
        this.a = agapVar;
    }

    @Override // defpackage.arsm
    protected final void a(artm artmVar, Object obj, Object obj2) {
        WeakReference weakReference;
        View view;
        agaq agaqVar = (agaq) obj2;
        if (agaqVar == agaq.d && (weakReference = this.a.d) != null && (view = (View) weakReference.get()) != null) {
            if (view.hasFocus()) {
                view.clearFocus();
            }
            this.a.d = null;
        }
        Iterator it = this.a.f.iterator();
        while (it.hasNext()) {
            ((agar) it.next()).m(agaqVar);
        }
    }

    @Override // defpackage.arsm
    protected final boolean b(Object obj, Object obj2) {
        return d.R(obj, obj2);
    }
}
