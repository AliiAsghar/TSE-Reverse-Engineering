package defpackage;

import android.media.MediaPlayer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aawq implements MediaPlayer.OnCompletionListener {
    private final /* synthetic */ int a;

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        if (this.a != 0) {
            mediaPlayer.stop();
            ygu.b(mediaPlayer);
        } else {
            mediaPlayer.seekTo(0);
            mediaPlayer.start();
        }
    }
}
