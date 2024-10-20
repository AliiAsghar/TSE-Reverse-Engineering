package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class abja implements abjd {
    final abjc b;
    final String c;

    /* JADX INFO: Access modifiers changed from: protected */
    public abja(abjc abjcVar, String str) {
        this.b = abjcVar;
        this.c = str;
    }

    @Override // defpackage.abjd
    public final String a() {
        return this.c;
    }

    protected abstract Object b(SharedPreferences sharedPreferences);

    protected abstract void c(SharedPreferences.Editor editor, Object obj);

    public Object d() {
        return b(this.b.h());
    }

    public final void e(Object obj) {
        SharedPreferences.Editor edit = this.b.h().edit();
        c(edit, obj);
        abjc.i(edit);
    }
}
