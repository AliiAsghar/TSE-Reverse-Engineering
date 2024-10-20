package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import com.android.vcard.VCardConfig;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lmc implements lju {
    private final Activity a;
    private final alwo b = alwo.o("BugleConversation");

    public lmc(Activity activity) {
        this.a = activity;
    }

    @Override // defpackage.lju
    public final /* bridge */ /* synthetic */ Object a(lkf lkfVar, arpe arpeVar) {
        return b();
    }

    public final Object b() {
        Iterator it = aqjn.B("android.settings.WIRELESS_SETTINGS", "android.settings.WIFI_SETTINGS", "android.settings.SETTINGS").iterator();
        while (it.hasNext()) {
            Intent intent = new Intent((String) it.next());
            intent.setFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
            try {
                this.a.startActivity(intent);
                return arnb.a;
            } catch (ActivityNotFoundException unused) {
            }
        }
        ((alwl) this.b.i()).q("Failed to find settings activity to start for connectivity.");
        return arnb.a;
    }
}
