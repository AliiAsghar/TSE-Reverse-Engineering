package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajyv extends eor {
    public int a;
    public ajzb b;
    public int c;
    public boolean d;
    public final boolean e;

    public ajyv(eog eogVar) {
        eogVar.getClass();
        this.a = -1;
        ajzb ajzbVar = ajzb.a;
        ajzbVar.getClass();
        this.b = ajzbVar;
        Bundle bundle = (Bundle) eogVar.a("tiktok_activity_account_state_saved_instance_state");
        if (bundle != null) {
            this.e = true;
            this.a = bundle.getInt("state_account_id", -1);
            try {
                this.b = (ajzb) aowt.d(bundle, "state_account_info", ajzb.a, aozs.a());
                this.c = bundle.getInt("state_account_state", 0);
                this.d = bundle.getBoolean("tiktok_accounts_disabled");
            } catch (apba e) {
                throw new RuntimeException("Failed to get AccountInfo from Bundle.", e);
            }
        } else {
            this.e = false;
        }
        eogVar.d("tiktok_activity_account_state_saved_instance_state", new cp(this, 8));
    }
}
