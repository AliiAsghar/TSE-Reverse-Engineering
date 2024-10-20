package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xqd extends xqf {
    private final MessageCoreData a;

    public xqd(MessageCoreData messageCoreData) {
        this.a = messageCoreData;
    }

    @Override // defpackage.xqf, defpackage.xre
    public final MessageCoreData a() {
        return this.a;
    }

    @Override // defpackage.xre
    public final int b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xre) {
            xre xreVar = (xre) obj;
            if (xreVar.b() == 1 && this.a.equals(xreVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MessageCoreDataOrWorkQueueResult{messageCoreData=" + this.a.toString() + "}";
    }
}
