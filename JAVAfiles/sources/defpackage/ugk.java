package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ugk extends ufr {
    private final yfo g;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        yfo gi();
    }

    public ugk(Context context, ugi ugiVar) {
        super(context, ugiVar);
        this.g = ((a) akec.w(context, a.class)).gi();
    }

    @Override // defpackage.ufr
    protected final InputStream e() {
        return null;
    }

    @Override // defpackage.ufr
    protected final Bitmap g() {
        Bitmap bitmap;
        ugi ugiVar = (ugi) this.b;
        Uri a2 = ugiVar.a();
        if (a2 != null) {
            bitmap = this.g.e(a2, ugiVar.b, ugiVar.c);
        } else {
            bitmap = null;
        }
        if (bitmap != null) {
            this.b.b(bitmap.getWidth(), bitmap.getHeight());
        }
        return bitmap;
    }

    @Override // defpackage.ufr
    protected final boolean n() {
        return true;
    }
}
