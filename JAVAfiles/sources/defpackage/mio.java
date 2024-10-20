package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mio {
    private static final alor a;

    static {
        alok alokVar = new alok();
        alokVar.h("audio/aac", amnk.AUDIO_AAC);
        alokVar.h("audio/mp3", amnk.AUDIO_MP3);
        alokVar.h("audio/mpeg", amnk.AUDIO_MPEG);
        alokVar.h("audio/mpg", amnk.AUDIO_MPG);
        alokVar.h("audio/mp4", amnk.AUDIO_MP4);
        alokVar.h("audio/mp4-latm", amnk.AUDIO_MP4_LATM);
        alokVar.h("application/ogg", amnk.AUDIO_OGG);
        alokVar.h("video/3gp", amnk.VIDEO_3GP);
        alokVar.h("video/3gpp", amnk.VIDEO_3GPP);
        alokVar.h("video/3gpp2", amnk.VIDEO_3G2);
        alokVar.h("video/m4v", amnk.VIDEO_M4V);
        alokVar.h("video/mp4", amnk.VIDEO_MP4);
        alokVar.h("video/mpeg", amnk.VIDEO_MPEG);
        alokVar.h("video/mpeg4", amnk.VIDEO_MPEG4);
        alokVar.h("video/avc", amnk.VIDEO_MPEG4);
        alokVar.h("video/webm", amnk.VIDEO_WEBM);
        a = alokVar.b();
    }

    public static amnk a(String str) {
        if (!TextUtils.isEmpty(str)) {
            alor alorVar = a;
            if (alorVar.containsKey(str)) {
                return (amnk) alorVar.get(str);
            }
            if (gh.e(str) || gh.z(str)) {
                return amnk.MIME_OTHER;
            }
        }
        return amnk.MIME_UNKNOWN;
    }
}
