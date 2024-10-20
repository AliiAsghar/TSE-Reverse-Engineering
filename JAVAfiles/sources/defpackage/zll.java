package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.appsettings.SimMessagesActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zll extends zlm {
    public final SimMessagesActivity a;
    public final armf b;
    public final armf c;
    public rg d;

    public zll(SimMessagesActivity simMessagesActivity, armf armfVar, armf armfVar2) {
        this.a = simMessagesActivity;
        this.b = armfVar;
        this.c = armfVar2;
    }

    public static void a(zgu zguVar) {
        zguVar.S();
        en j = zguVar.j();
        if (j != null) {
            j.setDisplayOptions(12);
            yzc.p(zguVar, j, R.string.sim_storage_pref_title);
            j.setHomeActionContentDescription(zguVar.getResources().getString(R.string.navigate_up_button_content_description));
        }
    }
}
