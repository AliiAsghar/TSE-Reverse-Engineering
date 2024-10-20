package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vkn {
    public final Optional a;
    public final Optional b;
    public final Optional c;
    public final vli d;
    public final vlb e;
    public final Optional f;
    public final Optional g;
    public final boolean h;
    public final boolean i;
    public final Optional j;
    public final Optional k;
    public final boolean l;
    public final Optional m;

    public vkn() {
        throw null;
    }

    public static vkm a() {
        vkm vkmVar = new vkm(null);
        vkmVar.a = Optional.empty();
        vkmVar.f(Optional.empty());
        vkmVar.d(Optional.empty());
        vkmVar.h(false);
        vkmVar.b = Optional.of(1);
        vkmVar.e(Optional.empty());
        vkmVar.c = Optional.empty();
        vkmVar.i(true);
        vkmVar.b(true);
        vkmVar.j(Optional.empty());
        return vkmVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vkn) {
            vkn vknVar = (vkn) obj;
            if (this.a.equals(vknVar.a) && this.b.equals(vknVar.b) && this.c.equals(vknVar.c) && this.d.equals(vknVar.d) && this.e.equals(vknVar.e) && this.f.equals(vknVar.f) && this.g.equals(vknVar.g) && this.h == vknVar.h && this.i == vknVar.i && this.j.equals(vknVar.j) && this.k.equals(vknVar.k) && this.l == vknVar.l && this.m.equals(vknVar.m)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
        int i3 = 1237;
        if (true != this.h) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i4 = ((hashCode * 1000003) ^ i) * 1000003;
        if (true != this.i) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        int hashCode2 = (((((i4 ^ i2) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003;
        if (true == this.l) {
            i3 = 1231;
        }
        return ((hashCode2 ^ i3) * 1000003) ^ this.m.hashCode();
    }

    public final String toString() {
        Optional optional = this.m;
        Optional optional2 = this.k;
        Optional optional3 = this.j;
        Optional optional4 = this.g;
        Optional optional5 = this.f;
        vlb vlbVar = this.e;
        vli vliVar = this.d;
        Optional optional6 = this.c;
        Optional optional7 = this.b;
        return "NotificationBuilderInfo{notificationTag=" + String.valueOf(this.a) + ", notificationExtras=" + String.valueOf(optional7) + ", conversationSpecificInfo=" + String.valueOf(optional6) + ", notificationStyleInfo=" + String.valueOf(vliVar) + ", clickInteractionInfo=" + String.valueOf(vlbVar) + ", swipeInteractionInfo=" + String.valueOf(optional5) + ", numberPerNotification=" + String.valueOf(optional4) + ", shouldBridgeNotificationToOtherDevices=" + this.h + ", allowSystemGeneratedActions=" + this.i + ", notificationActions=" + String.valueOf(optional3) + ", wearableSpecificNotificationInfo=" + String.valueOf(optional2) + ", shouldAlert=" + this.l + ", eventTime=" + String.valueOf(optional) + "}";
    }

    public vkn(Optional optional, Optional optional2, Optional optional3, vli vliVar, vlb vlbVar, Optional optional4, Optional optional5, boolean z, boolean z2, Optional optional6, Optional optional7, boolean z3, Optional optional8) {
        this.a = optional;
        this.b = optional2;
        this.c = optional3;
        this.d = vliVar;
        this.e = vlbVar;
        this.f = optional4;
        this.g = optional5;
        this.h = z;
        this.i = z2;
        this.j = optional6;
        this.k = optional7;
        this.l = z3;
        this.m = optional8;
    }
}
