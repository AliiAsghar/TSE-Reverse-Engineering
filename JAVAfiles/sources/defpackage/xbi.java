package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xbi {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/sms/config/MmsSmsPreferenceUtils");
    public static final alhr b = uuh.x(211796674, "dont_allow_too_many_sms_parts_to_mms_upgrade");
    public final Context c;
    public final xbf d;
    public final yjy e;
    public final zxy f;
    private final Object g = new Object();
    private final HashMap h = new HashMap();
    private final zbl i;

    public xbi(Context context, xbf xbfVar, zxy zxyVar, yjy yjyVar, zbl zblVar) {
        this.c = context;
        this.d = xbfVar;
        this.f = zxyVar;
        this.e = yjyVar;
        this.i = zblVar;
    }

    public final int a(int i) {
        xbe a2 = this.d.a(i);
        if (((Boolean) ((utz) b.get()).e()).booleanValue() && !a2.r()) {
            return -1;
        }
        if (!a2.b.getBoolean("enableMultipartSMS", true) && !a2.t()) {
            return 1;
        }
        return a2.b.getInt("smsToMmsTextThreshold", -1);
    }

    public final zke b(int i) {
        zke zkeVar;
        synchronized (this.g) {
            HashMap hashMap = this.h;
            Integer valueOf = Integer.valueOf(i);
            zkeVar = (zke) hashMap.get(valueOf);
            if (zkeVar == null) {
                zkeVar = this.i.a(i);
                this.h.put(valueOf, zkeVar);
            }
        }
        return zkeVar;
    }

    public final boolean c(int i) {
        if (((Boolean) zke.a.e()).booleanValue()) {
            xbe a2 = this.d.a(i);
            zke b2 = b(i);
            if (!((Boolean) b2.e().orElse(Boolean.valueOf(a2.p()))).booleanValue()) {
                return false;
            }
            boolean booleanValue = ((Boolean) b2.f().orElse(Boolean.valueOf(a2.q()))).booleanValue();
            if (!this.e.h(i).F() || booleanValue) {
                return true;
            }
            return false;
        }
        Context context = this.c;
        xbf xbfVar = this.d;
        Resources resources = context.getResources();
        xbe a3 = xbfVar.a(i);
        ykw x = this.f.x(i);
        if (!x.q(resources.getString(R.string.auto_retrieve_mms_pref_key), a3.p())) {
            return false;
        }
        if (!this.e.h(i).F()) {
            return true;
        }
        return x.q(resources.getString(R.string.auto_retrieve_mms_when_roaming_pref_key), a3.q());
    }

    public final boolean d(int i) {
        xbe a2 = this.d.a(i);
        if (!a2.o()) {
            return false;
        }
        if (((Boolean) zke.a.e()).booleanValue()) {
            return ((Boolean) b(i).g().orElse(Boolean.valueOf(a2.n()))).booleanValue();
        }
        return this.f.x(i).q(this.c.getString(R.string.group_mms_pref_key), a2.n());
    }

    public final boolean e(int i) {
        if (((Boolean) zke.a.e()).booleanValue()) {
            return ((Boolean) b(i).k().orElse(Boolean.valueOf(this.d.a(i).w()))).booleanValue();
        }
        Context context = this.c;
        return this.f.x(i).q(context.getResources().getString(R.string.sms_encoding_pref_key), this.d.a(i).w());
    }
}
