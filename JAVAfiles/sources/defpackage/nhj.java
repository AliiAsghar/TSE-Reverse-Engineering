package defpackage;

import android.media.MediaPlayer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class nhj implements MediaPlayer.OnErrorListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ nhj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        if (this.b != 0) {
            mediaPlayer.getClass();
            kbn kbnVar = (kbn) this.a;
            ((alvg) kbnVar.d.g().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/audio/BugleAudioPlayer", "prepare$lambda$6$lambda$5", 163, "BugleAudioPlayer.kt")).u("Failed to prepare audio file, %d, %d", i, i2);
            kbnVar.g.f(true);
            kbnVar.f.f(false);
            return true;
        }
        Object obj = this.a;
        nhm nhmVar = (nhm) obj;
        qdq qdqVar = nhmVar.k;
        nhh nhhVar = (nhh) qdqVar.a;
        ngx ngxVar = nhhVar.g;
        if (ngxVar != null) {
            nhhVar.g(ngxVar, new nha(i, i2));
        }
        if (obj.equals(((nhh) qdqVar.a).f)) {
            ((nhh) qdqVar.a).d();
        } else {
            nhmVar.d();
        }
        ((alwl) ((alwl) nhh.a.i()).h("com/google/android/apps/messaging/shared/audio/attachment/controller/AudioAttachmentController$AudioControllerSessionStateChangeListener", "onError", 346, "AudioAttachmentController.java")).u("Audio playback error occurred. what=%d, extra=%d", i, i2);
        nhmVar.c.a();
        return true;
    }
}
