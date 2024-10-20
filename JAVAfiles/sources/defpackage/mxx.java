package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mxx implements mym {
    public final alog a;

    public mxx() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mxx) {
            return alzz.at(this.a, ((mxx) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @Override // defpackage.mym
    public final /* synthetic */ String j() {
        return "text/plain";
    }

    public final String toString() {
        return "BugleTombstoneContent{lines=" + String.valueOf(this.a) + "}";
    }

    public mxx(alog alogVar) {
        this.a = alogVar;
    }
}
