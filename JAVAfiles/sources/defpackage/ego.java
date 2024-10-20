package defpackage;

import android.view.View;
import android.widget.EdgeEffect;
import com.google.android.apps.messaging.R;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ego {
    public static void a(EdgeEffect edgeEffect, float f, float f2) {
        edgeEffect.onPull(f, f2);
    }

    public static final void b(View view) {
        Iterator a = new een(new eeo(view, null), 4).a();
        while (a.hasNext()) {
            c((View) a.next()).C();
        }
    }

    public static final efu c(View view) {
        efu efuVar = (efu) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (efuVar == null) {
            efu efuVar2 = new efu(null, null, null, null);
            view.setTag(R.id.pooling_container_listener_holder_tag, efuVar2);
            return efuVar2;
        }
        return efuVar;
    }
}
