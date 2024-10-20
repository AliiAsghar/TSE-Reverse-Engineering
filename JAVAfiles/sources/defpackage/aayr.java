package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.rcs.setup.RcsWelcomeMessageView;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aayr implements lqv {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/ui/rcs/setup/RcsWelcomeMessagePopup");
    public final armf b;
    public Optional c = Optional.empty();
    xvy d;
    private final anen e;
    private final anen f;
    private lqx g;

    public aayr(anen anenVar, anen anenVar2, armf armfVar) {
        this.e = anenVar;
        this.f = anenVar2;
        this.b = armfVar;
    }

    @Override // defpackage.lqv
    public final /* synthetic */ int a() {
        return lgb.s();
    }

    @Override // defpackage.lqv
    public final akul b() {
        return ((whs) this.b.b()).c().h(new aald(this, 8), this.e);
    }

    @Override // defpackage.lqv
    public final void c(lqx lqxVar, ViewGroup viewGroup) {
        this.g = lqxVar;
        this.d = new xvy(viewGroup, R.id.conversation_list_rcs_welcome_message_stub, R.id.conversation_list_rcs_welcome_message);
    }

    @Override // defpackage.lqv
    public final void d() {
        this.d.e();
        this.g.b();
        String str = (String) this.c.map(new aand(6)).orElse(null);
        if (str == null) {
            ((alvg) ((alvg) a.d()).h("com/google/android/apps/messaging/ui/rcs/setup/RcsWelcomeMessagePopup", "hide", 119, "RcsWelcomeMessagePopup.java")).q("hide: simId is null");
        } else {
            aktp.ah(new aanh(this, str, 8), this.f).k(qiu.b(), andi.a);
        }
    }

    @Override // defpackage.lqv
    public final boolean f(Context context, ViewGroup viewGroup, boolean z) {
        if (((wia) this.c.orElse(null)) == null) {
            ((alvg) ((alvg) a.d()).h("com/google/android/apps/messaging/ui/rcs/setup/RcsWelcomeMessagePopup", "show", 96, "RcsWelcomeMessagePopup.java")).q("show: welcome message is missing");
            return false;
        }
        ((RcsWelcomeMessageView) this.d.b()).E().b = this;
        wia wiaVar = (wia) this.c.orElse(null);
        if (wiaVar != null) {
            aays E = ((RcsWelcomeMessageView) this.d.b()).E();
            E.c.setText(wiaVar.b);
            E.d.setText(wiaVar.c);
            TextView textView = (TextView) E.e.findViewById(R.id.rcs_welcome_message_settings_button);
            if (wiaVar.d) {
                textView.setOnClickListener(new zoz(E, wiaVar, 19));
            } else {
                textView.setVisibility(8);
            }
            ((TextView) E.e.findViewById(R.id.rcs_welcome_message_got_it_button)).setOnClickListener(new zoz(E, wiaVar, 20));
            ((wyp) E.g.b()).p(wiaVar.a, amlw.RCS_PROVISIONING_WELCOME_MESSAGE_SEEN);
        }
        this.d.g(0);
        return true;
    }

    @Override // defpackage.lqv
    public final int h() {
        return 5;
    }

    @Override // defpackage.lqv
    public final void i() {
        if (this.d.a() != 8) {
            d();
        }
    }

    @Override // defpackage.lqv
    public final /* synthetic */ void g(Activity activity, int i) {
    }
}
