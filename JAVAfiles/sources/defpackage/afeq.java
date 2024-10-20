package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaCodec;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afeq implements afes {
    public static final alvi a = alvi.m("com/google/android/libraries/compose/audio/codec/AmrEncoder");
    public static final byte[] b = {35, 33, 65, 77, 82, 10};
    public final Context c;
    public final afer d;
    public MediaCodec e;
    public AssetFileDescriptor.AutoCloseOutputStream f;
    public long g;
    public long h;
    public boolean i;
    private final arpi j;

    public afeq(arpi arpiVar, Context context, afer aferVar) {
        this.j = arpiVar;
        this.c = context;
        this.d = aferVar;
    }

    public final long a() {
        return anbx.a(aeke.bT(this.g, this.d.c, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.arpe r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.afeo
            if (r0 == 0) goto L13
            r0 = r8
            afeo r0 = (defpackage.afeo) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            afeo r0 = new afeo
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 0
            r5 = 1
            if (r2 == 0) goto L35
            if (r2 != r5) goto L2d
            int r2 = r0.a
            android.media.MediaCodec r6 = r0.e
            defpackage.aqil.P(r8)
            goto L47
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            defpackage.aqil.P(r8)
            android.media.MediaCodec r8 = r7.e
            if (r8 != 0) goto L42
            java.lang.String r8 = "mediaCodec"
            defpackage.arro.b(r8)
            r8 = 0
        L42:
            r6 = r8
            int r2 = r6.dequeueInputBuffer(r3)
        L47:
            if (r2 >= 0) goto L5a
            int r2 = r6.dequeueInputBuffer(r3)
            r0.e = r6
            r0.a = r2
            r0.d = r5
            java.lang.Object r8 = defpackage.arwi.q(r0)
            if (r8 != r1) goto L47
            return r1
        L5a:
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afeq.b(arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(android.media.MediaCodec.BufferInfo r8, defpackage.arpe r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.afep
            if (r0 == 0) goto L13
            r0 = r9
            afep r0 = (defpackage.afep) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            afep r0 = new afep
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 0
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 != r5) goto L2f
            int r8 = r0.a
            android.media.MediaCodec r2 = r0.f
            android.media.MediaCodec$BufferInfo r6 = r0.e
            defpackage.aqil.P(r9)
            goto L4b
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            defpackage.aqil.P(r9)
            android.media.MediaCodec r9 = r7.e
            if (r9 != 0) goto L44
            java.lang.String r9 = "mediaCodec"
            defpackage.arro.b(r9)
            r9 = 0
        L44:
            r2 = r9
            int r9 = r2.dequeueOutputBuffer(r8, r3)
            r6 = r8
            r8 = r9
        L4b:
            r9 = -1
            if (r8 != r9) goto L61
            int r8 = r2.dequeueOutputBuffer(r6, r3)
            r0.e = r6
            r0.f = r2
            r0.a = r8
            r0.d = r5
            java.lang.Object r9 = defpackage.arwi.q(r0)
            if (r9 != r1) goto L4b
            return r1
        L61:
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afeq.c(android.media.MediaCodec$BufferInfo, arpe):java.lang.Object");
    }

    @Override // defpackage.afes
    public final Object d(arpe arpeVar) {
        Object q = arro.q(this.j, new afbh(this, (arpe) null, 3), arpeVar);
        if (q == arpl.a) {
            return q;
        }
        return arnb.a;
    }

    @Override // defpackage.afes
    public final Object e(arpe arpeVar) {
        Object q = arro.q(this.j, new aely(this, (arpe) null, 3), arpeVar);
        if (q == arpl.a) {
            return q;
        }
        return arnb.a;
    }

    @Override // defpackage.afes
    public final Object f(ByteBuffer byteBuffer, arpe arpeVar) {
        Object q = arro.q(this.j, new adzx(byteBuffer, this, (arpe) null, 11), arpeVar);
        if (q == arpl.a) {
            return q;
        }
        return arnb.a;
    }

    @Override // defpackage.afes
    public final Object g(arpe arpeVar) {
        return arro.q(this.j, new wio(this, (arpe) null, 8), arpeVar);
    }

    @Override // defpackage.afes
    public final void h() {
        alvw g = a.g();
        g.X(alwp.a, "HugoAudio");
        ((alvg) g.h("com/google/android/libraries/compose/audio/codec/AmrEncoder", "release", 80, "AmrEncoder.kt")).t("Releasing AmrEncoder for %s", this.d.a.toString());
        MediaCodec mediaCodec = this.e;
        if (mediaCodec != null) {
            mediaCodec.release();
        }
        AssetFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = this.f;
        if (autoCloseOutputStream != null) {
            autoCloseOutputStream.close();
        }
    }

    @Override // defpackage.afes
    public final void i() {
        alvw g = a.g();
        g.X(alwp.a, "HugoAudio");
        ((alvg) g.h("com/google/android/libraries/compose/audio/codec/AmrEncoder", ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME, 68, "AmrEncoder.kt")).t("Starting AmrEncoder for %s", this.d.a.toString());
        MediaCodec mediaCodec = this.e;
        if (mediaCodec == null) {
            arro.b("mediaCodec");
            mediaCodec = null;
        }
        mediaCodec.start();
    }

    @Override // defpackage.afes
    public final void j() {
        alvw g = a.g();
        g.X(alwp.a, "HugoAudio");
        ((alvg) g.h("com/google/android/libraries/compose/audio/codec/AmrEncoder", "stop", 73, "AmrEncoder.kt")).t("Stopping AmrEncoder for %s", this.d.a.toString());
        MediaCodec mediaCodec = this.e;
        if (mediaCodec != null) {
            mediaCodec.stop();
        }
    }

    @Override // defpackage.afes
    public final boolean k() {
        return this.i;
    }
}
