package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import com.google.android.setupcompat.logging.CustomEvent;
import com.google.android.setupcompat.logging.MetricKey;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajuq {
    static {
        new agxw("SetupMetricsLogger");
    }

    public static void a(Context context, CustomEvent customEvent) {
        d.aB(context, "Context cannot be null.");
        ajul a = ajul.a(context);
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        bundle2.putInt("CustomEvent_version", 1);
        bundle2.putLong("CustomEvent_timestamp", customEvent.a);
        bundle2.putBundle("CustomEvent_metricKey", MetricKey.a(customEvent.b));
        bundle2.putBundle("CustomEvent_bundleValues", ajuk.a(new PersistableBundle(customEvent.c)));
        bundle2.putBundle("CustomEvent_pii_bundleValues", ajuk.a(customEvent.d));
        bundle.putParcelable("CustomEvent_bundle", bundle2);
        a.d(1, bundle);
    }
}
