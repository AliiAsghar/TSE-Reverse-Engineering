package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yfd {
    public static final xze a = xze.g("Bugle", "BugleSurveyClient");
    public static final alhr b = uuh.x(183538828, "hats_next_survey_client_logging");
    public final armf c;
    public final znj d;

    public yfd(znj znjVar, armf armfVar) {
        this.d = znjVar;
        this.c = armfVar;
    }

    public final void a(Context context) {
        try {
            akto.n(context, new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=".concat(String.valueOf(context.getPackageName())))));
        } catch (ActivityNotFoundException e) {
            xzb.g("BugleHappinessTracking", "Unable to launch play store rating. ".concat(e.toString()));
        }
    }
}
