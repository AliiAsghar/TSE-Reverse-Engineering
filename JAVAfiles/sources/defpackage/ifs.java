package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import j$.util.Collection;
import java.util.HashMap;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ifs {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public ifs(Context context, armf armfVar, zxy zxyVar, ujx ujxVar, armf armfVar2) {
        this.e = context;
        this.d = armfVar;
        this.a = zxyVar;
        this.b = ujxVar;
        this.c = armfVar2;
    }

    public final int a() {
        int size;
        synchronized (this.c) {
            size = ((HashMap) this.e).size();
        }
        return size;
    }

    public final ResolvedRecipient b(String str) {
        ResolvedRecipient resolvedRecipient;
        synchronized (this.c) {
            resolvedRecipient = (ResolvedRecipient) ((HashMap) this.e).get(str);
        }
        if (resolvedRecipient == null) {
            ndq ndqVar = new ndq(str);
            ndi ndiVar = (ndi) this.b;
            ResolvedRecipient resolvedRecipient2 = (ResolvedRecipient) ((alor) ((ndm) ndiVar.e.b()).a(new arqv() { // from class: ndg
                @Override // defpackage.arqv
                public final Object a(Object obj, Object obj2) {
                    return Boolean.valueOf(!((Set) obj).isEmpty());
                }
            }, new ndh(ndiVar, alog.r(ndqVar), 1)).c()).get(ndqVar);
            if (resolvedRecipient2 != null) {
                synchronized (this.c) {
                    if (!((HashMap) this.e).containsKey(str)) {
                        ((HashMap) this.e).put(str, resolvedRecipient2);
                    }
                }
            }
            return resolvedRecipient2;
        }
        return resolvedRecipient;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final alog c() {
        alog n;
        if (((piw) this.d.b()).a()) {
            synchronized (this.c) {
                n = alog.n(((HashMap) this.e).values());
            }
            return n;
        }
        return (alog) this.a;
    }

    public ifs(vyv vyvVar, anen anenVar, armf armfVar, armf armfVar2, armf armfVar3) {
        this.e = vyvVar;
        this.d = anenVar;
        this.c = armfVar;
        this.a = armfVar2;
        this.b = armfVar3;
    }

    public ifs(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.e = armfVar2;
        armfVar3.getClass();
        this.d = armfVar3;
        armfVar4.getClass();
        this.c = armfVar4;
        armfVar5.getClass();
        this.b = armfVar5;
    }

    public ifs(iji ijiVar, gpx gpxVar, ktk ktkVar, arwe arweVar) {
        this.a = ijiVar;
        this.b = gpxVar;
        this.c = ktkVar;
        this.d = arweVar;
        idx idxVar = new idx(ijiVar.c, this, 3);
        int i = ascp.a;
        this.e = arrn.T(idxVar, arweVar, asco.a(0L, 3), ifv.a);
    }

    public ifs(kjp kjpVar, jat jatVar, jwp jwpVar, jxv jxvVar, oyc oycVar) {
        kjpVar.getClass();
        jatVar.getClass();
        this.a = kjpVar;
        this.e = jatVar;
        this.c = jwpVar;
        this.d = jxvVar;
        this.b = oycVar;
    }

    public ifs(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, byte[] bArr) {
        armfVar.getClass();
        this.c = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.a = armfVar3;
        armfVar4.getClass();
        this.e = armfVar4;
        armfVar5.getClass();
        this.d = armfVar5;
    }

    public ifs(arpi arpiVar, qya qyaVar, iew iewVar, rur rurVar, okf okfVar) {
        arpiVar.getClass();
        qyaVar.getClass();
        rurVar.getClass();
        okfVar.getClass();
        this.e = arpiVar;
        this.b = qyaVar;
        this.a = iewVar;
        this.d = rurVar;
        this.c = okfVar;
    }

    public ifs(ndi ndiVar, armf armfVar, alog alogVar) {
        this.e = new HashMap();
        this.c = new Object();
        this.b = ndiVar;
        this.d = armfVar;
        this.a = alogVar;
        Collection.EL.forEach(alogVar, new mpv(this, 8));
    }
}
