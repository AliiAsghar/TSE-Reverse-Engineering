package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes4.dex */
public abstract class ajpo {
    public abstract ajpn a();

    public abstract ajpu b();

    public abstract alog c();

    public abstract Optional d();

    public abstract Optional e();

    public abstract String f();

    public final String toString() {
        return String.format("Message {%s}", TextUtils.join(",", Arrays.asList(String.format("id=%s", f()), String.format("sender=%s", advq.PHONE_NUMBER.c(b())), String.format("contents=%s", advq.MESSAGE_CONTENT.c(a())), String.format("sentTime=%s", e()), String.format("receiver=%s", advq.PHONE_NUMBER.c(d())), String.format("extensionHeaders=%s", c()))));
    }
}
