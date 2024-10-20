package defpackage;

import android.text.TextUtils;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import j$.util.Optional;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajqg {
    public final String a;
    public final RcsDestinationId b;
    public final Optional c;
    public final ajqf d;
    public final Optional e;
    public final Optional f;

    public ajqg() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajqg) {
            ajqg ajqgVar = (ajqg) obj;
            if (this.a.equals(ajqgVar.a) && this.b.equals(ajqgVar.b) && this.c.equals(ajqgVar.c) && this.d.equals(ajqgVar.d) && this.e.equals(ajqgVar.e) && this.f.equals(ajqgVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        return String.format("FileMessage {%s}", TextUtils.join(",", Arrays.asList(String.format("id=%s", this.a), String.format("sender=%s", advq.PHONE_NUMBER.c(this.b)), String.format("receiver=%s", advq.PHONE_NUMBER.c(this.c)), String.format("contents=%s", this.d), String.format("sentTime=%s", this.e), String.format("dispositionNotifications=%s", this.f))));
    }

    public ajqg(String str, RcsDestinationId rcsDestinationId, Optional optional, ajqf ajqfVar, Optional optional2, Optional optional3) {
        this.a = str;
        this.b = rcsDestinationId;
        this.c = optional;
        this.d = ajqfVar;
        this.e = optional2;
        this.f = optional3;
    }
}
