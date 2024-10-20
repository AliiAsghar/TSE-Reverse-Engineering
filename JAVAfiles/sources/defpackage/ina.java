package defpackage;

import android.net.Uri;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ina {
    public String a;
    public Uri b;
    public ameb c;
    public Size d;
    public String e;
    public Uri f;

    public final void a(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null contentType");
    }
}
