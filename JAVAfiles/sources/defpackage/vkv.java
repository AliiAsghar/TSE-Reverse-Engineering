package defpackage;

import android.os.Bundle;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vkv {
    public final vlm a;
    public final Optional b;
    private final Bundle c;
    private final boolean d;

    public vkv() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vkv) {
            vkv vkvVar = (vkv) obj;
            if (this.a.equals(vkvVar.a) && this.b.equals(vkvVar.b) && this.c.equals(vkvVar.c) && this.d == vkvVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        if (true != this.d) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (hashCode * 1000003) ^ i;
    }

    public final String toString() {
        Bundle bundle = this.c;
        Optional optional = this.b;
        return "NotificationData{notificationType=" + this.a.toString() + ", notificationTag=" + optional.toString() + ", notificationBundle=" + bundle.toString() + ", isSummaryNotification=" + this.d + "}";
    }

    public vkv(vlm vlmVar, Optional optional, Bundle bundle, boolean z) {
        if (vlmVar == null) {
            throw new NullPointerException("Null notificationType");
        }
        this.a = vlmVar;
        this.b = optional;
        if (bundle != null) {
            this.c = bundle;
            this.d = z;
            return;
        }
        throw new NullPointerException("Null notificationBundle");
    }
}
