package defpackage;

import androidx.core.graphics.drawable.IconCompat;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vli {
    public final vlh a;
    public final CharSequence b;
    public final int c;
    public final IconCompat d;
    public final Optional e;
    public final Optional f;
    public final Optional g;
    public final Optional h;
    public final Optional i;
    public final Optional j;
    public final Optional k;
    public final Optional l;
    public final Optional m;
    public final Optional n;
    public final Optional o;
    public final Optional p;
    public final Optional q;
    public final Optional r;
    private final Optional s;

    public vli() {
        throw null;
    }

    public static vlg a() {
        vlg vlgVar = new vlg(null);
        vlgVar.b(vlh.BASIC_STYLE);
        vlgVar.b = Optional.empty();
        vlgVar.c = Optional.empty();
        vlgVar.m = Optional.empty();
        vlgVar.o = Optional.empty();
        vlgVar.n = Optional.empty();
        vlgVar.f = Optional.empty();
        vlgVar.l = Optional.empty();
        vlgVar.i = Optional.empty();
        vlgVar.d = Optional.empty();
        vlgVar.e = Optional.empty();
        vlgVar.j = Optional.empty();
        vlgVar.h = Optional.empty();
        vlgVar.k = Optional.empty();
        vlgVar.g = Optional.empty();
        return vlgVar;
    }

    public static vlg b(vlq vlqVar, List list, CharSequence charSequence, Boolean bool) {
        vlg vlgVar = new vlg(null);
        vlgVar.b(vlh.MESSAGING_STYLE);
        vlgVar.b = Optional.empty();
        vlgVar.c = Optional.empty();
        vlgVar.i = Optional.of(vlqVar);
        vlgVar.g = Optional.of(alog.n(list));
        vlgVar.l = Optional.empty();
        vlgVar.o = Optional.empty();
        vlgVar.f = Optional.empty();
        vlgVar.p = Optional.empty();
        vlgVar.n = Optional.empty();
        vlgVar.d = Optional.empty();
        vlgVar.e = Optional.empty();
        vlgVar.j = Optional.of(charSequence);
        vlgVar.h = Optional.empty();
        vlgVar.k = Optional.of(bool);
        vlgVar.m = Optional.empty();
        return vlgVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vli) {
            vli vliVar = (vli) obj;
            if (this.a.equals(vliVar.a) && this.b.equals(vliVar.b) && this.c == vliVar.c && this.d.equals(vliVar.d) && this.e.equals(vliVar.e) && this.f.equals(vliVar.f) && this.g.equals(vliVar.g) && this.h.equals(vliVar.h) && this.i.equals(vliVar.i) && this.j.equals(vliVar.j) && this.s.equals(vliVar.s) && this.k.equals(vliVar.k) && this.l.equals(vliVar.l) && this.m.equals(vliVar.m) && this.n.equals(vliVar.n) && this.o.equals(vliVar.o) && this.p.equals(vliVar.p) && this.q.equals(vliVar.q) && this.r.equals(vliVar.r)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.s.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.p.hashCode()) * 1000003) ^ this.q.hashCode()) * 1000003) ^ this.r.hashCode();
    }

    public final String toString() {
        Optional optional = this.r;
        Optional optional2 = this.q;
        Optional optional3 = this.p;
        Optional optional4 = this.o;
        Optional optional5 = this.n;
        Optional optional6 = this.m;
        Optional optional7 = this.l;
        Optional optional8 = this.k;
        Optional optional9 = this.s;
        Optional optional10 = this.j;
        Optional optional11 = this.i;
        Optional optional12 = this.h;
        Optional optional13 = this.g;
        Optional optional14 = this.f;
        Optional optional15 = this.e;
        IconCompat iconCompat = this.d;
        CharSequence charSequence = this.b;
        return "NotificationStyleInfo{notificationStyle=" + String.valueOf(this.a) + ", titleText=" + String.valueOf(charSequence) + ", smallIconColor=" + this.c + ", smallIcon=" + String.valueOf(iconCompat) + ", contentTextV2=" + String.valueOf(optional15) + ", largeIconUri=" + String.valueOf(optional14) + ", ticker=" + String.valueOf(optional13) + ", subText=" + String.valueOf(optional12) + ", expandedContentText=" + String.valueOf(optional11) + ", messages=" + String.valueOf(optional10) + ", conversationInfo=" + String.valueOf(optional9) + ", userInfo=" + String.valueOf(optional8) + ", conversationTitle=" + String.valueOf(optional7) + ", isGroupConversation=" + String.valueOf(optional6) + ", lines=" + String.valueOf(optional5) + ", bigPictureUri=" + String.valueOf(optional4) + ", bigPictureAttachmentType=" + String.valueOf(optional3) + ", expandedLargeIconUri=" + String.valueOf(optional2) + ", expandedTitleText=" + String.valueOf(optional) + "}";
    }

    public vli(vlh vlhVar, CharSequence charSequence, int i, IconCompat iconCompat, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6, Optional optional7, Optional optional8, Optional optional9, Optional optional10, Optional optional11, Optional optional12, Optional optional13, Optional optional14, Optional optional15) {
        this.a = vlhVar;
        this.b = charSequence;
        this.c = i;
        this.d = iconCompat;
        this.e = optional;
        this.f = optional2;
        this.g = optional3;
        this.h = optional4;
        this.i = optional5;
        this.j = optional6;
        this.s = optional7;
        this.k = optional8;
        this.l = optional9;
        this.m = optional10;
        this.n = optional11;
        this.o = optional12;
        this.p = optional13;
        this.q = optional14;
        this.r = optional15;
    }
}
