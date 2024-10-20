package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pzz implements pzw {
    private final armf a;
    private final ConcurrentHashMap b;
    private final ConcurrentHashMap c;
    private final ConcurrentHashMap d;

    public pzz(armf armfVar) {
        armfVar.getClass();
        this.a = armfVar;
        this.b = new ConcurrentHashMap();
        this.c = new ConcurrentHashMap();
        this.d = new ConcurrentHashMap();
    }

    @Override // defpackage.pzw
    public final pzv a(pzn pznVar) {
        pznVar.getClass();
        return ((pzy) this.a.b()).a(pznVar);
    }

    @Override // defpackage.pzw
    public final qeq b(MessageIdType messageIdType) {
        messageIdType.getClass();
        return ((pzy) this.a.b()).b(messageIdType);
    }

    @Override // defpackage.pzw
    public final Object c(pyz pyzVar, arpe arpeVar) {
        this.b.remove(pyzVar);
        this.c.remove(pyzVar);
        this.d.remove(pyzVar);
        Object c = ((pzy) this.a.b()).c(pyzVar, arpeVar);
        if (c == arpl.a) {
            return c;
        }
        return arnb.a;
    }

    @Override // defpackage.pzw
    public final void d(pyz pyzVar, apwj apwjVar) {
        this.c.put(pyzVar, apwjVar);
        ((pzy) this.a.b()).d(pyzVar, apwjVar);
    }

    @Override // defpackage.pzw
    public final void e(pyz pyzVar, qeq qeqVar) {
        pyzVar.getClass();
        this.b.put(pyzVar, qeqVar);
        ((pzy) this.a.b()).e(pyzVar, qeqVar);
    }

    @Override // defpackage.pzw
    public final void f(pyz pyzVar, Uri uri, String str) {
        ((pzy) this.a.b()).f(pyzVar, uri, str);
    }

    @Override // defpackage.pzw
    public final void g(pyz pyzVar, apwj apwjVar) {
        this.d.put(pyzVar, apwjVar);
        ((pzy) this.a.b()).g(pyzVar, apwjVar);
    }

    @Override // defpackage.pzw
    public final boolean h(MessageIdType messageIdType) {
        messageIdType.getClass();
        return ((pzy) this.a.b()).h(messageIdType);
    }

    @Override // defpackage.pzw
    public final boolean i(pzn pznVar, qep qepVar) {
        pznVar.getClass();
        qepVar.getClass();
        return ((pzy) this.a.b()).i(pznVar, qepVar);
    }

    @Override // defpackage.pzw
    public final boolean j(pzn pznVar, xwb xwbVar) {
        return ((pzy) this.a.b()).j(pznVar, xwbVar);
    }
}
