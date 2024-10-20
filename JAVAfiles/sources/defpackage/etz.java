package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
final class etz implements eua {
    @Override // defpackage.eua
    public final void a(String str, String str2, Throwable th) {
        Log.d(str, eub.a(str2, th));
    }

    @Override // defpackage.eua
    public final void b(String str, String str2, Throwable th) {
        Log.e(str, eub.a(str2, th));
    }

    @Override // defpackage.eua
    public final void c(String str, String str2, Throwable th) {
        Log.w(str, eub.a(str2, th));
    }
}
