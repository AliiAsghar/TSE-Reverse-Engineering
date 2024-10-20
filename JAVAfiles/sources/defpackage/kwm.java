package defpackage;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.apps.messaging.R;
import com.google.android.material.snackbar.Snackbar;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kwm implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ View a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public kwm(View view, View view2, kor korVar, View view3, int i) {
        this.e = i;
        this.a = view;
        this.b = view2;
        this.c = korVar;
        this.d = view3;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [armf, java.lang.Object] */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                View view = this.a;
                Object obj = this.b;
                Snackbar p = Snackbar.p(view, R.string.syncing_conversations, -2);
                p.m((View) obj);
                p.i();
                ((kyf) ((kor) this.c).b.b()).k = p;
                ((View) this.d).getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            }
            Object obj2 = this.d;
            jbp jbpVar = (jbp) obj2;
            if (jbpVar.a && jbpVar.b) {
                ((RecyclerView) this.a).post(new itl(obj2, this.c, this.b, 2, (byte[]) null));
                ((RecyclerView) this.a).getViewTreeObserver().removeOnPreDrawListener(this);
            }
            return true;
        }
        View view2 = this.a;
        Object obj3 = this.b;
        Snackbar p2 = Snackbar.p(view2, R.string.hangouts_syncing_conversations, -2);
        p2.m((View) obj3);
        p2.i();
        ((kyf) ((kor) this.c).b.b()).k = p2;
        ((View) this.d).getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }

    public kwm(jbp jbpVar, RecyclerView recyclerView, ajwt ajwtVar, Activity activity, int i) {
        this.e = i;
        this.d = jbpVar;
        this.a = recyclerView;
        this.c = ajwtVar;
        this.b = activity;
    }
}
