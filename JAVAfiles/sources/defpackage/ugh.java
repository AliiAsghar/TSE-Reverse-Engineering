package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ugh extends ufr {
    public ugh(Context context, ugi ugiVar) {
        super(context, ugiVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ufr
    public ufu b(List list) {
        ufw g;
        akrh e = aktp.e("UriImageRequest.loadMediaInternal");
        try {
            ufu b = super.b(list);
            if (((ugi) this.b).l && (g = b.g(this)) != null) {
                list.add(g);
                if (b instanceof ufh) {
                    ((ufh) b).b = false;
                }
            }
            e.close();
            return b;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ufr
    public InputStream e() {
        Uri a = ((ugi) this.b).a();
        if (a != null) {
            return this.a.getContentResolver().openInputStream(a);
        }
        return null;
    }
}
