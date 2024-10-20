package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.rcs.setup.RcsWelcomeMessageView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aays {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/ui/rcs/setup/RcsWelcomeMessageViewPeer");
    public aayr b;
    public final TextView c;
    public final TextView d;
    public final RcsWelcomeMessageView e;
    public final armf f;
    public final armf g;

    public aays(RcsWelcomeMessageView rcsWelcomeMessageView, armf armfVar, armf armfVar2) {
        this.e = rcsWelcomeMessageView;
        this.f = armfVar;
        this.g = armfVar2;
        LayoutInflater.from(rcsWelcomeMessageView.getContext()).inflate(R.layout.rcs_welcome_message_view_m2, (ViewGroup) rcsWelcomeMessageView, true);
        this.c = (TextView) rcsWelcomeMessageView.findViewById(R.id.rcs_welcome_message_title);
        TextView textView = (TextView) rcsWelcomeMessageView.findViewById(R.id.rcs_welcome_message_message);
        this.d = textView;
        ahnz.s(textView);
        ahnz.t(textView);
    }
}
