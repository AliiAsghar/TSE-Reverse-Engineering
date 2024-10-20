package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class akse implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ akse(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences$OnSharedPreferenceChangeListener, java.lang.Object] */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (this.d != 0) {
            if (d.F(str, this.a)) {
                Object obj = this.c;
                jbt jbtVar = (jbt) this.b;
                qjh.l(jbtVar.b, null, new gbv((arzu) obj, jbtVar, (arpe) null, 16), 3);
                return;
            }
            return;
        }
        ?? r0 = this.b;
        if (!akqj.u()) {
            akrc b = ((aksr) this.a).b((String) this.c);
            try {
                r0.onSharedPreferenceChanged(sharedPreferences, str);
                b.close();
                return;
            } catch (Throwable th) {
                try {
                    b.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        r0.onSharedPreferenceChanged(sharedPreferences, str);
    }
}
