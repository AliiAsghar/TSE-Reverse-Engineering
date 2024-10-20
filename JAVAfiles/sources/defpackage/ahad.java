package defpackage;

import com.google.android.libraries.inputmethod.preferences.ICrossProcessPreferenceClient;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahad extends ICrossProcessPreferenceClient.Stub {
    private final WeakReference a;

    public ahad(ahaf ahafVar) {
        this.a = new WeakReference(ahafVar);
    }

    @Override // com.google.android.libraries.inputmethod.preferences.ICrossProcessPreferenceClient
    public final void onPreferenceChange(byte[] bArr) {
        alpt o;
        ahaf ahafVar = (ahaf) this.a.get();
        if (ahafVar == null) {
            return;
        }
        try {
            ahai ahaiVar = (ahai) apag.parseFrom(ahai.a, bArr, aozs.a());
            synchronized (ahafVar) {
                if (ahji.aN(ahaiVar.c) == 7) {
                    ahafVar.c.remove(ahaiVar.e);
                } else {
                    ahafVar.c.put(ahaiVar.e, ahan.f(ahaiVar));
                }
                o = alpt.o(ahafVar.d);
            }
            ahafVar.d(o, new altx(ahaiVar.e));
        } catch (Exception e) {
            ((alvg) ((alvg) ((alvg) ahaf.a.i()).g(e)).h("com/google/android/libraries/inputmethod/preferences/CrossProcessSharedPreferences$CrossProcessPreferencesClient", "onPreferenceChange", 527, "CrossProcessSharedPreferences.java")).t("Failed to decode %s to PreferenceElem", bArr);
        }
    }

    @Override // com.google.android.libraries.inputmethod.preferences.ICrossProcessPreferenceClient
    public final void onServerDestroy() {
        ahaf ahafVar = (ahaf) this.a.get();
        if (ahafVar == null) {
            return;
        }
        ahafVar.b();
    }
}
