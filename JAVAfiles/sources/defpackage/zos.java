package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zos {
    public final alor a;
    public final alog b;
    public final int c;
    public final int d;

    public zos() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        return ((altc) this.a).d + (!this.b.isEmpty() ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zos) {
            zos zosVar = (zos) obj;
            if (alzz.am(this.a, zosVar.a) && alzz.at(this.b, zosVar.b) && this.c == zosVar.c && this.d == zosVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d;
    }

    public final String toString() {
        return "AttachmentsPosition{positionToSingleAttachments=" + alzz.ai(this.a) + ", googlePhotosAttachments=" + String.valueOf(this.b) + ", googlePhotosPosition=" + this.c + ", googlePhotosUploadStateHash=" + this.d + "}";
    }

    public zos(alor alorVar, alog alogVar, int i, int i2) {
        this.a = alorVar;
        if (alogVar == null) {
            throw new NullPointerException("Null googlePhotosAttachments");
        }
        this.b = alogVar;
        this.c = i;
        this.d = i2;
    }
}
