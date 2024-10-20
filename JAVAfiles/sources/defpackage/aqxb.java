package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqxb implements arao {
    final Context a;
    final Executor b;
    final arep c;
    final arep d;
    final aqww e;
    final aqwp f;
    final aqwt g;
    ScheduledExecutorService h;
    Executor i;
    private boolean j;

    public aqxb(aqxa aqxaVar) {
        Context context = aqxaVar.a;
        context.getClass();
        this.a = context;
        aqxaVar.h.getClass();
        Executor executor = aqxaVar.c;
        if (executor == null) {
            if (Build.VERSION.SDK_INT < 28) {
                executor = new ebx(new Handler(context.getMainLooper()), 1, null);
            } else {
                executor = context.getMainExecutor();
            }
        }
        this.b = executor;
        arep arepVar = aqxaVar.d;
        arepVar.getClass();
        this.c = arepVar;
        arep arepVar2 = aqxaVar.b;
        arepVar2.getClass();
        this.d = arepVar2;
        aqww aqwwVar = aqxaVar.e;
        aqwwVar.getClass();
        this.e = aqwwVar;
        aqwp aqwpVar = aqxaVar.f;
        aqwpVar.getClass();
        this.f = aqwpVar;
        aqwt aqwtVar = aqxaVar.g;
        aqwtVar.getClass();
        this.g = aqwtVar;
        aqxaVar.i.getClass();
        this.h = (ScheduledExecutorService) arepVar.a();
        this.i = (Executor) arepVar2.a();
    }

    @Override // defpackage.arao
    public final /* bridge */ /* synthetic */ arau a(SocketAddress socketAddress, aran aranVar, aqrt aqrtVar) {
        if (!this.j) {
            return new aqxf(this, (aqwn) socketAddress, aranVar);
        }
        throw new IllegalStateException("The transport factory is closed.");
    }

    @Override // defpackage.arao
    public final Collection b() {
        return Collections.singleton(aqwn.class);
    }

    @Override // defpackage.arao
    public final ScheduledExecutorService c() {
        return this.h;
    }

    @Override // defpackage.arao, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.j = true;
        this.c.b(this.h);
        this.h = null;
        this.d.b(this.i);
        this.i = null;
    }
}
