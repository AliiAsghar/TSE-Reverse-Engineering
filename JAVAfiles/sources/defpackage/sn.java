package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sn extends se {
    @Override // defpackage.se
    public final /* bridge */ /* synthetic */ Intent a(Context context, Object obj) {
        Uri uri = (Uri) obj;
        uri.getClass();
        Intent putExtra = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", uri);
        putExtra.getClass();
        return putExtra;
    }

    @Override // defpackage.se
    public final /* bridge */ /* synthetic */ Object b(int i, Intent intent) {
        boolean z;
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.se
    public final /* bridge */ /* synthetic */ efu c(Context context, Object obj) {
        ((Uri) obj).getClass();
        return null;
    }
}
