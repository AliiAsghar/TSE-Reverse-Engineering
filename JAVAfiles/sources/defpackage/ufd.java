package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ufd extends ugi {
    final xvc a;

    public ufd(xvc xvcVar, Uri uri, int i, int i2, boolean z) {
        this(xvcVar, uri, i, i2, z, 0);
    }

    @Override // defpackage.ugi, defpackage.ufs, defpackage.ufx
    public final ufw f(Context context) {
        String j;
        Uri uri = this.k;
        if (uri == null) {
            j = null;
        } else {
            j = xvc.j(uri);
        }
        if ("s".equals(j)) {
            return new ufe(context, this.a, this);
        }
        if (uri != null && (ydk.v(uri) || xvc.p(context, uri))) {
            return new ufc(context, this.a, this);
        }
        return new ugd(context, this);
    }

    public ufd(xvc xvcVar, Uri uri, int i, int i2, boolean z, int i3) {
        super(uri, i, i2, true, z, i3);
        this.a = xvcVar;
    }
}
