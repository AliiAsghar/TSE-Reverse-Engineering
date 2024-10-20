package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ufk extends ugi {
    public ufk(Uri uri, int i, int i2) {
        super(uri, i, i2, true, false, 0);
    }

    @Override // defpackage.ugi, defpackage.ufs, defpackage.ufx
    public final ufw f(Context context) {
        return new ufi(context, this, this.b);
    }
}
