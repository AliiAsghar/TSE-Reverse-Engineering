package defpackage;

import android.content.Context;
import android.media.AudioAttributes;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aggn implements aggo {
    public static final alvi a = alvi.m("com/google/android/libraries/compose/voice/audioplayer/DefaultSoundEffectPlayer");
    public static final AudioAttributes b = new AudioAttributes.Builder().setUsage(13).setContentType(4).build();
    public final Context c;
    private final arwe d;
    private final arwb e;

    public aggn(Context context, arwe arweVar, arwb arwbVar) {
        context.getClass();
        arweVar.getClass();
        arwbVar.getClass();
        this.c = context;
        this.d = arweVar;
        this.e = arwbVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
    
        if (defpackage.arro.q(r13, r14, r0) != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.aggo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(int r13, defpackage.arpe r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof defpackage.aggl
            if (r0 == 0) goto L13
            r0 = r14
            aggl r0 = (defpackage.aggl) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            aggl r0 = new aggl
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.aqil.P(r14)
            goto L72
        L2b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L33:
            int r13 = r0.a
            aggn r2 = r0.e
            defpackage.aqil.P(r14)
            r9 = r13
            r8 = r2
            goto L56
        L3d:
            defpackage.aqil.P(r14)
            arwb r14 = r12.e
            zzy r2 = new zzy
            r6 = 4
            r2.<init>(r5, r6, r5)
            r0.e = r12
            r0.a = r13
            r0.d = r4
            java.lang.Object r14 = defpackage.arro.q(r14, r2, r0)
            if (r14 == r1) goto L75
            r8 = r12
            r9 = r13
        L56:
            r7 = r14
            android.media.MediaPlayer r7 = (android.media.MediaPlayer) r7
            arwe r13 = r8.d
            arpi r13 = r13.b()
            aggm r14 = new aggm
            r10 = 0
            r11 = 0
            r6 = r14
            r6.<init>(r7, r8, r9, r10, r11)
            r0.e = r5
            r0.d = r3
            java.lang.Object r13 = defpackage.arro.q(r13, r14, r0)
            if (r13 != r1) goto L72
            goto L75
        L72:
            arnb r13 = defpackage.arnb.a
            return r13
        L75:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aggn.a(int, arpe):java.lang.Object");
    }
}
