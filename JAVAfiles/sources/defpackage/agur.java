package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agur {
    private final Context e;
    private ahan f = null;
    public static final alvi a = alvi.m("com/google/android/libraries/inputmethod/emoji/data/EmojiVariantPreferencesBackupHelper");
    public static final algs b = algs.c(',');
    public static final anna d = anna.e(',');
    public static final agyb c = agyd.d("enable_emoji_variant_preferences_backup");

    public agur(Context context) {
        this.e = context;
    }

    public final ahan a() {
        if (this.f == null) {
            this.f = ahan.d(this.e);
        }
        return this.f;
    }
}
