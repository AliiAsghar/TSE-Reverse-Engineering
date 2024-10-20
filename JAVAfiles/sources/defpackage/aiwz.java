package defpackage;

import android.database.Cursor;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import j$.time.Duration;
import j$.time.Instant;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aiwz implements aixs {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ aiwz(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aixt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [j$.time.temporal.Temporal, java.lang.Object] */
    @Override // defpackage.aixs
    public final Object a(agrk agrkVar) {
        char c;
        Instant instant = null;
        if (this.b != 0) {
            agrk agrkVar2 = new agrk((short[]) null);
            agrkVar2.x("SELECT key_id, value");
            agrkVar2.x(" FROM GlobalValues");
            agrkVar2.x(" WHERE key_id IN (?, ?)");
            agrkVar2.z("initial_enabled_time");
            agrkVar2.z("start_disabled_time");
            Cursor H = agrkVar.H(agrkVar2.J());
            Instant instant2 = null;
            Instant instant3 = null;
            while (H.moveToNext()) {
                try {
                    String string = H.getString(H.getColumnIndexOrThrow("key_id"));
                    int hashCode = string.hashCode();
                    if (hashCode != -1579654618) {
                        if (hashCode == -345489005 && string.equals("start_disabled_time")) {
                            c = 1;
                        }
                        c = 65535;
                    } else {
                        if (string.equals("initial_enabled_time")) {
                            c = 0;
                        }
                        c = 65535;
                    }
                    if (c != 0) {
                        if (c == 1) {
                            instant2 = Instant.parse(H.getString(H.getColumnIndexOrThrow(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE)));
                        }
                    } else {
                        instant3 = Instant.parse(H.getString(H.getColumnIndexOrThrow(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE)));
                    }
                } catch (Throwable th) {
                    if (H != null) {
                        try {
                            H.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            if (H != null) {
                H.close();
            }
            ?? r0 = this.a;
            if (instant2 != null) {
                if (Duration.between(instant2, r0).compareTo(aidd.b) <= 0) {
                    instant = instant3;
                }
                StringBuilder sb = new StringBuilder();
                ArrayList arrayList = new ArrayList();
                sb.append("key_id = ?");
                arrayList.add("start_disabled_time");
                agrkVar.G(ahmc.am("GlobalValues", sb, arrayList));
                instant3 = instant;
            }
            if (instant3 == null) {
                agrkVar.w("GlobalValues", ahxe.c("initial_enabled_time", ((Instant) r0).toString()), 5);
                return r0;
            }
            return instant3;
        }
        this.a.a(agrkVar);
        return null;
    }
}
