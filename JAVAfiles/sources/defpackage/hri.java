package defpackage;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hri implements hsf {
    private final /* synthetic */ int a;

    public hri(int i) {
        this.a = i;
    }

    @Override // defpackage.hsf
    public final hse b(hsj hsjVar) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return new hru(hsjVar.a(Uri.class, InputStream.class), 3);
                        }
                        return new hru(hsjVar.a(Uri.class, ParcelFileDescriptor.class), 3);
                    }
                    return new hru(hsjVar.a(Uri.class, AssetFileDescriptor.class), 3);
                }
                return new hrk();
            }
            return new hru(new hrh(1), 1);
        }
        return new hru(new hrh(0), 1);
    }
}
