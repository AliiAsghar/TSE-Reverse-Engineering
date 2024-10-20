package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.simpicker.SimPickerView;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jaw {
    public final jas a;
    public final SimPickerView b;
    public Optional c;
    public LinearLayout d;
    public final RecyclerView e;

    public jaw(Optional optional, jas jasVar, SimPickerView simPickerView) {
        this.c = Optional.empty();
        this.a = jasVar;
        this.b = simPickerView;
        RecyclerView recyclerView = (RecyclerView) simPickerView.findViewById(R.id.sim_list);
        this.e = recyclerView;
        simPickerView.getContext();
        recyclerView.aj(new LinearLayoutManager());
        recyclerView.ag(jasVar);
        if (wsm.a()) {
            this.d = (LinearLayout) simPickerView.findViewById(R.id.send_option_layout);
            new xvy(simPickerView, R.id.scheduled_send_entry_point, R.id.scheduled_send_entry_point);
            this.c = optional.map(new ivk(16));
        }
        a(false, null);
    }

    public final void a(boolean z, Runnable runnable) {
        byte[] bArr = null;
        int i = 8;
        if (wsm.a()) {
            this.d.getClass();
            this.b.clearAnimation();
            this.d.clearAnimation();
            long a = yai.a(this.b.getContext());
            if (z && a > 0) {
                this.b.setVisibility(0);
                this.b.setAlpha(1.0f);
                this.b.animate().alpha(brg.a).setDuration(a).withEndAction(new irs(this, runnable, i, bArr));
                TranslateAnimation translateAnimation = new TranslateAnimation(1, brg.a, 1, brg.a, 1, brg.a, 1, 1.0f);
                translateAnimation.setInterpolator(abbu.a);
                translateAnimation.setDuration(a);
                this.d.startAnimation(translateAnimation);
                return;
            }
            this.b.setAlpha(brg.a);
            this.d.setTranslationY(r1.getHeight());
            this.b.setVisibility(8);
            return;
        }
        this.b.clearAnimation();
        this.e.clearAnimation();
        long a2 = yai.a(this.b.getContext());
        if (z && a2 > 0) {
            this.b.setVisibility(0);
            this.b.setAlpha(1.0f);
            this.b.animate().alpha(brg.a).setDuration(a2).withEndAction(new irs(this, runnable, 7, bArr));
            TranslateAnimation translateAnimation2 = new TranslateAnimation(1, brg.a, 1, brg.a, 1, brg.a, 1, 1.0f);
            translateAnimation2.setInterpolator(abbu.a);
            translateAnimation2.setDuration(a2);
            this.e.startAnimation(translateAnimation2);
            return;
        }
        this.b.setAlpha(brg.a);
        this.e.setTranslationY(r1.getHeight());
        this.b.setVisibility(8);
    }
}
