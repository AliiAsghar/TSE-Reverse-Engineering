package defpackage;

import android.net.Uri;
import android.os.Build;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yjl {
    public final xnv a;
    public final Map b = new EnumMap(yjh.class);
    public long c;
    public final yjg d;
    public final wfh e;
    private final cj f;
    private rw g;

    public yjl(cj cjVar, xnv xnvVar, yjg yjgVar) {
        this.f = cjVar;
        this.e = new wfh(cjVar);
        this.a = xnvVar;
        this.d = yjgVar;
    }

    public final void a(yjj yjjVar) {
        f(yjh.CALL_PHONE_PERMISSIONS, yjjVar);
    }

    public final void b(yjj yjjVar) {
        f(yjh.CAMERA_IMAGE_PERMISSIONS, yjjVar);
    }

    public final void c(yjj yjjVar) {
        f(yjh.LOCATION_PERMISSIONS, yjjVar);
    }

    public final void d(yjj yjjVar) {
        f(yjh.RECEIVE_WAP_PUSH_PERMISSIONS, yjjVar);
    }

    public final void e(yjj yjjVar) {
        f(yjh.STORAGE_PERMISSIONS, yjjVar);
    }

    public final void f(yjh yjhVar, yjj yjjVar) {
        d.s(yji.r.containsKey(yjhVar));
        wfh wfhVar = new wfh(yjjVar);
        String[] strArr = (String[]) yji.r.get(yjhVar);
        if (strArr != null) {
            if (this.d.p(strArr)) {
                wfhVar.D();
                return;
            }
            this.c = this.a.a();
            this.b.put(yjhVar, wfhVar);
            int i = 0;
            if (yjhVar == yjh.SCHEDULED_SEND_PERMISSIONS && Build.VERSION.SDK_INT >= 31) {
                if (this.g == null) {
                    cj cjVar = this.f;
                    this.g = cjVar.g.a("PermissionHelperImpl#AlarmsSettingsLauncher", new sl(), new yjk(this, i));
                }
                this.g.c(lqn.g("android.settings.REQUEST_SCHEDULE_EXACT_ALARM").a().setData(Uri.parse("package:".concat(String.valueOf(this.f.getPackageName())))));
                return;
            }
            yjg yjgVar = this.d;
            ArrayList arrayList = new ArrayList();
            while (i < strArr.length) {
                String str = strArr[i];
                if (!yjgVar.o(str)) {
                    arrayList.add(str);
                }
                i++;
            }
            String[] strArr2 = new String[arrayList.size()];
            arrayList.toArray(strArr2);
            wfh wfhVar2 = this.e;
            ((cj) wfhVar2.a).requestPermissions(strArr2, yjhVar.q);
        }
    }
}
