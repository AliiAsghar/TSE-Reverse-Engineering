package defpackage;

import android.app.Notification;
import android.app.RemoteInput;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fqf {
    public int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    /* JADX WARN: Removed duplicated region for block: B:128:0x0495  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public fqf(defpackage.dyu r20) {
        /*
            Method dump skipped, instructions count: 1270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fqf.<init>(dyu):void");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [eux, java.lang.Object] */
    private final void d(int i) {
        while (((PriorityQueue) this.d).size() > i) {
            euy euyVar = (euy) ((PriorityQueue) this.d).poll();
            int i2 = eul.a;
            this.e.a(euyVar.b, euyVar.a);
            ((ArrayDeque) this.c).push(euyVar);
        }
    }

    private final void e(dyk dykVar) {
        Icon icon;
        IconCompat a = dykVar.a();
        if (a != null) {
            icon = a.c();
        } else {
            icon = null;
        }
        Notification.Action.Builder builder = new Notification.Action.Builder(icon, dykVar.h, dykVar.i);
        dzw[] dzwVarArr = dykVar.b;
        if (dzwVarArr != null) {
            for (RemoteInput remoteInput : dzw.a(dzwVarArr)) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle = new Bundle(dykVar.a);
        bundle.putBoolean("android.support.allowGeneratedReplies", dykVar.c);
        builder.setAllowGeneratedReplies(dykVar.c);
        bundle.putInt("android.support.action.semanticAction", dykVar.e);
        if (Build.VERSION.SDK_INT >= 28) {
            builder.setSemanticAction(dykVar.e);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            builder.setContextual(dykVar.f);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            builder.setAuthenticationRequired(dykVar.j);
        }
        bundle.putBoolean("android.support.action.showsUserInterface", dykVar.d);
        builder.addExtras(bundle);
        ((Notification.Builder) this.e).addAction(builder.build());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r8 < r0.b) goto L23;
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [eux, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r8, defpackage.euf r10) {
        /*
            r7 = this;
            int r0 = r7.a
            if (r0 == 0) goto L83
            r1 = -1
            if (r0 == r1) goto L26
            java.lang.Object r0 = r7.d
            java.util.PriorityQueue r0 = (java.util.PriorityQueue) r0
            int r0 = r0.size()
            int r2 = r7.a
            if (r0 < r2) goto L26
            java.lang.Object r0 = r7.d
            java.util.PriorityQueue r0 = (java.util.PriorityQueue) r0
            java.lang.Object r0 = r0.peek()
            euy r0 = (defpackage.euy) r0
            int r2 = defpackage.eul.a
            long r2 = r0.b
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 >= 0) goto L26
            goto L83
        L26:
            java.lang.Object r0 = r7.c
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L36
            euy r0 = new euy
            r0.<init>()
            goto L40
        L36:
            java.lang.Object r0 = r7.c
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0
            java.lang.Object r0 = r0.poll()
            euy r0 = (defpackage.euy) r0
        L40:
            java.lang.Object r2 = r7.b
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            r4 = 0
            if (r3 == 0) goto L4e
            r3 = 1
            goto L4f
        L4e:
            r3 = r4
        L4f:
            java.util.concurrent.atomic.AtomicLong r2 = (java.util.concurrent.atomic.AtomicLong) r2
            long r5 = r2.getAndIncrement()
            defpackage.dzg.d(r3)
            r0.b = r8
            r0.c = r5
            euf r8 = r0.a
            int r9 = r10.b()
            r8.F(r9)
            byte[] r8 = r10.a
            int r9 = r10.b
            euf r2 = r0.a
            byte[] r2 = r2.a
            int r10 = r10.b()
            java.lang.System.arraycopy(r8, r9, r2, r4, r10)
            java.lang.Object r8 = r7.d
            java.util.PriorityQueue r8 = (java.util.PriorityQueue) r8
            r8.add(r0)
            int r8 = r7.a
            if (r8 == r1) goto L82
            r7.d(r8)
        L82:
            return
        L83:
            java.lang.Object r0 = r7.e
            r0.a(r8, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fqf.a(long, euf):void");
    }

    public final void b() {
        d(0);
    }

    public final void c(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        dzg.d(z);
        this.a = i;
        d(i);
    }

    public fqf(eux euxVar) {
        this.b = new AtomicLong();
        this.e = euxVar;
        this.c = new ArrayDeque();
        this.d = new PriorityQueue();
        this.a = -1;
    }

    public fqf(fqj fqjVar, fql fqlVar, fmq fmqVar) {
        this.b = fqjVar;
        this.c = fqlVar;
        this.d = fmqVar;
        this.e = "audio/true-hd".equals(fqjVar.g.o) ? new fmr() : null;
    }
}
