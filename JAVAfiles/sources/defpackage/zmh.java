package defpackage;

import android.graphics.drawable.Drawable;
import androidx.preference.SwitchPreferenceCompat;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zmh {
    public final zmj a;
    public final zmf b;
    public final lzv c;
    public final akbo d;
    public final Optional e;
    public final yio f;
    public final akvf g;
    public SwitchPreferenceCompat h;
    public Optional i;
    public final akgh j = new akgh<aabr>() { // from class: zmh.1
        @Override // defpackage.akgh
        public final void a(Throwable th) {
            SwitchPreferenceCompat switchPreferenceCompat = zmh.this.h;
            if (switchPreferenceCompat != null) {
                switchPreferenceCompat.G(true);
            }
        }

        @Override // defpackage.akgh
        public final /* bridge */ /* synthetic */ void c(Object obj) {
            if (zmh.this.h == null) {
            } else {
                throw null;
            }
        }

        @Override // defpackage.akgh
        public final /* synthetic */ void b() {
        }
    };
    public final akbp k = new akbp<Boolean, Void>() { // from class: zmh.2
        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
            Boolean bool = (Boolean) obj;
            SwitchPreferenceCompat switchPreferenceCompat = zmh.this.h;
            if (switchPreferenceCompat != null) {
                switchPreferenceCompat.G(true);
                zmh.this.h.k(!bool.booleanValue());
            }
        }

        @Override // defpackage.akbp
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            SwitchPreferenceCompat switchPreferenceCompat = zmh.this.h;
            if (switchPreferenceCompat != null) {
                switchPreferenceCompat.G(true);
            }
        }

        @Override // defpackage.akbp
        public final /* synthetic */ void b(Object obj) {
        }
    };
    public final aohs l;

    public zmh(zmf zmfVar, lzv lzvVar, aohs aohsVar, akbo akboVar, Optional optional, yio yioVar, akvf akvfVar, armf armfVar) {
        zmj zmjVar;
        this.b = zmfVar;
        this.c = lzvVar;
        this.l = aohsVar;
        this.d = akboVar;
        this.e = optional;
        this.f = yioVar;
        this.g = akvfVar;
        if (yig.b()) {
            zmjVar = ((zmk) armfVar.b()).a(zmfVar);
        } else {
            zmjVar = null;
        }
        this.a = zmjVar;
    }

    public final Drawable a(int i) {
        zmf zmfVar = this.b;
        return yfo.h(zmfVar.x(), i, ahnz.f(zmfVar.x(), R.attr.colorOnSurface, "SmartsSettingsFragmentPeer: failed to get color R.attr.colorOnSurfaceVariant"));
    }

    public final Optional b(int i) {
        zmf zmfVar = this.b;
        return Optional.ofNullable(zmfVar.a(zmfVar.S(i)));
    }
}
