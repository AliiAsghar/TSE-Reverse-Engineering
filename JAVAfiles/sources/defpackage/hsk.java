package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hsk implements hsf {
    private final /* synthetic */ int a;
    private final Object b;

    public hsk(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.hsf
    public final hse b(hsj hsjVar) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return new hru((Context) this.b, 5, (char[]) null);
                            }
                            return new hru((Context) this.b, 4, (byte[]) null);
                        }
                        return new hss((hgi) this.b);
                    }
                    return new hrp(this.b, hsi.a, 2);
                }
                return new hrp(this.b, hsjVar.a(Uri.class, InputStream.class), 2);
            }
            return new hru(this.b, 2);
        }
        return new hrp(this.b, hsjVar.a(Uri.class, AssetFileDescriptor.class), 2);
    }

    public hsk(int i) {
        this.a = i;
        this.b = new hgi(500L);
    }
}
