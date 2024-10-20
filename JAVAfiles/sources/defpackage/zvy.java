package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zvy {
    public final alog a;
    public final boolean b;
    public final boolean c;

    public zvy() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zvy) {
            zvy zvyVar = (zvy) obj;
            if (alzz.at(this.a, zvyVar.a) && this.b == zvyVar.b && this.c == zvyVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() ^ 1000003;
        int i2 = 1237;
        if (true != this.b) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i3 = ((hashCode * 1000003) ^ i) * 1000003;
        if (true == this.c) {
            i2 = 1231;
        }
        return i3 ^ i2;
    }

    public final String toString() {
        return "SpamBannerLoadedData{spamParticipants=" + this.a.toString() + ", groupConversation=" + this.b + ", bannerEligible=" + this.c + "}";
    }

    public zvy(alog alogVar, boolean z, boolean z2) {
        if (alogVar == null) {
            throw new NullPointerException("Null spamParticipants");
        }
        this.a = alogVar;
        this.b = z;
        this.c = z2;
    }
}
