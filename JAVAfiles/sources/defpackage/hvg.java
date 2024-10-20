package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hvg implements hnm {
    @Override // defpackage.hmx
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, hnj hnjVar) {
        try {
            hyi.c(((hvf) ((hpt) obj).c()).b(), file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            }
            return false;
        }
    }

    @Override // defpackage.hnm
    public final int b() {
        return 1;
    }
}
