package defpackage;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class guh {
    public static final String a = gsy.b("Schedulers");

    public static void a(gsb gsbVar, WorkDatabase workDatabase, List list) {
        gih gihVar;
        int bE;
        int bE2;
        int bE3;
        int bE4;
        int bE5;
        int bE6;
        int bE7;
        int bE8;
        int bE9;
        int bE10;
        int bE11;
        int bE12;
        int bE13;
        ArrayList arrayList;
        gih gihVar2;
        int i;
        boolean z;
        String string;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        boolean z6;
        String string2;
        int i7;
        boolean z7;
        int i8;
        boolean z8;
        int i9;
        boolean z9;
        int i10;
        boolean z10;
        if (list != null && list.size() != 0) {
            gyt A = workDatabase.A();
            workDatabase.l();
            try {
                gid gidVar = ((gzn) A).a;
                gih a2 = gih.a("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time", 0);
                gidVar.k();
                Cursor bC = gvf.bC(((gzn) A).a, a2, false);
                try {
                    bE = gvf.bE(bC, "id");
                    bE2 = gvf.bE(bC, "state");
                    bE3 = gvf.bE(bC, "worker_class_name");
                    bE4 = gvf.bE(bC, "input_merger_class_name");
                    bE5 = gvf.bE(bC, "input");
                    bE6 = gvf.bE(bC, "output");
                    bE7 = gvf.bE(bC, "initial_delay");
                    bE8 = gvf.bE(bC, "interval_duration");
                    bE9 = gvf.bE(bC, "flex_duration");
                    bE10 = gvf.bE(bC, "run_attempt_count");
                    bE11 = gvf.bE(bC, "backoff_policy");
                    bE12 = gvf.bE(bC, "backoff_delay_duration");
                    bE13 = gvf.bE(bC, "last_enqueue_time");
                    gihVar = a2;
                } catch (Throwable th) {
                    th = th;
                    gihVar = a2;
                }
                try {
                    int bE14 = gvf.bE(bC, "minimum_retention_duration");
                    int bE15 = gvf.bE(bC, "schedule_requested_at");
                    int bE16 = gvf.bE(bC, "run_in_foreground");
                    int bE17 = gvf.bE(bC, "out_of_quota_policy");
                    int bE18 = gvf.bE(bC, "period_count");
                    int bE19 = gvf.bE(bC, "generation");
                    int bE20 = gvf.bE(bC, "next_schedule_time_override");
                    int bE21 = gvf.bE(bC, "next_schedule_time_override_generation");
                    int bE22 = gvf.bE(bC, "stop_reason");
                    int bE23 = gvf.bE(bC, "trace_tag");
                    int bE24 = gvf.bE(bC, "required_network_type");
                    int bE25 = gvf.bE(bC, "required_network_request");
                    int bE26 = gvf.bE(bC, "requires_charging");
                    int bE27 = gvf.bE(bC, "requires_device_idle");
                    int bE28 = gvf.bE(bC, "requires_battery_not_low");
                    int bE29 = gvf.bE(bC, "requires_storage_not_low");
                    int bE30 = gvf.bE(bC, "trigger_content_update_delay");
                    int bE31 = gvf.bE(bC, "trigger_max_content_delay");
                    int bE32 = gvf.bE(bC, "content_uri_triggers");
                    int i11 = bE20;
                    ArrayList arrayList2 = new ArrayList(bC.getCount());
                    while (true) {
                        arrayList = arrayList2;
                        if (!bC.moveToNext()) {
                            break;
                        }
                        String string3 = bC.getString(bE);
                        gtk C = gvf.C(bC.getInt(bE2));
                        String string4 = bC.getString(bE3);
                        String string5 = bC.getString(bE4);
                        gsi c = gsi.c(bC.getBlob(bE5));
                        gsi c2 = gsi.c(bC.getBlob(bE6));
                        long j = bC.getLong(bE7);
                        long j2 = bC.getLong(bE8);
                        long j3 = bC.getLong(bE9);
                        int i12 = bC.getInt(bE10);
                        gry A2 = gvf.A(bC.getInt(bE11));
                        long j4 = bC.getLong(bE12);
                        long j5 = bC.getLong(bE13);
                        int i13 = bE14;
                        long j6 = bC.getLong(i13);
                        int i14 = bE15;
                        long j7 = bC.getLong(i14);
                        int i15 = bE6;
                        int i16 = bE16;
                        if (bC.getInt(i16) != 0) {
                            bE16 = i16;
                            i6 = bE17;
                            z6 = true;
                        } else {
                            bE16 = i16;
                            i6 = bE17;
                            z6 = false;
                        }
                        gtf B = gvf.B(bC.getInt(i6));
                        bE17 = i6;
                        int i17 = bE18;
                        int i18 = bC.getInt(i17);
                        bE18 = i17;
                        int i19 = bE19;
                        int i20 = bC.getInt(i19);
                        bE19 = i19;
                        int i21 = i11;
                        long j8 = bC.getLong(i21);
                        i11 = i21;
                        int i22 = bE21;
                        int i23 = bC.getInt(i22);
                        bE21 = i22;
                        int i24 = bE22;
                        int i25 = bC.getInt(i24);
                        bE22 = i24;
                        int i26 = bE23;
                        if (bC.isNull(i26)) {
                            string2 = null;
                        } else {
                            string2 = bC.getString(i26);
                        }
                        String str = string2;
                        bE23 = i26;
                        int i27 = bE24;
                        int I = gvf.I(bC.getInt(i27));
                        bE24 = i27;
                        int i28 = bE25;
                        gzu D = gvf.D(bC.getBlob(i28));
                        bE25 = i28;
                        int i29 = bE26;
                        if (bC.getInt(i29) != 0) {
                            bE26 = i29;
                            i7 = bE27;
                            z7 = true;
                        } else {
                            bE26 = i29;
                            i7 = bE27;
                            z7 = false;
                        }
                        if (bC.getInt(i7) != 0) {
                            bE27 = i7;
                            i8 = bE28;
                            z8 = true;
                        } else {
                            bE27 = i7;
                            i8 = bE28;
                            z8 = false;
                        }
                        if (bC.getInt(i8) != 0) {
                            bE28 = i8;
                            i9 = bE29;
                            z9 = true;
                        } else {
                            bE28 = i8;
                            i9 = bE29;
                            z9 = false;
                        }
                        if (bC.getInt(i9) != 0) {
                            bE29 = i9;
                            i10 = bE30;
                            z10 = true;
                        } else {
                            bE29 = i9;
                            i10 = bE30;
                            z10 = false;
                        }
                        long j9 = bC.getLong(i10);
                        bE30 = i10;
                        int i30 = bE31;
                        long j10 = bC.getLong(i30);
                        bE31 = i30;
                        int i31 = bE32;
                        bE32 = i31;
                        int i32 = bE5;
                        arrayList.add(new gys(string3, C, string4, string5, c, c2, j, j2, j3, new gsf(D, I, z7, z8, z9, z10, j9, j10, gvf.E(bC.getBlob(i31))), i12, A2, j4, j5, j6, j7, z6, B, i18, i20, j8, i23, i25, str));
                        bE14 = i13;
                        bE6 = i15;
                        bE15 = i14;
                        arrayList2 = arrayList;
                        bE5 = i32;
                    }
                    bC.close();
                    gihVar.j();
                    gvf gvfVar = gsbVar.l;
                    b(A, arrayList);
                    int i33 = gsbVar.k;
                    gih a3 = gih.a("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))", 1);
                    a3.e(1, 20L);
                    ((gzn) A).a.k();
                    Cursor bC2 = gvf.bC(((gzn) A).a, a3, false);
                    try {
                        int bE33 = gvf.bE(bC2, "id");
                        int bE34 = gvf.bE(bC2, "state");
                        int bE35 = gvf.bE(bC2, "worker_class_name");
                        int bE36 = gvf.bE(bC2, "input_merger_class_name");
                        int bE37 = gvf.bE(bC2, "input");
                        int bE38 = gvf.bE(bC2, "output");
                        int bE39 = gvf.bE(bC2, "initial_delay");
                        int bE40 = gvf.bE(bC2, "interval_duration");
                        int bE41 = gvf.bE(bC2, "flex_duration");
                        int bE42 = gvf.bE(bC2, "run_attempt_count");
                        int bE43 = gvf.bE(bC2, "backoff_policy");
                        int bE44 = gvf.bE(bC2, "backoff_delay_duration");
                        int bE45 = gvf.bE(bC2, "last_enqueue_time");
                        int bE46 = gvf.bE(bC2, "minimum_retention_duration");
                        gihVar2 = a3;
                        try {
                            int bE47 = gvf.bE(bC2, "schedule_requested_at");
                            int bE48 = gvf.bE(bC2, "run_in_foreground");
                            int bE49 = gvf.bE(bC2, "out_of_quota_policy");
                            int bE50 = gvf.bE(bC2, "period_count");
                            int bE51 = gvf.bE(bC2, "generation");
                            int bE52 = gvf.bE(bC2, "next_schedule_time_override");
                            int bE53 = gvf.bE(bC2, "next_schedule_time_override_generation");
                            int bE54 = gvf.bE(bC2, "stop_reason");
                            int bE55 = gvf.bE(bC2, "trace_tag");
                            int bE56 = gvf.bE(bC2, "required_network_type");
                            int bE57 = gvf.bE(bC2, "required_network_request");
                            int bE58 = gvf.bE(bC2, "requires_charging");
                            int bE59 = gvf.bE(bC2, "requires_device_idle");
                            int bE60 = gvf.bE(bC2, "requires_battery_not_low");
                            int bE61 = gvf.bE(bC2, "requires_storage_not_low");
                            int bE62 = gvf.bE(bC2, "trigger_content_update_delay");
                            int bE63 = gvf.bE(bC2, "trigger_max_content_delay");
                            int bE64 = gvf.bE(bC2, "content_uri_triggers");
                            int i34 = bE46;
                            ArrayList arrayList3 = new ArrayList(bC2.getCount());
                            while (bC2.moveToNext()) {
                                String string6 = bC2.getString(bE33);
                                gtk C2 = gvf.C(bC2.getInt(bE34));
                                String string7 = bC2.getString(bE35);
                                String string8 = bC2.getString(bE36);
                                gsi c3 = gsi.c(bC2.getBlob(bE37));
                                gsi c4 = gsi.c(bC2.getBlob(bE38));
                                long j11 = bC2.getLong(bE39);
                                long j12 = bC2.getLong(bE40);
                                long j13 = bC2.getLong(bE41);
                                int i35 = bC2.getInt(bE42);
                                gry A3 = gvf.A(bC2.getInt(bE43));
                                long j14 = bC2.getLong(bE44);
                                long j15 = bC2.getLong(bE45);
                                int i36 = i34;
                                long j16 = bC2.getLong(i36);
                                i34 = i36;
                                int i37 = bE47;
                                long j17 = bC2.getLong(i37);
                                bE47 = i37;
                                int i38 = bE48;
                                if (bC2.getInt(i38) != 0) {
                                    bE48 = i38;
                                    i = bE49;
                                    z = true;
                                } else {
                                    bE48 = i38;
                                    i = bE49;
                                    z = false;
                                }
                                gtf B2 = gvf.B(bC2.getInt(i));
                                bE49 = i;
                                int i39 = bE50;
                                int i40 = bC2.getInt(i39);
                                bE50 = i39;
                                int i41 = bE51;
                                int i42 = bC2.getInt(i41);
                                bE51 = i41;
                                int i43 = bE52;
                                long j18 = bC2.getLong(i43);
                                bE52 = i43;
                                int i44 = bE53;
                                int i45 = bC2.getInt(i44);
                                bE53 = i44;
                                int i46 = bE54;
                                int i47 = bC2.getInt(i46);
                                bE54 = i46;
                                int i48 = bE55;
                                if (bC2.isNull(i48)) {
                                    string = null;
                                } else {
                                    string = bC2.getString(i48);
                                }
                                String str2 = string;
                                bE55 = i48;
                                int i49 = bE56;
                                int I2 = gvf.I(bC2.getInt(i49));
                                bE56 = i49;
                                int i50 = bE57;
                                gzu D2 = gvf.D(bC2.getBlob(i50));
                                bE57 = i50;
                                int i51 = bE58;
                                if (bC2.getInt(i51) != 0) {
                                    bE58 = i51;
                                    i2 = bE59;
                                    z2 = true;
                                } else {
                                    bE58 = i51;
                                    i2 = bE59;
                                    z2 = false;
                                }
                                if (bC2.getInt(i2) != 0) {
                                    bE59 = i2;
                                    i3 = bE60;
                                    z3 = true;
                                } else {
                                    bE59 = i2;
                                    i3 = bE60;
                                    z3 = false;
                                }
                                if (bC2.getInt(i3) != 0) {
                                    bE60 = i3;
                                    i4 = bE61;
                                    z4 = true;
                                } else {
                                    bE60 = i3;
                                    i4 = bE61;
                                    z4 = false;
                                }
                                if (bC2.getInt(i4) != 0) {
                                    bE61 = i4;
                                    i5 = bE62;
                                    z5 = true;
                                } else {
                                    bE61 = i4;
                                    i5 = bE62;
                                    z5 = false;
                                }
                                long j19 = bC2.getLong(i5);
                                bE62 = i5;
                                int i52 = bE63;
                                long j20 = bC2.getLong(i52);
                                bE63 = i52;
                                int i53 = bE64;
                                bE64 = i53;
                                arrayList3.add(new gys(string6, C2, string7, string8, c3, c4, j11, j12, j13, new gsf(D2, I2, z2, z3, z4, z5, j19, j20, gvf.E(bC2.getBlob(i53))), i35, A3, j14, j15, j16, j17, z, B2, i40, i42, j18, i45, i47, str2));
                            }
                            bC2.close();
                            gihVar2.j();
                            gvf gvfVar2 = gsbVar.l;
                            b(A, arrayList3);
                            arrayList3.addAll(arrayList);
                            List k = A.k();
                            workDatabase.o();
                            workDatabase.m();
                            if (arrayList3.size() > 0) {
                                gys[] gysVarArr = (gys[]) arrayList3.toArray(new gys[arrayList3.size()]);
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    guf gufVar = (guf) it.next();
                                    if (gufVar.d()) {
                                        gufVar.c(gysVarArr);
                                    }
                                }
                            }
                            if (k.size() > 0) {
                                gys[] gysVarArr2 = (gys[]) k.toArray(new gys[k.size()]);
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    guf gufVar2 = (guf) it2.next();
                                    if (!gufVar2.d()) {
                                        gufVar2.c(gysVarArr2);
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            bC2.close();
                            gihVar2.j();
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        gihVar2 = a3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    bC.close();
                    gihVar.j();
                    throw th;
                }
            } catch (Throwable th5) {
                workDatabase.m();
                throw th5;
            }
        }
    }

    private static void b(gyt gytVar, List list) {
        if (list.size() > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                gytVar.l(((gys) it.next()).c, currentTimeMillis);
            }
        }
    }
}
