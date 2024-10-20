package defpackage;

import android.view.View;
import androidx.preference.SwitchPreferenceCompat;
import com.google.android.apps.messaging.R;
import com.google.android.material.snackbar.Snackbar;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lqq {
    public final armf a;
    public final armf b;
    public final armf c;
    public final arwe d;
    public final Optional e;
    public SwitchPreferenceCompat f;
    public final akbp g;

    public lqq(armf armfVar, armf armfVar2, armf armfVar3, arwe arweVar, Optional optional) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        arweVar.getClass();
        this.a = armfVar;
        this.b = armfVar2;
        this.c = armfVar3;
        this.d = arweVar;
        this.e = optional;
        this.g = new akbp<Boolean, Void>() { // from class: lqq.1
            @Override // defpackage.akbp
            public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                SwitchPreferenceCompat switchPreferenceCompat = lqq.this.f;
                if (switchPreferenceCompat != null) {
                    switchPreferenceCompat.G(true);
                }
                SwitchPreferenceCompat switchPreferenceCompat2 = lqq.this.f;
                if (switchPreferenceCompat2 != null) {
                    switchPreferenceCompat2.k(!booleanValue);
                }
            }

            @Override // defpackage.akbp
            public final /* bridge */ /* synthetic */ void b(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                SwitchPreferenceCompat switchPreferenceCompat = lqq.this.f;
                if (switchPreferenceCompat != null) {
                    switchPreferenceCompat.G(false);
                }
                SwitchPreferenceCompat switchPreferenceCompat2 = lqq.this.f;
                if (switchPreferenceCompat2 != null) {
                    switchPreferenceCompat2.k(booleanValue);
                }
            }

            @Override // defpackage.akbp
            public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
                int i;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                SwitchPreferenceCompat switchPreferenceCompat = lqq.this.f;
                if (switchPreferenceCompat != null) {
                    switchPreferenceCompat.G(true);
                }
                View rootView = ((lqo) lqq.this.a.b()).L().getRootView();
                lqo lqoVar = (lqo) lqq.this.a.b();
                if (true != booleanValue) {
                    i = R.string.gemini_chat_archived;
                } else {
                    i = R.string.gemini_chat_restored;
                }
                Snackbar.q(rootView, lqoVar.T(i, ((vni) lqq.this.e.get()).n()), -1).i();
            }
        };
    }
}
