package defpackage;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.BitmapDrawable;
import android.os.StrictMode;
import android.util.Log;
import android.view.Surface;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fhh implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ fhh(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v107, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v58, types: [ecd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v91, types: [java.lang.Object, gwn] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, etm] */
    /* JADX WARN: Type inference failed for: r3v1, types: [fmk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    @Override // java.lang.Runnable
    public final void run() {
        fmj fmjVar;
        boolean z;
        int i;
        boolean z2;
        Object obj = null;
        int i2 = 0;
        switch (this.c) {
            case 0:
                fhm fhmVar = (fhm) this.a;
                fod fodVar = fhmVar.h;
                ?? r3 = this.b;
                if (fodVar == null) {
                    fmjVar = r3;
                } else {
                    fmjVar = new fmj(-9223372036854775807L);
                }
                fhmVar.k = fmjVar;
                fhmVar.l = r3.a();
                if (!fhmVar.p && r3.a() == -9223372036854775807L) {
                    z = true;
                } else {
                    z = false;
                }
                fhmVar.m = z;
                if (true != z) {
                    i = 1;
                } else {
                    i = 7;
                }
                fhmVar.n = i;
                if (fhmVar.j) {
                    fhmVar.v.u(fhmVar.l, r3.c(), fhmVar.m);
                    return;
                } else {
                    fhmVar.s();
                    return;
                }
            case 1:
                this.a.a(this.b);
                return;
            case 2:
                int i3 = eul.a;
                fad fadVar = ((faa) ((fvq) this.b).b).a;
                Object obj2 = this.a;
                fadVar.y = (esn) obj2;
                fadVar.f.f(25, new ezu(obj2, 17));
                return;
            case 3:
                int i4 = eul.a;
                faa faaVar = (faa) ((fvq) this.a).b;
                fbt fbtVar = faaVar.a.D;
                fbk E = fbtVar.E();
                Object obj3 = this.b;
                int i5 = 0;
                fbtVar.F(E, 26, new fbq(obj3, i5));
                fad fadVar2 = faaVar.a;
                if (fadVar2.s == obj3) {
                    fadVar2.f.f(26, new ezz(i5));
                    return;
                }
                return;
            case 4:
                Object obj4 = this.a;
                ((ezh) obj4).a();
                int i6 = eul.a;
                faa faaVar2 = (faa) ((fvq) this.b).b;
                fbt fbtVar2 = faaVar2.a.D;
                fbtVar2.F(fbtVar2.D(), 1020, new ezu(obj4, 20));
                fad fadVar3 = faaVar2.a;
                return;
            case 5:
                fky fkyVar = (fky) this.b;
                SurfaceTexture surfaceTexture = fkyVar.d;
                Surface surface = fkyVar.e;
                SurfaceTexture surfaceTexture2 = (SurfaceTexture) this.a;
                Surface surface2 = new Surface(surfaceTexture2);
                fkyVar.d = surfaceTexture2;
                fkyVar.e = surface2;
                Iterator it = fkyVar.a.iterator();
                while (it.hasNext()) {
                    ((faa) it.next()).a.ac(surface2);
                }
                fky.a(surfaceTexture, surface);
                return;
            case 6:
                fxn fxnVar = (fxn) this.a;
                qdq qdqVar = fxnVar.t;
                alog g = ((alob) this.b).g();
                fvj fvjVar = fxnVar.c;
                String str = fvjVar.b;
                String str2 = fvjVar.c;
                ((fxj) qdqVar.a).e.c(g);
                if (str != null) {
                    ((fxj) qdqVar.a).e.f = str;
                }
                if (str2 != null) {
                    ((fxj) qdqVar.a).e.m = str2;
                }
                fxj.c((fxj) qdqVar.a);
                fxj fxjVar = (fxj) qdqVar.a;
                int i7 = fxjVar.h;
                if (i7 == 1) {
                    fxjVar.h = 2;
                    hka hkaVar = fxjVar.i;
                    dzg.g(hkaVar);
                    fvm fvmVar = new fvm(hkaVar);
                    ArrayList arrayList = new ArrayList();
                    int i8 = 0;
                    while (true) {
                        alog alogVar = (alog) hkaVar.d;
                        if (i8 < alogVar.size()) {
                            atkn atknVar = (atkn) alogVar.get(i8);
                            Object obj5 = atknVar.b;
                            ArrayList arrayList2 = new ArrayList();
                            int i9 = i2;
                            while (i9 < ((alsx) obj5).c) {
                                fvz fvzVar = (fvz) ((alog) obj5).get(i9);
                                ere ereVar = fvzVar.a;
                                long j = fvzVar.e;
                                fwa fwaVar = fvzVar.g;
                                if (i9 == 0) {
                                    eqv eqvVar = ereVar.e;
                                    vtk vtkVar = new vtk(eqvVar);
                                    long u = eul.u(eqvVar.a + eul.z(0L));
                                    if (u >= 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    d.s(z2);
                                    vtkVar.a = u;
                                    eqv eqvVar2 = new eqv(vtkVar);
                                    equ equVar = new equ(fvzVar.a);
                                    equVar.d = new vtk(eqvVar2);
                                    ereVar = equVar.a();
                                    i9 = 0;
                                }
                                arrayList2.add(new fvz(ereVar, true, j, fwaVar));
                                i9++;
                            }
                            ghw ghwVar = new ghw((List) arrayList2);
                            boolean z3 = atknVar.a;
                            arrayList.add(new atkn(ghwVar));
                            i8++;
                            i2 = 0;
                        } else {
                            d.t(!arrayList.isEmpty(), "The composition must contain at least one EditedMediaItemSequence.");
                            fvmVar.a = alog.n(arrayList);
                            fvmVar.a();
                            throw null;
                        }
                    }
                } else {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 != 5) {
                                if (i7 == 6) {
                                    fxjVar.e.o = 1;
                                    fxjVar.a();
                                    return;
                                } else {
                                    fxjVar.a();
                                    return;
                                }
                            }
                            fxjVar.h = 6;
                            hka hkaVar2 = fxjVar.i;
                            dzg.g(hkaVar2);
                            throw null;
                        }
                        fxjVar.h = 4;
                        throw null;
                    }
                    fxjVar.h = 3;
                    long j2 = fwy.a;
                    throw null;
                }
            case 7:
                fyx fyxVar = (fyx) this.b;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(fyxVar.getResources(), (Bitmap) this.a);
                ImageView imageView = fyxVar.e;
                if (imageView != null) {
                    imageView.setImageDrawable(bitmapDrawable);
                    fyxVar.n();
                }
                if (!fyxVar.p()) {
                    fyxVar.f();
                    fyxVar.a();
                    return;
                }
                return;
            case 8:
                Object obj6 = this.a;
                try {
                    this.b.run();
                    return;
                } finally {
                    ((gzx) obj6).a();
                }
            case 9:
                ((ktk) this.b).b.accept(this.a);
                return;
            case 10:
                Object obj7 = this.b;
                Object obj8 = this.a;
                synchronized (((gud) obj8).j) {
                    Iterator it2 = ((gud) obj8).i.iterator();
                    while (it2.hasNext()) {
                        ((gts) it2.next()).a((gyg) obj7, false);
                    }
                }
                return;
            case 11:
                gsy.a().c(gvt.a, "Scheduling work ".concat(((gys) this.b).c));
                ((gvt) this.a).b.c((gys) this.b);
                return;
            case 12:
                ((ico) ((uix) this.b).c).I((hgi) this.a, 3);
                return;
            case 13:
                Iterator it3 = this.b.iterator();
                while (it3.hasNext()) {
                    ((hqs) it3.next()).a(((gxg) this.a).d);
                }
                return;
            case 14:
                gud gudVar = ((gxp) this.a).b.g;
                Object obj9 = gudVar.j;
                Object obj10 = this.b;
                synchronized (obj9) {
                    lhm e = gudVar.e((String) obj10);
                    if (e != null) {
                        obj = e.f;
                    }
                }
                if (obj != null && ((gys) obj).d()) {
                    synchronized (((gxp) this.a).c) {
                        ((gxp) this.a).f.put(gvf.J((gys) obj), obj);
                        ?? r0 = this.a;
                        ((gxp) this.a).g.put(gvf.J((gys) obj), gwp.a(((gxp) r0).j, (gys) obj, (arwb) ((gxp) r0).i.d, r0));
                    }
                    return;
                }
                return;
            case 15:
                String uuid = ((UUID) this.b).toString();
                uuid.getClass();
                gvf.u((gvd) this.a, uuid);
                return;
            case 16:
                synchronized (((gzt) this.a).b) {
                    Object a = ((gzt) this.a).c.a(this.b);
                    Object obj11 = this.a;
                    Object obj12 = ((gzt) obj11).a;
                    if (obj12 == null && a != null) {
                        ((gzt) obj11).a = a;
                        ((gzt) obj11).d.h(a);
                    } else if (obj12 != null && !obj12.equals(a)) {
                        Object obj13 = this.a;
                        ((gzt) obj13).a = a;
                        ((gzt) obj13).d.h(a);
                    }
                }
                return;
            case 17:
                try {
                    ((hjt) this.a).a.put(this.b);
                    return;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            case 18:
                if (((hrb) this.a).a) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.b.run();
                    return;
                } catch (Throwable th) {
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                        return;
                    }
                    return;
                }
            case 19:
                imk imkVar = (imk) this.a;
                ((rwd) imkVar.j.b()).T(imkVar.l, this.b, 2, true);
                imkVar.h.d(imkVar.l);
                imkVar.q.q(aktp.ag(null), "chat_media_viewer_content_key");
                return;
            default:
                inh inhVar = (inh) this.a;
                inj injVar = inhVar.g;
                injVar.getClass();
                injVar.b();
                Object obj14 = this.b;
                if (obj14 != null) {
                    inhVar.f((ins) obj14);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ fhh(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public fhh(Object obj, Object obj2, int i, char[] cArr) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public fhh(Object obj, Object obj2, int i, short[] sArr) {
        this.c = i;
        this.b = obj2;
        this.a = obj;
    }
}
