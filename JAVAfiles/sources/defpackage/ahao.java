package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahao implements ahah {
    private final SharedPreferences a;
    private final String b;

    public ahao(Context context, String str) {
        String concat = String.valueOf(context.getPackageName()).concat(String.valueOf(str));
        this.b = concat;
        this.a = context.getSharedPreferences(concat, 0);
    }

    @Override // defpackage.ahah
    public final SharedPreferences.Editor a() {
        return this.a.edit();
    }

    @Override // defpackage.alhr
    public final /* synthetic */ Object get() {
        return this.a;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.ahah
    public final /* synthetic */ void b(ahjj ahjjVar) {
    }
}
