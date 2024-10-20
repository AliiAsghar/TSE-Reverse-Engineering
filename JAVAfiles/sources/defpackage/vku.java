package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vku {
    public final alog a;
    public final Optional b;

    public vku() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vku) {
            vku vkuVar = (vku) obj;
            if (alzz.at(this.a, vkuVar.a) && this.b.equals(vkuVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Optional optional = this.b;
        return "NotificationCreationPackage{notificationBuilderInfos=" + this.a.toString() + ", summaryBuilderInfo=" + optional.toString() + "}";
    }

    public vku(alog alogVar, Optional optional) {
        if (alogVar == null) {
            throw new NullPointerException("Null notificationBuilderInfos");
        }
        this.a = alogVar;
        this.b = optional;
    }
}
