package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fyj extends FrameLayout {
    private static final float[] J;
    public final Drawable A;
    public final String B;
    public final String C;
    public ert D;
    public boolean E;
    public final boolean F;
    public boolean G;
    public int H;
    public boolean I;
    private final Resources K;
    private final fye L;
    private final RecyclerView M;
    private final TextView N;
    private final TextView O;
    private final ImageView P;
    private final TextView Q;
    private final erx R;
    private final Runnable S;
    private final Drawable T;
    private final Drawable U;
    private final Drawable V;
    private final Drawable W;
    public final fyu a;
    private final float aa;
    private final float ab;
    private final String ac;
    private final String ad;
    private final Drawable ae;
    private final Drawable af;
    private final String ag;
    private final String ah;
    private boolean ai;
    private final int aj;
    private long[] ak;
    private boolean[] al;
    private final long[] am;
    private final boolean[] an;
    private long ao;
    private final fyb ap;
    private final ghw aq;
    public final CopyOnWriteArrayList b;
    public final fyg c;
    public final fyf d;
    public final fyh e;
    public final fyd f;
    public final PopupWindow g;
    public final int h;
    public final ImageView i;
    public final ImageView j;
    public final ImageView k;
    public final View l;
    public final View m;
    public final ImageView n;
    public final ImageView o;
    public final ImageView p;
    public final ImageView q;
    public final ImageView r;
    public final View s;
    public final View t;
    public final View u;
    public final TextView v;
    public final StringBuilder w;
    public final Formatter x;
    public final ery y;
    public final Drawable z;

    static {
        erf.b("media3.ui");
        J = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyj(Context context) {
        super(context, null, 0);
        byte[] bArr = null;
        int i = 0;
        this.F = true;
        this.H = 5000;
        this.aj = BasePaymentResult.ERROR_REQUEST_FAILED;
        LayoutInflater.from(context).inflate(R.layout.exo_player_control_view, this);
        setDescendantFocusability(262144);
        fye fyeVar = new fye(this);
        this.L = fyeVar;
        this.b = new CopyOnWriteArrayList();
        this.R = new erx();
        this.y = new ery();
        StringBuilder sb = new StringBuilder();
        this.w = sb;
        this.x = new Formatter(sb, Locale.getDefault());
        this.ak = new long[0];
        this.al = new boolean[0];
        this.am = new long[0];
        this.an = new boolean[0];
        this.S = new fyk(this, 1);
        this.Q = (TextView) findViewById(R.id.exo_duration);
        this.v = (TextView) findViewById(R.id.exo_position);
        ImageView imageView = (ImageView) findViewById(R.id.exo_subtitle);
        this.p = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(fyeVar);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_fullscreen);
        this.q = imageView2;
        int i2 = 4;
        s(imageView2, new jh(this, i2, bArr));
        ImageView imageView3 = (ImageView) findViewById(R.id.exo_minimal_fullscreen);
        this.r = imageView3;
        s(imageView3, new jh(this, i2, bArr));
        View findViewById = findViewById(R.id.exo_settings);
        this.s = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(fyeVar);
        }
        View findViewById2 = findViewById(R.id.exo_playback_speed);
        this.t = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(fyeVar);
        }
        View findViewById3 = findViewById(R.id.exo_audio_track);
        this.u = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(fyeVar);
        }
        fyb fybVar = (fyb) findViewById(R.id.exo_progress);
        View findViewById4 = findViewById(R.id.exo_progress_placeholder);
        if (fybVar != null) {
            this.ap = fybVar;
        } else if (findViewById4 != null) {
            fyb fybVar2 = new fyb(context);
            fybVar2.setId(R.id.exo_progress);
            fybVar2.setLayoutParams(findViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById4.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById4);
            viewGroup.removeView(findViewById4);
            viewGroup.addView(fybVar2, indexOfChild);
            this.ap = fybVar2;
        } else {
            this.ap = null;
        }
        fyb fybVar3 = this.ap;
        if (fybVar3 != null) {
            dzg.g(fyeVar);
            fybVar3.c.add(fyeVar);
        }
        Resources resources = context.getResources();
        this.K = resources;
        ImageView imageView4 = (ImageView) findViewById(R.id.exo_play_pause);
        this.k = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(fyeVar);
        }
        ImageView imageView5 = (ImageView) findViewById(R.id.exo_prev);
        this.i = imageView5;
        if (imageView5 != null) {
            imageView5.setImageDrawable(eul.A(context, resources, R.drawable.exo_styled_controls_previous));
            imageView5.setOnClickListener(fyeVar);
        }
        ImageView imageView6 = (ImageView) findViewById(R.id.exo_next);
        this.j = imageView6;
        if (imageView6 != null) {
            imageView6.setImageDrawable(eul.A(context, resources, R.drawable.exo_styled_controls_next));
            imageView6.setOnClickListener(fyeVar);
        }
        Typeface b = ean.b(context, R.font.roboto_medium_numbers);
        ImageView imageView7 = (ImageView) findViewById(R.id.exo_rew);
        TextView textView = (TextView) findViewById(R.id.exo_rew_with_amount);
        if (imageView7 != null) {
            imageView7.setImageDrawable(eul.A(context, resources, R.drawable.exo_styled_controls_simple_rewind));
            this.m = imageView7;
            this.O = null;
        } else if (textView != null) {
            textView.setTypeface(b);
            this.O = textView;
            this.m = textView;
        } else {
            this.O = null;
            this.m = null;
        }
        View view = this.m;
        if (view != null) {
            view.setOnClickListener(fyeVar);
        }
        ImageView imageView8 = (ImageView) findViewById(R.id.exo_ffwd);
        TextView textView2 = (TextView) findViewById(R.id.exo_ffwd_with_amount);
        if (imageView8 != null) {
            imageView8.setImageDrawable(eul.A(context, resources, R.drawable.exo_styled_controls_simple_fastforward));
            this.l = imageView8;
            this.N = null;
        } else if (textView2 != null) {
            textView2.setTypeface(b);
            this.N = textView2;
            this.l = textView2;
        } else {
            this.N = null;
            this.l = null;
        }
        View view2 = this.l;
        if (view2 != null) {
            view2.setOnClickListener(fyeVar);
        }
        ImageView imageView9 = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.n = imageView9;
        if (imageView9 != null) {
            imageView9.setOnClickListener(fyeVar);
        }
        ImageView imageView10 = (ImageView) findViewById(R.id.exo_shuffle);
        this.o = imageView10;
        if (imageView10 != null) {
            imageView10.setOnClickListener(fyeVar);
        }
        this.aa = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.ab = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        ImageView imageView11 = (ImageView) findViewById(R.id.exo_vr);
        this.P = imageView11;
        if (imageView11 != null) {
            imageView11.setImageDrawable(eul.A(context, resources, R.drawable.exo_styled_controls_vr));
            t(false, imageView11);
        }
        fyu fyuVar = new fyu(this);
        this.a = fyuVar;
        fyuVar.v = true;
        fyg fygVar = new fyg(this, new String[]{resources.getString(R.string.exo_controls_playback_speed), resources.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{eul.A(context, resources, R.drawable.exo_styled_controls_speed), eul.A(context, resources, R.drawable.exo_styled_controls_audiotrack)});
        this.c = fygVar;
        this.h = resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
        this.M = recyclerView;
        recyclerView.ag(fygVar);
        getContext();
        recyclerView.aj(new LinearLayoutManager());
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        this.g = popupWindow;
        popupWindow.setOnDismissListener(fyeVar);
        this.I = true;
        this.aq = new ghw(getResources());
        this.z = eul.A(context, resources, R.drawable.exo_styled_controls_subtitle_on);
        this.A = eul.A(context, resources, R.drawable.exo_styled_controls_subtitle_off);
        this.B = resources.getString(R.string.exo_controls_cc_enabled_description);
        this.C = resources.getString(R.string.exo_controls_cc_disabled_description);
        this.e = new fyh(this);
        this.f = new fyd(this);
        this.d = new fyf(this, resources.getStringArray(R.array.exo_controls_playback_speeds), J);
        this.T = eul.A(context, resources, R.drawable.exo_styled_controls_play);
        this.U = eul.A(context, resources, R.drawable.exo_styled_controls_pause);
        this.ae = eul.A(context, resources, R.drawable.exo_styled_controls_fullscreen_exit);
        this.af = eul.A(context, resources, R.drawable.exo_styled_controls_fullscreen_enter);
        eul.A(context, resources, R.drawable.exo_styled_controls_repeat_off);
        eul.A(context, resources, R.drawable.exo_styled_controls_repeat_one);
        eul.A(context, resources, R.drawable.exo_styled_controls_repeat_all);
        this.V = eul.A(context, resources, R.drawable.exo_styled_controls_shuffle_on);
        this.W = eul.A(context, resources, R.drawable.exo_styled_controls_shuffle_off);
        this.ag = resources.getString(R.string.exo_controls_fullscreen_exit_description);
        this.ah = resources.getString(R.string.exo_controls_fullscreen_enter_description);
        resources.getString(R.string.exo_controls_repeat_off_description);
        resources.getString(R.string.exo_controls_repeat_one_description);
        resources.getString(R.string.exo_controls_repeat_all_description);
        this.ac = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.ad = resources.getString(R.string.exo_controls_shuffle_off_description);
        fyuVar.j((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
        fyuVar.j(this.l, true);
        fyuVar.j(this.m, true);
        fyuVar.j(imageView5, true);
        fyuVar.j(imageView6, true);
        fyuVar.j(imageView10, false);
        fyuVar.j(imageView, false);
        fyuVar.j(imageView11, false);
        fyuVar.j(imageView9, false);
        addOnLayoutChangeListener(new fyc(this, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final alog r(esg esgVar, int i) {
        String m;
        String c;
        String str;
        alob alobVar = new alob();
        int i2 = 0;
        while (true) {
            alog alogVar = esgVar.b;
            if (i2 < alogVar.size()) {
                esf esfVar = (esf) alogVar.get(i2);
                if (esfVar.a() == i) {
                    for (int i3 = 0; i3 < esfVar.a; i3++) {
                        if (esfVar.d(i3)) {
                            eqn b = esfVar.b(i3);
                            if ((b.e & 2) == 0) {
                                ghw ghwVar = this.aq;
                                int b2 = erl.b(b.o);
                                if (b2 == -1) {
                                    String str2 = b.k;
                                    if (str2 != null) {
                                        for (String str3 : eul.ag(str2)) {
                                            c = erl.c(str3);
                                            if (c != null && erl.j(c)) {
                                                break;
                                            }
                                        }
                                    }
                                    c = null;
                                    if (c == null) {
                                        String str4 = b.k;
                                        if (str4 != null) {
                                            for (String str5 : eul.ag(str4)) {
                                                String c2 = erl.c(str5);
                                                if (c2 != null && erl.g(c2)) {
                                                    str = c2;
                                                    break;
                                                }
                                            }
                                        }
                                        str = null;
                                        if (str == null) {
                                            if (b.v == -1 && b.w == -1) {
                                                if (b.D == -1 && b.E == -1) {
                                                    b2 = -1;
                                                }
                                            }
                                        }
                                        b2 = 1;
                                    }
                                    b2 = 2;
                                }
                                String str6 = "";
                                if (b2 == 2) {
                                    String n = ghwVar.n(b);
                                    int i4 = b.v;
                                    int i5 = b.w;
                                    if (i4 != -1 && i5 != -1) {
                                        str6 = ((Resources) ghwVar.a).getString(R.string.exo_track_resolution, Integer.valueOf(i4), Integer.valueOf(i5));
                                    }
                                    m = ghwVar.o(n, str6, ghwVar.l(b));
                                } else if (b2 == 1) {
                                    String m2 = ghwVar.m(b);
                                    int i6 = b.D;
                                    if (i6 != -1 && i6 > 0) {
                                        str6 = i6 != 1 ? i6 != 2 ? (i6 == 6 || i6 == 7) ? ((Resources) ghwVar.a).getString(R.string.exo_track_surround_5_point_1) : i6 != 8 ? ((Resources) ghwVar.a).getString(R.string.exo_track_surround) : ((Resources) ghwVar.a).getString(R.string.exo_track_surround_7_point_1) : ((Resources) ghwVar.a).getString(R.string.exo_track_stereo) : ((Resources) ghwVar.a).getString(R.string.exo_track_mono);
                                    }
                                    m = ghwVar.o(m2, str6, ghwVar.l(b));
                                } else {
                                    m = ghwVar.m(b);
                                }
                                if (m.length() == 0) {
                                    String str7 = b.d;
                                    if (str7 != null && !str7.trim().isEmpty()) {
                                        m = ((Resources) ghwVar.a).getString(R.string.exo_track_unknown_name, str7);
                                    } else {
                                        m = ((Resources) ghwVar.a).getString(R.string.exo_track_unknown);
                                    }
                                }
                                alobVar.h(new apuv(esgVar, i2, i3, m));
                            }
                        }
                    }
                }
                i2++;
            } else {
                return alobVar.g();
            }
        }
    }

    private static void s(View view, View.OnClickListener onClickListener) {
        if (view == null) {
            return;
        }
        view.setVisibility(8);
        view.setOnClickListener(onClickListener);
    }

    private final void t(boolean z, View view) {
        float f;
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        if (z) {
            f = this.aa;
        } else {
            f = this.ab;
        }
        view.setAlpha(f);
    }

    private final void u() {
        fyg fygVar = this.c;
        boolean z = true;
        if (!fygVar.F(1) && !fygVar.F(0)) {
            z = false;
        }
        t(z, this.s);
    }

    public final void a(no noVar, View view) {
        this.M.ag(noVar);
        k();
        this.I = false;
        this.g.dismiss();
        this.I = true;
        int width = getWidth() - this.g.getWidth();
        int i = -this.g.getHeight();
        PopupWindow popupWindow = this.g;
        int i2 = this.h;
        popupWindow.showAsDropDown(view, width - i2, i - i2);
    }

    public final void b() {
        fyu fyuVar = this.a;
        int i = fyuVar.s;
        if (i != 3 && i != 2) {
            fyuVar.h();
            if (!fyuVar.v) {
                fyuVar.e();
            } else if (fyuVar.s == 1) {
                fyuVar.f();
            } else {
                fyuVar.d();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        if (((defpackage.fad) r5).i == android.os.Looper.getMainLooper()) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.ert r5) {
        /*
            r4 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r2 = 0
            r3 = 1
            if (r0 != r1) goto Le
            r0 = r3
            goto Lf
        Le:
            r0 = r2
        Lf:
            defpackage.dzg.d(r0)
            if (r5 == 0) goto L1f
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r1 = r5
            fad r1 = (defpackage.fad) r1
            android.os.Looper r1 = r1.i
            if (r1 != r0) goto L20
        L1f:
            r2 = r3
        L20:
            defpackage.d.s(r2)
            ert r0 = r4.D
            if (r0 != r5) goto L28
            return
        L28:
            if (r0 == 0) goto L2f
            fye r1 = r4.L
            r0.M(r1)
        L2f:
            r4.D = r5
            if (r5 == 0) goto L38
            fye r0 = r4.L
            r5.K(r0)
        L38:
            r4.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fyj.c(ert):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        g();
        f();
        j();
        l();
        n();
        h();
        m();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!o(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    public final void e(ImageView imageView, boolean z) {
        if (imageView == null) {
            return;
        }
        if (z) {
            imageView.setImageDrawable(this.ae);
            imageView.setContentDescription(this.ag);
        } else {
            imageView.setImageDrawable(this.af);
            imageView.setContentDescription(this.ah);
        }
    }

    public final void f() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        long j;
        long j2;
        if (q() && this.ai) {
            ert ertVar = this.D;
            if (ertVar != null) {
                z2 = ertVar.l(5);
                z3 = ertVar.l(7);
                z4 = ertVar.l(11);
                z5 = ertVar.l(12);
                z = ertVar.l(9);
            } else {
                z = false;
                z2 = false;
                z3 = false;
                z4 = false;
                z5 = false;
            }
            if (z4) {
                ert ertVar2 = this.D;
                if (ertVar2 != null) {
                    j2 = ertVar2.D();
                } else {
                    j2 = 5000;
                }
                TextView textView = this.O;
                int i = (int) (j2 / 1000);
                if (textView != null) {
                    textView.setText(String.valueOf(i));
                }
                View view = this.m;
                if (view != null) {
                    view.setContentDescription(this.K.getQuantityString(R.plurals.exo_controls_rewind_by_amount_description, i, Integer.valueOf(i)));
                }
            }
            if (z5) {
                ert ertVar3 = this.D;
                if (ertVar3 != null) {
                    j = ertVar3.E();
                } else {
                    j = 15000;
                }
                TextView textView2 = this.N;
                int i2 = (int) (j / 1000);
                if (textView2 != null) {
                    textView2.setText(String.valueOf(i2));
                }
                View view2 = this.l;
                if (view2 != null) {
                    view2.setContentDescription(this.K.getQuantityString(R.plurals.exo_controls_fastforward_by_amount_description, i2, Integer.valueOf(i2)));
                }
            }
            t(z3, this.i);
            t(z4, this.m);
            t(z5, this.l);
            t(z, this.j);
            fyb fybVar = this.ap;
            if (fybVar != null) {
                fybVar.setEnabled(z2);
            }
        }
    }

    public final void g() {
        Drawable drawable;
        int i;
        if (q() && this.ai && this.k != null) {
            boolean ab = eul.ab(this.D, this.F);
            if (ab) {
                drawable = this.T;
            } else {
                drawable = this.U;
            }
            boolean z = true;
            if (true != ab) {
                i = R.string.exo_controls_pause_description;
            } else {
                i = R.string.exo_controls_play_description;
            }
            this.k.setImageDrawable(drawable);
            this.k.setContentDescription(this.K.getString(i));
            ert ertVar = this.D;
            if (ertVar == null || !ertVar.l(1) || (this.D.l(17) && this.D.H().q())) {
                z = false;
            }
            t(z, this.k);
        }
    }

    public final void h() {
        ert ertVar = this.D;
        if (ertVar == null) {
            return;
        }
        fyf fyfVar = this.d;
        float f = ertVar.F().b;
        float f2 = Float.MAX_VALUE;
        int i = 0;
        int i2 = 0;
        while (true) {
            float[] fArr = fyfVar.d;
            int length = fArr.length;
            if (i < 7) {
                float abs = Math.abs(f - fArr[i]);
                if (abs < f2) {
                    f2 = abs;
                }
                if (abs < f2) {
                    i2 = i;
                }
                i++;
            } else {
                fyfVar.e = i2;
                fyg fygVar = this.c;
                fyf fyfVar2 = this.d;
                fygVar.m(0, fyfVar2.c[fyfVar2.e]);
                u();
                return;
            }
        }
    }

    public final void i() {
        long j;
        long j2;
        int w;
        long j3;
        long z;
        if (q() && this.ai) {
            ert ertVar = this.D;
            if (ertVar != null && ertVar.l(16)) {
                j = this.ao + ertVar.z();
                long j4 = this.ao;
                fad fadVar = (fad) ertVar;
                fadVar.ag();
                if (fadVar.A.b.q()) {
                    z = fadVar.C;
                } else {
                    fay fayVar = fadVar.A;
                    if (fayVar.k.d != fayVar.c.d) {
                        z = fayVar.b.p(fadVar.u(), fadVar.a).b();
                    } else {
                        long j5 = fayVar.q;
                        if (fadVar.A.k.b()) {
                            fay fayVar2 = fadVar.A;
                            fayVar2.b.o(fayVar2.k.a, fadVar.g).g(fadVar.A.k.b);
                            j5 = 0;
                        }
                        fay fayVar3 = fadVar.A;
                        z = eul.z(fadVar.S(fayVar3.b, fayVar3.k, j5));
                    }
                }
                j2 = j4 + z;
            } else {
                j = 0;
                j2 = 0;
            }
            TextView textView = this.v;
            if (textView != null && !this.G) {
                textView.setText(eul.J(this.w, this.x, j));
            }
            fyb fybVar = this.ap;
            if (fybVar != null) {
                if (fybVar.j != j) {
                    fybVar.j = j;
                    fybVar.setContentDescription(fybVar.a());
                    fybVar.d();
                }
                fyb fybVar2 = this.ap;
                if (fybVar2.k != j2) {
                    fybVar2.k = j2;
                    fybVar2.d();
                }
            }
            removeCallbacks(this.S);
            if (ertVar == null) {
                w = 1;
            } else {
                w = ertVar.w();
            }
            long j6 = 1000;
            if (ertVar != null) {
                eqb eqbVar = (eqb) ertVar;
                if (eqbVar.w() == 3 && eqbVar.P() && eqbVar.x() == 0) {
                    fyb fybVar3 = this.ap;
                    if (fybVar3 != null) {
                        int width = (int) (fybVar3.b.width() / fybVar3.d);
                        j3 = Long.MAX_VALUE;
                        if (width != 0) {
                            long j7 = fybVar3.i;
                            if (j7 != 0 && j7 != -9223372036854775807L) {
                                j3 = j7 / width;
                            }
                        }
                    } else {
                        j3 = 1000;
                    }
                    long min = Math.min(j3, 1000 - (j % 1000));
                    float f = ertVar.F().b;
                    if (f > brg.a) {
                        j6 = ((float) min) / f;
                    }
                    postDelayed(this.S, eul.q(j6, this.aj, 1000L));
                    return;
                }
            }
            if (w != 4 && w != 1) {
                postDelayed(this.S, 1000L);
            }
        }
    }

    public final void j() {
        ImageView imageView;
        if (q() && this.ai && (imageView = this.n) != null) {
            t(false, imageView);
        }
    }

    public final void k() {
        this.M.measure(0, 0);
        int i = this.h;
        this.g.setWidth(Math.min(this.M.getMeasuredWidth(), getWidth() - (i + i)));
        int i2 = this.h;
        this.g.setHeight(Math.min(getHeight() - (i2 + i2), this.M.getMeasuredHeight()));
    }

    public final void l() {
        ImageView imageView;
        Drawable drawable;
        String str;
        if (q() && this.ai && (imageView = this.o) != null) {
            ert ertVar = this.D;
            if (!this.a.m(imageView)) {
                t(false, this.o);
                return;
            }
            if (ertVar != null && ertVar.l(14)) {
                t(true, this.o);
                ImageView imageView2 = this.o;
                if (ertVar.Q()) {
                    drawable = this.V;
                } else {
                    drawable = this.W;
                }
                imageView2.setImageDrawable(drawable);
                ImageView imageView3 = this.o;
                if (ertVar.Q()) {
                    str = this.ac;
                } else {
                    str = this.ad;
                }
                imageView3.setContentDescription(str);
                return;
            }
            t(false, this.o);
            this.o.setImageDrawable(this.W);
            this.o.setContentDescription(this.ad);
        }
    }

    public final void m() {
        erz erzVar;
        ery eryVar;
        ert ertVar = this.D;
        if (ertVar == null) {
            return;
        }
        long j = 0;
        this.ao = 0L;
        if (ertVar.l(17)) {
            erzVar = ertVar.H();
        } else {
            erzVar = erz.a;
        }
        if (!erzVar.q()) {
            int u = ertVar.u();
            int i = u;
            while (true) {
                if (i > u) {
                    break;
                }
                if (i == u) {
                    this.ao = eul.z(j);
                }
                erzVar.p(i, this.y);
                ery eryVar2 = this.y;
                if (eryVar2.m == -9223372036854775807L) {
                    dzg.d(true);
                    break;
                }
                int i2 = eryVar2.n;
                while (true) {
                    eryVar = this.y;
                    if (i2 <= eryVar.o) {
                        erzVar.n(i2, this.R);
                        this.R.i();
                        this.R.l();
                        i2++;
                    }
                }
                j += eryVar.m;
                i++;
            }
        } else if (ertVar.l(16)) {
            long c = ertVar.c();
            if (c != -9223372036854775807L) {
                j = eul.u(c);
            }
        }
        TextView textView = this.Q;
        long z = eul.z(j);
        if (textView != null) {
            textView.setText(eul.J(this.w, this.x, z));
        }
        fyb fybVar = this.ap;
        if (fybVar != null) {
            if (fybVar.i != z) {
                fybVar.i = z;
                if (fybVar.h && z == -9223372036854775807L) {
                    fybVar.c(true);
                }
                fybVar.d();
            }
            int length = this.am.length;
            long[] jArr = this.ak;
            if (jArr.length < 0) {
                this.ak = Arrays.copyOf(jArr, 0);
                this.al = Arrays.copyOf(this.al, 0);
            }
            System.arraycopy(this.am, 0, this.ak, 0, 0);
            System.arraycopy(this.an, 0, this.al, 0, 0);
            fyb fybVar2 = this.ap;
            long[] jArr2 = this.ak;
            boolean[] zArr = this.al;
            d.s(true);
            fybVar2.l = 0;
            fybVar2.m = jArr2;
            fybVar2.n = zArr;
            fybVar2.d();
        }
        i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n() {
        this.e.I();
        this.f.I();
        ert ertVar = this.D;
        boolean z = false;
        if (ertVar != null && ertVar.l(30) && this.D.l(29)) {
            esg J2 = this.D.J();
            fyd fydVar = this.f;
            alog r = r(J2, 1);
            fydVar.d = r;
            ert ertVar2 = fydVar.c.D;
            dzg.g(ertVar2);
            ese I = ertVar2.I();
            if (r.isEmpty()) {
                fyj fyjVar = fydVar.c;
                fyjVar.c.m(1, fyjVar.getResources().getString(R.string.exo_track_selection_none));
            } else if (!fydVar.F(I)) {
                fyj fyjVar2 = fydVar.c;
                fyjVar2.c.m(1, fyjVar2.getResources().getString(R.string.exo_track_selection_auto));
            } else {
                int i = 0;
                while (true) {
                    if (i >= ((alsx) r).c) {
                        break;
                    }
                    apuv apuvVar = (apuv) r.get(i);
                    if (apuvVar.q()) {
                        fydVar.c.c.m(1, (String) apuvVar.b);
                        break;
                    }
                    i++;
                }
            }
            if (this.a.m(this.p)) {
                this.e.F(r(J2, 3));
            } else {
                fyh fyhVar = this.e;
                int i2 = alog.d;
                fyhVar.F(alsx.a);
            }
        }
        if (this.e.b() > 0) {
            z = true;
        }
        t(z, this.p);
        u();
    }

    public final boolean o(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ert ertVar = this.D;
        if (ertVar != null) {
            int i = 89;
            if (keyCode != 90 && keyCode != 89 && keyCode != 85 && keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 87) {
                if (keyCode == 88) {
                    keyCode = 88;
                } else {
                    return false;
                }
            }
            if (keyEvent.getAction() == 0) {
                if (keyCode == 90) {
                    if (ertVar.w() != 4 && ertVar.l(12)) {
                        ertVar.g();
                        return true;
                    }
                    return true;
                }
                if (keyCode == 89) {
                    if (ertVar.l(11)) {
                        ertVar.f();
                        return true;
                    }
                } else {
                    i = keyCode;
                }
                if (keyEvent.getRepeatCount() == 0) {
                    if (i != 79 && i != 85) {
                        if (i != 87) {
                            if (i != 88) {
                                if (i != 126) {
                                    if (i == 127) {
                                        eul.am(ertVar);
                                        return true;
                                    }
                                    return true;
                                }
                                eul.an(ertVar);
                                return true;
                            }
                            if (ertVar.l(7)) {
                                ertVar.i();
                                return true;
                            }
                            return true;
                        }
                        if (ertVar.l(9)) {
                            ertVar.h();
                            return true;
                        }
                        return true;
                    }
                    eul.aj(ertVar, this.F);
                    return true;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        fyu fyuVar = this.a;
        fyuVar.a.addOnLayoutChangeListener(fyuVar.q);
        this.ai = true;
        if (p()) {
            this.a.i();
        }
        d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        fyu fyuVar = this.a;
        fyuVar.a.removeOnLayoutChangeListener(fyuVar.q);
        this.ai = false;
        removeCallbacks(this.S);
        this.a.h();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.a.b;
        if (view != null) {
            view.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    public final boolean p() {
        fyu fyuVar = this.a;
        if (fyuVar.s == 0 && fyuVar.a.q()) {
            return true;
        }
        return false;
    }

    public final boolean q() {
        if (getVisibility() == 0) {
            return true;
        }
        return false;
    }
}
