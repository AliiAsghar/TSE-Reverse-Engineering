package defpackage;

import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pwt {
    public final UrlResponseInfo a;
    private final aozb b;

    public pwt() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pwt) {
            pwt pwtVar = (pwt) obj;
            if (this.a.equals(pwtVar.a) && this.b.equals(pwtVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        aozb aozbVar = this.b;
        return "HttpResponse{urlResponseInfo=" + this.a.toString() + ", responseBody=" + aozbVar.toString() + "}";
    }

    public pwt(UrlResponseInfo urlResponseInfo, aozb aozbVar) {
        if (urlResponseInfo == null) {
            throw new NullPointerException("Null urlResponseInfo");
        }
        this.a = urlResponseInfo;
        if (aozbVar != null) {
            this.b = aozbVar;
            return;
        }
        throw new NullPointerException("Null responseBody");
    }
}
