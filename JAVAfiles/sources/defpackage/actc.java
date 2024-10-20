package defpackage;

import android.telephony.TelephonyManager;
import com.google.android.ims.filetransfer.http.runnable.GbaBootstrapAuthenticationException;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.Base64;

/* compiled from: PG */
/* loaded from: classes.dex */
final class actc extends TelephonyManager.BootstrapAuthenticationCallback {
    final /* synthetic */ SettableFuture a;
    final /* synthetic */ actf b;

    public actc(actf actfVar, SettableFuture settableFuture) {
        this.a = settableFuture;
        this.b = actfVar;
    }

    public final void onAuthenticationFailure(int i) {
        aozy createBuilder = apgh.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        actf actfVar = this.b;
        apag apagVar = createBuilder.b;
        apgh apghVar = (apgh) apagVar;
        apghVar.c = 1;
        apghVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        int aD = a.aD(i);
        apag apagVar2 = createBuilder.b;
        apgh apghVar2 = (apgh) apagVar2;
        apghVar2.d = 3;
        apghVar2.b |= 2;
        if (aD == 0) {
            aD = 1;
        }
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        acto actoVar = actfVar.a;
        apgh apghVar3 = (apgh) createBuilder.b;
        apghVar3.e = aD - 1;
        apghVar3.b |= 4;
        actoVar.a(4, (apgh) createBuilder.s());
        advr.g("[SR] GBA authentication FAILURE: %d.", Integer.valueOf(i));
        this.a.setException(new GbaBootstrapAuthenticationException(i));
    }

    public final void onKeysAvailable(byte[] bArr, String str) {
        aozy createBuilder = apgh.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        actf actfVar = this.b;
        apag apagVar = createBuilder.b;
        apgh apghVar = (apgh) apagVar;
        apghVar.c = 1;
        apghVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        acto actoVar = actfVar.a;
        apgh apghVar2 = (apgh) createBuilder.b;
        apghVar2.d = 1;
        apghVar2.b |= 2;
        actoVar.a(3, (apgh) createBuilder.s());
        advr.k("[SR] GBA authentication SUCCESS: obtained gbaKey and btId.", new Object[0]);
        this.a.set(new acsk(new acsl(str), Base64.getEncoder().encodeToString(bArr)));
    }
}
