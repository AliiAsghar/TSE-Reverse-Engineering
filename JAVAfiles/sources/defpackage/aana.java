package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.ui.debug.LoadMessagesReceiver;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aana extends arpw implements arqv {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ LoadMessagesReceiver c;
    final /* synthetic */ File d;
    final /* synthetic */ int e;
    final /* synthetic */ int f;
    final /* synthetic */ boolean g;
    final /* synthetic */ Context h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aana(boolean z, LoadMessagesReceiver loadMessagesReceiver, File file, int i, int i2, boolean z2, Context context, arpe arpeVar) {
        super(2, arpeVar);
        this.b = z;
        this.c = loadMessagesReceiver;
        this.d = file;
        this.e = i;
        this.f = i2;
        this.g = z2;
        this.h = context;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aana) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (r10.i(r1, r2, r3, r9) == r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (r3.h(r4, r5, r6, r7, r9) == r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0034, code lost:
    
        return r0;
     */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            arpl r0 = defpackage.arpl.a
            int r1 = r9.a
            r2 = 1
            defpackage.aqil.P(r10)
            if (r1 == 0) goto Lb
            goto L35
        Lb:
            boolean r10 = r9.b
            if (r10 == 0) goto L23
            com.google.android.apps.messaging.ui.debug.LoadMessagesReceiver r3 = r9.c
            java.io.File r4 = r9.d
            int r5 = r9.e
            int r6 = r9.f
            boolean r7 = r9.g
            r9.a = r2
            r8 = r9
            java.lang.Object r10 = r3.h(r4, r5, r6, r7, r8)
            if (r10 != r0) goto L35
            goto L34
        L23:
            com.google.android.apps.messaging.ui.debug.LoadMessagesReceiver r10 = r9.c
            int r1 = r9.e
            android.content.Context r2 = r9.h
            boolean r3 = r9.g
            r4 = 2
            r9.a = r4
            java.lang.Object r10 = r10.i(r1, r2, r3, r9)
            if (r10 != r0) goto L35
        L34:
            return r0
        L35:
            arnb r10 = defpackage.arnb.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aana.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        return new aana(this.b, this.c, this.d, this.e, this.f, this.g, this.h, arpeVar);
    }
}
