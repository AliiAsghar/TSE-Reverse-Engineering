package com.google.android.apps.messaging.audio.attachment;

import android.animation.TimeAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewSwitcher;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.audio.attachment.ui.AudioPlaybackSeekBar;
import com.google.android.apps.messaging.shared.audio.attachment.ui.PausableChronometer;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import defpackage.a;
import defpackage.abbu;
import defpackage.ahmn;
import defpackage.ahnz;
import defpackage.akrh;
import defpackage.aksa;
import defpackage.akso;
import defpackage.aksr;
import defpackage.aktp;
import defpackage.aohs;
import defpackage.apuv;
import defpackage.apxx;
import defpackage.armf;
import defpackage.brg;
import defpackage.d;
import defpackage.ezp;
import defpackage.ibt;
import defpackage.ibv;
import defpackage.ibw;
import defpackage.ibx;
import defpackage.icd;
import defpackage.ish;
import defpackage.ngx;
import defpackage.nhe;
import defpackage.nhn;
import defpackage.rry;
import defpackage.utz;
import defpackage.xun;
import defpackage.xuo;
import defpackage.xvy;
import defpackage.zpt;
import j$.time.Duration;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AudioAttachmentView extends ibw implements xun, ngx {
    public ViewSwitcher a;
    PausableChronometer b;
    AudioPlaybackSeekBar c;
    public boolean d;
    public xuo e;
    public zpt f;
    public armf g;
    public armf h;
    public armf i;
    public armf j;
    public armf k;
    public armf l;
    final int m;
    public apuv n;
    private GradientDrawable o;
    private final RectF p;
    private Uri q;
    private final int r;
    private final Path s;
    private int t;
    private int u;
    private boolean v;
    private boolean w;
    private int x;

    public AudioAttachmentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.p = new RectF();
        new nhe(3, Duration.ofMillis(-1L), Duration.ZERO);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ibv.a);
        int i2 = a.ac()[obtainStyledAttributes.getInt(0, 0)];
        this.m = i2;
        LayoutInflater from = LayoutInflater.from(getContext());
        int i3 = i2 - 1;
        if (i2 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    i = R.layout.audio_attachment_view_normal_layout;
                } else {
                    i = R.layout.audio_attachment_view_mini_layout;
                }
            } else {
                i = R.layout.audio_attachment_view_compact_layout;
            }
            from.inflate(i, (ViewGroup) this, true);
            obtainStyledAttributes.recycle();
            setWillNotDraw(i2 == 3);
            this.s = new Path();
            this.r = context.getResources().getDimensionPixelSize(R.dimen.audio_attachment_corner_radius);
            setContentDescription(context.getString(R.string.audio_attachment_content_description));
            return;
        }
        throw null;
    }

    private final void k(boolean z, Duration duration) {
        long millis;
        PausableChronometer pausableChronometer = this.b;
        if (pausableChronometer != null) {
            pausableChronometer.stop();
            pausableChronometer.b = pausableChronometer.a.a() - pausableChronometer.getBase();
            if (duration.isNegative()) {
                millis = 0;
            } else {
                millis = duration.toMillis();
            }
            pausableChronometer.c(millis);
            if (z) {
                pausableChronometer.setBase(pausableChronometer.a.a() - pausableChronometer.b);
                pausableChronometer.start();
            }
        }
    }

    private final void l(boolean z, Duration duration, Duration duration2) {
        int i;
        AudioPlaybackSeekBar audioPlaybackSeekBar = this.c;
        if (audioPlaybackSeekBar != null) {
            long millis = duration.toMillis();
            audioPlaybackSeekBar.d += audioPlaybackSeekBar.a.a() - audioPlaybackSeekBar.e;
            if (audioPlaybackSeekBar.c.isStarted()) {
                audioPlaybackSeekBar.c.end();
            }
            audioPlaybackSeekBar.b = Math.max(millis, 0L);
            if (millis > 0) {
                i = (int) ((duration2.toMillis() * 100) / millis);
            } else {
                i = 0;
            }
            audioPlaybackSeekBar.setProgress(i);
            audioPlaybackSeekBar.a();
            if (z) {
                audioPlaybackSeekBar.e = audioPlaybackSeekBar.a.a();
                if (!audioPlaybackSeekBar.c.isStarted()) {
                    audioPlaybackSeekBar.c.start();
                }
            }
        }
    }

    private final void m() {
        if (f()) {
            this.b.setTextColor(zpt.f(getContext()));
            final AudioPlaybackSeekBar audioPlaybackSeekBar = this.c;
            apuv apuvVar = this.n;
            int f = ahnz.f(getContext(), R.attr.colorSurfaceVariant, "AudioDrawables");
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(2);
            gradientDrawable.setStroke((int) TypedValue.applyDimension(1, 2.0f, ((Resources) apuvVar.b).getDisplayMetrics()), f);
            apuv apuvVar2 = this.n;
            int f2 = ahnz.f(getContext(), R.attr.colorPrimaryBrandIcon, "AudioDrawables");
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            shapeDrawable.setIntrinsicHeight(apuvVar2.a);
            shapeDrawable.setIntrinsicWidth(apuvVar2.a);
            shapeDrawable.setColorFilter(f2, PorterDuff.Mode.SRC_ATOP);
            audioPlaybackSeekBar.f = gradientDrawable;
            audioPlaybackSeekBar.g = shapeDrawable;
            audioPlaybackSeekBar.setProgressDrawable(audioPlaybackSeekBar.f);
            audioPlaybackSeekBar.setThumb(audioPlaybackSeekBar.g);
            if (audioPlaybackSeekBar.c == null) {
                audioPlaybackSeekBar.c = new TimeAnimator();
                audioPlaybackSeekBar.c.setRepeatCount(-1);
                audioPlaybackSeekBar.c.setTimeListener(new TimeAnimator.TimeListener() { // from class: nho
                    @Override // android.animation.TimeAnimator.TimeListener
                    public final void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
                        AudioPlaybackSeekBar audioPlaybackSeekBar2 = AudioPlaybackSeekBar.this;
                        long j3 = 0;
                        int i = 0;
                        if (audioPlaybackSeekBar2.b > 0) {
                            xnv xnvVar = audioPlaybackSeekBar2.a;
                            if (xnvVar != null) {
                                j3 = xnvVar.a();
                            }
                            long j4 = (audioPlaybackSeekBar2.d + j3) - audioPlaybackSeekBar2.e;
                            i = albo.cp((int) ((((float) j4) / ((float) audioPlaybackSeekBar2.b)) * 100.0f), 0, 100);
                        }
                        audioPlaybackSeekBar2.setProgress(i);
                    }
                });
            }
        }
    }

    @Override // defpackage.ngx
    public final Uri a() {
        Uri uri = this.q;
        if (uri == null) {
            return Uri.EMPTY;
        }
        return uri;
    }

    public final void b(xuo xuoVar) {
        xuo xuoVar2;
        boolean z = true;
        if (xuoVar != null && (xuoVar2 = this.e) != null && xuoVar2 != xuoVar) {
            z = false;
        }
        d.s(z);
        this.e = xuoVar;
    }

    @Override // defpackage.xul
    public final void d(boolean z, rry rryVar, Drawable drawable, float[] fArr) {
        boolean z2;
        boolean z3 = true;
        if (this.m == 1) {
            if (this.o == null) {
                this.o = zpt.n(getContext());
            }
            this.o.setColor(zpt.c(getContext(), isSelected()));
            this.o.setCornerRadii(fArr);
            setBackground(this.o);
        }
        boolean au = rryVar.au();
        int d = this.f.d();
        if (!au && !z) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.x == d && this.v == z2 && this.w == z) {
            z3 = false;
        }
        this.w = z;
        this.v = z2;
        this.x = d;
        if (z3) {
            m();
        }
    }

    @Override // defpackage.ngx
    public final void e(nhe nheVar) {
        int i = nheVar.c - 1;
        if (i != 0) {
            if (i != 1) {
                this.a.setDisplayedChild(0);
                k(false, nheVar.a);
                l(false, nheVar.a, Duration.ZERO);
                return;
            } else {
                this.a.setDisplayedChild(0);
                k(false, nheVar.b);
                l(false, nheVar.a, nheVar.b);
                return;
            }
        }
        this.a.setDisplayedChild(1);
        k(true, nheVar.b);
        l(true, nheVar.a, nheVar.b);
    }

    public final boolean f() {
        int i = this.m;
        if (i == 2 || i == 1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.xun
    public final void g(MessagePartCoreData messagePartCoreData, boolean z, int i) {
        boolean z2;
        Uri uri;
        long j;
        if (messagePartCoreData != null && !messagePartCoreData.aW()) {
            z2 = false;
        } else {
            z2 = true;
        }
        d.s(z2);
        if (messagePartCoreData != null) {
            uri = messagePartCoreData.t();
        } else {
            uri = null;
        }
        if (messagePartCoreData != null) {
            j = messagePartCoreData.k();
        } else {
            j = -1;
        }
        this.d = z;
        aksa m = ((ahmn) this.g.b()).m("AudioAttachmentView#bind");
        try {
            akrh e = aktp.e("AudioAttachmentView#bind");
            try {
                this.q = uri;
                this.d = z;
                m();
                e(new nhe(3, Duration.ofMillis(j), Duration.ZERO));
                e.close();
                m.close();
                if (((Boolean) ((utz) ibx.a.get()).e()).booleanValue()) {
                    messagePartCoreData.A();
                    messagePartCoreData.Z();
                    messagePartCoreData.E();
                    if (this.m == 1 && this.d && ((Optional) ((apxx) this.h).a).isPresent() && ((Optional) ((apxx) this.i).a).isPresent()) {
                        icd icdVar = (icd) ((Optional) ((apxx) this.h).a).get();
                        icdVar.a();
                    }
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                m.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ngx
    public final void h() {
        ((abbu) this.l.b()).h(R.string.audio_recording_replay_failed);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        if (this.t != width || this.u != height) {
            this.p.set(brg.a, brg.a, width, height);
            this.s.reset();
            Path path = this.s;
            RectF rectF = this.p;
            float f = this.r;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
            this.t = width;
            this.u = height;
        }
        canvas.clipPath(this.s);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        View findViewById;
        GradientDrawable gradientDrawable;
        super.onFinishInflate();
        if (this.m == 2 && (findViewById = findViewById(R.id.audio_preview_container)) != null && (gradientDrawable = (GradientDrawable) findViewById.getBackground()) != null) {
            gradientDrawable.setColor(ahnz.f(getContext(), R.attr.colorPrimaryBackground, "AudioDrawables"));
            setBackground(gradientDrawable);
        }
        this.a = (ViewSwitcher) findViewById(R.id.play_pause_button);
        if (f()) {
            PausableChronometer pausableChronometer = (PausableChronometer) findViewById(R.id.timer);
            pausableChronometer.getClass();
            AudioPlaybackSeekBar audioPlaybackSeekBar = (AudioPlaybackSeekBar) findViewById(R.id.seek);
            audioPlaybackSeekBar.getClass();
            this.b = pausableChronometer;
            this.c = audioPlaybackSeekBar;
            audioPlaybackSeekBar.setOnSeekBarChangeListener(new akso((aksr) this.j.b(), new ibt(this, audioPlaybackSeekBar, pausableChronometer)));
            if (this.m == 1) {
                audioPlaybackSeekBar.setOnTouchListener(new nhn(0));
            }
        }
        ((aohs) this.k.b()).t(this.a, new ezp(this, 12));
        new xvy(this, R.id.vmt_container_stub, R.id.vmt_container);
    }

    @Override // android.view.View
    public final void setLongClickable(boolean z) {
        ish ishVar;
        super.setLongClickable(z);
        ViewSwitcher viewSwitcher = this.a;
        if (z) {
            ishVar = new ish(this, 1);
        } else {
            ishVar = null;
        }
        viewSwitcher.setOnLongClickListener(ishVar);
    }

    @Override // defpackage.xun
    public final void c() {
    }
}
