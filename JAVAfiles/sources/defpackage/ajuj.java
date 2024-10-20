package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import com.google.android.setupcompat.logging.CustomEvent;
import com.google.android.setupcompat.logging.MetricKey;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajuj extends Fragment {
    public static final String a = "ajuj";
    private MetricKey b;
    private long c;
    private long d = 0;

    public ajuj() {
        setRetainInstance(true);
    }

    @Override // android.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.b = MetricKey.b("ScreenDuration", getActivity());
    }

    @Override // android.app.Fragment
    public final void onDetach() {
        boolean z;
        super.onDetach();
        Activity activity = getActivity();
        MetricKey metricKey = this.b;
        long millis = TimeUnit.NANOSECONDS.toMillis(this.d);
        d.aB(activity, "Context cannot be null.");
        d.aB(metricKey, "Timer name cannot be null.");
        if (millis >= 0) {
            z = true;
        } else {
            z = false;
        }
        ajgk.r(z, "Duration cannot be negative.");
        ajul a2 = ajul.a(activity);
        Bundle bundle = new Bundle();
        bundle.putParcelable("MetricKey_bundle", MetricKey.a(metricKey));
        bundle.putLong("timeMillis", millis);
        a2.d(2, bundle);
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        this.d += System.nanoTime() - this.c;
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.c = System.nanoTime();
        if (Build.VERSION.SDK_INT >= 29) {
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putLong("onScreenResume", System.nanoTime());
            ajuq.a(getActivity(), CustomEvent.a(MetricKey.b("ScreenActivity", getActivity()), persistableBundle));
        }
    }
}
