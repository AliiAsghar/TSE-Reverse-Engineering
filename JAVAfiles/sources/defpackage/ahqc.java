package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ahqc implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ ahqd a;
    private final AtomicReference b;

    public ahqc(ahqd ahqdVar, View view) {
        this.a = ahqdVar;
        this.b = new AtomicReference(view);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = (View) this.b.getAndSet(null);
        if (view != null) {
            try {
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                aiut.a().postAtFrontOfQueue(new ahoa(this.a, 19));
                aiut.e(new ahoa(this.a, 20));
                return true;
            } catch (RuntimeException e) {
                Log.d("PrimesStartupMeasure", "Error handling StartupMeasure's onPreDraw", e);
                return true;
            }
        }
        return true;
    }
}
