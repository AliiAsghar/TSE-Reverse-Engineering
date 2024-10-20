package defpackage;

import android.content.SharedPreferences;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ahaj implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ahaj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                Object obj = this.a;
                synchronized (((ahtr) obj).b) {
                    ((ahtr) obj).c = null;
                    ahtp.e();
                }
                synchronized (obj) {
                    Iterator it = ((ahtr) obj).d.iterator();
                    while (it.hasNext()) {
                        ((ahsq) it.next()).a();
                    }
                }
                return;
            }
            if ("rcs_terms_and_conditions_message".equals(str) && sharedPreferences.contains(str)) {
                ((aaza) this.a).b();
                return;
            }
            return;
        }
        if (str != null) {
            ahan ahanVar = (ahan) this.a;
            if (ahanVar.f.get()) {
                ahanVar.h(str, str);
                ahanVar.h("", str);
            }
        }
    }
}
