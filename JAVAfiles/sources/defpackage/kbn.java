package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kbn {
    public final Context a;
    public final arwe b;
    public final Uri c;
    public MediaPlayer e;
    public long i;
    public boolean l;
    public Long m;
    private final AudioManager n;
    private final arwe o;
    private final aksr p;
    private final Duration q;
    private AudioFocusRequest r;
    private arxm u;
    private arxm v;
    private final mck w;
    private final int x;
    public final alvi d = alvi.m("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/audio/BugleAudioPlayer");
    private final AudioAttributes s = new AudioAttributes.Builder().setContentType(2).setUsage(1).build();
    private final arqr t = new jsv(this, 20);
    public final ascd f = ascy.a(false);
    public final ascd g = ascy.a(false);
    public final ascd h = ascy.a(false);
    public final ascd j = ascy.a(null);
    public final ascd k = ascy.a(null);

    public kbn(AudioManager audioManager, Context context, arwe arweVar, arwe arweVar2, mck mckVar, aksr aksrVar, Uri uri, Duration duration, int i) {
        this.n = audioManager;
        this.a = context;
        this.b = arweVar;
        this.o = arweVar2;
        this.w = mckVar;
        this.p = aksrVar;
        this.c = uri;
        this.q = duration;
        this.x = i;
        this.i = duration.toMillis();
    }

    private final void g(final boolean z) {
        int i = 1;
        this.f.f(true);
        MediaPlayer a = ygu.a();
        a.setOnCompletionListener(new nhk(this, i));
        a.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: kbj
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                long duration = mediaPlayer.getDuration();
                kbn kbnVar = kbn.this;
                kbnVar.i = duration;
                kbnVar.l = true;
                kbnVar.f.f(false);
                Long l = kbnVar.m;
                if (l != null) {
                    mediaPlayer.seekTo((int) l.longValue());
                }
                kbnVar.m = null;
                Float f = (Float) kbnVar.k.c();
                if (f != null) {
                    long floatValue = f.floatValue() * ((float) kbnVar.i);
                    kbnVar.j.f(Long.valueOf(floatValue));
                    mediaPlayer.seekTo((int) floatValue);
                }
                boolean z2 = z;
                kbnVar.k.f(null);
                if (z2) {
                    kbnVar.b();
                }
            }
        });
        a.setOnErrorListener(new nhj(this, i));
        a.setAudioAttributes(this.s);
        arxm arxmVar = this.v;
        if (arxmVar != null) {
            arxmVar.v(null);
        }
        this.v = arrn.I(this.o, null, null, new jsu(this, (arpe) null, 11), 3);
        this.e = a;
    }

    public final void a() {
        if (this.l && ((Boolean) this.h.c()).booleanValue() && this.e != null) {
            this.w.b(this.x, this.q.getSeconds());
            MediaPlayer mediaPlayer = this.e;
            mediaPlayer.getClass();
            mediaPlayer.pause();
            d();
            this.h.f(false);
            f();
            return;
        }
        ((alvg) this.d.g().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/audio/BugleAudioPlayer", "pause", 198, "BugleAudioPlayer.kt")).t("Failed to pause audio file, %b", Boolean.valueOf(this.l));
    }

    public final void b() {
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder acceptsDelayedFocusGain;
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest build;
        int requestAudioFocus;
        boolean z;
        int i = 1;
        if (!this.l) {
            g(true);
            return;
        }
        akrc b = this.p.b("BugleAudioPlayer#play");
        try {
            audioAttributes = new AudioFocusRequest.Builder(1).setAudioAttributes(this.s);
            acceptsDelayedFocusGain = audioAttributes.setAcceptsDelayedFocusGain(true);
            onAudioFocusChangeListener = acceptsDelayedFocusGain.setOnAudioFocusChangeListener(new nhi(this.t, i));
            build = onAudioFocusChangeListener.build();
            this.r = build;
            AudioManager audioManager = this.n;
            build.getClass();
            requestAudioFocus = audioManager.requestAudioFocus(build);
            if (requestAudioFocus == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z && !((Boolean) this.h.c()).booleanValue() && this.e != null) {
                this.w.c(this.x, this.q.getSeconds());
                MediaPlayer mediaPlayer = this.e;
                mediaPlayer.getClass();
                mediaPlayer.start();
                this.h.f(true);
                arxm arxmVar = this.u;
                if (arxmVar != null) {
                    arxmVar.v(null);
                }
                this.u = arrn.I(this.b, null, null, new kbl(this, null, 2, null), 3);
            } else {
                ((alvg) this.d.g().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/audio/BugleAudioPlayer", "play", 124, "BugleAudioPlayer.kt")).I("Failed to play audio file, %b, %b", z, this.l);
            }
            armd.i(b, null);
        } finally {
        }
    }

    public final void c() {
        f();
        arxm arxmVar = this.v;
        if (arxmVar != null) {
            arxmVar.v(null);
        }
        this.v = null;
        MediaPlayer mediaPlayer = this.e;
        if (mediaPlayer != null) {
            ygu.b(mediaPlayer);
        }
        this.m = (Long) this.j.c();
        this.l = false;
        this.f.f(false);
        this.h.f(false);
        this.e = null;
    }

    public final void d() {
        AudioFocusRequest audioFocusRequest = this.r;
        if (audioFocusRequest != null) {
            this.n.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    public final void e(float f) {
        if (f >= brg.a && f <= 1.0f) {
            alvg alvgVar = (alvg) this.d.g().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/audio/BugleAudioPlayer", "seek", 213, "BugleAudioPlayer.kt");
            Float valueOf = Float.valueOf(f);
            alvgVar.t("Seeking to position: %s", valueOf);
            this.w.d(this.x, this.q.getSeconds());
            if (this.l && this.e != null) {
                float f2 = ((float) this.i) * f;
                this.j.f(Long.valueOf(f2));
                MediaPlayer mediaPlayer = this.e;
                mediaPlayer.getClass();
                mediaPlayer.seekTo((int) f2);
                return;
            }
            ((alvg) this.d.g().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/audio/BugleAudioPlayer", "seek", 220, "BugleAudioPlayer.kt")).q("AudioPlayer not prepared. Preparing and then seeking to position.");
            this.k.f(valueOf);
            g(false);
            return;
        }
        throw new IllegalArgumentException("Progress must be value [0-1]");
    }

    public final void f() {
        arxm arxmVar = this.u;
        if (arxmVar != null) {
            arxmVar.v(null);
        }
        this.u = null;
    }
}
