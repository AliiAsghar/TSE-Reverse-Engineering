package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui.AdvancedFeedbackDataView;
import com.google.android.apps.messaging.ui.conversation.AudioButtonView;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zgs implements yjj {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public zgs(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.yjj
    public final void c() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    ((AudioButtonView) this.a).q.k(R.string.microphone_permission_denied_text);
                    return;
                } else {
                    xzb.n("Bugle", "RECEIVE_WAP_PUSH permission denied");
                    ((zjx) this.a).F.b();
                    return;
                }
            }
            ((alwl) ((kto) this.a).h.n().h("com/google/android/apps/messaging/helpandfeedback/advancedfeedback/ui/AdvancedFeedbackFragmentPeer$2", "onDenied", 598, "AdvancedFeedbackFragmentPeer.java")).q("Location permission denied");
            kto ktoVar = (kto) this.a;
            for (AdvancedFeedbackDataView advancedFeedbackDataView : ktoVar.g) {
                Optional f = advancedFeedbackDataView.f();
                if (f.isPresent()) {
                    if (f.get().getClass() == ktoVar.k.getClass()) {
                        advancedFeedbackDataView.g.setChecked(false);
                    }
                }
            }
            return;
        }
        zgu.n.q("RECEIVE_WAP_PUSH permission denied");
        ((xcd) ((zgu) this.a).s.b()).b();
    }

    @Override // defpackage.yjj
    public final void d() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    ((AudioButtonView) this.a).c();
                    return;
                } else {
                    xzb.c("Bugle", "RECEIVE_WAP_PUSH permission granted");
                    return;
                }
            }
            ((alwl) ((kto) this.a).h.n().h("com/google/android/apps/messaging/helpandfeedback/advancedfeedback/ui/AdvancedFeedbackFragmentPeer$2", "onGranted", 592, "AdvancedFeedbackFragmentPeer.java")).q("Location permission granted");
            ((kto) this.a).b();
            return;
        }
        zgu.n.l("RECEIVE_WAP_PUSH permission granted");
    }

    @Override // defpackage.yjj
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // defpackage.yjj
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.yjj
    public final /* synthetic */ void b() {
    }
}
