package defpackage;

import android.net.Uri;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vkr {
    public final String a;
    public final String b;
    public final Uri c;
    public final Optional d;
    public final Optional e;
    public final Optional f;
    public final Optional g;
    public final Optional h;
    public final Optional i;
    public final int j;

    public vkr() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vkr) {
            vkr vkrVar = (vkr) obj;
            if (this.a.equals(vkrVar.a) && this.b.equals(vkrVar.b)) {
                int i = this.j;
                int i2 = vkrVar.j;
                if (i != 0) {
                    if (i == i2 && this.c.equals(vkrVar.c) && this.d.equals(vkrVar.d) && this.e.equals(vkrVar.e) && this.f.equals(vkrVar.f) && this.g.equals(vkrVar.g) && this.h.equals(vkrVar.h) && this.i.equals(vkrVar.i)) {
                        return true;
                    }
                } else {
                    throw null;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        int i = this.j;
        a.aS(i);
        return (((((((((((((((hashCode * 1000003) ^ i) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    public final String toString() {
        String str;
        int i = this.j;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            str = "null";
                        } else {
                            str = "IMPORTANCE_HIGH";
                        }
                    } else {
                        str = "IMPORTANCE_DEFAULT";
                    }
                } else {
                    str = "IMPORTANCE_LOW";
                }
            } else {
                str = "IMPORTANCE_MIN";
            }
        } else {
            str = "IMPORTANCE_NONE";
        }
        String str2 = this.b;
        String str3 = this.a;
        Uri uri = this.c;
        Optional optional = this.d;
        Optional optional2 = this.e;
        Optional optional3 = this.f;
        Optional optional4 = this.g;
        Optional optional5 = this.h;
        Optional optional6 = this.i;
        return "NotificationChannelBuilderInfo{channelId=" + str3 + ", channelName=" + str2 + ", importance=" + str + ", soundUri=" + String.valueOf(uri) + ", areLightsEnabled=" + String.valueOf(optional) + ", isVibrationEnabled=" + String.valueOf(optional2) + ", shouldShowBadge=" + String.valueOf(optional3) + ", vibrationPattern=" + String.valueOf(optional4) + ", lightColor=" + String.valueOf(optional5) + ", group=" + String.valueOf(optional6) + "}";
    }

    public vkr(String str, String str2, Uri uri, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6) {
        this.a = str;
        this.b = str2;
        this.j = 5;
        this.c = uri;
        this.d = optional;
        this.e = optional2;
        this.f = optional3;
        this.g = optional4;
        this.h = optional5;
        this.i = optional6;
    }
}
