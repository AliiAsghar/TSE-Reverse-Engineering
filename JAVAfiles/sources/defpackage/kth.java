package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui.AdvancedFeedbackActivity;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kth extends kti {
    public final AdvancedFeedbackActivity a;
    public File b;
    public rg c;
    public int d = 1;

    public kth(AdvancedFeedbackActivity advancedFeedbackActivity) {
        this.a = advancedFeedbackActivity;
    }

    public final void a() {
        ktl a = ktl.a();
        bd bdVar = new bd(this.a.a());
        bdVar.A(R.anim.enter, R.anim.exit);
        bdVar.z(R.id.advanced_feedback_fragment_container, a);
        bdVar.b();
        this.d = 1;
        a.E().d();
    }
}
