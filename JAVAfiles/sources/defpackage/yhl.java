package defpackage;

import android.content.Context;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yhl {
    private static final alvi b = alvi.m("com/google/android/apps/messaging/shared/util/media/video/transformer/MetadataExtractor");
    public final arpi a;
    private final Context c;

    public yhl(Context context, arpi arpiVar) {
        context.getClass();
        arpiVar.getClass();
        this.c = context;
        this.a = arpiVar;
    }

    public static final MediaFormat c(MediaExtractor mediaExtractor) {
        yhk yhkVar = yhk.a;
        int trackCount = mediaExtractor.getTrackCount();
        for (int i = 0; i < trackCount; i++) {
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(i);
            trackFormat.getClass();
            if (((Boolean) yhkVar.a(trackFormat.getString("mime"))).booleanValue()) {
                alvw g = b.g();
                g.X(alwp.a, "BugleTranscoding");
                ((alvg) g.h("com/google/android/apps/messaging/shared/util/media/video/transformer/MetadataExtractor", "selectFirstTrackByType", 98, "MetadataExtractor.kt")).w("format for track %s is %s", i, trackFormat);
                mediaExtractor.selectTrack(i);
                return trackFormat;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.net.Uri r7, defpackage.arpe r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.yhi
            if (r0 == 0) goto L13
            r0 = r8
            yhi r0 = (defpackage.yhi) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            yhi r0 = new yhi
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r8)
            goto L44
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            defpackage.aqil.P(r8)
            arpi r8 = r6.a
            yhj r2 = new yhj
            r4 = 0
            r5 = 0
            r2.<init>(r6, r7, r4, r5)
            r0.c = r3
            java.lang.Object r8 = defpackage.arro.q(r8, r2, r0)
            if (r8 != r1) goto L44
            return r1
        L44:
            r8.getClass()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yhl.a(android.net.Uri, arpe):java.lang.Object");
    }

    public final Object b(Uri uri, arqr arqrVar) {
        MediaExtractor mediaExtractor = new MediaExtractor();
        mediaExtractor.setDataSource(this.c, uri, (Map<String, String>) null);
        try {
            try {
                return arqrVar.a(mediaExtractor);
            } catch (IOException e) {
                throw new yhg("Error during setDataSource for MediaExtractor", e);
            }
        } finally {
            mediaExtractor.release();
        }
    }
}
