package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class rl extends arrm implements arqg {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl(Object obj, int i) {
        super(0, obj, rm.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v61, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.util.Set, java.lang.Object] */
    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        int i = 0;
        switch (this.a) {
            case 0:
                ((rm) this.e).f();
                return arnb.a;
            case 1:
                ((rm) this.e).f();
                return arnb.a;
            case 2:
                ((gbl) this.e).c();
                return arnb.a;
            case 3:
                ((gbl) this.e).b();
                return arnb.a;
            case 4:
                ((gbl) this.e).b();
                return arnb.a;
            case 5:
                Object obj = ((ifs) this.e).c;
                aiut.c();
                akrh e = aktp.e("BlockedParticipantsStartupTracker#onListInteractive");
                try {
                    Object obj2 = ((ktk) obj).b;
                    ahqr ahqrVar = (ahqr) obj2;
                    ahqrVar.f((ahqq) ((ktk) obj).c, mgv.K, null, ahqp.SUCCESS);
                    ((ahpf) ((ktk) obj).a).b(mgv.L, null);
                    armd.i(e, null);
                    return arnb.a;
                } finally {
                }
            case 6:
                ipc ipcVar = (ipc) this.e;
                arml armlVar = ipc.a;
                if (!aqjn.aH((Set) ipc.c.a(), ipcVar.l)) {
                    i = ipcVar.g.f;
                }
                return Integer.valueOf(i);
            case 7:
                ((khb) this.e).b();
                return arnb.a;
            case 8:
                ((jfr) this.e).c();
                return arnb.a;
            case 9:
                jky jkyVar = (jky) this.e;
                qjh.l(jkyVar.c, null, new ikq(jkyVar, (arpe) null, 14), 3);
                return arnb.a;
            case 10:
                jky jkyVar2 = (jky) this.e;
                qjh.l(jkyVar2.c, null, new ikq(jkyVar2, (arpe) null, 15, (byte[]) null), 3);
                return arnb.a;
            case 11:
                jsa jsaVar = (jsa) this.e;
                alvi alviVar = jsa.a;
                jsaVar.c();
                return arnb.a;
            case 12:
                jsa jsaVar2 = (jsa) this.e;
                alvi alviVar2 = jsa.a;
                jsaVar2.b();
                return arnb.a;
            case 13:
                jsa jsaVar3 = (jsa) this.e;
                alvi alviVar3 = jsa.a;
                jsaVar3.h.isPresent();
                jsaVar3.b();
                return arnb.a;
            case 14:
                jsa jsaVar4 = (jsa) this.e;
                alvi alviVar4 = jsa.a;
                jsaVar4.b();
                return arnb.a;
            case 15:
                ((jsy) this.e).d();
                return arnb.a;
            case 16:
                jsy jsyVar = (jsy) this.e;
                qjh.l(jsyVar.b, null, new jsu(jsyVar, (arpe) null, 0), 3);
                return arnb.a;
            case 17:
                ((jvs) this.e).k.c.add("bottom_content_insets");
                return arnb.a;
            case 18:
                ((jvs) this.e).k.c.remove("bottom_content_insets");
                return arnb.a;
            case 19:
                jvs jvsVar = (jvs) this.e;
                alvw d = jvs.a.d();
                d.X(alwp.a, "BugleComposeRow2");
                ((alvg) d.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/voice/VoiceInputUiAdapter", "onSwipeToLockRecording", 179, "VoiceInputUiAdapter.kt")).q("Voice input swipe to lock recording");
                ((jvw) jvsVar.c.b()).j = 5;
                ((jvw) jvsVar.c.b()).g();
                return arnb.a;
            default:
                ((jvs) this.e).d();
                return arnb.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl(Object obj, int i, char[] cArr) {
        super(0, obj, gbl.class, "refresh", "refresh()V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl(Object obj, int i, int[] iArr) {
        super(0, obj, gbl.class, "invalidate", "invalidate()V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl(Object obj, int i, boolean[] zArr) {
        super(0, obj, ifs.class, "onListInteractive", "onListInteractive()V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl(Object obj, int i, float[] fArr) {
        super(0, obj, ipc.class, "getMaxInputHeight", "getMaxInputHeight()I", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl(Object obj, int i, byte[][] bArr) {
        super(0, obj, khb.class, "cancelSelection", "cancelSelection()V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl(Object obj, int i, char[][] cArr) {
        super(0, obj, jfr.class, "updateIsDuoKitSetupRequiredFlow", "updateIsDuoKitSetupRequiredFlow()V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl(Object obj, int i, short[][] sArr) {
        super(0, obj, jky.class, "changeDefaultSmsApp", "changeDefaultSmsApp()V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl(Object obj, int i, int[][] iArr) {
        super(0, obj, jky.class, "enterSelfNumber", "enterSelfNumber()V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl(Object obj, int i, boolean[][] zArr) {
        super(0, obj, jsa.class, "onSendDisabled", "onSendDisabled()V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl(Object obj, int i, float[][] fArr) {
        super(0, obj, jsa.class, "onScheduledSendDisabled", "onScheduledSendDisabled()V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl(Object obj, int i, byte[][][] bArr) {
        super(0, obj, jsa.class, "onScheduledSend", "onScheduledSend()V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl(Object obj, int i, short[][][] sArr) {
        super(0, obj, jsy.class, "show", "show()V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl(Object obj, int i, int[][][] iArr) {
        super(0, obj, jsy.class, "onDismiss", "onDismiss()V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl(Object obj, int i, boolean[][][] zArr) {
        super(0, obj, jvs.class, "onPrepareSwipeUpToLock", "onPrepareSwipeUpToLock()V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl(Object obj, int i, float[][][] fArr) {
        super(0, obj, jvs.class, "onDisposeSwipeUpToLock", "onDisposeSwipeUpToLock()V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl(Object obj, int i, byte[] bArr, byte[] bArr2) {
        super(0, obj, jvs.class, "onSwipeToLockRecording", "onSwipeToLockRecording()V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl(Object obj, int i, char[] cArr, byte[] bArr) {
        super(0, obj, jvs.class, "onPressReleased", "onPressReleased()V", 0);
        this.a = i;
    }
}
