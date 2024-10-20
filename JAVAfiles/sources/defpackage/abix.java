package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abix extends abja {
    final /* synthetic */ String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abix(abjc abjcVar, String str, String str2) {
        super(abjcVar, str);
        this.a = str2;
    }

    @Override // defpackage.abja
    protected final /* bridge */ /* synthetic */ Object b(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(this.c, this.a);
    }

    @Override // defpackage.abja
    protected final /* bridge */ /* synthetic */ void c(SharedPreferences.Editor editor, Object obj) {
        String str = (String) obj;
        if (str != null) {
            editor.putString(this.c, str);
            return;
        }
        throw new IllegalArgumentException("null cannot be written for String");
    }
}
