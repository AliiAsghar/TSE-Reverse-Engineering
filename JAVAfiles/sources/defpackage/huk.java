package defpackage;

import android.graphics.Bitmap;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class huk implements htu {
    private final huj a;
    private final hyl b;

    public huk(huj hujVar, hyl hylVar) {
        this.a = hujVar;
        this.b = hylVar;
    }

    @Override // defpackage.htu
    public final void a(hqa hqaVar, Bitmap bitmap) {
        IOException iOException = this.b.c;
        if (iOException != null) {
            if (bitmap != null) {
                hqaVar.d(bitmap);
                throw iOException;
            }
            throw iOException;
        }
    }

    @Override // defpackage.htu
    public final void b() {
        this.a.a();
    }
}
