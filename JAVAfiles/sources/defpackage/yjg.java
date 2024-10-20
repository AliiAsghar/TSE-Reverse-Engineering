package defpackage;

import android.app.AlarmManager;
import android.content.Context;
import android.os.Build;
import j$.util.DesugarCollections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yjg implements yjf {
    private static final xze a = xze.g("Bugle", "PermissionCheckerImpl");
    private final Context b;
    private final Map c = DesugarCollections.synchronizedMap(new tm());

    public yjg(Context context) {
        this.b = context;
    }

    private final boolean q() {
        if (!p(new String[]{"android.permission.READ_MEDIA_IMAGES"}) && !r()) {
            return false;
        }
        return true;
    }

    private final boolean r() {
        if (!yhx.h) {
            return false;
        }
        return p(new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED"});
    }

    private final boolean s() {
        if (!p(new String[]{"android.permission.READ_MEDIA_VIDEO"}) && !r()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.yjf
    public final boolean a() {
        return p(yji.l);
    }

    @Override // defpackage.yjf
    public final boolean b() {
        if (!yhx.h) {
            return p(yji.d);
        }
        if (p(yji.c) && q() && s()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.yjf
    public final boolean c() {
        if (!yhx.h) {
            return p(yji.e);
        }
        if (p(yji.c) && q()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.yjf
    public final boolean d() {
        if (!yhx.h) {
            return p(yji.f);
        }
        if (p(yji.c) && s()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.yjf
    public final boolean e() {
        return o("com.cequint.ecid.CALLER_ID_EXTERNAL_LOOKUP_SMS");
    }

    @Override // defpackage.yjf
    public final boolean f() {
        return p(yji.i);
    }

    @Override // defpackage.yjf
    public final boolean g() {
        return p(yji.g);
    }

    @Override // defpackage.yjf
    public final boolean h() {
        if ("com.google.android.ims".equals(this.b.getPackageName())) {
            return true;
        }
        return p(yji.p);
    }

    @Override // defpackage.yjf
    public final boolean i() {
        return p(yji.j);
    }

    @Override // defpackage.yjf
    public final boolean j() {
        return p(yji.o);
    }

    @Override // defpackage.yjf
    public final boolean k() {
        return p(yji.a);
    }

    @Override // defpackage.yjf
    public final boolean l() {
        boolean canScheduleExactAlarms;
        if (Build.VERSION.SDK_INT < 31) {
            return true;
        }
        AlarmManager alarmManager = (AlarmManager) this.b.getSystemService("alarm");
        if (alarmManager == null) {
            return false;
        }
        canScheduleExactAlarms = alarmManager.canScheduleExactAlarms();
        return canScheduleExactAlarms;
    }

    @Override // defpackage.yjf
    public final boolean m() {
        return p(yji.h);
    }

    @Override // defpackage.yjf
    public final boolean n() {
        if (!yhx.h) {
            return p(yji.n);
        }
        if (p(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_MEDIA_AUDIO"}) && q() && s()) {
            return true;
        }
        return false;
    }

    public final boolean o(String str) {
        int i = -1;
        if (!this.c.containsKey(str) || ((Integer) this.c.get(str)).intValue() == -1) {
            if (str.equals("android.permission.SCHEDULE_EXACT_ALARM")) {
                if (true == l()) {
                    i = 0;
                }
                this.c.put(str, Integer.valueOf(i));
            } else {
                this.c.put(str, Integer.valueOf(this.b.checkSelfPermission(str)));
            }
        }
        if (((Integer) this.c.get(str)).intValue() != 0) {
            return false;
        }
        return true;
    }

    public final boolean p(String[] strArr) {
        for (String str : strArr) {
            if (!o(str)) {
                xyo e = a.e();
                e.H("Missing Permission");
                e.H(str);
                e.q();
                return false;
            }
        }
        return true;
    }
}
