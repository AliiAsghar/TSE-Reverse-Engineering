package com.google.android.apps.messaging.ui.conversation;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.media.AudioAttributes;
import android.media.MediaRecorder;
import android.net.Uri;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.MessagePartData;
import com.google.android.apps.messaging.shared.datamodel.data.PendingAttachmentData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import defpackage.a;
import defpackage.aajv;
import defpackage.aauj;
import defpackage.aauk;
import defpackage.abac;
import defpackage.abbu;
import defpackage.aggp;
import defpackage.ahjj;
import defpackage.ahnz;
import defpackage.ameb;
import defpackage.amoq;
import defpackage.amqh;
import defpackage.amqi;
import defpackage.amue;
import defpackage.andi;
import defpackage.anem;
import defpackage.anen;
import defpackage.aneo;
import defpackage.armf;
import defpackage.imo;
import defpackage.mci;
import defpackage.mcu;
import defpackage.mcw;
import defpackage.mcx;
import defpackage.ngv;
import defpackage.nhr;
import defpackage.qiu;
import defpackage.qjb;
import defpackage.rrb;
import defpackage.rsr;
import defpackage.rtb;
import defpackage.rtc;
import defpackage.rtd;
import defpackage.utw;
import defpackage.xnv;
import defpackage.xwr;
import defpackage.xyl;
import defpackage.xzb;
import defpackage.yar;
import defpackage.ygd;
import defpackage.yge;
import defpackage.ygm;
import defpackage.ygn;
import defpackage.yyt;
import defpackage.zms;
import defpackage.zom;
import defpackage.zqj;
import defpackage.zqk;
import defpackage.zro;
import defpackage.zsg;
import defpackage.zsh;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AudioButtonView extends zro implements MediaRecorder.OnErrorListener, MediaRecorder.OnInfoListener {
    private static final aauj A = aauj.a(amqh.VOICE, amqi.COLLAPSED);
    public static final /* synthetic */ int z = 0;
    private AppCompatImageView B;
    private AppCompatImageView C;
    private AppCompatImageView D;
    private Drawable E;
    private Drawable F;
    private Drawable G;
    private GestureDetector H;
    private int I;
    private int J;
    private long K;
    private Runnable L;
    private int M;
    private int N;
    private abac O;
    public long a;
    public rrb b;
    public boolean c;
    public anem d;
    public int e;
    public xnv f;
    public zsg g;
    public ngv h;
    public ContentResolver i;
    public anen j;
    public anen k;
    public aneo l;
    public armf m;
    public armf n;
    public mcu o;
    public mcx p;
    public abbu q;
    public rtb r;
    public mci s;
    public armf t;
    public armf u;
    public int v;
    public yyt w;
    public ahjj x;
    public ahjj y;

    public AudioButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.v = 1;
        this.e = 307200;
    }

    public final void a() {
        this.o.b(TimeUnit.MILLISECONDS.toSeconds(this.f.f().toEpochMilli() - this.a), 2, amue.NOISE_CANCELLATION_STATE_UNKNOWN);
        this.c = true;
        d(false);
        ahjj ahjjVar = this.x;
        if (ahjjVar != null) {
            ((zsh) ahjjVar.a).a();
        }
        g(1);
        Toast.makeText(getContext(), R.string.audio_recorder_recording_cancelled_text, 0).show();
    }

    public final void b(int i, ygn ygnVar) {
        yyt yytVar = this.w;
        ygd ygdVar = new ygd(null);
        ygdVar.a = yge.a(i);
        ygdVar.b(new AudioAttributes.Builder().setUsage(13).build());
        qiu.h(yytVar.Z(ygdVar.a(), new ahjj(ygnVar)).e(ygm.class, new zms(2), andi.a));
    }

    public final void c() {
        long epochMilli = this.f.f().toEpochMilli();
        if (epochMilli - this.K >= this.J) {
            this.p.n(new mcw(0));
            this.O.f();
            removeCallbacks(this.L);
            postDelayed(this.L, this.I);
            this.K = epochMilli;
            return;
        }
        this.p.n(new mcw(2));
    }

    public final void d(boolean z2) {
        amoq amoqVar;
        String str;
        boolean T;
        anem anemVar = this.d;
        byte[] bArr = null;
        int i = 1;
        if (anemVar != null) {
            anemVar.cancel(true);
            this.d = null;
        }
        long epochMilli = this.f.f().toEpochMilli() - this.a;
        if (f() && epochMilli > 0) {
            Uri b = this.h.b();
            if (b != null) {
                if (!this.c) {
                    String str2 = "audio/amr";
                    if (((Boolean) utw.o.e()).booleanValue()) {
                        aggp aggpVar = aggp.a;
                        if (aggpVar != null) {
                            if (true != ((Boolean) nhr.a.e()).booleanValue()) {
                                str = "audio/amr";
                            } else {
                                str = "audio/mp4";
                            }
                            ameb amebVar = ameb.AUDIO_CHOOSER;
                            if (amebVar != null) {
                                imo imoVar = new imo(str, b, amebVar, epochMilli, aggpVar);
                                rsr rsrVar = (rsr) this.b.a();
                                aauj aaujVar = A;
                                String b2 = this.b.b();
                                MessagePartCoreData d = rsrVar.F.d(imoVar, aaujVar);
                                if (d instanceof PendingAttachmentData) {
                                    T = rsrVar.U((PendingAttachmentData) d, b2);
                                } else {
                                    T = rsrVar.T(d);
                                }
                                if (T) {
                                    rsrVar.H();
                                }
                                rsrVar.I(1);
                                amoqVar = aajv.e(imoVar, aaujVar);
                            } else {
                                throw new NullPointerException("Null contentSource");
                            }
                        } else {
                            throw new NullPointerException("Null voiceMetadata");
                        }
                    } else {
                        rtb rtbVar = this.r;
                        rtc a = rtd.a();
                        if (true == ((Boolean) nhr.a.e()).booleanValue()) {
                            str2 = "audio/mp4";
                        }
                        a.c = str2;
                        a.d = b;
                        a.e = b;
                        a.c(epochMilli);
                        a.k(ameb.AUDIO_CHOOSER);
                        MessagePartData e = rtbVar.e(a.a());
                        amoq b3 = aauk.b(e, A);
                        e.f = b3;
                        ((rsr) this.b.a()).S(Collections.singletonList(e), this.b.b());
                        amoqVar = b3;
                    }
                    this.s.f(amoqVar, ((rsr) this.b.a()).k() - 1);
                    if (z2) {
                        mcu mcuVar = this.o;
                        final long seconds = TimeUnit.MILLISECONDS.toSeconds(epochMilli);
                        final amue amueVar = amue.NOISE_CANCELLATION_STATE_UNKNOWN;
                        mcuVar.n(new Supplier() { // from class: mct
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return mcu.d(4, seconds, 2, amueVar);
                            }
                        });
                    } else {
                        this.o.c(TimeUnit.MILLISECONDS.toSeconds(epochMilli), 2, amue.NOISE_CANCELLATION_STATE_UNKNOWN);
                    }
                } else {
                    qjb.a(new yar(this, b, 17), this.k);
                    g(5);
                    return;
                }
            }
            g(5);
            b(R.raw.audio_end, new zqk(this, i, bArr));
            return;
        }
        g(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.H.onTouchEvent(motionEvent);
    }

    protected final void e() {
        int i = this.v;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2 && i2 != 3 && i2 != 4) {
                        xyl.c("Invalid mode for AudioRecordView!");
                        return;
                    }
                    this.E.setColorFilter(getContext().getColor(R.color.audio_button_pressed_icon_color), PorterDuff.Mode.SRC_ATOP);
                    this.B.setImageDrawable(this.E);
                    this.G.setColorFilter(this.N, PorterDuff.Mode.SRC_ATOP);
                    this.C.setImageDrawable(this.G);
                    float fraction = getResources().getFraction(R.fraction.audio_button_animation_start_size, 1, 1);
                    this.C.setScaleX(fraction);
                    this.C.setScaleY(fraction);
                    this.D.setVisibility(0);
                    this.g.a(this, this.C, this.D).start();
                    return;
                }
                return;
            }
            this.g.a(this, this.C, this.D).end();
            this.C.setImageDrawable(null);
            this.E.setColorFilter(this.M, PorterDuff.Mode.SRC_ATOP);
            this.B.setImageDrawable(this.E);
            this.C.setScaleX(1.0f);
            this.C.setScaleY(1.0f);
            this.D.setVisibility(8);
            return;
        }
        throw null;
    }

    public final boolean f() {
        int i = this.v;
        if (i != 3 && i != 4) {
            return false;
        }
        return true;
    }

    public final void g(int i) {
        if (this.v != i) {
            this.v = i;
            ahjj ahjjVar = this.x;
            if (ahjjVar != null) {
                int i2 = i - 1;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                ((zsh) ahjjVar.a).a();
                                ((zsh) ahjjVar.a).d(false);
                                if (xwr.h(((zsh) ahjjVar.a).b.getContext())) {
                                    ((zsh) ahjjVar.a).e();
                                }
                            } else {
                                ((zsh) ahjjVar.a).e();
                                ((zsh) ahjjVar.a).c(true);
                            }
                        } else {
                            ((zsh) ahjjVar.a).c(false);
                            ((zsh) ahjjVar.a).d(true);
                            if (xwr.h(((zsh) ahjjVar.a).b.getContext())) {
                                ((zsh) ahjjVar.a).e();
                            }
                        }
                    } else {
                        zsh zshVar = (zsh) ahjjVar.a;
                        zshVar.b.e = zshVar.a.E().n();
                        ((zsh) ahjjVar.a).c.g(4);
                        ((zsh) ahjjVar.a).d.g(4);
                        ((zsh) ahjjVar.a).e.g(4);
                    }
                } else {
                    ((zsh) ahjjVar.a).d(false);
                }
            }
            e();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d(false);
    }

    @Override // android.media.MediaRecorder.OnErrorListener
    public final void onError(MediaRecorder mediaRecorder, int i, int i2) {
        xzb.g("Bugle", a.bU(i2, i, "Error occurred during audio recording what=", ", extra="));
        this.p.b(2);
        this.q.k(R.string.audio_recording_error);
        d(false);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        new FrameLayout.LayoutParams(-2, -2).gravity = 17;
        this.D = (AppCompatImageView) findViewById(R.id.audio_button_view_recording_indicator);
        this.C = (AppCompatImageView) findViewById(R.id.audio_button_view_background);
        this.B = (AppCompatImageView) findViewById(R.id.audio_button_view_microphone_icon);
        this.E = getContext().getDrawable(R.drawable.quantum_gm_ic_mic_none_white_24);
        Drawable drawable = getContext().getDrawable(R.drawable.quantum_ic_done_black_24);
        this.F = drawable;
        drawable.setColorFilter(getContext().getColor(R.color.audio_button_check_icon_color), PorterDuff.Mode.SRC_ATOP);
        this.G = getContext().getDrawable(R.drawable.compose2o_voice_message_button_background);
        this.H = new zqj(this, getContext(), new GestureDetector.SimpleOnGestureListener());
        this.M = ahnz.d(this.B, R.attr.colorInactiveComposeIcon);
        this.N = ahnz.d(this.B, R.attr.colorActiveComposeIcon);
        abac abacVar = new abac((FrameLayout) LayoutInflater.from(getContext()).inflate(R.layout.voice_messages_single_tap_popup, (ViewGroup) null), 1, this, 2);
        this.O = abacVar;
        abacVar.e(ahnz.d(this, R.attr.colorPrimaryContainer));
        this.I = getResources().getInteger(R.integer.hold_to_record_tooltip_showup_duration_millis);
        this.J = getResources().getInteger(R.integer.hold_to_record_tooltip_showup_gap_millis);
        this.K = -r0;
        abac abacVar2 = this.O;
        abacVar2.getClass();
        this.L = new zom(abacVar2, 2);
    }

    @Override // android.media.MediaRecorder.OnInfoListener
    public final void onInfo(MediaRecorder mediaRecorder, int i, int i2) {
        if (i == 800) {
            xzb.j("Bugle", "Max duration reached while recording audio");
            Toast.makeText(getContext(), R.string.audio_recorder_time_limit_reached_text, 0).show();
            d(true);
        } else if (i == 801) {
            xzb.j("Bugle", "Max size reached while recording audio");
            d(true);
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            e();
        }
    }
}
