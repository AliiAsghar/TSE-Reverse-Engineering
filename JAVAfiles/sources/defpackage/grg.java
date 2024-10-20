package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public class grg implements gre {
    public final WindowLayoutComponent a;
    private final goq b;
    private final ReentrantLock c = new ReentrantLock();
    private final Map d = new LinkedHashMap();
    private final Map e = new LinkedHashMap();
    private final Map f = new LinkedHashMap();

    public grg(WindowLayoutComponent windowLayoutComponent, goq goqVar) {
        this.a = windowLayoutComponent;
        this.b = goqVar;
    }

    @Override // defpackage.gre
    public void a(ecd ecdVar) {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            Context context = (Context) this.e.get(ecdVar);
            if (context == null) {
                return;
            }
            MulticastConsumer multicastConsumer = (MulticastConsumer) this.d.get(context);
            if (multicastConsumer != null) {
                ReentrantLock reentrantLock2 = multicastConsumer.a;
                reentrantLock2.lock();
                try {
                    multicastConsumer.b.remove(ecdVar);
                    reentrantLock2.unlock();
                    this.e.remove(ecdVar);
                    if (multicastConsumer.b.isEmpty()) {
                        this.d.remove(context);
                        gop gopVar = (gop) this.f.remove(multicastConsumer);
                        if (gopVar != null) {
                            ((Method) gopVar.c).invoke(gopVar.a, gopVar.b);
                        }
                    }
                } catch (Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.gre
    public void b(Context context, ecd ecdVar) {
        arnb arnbVar;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            MulticastConsumer multicastConsumer = (MulticastConsumer) this.d.get(context);
            if (multicastConsumer != null) {
                multicastConsumer.a(ecdVar);
                this.e.put(ecdVar, context);
                arnbVar = arnb.a;
            } else {
                arnbVar = null;
            }
            if (arnbVar == null) {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(context);
                this.d.put(context, multicastConsumer2);
                this.e.put(ecdVar, context);
                multicastConsumer2.a(ecdVar);
                goq goqVar = this.b;
                WindowLayoutComponent windowLayoutComponent = this.a;
                int i = arsc.a;
                Object c = goqVar.c(new arrh(WindowLayoutInfo.class), new ghu((Object) multicastConsumer2, 2, (char[]) null));
                windowLayoutComponent.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, goqVar.b()).invoke(windowLayoutComponent, context, c);
                this.f.put(multicastConsumer2, new gop(windowLayoutComponent.getClass().getMethod("removeWindowLayoutInfoListener", goqVar.b()), (Object) windowLayoutComponent, c));
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
