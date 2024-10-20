package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vke {
    public final vkf a;
    public final Bundle b;
    public final boolean c;
    public final CharSequence d;
    public final boolean e;
    public final boolean f;
    public final Optional g;
    public final Optional h;
    public final Optional i;
    public final Optional j;
    public final Optional k;
    public final Optional l;

    public vke() {
        throw null;
    }

    public static vkd a(vkf vkfVar, IconCompat iconCompat, CharSequence charSequence, Optional optional) {
        vkd vkdVar = new vkd(null);
        vkdVar.b(vkfVar);
        vkdVar.c = Optional.of(iconCompat);
        vkdVar.g(charSequence);
        vkdVar.c((Bundle) optional.orElse(new Bundle()));
        vkdVar.a = Optional.empty();
        vkdVar.b = Optional.empty();
        vkdVar.f(false);
        vkdVar.f = Optional.empty();
        vkdVar.d = Optional.empty();
        vkdVar.e(false);
        vkdVar.d(false);
        vkdVar.e = Optional.of(0);
        return vkdVar;
    }

    public static vkd b(vkf vkfVar, IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Optional optional) {
        vkd vkdVar = new vkd(null);
        vkdVar.b(vkfVar);
        vkdVar.a = Optional.of(pendingIntent);
        vkdVar.c((Bundle) optional.orElse(new Bundle()));
        vkdVar.c = Optional.of(iconCompat);
        vkdVar.g(charSequence);
        vkdVar.b = Optional.empty();
        vkdVar.f = Optional.empty();
        vkdVar.f(false);
        vkdVar.d = Optional.empty();
        vkdVar.e(false);
        vkdVar.d(false);
        vkdVar.e = Optional.of(0);
        return vkdVar;
    }

    public static vke c(vkf vkfVar, dyk dykVar, Optional optional) {
        vkd vkdVar = new vkd(null);
        vkdVar.b(vkfVar);
        vkdVar.c((Bundle) optional.orElse(new Bundle()));
        vkdVar.c = Optional.ofNullable(dykVar.a());
        vkdVar.g(dykVar.h);
        vkdVar.b = Optional.empty();
        vkdVar.f = Optional.empty();
        vkdVar.f(false);
        vkdVar.e(false);
        vkdVar.d(false);
        vkdVar.e = Optional.of(0);
        vkdVar.d = Optional.of(Boolean.valueOf(dykVar.c));
        dzw[] dzwVarArr = dykVar.b;
        if (dzwVarArr != null) {
            vkdVar.f = Optional.of(dzwVarArr);
        } else {
            vkdVar.f = Optional.empty();
        }
        PendingIntent pendingIntent = dykVar.i;
        if (pendingIntent != null) {
            vkdVar.a = Optional.of(pendingIntent);
        }
        vkdVar.e = Optional.of(Integer.valueOf(dykVar.e));
        return vkdVar.a();
    }

    public static vkd d(vkf vkfVar, IconCompat iconCompat, CharSequence charSequence, Intent intent, boolean z) {
        vkd vkdVar = new vkd(null);
        vkdVar.b(vkfVar);
        vkdVar.a = Optional.empty();
        vkdVar.b = Optional.of(intent);
        vkdVar.c = Optional.of(iconCompat);
        vkdVar.g(charSequence);
        vkdVar.f(false);
        vkdVar.f = Optional.empty();
        vkdVar.d = Optional.empty();
        vkdVar.c(new Bundle());
        vkdVar.e(true);
        vkdVar.d(z);
        vkdVar.e = Optional.of(0);
        return vkdVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vke) {
            vke vkeVar = (vke) obj;
            if (this.a.equals(vkeVar.a) && this.b.equals(vkeVar.b) && this.c == vkeVar.c && this.d.equals(vkeVar.d) && this.e == vkeVar.e && this.f == vkeVar.f && this.g.equals(vkeVar.g) && this.h.equals(vkeVar.h) && this.i.equals(vkeVar.i) && this.j.equals(vkeVar.j) && this.k.equals(vkeVar.k) && this.l.equals(vkeVar.l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        int i3 = 1237;
        if (true != this.c) {
            i = 1237;
        } else {
            i = 1231;
        }
        int hashCode2 = ((((hashCode * 1000003) ^ i) * 1000003) ^ this.d.hashCode()) * 1000003;
        if (true != this.e) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        int i4 = (hashCode2 ^ i2) * 1000003;
        if (true == this.f) {
            i3 = 1231;
        }
        return ((((((((((((i4 ^ i3) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode();
    }

    public final String toString() {
        Optional optional = this.l;
        Optional optional2 = this.k;
        Optional optional3 = this.j;
        Optional optional4 = this.i;
        Optional optional5 = this.h;
        Optional optional6 = this.g;
        CharSequence charSequence = this.d;
        Bundle bundle = this.b;
        return "NotificationActionInfo{actionType=" + String.valueOf(this.a) + ", callbackBundle=" + String.valueOf(bundle) + ", shouldAddParentStack=" + this.c + ", title=" + String.valueOf(charSequence) + ", openActivityOnWear=" + this.e + ", isMainActivityWearAction=" + this.f + ", intentToRun=" + String.valueOf(optional6) + ", activityIntent=" + String.valueOf(optional5) + ", icon=" + String.valueOf(optional4) + ", allowGeneratedReplies=" + String.valueOf(optional3) + ", semanticAction=" + String.valueOf(optional2) + ", remoteInputs=" + String.valueOf(optional) + "}";
    }

    public vke(vkf vkfVar, Bundle bundle, boolean z, CharSequence charSequence, boolean z2, boolean z3, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6) {
        this.a = vkfVar;
        this.b = bundle;
        this.c = z;
        this.d = charSequence;
        this.e = z2;
        this.f = z3;
        this.g = optional;
        this.h = optional2;
        this.i = optional3;
        this.j = optional4;
        this.k = optional5;
        this.l = optional6;
    }
}
