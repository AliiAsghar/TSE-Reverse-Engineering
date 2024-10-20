package defpackage;

import android.view.InputDevice;
import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ayz extends arrp implements arqr<cps, Boolean> {
    final /* synthetic */ cij a;
    final /* synthetic */ ayd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayz(cij cijVar, ayd aydVar) {
        super(1);
        this.a = cijVar;
        this.b = aydVar;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        KeyEvent keyEvent = ((cps) obj).a;
        InputDevice device = keyEvent.getDevice();
        boolean z = false;
        if (device != null && device.supportsSource(513) && !device.isVirtual() && a.bA(cpt.a(keyEvent), 2) && keyEvent.getSource() != 257) {
            if (aza.a(keyEvent, 19)) {
                z = this.a.b(5);
            } else if (aza.a(keyEvent, 20)) {
                z = this.a.b(6);
            } else if (aza.a(keyEvent, 21)) {
                z = this.a.b(3);
            } else if (aza.a(keyEvent, 22)) {
                z = this.a.b(4);
            } else if (aza.a(keyEvent, 23)) {
                ddz ddzVar = this.b.c;
                z = true;
                if (ddzVar != null) {
                    ddzVar.b();
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
