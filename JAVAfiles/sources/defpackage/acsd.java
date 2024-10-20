package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acsd {
    public static final acyz a = aczd.a(159445023);
    public final boolean b;
    public final boolean c;

    public acsd() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof acsd) {
            acsd acsdVar = (acsd) obj;
            if (this.b == acsdVar.b && this.c == acsdVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 1237;
        if (true != this.b) {
            i = 1237;
        } else {
            i = 1231;
        }
        if (true == this.c) {
            i2 = 1231;
        }
        return ((i ^ 1000003) * 1000003) ^ i2;
    }

    public final String toString() {
        return "FileUploadConfigurations{cleanupFileTransferAfterUploadCompletes=" + this.b + ", isFileTransferViaSmsSupported=" + this.c + "}";
    }

    public acsd(boolean z, boolean z2) {
        this.b = z;
        this.c = z2;
    }
}
