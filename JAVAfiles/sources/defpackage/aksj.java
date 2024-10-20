package defpackage;

import android.media.MediaPlayer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aksj implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ aksj(aksr aksrVar, MediaPlayer.OnCompletionListener onCompletionListener, int i) {
        this.d = i;
        this.a = aksrVar;
        this.b = "AudioAttachmentPlaybackSession#onCompletionListener";
        this.c = onCompletionListener;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, android.media.MediaPlayer$OnCompletionListener] */
    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        if (this.d != 0) {
            ((alwl) ygs.a.n().h("com/google/android/apps/messaging/shared/util/media/audio/PlaybackSession", "getCompletionListener", 191, "PlaybackSession.java")).q("Media playback completed");
            Object obj = this.b;
            if (obj != null) {
                ((ahjj) obj).s();
            }
            Object obj2 = this.c;
            Object obj3 = this.a;
            qiu.h(aktp.ah(new yar(obj3, obj2, 7), ((ygs) obj3).c));
            return;
        }
        akrc b = ((aksr) this.a).b((String) this.b);
        try {
            this.c.onCompletion(mediaPlayer);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public /* synthetic */ aksj(ygs ygsVar, ahjj ahjjVar, dtq dtqVar, int i) {
        this.d = i;
        this.a = ygsVar;
        this.b = ahjjVar;
        this.c = dtqVar;
    }
}
