package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiwp {
    public final Context a;
    public final Executor b;
    public final String c;
    public final Set d;
    public SharedPreferences e;
    public final asqc f;

    public aiwp(aiwn aiwnVar) {
        this.a = aiwnVar.a;
        this.b = aiwnVar.b;
        this.c = aiwnVar.c;
        this.d = aiwnVar.d;
        this.f = aiwnVar.e;
    }

    public static aiwn a(Context context, Executor executor) {
        return new aiwn(context.getApplicationContext(), executor);
    }
}
