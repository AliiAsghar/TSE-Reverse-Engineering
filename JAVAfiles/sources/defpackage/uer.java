package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uer extends ueq {
    public uer(Uri uri, int i, int i2) {
        super(null, uri, null, i, i2, -1, -1, false);
    }

    @Override // defpackage.ugi
    public final ufw d(Context context, int i) {
        ufr ugkVar;
        if (c()) {
            ugkVar = new ugh(context, this);
        } else {
            ugkVar = new ugk(context, this);
        }
        ugkVar.f = i;
        return ugkVar;
    }
}
