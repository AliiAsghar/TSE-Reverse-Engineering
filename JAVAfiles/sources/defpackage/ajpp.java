package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes4.dex */
public abstract class ajpp {
    public abstract String a();

    public abstract String b();

    public abstract String c();

    public final String toString() {
        return String.format("MessageExtensionHeader {%s}", TextUtils.join(",", Arrays.asList(String.format("namespace=%s", b()), String.format("name=%s", advq.GENERIC.c(a())), String.format("value=%s", advq.GENERIC.c(c())))));
    }
}
