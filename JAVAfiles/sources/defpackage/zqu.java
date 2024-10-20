package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.support.constraint.ConstraintLayout;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zqu {
    public final Optional b;
    public final ComposeMessageView c;
    public final View d;
    public ImageView e;
    public SharedPreferences.OnSharedPreferenceChangeListener f;
    public final zqo g;
    public final zqo h;
    public zqo i;
    public zqo j;
    public af k;
    public af l;
    public Transition m;
    public Transition n;
    public final boolean o;
    public final List p;
    public ValueAnimator q;
    private final aksr u;
    private final ImageView v;
    private final LinearLayout w;
    private static final uuf r = uuh.q(134702254);
    public static final uuf a = uuh.d(uuh.b, "collapse_attach_buttons_text_threshold", 0.75f);
    private static final zqt[] s = {new zqt(R.drawable.ic_compose_plus_unselected, R.drawable.ic_compose_plus_selected), new zqt(R.drawable.ic_compose_plus_unselected_v2, R.drawable.ic_compose_plus_selected_v2), new zqt(R.drawable.ic_compose_plus_unselected_v2, R.drawable.ic_compose_plus_selected_v2)};
    private static final zqt[] t = {new zqt(R.drawable.ic_compose_camera_gallery_unselected, R.drawable.ic_compose_camera_gallery_selected, 0.08f, 0.12f), new zqt(R.drawable.ic_compose_camera_gallery_unselected_v2, R.drawable.ic_compose_camera_gallery_selected_v2, 0.18f, 0.24f), new zqt(R.drawable.ic_compose_camera_gallery_unselected_v3, R.drawable.ic_compose_camera_gallery_selected_v3, 0.17f, 0.25f)};

    public zqu(final Context context, aksr aksrVar, Optional optional, armf armfVar, final armf armfVar2, final ComposeMessageView composeMessageView, armf armfVar3, armf armfVar4) {
        int i;
        int i2;
        int i3;
        zqo zqoVar;
        zqo zqoVar2;
        zqo zqoVar3;
        int a2;
        ImageView imageView;
        this.u = aksrVar;
        this.c = composeMessageView;
        ImageView imageView2 = (ImageView) composeMessageView.findViewById(R.id.expand_attach_button);
        this.v = imageView2;
        LinearLayout linearLayout = (LinearLayout) composeMessageView.findViewById(R.id.compose_message_box_linear_layout);
        this.w = linearLayout;
        this.d = composeMessageView.findViewById(R.id.compress_info_image_view);
        this.b = optional;
        if (g() && composeMessageView.findViewById(R.id.magic_button) != null) {
            LayoutInflater from = LayoutInflater.from(composeMessageView.getContext());
            if (((opm) armfVar4.b()).a() && !((Boolean) yig.ao.e()).booleanValue()) {
                a2 = ((jcf) optional.get()).b();
            } else {
                a2 = ((jcf) optional.get()).a();
            }
            i = 0;
            this.e = (ImageView) xvy.c(ImageView.class, from, composeMessageView, R.id.magic_button, a2, R.id.magic_button);
            if (((Boolean) ((utz) yig.ai.get()).e()).booleanValue() && (imageView = this.e) != null) {
                ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(ahnz.d(imageView, R.attr.colorPrimary)), Integer.valueOf(eap.h(ahnz.d(this.e, R.attr.colorSecondaryContainer), 127)));
                this.q = ofObject;
                ofObject.setDuration(1000L);
                this.q.setRepeatCount(3);
                this.q.setRepeatMode(2);
                this.q.addUpdateListener(new qu(this, 20, null));
                this.q.addListener(new zqs(this));
            }
        } else {
            i = 0;
        }
        this.p = new ArrayList();
        ImageView imageView3 = (ImageView) composeMessageView.findViewById(R.id.plus_button);
        ImageView imageView4 = (ImageView) composeMessageView.findViewById(R.id.camera_gallery_button);
        int d = ahnz.d(composeMessageView, R.attr.colorInactiveComposeIcon);
        int d2 = ahnz.d(composeMessageView, R.attr.colorActiveComposeIcon);
        zqo h = h(imageView3, d, d2, f(s, "PLUS_ICON_VERSIONS"), R.string.attachMediaButtonContentDescription, "PlusButton::OnClick");
        this.g = h;
        zqo h2 = h(imageView4, d, d2, f(t, "CAMERA_GALLERY_ICON_VERSIONS"), R.string.c2o_open_gallery_button_content_description, "CameraGalleryButton::OnClick");
        this.h = h2;
        if (((Boolean) utw.g.e()).booleanValue()) {
            ImageView imageView5 = (ImageView) ((ViewStub) composeMessageView.findViewById(R.id.emoji_button_view_stub)).inflate();
            imageView5.setVisibility(i);
            i2 = d2;
            i3 = d;
            zqoVar = h2;
            this.i = e(imageView5, new zqn(R.drawable.ic_compose_emoji_gallery_unselected, d, R.string.c2o_category_emoji_content_description), new zqn(R.drawable.ic_compose_emoji_gallery_unselected, d, R.string.c2o_category_emoji_content_description), new zqn(R.drawable.ic_compose_emoji_gallery_selected, i2, R.string.keyboard_content_description), brg.a, 0.16f, "EmojiButton::OnClick");
        } else {
            i2 = d2;
            i3 = d;
            zqoVar = h2;
        }
        if (((Boolean) ((utz) ipe.q.get()).e()).booleanValue()) {
            this.j = h((ImageView) new xvy(composeMessageView, R.id.audio_button_compose_view_stub, R.id.audio_button_compose_view).b(), i3, ahnz.d(composeMessageView, R.attr.colorSecondary), new zqt(R.drawable.gs_sound_sensing_vd_theme_24, R.drawable.gs_sound_sensing_vd_theme_24, brg.a, brg.a, Integer.valueOf(R.drawable.compose_audio_button_selected_background)), R.string.audio_button_open_compose_content_description, "AudioButton::OnClick");
        }
        ad adVar = (ad) linearLayout.getLayoutParams();
        if (((Boolean) yig.af.e()).booleanValue()) {
            adVar.m = R.id.magic_button;
        } else {
            adVar.m = R.id.camera_gallery_button;
        }
        linearLayout.setLayoutParams(adVar);
        imageView2.setBackground(null);
        imageView2.setElevation(brg.a);
        imageView2.setColorFilter(i2);
        int i4 = 5;
        h.a(new zom(composeMessageView.E(), 4), new zom(composeMessageView.E(), i4));
        zqo zqoVar4 = zqoVar;
        zqoVar4.a(new zom(composeMessageView.E(), 6), new zom(composeMessageView.E(), i4));
        if (this.e != null) {
            this.f = new akse(aksrVar, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: zqp
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    if (str.equals(context.getString(R.string.mc_enabled_pref_key))) {
                        ComposeMessageView composeMessageView2 = composeMessageView;
                        armf armfVar5 = armfVar2;
                        zqu zquVar = zqu.this;
                        ((yai) armfVar5.b()).k(zquVar.e, 8, null);
                        zquVar.m = TransitionInflater.from(composeMessageView2.getContext()).inflateTransition(R.transition.compose_icons_collapse_transition);
                        zquVar.n = TransitionInflater.from(composeMessageView2.getContext()).inflateTransition(R.transition.compose_icons_expand_transition);
                        zquVar.k.m(R.id.magic_button, 8);
                    }
                }
            }, "ComposeEntryPointsController", 0);
            ((ykw) armfVar.b()).m(this.f);
            this.e.addOnAttachStateChangeListener(new zqr(this, armfVar));
            zqoVar2 = zqoVar4;
            this.e.setOnClickListener(new ivq((Object) this, (Object) composeMessageView, (Object) armfVar3, 8, (byte[]) null));
        } else {
            zqoVar2 = zqoVar4;
        }
        zqo zqoVar5 = this.i;
        int i5 = 7;
        if (zqoVar5 != null) {
            zqoVar5.a(new zom(composeMessageView.E(), i5), new zom(composeMessageView.E(), i4));
        }
        h.d.setVisibility(0);
        boolean booleanValue = ((Boolean) utw.M.e()).booleanValue();
        this.o = booleanValue;
        if (booleanValue) {
            zqoVar2.d.setVisibility(0);
            int id = h.d.getId();
            int id2 = zqoVar2.d.getId();
            float dimensionPixelSize = composeMessageView.getResources().getDimensionPixelSize(R.dimen.compose_message_view_attach_button_size) / 2;
            imageView2.setPivotX(dimensionPixelSize);
            imageView2.setPivotY(dimensionPixelSize);
            h.d.setPivotX(dimensionPixelSize);
            h.d.setPivotY(dimensionPixelSize);
            zqoVar2.d.setPivotX(dimensionPixelSize);
            zqoVar2.d.setPivotY(dimensionPixelSize);
            af afVar = new af();
            this.k = afVar;
            afVar.e(a());
            af afVar2 = new af();
            this.l = afVar2;
            afVar2.e(a());
            this.l.d(id2, 7);
            if (((Boolean) utw.p.e()).booleanValue()) {
                this.l.d(id, 6);
                this.l.f(id2, 6, 0, 6);
            } else {
                this.l.f(id2, 6, R.id.message_compose_view_container_with_c2o, 6);
            }
            this.l.f(id, 7, R.id.compose_message_box_linear_layout, 6);
            this.l.f(R.id.expand_attach_button, 7, R.id.compose_message_box_linear_layout, 6);
            if (g()) {
                this.l.f(R.id.magic_button, 6, 0, 6);
                this.l.f(R.id.magic_button, 7, R.id.compose_message_box_linear_layout, 6);
                this.l.l(R.id.magic_button, dimensionPixelSize, dimensionPixelSize);
            }
            this.l.l(id, dimensionPixelSize, dimensionPixelSize);
            this.l.l(id2, dimensionPixelSize, dimensionPixelSize);
            this.l.l(R.id.expand_attach_button, brg.a, brg.a);
            this.l.j(id, 0.001f);
            this.l.k(id, 0.001f);
            this.l.m(id, 4);
            this.l.j(id2, 0.001f);
            this.l.k(id2, 0.001f);
            this.l.m(id2, 4);
            if (g()) {
                this.l.j(R.id.magic_button, 0.001f);
                this.l.k(R.id.magic_button, 0.001f);
                this.l.m(R.id.magic_button, 4);
            }
            this.l.i(id2, 6, composeMessageView.getResources().getDimensionPixelSize(R.dimen.compose_message_view_attach_button_margin_start));
            this.l.j(R.id.expand_attach_button, 1.0f);
            this.l.k(R.id.expand_attach_button, 1.0f);
            this.l.m(R.id.expand_attach_button, 0);
            d();
            imageView2.setOnClickListener(new zqq(this, 0));
        }
        if (((Boolean) ((utz) ipe.q.get()).e()).booleanValue() && (zqoVar3 = this.j) != null) {
            zqoVar3.a(new zom(composeMessageView.E(), 8), new zom(composeMessageView.E(), i4));
        }
    }

    private final zqo e(ImageView imageView, zqn zqnVar, zqn zqnVar2, zqn zqnVar3, float f, float f2, String str) {
        zpn zpnVar = new zpn(this.c.getContext().getDrawable(zqnVar.a), this.c.getContext().getDrawable(zqnVar3.a), f, f2);
        imageView.setImageDrawable(zpnVar);
        byte[] bArr = null;
        if (((Boolean) r.e()).booleanValue()) {
            imageView.addOnLayoutChangeListener(new fyc(imageView, 10, null));
        }
        zqo zqoVar = new zqo(new lui(this, 7), zqm.HIGHLIGHTED, imageView, zpnVar, zqnVar, zqnVar2, zqnVar3);
        imageView.setOnClickListener(new akwb(this.u, str, new zoz(imageView, zqoVar, 2, bArr), 1));
        this.p.add(zqoVar);
        return zqoVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r0 >= 3) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static defpackage.zqt f(defpackage.zqt[] r3, java.lang.String r4) {
        /*
            utz r0 = defpackage.utw.N
            java.lang.Object r0 = r0.e()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 < 0) goto L12
            int r1 = r3.length
            r1 = 3
            if (r0 < r1) goto L24
        L12:
            boolean r1 = defpackage.xyp.c()
            if (r1 != 0) goto L27
            utz r4 = defpackage.utw.N
            utx r4 = (defpackage.utx) r4
            java.lang.Object r4 = r4.c
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r0 = r4.intValue()
        L24:
            r3 = r3[r0]
            return r3
        L27:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unhandled \""
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = "\" version "
            r1.append(r4)
            r1.append(r0)
            java.lang.String r4 = r1.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zqu.f(zqt[], java.lang.String):zqt");
    }

    private final boolean g() {
        if (yig.b() && this.b.isPresent()) {
            return true;
        }
        return false;
    }

    private final zqo h(ImageView imageView, int i, int i2, zqt zqtVar, int i3, String str) {
        int i4 = zqtVar.a;
        return e(imageView, new zqn(i4, i, i3), new zqn(i4, i, i3), new zqn(zqtVar.b, i2, R.string.keyboard_content_description, zqtVar.e), zqtVar.c, zqtVar.d, str);
    }

    public final ConstraintLayout a() {
        if (((Boolean) utw.p.e()).booleanValue()) {
            return this.c;
        }
        return this.c.E().c.h;
    }

    public final void b(ImageView imageView, int i, int i2) {
        Drawable drawable = this.c.getContext().getDrawable(i);
        String string = this.c.getContext().getString(i2);
        if (imageView.getVisibility() != 0) {
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(string);
        } else {
            imageView.clearAnimation();
            imageView.animate().scaleX(brg.a).scaleY(brg.a).setDuration(75L).setInterpolator(new AccelerateInterpolator()).withEndAction(new uju(this, imageView, drawable, string, 6)).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        ImageView imageView = this.v;
        if (imageView != null && imageView.getVisibility() == 0) {
            this.c.E().c.C.ifPresent(new zle(14));
            this.k.m(R.id.compress_info_image_view, this.d.getVisibility());
            TransitionManager.beginDelayedTransition(a(), this.n);
            this.k.b(a());
        }
    }

    public final void d() {
        int i;
        int i2;
        TransitionInflater from = TransitionInflater.from(this.c.getContext());
        if (true != ((Boolean) yig.ah.e()).booleanValue()) {
            i = R.transition.compose_icons_collapse_transition;
        } else {
            i = R.transition.compose_icons_collapse_transition_magic_compose;
        }
        this.m = from.inflateTransition(i);
        TransitionInflater from2 = TransitionInflater.from(this.c.getContext());
        if (true != ((Boolean) yig.ah.e()).booleanValue()) {
            i2 = R.transition.compose_icons_expand_transition;
        } else {
            i2 = R.transition.compose_icons_expand_transition_magic_compose;
        }
        this.n = from2.inflateTransition(i2);
    }
}
