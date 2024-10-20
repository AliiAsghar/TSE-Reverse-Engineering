package defpackage;

import android.database.Cursor;
import android.view.View;
import androidx.work.impl.WorkDatabase;
import defpackage.iqk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvj extends arrp implements arqr {
    private final /* synthetic */ int t;
    public static final gvj s = new gvj(19);
    public static final gvj r = new gvj(18);
    public static final gvj q = new gvj(17);
    public static final gvj p = new gvj(16);
    public static final gvj o = new gvj(15);
    public static final gvj n = new gvj(14);
    public static final gvj m = new gvj(13);
    public static final gvj l = new gvj(12);
    public static final gvj k = new gvj(11);
    public static final gvj j = new gvj(10);
    public static final gvj i = new gvj(9);
    public static final gvj h = new gvj(8);
    public static final gvj g = new gvj(7);
    public static final gvj f = new gvj(6);
    public static final gvj e = new gvj(5);
    public static final gvj d = new gvj(4);
    public static final gvj c = new gvj(2);
    public static final gvj b = new gvj(1);
    public static final gvj a = new gvj(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gvj(int i2) {
        super(1);
        this.t = i2;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        switch (this.t) {
            case 0:
                gys gysVar = (gys) obj;
                gysVar.getClass();
                if (true != gysVar.f()) {
                    return "OneTime";
                }
                return "Periodic";
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" : ");
                if (value instanceof Object[]) {
                    value = Arrays.toString((Object[]) value);
                    value.getClass();
                }
                sb.append(value);
                return sb.toString();
            case 2:
                gwt gwtVar = (gwt) obj;
                gwtVar.getClass();
                String simpleName = gwtVar.getClass().getSimpleName();
                simpleName.getClass();
                return simpleName;
            case 3:
                WorkDatabase workDatabase = (WorkDatabase) obj;
                workDatabase.getClass();
                tb tbVar = gys.b;
                gyt A = workDatabase.A();
                gih a2 = gih.a("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
                a2.g(1, "com.google.android.apps.messaging.shared.datamodel.workqueue.WorkQueueWorkerShim");
                gzn gznVar = (gzn) A;
                gznVar.a.k();
                gznVar.a.l();
                try {
                    Cursor bC = gvf.bC(((gzn) A).a, a2, true);
                    try {
                        HashMap hashMap = new HashMap();
                        HashMap hashMap2 = new HashMap();
                        while (bC.moveToNext()) {
                            String string = bC.getString(0);
                            if (!hashMap.containsKey(string)) {
                                hashMap.put(string, new ArrayList());
                            }
                            String string2 = bC.getString(0);
                            if (!hashMap2.containsKey(string2)) {
                                hashMap2.put(string2, new ArrayList());
                            }
                        }
                        bC.moveToPosition(-1);
                        ((gzn) A).o(hashMap);
                        ((gzn) A).n(hashMap2);
                        ArrayList arrayList = new ArrayList(bC.getCount());
                        while (bC.moveToNext()) {
                            String string3 = bC.getString(0);
                            gtk C = gvf.C(bC.getInt(1));
                            gsi c2 = gsi.c(bC.getBlob(2));
                            int i2 = bC.getInt(3);
                            int i3 = bC.getInt(4);
                            long j2 = bC.getLong(14);
                            long j3 = bC.getLong(15);
                            long j4 = bC.getLong(16);
                            gry A2 = gvf.A(bC.getInt(17));
                            long j5 = bC.getLong(18);
                            long j6 = bC.getLong(19);
                            int i4 = bC.getInt(20);
                            long j7 = bC.getLong(21);
                            int i5 = bC.getInt(22);
                            int I = gvf.I(bC.getInt(5));
                            gzu D = gvf.D(bC.getBlob(6));
                            if (bC.getInt(7) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (bC.getInt(8) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (bC.getInt(9) != 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (bC.getInt(10) != 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            arrayList.add(new gyr(string3, C, c2, j2, j3, j4, new gsf(D, I, z, z2, z3, z4, bC.getLong(11), bC.getLong(12), gvf.E(bC.getBlob(13))), i2, A2, j5, j6, i4, i3, j7, i5, (ArrayList) hashMap.get(bC.getString(0)), (ArrayList) hashMap2.get(bC.getString(0))));
                        }
                        ((gzn) A).a.o();
                        gznVar.a.m();
                        Object a3 = tbVar.a(arrayList);
                        a3.getClass();
                        return a3;
                    } finally {
                        bC.close();
                        a2.j();
                    }
                } catch (Throwable th) {
                    gznVar.a.m();
                    throw th;
                }
            case 4:
                return new cku(ckw.h(iaw.a, ((cku) obj).i));
            case 5:
                return Integer.valueOf(-((Number) obj).intValue());
            case 6:
                return Integer.valueOf(((Number) obj).intValue());
            case 7:
                return null;
            case 8:
                afxy afxyVar = (afxy) obj;
                afxyVar.getClass();
                afxyVar.f();
                return arnb.a;
            case 9:
                afxy afxyVar2 = (afxy) obj;
                afxyVar2.getClass();
                return Boolean.valueOf(afxyVar2.o());
            case 10:
                afxy afxyVar3 = (afxy) obj;
                afxyVar3.getClass();
                return afxyVar3.c();
            case 11:
                afxy afxyVar4 = (afxy) obj;
                afxyVar4.getClass();
                afxyVar4.g();
                return arnb.a;
            case 12:
                afxy afxyVar5 = (afxy) obj;
                afxyVar5.getClass();
                afxyVar5.h();
                return arnb.a;
            case 13:
                View view = (View) obj;
                view.getClass();
                aktp.L(new iqk.a(view), view);
                return arnb.a;
            case 14:
                View view2 = (View) obj;
                view2.getClass();
                aktp.L(new iqk.d(view2, agek.c), view2);
                return arnb.a;
            case 15:
                View view3 = (View) obj;
                view3.getClass();
                aktp.L(new iqk.d(view3, agek.f), view3);
                return arnb.a;
            case 16:
                View view4 = (View) obj;
                view4.getClass();
                aktp.L(new iqk.c(view4), view4);
                return arnb.a;
            case 17:
                View view5 = (View) obj;
                view5.getClass();
                aktp.L(new iqk.e(view5), view5);
                return arnb.a;
            case 18:
                View view6 = (View) obj;
                view6.getClass();
                aktp.L(new iqk.b(view6), view6);
                return arnb.a;
            case 19:
                View view7 = (View) obj;
                view7.getClass();
                aktp.L(new iqk.f(view7), view7);
                return arnb.a;
            default:
                jcb jcbVar = (jcb) obj;
                jcbVar.getClass();
                jcbVar.e();
                return arnb.a;
        }
    }
}
