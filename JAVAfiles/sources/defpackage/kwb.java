package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.snackbar.Snackbar;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public class kwb implements akgh<qid> {
    final /* synthetic */ kvw a;

    public kwb(kvw kvwVar) {
        this.a = kvwVar;
    }

    @Override // defpackage.akgh
    public final void a(Throwable th) {
        xyo b = kuy.a.b();
        b.H("SubscriptionMixin for getCmsSettingsDataSource failed");
        b.r(th);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, oao] */
    /* JADX WARN: Type inference failed for: r0v12, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, oao] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, oao] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, oao] */
    /* JADX WARN: Type inference failed for: r9v10, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v14, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v17, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v22, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [armf, java.lang.Object] */
    @Override // defpackage.akgh
    public final /* synthetic */ void c(Object obj) {
        Snackbar snackbar;
        qid qidVar = (qid) obj;
        kor korVar = (kor) this.a.aV.b();
        kvw kvwVar = this.a;
        kwl kwlVar = kvwVar.T;
        kux kuxVar = kvwVar.b;
        View view = kuxVar.Q;
        ViewGroup g = kvwVar.g(kuxVar);
        View a = kwlVar.a();
        qidVar.getClass();
        g.getClass();
        ?? r0 = korVar.a;
        boolean f = qop.f(qidVar);
        if (!r0.a() && qidVar.d && !((kyf) korVar.b.b()).o.booleanValue() && qidVar.i && f) {
            ((kyf) korVar.b.b()).o = true;
            if (view != null) {
                view.getViewTreeObserver().addOnPreDrawListener(new kwm(g, a, korVar, view, 0));
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        if (korVar.a.a() && qidVar.d && !((kyf) korVar.b.b()).n.booleanValue() && f) {
            ((kyf) korVar.b.b()).n = true;
            if (view != null) {
                view.getViewTreeObserver().addOnPreDrawListener(new kwm(g, a, korVar, view, 2));
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        if (!korVar.a.a() && ((kyf) korVar.b.b()).o.booleanValue() && (!f || !qidVar.d)) {
            Snackbar snackbar2 = ((kyf) korVar.b.b()).k;
            if (snackbar2 != null) {
                snackbar2.e();
                ((kyf) korVar.b.b()).o = false;
                return;
            }
            return;
        }
        if (korVar.a.a() && ((kyf) korVar.b.b()).n.booleanValue()) {
            if ((!f || !qidVar.d) && (snackbar = ((kyf) korVar.b.b()).k) != null) {
                snackbar.e();
                ((kyf) korVar.b.b()).n = false;
            }
        }
    }

    @Override // defpackage.akgh
    public final /* synthetic */ void b() {
    }
}
