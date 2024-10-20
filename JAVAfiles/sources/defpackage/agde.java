package defpackage;

import androidx.media3.exoplayer.ExoPlayer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agde {
    public static final alvi a = alvi.m("com/google/android/libraries/compose/ui/projector/renderers/video/HugoVideoPlayer");
    public final arwe b;
    public final aftq c;
    public long e;
    public boolean g;
    public arxm h;
    public ExoPlayer i;
    public final ahjj j;
    public final ascd d = ascy.a(false);
    public final ascd f = ascy.a(0L);

    public agde(ahjj ahjjVar, arwe arweVar, aftq aftqVar) {
        this.j = ahjjVar;
        this.b = arweVar;
        this.c = aftqVar;
        this.e = aftqVar.g.toMillis();
    }

    public final void a() {
        if (this.g) {
            ((alvg) a.g().h("com/google/android/libraries/compose/ui/projector/renderers/video/HugoVideoPlayer", "pause", 119, "HugoVideoPlayer.kt")).q("HugoVideoPlayer::pause media player pausing");
            ExoPlayer exoPlayer = this.i;
            if (exoPlayer != null) {
                exoPlayer.d();
            }
        }
    }

    public final void b() {
        arxm arxmVar = this.h;
        if (arxmVar != null) {
            arxmVar.v(null);
        }
        this.h = null;
    }
}
