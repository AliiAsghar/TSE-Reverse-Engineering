package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xss {
    public final rve a;
    public final Optional b;
    public final Optional c;
    public final qeq d;

    public xss() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xss) {
            xss xssVar = (xss) obj;
            if (this.a.equals(xssVar.a) && this.b.equals(xssVar.b) && this.c.equals(xssVar.c) && this.d.equals(xssVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        qeq qeqVar = this.d;
        Optional optional = this.c;
        Optional optional2 = this.b;
        return "SendFileTransferResponse{rcsMessageId=" + String.valueOf(this.a) + ", fallbackUriString=" + String.valueOf(optional2) + ", expiry=" + String.valueOf(optional) + ", fileUploadResponse=" + String.valueOf(qeqVar) + "}";
    }

    public xss(rve rveVar, Optional optional, Optional optional2, qeq qeqVar) {
        this.a = rveVar;
        this.b = optional;
        this.c = optional2;
        this.d = qeqVar;
    }
}
