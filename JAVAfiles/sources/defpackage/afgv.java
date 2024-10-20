package defpackage;

import android.app.Activity;
import android.app.admin.DevicePolicyManager;
import android.net.Uri;
import android.view.View;
import com.google.android.apps.messaging.R;
import j$.time.Duration;
import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afgv implements afgp {
    public static final Map a = aqjn.m(new armo(afsu.a, afsc.a), new armo(afsv.a, aftd.a));
    public static final alvi b = alvi.m("com/google/android/libraries/compose/cameragallery/ui/camera/SystemCameraLauncher");
    public final arwe c;
    public final arwe d;
    public final afdl e;
    public final aful f;
    public final afvc g;
    public final Duration h;
    public final cj i;
    public final affv j;
    public Map k;
    public Uri l;
    private final arml m;

    public afgv(Activity activity, arwe arweVar, arwe arweVar2, afdl afdlVar, aful afulVar, Optional optional, afvc afvcVar, Duration duration) {
        this.c = arweVar;
        this.d = arweVar2;
        this.e = afdlVar;
        this.f = afulVar;
        this.g = afvcVar;
        this.h = duration;
        this.j = (affv) arsd.k(optional);
        this.m = armd.a(new aetz(activity, 17));
        if (activity instanceof cj) {
            this.i = (cj) activity;
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override // defpackage.afgp
    public final void a(View view, afsw afswVar) {
        if (this.k != null) {
            if (((DevicePolicyManager) this.m.a()).getCameraDisabled(null)) {
                afzv.f(this.i, R.string.camera_disabled_by_device_policy);
                return;
            } else {
                arrn.J(this.d, null, null, new wfj(afswVar, this, view, (arpe) null, 5), 3);
                return;
            }
        }
        throw new IllegalStateException("onCreate() must be called before launch() is invoked");
    }
}
