package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajqx implements ajqz {
    public final String a;
    public final alog b;

    public ajqx() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajqx) {
            ajqx ajqxVar = (ajqx) obj;
            if (this.a.equals(ajqxVar.a) && alzz.at(this.b, ajqxVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ajqz
    public final void gU(ajqv ajqvVar) {
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "RbmSpamReport{rcsBotId=" + this.a + ", rcsMessageIds=" + String.valueOf(this.b) + "}";
    }

    public ajqx(String str, alog alogVar) {
        this.a = str;
        this.b = alogVar;
    }
}
