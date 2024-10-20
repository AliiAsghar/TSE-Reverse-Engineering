package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ezn implements fbh {
    private final Context a;
    private final fex b;
    private final ffj c = ffj.a;

    public ezn(Context context) {
        this.a = context;
        this.b = new fex(context);
    }

    @Override // defpackage.fbh
    public final fbd[] a(Handler handler, faa faaVar, faa faaVar2, faa faaVar3, faa faaVar4) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new fjw(this.a, this.b, this.c, handler, faaVar));
        fcr fcrVar = new fcr(this.a);
        dzg.d(!fcrVar.c);
        fcrVar.c = true;
        if (fcrVar.f == null) {
            fcrVar.f = new kkc(new esr[0]);
        }
        if (fcrVar.e == null) {
            fcrVar.e = new fcp(fcrVar.a);
        }
        arrayList.add(new fcz(this.a, this.b, this.c, handler, faaVar2, new fcx(fcrVar)));
        arrayList.add(new fil(faaVar3, handler.getLooper()));
        arrayList.add(new ffu(faaVar4, handler.getLooper()));
        arrayList.add(new fkq());
        arrayList.add(new feo(feh.a));
        return (fbd[]) arrayList.toArray(new fbd[0]);
    }
}
