package defpackage;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gzy extends arrp implements arqr {
    final /* synthetic */ ico a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gzy(ico icoVar) {
        super(1);
        this.a = icoVar;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v32, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v35, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v38, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.Collection, java.lang.Object] */
    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        String str;
        String string;
        gtk C;
        gsi c;
        long j;
        long j2;
        long j3;
        int i;
        gry A;
        long j4;
        long j5;
        int i2;
        int i3;
        int i4;
        long j6;
        int i5;
        int I;
        gzu D;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        long j7;
        Set E;
        int i6;
        WorkDatabase workDatabase = (WorkDatabase) obj;
        workDatabase.getClass();
        tb tbVar = gys.b;
        gxx w = workDatabase.w();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder("SELECT * FROM workspec");
        ico icoVar = this.a;
        if (!icoVar.a.isEmpty()) {
            ?? r6 = icoVar.a;
            ArrayList arrayList2 = new ArrayList(aqjn.J(r6, 10));
            Iterator it = r6.iterator();
            while (it.hasNext()) {
                arrayList2.add(((UUID) it.next()).toString());
            }
            sb.append(" WHERE id IN (");
            gvf.p(sb, icoVar.a.size());
            sb.append(")");
            arrayList.addAll(arrayList2);
            str = " AND";
        } else {
            str = " WHERE";
        }
        if (!icoVar.b.isEmpty()) {
            sb.append(str.concat(" id IN (SELECT work_spec_id FROM worktag WHERE tag IN ("));
            gvf.p(sb, icoVar.b.size());
            sb.append("))");
            arrayList.addAll(icoVar.b);
        }
        sb.append(";");
        gkc gkcVar = new gkc(sb.toString(), arrayList.toArray(new Object[0]));
        gxz gxzVar = (gxz) w;
        gxzVar.a.k();
        Cursor bC = gvf.bC(gxzVar.a, gkcVar, true);
        try {
            int bD = gvf.bD(bC, "id");
            int bD2 = gvf.bD(bC, "state");
            int bD3 = gvf.bD(bC, "output");
            int bD4 = gvf.bD(bC, "initial_delay");
            int bD5 = gvf.bD(bC, "interval_duration");
            int bD6 = gvf.bD(bC, "flex_duration");
            int bD7 = gvf.bD(bC, "run_attempt_count");
            int bD8 = gvf.bD(bC, "backoff_policy");
            int bD9 = gvf.bD(bC, "backoff_delay_duration");
            int bD10 = gvf.bD(bC, "last_enqueue_time");
            int bD11 = gvf.bD(bC, "period_count");
            int bD12 = gvf.bD(bC, "generation");
            int bD13 = gvf.bD(bC, "next_schedule_time_override");
            int bD14 = gvf.bD(bC, "stop_reason");
            int bD15 = gvf.bD(bC, "required_network_type");
            int bD16 = gvf.bD(bC, "required_network_request");
            int bD17 = gvf.bD(bC, "requires_charging");
            int bD18 = gvf.bD(bC, "requires_device_idle");
            int bD19 = gvf.bD(bC, "requires_battery_not_low");
            int bD20 = gvf.bD(bC, "requires_storage_not_low");
            int bD21 = gvf.bD(bC, "trigger_content_update_delay");
            int bD22 = gvf.bD(bC, "trigger_max_content_delay");
            int bD23 = gvf.bD(bC, "content_uri_triggers");
            HashMap hashMap = new HashMap();
            int i7 = bD13;
            HashMap hashMap2 = new HashMap();
            while (bC.moveToNext()) {
                int i8 = bD12;
                String string2 = bC.getString(bD);
                if (!hashMap.containsKey(string2)) {
                    i6 = bD11;
                    hashMap.put(string2, new ArrayList());
                } else {
                    i6 = bD11;
                }
                String string3 = bC.getString(bD);
                if (!hashMap2.containsKey(string3)) {
                    hashMap2.put(string3, new ArrayList());
                }
                bD12 = i8;
                bD11 = i6;
            }
            int i9 = bD11;
            int i10 = bD12;
            int i11 = -1;
            bC.moveToPosition(-1);
            ((gxz) w).b(hashMap);
            ((gxz) w).a(hashMap2);
            ArrayList arrayList3 = new ArrayList(bC.getCount());
            while (bC.moveToNext()) {
                if (bD == i11) {
                    string = null;
                } else {
                    string = bC.getString(bD);
                }
                if (bD2 == i11) {
                    C = null;
                } else {
                    C = gvf.C(bC.getInt(bD2));
                }
                if (bD3 == i11) {
                    c = null;
                } else {
                    c = gsi.c(bC.getBlob(bD3));
                }
                long j8 = 0;
                if (bD4 == i11) {
                    j = 0;
                } else {
                    j = bC.getLong(bD4);
                }
                if (bD5 == i11) {
                    j2 = 0;
                } else {
                    j2 = bC.getLong(bD5);
                }
                if (bD6 == i11) {
                    j3 = 0;
                } else {
                    j3 = bC.getLong(bD6);
                }
                if (bD7 == i11) {
                    i = 0;
                } else {
                    i = bC.getInt(bD7);
                }
                if (bD8 == i11) {
                    A = null;
                } else {
                    A = gvf.A(bC.getInt(bD8));
                }
                if (bD9 == i11) {
                    j4 = 0;
                } else {
                    j4 = bC.getLong(bD9);
                }
                if (bD10 == i11) {
                    i2 = i9;
                    j5 = 0;
                } else {
                    j5 = bC.getLong(bD10);
                    i2 = i9;
                }
                if (i2 == i11) {
                    i3 = 0;
                } else {
                    i3 = bC.getInt(i2);
                }
                int i12 = i10;
                int i13 = i2;
                if (i12 == i11) {
                    i4 = 0;
                } else {
                    i4 = bC.getInt(i12);
                }
                int i14 = i7;
                if (i14 == i11) {
                    j6 = 0;
                } else {
                    j6 = bC.getLong(i14);
                }
                int i15 = bD14;
                if (i15 == i11) {
                    i5 = 0;
                } else {
                    i5 = bC.getInt(i15);
                }
                int i16 = bD15;
                if (i16 == i11) {
                    I = 0;
                } else {
                    I = gvf.I(bC.getInt(i16));
                }
                int i17 = bD16;
                if (i17 == i11) {
                    D = null;
                } else {
                    D = gvf.D(bC.getBlob(i17));
                }
                int i18 = bD17;
                if (i18 == i11 || bC.getInt(i18) == 0) {
                    z = false;
                } else {
                    z = true;
                }
                int i19 = bD18;
                if (i19 == i11 || bC.getInt(i19) == 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                int i20 = bD19;
                if (i20 == i11 || bC.getInt(i20) == 0) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                int i21 = bD20;
                if (i21 == i11 || bC.getInt(i21) == 0) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                int i22 = bD21;
                if (i22 == i11) {
                    j7 = 0;
                } else {
                    j7 = bC.getLong(i22);
                }
                int i23 = bD22;
                if (i23 != i11) {
                    j8 = bC.getLong(i23);
                }
                long j9 = j8;
                int i24 = bD23;
                if (i24 == i11) {
                    E = null;
                } else {
                    E = gvf.E(bC.getBlob(i24));
                }
                arrayList3.add(new gyr(string, C, c, j, j2, j3, new gsf(D, I, z, z2, z3, z4, j7, j9, E), i, A, j4, j5, i3, i4, j6, i5, (ArrayList) hashMap.get(bC.getString(bD)), (ArrayList) hashMap2.get(bC.getString(bD))));
                i9 = i13;
                i11 = -1;
                i10 = i12;
                i7 = i14;
                bD14 = i15;
                bD15 = i16;
                bD16 = i17;
                bD17 = i18;
                bD18 = i19;
                bD19 = i20;
                bD20 = i21;
                bD21 = i22;
                bD22 = i23;
                bD23 = i24;
            }
            bC.close();
            Object a = tbVar.a(arrayList3);
            a.getClass();
            return a;
        } catch (Throwable th) {
            bC.close();
            throw th;
        }
    }
}
