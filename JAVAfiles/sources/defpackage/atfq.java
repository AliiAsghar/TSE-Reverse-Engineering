package defpackage;

import j$.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atfq extends atel {
    private static final String a = "atfq";
    private final AtomicInteger b;
    private final atft c;

    public atfq() {
        atft atftVar = new atft();
        this.b = new AtomicInteger();
        this.c = atftVar;
    }

    @Override // defpackage.atel
    public final long a() {
        long nextLong = ThreadLocalRandom.current().nextLong(-9223372036854775807L, 9223372036854775805L);
        if (nextLong >= -1) {
            return nextLong + 2;
        }
        return nextLong;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if (r8 != 4) goto L20;
     */
    @Override // defpackage.atel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.ateh r17) {
        /*
            r16 = this;
            r0 = r17
            long r1 = r0.a
            int r3 = r0.h
            int r4 = r3 + (-1)
            if (r3 == 0) goto La2
            r3 = 0
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L15
            if (r4 == r6) goto L13
            r4 = r3
            goto L16
        L13:
            r4 = r5
            goto L16
        L15:
            r4 = r6
        L16:
            int r7 = r0.b
            atei r8 = r0.c
            int r8 = r8.ordinal()
            if (r8 == r6) goto L2b
            if (r8 == r5) goto L29
            r5 = 3
            if (r8 == r5) goto L29
            r5 = 4
            if (r8 == r5) goto L29
            goto L2c
        L29:
            r3 = r5
            goto L2c
        L2b:
            r3 = r6
        L2c:
            java.lang.Boolean r5 = r0.d
            int r5 = defpackage.atow.v(r5)
            int r5 = defpackage.atow.u(r5)
            atek r8 = r0.e
            int r9 = r8.a
            int r10 = r8.b
            int r11 = r8.c
            int r8 = r8.d
            atek r12 = r0.f
            if (r12 != 0) goto L46
            r14 = -1
            goto L48
        L46:
            int r14 = r12.a
        L48:
            if (r12 != 0) goto L4c
            r15 = -1
            goto L4e
        L4c:
            int r15 = r12.b
        L4e:
            if (r12 != 0) goto L52
            r13 = -1
            goto L54
        L52:
            int r13 = r12.c
        L54:
            if (r12 != 0) goto L58
            r12 = -1
            goto L5a
        L58:
            int r12 = r12.d
        L5a:
            int r0 = r0.g
            android.util.StatsEvent$Builder r6 = android.util.StatsEvent.newBuilder()
            r17 = r0
            r0 = 762(0x2fa, float:1.068E-42)
            r6.setAtomId(r0)
            r6.writeLong(r1)
            r6.writeInt(r4)
            r6.writeInt(r7)
            r6.writeInt(r3)
            r6.writeInt(r5)
            r6.writeInt(r9)
            r6.writeInt(r10)
            r6.writeInt(r11)
            r6.writeInt(r8)
            r6.writeInt(r14)
            r6.writeInt(r15)
            r6.writeInt(r13)
            r6.writeInt(r12)
            r0 = r17
            r6.writeInt(r0)
            r0 = 1
            r6.addBooleanAnnotation(r0, r0)
            r6.usePooledBuffer()
            android.util.StatsEvent r0 = r6.build()
            android.util.StatsLog.write(r0)
            return
        La2:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atfq.b(ateh):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c A[Catch: Exception -> 0x0332, TryCatch #3 {Exception -> 0x0332, blocks: (B:5:0x0011, B:12:0x0034, B:17:0x004c, B:19:0x006c, B:21:0x007d, B:23:0x0097, B:25:0x009a, B:28:0x00a3, B:29:0x00ae, B:33:0x0272, B:48:0x0238, B:52:0x024c, B:54:0x0255), top: B:4:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0238 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x004a  */
    @Override // defpackage.atel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(long r40, defpackage.ateg r42, defpackage.atek r43, defpackage.atei r44) {
        /*
            Method dump skipped, instructions count: 857
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atfq.c(long, ateg, atek, atei):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.atel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(long r24, defpackage.atej r26) {
        /*
            Method dump skipped, instructions count: 609
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atfq.d(long, atej):void");
    }
}
