package defpackage;

import android.net.Uri;
import j$.util.Optional;
import j$.util.OptionalLong;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xrz {
    public static final alwo a = alwo.o("BugleFileTransfer");
    public final Optional b;
    public final Optional c;
    public final Uri d;
    public final Optional e;
    public final OptionalLong f;
    public final Optional g;
    public final Optional h;

    public xrz() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xrz) {
            xrz xrzVar = (xrz) obj;
            if (this.b.equals(xrzVar.b) && this.c.equals(xrzVar.c) && this.d.equals(xrzVar.d) && this.e.equals(xrzVar.e) && this.f.equals(xrzVar.f) && this.g.equals(xrzVar.g) && this.h.equals(xrzVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        Optional optional = this.h;
        Optional optional2 = this.g;
        OptionalLong optionalLong = this.f;
        Optional optional3 = this.e;
        Uri uri = this.d;
        Optional optional4 = this.c;
        return "FileUploadInfo{audioDuration=" + String.valueOf(this.b) + ", contentType=" + String.valueOf(optional4) + ", contentUri=" + String.valueOf(uri) + ", fileName=" + String.valueOf(optional3) + ", fileSize=" + String.valueOf(optionalLong) + ", previewContentType=" + String.valueOf(optional2) + ", previewData=" + String.valueOf(optional) + "}";
    }

    public xrz(Optional optional, Optional optional2, Uri uri, Optional optional3, OptionalLong optionalLong, Optional optional4, Optional optional5) {
        this.b = optional;
        this.c = optional2;
        this.d = uri;
        this.e = optional3;
        this.f = optionalLong;
        this.g = optional4;
        this.h = optional5;
    }
}
