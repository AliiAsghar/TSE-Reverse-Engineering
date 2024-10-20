package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import android.util.Log;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import defpackage.gih;
import defpackage.gry;
import defpackage.gsf;
import defpackage.gsi;
import defpackage.gsw;
import defpackage.gsy;
import defpackage.gtf;
import defpackage.gtk;
import defpackage.gvd;
import defpackage.gvf;
import defpackage.gyb;
import defpackage.gyh;
import defpackage.gys;
import defpackage.gyt;
import defpackage.gzn;
import defpackage.gzo;
import defpackage.gzu;
import defpackage.haq;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    public final gvf c() {
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
        int bE14;
        gyb gybVar;
        gyh gyhVar;
        gzo gzoVar;
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
        gvd m = gvd.m(this.a);
        WorkDatabase workDatabase = m.e;
        workDatabase.getClass();
        gyt A = workDatabase.A();
        gyh y = workDatabase.y();
        gzo B = workDatabase.B();
        gyb x = workDatabase.x();
        gvf gvfVar = m.d.l;
        long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        gih a = gih.a("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        a.e(1, currentTimeMillis);
        gzn gznVar = (gzn) A;
        gznVar.a.k();
        Cursor bC = gvf.bC(gznVar.a, a, false);
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
            bE14 = gvf.bE(bC, "minimum_retention_duration");
            gihVar = a;
        } catch (Throwable th) {
            th = th;
            gihVar = a;
        }
        try {
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
            int i6 = bE14;
            ArrayList arrayList = new ArrayList(bC.getCount());
            while (bC.moveToNext()) {
                String string2 = bC.getString(bE);
                gtk C = gvf.C(bC.getInt(bE2));
                String string3 = bC.getString(bE3);
                String string4 = bC.getString(bE4);
                gsi c = gsi.c(bC.getBlob(bE5));
                gsi c2 = gsi.c(bC.getBlob(bE6));
                long j = bC.getLong(bE7);
                long j2 = bC.getLong(bE8);
                long j3 = bC.getLong(bE9);
                int i7 = bC.getInt(bE10);
                gry A2 = gvf.A(bC.getInt(bE11));
                long j4 = bC.getLong(bE12);
                long j5 = bC.getLong(bE13);
                int i8 = i6;
                long j6 = bC.getLong(i8);
                int i9 = bE;
                int i10 = bE15;
                long j7 = bC.getLong(i10);
                bE15 = i10;
                int i11 = bE16;
                if (bC.getInt(i11) != 0) {
                    bE16 = i11;
                    i = bE17;
                    z = true;
                } else {
                    bE16 = i11;
                    i = bE17;
                    z = false;
                }
                gtf B2 = gvf.B(bC.getInt(i));
                bE17 = i;
                int i12 = bE18;
                int i13 = bC.getInt(i12);
                bE18 = i12;
                int i14 = bE19;
                int i15 = bC.getInt(i14);
                bE19 = i14;
                int i16 = bE20;
                long j8 = bC.getLong(i16);
                bE20 = i16;
                int i17 = bE21;
                int i18 = bC.getInt(i17);
                bE21 = i17;
                int i19 = bE22;
                int i20 = bC.getInt(i19);
                bE22 = i19;
                int i21 = bE23;
                if (bC.isNull(i21)) {
                    string = null;
                } else {
                    string = bC.getString(i21);
                }
                String str = string;
                bE23 = i21;
                int i22 = bE24;
                int I = gvf.I(bC.getInt(i22));
                bE24 = i22;
                int i23 = bE25;
                gzu D = gvf.D(bC.getBlob(i23));
                bE25 = i23;
                int i24 = bE26;
                if (bC.getInt(i24) != 0) {
                    bE26 = i24;
                    i2 = bE27;
                    z2 = true;
                } else {
                    bE26 = i24;
                    i2 = bE27;
                    z2 = false;
                }
                if (bC.getInt(i2) != 0) {
                    bE27 = i2;
                    i3 = bE28;
                    z3 = true;
                } else {
                    bE27 = i2;
                    i3 = bE28;
                    z3 = false;
                }
                if (bC.getInt(i3) != 0) {
                    bE28 = i3;
                    i4 = bE29;
                    z4 = true;
                } else {
                    bE28 = i3;
                    i4 = bE29;
                    z4 = false;
                }
                if (bC.getInt(i4) != 0) {
                    bE29 = i4;
                    i5 = bE30;
                    z5 = true;
                } else {
                    bE29 = i4;
                    i5 = bE30;
                    z5 = false;
                }
                long j9 = bC.getLong(i5);
                bE30 = i5;
                int i25 = bE31;
                long j10 = bC.getLong(i25);
                bE31 = i25;
                int i26 = bE32;
                bE32 = i26;
                arrayList.add(new gys(string2, C, string3, string4, c, c2, j, j2, j3, new gsf(D, I, z2, z3, z4, z5, j9, j10, gvf.E(bC.getBlob(i26))), i7, A2, j4, j5, j6, j7, z, B2, i13, i15, j8, i18, i20, str));
                bE = i9;
                i6 = i8;
            }
            bC.close();
            gihVar.j();
            List c3 = A.c();
            List k = A.k();
            if (!arrayList.isEmpty()) {
                gsy.a();
                Log.i(haq.a, "Recently completed work:\n\n");
                gsy.a();
                gybVar = x;
                gyhVar = y;
                gzoVar = B;
                Log.i(haq.a, haq.a(gyhVar, gzoVar, gybVar, arrayList));
            } else {
                gybVar = x;
                gyhVar = y;
                gzoVar = B;
            }
            if (!c3.isEmpty()) {
                gsy.a();
                Log.i(haq.a, "Running work:\n\n");
                gsy.a();
                Log.i(haq.a, haq.a(gyhVar, gzoVar, gybVar, c3));
            }
            if (!k.isEmpty()) {
                gsy.a();
                Log.i(haq.a, "Enqueued work:\n\n");
                gsy.a();
                Log.i(haq.a, haq.a(gyhVar, gzoVar, gybVar, k));
            }
            return new gsw();
        } catch (Throwable th2) {
            th = th2;
            bC.close();
            gihVar.j();
            throw th;
        }
    }
}
