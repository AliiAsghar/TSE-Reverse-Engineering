package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agds implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ int a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public agds(Object obj, int i, int i2) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (this.c != 0) {
            if (((lex) this.b).b.findViewById(R.id.contact_picker_fragment_container) != null) {
                ((lex) this.b).b.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                ((lex) this.b).w(this.a);
                return;
            }
            return;
        }
        if (((View) this.b).getWidth() > 0 && ((View) this.b).getHeight() > 0) {
            ((View) this.b).getViewTreeObserver().removeOnGlobalLayoutListener(this);
            View view = (View) this.b;
            view.getWidth();
            view.setTranslationY(-((View) this.b).getHeight());
            view.setElevation(arrn.s(this.a >> 3, r1));
        }
    }
}
