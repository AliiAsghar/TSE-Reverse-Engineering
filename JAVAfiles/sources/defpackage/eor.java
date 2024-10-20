package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eor {
    private final eph a = new eph();

    public final AutoCloseable j(String str) {
        AutoCloseable autoCloseable;
        eph ephVar = this.a;
        synchronized (ephVar.d) {
            autoCloseable = (AutoCloseable) ephVar.a.get(str);
        }
        return autoCloseable;
    }

    public final void k(AutoCloseable autoCloseable) {
        eph ephVar = this.a;
        if (ephVar.c) {
            eph.a(autoCloseable);
            return;
        }
        synchronized (ephVar.d) {
            ephVar.b.add(autoCloseable);
        }
    }

    public final void l(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        eph ephVar = this.a;
        if (ephVar.c) {
            eph.a(autoCloseable);
            return;
        }
        synchronized (ephVar.d) {
            autoCloseable2 = (AutoCloseable) ephVar.a.put(str, autoCloseable);
        }
        eph.a(autoCloseable2);
    }

    public final void m() {
        eph ephVar = this.a;
        if (!ephVar.c) {
            ephVar.c = true;
            synchronized (ephVar.d) {
                Iterator it = ephVar.a.values().iterator();
                while (it.hasNext()) {
                    eph.a((AutoCloseable) it.next());
                }
                Iterator it2 = ephVar.b.iterator();
                while (it2.hasNext()) {
                    eph.a((AutoCloseable) it2.next());
                }
                ephVar.b.clear();
            }
        }
        gi();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void gi() {
    }
}
