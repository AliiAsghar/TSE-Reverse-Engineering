package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abiw extends abja {
    final /* synthetic */ Long a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abiw(abjc abjcVar, String str, Long l) {
        super(abjcVar, str);
        this.a = l;
    }

    @Override // defpackage.abja
    protected final /* bridge */ /* synthetic */ Object b(SharedPreferences sharedPreferences) {
        if (sharedPreferences.contains(this.c)) {
            return Long.valueOf(sharedPreferences.getLong(this.c, 0L));
        }
        return this.a;
    }

    @Override // defpackage.abja
    protected final /* bridge */ /* synthetic */ void c(SharedPreferences.Editor editor, Object obj) {
        Long l = (Long) obj;
        if (l != null) {
            editor.putLong(this.c, l.longValue());
            return;
        }
        throw new IllegalArgumentException("null cannot be written for Long");
    }
}
