package defpackage;

import com.google.common.util.concurrent.SettableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aknm extends aqst {
    final aktr a;
    final String b;

    public aknm(aqru aqruVar, String str, aktr aktrVar) {
        super(aqruVar);
        this.b = str;
        this.a = aktrVar;
    }

    @Override // defpackage.aqsu, defpackage.aqru
    public final void a(apsd apsdVar, aqut aqutVar) {
        aktr.d(this.a, new adub(this, apsdVar, aqutVar, 18)).run();
    }

    public final /* synthetic */ void b(apsd apsdVar, aqut aqutVar) {
        akrh e = aktp.e(this.b);
        try {
            SettableFuture create = SettableFuture.create();
            e.b(create);
            super.a(new aknn(apsdVar, create), aqutVar);
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
