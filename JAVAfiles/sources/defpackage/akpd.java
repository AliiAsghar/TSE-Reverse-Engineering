package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akpd {
    public final akpe a;
    public final ListenableFuture b;

    public akpd() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akpd) {
            akpd akpdVar = (akpd) obj;
            if (this.a.equals(akpdVar.a) && this.b.equals(akpdVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ListenableFuture listenableFuture = this.b;
        return "MonitorReport{monitor=" + this.a.toString() + ", startReport=" + String.valueOf(listenableFuture) + "}";
    }

    public akpd(akpe akpeVar, ListenableFuture listenableFuture) {
        this.a = akpeVar;
        this.b = listenableFuture;
    }
}
