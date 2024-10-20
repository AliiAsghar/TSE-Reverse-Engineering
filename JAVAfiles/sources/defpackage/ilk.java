package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ilk implements TextWatcher {
    final /* synthetic */ boolean a;
    final /* synthetic */ ilw b;
    private boolean c;

    public ilk(ilw ilwVar, boolean z) {
        this.a = z;
        this.b = ilwVar;
        this.c = z;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.c) {
            this.b.s();
        } else {
            this.c = false;
        }
        if (((trz) this.b.R.b()).i()) {
            if (amfg.CONVERSATION_TYPE_GROUP_RCS.equals(this.b.G.x())) {
                ilw ilwVar = this.b;
                if (ilwVar.G.i) {
                    int length = charSequence.length();
                    Optional optional = ilwVar.y.E().c.au;
                    if (optional.isPresent() && length >= ((Integer) optional.get()).intValue()) {
                        ((abbu) this.b.Q.b()).h(R.string.text_limit_reached_toast_alert);
                    }
                }
            }
        }
        if (yig.b()) {
            ((Optional) ((apxx) this.b.S).a).ifPresent(new ile(7));
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
