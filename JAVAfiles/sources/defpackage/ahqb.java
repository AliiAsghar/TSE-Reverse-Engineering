package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahqb implements ViewTreeObserver.OnDrawListener {
    public static final /* synthetic */ int b = 0;
    final /* synthetic */ ahqd a;
    private final AtomicReference c;

    public ahqb(ahqd ahqdVar, View view) {
        this.a = ahqdVar;
        this.c = new AtomicReference(view);
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        View view = (View) this.c.getAndSet(null);
        if (view != null) {
            try {
                aiut.a().postAtFrontOfQueue(new ahoa(this.a, 17));
                aiut.e(new ahoa(this.a, 18));
                aiut.e(new ahnu(this, view, 5));
            } catch (RuntimeException e) {
                Log.d("PrimesStartupMeasure", "Error handling StartupMeasure's onDraw", e);
            }
        }
    }
}
