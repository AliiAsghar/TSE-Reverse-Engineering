package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uzu {
    public final alog a;
    public final alog b;

    public uzu() {
        throw null;
    }

    public final alog a() {
        alob alobVar = new alob();
        alobVar.j(this.b);
        alobVar.j(this.a);
        return alobVar.g();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uzu) {
            uzu uzuVar = (uzu) obj;
            if (alzz.at(this.a, uzuVar.a) && alzz.at(this.b, uzuVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        alog alogVar = this.b;
        return "MessagesToDeleteContainer{nonCloudSyncMessagesToDelete=" + String.valueOf(this.a) + ", cloudSyncMessagesToDelete=" + String.valueOf(alogVar) + "}";
    }

    public uzu(alog alogVar, alog alogVar2) {
        this.a = alogVar;
        this.b = alogVar2;
    }
}
