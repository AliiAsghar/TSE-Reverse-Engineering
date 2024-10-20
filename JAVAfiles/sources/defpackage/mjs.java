package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mjs implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final alpt a;
    private final yyt b;

    public mjs(alpt alptVar, yyt yytVar) {
        this.a = alptVar;
        this.b = yytVar;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (this.a.contains(str)) {
            this.b.y(new mcw(9), "Notify configuration callbacks");
        }
    }
}
