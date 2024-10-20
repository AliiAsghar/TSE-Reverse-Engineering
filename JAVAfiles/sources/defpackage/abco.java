package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abco {
    private static final xze d = xze.g("Bugle", "ChangeDefaultSmsAppHelper");
    public final Context a;
    public final yjv b;
    public final yjy c;
    private final abbu e;

    public abco(Context context, yjv yjvVar, yjy yjyVar, abbu abbuVar) {
        this.a = context;
        this.b = yjvVar;
        this.c = yjyVar;
        this.e = abbuVar;
    }

    public final void a() {
        yjv yjvVar = this.b;
        Context context = this.a;
        boolean e = yjvVar.e();
        boolean h = yhx.h(context);
        boolean d2 = yjvVar.d();
        if (!e) {
            this.e.h(R.string.sms_disabled);
        } else if (!h) {
            this.e.h(R.string.sms_disallowed_message);
        } else if (!d2) {
            this.e.h(R.string.requires_default_sms_app);
        }
        xyo e2 = d.e();
        e2.H("Unsatisfied action condition.");
        e2.A("isSmsCapable", e);
        e2.A("isSmsAllowedForUser", h);
        e2.A("isDefaultSmsApp", d2);
        e2.q();
    }
}
