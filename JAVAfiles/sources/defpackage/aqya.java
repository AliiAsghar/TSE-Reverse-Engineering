package defpackage;

import android.os.IBinder;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqya extends aqyc {
    private final argl d;

    public aqya(IBinder iBinder, Executor executor) {
        super(iBinder);
        this.d = new argl(executor);
    }

    @Override // defpackage.aqyc
    public final void a(int i, aqyg aqygVar) {
        this.d.execute(new wob(this, i, aqygVar.a(), 17, (byte[]) null));
        aqygVar.b();
    }
}
