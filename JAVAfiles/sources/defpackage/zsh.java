package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.support.constraint.ConstraintLayout;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.audio.attachment.ui.PausableChronometer;
import com.google.android.apps.messaging.ui.attachment.AttachmentsContainer;
import com.google.android.apps.messaging.ui.conversation.AudioButtonView;
import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import com.google.android.apps.messaging.ui.conversation.compose.PlainTextEditText;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zsh {
    private final ahjj A;
    private final ahjj B;
    public final ComposeMessageView a;
    public final AudioButtonView b;
    public final xvy c;
    public final xvy d;
    public final xvy e;
    public final int[] f;
    public final float g;
    public final armf h;
    public final armf i;
    public boolean j;
    public final wfh k;
    private Integer l;
    private final Context m;
    private final Vibrator n;
    private ImageView o;
    private final View p;
    private final View q;
    private final PlainTextEditText r;
    private final zsg s;
    private final Transition t;
    private final Transition u;
    private final AttachmentsContainer v;
    private ImageView w;
    private af x;
    private af y;
    private final int z;

    public zsh(zsg zsgVar, Context context, Vibrator vibrator, wfh wfhVar, armf armfVar, armf armfVar2, armf armfVar3, ComposeMessageView composeMessageView, rrb rrbVar) {
        int i;
        int i2;
        this.o = null;
        ahjj ahjjVar = new ahjj(this, (byte[]) null);
        this.B = ahjjVar;
        ahjj ahjjVar2 = new ahjj(this, (byte[]) null);
        this.A = ahjjVar2;
        this.m = context;
        this.i = armfVar2;
        this.n = vibrator;
        this.k = wfhVar;
        this.h = armfVar;
        this.s = zsgVar;
        zsgVar.b = composeMessageView;
        this.a = composeMessageView;
        this.d = new xvy(composeMessageView, R.id.audio_timer_dot_view_stub, R.id.audio_timer_dot);
        this.c = new xvy(composeMessageView, R.id.audio_timer_view_stub, R.id.audio_timer_text);
        this.r = (PlainTextEditText) composeMessageView.findViewById(R.id.compose_message_text);
        this.p = composeMessageView.findViewById(R.id.send_message_button_container);
        this.q = composeMessageView.findViewById(R.id.send_message_button_icon);
        this.v = (AttachmentsContainer) composeMessageView.findViewById(R.id.attachments_container);
        AudioButtonView audioButtonView = (AudioButtonView) composeMessageView.findViewById(R.id.audio_button_view);
        this.b = audioButtonView;
        audioButtonView.b = rrbVar;
        audioButtonView.x = ahjjVar2;
        audioButtonView.y = ahjjVar;
        if (((Boolean) ((utz) ipe.q.get()).e()).booleanValue()) {
            this.o = (ImageView) new xvy(composeMessageView, R.id.audio_button_compose_view_stub, R.id.audio_button_compose_view).b();
        }
        this.e = new xvy(composeMessageView, R.id.record_cancel_button_view_v1_stub, R.id.record_cancel_button_v1);
        this.f = new int[2];
        TransitionInflater from = TransitionInflater.from(composeMessageView.getContext());
        if (true != g(armfVar3)) {
            i = R.transition.message_box_slide_left_transition;
        } else {
            i = R.transition.message_box_slide_left_transition_magic_compose;
        }
        this.t = from.inflateTransition(i);
        TransitionInflater from2 = TransitionInflater.from(composeMessageView.getContext());
        if (true != g(armfVar3)) {
            i2 = R.transition.message_box_slide_right_transition;
        } else {
            i2 = R.transition.message_box_slide_right_transition_magic_compose;
        }
        this.u = from2.inflateTransition(i2);
        this.z = context.getColor(R.color.voice_messages_slide_to_cancel_triangle_icon_color);
        this.g = composeMessageView.getResources().getFraction(R.fraction.swipe_to_cancel_gesture_trigger_ratio, 1, 1);
    }

    private final void f(boolean z) {
        int i;
        int i2;
        int i3;
        int i4 = 1;
        if (true != this.b.f()) {
            i = 0;
        } else {
            i = 4;
        }
        this.p.setVisibility(i);
        zqo c = this.a.E().c();
        int dimension = (int) this.a.getResources().getDimension(R.dimen.compose_message_text_box_padding_top_bottom);
        if (z) {
            this.p.setTranslationX(brg.a);
            this.q.setTranslationX(brg.a);
            this.r.setPaddingRelative(0, dimension, 0, dimension);
            if (c != null) {
                c.d.setTranslationX(brg.a);
                return;
            }
            return;
        }
        if (c != null) {
            float dimension2 = this.a.getResources().getDimension(R.dimen.multi_sim_translation_x_when_audio_button_and_emoji_buttonup_leveled);
            View view = this.p;
            if (true != this.k.A()) {
                i2 = 1;
            } else {
                i2 = -1;
            }
            view.setTranslationX(dimension2 * i2);
            float dimension3 = this.a.getResources().getDimension(R.dimen.emoji_button_translation_x_when_audio_button_up_leveled);
            if (true != this.k.A()) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            c.d.setTranslationX(dimension3 * i3);
            View view2 = this.q;
            float dimension4 = this.a.getResources().getDimension(R.dimen.sim_icon_translation_x_when_audio_button_and_emoji_button_up_leveled);
            if (true == this.k.A()) {
                i4 = -1;
            }
            view2.setTranslationX(dimension4 * i4);
            this.r.setPaddingRelative(0, dimension, (int) this.a.getResources().getDimension(R.dimen.edit_text_end_padding_when_audio_button_and_emoji_buttonup_leveled), dimension);
            return;
        }
        View view3 = this.p;
        float dimension5 = this.a.getResources().getDimension(R.dimen.multi_sim_translation_x_when_audio_button_up_leveled);
        if (true == this.k.A()) {
            i4 = -1;
        }
        view3.setTranslationX(dimension5 * i4);
        this.q.setTranslationX(brg.a);
        this.r.setPaddingRelative(0, dimension, 0, dimension);
    }

    private static boolean g(armf armfVar) {
        if (yig.b() && ((zxy) armfVar.b()).q()) {
            return true;
        }
        return false;
    }

    public final void a() {
        ((PausableChronometer) this.c.b()).stop();
        xvy xvyVar = this.d;
        View b = this.c.b();
        View b2 = xvyVar.b();
        zsg zsgVar = this.s;
        if (zsgVar.a == null) {
            aabr aabrVar = zsgVar.c;
            ObjectAnimator aD = aabr.aD(b, true, zsgVar.b.getResources().getInteger(R.integer.audio_button_fade_in_animation_duration_millis));
            aabr aabrVar2 = zsgVar.c;
            ObjectAnimator aD2 = aabr.aD(b2, true, zsgVar.b.getResources().getInteger(R.integer.audio_button_fade_in_animation_duration_millis));
            zsgVar.a = new AnimatorSet();
            zsgVar.a.addListener(new zsf(b, b2));
            zsgVar.a.play(aD).with(aD2);
        }
        zsgVar.a.start();
        this.s.c(this.r).start();
        if (this.x == null) {
            return;
        }
        TransitionManager.beginDelayedTransition(this.a, this.u);
        af afVar = this.x;
        afVar.getClass();
        afVar.b(this.a);
        b();
        this.v.E().o = 0;
    }

    public final void b() {
        int i;
        int i2;
        boolean j = this.a.E().j();
        boolean f = this.b.f();
        ImageView imageView = this.o;
        int i3 = 4;
        if (imageView != null) {
            if (true != j) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            imageView.setVisibility(i2);
        } else {
            AudioButtonView audioButtonView = this.b;
            if (j && !f) {
                i = 4;
            } else {
                i = 0;
            }
            audioButtonView.setVisibility(i);
        }
        if (this.j && (((okf) this.i.b()).a() || !this.a.E().k())) {
            f(j);
            return;
        }
        View view = this.p;
        if (j && !f) {
            i3 = 0;
        }
        view.setVisibility(i3);
    }

    public final void c(boolean z) {
        if (z) {
            Context context = this.m;
            xvy xvyVar = this.c;
            int color = context.getColor(R.color.chronometer_text_color_near_limit);
            this.l = Integer.valueOf(((PausableChronometer) xvyVar.b()).getTextColors().getDefaultColor());
            ((PausableChronometer) this.c.b()).setTextColor(color);
            return;
        }
        if (this.l != null) {
            ((PausableChronometer) this.c.b()).setTextColor(this.l.intValue());
        }
    }

    public final void d(boolean z) {
        float f;
        int i;
        zqo c = this.a.E().c();
        if (z) {
            Activity e = abbu.e(this.m);
            e.getClass();
            e.getWindow().addFlags(128);
            PausableChronometer pausableChronometer = (PausableChronometer) this.c.b();
            pausableChronometer.stop();
            pausableChronometer.setBase(pausableChronometer.a.a());
            pausableChronometer.b = 0L;
            pausableChronometer.start();
            this.c.g(0);
            this.d.g(0);
            ((ImageView) this.d.b()).setVisibility(0);
            this.p.setVisibility(4);
            TransitionManager.beginDelayedTransition(this.a, this.t);
            if (this.y == null) {
                if (this.x == null) {
                    af afVar = new af();
                    this.x = afVar;
                    afVar.e(this.a);
                }
                af afVar2 = new af();
                this.y = afVar2;
                afVar2.e(this.a);
                if (((Boolean) utw.p.e()).booleanValue()) {
                    i = this.a.getId();
                } else {
                    i = R.id.message_compose_view_container_with_c2o;
                }
                this.y.g(R.id.compose_message_box_linear_layout, 6, i, 6, (int) this.a.getResources().getDimension(R.dimen.message_box_slide_margin));
                this.y.m(R.id.plus_button, 4);
                this.y.m(R.id.camera_gallery_button, 4);
                this.y.d(R.id.plus_button, 6);
                this.y.d(R.id.camera_gallery_button, 6);
                this.y.g(R.id.camera_gallery_button, 7, R.id.compose_message_box_linear_layout, 6, 0);
                this.y.m(R.id.record_cancel_button_v1, 0);
                this.y.g(R.id.record_cancel_button_v1, 7, R.id.audio_button_view, 6, 0);
                this.y.g(R.id.record_cancel_button_v1, 6, R.id.audio_timer_text, 7, 0);
            }
            this.y.b(this.a);
            AttachmentsContainer attachmentsContainer = this.v;
            Context context = this.m;
            attachmentsContainer.E().o = context.getResources().getInteger(R.integer.message_box_sliding_animation_duration_millis);
            if (c != null) {
                c.d.setVisibility(4);
            }
            this.s.c(this.r).reverse();
            this.s.b(this.c.b(), this.d.b()).start();
            if (this.w == null) {
                this.w = (ImageView) ((ConstraintLayout) this.e.b()).findViewById(R.id.triangle_icon);
            }
            ImageView imageView = this.w;
            imageView.getDrawable().setColorFilter(this.z, PorterDuff.Mode.SRC_ATOP);
            if (true != this.k.A()) {
                f = brg.a;
            } else {
                f = 180.0f;
            }
            imageView.setRotation(f);
            this.s.b(this.c.b(), this.d.b()).start();
            return;
        }
        Activity e2 = abbu.e(this.m);
        e2.getClass();
        e2.getWindow().clearFlags(128);
        this.s.b(this.c.b(), this.d.b()).end();
        if (this.j) {
            f(this.a.E().j());
        }
        if (c != null) {
            c.d.setVisibility(0);
        }
    }

    public final void e() {
        VibrationEffect createOneShot;
        long integer = this.m.getResources().getInteger(R.integer.audio_timer_warning_vibration_duration_millis);
        Vibrator vibrator = this.n;
        createOneShot = VibrationEffect.createOneShot(integer, -1);
        vibrator.vibrate(createOneShot);
    }
}
