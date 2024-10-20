package defpackage;

import android.content.Context;
import android.os.Looper;
import android.widget.Toast;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abay {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/ui/toastpresenter/ToastPresenter");
    private final Context b;
    private final armf c;

    public abay(Context context, armf armfVar) {
        context.getClass();
        armfVar.getClass();
        this.b = context;
        this.c = armfVar;
    }

    public final Toast a(int i, boolean z) {
        String string = this.b.getString(i);
        string.getClass();
        return b(string, z);
    }

    public final Toast b(CharSequence charSequence, boolean z) {
        CharSequence charSequence2;
        charSequence.getClass();
        alvi alviVar = a;
        alvg alvgVar = (alvg) alviVar.g().h("com/google/android/apps/messaging/ui/toastpresenter/ToastPresenter", "showToastAtBottom", 33, "ToastPresenter.kt");
        if (z) {
            charSequence2 = yyb.bh(charSequence);
        } else {
            charSequence2 = charSequence;
        }
        alvgVar.t("Showing toast with message: %s", charSequence2);
        Toast makeText = Toast.makeText(this.b, charSequence, 1);
        makeText.setGravity(81, 0, 0);
        makeText.getClass();
        Object orElse = ((Optional) this.c.b()).map(new aaky(aams.q, 15)).orElse(false);
        orElse.getClass();
        if (((Boolean) orElse).booleanValue()) {
            ((alvg) alviVar.g().h("com/google/android/apps/messaging/ui/toastpresenter/ToastPresenter", "showToastInternal", 44, "ToastPresenter.kt")).q("Suppressing toast for Retail Mode device");
        } else {
            aaxu aaxuVar = new aaxu(makeText, 7);
            if (!d.F(Looper.myLooper(), Looper.getMainLooper())) {
                aiut.e(aaxuVar);
            } else {
                aaxuVar.run();
            }
        }
        return makeText;
    }
}
