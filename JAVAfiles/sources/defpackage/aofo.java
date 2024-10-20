package defpackage;

import android.content.Intent;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aofo implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ aofo(aqru aqruVar, Object obj, Object obj2, int i) {
        this.d = i;
        this.a = aqruVar;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v39, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v44, types: [java.lang.Object, ator] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 3;
        int i2 = 2;
        byte[] bArr = null;
        switch (this.d) {
            case 0:
                ((aofp) this.a).a.execute(new aofk(this.b, this.c, 4, bArr));
                return;
            case 1:
                ((aofp) this.a).a.execute(new aofk(this.b, this.c, i, bArr));
                return;
            case 2:
                Object obj = this.c;
                try {
                    ((aoif) this.b).f((Intent) this.a);
                    return;
                } finally {
                    ((acit) obj).b(null);
                }
            case 3:
                ((aokz) this.a).b().c((String) this.c, (Throwable) this.b);
                return;
            case 4:
                ((aokz) this.a).b().a((apsd) this.c, (aqut) this.b);
                return;
            case 5:
                ((aold) this.a).b.c((String) this.c, (Throwable) this.b);
                return;
            case 6:
                ((aold) this.a).b.a((apsd) this.c, (aqut) this.b);
                return;
            case 7:
                ((aoln) this.b).i((aode) this.a, (aolk) this.c);
                return;
            case 8:
                aoln aolnVar = (aoln) this.a;
                Iterator it = aolnVar.b.iterator();
                while (it.hasNext()) {
                    ((ListenableFuture) it.next()).cancel(true);
                }
                aqru aqruVar = aolnVar.i;
                if (aqruVar != null) {
                    aqruVar.c((String) this.c, (Throwable) this.b);
                    return;
                }
                return;
            case 9:
                ((aoln) this.b).i((aode) this.a, (aolk) this.c);
                return;
            case 10:
                Object obj2 = this.a;
                aolj aoljVar = (aolj) obj2;
                boolean z = aoljVar.a;
                Object obj3 = this.c;
                Object obj4 = this.b;
                if (!z) {
                    try {
                        ((aolj) obj2).c.a((Status) obj4, (aqut) obj3);
                        return;
                    } finally {
                        aoljVar.a = true;
                        aoljVar.b.g.a();
                    }
                }
                return;
            case 11:
                ((aolr) this.a).a.a((Status) this.b, (aqut) this.c);
                return;
            case 12:
                ?? r0 = this.b;
                Object obj5 = this.a;
                Object obj6 = this.c;
                int size = r0.size();
                for (int i3 = 0; i3 < size; i3++) {
                    aqxt aqxtVar = (aqxt) r0.get(i3);
                    synchronized (aqxtVar) {
                        aqxtVar.h((Status) obj5);
                    }
                }
                synchronized (obj6) {
                    ((aqxh) obj6).j();
                }
                ((aqxh) obj6).n();
                return;
            case 13:
                ((arbd) this.b).b.a((apsd) this.a, (aqut) this.c);
                return;
            case 14:
                ((arbc) this.b).c.a((Status) this.c, (aqut) this.a);
                return;
            case 15:
                Object obj7 = this.b;
                ardr ardrVar = ((ardi) obj7).b;
                if (obj7 == ardrVar.u) {
                    ardrVar.n((aqtx) this.c);
                    Object obj8 = this.a;
                    if (obj8 != aqsd.SHUTDOWN) {
                        ((ardi) this.b).b.H.b(2, "Entering {0} state with picker: {1}", obj8, this.c);
                        ((ardi) this.b).b.p.a((aqsd) this.a);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                synchronized (((arfw) this.a).a) {
                    Object obj9 = this.a;
                    if (((arfw) obj9).b) {
                        return;
                    }
                    ((arfw) obj9).a();
                    ((arfz) this.c).b.f.execute(new ardm(this, this.b, 5, null));
                    return;
                }
            case 17:
                Object obj10 = this.b;
                atfe atfeVar = (atfe) obj10;
                atfeVar.p = URI.create(atfeVar.m).resolve((String) this.a).toString();
                atfeVar.f.add(atfeVar.p);
                atfeVar.i(2, 3, new atep(obj10, this.c, i2, bArr));
                return;
            case 18:
                Object obj11 = this.a;
                Object obj12 = this.c;
                Object obj13 = this.b;
                try {
                    ((atfc) obj13).a.onFailed(((atfc) obj13).d, (UrlResponseInfo) obj12, (CronetException) obj11);
                } catch (Exception e) {
                    ((atfc) obj13).d.h("onFailed", e);
                }
                atfc atfcVar = (atfc) obj13;
                atfcVar.b();
                atfcVar.d.r.b();
                return;
            default:
                atoz atozVar = (atoz) this.c;
                atpa atpaVar = atozVar.b;
                ?? r2 = this.a;
                if (atpaVar.b.e()) {
                    r2.b(new IOException("Canceled"));
                    return;
                } else {
                    r2.a(atozVar.b, (atqo) this.b);
                    return;
                }
        }
    }

    public /* synthetic */ aofo(aqxh aqxhVar, ArrayList arrayList, Status status, int i) {
        this.d = i;
        this.c = aqxhVar;
        this.b = arrayList;
        this.a = status;
    }

    public aofo(arbd arbdVar, apsd apsdVar, aqut aqutVar, int i) {
        this.d = i;
        this.a = apsdVar;
        this.c = aqutVar;
        this.b = arbdVar;
    }

    public aofo(arfz arfzVar, arfw arfwVar, arga argaVar, int i) {
        this.d = i;
        this.a = arfwVar;
        this.b = argaVar;
        this.c = arfzVar;
    }

    public /* synthetic */ aofo(atfc atfcVar, UrlResponseInfo urlResponseInfo, CronetException cronetException, int i) {
        this.d = i;
        this.b = atfcVar;
        this.c = urlResponseInfo;
        this.a = cronetException;
    }

    public /* synthetic */ aofo(atoz atozVar, ator atorVar, atqo atqoVar, int i) {
        this.d = i;
        this.c = atozVar;
        this.a = atorVar;
        this.b = atqoVar;
    }

    public /* synthetic */ aofo(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ aofo(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public aofo(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.d = i;
        this.c = obj2;
        this.a = obj3;
        this.b = obj;
    }
}
