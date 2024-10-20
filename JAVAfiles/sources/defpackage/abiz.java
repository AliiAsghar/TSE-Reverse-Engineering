package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abiz extends abja {
    final /* synthetic */ Integer a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abiz(abjc abjcVar, String str, Integer num) {
        super(abjcVar, str);
        this.a = num;
    }

    @Override // defpackage.abja
    protected final /* bridge */ /* synthetic */ Object b(SharedPreferences sharedPreferences) {
        if (sharedPreferences.contains(this.c)) {
            return Integer.valueOf(sharedPreferences.getInt(this.c, 0));
        }
        return this.a;
    }

    @Override // defpackage.abja
    protected final /* bridge */ /* synthetic */ void c(SharedPreferences.Editor editor, Object obj) {
        Integer num = (Integer) obj;
        if (num != null) {
            editor.putInt(this.c, num.intValue());
            return;
        }
        throw new IllegalArgumentException("null cannot be written for Integer");
    }
}
