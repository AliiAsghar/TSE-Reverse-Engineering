package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aegf extends aefp {
    public aegf() {
        super(abjr.SHARED_PREFERENCES_DELETION, 10L);
    }

    @Override // defpackage.aefp
    public final aefu a(aefu aefuVar, algw algwVar) {
        abkb abkbVar;
        if (algwVar.f() && ((abke) algwVar.b()).b == 6) {
            Context context = aefuVar.b;
            abke abkeVar = (abke) algwVar.b();
            if (abkeVar.b == 6) {
                abkbVar = (abkb) abkeVar.c;
            } else {
                abkbVar = abkb.a;
            }
            if (abkbVar.b) {
                context = context.createDeviceProtectedStorageContext();
            }
            boolean z = false;
            SharedPreferences sharedPreferences = context.getSharedPreferences(abkbVar.c, 0);
            apax<String> apaxVar = abkbVar.d;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            for (String str : apaxVar) {
                if (sharedPreferences.contains(str)) {
                    edit.remove(str);
                    z = true;
                }
            }
            if (z && edit.commit()) {
                Log.i("SPDeletionFix", "Preferences were deleted.");
            } else {
                Log.i("SPDeletionFix", "No preferences were deleted.");
            }
            return aefuVar;
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.aefp
    public final String b() {
        return "SHARED_PREFERENCES_DELETION";
    }
}
