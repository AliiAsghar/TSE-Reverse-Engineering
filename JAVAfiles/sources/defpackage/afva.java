package defpackage;

import android.media.MediaMetadataRetriever;
import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class afva {
    private static final alvi a = alvi.m("com/google/android/libraries/compose/media/metadata/MediaMetadataRetrieverResolver");
    private final arwe b;

    public afva(arwe arweVar) {
        this.b = arweVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final Instant c(MediaMetadataRetriever mediaMetadataRetriever) {
        String extractMetadata = mediaMetadataRetriever.extractMetadata(5);
        if (extractMetadata == null) {
            return null;
        }
        try {
            return Instant.parse(extractMetadata);
        } catch (Exception e) {
            ((alvg) ((alvg) a.i()).g(e).h("com/google/android/libraries/compose/media/metadata/MediaMetadataRetrieverResolver", "extractDateModifiedFromMetadata", 35, "MediaMetadataRetrieverResolver.kt")).t("Unable to parse non-standard video date %s", extractMetadata);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final Duration d(MediaMetadataRetriever mediaMetadataRetriever) {
        String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
        if (extractMetadata != null) {
            Duration ofMillis = Duration.ofMillis(Long.parseLong(extractMetadata));
            ofMillis.getClass();
            return ofMillis;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public abstract afuy a(MediaMetadataRetriever mediaMetadataRetriever);

    public final Object b(arqr arqrVar, arpe arpeVar) {
        return arro.q(this.b.b(), new afov(arqrVar, this, (arpe) null, 3), arpeVar);
    }
}
