package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sk extends se {
    @Override // defpackage.se
    public final /* bridge */ /* synthetic */ Intent a(Context context, Object obj) {
        String[] strArr = (String[]) obj;
        strArr.getClass();
        Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
        putExtra.getClass();
        return putExtra;
    }

    @Override // defpackage.se
    public final /* bridge */ /* synthetic */ Object b(int i, Intent intent) {
        boolean z;
        if (i != -1 || intent == null) {
            return arnw.a;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra != null && stringArrayExtra != null) {
            ArrayList arrayList = new ArrayList(intArrayExtra.length);
            for (int i2 : intArrayExtra) {
                if (i2 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(Boolean.valueOf(z));
            }
            return aqjn.q(aqjn.aA(aqil.o(stringArrayExtra), arrayList));
        }
        return arnw.a;
    }

    @Override // defpackage.se
    public final /* bridge */ /* synthetic */ efu c(Context context, Object obj) {
        String[] strArr = (String[]) obj;
        strArr.getClass();
        if (strArr.length == 0) {
            return new efu(arnw.a);
        }
        for (String str : strArr) {
            if (egl.e(context, str) != 0) {
                return null;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(arrn.r(aqjn.i(strArr.length), 16));
        for (String str2 : strArr) {
            armo armoVar = new armo(str2, true);
            linkedHashMap.put(armoVar.a, armoVar.b);
        }
        return new efu(linkedHashMap);
    }
}
