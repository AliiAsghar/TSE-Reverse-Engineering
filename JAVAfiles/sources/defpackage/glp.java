package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class glp implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    final glm a;
    final ViewGroup b;

    public glp(glm glmVar, ViewGroup viewGroup) {
        this.a = glmVar;
        this.b = viewGroup;
    }

    private final void a() {
        this.b.getViewTreeObserver().removeOnPreDrawListener(this);
        this.b.removeOnAttachStateChangeListener(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01eb A[EDGE_INSN: B:120:0x01eb->B:121:0x01eb BREAK  A[LOOP:1: B:17:0x008f->B:27:0x01e2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02c9 A[EDGE_INSN: B:196:0x02c9->B:197:0x02c9 BREAK  A[LOOP:8: B:143:0x023e->B:177:0x023e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02ff  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onPreDraw() {
        /*
            Method dump skipped, instructions count: 828
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.glp.onPreDraw():boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
        glq.a.remove(this.b);
        ArrayList arrayList = (ArrayList) glq.a().get(this.b);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((glm) arrayList.get(i)).u(this.b);
            }
        }
        this.a.p(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
