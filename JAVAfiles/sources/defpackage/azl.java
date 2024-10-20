package defpackage;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class azl extends arrm implements arqr<cps, Boolean> {
    public azl(Object obj) {
        super(1, obj, azk.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        axu a;
        Integer valueOf;
        KeyEvent keyEvent = ((cps) obj).a;
        azk azkVar = (azk) this.e;
        boolean z = true;
        dmw dmwVar = null;
        if (keyEvent.getAction() == 0 && !Character.isISOControl(keyEvent.getUnicodeChar())) {
            axn axnVar = azkVar.h;
            int unicodeChar = keyEvent.getUnicodeChar();
            if ((Integer.MIN_VALUE & unicodeChar) != 0) {
                axnVar.a = Integer.valueOf(unicodeChar & Integer.MAX_VALUE);
                valueOf = null;
            } else {
                Integer num = axnVar.a;
                if (num != null) {
                    axnVar.a = null;
                    valueOf = Integer.valueOf(KeyCharacterMap.getDeadChar(num.intValue(), unicodeChar));
                    if (valueOf.intValue() == 0) {
                        valueOf = null;
                    }
                    if (valueOf == null) {
                        valueOf = Integer.valueOf(unicodeChar);
                    }
                } else {
                    valueOf = Integer.valueOf(unicodeChar);
                }
            }
            if (valueOf != null) {
                dmwVar = new dmw(new StringBuilder().appendCodePoint(valueOf.intValue()).toString(), 1);
            }
        }
        if (dmwVar != null) {
            azkVar.a(dmwVar);
            azkVar.e.a();
        } else if (!a.bA(cpt.a(keyEvent), 2) || (a = azkVar.i.a(keyEvent)) == null) {
            z = false;
        } else {
            arrx arrxVar = new arrx();
            arrxVar.a = true;
            azj azjVar = new azj(a, azkVar, arrxVar);
            bey beyVar = new bey(azkVar.c, azkVar.f, azkVar.a.d(), azkVar.e);
            azjVar.a(beyVar);
            if (!a.bB(beyVar.c, azkVar.c.b) || !d.F(beyVar.d, azkVar.c.a)) {
                azkVar.j.a(beyVar.y());
            }
            bam bamVar = azkVar.g;
            if (bamVar != null) {
                bamVar.a();
            }
            z = arrxVar.a;
        }
        return Boolean.valueOf(z);
    }
}
