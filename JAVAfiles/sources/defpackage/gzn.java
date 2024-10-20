package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gzn implements gyt {
    public final gid a;
    public final ghp b;
    public final gho c;
    public final gil d;
    public final gil e;
    public final gil f;
    public final gil g;
    public final gil h;
    public final gil i;
    private final gil j;
    private final gil k;
    private final gil l;
    private final gil m;
    private final gil n;
    private final gil o;
    private final gil p;

    public gzn(gid gidVar) {
        this.a = gidVar;
        this.b = new gzd(gidVar);
        this.c = new gzf(gidVar);
        this.j = new gzg(gidVar);
        this.k = new gzh(gidVar);
        this.d = new gzi(gidVar);
        this.e = new gzj(gidVar);
        this.l = new gzk(gidVar);
        this.m = new gzl(gidVar);
        this.f = new gzm(gidVar);
        this.g = new gyu(gidVar);
        new gyv(gidVar);
        this.n = new gyw(gidVar);
        this.o = new gyx(gidVar);
        this.h = new gyy(gidVar);
        this.i = new gyz(gidVar);
        new gza(gidVar);
        this.p = new gzb(gidVar);
    }

    @Override // defpackage.gyt
    public final gtk a(String str) {
        Integer valueOf;
        gih a = gih.a("SELECT state FROM workspec WHERE id=?", 1);
        a.g(1, str);
        this.a.k();
        Cursor bC = gvf.bC(this.a, a, false);
        try {
            gtk gtkVar = null;
            if (bC.moveToFirst()) {
                if (bC.isNull(0)) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(bC.getInt(0));
                }
                if (valueOf != null) {
                    gtkVar = gvf.C(valueOf.intValue());
                }
            }
            return gtkVar;
        } finally {
            bC.close();
            a.j();
        }
    }

    @Override // defpackage.gyt
    public final gys b(String str) {
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
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        gih a = gih.a("SELECT * FROM workspec WHERE id=?", 1);
        a.g(1, str);
        this.a.k();
        Cursor bC = gvf.bC(this.a, a, false);
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
            gys gysVar = null;
            String string = null;
            if (bC.moveToFirst()) {
                String string2 = bC.getString(bE);
                gtk C = gvf.C(bC.getInt(bE2));
                String string3 = bC.getString(bE3);
                String string4 = bC.getString(bE4);
                gsi c = gsi.c(bC.getBlob(bE5));
                gsi c2 = gsi.c(bC.getBlob(bE6));
                long j = bC.getLong(bE7);
                long j2 = bC.getLong(bE8);
                long j3 = bC.getLong(bE9);
                int i6 = bC.getInt(bE10);
                gry A = gvf.A(bC.getInt(bE11));
                long j4 = bC.getLong(bE12);
                long j5 = bC.getLong(bE13);
                long j6 = bC.getLong(bE14);
                long j7 = bC.getLong(bE15);
                if (bC.getInt(bE16) != 0) {
                    i = bE17;
                    z = true;
                } else {
                    i = bE17;
                    z = false;
                }
                gtf B = gvf.B(bC.getInt(i));
                int i7 = bC.getInt(bE18);
                int i8 = bC.getInt(bE19);
                long j8 = bC.getLong(bE20);
                int i9 = bC.getInt(bE21);
                int i10 = bC.getInt(bE22);
                if (!bC.isNull(bE23)) {
                    string = bC.getString(bE23);
                }
                String str2 = string;
                int I = gvf.I(bC.getInt(bE24));
                gzu D = gvf.D(bC.getBlob(bE25));
                if (bC.getInt(bE26) != 0) {
                    i2 = bE27;
                    z2 = true;
                } else {
                    i2 = bE27;
                    z2 = false;
                }
                if (bC.getInt(i2) != 0) {
                    i3 = bE28;
                    z3 = true;
                } else {
                    i3 = bE28;
                    z3 = false;
                }
                if (bC.getInt(i3) != 0) {
                    i4 = bE29;
                    z4 = true;
                } else {
                    i4 = bE29;
                    z4 = false;
                }
                if (bC.getInt(i4) != 0) {
                    i5 = bE30;
                    z5 = true;
                } else {
                    i5 = bE30;
                    z5 = false;
                }
                gysVar = new gys(string2, C, string3, string4, c, c2, j, j2, j3, new gsf(D, I, z2, z3, z4, z5, bC.getLong(i5), bC.getLong(bE31), gvf.E(bC.getBlob(bE32))), i6, A, j4, j5, j6, j7, z, B, i7, i8, j8, i9, i10, str2);
            }
            bC.close();
            gihVar.j();
            return gysVar;
        } catch (Throwable th2) {
            th = th2;
            bC.close();
            gihVar.j();
            throw th;
        }
    }

    @Override // defpackage.gyt
    public final List c() {
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
        gid gidVar = this.a;
        gih a = gih.a("SELECT * FROM workspec WHERE state=1", 0);
        gidVar.k();
        Cursor bC = gvf.bC(this.a, a, false);
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
                gry A = gvf.A(bC.getInt(bE11));
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
                gtf B = gvf.B(bC.getInt(i));
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
                arrayList.add(new gys(string2, C, string3, string4, c, c2, j, j2, j3, new gsf(D, I, z2, z3, z4, z5, j9, j10, gvf.E(bC.getBlob(i26))), i7, A, j4, j5, j6, j7, z, B, i13, i15, j8, i18, i20, str));
                bE = i9;
                i6 = i8;
            }
            bC.close();
            gihVar.j();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            bC.close();
            gihVar.j();
            throw th;
        }
    }

    @Override // defpackage.gyt
    public final List d() {
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
        gid gidVar = this.a;
        gih a = gih.a("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        gidVar.k();
        Cursor bC = gvf.bC(this.a, a, false);
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
                gry A = gvf.A(bC.getInt(bE11));
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
                gtf B = gvf.B(bC.getInt(i));
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
                arrayList.add(new gys(string2, C, string3, string4, c, c2, j, j2, j3, new gsf(D, I, z2, z3, z4, z5, j9, j10, gvf.E(bC.getBlob(i26))), i7, A, j4, j5, j6, j7, z, B, i13, i15, j8, i18, i20, str));
                bE = i9;
                i6 = i8;
            }
            bC.close();
            gihVar.j();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            bC.close();
            gihVar.j();
            throw th;
        }
    }

    @Override // defpackage.gyt
    public final List e(String str) {
        gih a = gih.a("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        a.g(1, str);
        this.a.k();
        Cursor bC = gvf.bC(this.a, a, false);
        try {
            ArrayList arrayList = new ArrayList(bC.getCount());
            while (bC.moveToNext()) {
                arrayList.add(new gyq(bC.getString(0), gvf.C(bC.getInt(1))));
            }
            return arrayList;
        } finally {
            bC.close();
            a.j();
        }
    }

    @Override // defpackage.gyt
    public final void f(String str) {
        this.a.k();
        gkp d = this.j.d();
        d.g(1, str);
        try {
            this.a.l();
            try {
                d.a();
                this.a.o();
            } finally {
                this.a.m();
            }
        } finally {
            this.j.f(d);
        }
    }

    @Override // defpackage.gyt
    public final void g(String str, int i) {
        this.a.k();
        gkp d = this.n.d();
        d.g(1, str);
        d.e(2, i);
        try {
            this.a.l();
            try {
                d.a();
                this.a.o();
            } finally {
                this.a.m();
            }
        } finally {
            this.n.f(d);
        }
    }

    @Override // defpackage.gyt
    public final void h(String str, long j) {
        this.a.k();
        gkp d = this.m.d();
        d.e(1, j);
        d.g(2, str);
        try {
            this.a.l();
            try {
                d.a();
                this.a.o();
            } finally {
                this.a.m();
            }
        } finally {
            this.m.f(d);
        }
    }

    @Override // defpackage.gyt
    public final void i(String str, gsi gsiVar) {
        this.a.k();
        gkp d = this.l.d();
        d.c(1, gvf.av(gsiVar));
        d.g(2, str);
        try {
            this.a.l();
            try {
                d.a();
                this.a.o();
            } finally {
                this.a.m();
            }
        } finally {
            this.l.f(d);
        }
    }

    @Override // defpackage.gyt
    public final void j(String str, int i) {
        this.a.k();
        long j = i;
        gkp d = this.p.d();
        d.e(1, j);
        d.g(2, str);
        try {
            this.a.l();
            try {
                d.a();
                this.a.o();
            } finally {
                this.a.m();
            }
        } finally {
            this.p.f(d);
        }
    }

    @Override // defpackage.gyt
    public final List k() {
        gih gihVar;
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
        gih a = gih.a("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        a.e(1, 200L);
        this.a.k();
        Cursor bC = gvf.bC(this.a, a, false);
        try {
            int bE = gvf.bE(bC, "id");
            int bE2 = gvf.bE(bC, "state");
            int bE3 = gvf.bE(bC, "worker_class_name");
            int bE4 = gvf.bE(bC, "input_merger_class_name");
            int bE5 = gvf.bE(bC, "input");
            int bE6 = gvf.bE(bC, "output");
            int bE7 = gvf.bE(bC, "initial_delay");
            int bE8 = gvf.bE(bC, "interval_duration");
            int bE9 = gvf.bE(bC, "flex_duration");
            int bE10 = gvf.bE(bC, "run_attempt_count");
            int bE11 = gvf.bE(bC, "backoff_policy");
            int bE12 = gvf.bE(bC, "backoff_delay_duration");
            int bE13 = gvf.bE(bC, "last_enqueue_time");
            int bE14 = gvf.bE(bC, "minimum_retention_duration");
            gihVar = a;
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
                    gry A = gvf.A(bC.getInt(bE11));
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
                    gtf B = gvf.B(bC.getInt(i));
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
                    arrayList.add(new gys(string2, C, string3, string4, c, c2, j, j2, j3, new gsf(D, I, z2, z3, z4, z5, j9, j10, gvf.E(bC.getBlob(i26))), i7, A, j4, j5, j6, j7, z, B, i13, i15, j8, i18, i20, str));
                    bE = i9;
                    i6 = i8;
                }
                bC.close();
                gihVar.j();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                bC.close();
                gihVar.j();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            gihVar = a;
        }
    }

    @Override // defpackage.gyt
    public final void l(String str, long j) {
        this.a.k();
        gkp d = this.o.d();
        d.e(1, j);
        d.g(2, str);
        try {
            this.a.l();
            try {
                d.a();
                this.a.o();
            } finally {
                this.a.m();
            }
        } finally {
            this.o.f(d);
        }
    }

    @Override // defpackage.gyt
    public final void m(gtk gtkVar, String str) {
        this.a.k();
        gkp d = this.k.d();
        d.e(1, gvf.z(gtkVar));
        d.g(2, str);
        try {
            this.a.l();
            try {
                d.a();
                this.a.o();
            } finally {
                this.a.m();
            }
        } finally {
            this.k.f(d);
        }
    }

    public final void n(HashMap hashMap) {
        Set keySet = hashMap.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (hashMap.size() <= 999) {
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
            int size = keySet.size();
            gvf.bv(sb, size);
            sb.append(")");
            gih a = gih.a(sb.toString(), size);
            Iterator it = keySet.iterator();
            int i = 1;
            while (it.hasNext()) {
                a.g(i, (String) it.next());
                i++;
            }
            Cursor bC = gvf.bC(this.a, a, false);
            try {
                int bD = gvf.bD(bC, "work_spec_id");
                if (bD != -1) {
                    while (bC.moveToNext()) {
                        ArrayList arrayList = (ArrayList) hashMap.get(bC.getString(bD));
                        if (arrayList != null) {
                            arrayList.add(gsi.c(bC.getBlob(0)));
                        }
                    }
                }
                return;
            } finally {
                bC.close();
            }
        }
        gvf.by(hashMap, new gxy(this, 3));
    }

    public final void o(HashMap hashMap) {
        Set keySet = hashMap.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (hashMap.size() <= 999) {
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
            int size = keySet.size();
            gvf.bv(sb, size);
            sb.append(")");
            gih a = gih.a(sb.toString(), size);
            Iterator it = keySet.iterator();
            int i = 1;
            while (it.hasNext()) {
                a.g(i, (String) it.next());
                i++;
            }
            Cursor bC = gvf.bC(this.a, a, false);
            try {
                int bD = gvf.bD(bC, "work_spec_id");
                if (bD != -1) {
                    while (bC.moveToNext()) {
                        ArrayList arrayList = (ArrayList) hashMap.get(bC.getString(bD));
                        if (arrayList != null) {
                            arrayList.add(bC.getString(0));
                        }
                    }
                }
                return;
            } finally {
                bC.close();
            }
        }
        gvf.by(hashMap, new gxy(this, 2));
    }
}
