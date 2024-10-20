package defpackage;

import android.media.MediaMetadataRetriever;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afvb extends afva {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afvb(arwe arweVar) {
        super(arweVar);
        arweVar.getClass();
    }

    @Override // defpackage.afva
    public final /* bridge */ /* synthetic */ afuy a(MediaMetadataRetriever mediaMetadataRetriever) {
        int i;
        String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
        if (extractMetadata != null) {
            int parseInt = Integer.parseInt(extractMetadata);
            if (parseInt > 0) {
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                if (extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata2);
                    if (parseInt2 > 0) {
                        String extractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                        if (extractMetadata3 != null) {
                            i = Integer.parseInt(extractMetadata3);
                        } else {
                            i = 0;
                        }
                        return new afux(c(mediaMetadataRetriever), aeke.bq(new Size(parseInt, parseInt2), i), d(mediaMetadataRetriever));
                    }
                    throw new IllegalArgumentException("Video height resolved to non positive value.");
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Video width resolved to non positive value.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
