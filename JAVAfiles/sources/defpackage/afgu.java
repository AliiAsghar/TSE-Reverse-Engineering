package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afgu extends sf {
    private final Duration a;

    public afgu(Duration duration) {
        this.a = duration;
    }

    @Override // defpackage.sf, defpackage.se
    public final /* bridge */ /* synthetic */ Intent a(Context context, Object obj) {
        return a(context, (Uri) obj);
    }

    @Override // defpackage.sf
    /* renamed from: d */
    public final Intent a(Context context, Uri uri) {
        uri.getClass();
        Duration duration = this.a;
        Intent a = super.a(context, uri);
        a.putExtra("android.intent.extra.durationLimit", (int) duration.getSeconds());
        return a;
    }
}
