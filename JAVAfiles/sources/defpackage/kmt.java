package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kmt implements aknc {
    public final Context a;
    private final mbl b;

    public kmt(Context context, mbl mblVar) {
        this.a = context;
        this.b = mblVar;
    }

    @Override // defpackage.aknc
    public final aknb a(akmy akmyVar) {
        Uri data = ((Intent) akmyVar.a).getData();
        if (data != null) {
            if (("https".equals(data.getScheme()) || "http".equals(data.getScheme())) && "messages.google.com".equals(data.getHost()) && "/install".equals(data.getPath())) {
                this.b.c("Bugle.Deeplink.Uace.Campaigns");
                return new kms(this);
            }
            return null;
        }
        return null;
    }
}
