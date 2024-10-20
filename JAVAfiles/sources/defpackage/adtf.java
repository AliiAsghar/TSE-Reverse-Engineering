package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.ims.util.common.RcsIntents;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adtf extends adtd<Void> {
    private final AtomicReference a = new AtomicReference();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.adtd
    public final /* bridge */ /* synthetic */ void c(Context context, Intent intent) {
        if (intent == null) {
            advr.q("Empty message received", new Object[0]);
            return;
        }
        if (!adtw.e(context, intent)) {
            advr.q("Caller not trusted, dropping recurring-metrics-upload message: %s", intent);
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            advr.q("Empty action received", new Object[0]);
            return;
        }
        if (action.equals(RcsIntents.ACTION_RCS_RECURRING_METRICS_UPLOAD)) {
            advr.c("Recurring Metrics Upload message received: %s", action);
            adte adteVar = (adte) this.a.get();
            if (adteVar != null) {
                try {
                    adteVar.a();
                } catch (Exception e) {
                    advr.s(e, "Unhandled Exception Uploading Metrics.", new Object[0]);
                }
            }
        }
    }
}
