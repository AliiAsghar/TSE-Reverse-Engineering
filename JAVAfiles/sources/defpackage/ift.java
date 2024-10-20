package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ift {
    public final String a;
    public final Uri b;
    public final String c;
    public final arqv d;
    private final armf e;

    public ift(String str, Uri uri, armf armfVar, String str2, arqv arqvVar) {
        this.a = str;
        this.b = uri;
        this.e = armfVar;
        this.c = str2;
        this.d = arqvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ift)) {
            return false;
        }
        ift iftVar = (ift) obj;
        if (d.F(this.a, iftVar.a) && d.F(this.b, iftVar.b) && d.F(this.e, iftVar.e) && d.F(this.c, iftVar.c) && d.F(this.d, iftVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        Uri uri = this.b;
        if (uri != null) {
            i = uri.hashCode();
        }
        return (((((((hashCode * 31) + i) * 31) + this.e.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "BlockedParticipantListItemUiData(normalizedDestination=" + this.a + ", avatarUri=" + this.b + ", imageManagerProvider=" + this.e + ", displayName=" + this.c + ", unblockAction=" + this.d + ")";
    }
}
