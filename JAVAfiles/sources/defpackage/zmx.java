package defpackage;

import com.google.android.apps.messaging.ui.appsettings.SwipeActionPreference;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zmx {
    public final zmv a;
    public final armf b;
    public final armf c;
    public final armf d;
    public Optional e = Optional.empty();
    public zmq f;

    public zmx(zmv zmvVar, armf armfVar, armf armfVar2, armf armfVar3) {
        this.a = zmvVar;
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
    }

    public final void a(final int i, final int i2, int i3, int i4, int i5, int i6, int i7) {
        zmv zmvVar = this.a;
        SwipeActionPreference swipeActionPreference = (SwipeActionPreference) zmvVar.a(zmvVar.S(i));
        swipeActionPreference.getClass();
        if (swipeActionPreference.U()) {
            zmp zmpVar = zmp.ARCHIVE;
            swipeActionPreference.a = i2;
            swipeActionPreference.b = i3;
            swipeActionPreference.c = i4;
            swipeActionPreference.d = i5;
            swipeActionPreference.e = i6;
            swipeActionPreference.f = i7;
            swipeActionPreference.k(zmpVar);
            swipeActionPreference.o = new gfb() { // from class: zmw
                /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
                
                    if (r1 != null) goto L16;
                 */
                /* JADX WARN: Removed duplicated region for block: B:13:0x007b  */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0092  */
                /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:24:0x0085 A[EDGE_INSN: B:24:0x0085->B:18:0x0085 BREAK  A[LOOP:0: B:11:0x0078->B:15:0x0082], SYNTHETIC] */
                /* JADX WARN: Type inference failed for: r1v3, types: [armf, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r3v0, types: [armf, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r3v1, types: [armf, java.lang.Object] */
                @Override // defpackage.gfb
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final boolean a(androidx.preference.Preference r10) {
                    /*
                        r9 = this;
                        zmx r10 = defpackage.zmx.this
                        j$.util.Optional r0 = r10.e
                        boolean r0 = r0.isEmpty()
                        if (r0 == 0) goto L9b
                        int r0 = r3
                        int r8 = r2
                        armf r1 = r10.b
                        java.lang.Object r1 = r1.b()
                        zlz r1 = (defpackage.zlz) r1
                        zmv r2 = r10.a
                        java.lang.Object r3 = r1.c
                        java.lang.String r7 = r2.S(r0)
                        zmu r0 = new zmu
                        java.lang.Object r2 = r3.b()
                        android.content.Context r2 = (android.content.Context) r2
                        r2.getClass()
                        java.lang.Object r3 = r1.d
                        java.lang.Object r3 = r3.b()
                        zmt r3 = (defpackage.zmt) r3
                        armf r4 = r1.a
                        java.lang.Object r4 = r4.b()
                        aksr r4 = (defpackage.aksr) r4
                        r4.getClass()
                        java.lang.Object r1 = r1.b
                        java.lang.Object r1 = r1.b()
                        r5 = r1
                        mbl r5 = (defpackage.mbl) r5
                        r5.getClass()
                        r7.getClass()
                        r1 = r0
                        r6 = r8
                        r1.<init>(r2, r3, r4, r5, r6, r7)
                        zmq r1 = r10.f
                        if (r1 == 0) goto L71
                        r2 = 2132021880(0x7f141278, float:1.9682164E38)
                        if (r8 != r2) goto L64
                        int r1 = r1.c
                        zmp r1 = defpackage.zmp.b(r1)
                        if (r1 != 0) goto L73
                        zmp r1 = defpackage.zmp.ARCHIVE
                        goto L73
                    L64:
                        r2 = 2132021882(0x7f14127a, float:1.9682168E38)
                        if (r8 != r2) goto L71
                        int r1 = r1.d
                        zmp r1 = defpackage.zmp.b(r1)
                        if (r1 != 0) goto L73
                    L71:
                        zmp r1 = defpackage.zmp.ARCHIVE
                    L73:
                        zmp[] r2 = defpackage.zmt.d()
                        r3 = 0
                    L78:
                        r4 = 4
                        if (r3 >= r4) goto L85
                        r4 = r2[r3]
                        if (r1 != r4) goto L82
                        r0.d = r3
                        goto L85
                    L82:
                        int r3 = r3 + 1
                        goto L78
                    L85:
                        r0.c()
                        j$.util.Optional r1 = j$.util.Optional.of(r0)
                        r10.e = r1
                        ev r0 = r0.f
                        if (r0 == 0) goto L9b
                        kmu r1 = new kmu
                        r2 = 3
                        r1.<init>(r10, r2)
                        r0.setOnDismissListener(r1)
                    L9b:
                        r10 = 1
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.zmw.a(androidx.preference.Preference):boolean");
                }
            };
        }
    }
}
