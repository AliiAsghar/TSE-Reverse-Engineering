package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hst implements hsf {
    private final Context a;
    private final Class b;

    public hst(Context context, Class cls) {
        this.a = context;
        this.b = cls;
    }

    @Override // defpackage.hsf
    public final hse b(hsj hsjVar) {
        Class cls = this.b;
        return new hsv(this.a, hsjVar.a(File.class, cls), hsjVar.a(Uri.class, cls), cls);
    }
}
