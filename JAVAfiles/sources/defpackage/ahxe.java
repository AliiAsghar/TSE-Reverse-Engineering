package defpackage;

import android.content.ContentValues;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import j$.util.Optional;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ahxe<TypeT, ResponseT> {
    public ahxe() {
    }

    public static String a(List list, boolean z, List list2) {
        if (list.isEmpty()) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z) {
                str = "places.".concat(String.valueOf(str));
            }
            arrayList.add(str);
        }
        String str2 = "attributions";
        if (!list.contains("attributions")) {
            if (true == z) {
                str2 = "places.attributions";
            }
            arrayList.add(str2);
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(((ahxn) it2.next()).toString());
        }
        return new algs(",").d(arrayList);
    }

    public static String b(List list, List list2) {
        return a(list, true, list2);
    }

    public static ContentValues c(String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("key_id", str);
        contentValues.put(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE, str2);
        return contentValues;
    }

    public static ContentValues d(aidn aidnVar, int i, long j, aidj aidjVar, Optional optional) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("customer_id", Long.valueOf(aidnVar.a));
        contentValues.put("project_id", Long.valueOf(aidnVar.b));
        contentValues.put("metric_id", Long.valueOf(aidnVar.c));
        contentValues.put("report_id", Long.valueOf(aidnVar.d));
        contentValues.put("day_index", Integer.valueOf(i));
        contentValues.put("system_profile_hash", Long.valueOf(j));
        contentValues.put("event_vector", aidjVar.b());
        if (optional.isEmpty()) {
            contentValues.putNull("aggregate_value");
        } else {
            contentValues.put("aggregate_value", ((aoyj) optional.get()).toByteArray());
        }
        return contentValues;
    }

    public static ajna e() {
        try {
            byte[] bArr = aicu.a;
            byte[] bArr2 = aicu.c;
            anrj.a();
            return new ajna((anmv) annb.d(bArr).h(anue.e, anmv.class), (anmv) annb.d(bArr2).h(anue.e, anmv.class));
        } catch (GeneralSecurityException e) {
            throw new AssertionError("Failed to create TinkEncrypter", e);
        }
    }

    public static agrk f(aidn aidnVar, int i, aidj aidjVar, long j, long j2) {
        agrk agrkVar = new agrk((short[]) null);
        agrkVar.x("UPDATE AggregateStore SET system_profile_hash = ? ");
        agrkVar.y(Long.valueOf(j2));
        agrkVar.x(" WHERE customer_id = ?");
        agrkVar.y(Long.valueOf(aidnVar.a));
        agrkVar.x(" AND project_id = ?");
        agrkVar.y(Long.valueOf(aidnVar.b));
        agrkVar.x(" AND metric_id = ?");
        agrkVar.y(Long.valueOf(aidnVar.c));
        agrkVar.x(" AND report_id = ?");
        agrkVar.y(Long.valueOf(aidnVar.d));
        agrkVar.x(" AND day_index = ?");
        agrkVar.y(Long.valueOf(i));
        agrkVar.x(" AND event_vector = ?");
        agrkVar.z(aidjVar.b());
        agrkVar.x(" AND system_profile_hash = ?");
        agrkVar.y(Long.valueOf(j));
        return agrkVar.J();
    }

    public ahxe(byte[] bArr) {
    }
}
