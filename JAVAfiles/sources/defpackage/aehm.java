package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import j$.util.DesugarCollections;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aehm {
    public static final alvi a = alvi.m("com/google/android/libraries/communications/mobileconfiguration/storage/BugleConfigurationManagerImpl");
    public final Context b;
    public final anca c;
    private final Uri d;

    public aehm(Context context, Uri uri, anca ancaVar) {
        this.b = context;
        this.d = uri;
        this.c = ancaVar;
    }

    public final Bundle a(String str, String str2, Optional optional) {
        Bundle bundle = new Bundle();
        bundle.putString("storage_file_name", "bugle_mobile_configuration");
        bundle.putString("preference_key", str2);
        optional.ifPresent(new adoj(bundle, 12));
        try {
            return this.b.getContentResolver().call(this.d, str, "STRING", bundle);
        } catch (IllegalArgumentException | IllegalStateException e) {
            ((alvg) ((alvg) ((alvg) a.i()).g(e)).h("com/google/android/libraries/communications/mobileconfiguration/storage/BugleConfigurationManagerImpl", "callContentProvider", 'J', "BugleConfigurationManagerImpl.java")).q("error in callContentProvider");
            return null;
        }
    }

    public final Optional b() {
        Bundle a2 = a("GET", "bugle_all_mobile_configurations", Optional.empty());
        if (a2 != null && !a2.containsKey("result_error_key")) {
            try {
                return Optional.of(alor.j(DesugarCollections.unmodifiableMap(((aehp) uhy.a(a2.getString("preference_key"), aehp.a)).b)));
            } catch (apba unused) {
                ((alvg) ((alvg) a.i()).h("com/google/android/libraries/communications/mobileconfiguration/storage/BugleConfigurationManagerImpl", "getAllConfigurationData", 118, "BugleConfigurationManagerImpl.java")).q("getAllConfigurationData: error decoding string to proto");
                return Optional.empty();
            }
        }
        ((alvg) ((alvg) a.i()).h("com/google/android/libraries/communications/mobileconfiguration/storage/BugleConfigurationManagerImpl", "getAllConfigurationData", 107, "BugleConfigurationManagerImpl.java")).q("getAllConfigurationData: error calling content provider");
        return Optional.empty();
    }

    public final Optional c(String str) {
        Bundle a2 = a("GET", str, Optional.empty());
        if (a2 != null && !a2.containsKey("result_error_key")) {
            try {
                aehn aehnVar = (aehn) uhy.a(a2.getString("preference_key"), aehn.a);
                if (aehnVar.equals(aehn.a)) {
                    return Optional.empty();
                }
                return Optional.of(aehnVar);
            } catch (apba unused) {
                ((alvg) ((alvg) a.i()).h("com/google/android/libraries/communications/mobileconfiguration/storage/BugleConfigurationManagerImpl", "getConfigurationData", 97, "BugleConfigurationManagerImpl.java")).q("getConfigurationData: error decoding string to proto");
                return Optional.empty();
            }
        }
        ((alvg) ((alvg) a.i()).h("com/google/android/libraries/communications/mobileconfiguration/storage/BugleConfigurationManagerImpl", "getConfigurationData", 84, "BugleConfigurationManagerImpl.java")).q("getConfigurationData: error calling content provider");
        return Optional.empty();
    }

    public final void d(String str, aehn aehnVar) {
        Bundle a2 = a("PUT", str, Optional.of(uhy.b(aehnVar)));
        if (a2 != null && !a2.containsKey("result_error_key")) {
            return;
        }
        ((alvg) ((alvg) a.i()).h("com/google/android/libraries/communications/mobileconfiguration/storage/BugleConfigurationManagerImpl", "putConfigurationData", 155, "BugleConfigurationManagerImpl.java")).q("putConfigurationData: error calling content provider");
        throw new aehc();
    }
}
