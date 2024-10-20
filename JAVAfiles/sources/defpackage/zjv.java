package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import androidx.preference.Preference;
import com.google.android.apps.messaging.privacy.etouffeetoggle.EtouffeeToggleActivity;
import com.google.android.apps.messaging.privacy.settings.PrivacySettingsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class zjv implements gfb {
    public final /* synthetic */ zjx a;
    public final /* synthetic */ Context b;
    private final /* synthetic */ int c;

    public zjv(zjx zjxVar, Context context, int i) {
        this.c = i;
        this.b = context;
        this.a = zjxVar;
    }

    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object, trz] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, trz] */
    @Override // defpackage.gfb
    public final boolean a(Preference preference) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                try {
                    Context context = this.b;
                    akto.n(context, this.a.N.t(context));
                } catch (ActivityNotFoundException e) {
                    xzb.i("Bugle", e, "Failed to launch wireless alerts activity");
                }
                return true;
            }
            if (((lxe) this.a.S.get()).a.o()) {
                Context context2 = this.b;
                akto.n(context2, new Intent(context2, (Class<?>) PrivacySettingsActivity.class));
                return true;
            }
            throw new UnsupportedOperationException("Configuration disabled for etouffee");
        }
        if (((lxe) this.a.S.get()).a.w()) {
            Context context3 = this.b;
            akto.n(context3, new Intent(context3, (Class<?>) EtouffeeToggleActivity.class));
            return true;
        }
        throw new UnsupportedOperationException("Configuration disabled for etouffee toggle");
    }

    public /* synthetic */ zjv(zjx zjxVar, cj cjVar, int i) {
        this.c = i;
        this.a = zjxVar;
        this.b = cjVar;
    }
}
