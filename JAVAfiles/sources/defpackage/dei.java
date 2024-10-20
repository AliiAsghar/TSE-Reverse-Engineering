package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.google.android.apps.messaging.R;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dei implements View.OnAttachStateChangeListener {
    final /* synthetic */ czt a;

    public dei(czt cztVar) {
        this.a = cztVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Boolean bool;
        Iterator a = arrn.e(this.a.getParent(), eep.a).a();
        while (a.hasNext()) {
            Object obj = (ViewParent) a.next();
            if (obj instanceof View) {
                View view2 = (View) obj;
                view2.getClass();
                Object tag = view2.getTag(R.id.is_pooling_container_tag);
                if (tag instanceof Boolean) {
                    bool = (Boolean) tag;
                } else {
                    bool = null;
                }
                if (bool != null && bool.booleanValue()) {
                    return;
                }
            }
        }
        this.a.f();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
