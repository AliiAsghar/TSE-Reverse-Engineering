package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hrq implements hsf {
    private final /* synthetic */ int a;
    private final Object b;

    public hrq(int i, byte[] bArr) {
        this.a = i;
        this.b = new hld();
    }

    @Override // defpackage.hsf
    public final hse b(hsj hsjVar) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return new hrp((Context) this.b, hsjVar.a(Integer.class, InputStream.class), 3);
                }
                return new hrp((Context) this.b, hsjVar.a(Integer.class, AssetFileDescriptor.class), 3);
            }
            return new hsi(1);
        }
        return new hru(this.b, 0);
    }

    public hrq(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
