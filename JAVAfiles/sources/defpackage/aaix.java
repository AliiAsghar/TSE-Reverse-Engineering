package defpackage;

import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaix {
    public final aaiv a;
    public final armf b;
    public final armf c;
    public final armf f;
    public aaiz g;
    private final armf h;
    public final AtomicReference e = new AtomicReference(Optional.empty());
    public final xvv d = new xvv("enable_google_tos_banner", new isd(9));

    static {
        alog.t(Integer.valueOf(R.string.fast_track_positive_button_text_experiment), Integer.valueOf(R.string.rcs_setup_accept), Integer.valueOf(R.string.google_tos_positive_button_continue));
        alog.t(Integer.valueOf(R.string.conversation_list_guest_cloud_onboarding_negative_link_text_v2), Integer.valueOf(R.string.google_tos_negative_link_text), Integer.valueOf(R.string.new_fast_track_negative_button_text));
    }

    public aaix(aaiv aaivVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        this.a = aaivVar;
        this.h = armfVar;
        this.b = armfVar3;
        this.c = armfVar4;
        this.f = armfVar2;
        aaivVar.r();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(aaiz aaizVar) {
        this.g = aaizVar;
        if (aczv.C() && ((Optional) this.e.get()).isPresent()) {
            aaizVar.l((Optional) this.e.get());
        }
        if (((Boolean) this.h.b()).booleanValue()) {
            byte[] bArr = null;
            this.a.L().findViewById(R.id.conversation_list_google_tos_popup_positive_button).setOnClickListener(new zoz(this, aaizVar, 6, bArr));
            this.a.L().findViewById(R.id.conversation_list_google_tos_popup_negative_button).setOnClickListener(new zoz(this, aaizVar, 7, bArr));
        }
    }
}
