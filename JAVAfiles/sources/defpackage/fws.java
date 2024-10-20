package defpackage;

import android.media.MediaMuxer;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fws implements fva {
    public static final alog a;
    public static final alog b;
    public final MediaMuxer c;
    public final Map d = new HashMap();
    public final Map e = new HashMap();
    public boolean f;
    public boolean g;

    static {
        alob alobVar = new alob();
        alobVar.i("video/avc", "video/3gpp", "video/mp4v-es");
        int i = eul.a;
        alobVar.h("video/hevc");
        if (eul.a >= 34) {
            alobVar.h("video/av01");
        }
        a = alobVar.g();
        b = alog.t("audio/mp4a-latm", "audio/3gpp", "audio/amr-wb");
    }

    public fws(MediaMuxer mediaMuxer) {
        this.c = mediaMuxer;
    }

    public final void a() {
        try {
            this.c.start();
            this.f = true;
        } catch (RuntimeException e) {
            throw new fuz("Failed to start the muxer", e);
        }
    }
}
