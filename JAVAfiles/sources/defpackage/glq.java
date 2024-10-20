package defpackage;

import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class glq {
    private static final glm b = new glu(null);
    private static final ThreadLocal c = new ThreadLocal();
    static final ArrayList a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static tm a() {
        tm tmVar;
        ThreadLocal threadLocal = c;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (tmVar = (tm) weakReference.get()) != null) {
            return tmVar;
        }
        tm tmVar2 = new tm();
        threadLocal.set(new WeakReference(tmVar2));
        return tmVar2;
    }

    public static void b(ViewGroup viewGroup, glm glmVar) {
        ArrayList arrayList = a;
        if (!arrayList.contains(viewGroup) && viewGroup.isLaidOut()) {
            arrayList.add(viewGroup);
            if (glmVar == null) {
                glmVar = b;
            }
            glm clone = glmVar.clone();
            d(viewGroup, clone);
            gvf.ba(viewGroup);
            c(viewGroup, clone);
        }
    }

    public static void c(ViewGroup viewGroup, glm glmVar) {
        if (glmVar != null && viewGroup != null) {
            glp glpVar = new glp(glmVar, viewGroup);
            viewGroup.addOnAttachStateChangeListener(glpVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(glpVar);
        }
    }

    public static void d(ViewGroup viewGroup, glm glmVar) {
        ArrayList arrayList = (ArrayList) a().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((glm) arrayList.get(i)).s(viewGroup);
            }
        }
        if (glmVar != null) {
            glmVar.o(viewGroup, true);
        }
        if (((gvf) viewGroup.getTag(R.id.transition_current_scene)) != null) {
            throw null;
        }
    }
}
