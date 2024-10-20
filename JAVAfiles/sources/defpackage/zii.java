package defpackage;

import android.os.Bundle;
import androidx.preference.Preference;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zii extends zio {
    public Optional aj;
    public mho ak;
    public Optional al;

    @Override // defpackage.gfl
    public final void aN(Bundle bundle) {
        this.aj.ifPresent(new zih(1));
        this.b.f("bugle");
        fR(R.xml.federated_learning_preferences);
        d().ag();
        if (this.aj.isPresent()) {
            Preference l = d().l(S(R.string.p2p_conversation_suggestions_training_enabled_pref_key));
            if (l == null) {
                xyl.c("Federated learning preference was null.");
            } else {
                l.Z();
                l.n = new lqp(this, 8);
            }
        }
    }

    @Override // defpackage.lzh
    protected final boolean ba() {
        return false;
    }
}
