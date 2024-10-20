package defpackage;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fcw extends AudioTrack$StreamEventCallback {
    final /* synthetic */ rdq a;

    public fcw(rdq rdqVar) {
        this.a = rdqVar;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        audioTrack.equals(((fcx) this.a.a).o);
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (!audioTrack.equals(((fcx) this.a.a).o)) {
            return;
        }
        ((fcx) this.a.a).E = true;
    }

    public final void onTearDown(AudioTrack audioTrack) {
        audioTrack.equals(((fcx) this.a.a).o);
    }
}
