package defpackage;

import android.media.MediaPlayer;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class nhk implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public nhk(arvo arvoVar, int i) {
        this.b = i;
        this.a = arvoVar;
    }

    /* JADX WARN: Type inference failed for: r6v11, types: [arvo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, arpe] */
    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (this.a.i()) {
                        this.a.w(arnb.a);
                        return;
                    }
                    return;
                } else {
                    aggk aggkVar = (aggk) this.a;
                    aggkVar.c.f(false);
                    aggkVar.d.f(Duration.ZERO);
                    return;
                }
            }
            kbn kbnVar = (kbn) this.a;
            kbnVar.j.f(0L);
            mediaPlayer.seekTo(0);
            kbnVar.h.f(false);
            kbnVar.d();
            return;
        }
        Object obj = this.a;
        nhm nhmVar = (nhm) obj;
        qdq qdqVar = nhmVar.k;
        if (obj.equals(((nhh) qdqVar.a).f)) {
            ((nhh) qdqVar.a).d();
        }
        nhmVar.c.a();
    }

    public /* synthetic */ nhk(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
