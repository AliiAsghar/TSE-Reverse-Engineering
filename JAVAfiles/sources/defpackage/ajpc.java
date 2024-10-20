package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes4.dex */
public abstract class ajpc {
    public abstract ajpd a();

    public abstract aozb b();

    public final String toString() {
        return String.format("ChatMessage {%s}", TextUtils.join(",", Arrays.asList(String.format("content=%s", advq.MESSAGE_CONTENT.c(b())), String.format("contentType=%s", a()))));
    }
}
