package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aidh {
    public final alex a;
    public final alog b;

    public aidh() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aidh) {
            aidh aidhVar = (aidh) obj;
            if (this.a.equals(aidhVar.a) && alzz.at(this.b, aidhVar.b)) {
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
        return "EventData{systemProfile=" + this.a.toString() + ", eventRecords=" + alogVar.toString() + "}";
    }

    public aidh(alex alexVar, alog alogVar) {
        if (alexVar == null) {
            throw new NullPointerException("Null systemProfile");
        }
        this.a = alexVar;
        if (alogVar != null) {
            this.b = alogVar;
            return;
        }
        throw new NullPointerException("Null eventRecords");
    }
}
