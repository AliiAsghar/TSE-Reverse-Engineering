package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.ProcessPendingMessagesAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rdc {
    public final Object a;

    public rdc(Object obj) {
        this.a = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public final void a(rdc rdcVar) {
        this.a.addAll(rdcVar.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mbl, java.lang.Object] */
    public final void b(String str) {
        this.a.c(str);
    }

    public final akul c(msh mshVar) {
        mshVar.getClass();
        Object orElse = mshVar.e().map(new qwz(new qin(this, 13), 3)).orElse(aktp.ag(pvj.NOT_RCS));
        orElse.getClass();
        return (akul) orElse;
    }

    public final akul d(qrw qrwVar, int i, msh mshVar) {
        albo.N(((alor) this.a).containsKey(qrwVar), "No mapping for %s CapabilitiesGetter", qrwVar);
        qrv qrvVar = (qrv) ((alor) this.a).get(qrwVar);
        qrvVar.getClass();
        return qrvVar.a(i, mshVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void e(qoj qojVar) {
        ((uof) this.a.b()).a(upk.a("contact_recipient_deleted_sync", qojVar));
    }

    public rdc(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public rdc(final yjy yjyVar, final xyt xytVar) {
        this.a = new yao() { // from class: rbj
            @Override // defpackage.yao
            public final void w() {
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                yjy.this.n(new yas(xytVar, atomicBoolean, 1));
                if (atomicBoolean.get()) {
                    new ProcessPendingMessagesAction(9).F(Action.r);
                }
            }
        };
    }

    public rdc() {
        this.a = new ArrayList();
    }

    public rdc(armf armfVar, byte[] bArr) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public rdc(znj znjVar) {
        this.a = albo.D(new qwq(znjVar, 6));
    }

    public rdc(ConcurrentHashMap concurrentHashMap) {
        concurrentHashMap.getClass();
        this.a = concurrentHashMap;
    }

    public rdc(Map map) {
        this.a = alor.j(map);
    }
}
