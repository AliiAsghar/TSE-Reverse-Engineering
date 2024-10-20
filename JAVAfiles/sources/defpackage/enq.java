package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: PG */
/* loaded from: classes.dex */
public class enq extends Service implements enm {
    private final ktk a = new ktk((enm) this);

    @Override // defpackage.enm
    public final enh N() {
        return (enh) this.a.b;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        intent.getClass();
        this.a.h(enf.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.a.h(enf.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        ktk ktkVar = this.a;
        ktkVar.h(enf.ON_STOP);
        ktkVar.h(enf.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    @armg
    public final void onStart(Intent intent, int i) {
        this.a.h(enf.ON_START);
        super.onStart(intent, i);
    }
}
