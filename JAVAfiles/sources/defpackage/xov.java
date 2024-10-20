package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xov {
    public final Optional a;
    public final Optional b;

    public xov() {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    public final boolean a() {
        boolean z;
        if (this.a.isPresent() && this.a.get().ab().isPresent()) {
            z = true;
        } else {
            z = false;
        }
        if (this.b.isPresent() && z) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xov) {
            xov xovVar = (xov) obj;
            if (this.a.equals(xovVar.a) && this.b.equals(xovVar.b)) {
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
        return "FileTransferMessageCoreData{messageCoreData=" + String.valueOf(this.a) + ", fileTransferBindData=" + String.valueOf(optional) + "}";
    }

    public xov(Optional optional, Optional optional2) {
        this.a = optional;
        this.b = optional2;
    }
}
