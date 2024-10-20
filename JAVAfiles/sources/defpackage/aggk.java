package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aggk implements aggi {
    public static final alvi a = alvi.m("com/google/android/libraries/compose/voice/audioplayer/AudioPlayerImpl");
    private static final AudioAttributes h = new AudioAttributes.Builder().setContentType(2).setUsage(1).build();
    public final ascd b;
    public final ascd c;
    public final ascd d;
    public final ascv e;
    public final ascv f;
    public final ascv g;
    private final Context i;
    private final arwe j;
    private final arml k;
    private arxm l;

    public aggk(Context context, arwe arweVar) {
        context.getClass();
        arweVar.getClass();
        this.i = context;
        this.j = arweVar;
        this.k = armd.a(afrg.l);
        ascd a2 = ascy.a(false);
        this.b = a2;
        ascd a3 = ascy.a(false);
        this.c = a3;
        ascd a4 = ascy.a(Duration.ZERO);
        this.d = a4;
        this.e = new ascf(a2);
        this.f = new ascf(a3);
        this.g = new ascf(a4);
    }

    @Override // defpackage.aggi
    public final void a() {
        if (((Boolean) this.b.c()).booleanValue() && ((Boolean) this.c.c()).booleanValue()) {
            e().pause();
            this.c.f(false);
            f();
            return;
        }
        ((alvg) a.i().h("com/google/android/libraries/compose/voice/audioplayer/AudioPlayerImpl", "pause", 81, "AudioPlayerImpl.kt")).I("Failed to pause audio file, isPrepared: %b, isPlaying: %b", ((Boolean) this.b.c()).booleanValue(), ((Boolean) this.c.c()).booleanValue());
    }

    @Override // defpackage.aggi
    public final void b() {
        if (((Boolean) this.b.c()).booleanValue() && !((Boolean) this.c.c()).booleanValue()) {
            e().start();
            this.c.f(true);
            arxm arxmVar = this.l;
            if (arxmVar != null) {
                arxmVar.v(null);
            }
            this.l = arrn.J(this.j, null, null, new afmg(this, (arpe) null, 19), 3);
            return;
        }
        ((alvg) a.i().h("com/google/android/libraries/compose/voice/audioplayer/AudioPlayerImpl", "play", 65, "AudioPlayerImpl.kt")).I("Failed to play audio file, isPrepared: %b, isPlaying: %b", ((Boolean) this.b.c()).booleanValue(), ((Boolean) this.c.c()).booleanValue());
    }

    @Override // defpackage.aggi
    public final void c(boolean z) {
        f();
        e().reset();
        this.b.f(false);
        this.c.f(false);
        if (z) {
            this.d.f(Duration.ZERO);
        }
    }

    @Override // defpackage.aggi
    public final void d(Uri uri, boolean z) {
        c(z);
        final MediaPlayer e = e();
        e.setAudioAttributes(h);
        int i = 2;
        e.setOnCompletionListener(new nhk(this, i));
        e.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() { // from class: aggj
            @Override // android.media.MediaPlayer.OnSeekCompleteListener
            public final void onSeekComplete(MediaPlayer mediaPlayer) {
                e.getClass();
                aggk.this.d.f(Duration.ofMillis(r3.getCurrentPosition()));
            }
        });
        e.setDataSource(this.i, uri);
        e.setOnPreparedListener(new aawp(this, i));
        e.prepareAsync();
    }

    public final MediaPlayer e() {
        return (MediaPlayer) this.k.a();
    }

    public final void f() {
        arxm arxmVar = this.l;
        if (arxmVar != null) {
            arxmVar.v(null);
        }
        this.l = null;
    }
}
