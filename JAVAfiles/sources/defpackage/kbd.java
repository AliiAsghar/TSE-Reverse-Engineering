package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import j$.time.Duration;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kbd implements kkl {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/audio/AudioPlayerProvider");
    public final HashMap b;
    private final nei c;

    public kbd(Context context, nei neiVar) {
        context.getClass();
        this.c = neiVar;
        this.b = new HashMap();
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [armf, java.lang.Object] */
    public final kbn a(Uri uri, Duration duration, int i) {
        kbn kbnVar = (kbn) this.b.get(uri);
        if (kbnVar != null) {
            ((alvg) a.g().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/audio/AudioPlayerProvider", "getOrCreateAudioPlayer", 80, "AudioPlayerProvider.kt")).t("createAudioPlayer found cached AudioPlayer with uri: %s", uri);
            return kbnVar;
        }
        ((alvg) a.g().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/audio/AudioPlayerProvider", "getOrCreateAudioPlayer", 84, "AudioPlayerProvider.kt")).t("createAudioPlayer creating new AudioPlayer with uri: %s", uri);
        nei neiVar = this.c;
        AudioManager audioManager = (AudioManager) neiVar.b.b();
        audioManager.getClass();
        Context context = (Context) neiVar.f.b();
        context.getClass();
        arwe arweVar = (arwe) neiVar.c.b();
        arweVar.getClass();
        arwe arweVar2 = (arwe) neiVar.e.b();
        arweVar2.getClass();
        mck mckVar = (mck) neiVar.d.b();
        mckVar.getClass();
        aksr aksrVar = (aksr) neiVar.a.b();
        aksrVar.getClass();
        kbn kbnVar2 = new kbn(audioManager, context, arweVar, arweVar2, mckVar, aksrVar, uri, duration, i);
        this.b.put(uri, kbnVar2);
        return kbnVar2;
    }

    @Override // defpackage.kkl, java.lang.AutoCloseable
    public final void close() {
        for (Object obj : this.b.values()) {
            obj.getClass();
            ((kbn) obj).c();
        }
        this.b.clear();
    }
}
