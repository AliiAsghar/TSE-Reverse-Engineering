package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acyr extends Handler {
    public static final Object a = new Object();
    public acyq[] b;
    public int c;
    public acyq[] d;
    public int e;
    public final acyn f;
    public final acyo g;
    public acyj h;
    public final List i;
    public final HashMap j;
    public acyh k;
    public final ArrayList l;
    private boolean m;
    private Message n;
    private boolean o;
    private final CountDownLatch p;
    private int q;
    private acyh r;
    private boolean s;
    private final acit t;

    public acyr(Looper looper, acyj acyjVar) {
        super(looper);
        this.m = false;
        this.t = new acit((char[]) null);
        this.c = -1;
        acyn acynVar = new acyn();
        this.f = acynVar;
        acyo acyoVar = new acyo();
        this.g = acyoVar;
        this.p = new CountDownLatch(1);
        this.i = new CopyOnWriteArrayList();
        this.j = new HashMap();
        this.s = false;
        this.l = new ArrayList();
        this.h = acyjVar;
        c(acynVar, null);
        c(acyoVar, null);
    }

    static String d(acyh acyhVar) {
        if (acyhVar != null) {
            return acyhVar.a();
        }
        return "null";
    }

    private final void g(acyp acypVar) {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            acypVar.a((acyg) it.next());
        }
    }

    private final void h(int i) {
        int i2 = i;
        while (true) {
            int i3 = this.c;
            if (i2 <= i3) {
                if (i == i3) {
                    this.s = false;
                }
                acyh acyhVar = this.b[i2].a;
                acyhVar.b();
                g(new acym(acyhVar, 0));
                this.b[i2].c = true;
                i2++;
            } else {
                this.s = false;
                return;
            }
        }
    }

    private final void i() {
        g(new acyl(1));
    }

    public final int a() {
        int i = this.c + 1;
        int i2 = this.e - 1;
        int i3 = i;
        while (i2 >= 0) {
            this.b[i3] = this.d[i2];
            i2--;
            i3++;
        }
        this.c = i3 - 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final acyh b() {
        int i;
        acyq[] acyqVarArr = this.b;
        if (acyqVarArr != null && (i = this.c) >= 0) {
            return acyqVarArr[i].a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final acyq c(acyh acyhVar, acyh acyhVar2) {
        acyq acyqVar = null;
        if (acyhVar2 != null) {
            acyq acyqVar2 = (acyq) this.j.get(acyhVar2);
            if (acyqVar2 == null) {
                acyqVar = c(acyhVar2, null);
            } else {
                acyqVar = acyqVar2;
            }
        }
        acyq acyqVar3 = (acyq) this.j.get(acyhVar);
        if (acyqVar3 == null) {
            acyqVar3 = new acyq();
            this.j.put(acyhVar, acyqVar3);
        }
        acyq acyqVar4 = acyqVar3.b;
        if (acyqVar4 != null && acyqVar4 != acyqVar) {
            throw new RuntimeException("state already added");
        }
        acyqVar3.a = acyhVar;
        acyqVar3.b = acyqVar;
        acyqVar3.c = false;
        return acyqVar3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(acyh acyhVar) {
        acyj acyjVar;
        if (this.s && (acyjVar = this.h) != null) {
            acyjVar.h("transitionTo called while transition already in progress to " + String.valueOf(this.r) + ", new target state=" + String.valueOf(acyhVar));
        }
        this.r = acyhVar;
        acyj acyjVar2 = this.h;
        if (acyjVar2 != null) {
            acyjVar2.i("transitionTo: destState=".concat(String.valueOf(acyhVar.a())));
        }
        g(new acyl(2));
    }

    public final void f() {
        this.q++;
        sendMessageAtFrontOfQueue(obtainMessage(-2, a));
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0143 A[Catch: all -> 0x0160, LOOP:3: B:70:0x0141->B:71:0x0143, LOOP_END, TryCatch #0 {all -> 0x0160, blocks: (B:45:0x00d3, B:46:0x00d6, B:49:0x00e6, B:50:0x00ee, B:62:0x010d, B:63:0x010f, B:65:0x0113, B:67:0x0119, B:69:0x0133, B:71:0x0143, B:73:0x0151, B:77:0x015d, B:53:0x00ff, B:57:0x0107, B:86:0x00dc), top: B:44:0x00d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015a A[LOOP:0: B:46:0x00d6->B:75:0x015a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015d A[EDGE_INSN: B:76:0x015d->B:77:0x015d BREAK  A[LOOP:0: B:46:0x00d6->B:75:0x015a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fc A[SYNTHETIC] */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void handleMessage(final android.os.Message r14) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acyr.handleMessage(android.os.Message):void");
    }
}
