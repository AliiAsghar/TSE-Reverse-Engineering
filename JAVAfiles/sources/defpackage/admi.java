package defpackage;

import android.os.Message;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class admi implements acyh, admc {
    @Override // defpackage.acyh
    public String a() {
        throw null;
    }

    @Override // defpackage.acyh
    @Deprecated
    public final boolean e(Message message) {
        return k(message, adjj.MSG_USE_ANDROID_OS_MESSAGE);
    }

    public abstract boolean k(Message message, adjj adjjVar);

    @Override // defpackage.admc
    public final /* bridge */ /* synthetic */ boolean x(Object obj, Object obj2) {
        adjj adjjVar = (adjj) obj;
        arbj arbjVar = (arbj) obj2;
        Message obtain = Message.obtain();
        acyz acyzVar = admf.a;
        if (adom.k()) {
            obtain.what = adjjVar.a();
            if (arbjVar != null) {
                obtain.arg1 = ((Integer) Optional.ofNullable(arbjVar.b).orElse(0)).intValue();
                obtain.arg2 = ((Integer) Optional.ofNullable(arbjVar.c).orElse(0)).intValue();
                Object obj3 = arbjVar.a;
                if (obj3 != null) {
                    obtain.obj = obj3;
                }
            }
        }
        return k(obtain, adjjVar);
    }

    @Override // defpackage.acyh
    public final void d() {
    }
}
