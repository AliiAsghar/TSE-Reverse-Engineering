package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abiy extends abja {
    final /* synthetic */ Boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abiy(abjc abjcVar, String str, Boolean bool) {
        super(abjcVar, str);
        this.a = bool;
    }

    @Override // defpackage.abja
    protected final /* bridge */ /* synthetic */ Object b(SharedPreferences sharedPreferences) {
        if (sharedPreferences.contains(this.c)) {
            return Boolean.valueOf(sharedPreferences.getBoolean(this.c, false));
        }
        return this.a;
    }

    @Override // defpackage.abja
    protected final /* bridge */ /* synthetic */ void c(SharedPreferences.Editor editor, Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            editor.putBoolean(this.c, bool.booleanValue());
            return;
        }
        throw new IllegalArgumentException("null cannot be written for Boolean");
    }
}
